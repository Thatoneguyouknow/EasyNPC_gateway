package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "characters")
public class CharacterEntity extends PanacheEntity {

    @Column
    public String name;

    @Column
    public int created_user_id;

    @Column
    public int class_id;

    @Column
    public int race_id;

    @Column
    public int level;

    @Column
    public int[] stats;

    @Column
    public int hit_points;

    @Column
    public int alignment;

    @Column
    public String[] personality_traits;

    @Column
    public int age;

    @Column
    public int[] height;

    @Column
    public int weight;
}
