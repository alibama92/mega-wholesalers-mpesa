package com.otblabs.mpesa.stkpush;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.otblabs.mpesa.stkpush.models.LNMResult;
import com.otblabs.utils.Gen;
import com.otblabs.utils.HttpService;
import com.otblabs.utils.Urls;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.HashMap;

@Service
public class StkServiceImpl implements StkService{
    @Override
    public LNMResult performStkPush(String accessToken) {

        try {
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(getStkPostBody()))
                    .uri(URI.create(Urls.SANDBOX_URL))
                    .setHeader("authorization", "Bearer "+accessToken)
                    .setHeader("content-type", "application/json")
                    .build();
            HttpService.sendGetRequest(LNMResult.class,httpClient, request);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


    //gives sample test data for calling the REST endpoint
    private String getStkPostBody() throws JsonProcessingException {
        var values = new HashMap<String, String>() {{
            put("BusinessShortCode", "174379");
            put ("Password", Gen.generatePassword("174379","bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919"));
            put("Timestamp", Gen.generateTimestamp());
            put("TransactionType", "CustomerPayBillOnline");
            put("Amount", "1");
            put("PartyA", Gen.formatPhoneNumber("0718728894"));
            put("PartyB", "174379");
            put("PhoneNumber", Gen.formatPhoneNumber("0718728894"));
            put("CallBackURL", "https://kapul-rides-api.herokuapp.com/payments/mpesa/callback-url");
            put("AccountReference", "Account refference");
            put("TransactionDesc", "Transaction Description");

        }};

        var objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(values);
    }
}
