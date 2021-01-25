package com.otblabs;

import com.otblabs.mpesa.security.AccessTokenServiceImpl;

public class Test {

    public static void main(String[] args){

        //getting access token
        AccessTokenServiceImpl accessTokenService = new AccessTokenServiceImpl();
        System.out.println(accessTokenService.getAccessToken("4BMXY3dMmUcYH8EVsHNi7LmMMRW2Qb0l", "iGylY5r8YMwVgLYX"));
    }
}
