package com.otblabs.mpesa.transactionstatus;

import com.otblabs.mpesa.transactionstatus.models.TransactionStatusCallbackResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction-status-result-url")
public class TransctionStatusResultUrl {

    public void getTransactionStatusResult(@RequestBody TransactionStatusCallbackResponse transactionStatusCallbackResponse){
        System.out.println(transactionStatusCallbackResponse);
    }
}
