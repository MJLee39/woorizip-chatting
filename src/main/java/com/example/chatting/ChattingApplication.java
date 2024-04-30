package com.example.chatting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.vault.core.VaultKeyValueOperationsSupport;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ChattingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChattingApplication.class, args);
    }

}
