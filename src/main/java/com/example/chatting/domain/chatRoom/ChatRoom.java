package com.example.chatting.domain.chatRoom;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ChatRoom {

	@Id
	private String id;

	private String clientId;
	private String agentId;

	@CreatedDate
	private LocalDateTime createdAt;

	@Builder
	public ChatRoom(String id, String clientId, String agentId) {
		this.id = id;
		this.clientId = clientId;
		this.agentId = agentId;
	}

}
