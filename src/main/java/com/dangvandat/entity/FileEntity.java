package com.dangvandat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Getter
@Setter
public class FileEntity {

    @Id
    @Column(name = "student_id")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "doi_tuong_uu_tien")
    private String doituonguutien;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private StudentEntity studentEntity;

}
