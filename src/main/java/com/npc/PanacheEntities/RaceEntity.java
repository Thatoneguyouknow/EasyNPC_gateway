package com.npc.PanacheEntities;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import io.hypersistence.utils.hibernate.type.range.PostgreSQLRangeType;
import io.hypersistence.utils.hibernate.type.range.Range;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "races")
public class RaceEntity extends PanacheEntity {

    @Column(name = "created_user_id")
    public int user_id;

    @Column
    public String name;

    @Column
    public int name_type;

    @Column
    public int alignment_skew;

    @Type(PostgreSQLRangeType.class)
    @Column
    public Range<Integer> height;

    @Type(PostgreSQLRangeType.class)
    @Column
    public Range<Integer> weight;

    @Type(PostgreSQLRangeType.class)
    @Column
    public Range<Integer> age;

    @Column
    public Integer[] ability_score_increase;

    @Column
    public Integer[] ability_score_increase_value;

}
