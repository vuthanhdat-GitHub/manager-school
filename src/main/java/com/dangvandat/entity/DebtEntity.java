package com.dangvandat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "debt")
@Getter
@Setter
public class DebtEntity {

    @Column(name = "tuition")
    private Float tuition;

    @Column(name = "time")
    private Date time;

    @Column(name = "status")
    private String status;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private StudentEntity studentEntity;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "id_id")
    private StudentEntity id;

}
