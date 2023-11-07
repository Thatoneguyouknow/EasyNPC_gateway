package com.npc.Models;

import java.io.Serializable;

import com.npc.PanacheEntities.RaceEntity;

public class NpcRace implements Serializable {
    private int id;
    private int user_id;
    private String name;
    private int alignment_skew;
    private int[] heightRange;
    private int[] weightRange;
    private int[] ageRange;
    private Integer[] ability_score_increase;
    private Integer[] ability_score_increase_value;

    public NpcRace(int user_id, String name, int alignment, int[] height, int[] weight, int[] age, Integer[] asi,
            Integer[] asiv) {
        this.user_id = user_id;
        this.name = name;
        this.alignment_skew = alignment;
        this.heightRange = height;
        this.weightRange = weight;
        this.ageRange = age;
        this.ability_score_increase = asi;
        this.ability_score_increase_value = asiv;
    }

    // Because PostGres does not save ranges as inclusive, ranges are saved with upper limit exclusive
    // This means that should a race have a weight from 150-350, postgres will save this as 150-351 upper limit exclusive
    public NpcRace(RaceEntity raceEntity) {
        this.id = raceEntity.id.intValue();
        this.user_id = raceEntity.user_id;
        this.name = raceEntity.name;
        this.alignment_skew = raceEntity.alignment_skew;
        this.heightRange = new int[]{raceEntity.height.lower(), raceEntity.height.upper() - 1};
        this.weightRange = new int[]{raceEntity.weight.lower(), raceEntity.weight.upper() - 1};
        this.ageRange = new int[]{raceEntity.age.lower(), raceEntity.age.upper() -1 };
        this.ability_score_increase = raceEntity.ability_score_increase;
        this.ability_score_increase_value = raceEntity.ability_score_increase_value;
    }

    public int getID() {
        return id;
    }

    public int getUserID() {
        return user_id;
    }

    public void setUserID(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String toSet) {
        this.name = toSet;
    }

    public int getAlignment() {
        return alignment_skew;
    }

    public void setAlignment(int alignment) {
        this.alignment_skew = alignment;
    }

    public int[] getHeightRange() {
        return heightRange;
    }

    public int[] getWeightRange() {
        return weightRange;
    }

    public int[] getAgeRange() {
        return ageRange;
    }

    public Integer[] getASI() {
        return ability_score_increase;
    }

    public Integer[] getASIV() {
        return ability_score_increase_value;
    }

}
