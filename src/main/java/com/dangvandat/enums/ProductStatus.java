package com.dangvandat.enums;

public enum ProductStatus {
    CONHANG("Con Hang"),
    KHONGCONHANG("Khong Con Hang");

    private String value;

    ProductStatus(String value){this.value = value;}

    public String getValue(){return value;}
}
