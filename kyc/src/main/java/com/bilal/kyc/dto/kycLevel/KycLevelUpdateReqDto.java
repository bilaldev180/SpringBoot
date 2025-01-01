package com.bilal.kyc.dto.kycLevel;

import com.bilal.kyc.enums.KycLevelName;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class KycLevelUpdateReqDto {
    private Integer id  ;
    @Enumerated
    private KycLevelName kycLevelName;
    private Integer sequence;
    private LocalDateTime createdAt;

}
