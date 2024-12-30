package com.bilal.kyc.dto.requests.kyc_level;

import com.bilal.kyc.dto.KycResponse;
import com.bilal.kyc.model.KycLevel;
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
