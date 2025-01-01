package com.bilal.kyc.dto.requirements;

import com.bilal.kyc.model.requirements.Requirements;
import org.springframework.stereotype.Component;

@Component
public class RequirementMapper {
    public RequirementsResponseDto mapToResponse (Requirements requirements){
        RequirementsResponseDto responseDto = new RequirementsResponseDto();
        responseDto.setId(requirements.getId());
        responseDto.setKycLevelID(requirements.getKycLevelID());
        responseDto.setSequence(requirements.getSequence());
        responseDto.setFieldName(requirements.getFieldName());
        responseDto.setValidityPeriod(requirements.getValidityPeriod());
        return responseDto;
    }
}
