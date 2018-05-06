package com.econetwireless.utils.enums;

/**
 * Created by tnyamakura on 17/3/2017.
 */
public enum ResponseCode {

    SUCCESS("200"), FAILED("500"), INVALID_REQUEST("400");
    private String code;
    private ResponseCode(String code) {
        this.code = code; // parameter code was assigned to itself. added the this keyword to initialize the instance variable
    }

    public String getCode() {
        return code;
    }
}
