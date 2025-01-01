package com.bilal.kyc.dto.requirements;

import lombok.Data;

@Data
public class RequirementsRequestDto {

    private Integer id;
    private Integer kycLevelID;
    private Integer Sequence;
    private String fieldName;
    //    private kycFieldType fieldType;
    private Integer validityPeriod;
}
