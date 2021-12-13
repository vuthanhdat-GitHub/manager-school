package com.dangvandat.enums;

public enum IntroductionType {
    THANGTAM("THANG TAM"),
    HABACH("HA BACH");

    private String value;

    IntroductionType(String value) {
        this.value = value;
    }

    public String getValue(){return value;}
}
