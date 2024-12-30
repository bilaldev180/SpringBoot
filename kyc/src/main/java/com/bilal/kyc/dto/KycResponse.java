package com.bilal.kyc.dto;

import com.bilal.kyc.enums.KycLevelName;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


@Data
public class KycResponse {

    private Integer id  ;
    private String kycLevelName;
    private Integer sequence;
    private LocalDateTime createdAt ;
}

