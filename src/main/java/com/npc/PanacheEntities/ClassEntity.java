package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "classes")
public class ClassEntity extends PanacheEntity {

    @Column(name = "created_user_id")
    public int user_id;

    @Column
    public String name;

    @Column
    public int hit_die;

    @Column
    public Integer[] stat_priority;
}
