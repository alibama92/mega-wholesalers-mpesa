package com.otblabs.mpesa.transactionstatus;

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
