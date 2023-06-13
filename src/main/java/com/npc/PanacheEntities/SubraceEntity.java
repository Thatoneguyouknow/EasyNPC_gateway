package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "subraces")
public class SubraceEntity extends PanacheEntity{

    @Column
    public String name;
}
