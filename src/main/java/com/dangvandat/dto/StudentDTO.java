package com.dangvandat.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StudentDTO extends AbstractDTO<StudentDTO>{
    private String name;
    private String idclassz;
    private Date birthday;
    private String gender;
    private String numberphone;
    private String idcode;
}
