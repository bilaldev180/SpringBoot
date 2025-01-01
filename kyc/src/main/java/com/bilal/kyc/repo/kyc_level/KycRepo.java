package com.bilal.kyc.repo.kyc_level;

import com.bilal.kyc.model.kyc_level.KycLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KycRepo extends JpaRepository<KycLevel,Integer>  {
}
