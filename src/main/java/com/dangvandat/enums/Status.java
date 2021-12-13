package com.dangvandat.enums;

public enum Status {
    HOATDONG("Hoat Dong"),
    KHONGHOATDONG("Khong Hoat Dong");

    private String value;

    Status(String value){this.value = value;}

    public String getValue(){return value;}
}
