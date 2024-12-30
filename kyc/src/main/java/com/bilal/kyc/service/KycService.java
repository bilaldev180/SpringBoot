package com.bilal.kyc.service;
import com.bilal.kyc.dto.KycLevelUpdateReqDto;
import com.bilal.kyc.dto.KycResponse;
import com.bilal.kyc.dto.requests.kyc_level.KycLevelMapper;
import com.bilal.kyc.dto.requests.kyc_level.KycRequest;
import com.bilal.kyc.enums.KycLevelName;
import com.bilal.kyc.model.KycLevel;
import com.bilal.kyc.repo.KycRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class KycService {

    private final KycRepo kycRepo;
    private final KycLevelMapper kycLevelMapper;

    public KycService(KycRepo kycRepo, KycLevelMapper kycLevelMapper){
        this.kycRepo=kycRepo;
        this.kycLevelMapper = kycLevelMapper;
    }


    public KycResponse createKycLevel(KycRequest kycRequest) {
        KycLevel kycLevel = new KycLevel();
        kycLevel.setKycLevelName(kycRequest.getKycLevelName());
        kycLevel.setSequence(Integer.valueOf(kycRequest.getSequence()));
        KycLevel saveKycLevel = kycRepo.save(kycLevel);
        return kycLevelMapper.mapToResponse(saveKycLevel);
    }

    public List<KycResponse> getAllKycLevel(){
        return kycRepo.findAll()
                .stream()
                .map(kycLevelMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public KycResponse getKycLevelById(int id) {
             KycLevel findById =  kycRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("ID not found" + id));
        return kycLevelMapper.mapToResponse(findById);
    }


    public void deleteKycLevel(Integer id) {
        kycRepo.deleteById(id);
    }

    public KycLevel updateKycLevel(KycLevelUpdateReqDto kycLevelUpdateReqDto) {

        KycLevelName kycLevelName = kycLevelUpdateReqDto.getKycLevelName();
        Integer kycLevelId = kycLevelUpdateReqDto.getId();
        Integer sequence = kycLevelUpdateReqDto.getSequence();
        LocalDateTime createAt = kycLevelUpdateReqDto.getCreatedAt();



        KycLevel existingKycLevel = kycRepo.findById(kycLevelId).orElseThrow(()->new EntityNotFoundException("Not found."));

        existingKycLevel.setKycLevelName(kycLevelName);
        existingKycLevel.setSequence(sequence);
        kycRepo.save(existingKycLevel);
        return existingKycLevel;

    }

}
