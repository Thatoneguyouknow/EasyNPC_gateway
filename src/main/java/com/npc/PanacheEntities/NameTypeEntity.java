package com.npc.PanacheEntities;

import jakarta.persistence.*;

import java.math.BigInteger;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "name_types")
public class NameTypeEntity extends PanacheEntity{

    @Column(name = "associated_race")
    public BigInteger race;

    @Column(name = "associated_subrace")
    public BigInteger subrace;

    @Column(name = "first_name_first_halves")
    public String[] first_first_h;

    @Column(name = "first_name_second_halves")
    public String[] first_second_h;

    @Column(name = "last_name_first_halves")
    public String[] last_first_h;

    @Column(name = "last_name_second_halves")
    public String[] last_second_h;

    @Column(name = "extra_name_first_halves")
    public String[] extra_first_h;

    @Column(name = "extra_name_second_halves")
    public String[] extra_second_h;
}
