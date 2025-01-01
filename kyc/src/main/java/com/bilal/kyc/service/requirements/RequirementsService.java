package com.bilal.kyc.service.requirements;

import com.bilal.kyc.dto.requirements.RequirementMapper;
import com.bilal.kyc.dto.requirements.RequirementsRequestDto;
import com.bilal.kyc.dto.requirements.RequirementsResponseDto;
import com.bilal.kyc.repo.requirements.RequirementsRepo;
import com.bilal.kyc.model.requirements.Requirements;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RequirementsService {

    private final RequirementsRepo requirementsRepo;
    private final RequirementMapper requirementMapper;

    public Requirements create(Requirements requirements) {
        return requirementsRepo.save(requirements);
    }

    public List<RequirementsResponseDto> getAll() {
        return requirementsRepo.findAll()
                .stream()
                .map(requirementMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public Requirements update(RequirementsRequestDto requirementsRequestDto) {
        Integer reqID = requirementsRequestDto.getKycLevelID();
        Integer sequence = requirementsRequestDto.getSequence();
        String fieldName = requirementsRequestDto.getFieldName();
        Integer validityPeriod = requirementsRequestDto.getValidityPeriod();

        Requirements existingRequirement = requirementsRepo.findById(reqID).orElseThrow(() -> new EntityNotFoundException("Not Found"));
        existingRequirement.setSequence(sequence);
        existingRequirement.setFieldName(fieldName);
        existingRequirement.setValidityPeriod(validityPeriod);

        return existingRequirement;
    }

    public void delete(Integer id) {
        requirementsRepo.deleteById(id);
    }

    public RequirementsResponseDto findById(Integer id) {
        Requirements find = requirementsRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("not found"));
        return requirementMapper.mapToResponse(find);
    }
}
