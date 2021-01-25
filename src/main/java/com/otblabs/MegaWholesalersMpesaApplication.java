package com.otblabs;

import com.otblabs.mpesa.c2b.C2bService;
import com.otblabs.mpesa.c2b.models.RegisterUrlResponse;
import com.otblabs.mpesa.security.AccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MegaWholesalersMpesaApplication implements CommandLineRunner {

	@Autowired
	C2bService c2bService;
	@Autowired
	AccessTokenService accessTokenService;

	public static void main(String[] args) {
		SpringApplication.run(MegaWholesalersMpesaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//call c2b register url on every server restart
		//just incase server restart changes the urls
		RegisterUrlResponse registerUrlResponse = c2bService.registerUrl(accessTokenService.getAccessToken("4BMXY3dMmUcYH8EVsHNi7LmMMRW2Qb0l", "iGylY5r8YMwVgLYX").getAccess_token());
		System.out.println(registerUrlResponse.toString());


	}
}
