package com.example.chatting.domain.message;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface ChatMessageRepository extends CrudRepository<ChatMessage, String> {

	List<ChatMessage> findAllByChatRoomId(String chatRoomId);

}
