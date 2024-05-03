package com.example.chatting.api.service;

import org.springframework.stereotype.Service;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ChatRoomGrpcService {

	@GrpcClient(value = "account-server")
	private com.example.grpc.account.AccountServiceGrpc.AccountServiceBlockingStub accountServiceBlockingStub;

	public String getNicknameFromAccountServer(String accountId) {
		return accountServiceBlockingStub.getAccount(
			com.example.grpc.account.GetAccountReq.newBuilder().setAccountId(accountId).build()
		).getAccount().getNickname();
	}

}
