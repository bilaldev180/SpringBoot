package com.bilal.kyc.controller;

import com.bilal.kyc.dto.KycLevelUpdateReqDto;
import com.bilal.kyc.dto.KycResponse;
import com.bilal.kyc.dto.requests.kyc_level.KycRequest;
import com.bilal.kyc.model.KycLevel;
import com.bilal.kyc.service.KycService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping ("/kyc/kyc-level")
public class KycLevelController {

    private final KycService kycService;

    public KycLevelController(KycService kycService) {
        this.kycService = kycService;
    }

    @PostMapping ("/add")
    public KycResponse createKycLevel (@RequestBody KycRequest kycRequest){
        return kycService.createKycLevel(kycRequest);
    }

    @GetMapping ("")
    public List<KycResponse> getAllKycLevels(){
        return kycService.getAllKycLevel();
    }

    @GetMapping ("/{id}")
    public KycResponse getKycLevelById (@PathVariable Integer id){
        return kycService.getKycLevelById(id);
    }

    @PutMapping ("/update")
    public KycLevel updateKycLevel(@RequestBody KycLevelUpdateReqDto kycLevelUpdateReqDto ){
        return kycService.updateKycLevel(kycLevelUpdateReqDto );
    }

    @DeleteMapping ("/delete/{id}")
    public String deleteKycLevelById (@PathVariable int id ){
         kycService.deleteKycLevel(id);
        return "kyc level deleted Successfully";
    }
}
