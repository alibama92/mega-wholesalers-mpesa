package com.otblabs.mpesa.stkpush.db;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="STK")
public class StkResponseData {

    @Column(name = "MerchantRequestID")
    private String merchantRequestId;
    @Column(name = "CheckoutRequestID")
    private String checkoutRequestId;
    @Column(name = "ResultCode")
    private String resultCode;
    @Column(name="ResultDec")
    private String resultDescription;
    @Column(name= "Amount")
    private String amount;
    @Column(name="MpesaReceiptNumber")
    private String mpesaReceiptNumber;
    @Column(name="Balance")
    private String balance;
    @Column(name="TransactionDate")
    private String transactionDate;
    @Column(name="PhoneNumber")
    private String phoneNumber;

    @Column(name="Posted")
    private String posted;

    public StkResponseData() {
    }

    public String getMerchantRequestId() {
        return merchantRequestId;
    }

    public void setMerchantRequestId(String merchantRequestId) {
        this.merchantRequestId = merchantRequestId;
    }

    public String getCheckoutRequestId() {
        return checkoutRequestId;
    }

    public void setCheckoutRequestId(String checkoutRequestId) {
        this.checkoutRequestId = checkoutRequestId;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMpesaReceiptNumber() {
        return mpesaReceiptNumber;
    }

    public void setMpesaReceiptNumber(String mpesaReceiptNumber) {
        this.mpesaReceiptNumber = mpesaReceiptNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    @Override
    public String toString() {
        return "Db{" +
                "merchantRequestId='" + merchantRequestId + '\'' +
                ", checkoutRequestId='" + checkoutRequestId + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", resultDescription='" + resultDescription + '\'' +
                ", amount='" + amount + '\'' +
                ", mpesaReceiptNumber='" + mpesaReceiptNumber + '\'' +
                ", balance='" + balance + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
