package com.otblabs.mpesa.transactionstatus;

import com.otblabs.mpesa.utils.Utility;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactionstatus")
public class TransactionStatusResource {

    private final TransactionStatusService transactionStatusService;

    public TransactionStatusResource(TransactionStatusService transactionStatusService) {
        this.transactionStatusService = transactionStatusService;
    }

    @PostMapping
    public  void queryTransactionStatus(){
        transactionStatusService.checkTransactionStatus(Utility.getAccessToken());
    }
}
