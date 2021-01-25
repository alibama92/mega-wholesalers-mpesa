package com.otblabs.mpesa.security;

public interface AccessTokenService {
   AccessTokenResponse getAccessToken(String mpesaConsumerKey, String mpesaConsumerSecret);
}
