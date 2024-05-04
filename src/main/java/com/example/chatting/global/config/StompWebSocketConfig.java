package com.example.chatting.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import net.devh.boot.grpc.client.inject.GrpcClient;

import com.example.grpc.auth.AuthCheckReq;
import com.example.grpc.auth.AuthServiceGrpc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableWebSocketMessageBroker
@Configuration
public class StompWebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Value("${spring.rabbitmq.host}")
    private String rabbitMQHost;

    @Value("${rabbitmq.stomp-port}")
    private int rabbitMQStompPort;

    @Value("${spring.rabbitmq.username}")
    private String rabbitMQUsername;

    @Value("${spring.rabbitmq.password}")
    private String rabbitMQPassword;

    @Value("${rabbitmq.endpoint}")
    private String rabbitMQEndPoint;

    @Value("${rabbitmq.exchange.name}")
    private String rabbitMQExchangeName;

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry
            .addEndpoint(rabbitMQEndPoint)
            .setAllowedOriginPatterns("*")
            .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableStompBrokerRelay(rabbitMQExchangeName)
                .setRelayHost(rabbitMQHost)
                .setRelayPort(rabbitMQStompPort)
                .setClientLogin(rabbitMQUsername)
                .setClientPasscode(rabbitMQPassword);

        config.setPathMatcher(new AntPathMatcher("."));
        config.setApplicationDestinationPrefixes("/pub");
    }

//    @Override
//    public void configureClientInboundChannel(ChannelRegistration registration) {
//        registration.interceptors(new ChannelInterceptor() {
//
//            @Override
//            public Message<?> preSend(Message<?> message, MessageChannel channel) {
//                StompHeaderAccessor accessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
//				String token = accessor.getFirstNativeHeader("Authorization");
//                log.info("Authorization Token : {}", token);
//
//                if (StompCommand.CONNECT.equals(accessor.getCommand())) {
//                    boolean isValidate = authServiceBlockingStub.authCheck(
//                        AuthCheckReq.newBuilder().setToken(token).build()
//                    ).getValid();
//
//                    if (isValidate) {
//                        return ChannelInterceptor.super.preSend(message, channel);
//                    } else {
//                        throw new IllegalArgumentException("토큰 틀림");
//                    }
//                }
//
//                return ChannelInterceptor.super.preSend(message, channel);
//            }
//        });
//    }
}
