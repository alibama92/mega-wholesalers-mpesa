package com.otblabs.mpesa.c2b;

public class c2bServiceImpl implements  C2bService{
    @Override
    public void registerUrl() {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"ShortCode\":\"ShortCode\",
                \"ResponseType\":\"ResponseType\",
                \"ConfirmationURL\":\"http://ip_address:port/confirmation\",
                \"ValidationURL\":\"http://ip_address:port/validation_url\"}");
        Request request = new Request.Builder()
                .url("https://sandbox.safaricom.co.ke/mpesa/c2b/v1/registerurl")
                .post(body)
                .addHeader("authorization", "Bearer ACCESS_TOKEN")
                .addHeader("content-type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
    }
}
