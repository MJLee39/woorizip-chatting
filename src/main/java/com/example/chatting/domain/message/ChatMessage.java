package com.example.chatting.domain.message;

import java.time.LocalDateTime;

import lombok.Setter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamoDBTable(tableName = "chatmessages")
public class ChatMessage {

    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute private String chatRoomId;
    @DynamoDBAttribute private String accountId;
    @DynamoDBAttribute private String nickname;
    @DynamoDBAttribute private String message;

    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdAt;

    public void initChatMessageId(String id) {
        this.id = id;
    }

    public void createdAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    static public class LocalDateTimeConverter implements DynamoDBTypeConverter<String, LocalDateTime> {

        @Override
        public String convert( final LocalDateTime time ) {

            return time.toString();
        }

        @Override
        public LocalDateTime unconvert( final String stringValue ) {

            return LocalDateTime.parse(stringValue);
        }
    }

}
