package com.otblabs.mpesa.c2b;

import com.otblabs.mpesa.c2b.models.C2bConfirmationResponse;
import com.otblabs.mpesa.c2b.models.C2bValidationResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c2b-response/")
public class C2bResource {

    private final C2bService c2bService;

    public C2bResource(C2bService c2bService) {
        this.c2bService = c2bService;
    }


    @PostMapping("confirmation-url")
    void confirmTransaction(@RequestBody C2bConfirmationResponse confirmationResponse){
        c2bService.getConFirmationData(confirmationResponse);
    }

    @PostMapping("validation-url")
    void validateTransaction(@RequestBody C2bValidationResponse c2bValidationResponse){
        c2bService.getValidationData(c2bValidationResponse);
    }


}
