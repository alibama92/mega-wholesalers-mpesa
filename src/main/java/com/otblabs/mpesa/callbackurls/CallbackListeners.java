package com.otblabs.mpesa.callbackurls;

import com.otblabs.mpesa.stkpush.MpesaResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CallbackListeners {


    @PostMapping("/callback-url")
    public void getStkCallback(@RequestBody MpesaResponse mpesaResponse){

        if(mpesaResponse != null){
            if(mpesaResponse.getBody().getStkCallback().getResultCode() == 0){

                //successful transaction
                var response = mpesaResponse;
            }else{
                //transaction failed
                var response = mpesaResponse;
            }
        }

        //no response recieved from safaricom

    }

}
