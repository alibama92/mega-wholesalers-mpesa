package com.otblabs.mpesa.stkpush;

import com.otblabs.mpesa.stkpush.models.LNMResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mpesastk")
public class StkPushResource {

    private final  StkService stkService;

    public StkPushResource(StkService stkService) {
        this.stkService = stkService;
    }

    @PostMapping
    public LNMResult perfomStkPush() {
        return  stkService.performStkPush();
    }


}
