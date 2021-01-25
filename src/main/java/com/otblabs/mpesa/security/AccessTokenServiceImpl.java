package com.otblabs.mpesa.security;

import com.otblabs.utils.HttpService;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Base64;

@Service
public class AccessTokenServiceImpl implements AccessTokenService{

    @Override
    public AccessTokenResponse getAccessToken(String mpesaConsumerKey, String mpesaConsumerSecret) {

        // Use java 8 implementation of base64 to encode the consumer key and consumer secret.
        String app_key = mpesaConsumerKey;
        String app_secret = mpesaConsumerSecret;
        String appKeySecret = app_key + ":" + app_secret;
        byte[] bytes;
        try {
            bytes = appKeySecret.getBytes("ISO-8859-1");
            String auth = Base64.getEncoder().encodeToString(bytes);

            String url = "https://sandbox.safaricom.co.ke/oauth/v1/generate?grant_type=client_credentials";
            //java 11 http client
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .setHeader("authorization", "Basic " + auth)
                    .setHeader("cache-control", "no-cache")
                    .build();

            AccessTokenResponse accessTokenResponse = HttpService.sendGetRequest(AccessTokenResponse.class, client, request);
            return accessTokenResponse;

        } catch (IOException e) {
            e.printStackTrace();

            //possible error in base64 string generation
        } catch ( InterruptedException e) {
            //possible error while calling safaricom end
            System.err.println("Failed to send GET request: " + e.getMessage());
            e.printStackTrace();
        }


        //null due any of above exceptions
        return null;
    }
}



