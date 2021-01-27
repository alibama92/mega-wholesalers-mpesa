package com.otblabs.mpesa.utils;

import com.otblabs.mpesa.security.AccessTokenService;

public class Utility {

    private static String CONSUMER_kEY = "4BMXY3dMmUcYH8EVsHNi7LmMMRW2Qb0l";
    private static String CONSUMER_SECRET = "iGylY5r8YMwVgLYX";

    private  static AccessTokenService accessTokenService;

    public Utility(AccessTokenService accessTokenService) {
        this.accessTokenService = accessTokenService;
    }

    public static String getAccessToken(){
        return accessTokenService.getAccessToken(CONSUMER_kEY,CONSUMER_SECRET).getAccess_token();
    }
}
