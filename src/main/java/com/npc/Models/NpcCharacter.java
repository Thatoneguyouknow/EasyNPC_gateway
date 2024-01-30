package com.npc.Models;

import java.io.Serializable;

import com.npc.PanacheEntities.CharacterEntity;

public class NpcCharacter implements Serializable {
    private int id;
    private Integer user_id;
    private String name;
    private Integer class_id;
    private Integer race_id;
    private Integer subrace_id;
    private Integer level;
    private Integer[] stats;
    private Integer hit_points;
    private Integer alignment;
    private String[] personality;
    private Integer age;
    private Integer[] height;
    private Integer weight;

    public NpcCharacter(Integer uid, String name, Integer classID, Integer raceID, Integer subraceID, Integer level, Integer[] stats, Integer hp,
            Integer alignment,
            String[] personality, Integer age, Integer[] height, Integer weight) {
        this.user_id = uid;
        this.name = name;
        this.class_id = classID;
        this.race_id = raceID;
        this.subrace_id = subraceID;
        this.level = level;
        this.stats = stats;
        this.hit_points = hp;
        this.alignment = alignment;
        this.personality = personality;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public NpcCharacter(CharacterEntity charEntity) {
        this.user_id = charEntity.created_user_id;
        this.name = charEntity.name;
        this.class_id = charEntity.class_id;
        this.race_id = charEntity.race_id;
        this.subrace_id = charEntity.subrace_id;
        this.level = charEntity.level;
        this.stats = charEntity.stats;
        this.hit_points = charEntity.hit_points;
        this.alignment = charEntity.alignment;
        this.personality = charEntity.personality_traits;
        this.age = charEntity.age;
        this.height = charEntity.height;
        this.weight = charEntity.weight;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public Integer getRace_id() {
        return race_id;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer[] getStats() {
        return stats;
    }

    public Integer getHit_points() {
        return hit_points;
    }

    public Integer getAlignment() {
        return alignment;
    }

    public String[] getPersonality() {
        return personality;
    }

    public Integer getAge() {
        return age;
    }

    public Integer[] getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getSubrace_id() {
        return subrace_id;
    }
}
