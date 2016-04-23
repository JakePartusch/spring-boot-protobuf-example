package com.jakepartusch.domain;

public class PhoneNumber {
    private int areaCode;
    private int phoneNumber;

    public PhoneNumber(int areaCode, int phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }
}
