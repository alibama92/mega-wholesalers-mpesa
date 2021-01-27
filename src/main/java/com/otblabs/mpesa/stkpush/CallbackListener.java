package com.otblabs.mpesa.stkpush;

import com.otblabs.mpesa.stkpush.db.StkResponseData;
import com.otblabs.mpesa.stkpush.models.MpesaResponse;
import com.otblabs.mpesa.stkpush.models.STKCallback;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CallbackListener {

    private final StkService stkService;

    public CallbackListener(StkService stkService) {
        this.stkService = stkService;
    }

    @PostMapping("/stk-callback-url")
    public void getStkCallback(@RequestBody MpesaResponse mpesaResponse){

        if(mpesaResponse != null){
            if(mpesaResponse.getBody().getStkCallback().getResultCode() == 0){

                //successful transaction
                var response = mpesaResponse;
                var stkCallback = mpesaResponse.getBody().getStkCallback();

                StkResponseData stkResponseData = new StkResponseData();
                stkResponseData.setMerchantRequestId(stkCallback.getMerchantRequestId());
                stkResponseData.setCheckoutRequestId(stkCallback.getCheckoutRequestId());
                stkResponseData.setResultCode(String.valueOf(stkCallback.getResultCode()));
                stkResponseData.setResultDescription(stkCallback.getResultDesc());
                stkResponseData.setAmount(String.valueOf(stkCallback.getCallbackMetadata().getMetaItemList().get(0)));
                stkResponseData.setMpesaReceiptNumber(String.valueOf(stkCallback.getCallbackMetadata().getMetaItemList().get(1)));
                stkResponseData.setBalance(String.valueOf(stkCallback.getCallbackMetadata().getMetaItemList().get(2)));
                stkResponseData.setTransactionDate(String.valueOf(stkCallback.getCallbackMetadata().getMetaItemList().get(3)));
                stkResponseData.setPhoneNumber(String.valueOf(stkCallback.getCallbackMetadata().getMetaItemList().get(4)));



            }else{
                //transaction failed
                var response = mpesaResponse;
                System.out.println(mpesaResponse);
            }
        }

        //no response recieved from safaricom

    }



}
