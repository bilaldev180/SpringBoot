package com.bilal.kyc.repo.requirements;

import com.bilal.kyc.model.requirements.Requirements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequirementsRepo extends JpaRepository<Requirements,Integer> {
}
