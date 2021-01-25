package com.otblabs.mpesa.utils;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;

public class Gen {

    public static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.equals("")) {
            return "";
        }
        if (phoneNumber.length() < 11 & phoneNumber.startsWith("0")) {
            return phoneNumber.replaceFirst("^0", "254");
        }
        if (phoneNumber.length() == 13 && phoneNumber.startsWith("+")) {
            return phoneNumber.replaceFirst("^+", "");
        }
        return phoneNumber;
    }

    //The Timestamp of the Transaction
    public static String generateTimestamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
    }

    //The password for Encrypting the Request
    public static String generatePassword(String businessShortCode, String passKey) {
        String password = businessShortCode + passKey + generateTimestamp();

        // Encode into Base64 format
        String basicBase64format
                = Base64.getEncoder()
                .encodeToString(password.getBytes());
        return basicBase64format;

    }
}
