package com.otblabs.mpesa.stkpush;

import com.otblabs.mpesa.stkpush.models.LNMResult;

public interface StkService {
    LNMResult performStkPush(String accessToken);
}
