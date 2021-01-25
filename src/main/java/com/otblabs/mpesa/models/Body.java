package com.otblabs.mpesa.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Body {

    @JsonProperty("stkCallback")
    private STKCallback stkCallback;

    private static ObjectMapper objectMapper = new ObjectMapper();

    public Body() {
    }

    public STKCallback getStkCallback() {
        return stkCallback;
    }

    public void setStkCallback(STKCallback stkCallback) {
        this.stkCallback = stkCallback;
    }

    @Override
    public String toString() {
        return "Body{" +
                "stkCallback=" + stkCallback +
                '}';
    }

    //    public static void main(String[]args){
//
//        try {
//
//
//            MpesaResponse mpesaResponse = new MpesaResponse();
//            Body body = new Body();
//
//
//            List<MetaItem> items = new ArrayList<>();
//            MetaItem item = new MetaItem();
//            item.setName("name");
//            item.setValue("value");
//
//            MetaItem item2 = new MetaItem();
//            item.setName("name2");
//            item.setValue("value2");
//            items.add(item);
//            items.add(item2);
//
//            HashMap<String, List<MetaItem>> metadata = new HashMap<>();
//            metadata.put("Item", items);
//
//            STKCallback stkCallback = new STKCallback();
//            stkCallback.setResultCode("123456");
//            stkCallback.setResultDesc("Failed");
//            stkCallback.setMerchantRequestId("123421342");
//            stkCallback.setCheckoutRequestId("123421342");
//            stkCallback.setCallbackMetadata(metadata);
//
//            body.setStkCallback(stkCallback);
//            mpesaResponse.setBody(body);
//
//            String payload = objectMapper.writeValueAsString(mpesaResponse);
//            System.out.println("payload : " + payload);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//    }


}
