package com.otblabs.mpesa.stkpush;

import com.otblabs.mpesa.security.AccessTokenResponse;
import com.otblabs.mpesa.security.AccessTokenService;
import com.otblabs.mpesa.security.AccessTokenServiceImpl;
import com.otblabs.mpesa.stkpush.models.LNMResult;
import com.otblabs.mpesa.utils.Utility;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mpesastk")
public class StkPushResource {

    private final  StkService stkService;

    public StkPushResource(StkService stkService) {
        this.stkService = stkService;
    }

    @PostMapping
    public LNMResult perfomStkPush() {
        //getting access token
        return  stkService.performStkPush(Utility.getAccessToken());
    }


}
