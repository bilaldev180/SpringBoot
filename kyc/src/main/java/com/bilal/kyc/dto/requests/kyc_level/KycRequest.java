package com.bilal.kyc.dto.requests.kyc_level;

import com.bilal.kyc.enums.KycLevelName;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class KycRequest {
    @Enumerated
    private KycLevelName KycLevelName;
    private String Sequence;
}
