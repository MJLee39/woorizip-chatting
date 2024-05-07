package com.example.chatting.api.service;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class ChatRoomExternalService {

    private final RestTemplate restTemplate;

    public String getAccountNicknameById(String accountId) {
        String url = "https://api.teamwaf.app/v1/account/" + accountId;

        ResponseEntity<AccountResponse> response = restTemplate.getForEntity(url, AccountResponse.class);
        if (response.getStatusCode().equals(HttpStatus.OK)) {
            return response.getBody().getNickname();
        } else {
            throw new IllegalArgumentException("잘못된 유저 정보입니다.");
        }
    }

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    private static class AccountResponse {

        private String Id;
        private String Provider;
        private String ProviderUserId;
        private String Nickname;
        private String Role;
        private String LicenseId;
        private String ProfileImageId;
        private String PremiumDate;
        private String Phone;

        @Builder
        public AccountResponse(String id, String provider, String providerUserId, String nickname, String role, String licenseId, String profileImageId, String premiumDate, String phone) {
            Id = id;
            Provider = provider;
            ProviderUserId = providerUserId;
            Nickname = nickname;
            Role = role;
            LicenseId = licenseId;
            ProfileImageId = profileImageId;
            PremiumDate = premiumDate;
            Phone = phone;
        }

    }

}
