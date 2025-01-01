package com.bilal.kyc.dto.kycLevel;

import com.bilal.kyc.model.kyc_level.KycLevel;
import org.springframework.stereotype.Component;

@Component
public class KycLevelMapper {
    public KycResponse mapToResponse(KycLevel kycLevel){
        KycResponse response = new KycResponse();
        response.setId(kycLevel.getId());
        response.setKycLevelName(kycLevel.getKycLevelName().toString());
        response.setSequence(kycLevel.getSequence());
        response.setCreatedAt(kycLevel.getCreatedAt());
        return response;
    }
}
