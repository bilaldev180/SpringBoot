package com.bilal.kyc.repo;

import com.bilal.kyc.model.KycLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KycRepo extends JpaRepository<KycLevel,Integer>  {
}
