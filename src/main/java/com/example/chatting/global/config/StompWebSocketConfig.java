package com.example.chatting.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableWebSocketMessageBroker
@Configuration
public class StompWebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Value("${spring.rabbitmq.host}")
    private String RABBITMQ_HOST;

    @Value("${rabbitmq.stomp-port}")
    private int RABBITMQ_STOMP_PORT;

    @Value("${spring.rabbitmq.username}")
    private String RABBITMQ_USERNAME;

    @Value("${spring.rabbitmq.password}")
    private String RABBITMQ_PASSWORD;

    @Value("${rabbitmq.endpoint}")
    private String RABBITMQ_ENDPOINT;

    @Value("${rabbitmq.destination-prefix}")
    private String RABBITMQ_DESTINATION_PREFIX;

    @Value("${rabbitmq.virtual-host}")
    private String RABBITMQ_VIRTUAL_HOST;

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry
            .addEndpoint(RABBITMQ_ENDPOINT)
            .setAllowedOriginPatterns("*")
            .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
//        config.enableStompBrokerRelay(RABBITMQ_DESTINATION_PREFIX)
//                .setRelayHost(RABBITMQ_HOST)
//                .setVirtualHost(RABBITMQ_VIRTUAL_HOST)
//                .setRelayPort(RABBITMQ_STOMP_PORT)
//                .setClientLogin(RABBITMQ_USERNAME)
//                .setClientPasscode(RABBITMQ_PASSWORD);
        config.enableSimpleBroker(RABBITMQ_DESTINATION_PREFIX);
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
