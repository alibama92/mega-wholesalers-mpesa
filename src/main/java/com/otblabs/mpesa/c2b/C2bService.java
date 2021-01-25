package com.otblabs.mpesa.c2b;

import com.otblabs.mpesa.c2b.models.RegisterUrlResponse;

public interface C2bService {
    RegisterUrlResponse registerUrl(String accessToken);
}
