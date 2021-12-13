package com.dangvandat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classz")
@Getter
@Setter
public class ClasszEntity {

    @Column(name = "classz_name")
    private String classzname;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<StudentEntity> studentEntities;
}
