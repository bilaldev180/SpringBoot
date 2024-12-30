package com.bilal.kyc.dto;

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

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public KycLevelName getKycLevelName() {
//        return kycLevelName;
//    }
//
//    public void setKycLevelName(KycLevelName kycLevelName) {
//        this.kycLevelName = kycLevelName;
//    }
//
//    public Integer getSequence() {
//        return sequence;
//    }
//
//    public void setSequence(Integer sequence) {
//        this.sequence = sequence;
//    }
}
