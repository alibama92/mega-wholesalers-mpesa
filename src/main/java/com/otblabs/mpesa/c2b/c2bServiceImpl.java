package com.otblabs.mpesa.c2b;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.otblabs.mpesa.c2b.models.C2bConfirmationResponse;
import com.otblabs.mpesa.c2b.models.C2bValidationResponse;
import com.otblabs.mpesa.c2b.models.RegisterUrlResponse;
import com.otblabs.mpesa.stkpush.models.LNMResult;
import com.otblabs.mpesa.utils.Gen;
import com.otblabs.mpesa.utils.HttpService;
import com.otblabs.mpesa.utils.Urls;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.HashMap;

public class c2bServiceImpl implements  C2bService{
    @Override
    public RegisterUrlResponse registerUrl(String accessToken) {

        try {
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(getRegisterUrlPostBody()))
                    .uri(URI.create(Urls.SANDBOX_URL))
                    .setHeader("authorization", "Bearer "+accessToken)
                    .setHeader("content-type", "application/json")
                    .build();
            return   HttpService.sendSingleResponseRequest(RegisterUrlResponse.class,httpClient, request);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void getConFirmationData(C2bConfirmationResponse c2bConfirmationResponse) {
        System.out.println("Confirmation Data" + c2bConfirmationResponse.toString());
    }

    @Override
    public void getValidationData(C2bValidationResponse c2bValidationResponse) {
        System.out.println("Validation Data "+c2bValidationResponse.toString());
    }

    private String getRegisterUrlPostBody() throws JsonProcessingException {
        var values = new HashMap<String, String>() {{
            put("ValidationURL", "validation url");
            put ("ConfirmationURL","confirmation url");
            put("ResponseType", "application/json");
            put("ShortCode", "174379");
        }};

        var objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(values);
    }
}
