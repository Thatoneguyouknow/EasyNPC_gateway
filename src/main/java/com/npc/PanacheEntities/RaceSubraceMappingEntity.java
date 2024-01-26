package com.npc.PanacheEntities;

import jakarta.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "races_subraces")
public class RaceSubraceMappingEntity extends PanacheEntityBase{
    @Column
    public long race_id;

    @Id
    @Column
    public long subrace_id;
}

//NOTE this implementation is lazy, and should be reworked