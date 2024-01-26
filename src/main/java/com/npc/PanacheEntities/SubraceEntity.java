package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "subraces")
public class SubraceEntity extends PanacheEntity{

    @Column(name="subrace_name")
    public String name;

    @Column
    public Integer[] ability_score_increase;

    @Column
    public Integer[] ability_score_increase_value;

    @Column
    public Integer associated_name_scheme;
}
