package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "characters")
public class CharacterEntity extends PanacheEntity {

    @Column
    public String name;

    @Column
    public Integer created_user_id;

    @Column
    public Integer class_id;

    @Column
    public Integer race_id;

    @Column
    public Integer subrace_id;

    @Column
    public Integer level;

    @Column
    public Integer[] stats;

    @Column
    public Integer hit_points;

    @Column
    public Integer alignment;

    @Column
    public String[] personality_traits;

    @Column
    public Integer age;

    @Column
    public Integer[] height;

    @Column
    public Integer weight;
}
