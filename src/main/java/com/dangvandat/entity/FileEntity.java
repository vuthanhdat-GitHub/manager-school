package com.dangvandat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Getter
@Setter
public class FileEntity extends BaseEntity{

    @Column(name = "address")
    private String address;

    @Column(name = "doi_tuong_uu_tien")
    private String doituonguutien;
}
