package com.example.chatting.api.controller;

import com.example.chatting.api.dto.SseEmitters;
import com.example.chatting.domain.message.ChatMessage;
import com.example.chatting.domain.message.ChatMessageRepository;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
public class ChatMessageController {

    private final SseEmitters sseEmitters;
    private final ChatMessageRepository chatMessageRepository;

    @MessageMapping("/{chatRoomId}")
    @SendTo(value = "/exchange/{chatRoomId}")
//    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public ChatMessage receiveMessage(ChatMessage message, @DestinationVariable String chatRoomId) {
        log.info(message.toString());
        message.initChatMessageId(UUID.randomUUID().toString());
        message.createdAt(LocalDateTime.now());
        sseEmitters.receiveMessage(message.getChatRoomId(), message);
        return chatMessageRepository.save(message);
    }

}
