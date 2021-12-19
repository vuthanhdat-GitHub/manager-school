package com.dangvandat.builder;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentBuilder {
    private String name;
    private String idclassz;
    private Date birthday;
    private String gender;
    private String numberphone;
    private String idcode;
}
