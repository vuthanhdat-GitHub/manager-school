package com.dangvandat.dto.output;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StudentOutput {
    private String name;
    private String idclassz;
    private Date birthday;
    private String gender;
    private String numberphone;
    private String idcode;

    public StudentOutput(){
    }

    public StudentOutput(String name, String idclassz, Date birthday, String gender, String numberphone, String idcode) {
        this.name = name;
        this.idclassz = idclassz;
        this.birthday = birthday;
        this.gender = gender;
        this.numberphone = numberphone;
        this.idcode = idcode;
    }
}
