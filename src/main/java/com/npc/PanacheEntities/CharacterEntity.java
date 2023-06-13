package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "npc_character")
public class CharacterEntity extends PanacheEntity {

    @Column(length = 225, unique = false)
    public String name;

    @Column(unique = false)
    public int raceID;

    @Column
    public int classID;

    @Column
    public int[] alignment;

    @Column(length = 255)
    public String personality;

    @Column
    public int level;

    @Column
    public int[] stats;

    @Column
    public int hp;

}
