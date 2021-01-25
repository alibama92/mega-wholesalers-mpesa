package com.otblabs.mpesa.stkpush;

import com.otblabs.mpesa.security.AccessTokenResponse;
import com.otblabs.mpesa.security.AccessTokenService;
import com.otblabs.mpesa.security.AccessTokenServiceImpl;
import com.otblabs.mpesa.stkpush.models.LNMResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mpesastk")
public class StkPushResource {

    private final  StkService stkService;
    private final AccessTokenService accessTokenService;

    public StkPushResource(StkService stkService, AccessTokenService accessTokenService) {
        this.stkService = stkService;
        this.accessTokenService = accessTokenService;
    }

    @PostMapping
    public LNMResult perfomStkPush() {

        //getting access token
        AccessTokenResponse accessTokenResponse = accessTokenService.getAccessToken("4BMXY3dMmUcYH8EVsHNi7LmMMRW2Qb0l", "iGylY5r8YMwVgLYX");
        return  stkService.performStkPush(accessTokenResponse.getAccess_token());
    }


}
