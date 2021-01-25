package com.otblabs.mpesa.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MpesaResponse {

    @JsonProperty("Body")
    private Body body;

    public MpesaResponse() {
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "MpesaResponse{" +
                "body=" + body +
                '}';
    }
}
