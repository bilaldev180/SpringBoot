package com.bilal.kyc.model;

import com.bilal.kyc.enums.KycLevelName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name="kyc_level")
@Table(name="kyc_level")
@Data
public class KycLevel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id  ;
    @Column (name = "kyc_level_name")
    @Enumerated(EnumType.STRING)
    private KycLevelName kycLevelName;

    @Column (name = "Sequence")
    private Integer sequence;

    @CreationTimestamp
    @Column (name = "Created_At", nullable = false, updatable = false)
    private LocalDateTime createdAt ;
//
//    public void setKycLevelName(String kycLevelName) {
//        this.kycLevelName = kycLevelName;
//    }
//
//    public void setSequence(Integer sequence) {
//        this.sequence = sequence;
//    }
//
//    public String getKycLevelName() {
//        return kycLevelName;
//    }
//
//    public Integer getSequence() {
//        return sequence;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
}
