package com.example.chatting.domain.report;

import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ReportRepository {

    private final RedisTemplate<String, String> redisTemplateForReport;
    private final RedisTemplate<String, String> redisTemplateForReporter;

    public void saveReport(String senderId, String targetId) {
        redisTemplateForReport.opsForSet().add(targetId, senderId);
    }

    public void saveReportNickname(String senderNickname, String targetNickname) {
        redisTemplateForReporter.opsForSet().add(senderNickname, targetNickname);
    }

    public Long checkReportSize(String targetId) {
        return redisTemplateForReport.opsForSet().size(targetId);
    }

    public void unlockReport(String targetId) {
        redisTemplateForReport.opsForSet().getOperations().delete(targetId);
    }

    public Set<String> getMyReportList(String nickname) {
        return redisTemplateForReporter.opsForSet().getOperations().opsForSet().members(nickname);
    }

}
