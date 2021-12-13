package com.dangvandat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
@Getter
@Setter
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_classz")
    private String idclassz;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "gender")
    private String gender;

    @Column(name = "number_phone")
    private String numberphone;

    @Column(name = "id_code")
    private String idcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private ClasszEntity classzEntity;

    @OneToOne(mappedBy = "id", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private DebtEntity debtEntity;

    @OneToOne(mappedBy = "id", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private FileEntity fileEntity;
}
