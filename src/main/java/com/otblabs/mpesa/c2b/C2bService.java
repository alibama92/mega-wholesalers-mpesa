package com.otblabs.mpesa.c2b;

import com.otblabs.mpesa.c2b.models.C2bConfirmationResponse;
import com.otblabs.mpesa.c2b.models.C2bValidationResponse;
import com.otblabs.mpesa.c2b.models.RegisterUrlResponse;

public interface C2bService {
    RegisterUrlResponse registerUrl(String accessToken);
    void getConFirmationData(C2bConfirmationResponse c2bConfirmationResponse);
    void getValidationData(C2bValidationResponse c2bValidationResponse);
}
