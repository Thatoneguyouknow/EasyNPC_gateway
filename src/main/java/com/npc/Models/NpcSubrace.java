package com.npc.Models;

import java.io.Serializable;

import com.npc.PanacheEntities.SubraceEntity;

public class NpcSubrace implements Serializable {
    private int id;
    private String name;
    private Integer[] ability_score_increase;
    private Integer[] ability_score_increase_value;

    public NpcSubrace(String name, Integer[] asi, Integer[] asiv) {
        this.name = name;
        this.ability_score_increase = asi;
        this.ability_score_increase_value = asiv;
    }

    public NpcSubrace(SubraceEntity subraceEntity) {
        this.id = subraceEntity.id.intValue();
        this.name = subraceEntity.name;
        this.ability_score_increase = subraceEntity.ability_score_increase;
        this.ability_score_increase_value = subraceEntity.ability_score_increase_value;
    }

    public int GetID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String toSet) {
        this.name = toSet;
    }

    public Integer[] getASI() {
        return ability_score_increase;
    }

    public Integer[] getASIV() {
        return ability_score_increase_value;
    }

}
