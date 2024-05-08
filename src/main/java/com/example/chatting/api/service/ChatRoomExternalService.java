package com.example.chatting.api.service;

import java.util.Objects;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Service
public class ChatRoomExternalService {

    public String getAccountNicknameById(String accountId) {
        String url = "https://api.teamwaf.app/v1/account/" + accountId;
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<AccountResponse> response = restTemplate.getForEntity(url, AccountResponse.class);
        if (response.getStatusCode().equals(HttpStatus.OK)) {
            return Objects.requireNonNull(response.getBody()).getAccount().getNickname();
        } else {
            throw new IllegalArgumentException("잘못된 유저 정보입니다.");
        }
    }

    @ToString
    @NoArgsConstructor
    @Getter
    private static class AccountResponse {

        private Account Account;

        @JsonCreator
        public AccountResponse(@JsonProperty("Account") Account Account) {
            this.Account = Account;
        }

    }

    @ToString
    @NoArgsConstructor
    @Getter
    private static class Account {

        @JsonProperty("Id")
        @JsonAlias("id")
        private String Id;

        @JsonProperty("Provider")
        private String Provider;

        @JsonProperty("ProviderUserId")
        private String ProviderUserId;

        @JsonProperty("Nickname")
        private String Nickname;

        @JsonProperty("Role")
        private String Role;

        @JsonProperty("LicenseId")
        private String LicenseId;

        @JsonProperty("ProfileImageId")
        private String ProfileImageId;

        @JsonProperty("PremiumDate")
        private String PremiumDate;

        @JsonProperty("Phone")
        private String Phone;

        @Builder
        public Account(String Id, String Provider, String ProviderUserId, String Nickname, String Role,
                       String LicenseId, String ProfileImageId, String PremiumDate, String Phone) {
            this.Id = Id;
            this.Provider = Provider;
            this.ProviderUserId = ProviderUserId;
            this.Nickname = Nickname;
            this.Role = Role;
            this.LicenseId = LicenseId;
            this.ProfileImageId = ProfileImageId;
            this.PremiumDate = PremiumDate;
            this.Phone = Phone;
        }
    }

}

