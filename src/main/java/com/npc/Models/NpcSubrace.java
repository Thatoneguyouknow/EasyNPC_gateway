package com.npc.Models;

import java.io.Serializable;

import com.npc.PanacheEntities.SubraceEntity;

public class NpcSubrace implements Serializable {
    private int id;
    private String name;
    private Integer name_scheme;
    private Integer[] ability_score_increase;
    private Integer[] ability_score_increase_value;

    public NpcSubrace(String name, Integer name_scheme, Integer[] asi, Integer[] asiv) {
        this.name = name;
        this.name_scheme = name_scheme;
        this.ability_score_increase = asi;
        this.ability_score_increase_value = asiv;
    }

    public NpcSubrace(SubraceEntity subraceEntity) {
        this.id = subraceEntity.id.intValue();
        this.name = subraceEntity.name;
        this.name_scheme = subraceEntity.associated_name_scheme;
        this.ability_score_increase = subraceEntity.ability_score_increase;
        this.ability_score_increase_value = subraceEntity.ability_score_increase_value;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String toSet) {
        this.name = toSet;
    }

    public Integer getNameScheme() {
        return name_scheme;
    }

    public void setNameScheme(Integer toSet) {
        this.name_scheme = toSet;
    }

    public Integer[] getASI() {
        return ability_score_increase;
    }

    public Integer[] getASIV() {
        return ability_score_increase_value;
    }

}
