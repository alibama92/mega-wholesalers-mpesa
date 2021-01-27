package com.otblabs.mpesa.transactionstatus.models;

import com.otblabs.mpesa.transactionstatus.models.Result;

public class TransactionStatusCallbackResponse {
    private Result result;

    public TransactionStatusCallbackResponse() {
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TransactionStatusCallbackResponse{" +
                "result=" + result +
                '}';
    }
}
