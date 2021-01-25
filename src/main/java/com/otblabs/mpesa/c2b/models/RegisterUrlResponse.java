package com.otblabs.mpesa.c2b.models;

public class RegisterUrlResponse{
private String ConversationID;
private String OriginatorConversationID;
private String ResponseDescription;

    public RegisterUrlResponse() {
    }

    public String getConversationID() {
        return ConversationID;
    }

    public void setConversationID(String conversationID) {
        ConversationID = conversationID;
    }

    public String getOriginatorConversationID() {
        return OriginatorConversationID;
    }

    public void setOriginatorConversationID(String originatorConversationID) {
        OriginatorConversationID = originatorConversationID;
    }

    public String getResponseDescription() {
        return ResponseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        ResponseDescription = responseDescription;
    }

    @Override
    public String toString() {
        return "RegisterUrlResponse{" +
                "ConversationID='" + ConversationID + '\'' +
                ", OriginatorConversationID='" + OriginatorConversationID + '\'' +
                ", ResponseDescription='" + ResponseDescription + '\'' +
                '}';
    }
}
