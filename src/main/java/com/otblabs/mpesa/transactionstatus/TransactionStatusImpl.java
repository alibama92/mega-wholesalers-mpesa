package com.otblabs.mpesa.transactionstatus;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.otblabs.mpesa.stkpush.models.LNMResult;
import com.otblabs.mpesa.utils.Gen;
import com.otblabs.mpesa.utils.HttpService;
import com.otblabs.mpesa.utils.Urls;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.HashMap;

@Service
public class TransactionStatusImpl implements TransactionStatusService{

    @Override
    public void checkTransactionStatus(String accessToken) {
        try {
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(getTransactionStatusPostBody()))
                    .uri(URI.create(Urls.SANDBOX_URL))
                    .setHeader("authorization", "Bearer "+accessToken)
                    .setHeader("content-type", "application/json")
                    .build();
              HttpService.sendSingleResponseRequest(null,httpClient, request);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    //gives sample test data for calling the REST endpoint
    private String getTransactionStatusPostBody() throws JsonProcessingException {
        var values = new HashMap<String, String>() {{
            put("Initiator", "");
            put ("SecurityCredential", "");
            put("CommandID", "");
            put("TransactionID", "TransactionStatusQuery");
            put("PartyA", "");
            put("IdentifierType", "");
            put("ResultURL", "");
            put("QueueTimeOutURL", "");
            put("Remarks", "Check transaction status");
            put("Occasion", "Account refference");

        }};

        var objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(values);
    }
}
