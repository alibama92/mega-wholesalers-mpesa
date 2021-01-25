package com.otblabs.mpesa.security;

public interface AccessTokenService {
   DarajaResponse  getAccessToken(String mpesaConsumerKey, String mpesaConsumerSecret);
}
