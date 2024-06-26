package com.example.chatting.api.service;

import com.example.chatting.api.dto.ReportDTO;
import com.example.chatting.domain.report.ReportRepository;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReportService {

    private final ReportRepository reportRepository;
    private final ChatRoomExternalService externalService;

    public void addReport(String senderId, String targetId) {
        reportRepository.saveReport(senderId, targetId);
        reportRepository.saveReportNickname(
                externalService.getAccountNicknameById(senderId),
                externalService.getAccountNicknameById(targetId)
        );
    }

    public List<ReportDTO.GetAllReportResponseDTO> getAllReportByAccountId(List<String> accountIdList) {
        List<ReportDTO.GetAllReportResponseDTO> response = new ArrayList<>();
        for (String accountId : accountIdList) {
            response.add(new ReportDTO.GetAllReportResponseDTO(accountId, reportRepository.checkReportSize(accountId)));
        }

        return response;
    }

    public Long checkReportSize(String targetId) {
        return reportRepository.checkReportSize(targetId);
    }

    public void unlockReport(String targetId) {
        reportRepository.unlockReport(targetId);
    }

    public Set<String> readReportedNicknameBy(String accountId) {
        Set<String> nicknameSet = reportRepository.getMyReportList(externalService.getAccountNicknameById(accountId));
        nicknameSet.forEach(System.out::println);
        return nicknameSet;
    }

}
