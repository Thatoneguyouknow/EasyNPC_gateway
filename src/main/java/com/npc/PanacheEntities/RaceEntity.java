package com.npc.PanacheEntities;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "races")
public class RaceEntity extends PanacheEntity{

    @Column
    public String name;

    @Column
    public int[] asi_primary;

    @Column
    public int[] asi_secondary;

    @Column
    public int[] asi_tertiary;

    @Column
    public int[] age_range;

    @Column
    public int name_type;

    // @Column
    // public Subraces[] subraces;
}
