package com.otblabs.mpesa.stkpush;

import com.otblabs.mpesa.stkpush.models.MpesaResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CallbackListener {


    @PostMapping("/stk-callback-url")
    public void getStkCallback(@RequestBody MpesaResponse mpesaResponse){

        if(mpesaResponse != null){
            if(mpesaResponse.getBody().getStkCallback().getResultCode() == 0){

                //successful transaction
                var response = mpesaResponse;
                System.out.println(mpesaResponse);
            }else{
                //transaction failed
                var response = mpesaResponse;
                System.out.println(mpesaResponse);
            }
        }

        //no response recieved from safaricom

    }



}
