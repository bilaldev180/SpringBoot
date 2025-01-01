package com.bilal.kyc.dto.kycLevel;

import lombok.Data;
import java.time.LocalDateTime;


@Data
public class KycResponse {

    private Integer id  ;
    private String kycLevelName;
    private Integer sequence;
    private LocalDateTime createdAt ;
}
