package com.otblabs;

import com.otblabs.mpesa.c2b.C2bService;
import com.otblabs.mpesa.c2b.models.RegisterUrlResponse;
import com.otblabs.mpesa.security.AccessTokenService;
import com.otblabs.mpesa.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MegaWholesalersMpesaApplication implements CommandLineRunner {

	@Autowired
	C2bService c2bService;


	public static void main(String[] args) {
		SpringApplication.run(MegaWholesalersMpesaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//call c2b register url on every server restart
		//just incase server restart changes the urls
		RegisterUrlResponse registerUrlResponse = c2bService.registerUrl(Utility.getAccessToken());
		System.out.println(registerUrlResponse.toString());


	}
}
