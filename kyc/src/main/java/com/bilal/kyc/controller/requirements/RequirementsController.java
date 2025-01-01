package com.bilal.kyc.controller.requirements;

import com.bilal.kyc.dto.requirements.RequirementsRequestDto;
import com.bilal.kyc.dto.requirements.RequirementsResponseDto;
import com.bilal.kyc.service.requirements.RequirementsService;
import com.bilal.kyc.model.requirements.Requirements;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/kyc/kyc-req")
@AllArgsConstructor
public class RequirementsController {

    private final RequirementsService requirementsService;

    @PostMapping ("/create")
    public Requirements create (@RequestBody Requirements requirements){
        return requirementsService.create(requirements);
    }

    @GetMapping ("")
    public List<RequirementsResponseDto> getAll(){
        return requirementsService.getAll();
    }

    @PutMapping ("/update")
    public Requirements update(@RequestBody RequirementsRequestDto requirementsRequestDto){
        return requirementsService.update(requirementsRequestDto);
    }

    @DeleteMapping ("/delete/{id}")
    public String delete(@PathVariable Integer id){
        requirementsService.delete(id);
        return "Requirement Deleted Successfully";
    }

    @GetMapping ("/{id}")
    public RequirementsResponseDto findById(@PathVariable Integer id){
        return requirementsService.findById(id);
    }
}
