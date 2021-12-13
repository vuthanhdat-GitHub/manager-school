package com.dangvandat.enums;

public enum CodeNews {
    GIOITHIEU("GIOI THIEU"),
    TINTUC("TIN TUC"),
    CONGTRINHTIEUBIEU("CONG TRINH TIEU BIEU");

    private String value;

    CodeNews(String value){this.value = value;}

    public String getValue() {
        return value;
    }
}
