package com.bilal.kyc.model.requirements;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name= "kyc_Requirements")
@Data
public class Requirements {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name= "kyc_level_id")
    private Integer kycLevelID;
    @Column (name="sequence")
    private Integer Sequence;
    @Column (name="field_name")
    private String fieldName;
//    private kycFieldType fieldType;
    @Column (name= "validity_period")
    private Integer validityPeriod;
}
