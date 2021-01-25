package com.otblabs.mpesa.stkpush;

import com.fasterxml.jackson.annotation.JsonProperty;

public class STKCallback {

    @JsonProperty("MerchantRequestID")
    private String merchantRequestId;

    @JsonProperty("CheckoutRequestID")
    private String checkoutRequestId;

    @JsonProperty("ResultCode")
    private int resultCode;

    @JsonProperty("ResultDesc")
    private String resultDesc;

    @JsonProperty("CallbackMetadata")
    private  CallbackMetadata callbackMetadata;

   // private HashMap<String, List<MetaItem>> callbackMetadata;

    public STKCallback() {
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

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public CallbackMetadata getCallbackMetadata() {
        return callbackMetadata;
    }

    public void setCallbackMetadata(CallbackMetadata callbackMetadata) {
        this.callbackMetadata = callbackMetadata;
    }




    //    public HashMap<String, List<MetaItem>> getCallbackMetadata() {
//        return callbackMetadata;
//    }
//
//    public void setCallbackMetadata(HashMap<String, List<MetaItem>> callbackMetadata) {
//        this.callbackMetadata = callbackMetadata;
//    }

    @Override
    public String toString() {
        return "STKCallback{" +
                "merchantRequestId='" + merchantRequestId + '\'' +
                ", checkoutRequestId='" + checkoutRequestId + '\'' +
                ", resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                ", callbackMetadata=" + callbackMetadata +
                '}';
    }
}
