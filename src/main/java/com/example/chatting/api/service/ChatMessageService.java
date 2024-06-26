package com.example.chatting.api.service;

import com.example.chatting.api.dto.SseEmitters;
import com.example.chatting.domain.message.ChatMessage;
import com.example.chatting.domain.message.ChatMessageRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatMessageService {

    private final SseEmitters sseEmitters;
    private final RabbitTemplate rabbitTemplate;
    private final ChatMessageRepository chatMessageRepository;

    @Value("${rabbitmq.exchange.name}")
    private String EXCHANGE_NAME;

    public void sendMessage(ChatMessage message) {
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "room." + message.getChatRoomId(), message);
    }

    public List<ChatMessage> findAllChatMessageBy(String chatRoomId) {
        return chatMessageRepository.findAllByChatRoomId(chatRoomId);
    }

    public String findLatestMessageInChatRoom(String chatRoomId) {
        List<ChatMessage> chatMessages = new ArrayList<>(chatMessageRepository.findAllByChatRoomId(chatRoomId));
        chatMessages.sort((chatMessage01, chatMessage02) -> chatMessage02.getCreatedAt().compareTo(chatMessage01.getCreatedAt()));
        return chatMessages.get(0).getMessage();
    }

}
