package com.npc.Models;

import java.io.Serializable;

import com.npc.PanacheEntities.CharacterEntity;

public class NpcCharacter implements Serializable {
    private int id;
    private int user_id;
    private String name;
    private int class_id;
    private int race_id;
    private int level;
    private int[] stats;
    private int hit_points;
    private int alignment;
    private String[] personality;
    private int age;
    private int[] height;
    private int weight;

    public NpcCharacter(int uid, String name, int classID, int raceID, int level, int[] stats, int hp, int alignment,
            String[] personality, int age, int[] height, int weight) {
        this.user_id = uid;
        this.name = name;
        this.class_id = classID;
        this.race_id = raceID;
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
        this.level = charEntity.level;
        this.stats = charEntity.stats;
        this.hit_points = charEntity.hit_points;
        this.alignment = charEntity.alignment;
        this.personality = charEntity.personality_traits;
        this.age = charEntity.age;
        this.height = charEntity.height;
        this.weight = charEntity.weight;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public int getClass_id() {
        return class_id;
    }

    public int getRace_id() {
        return race_id;
    }

    public int getLevel() {
        return level;
    }

    public int[] getStats() {
        return stats;
    }

    public int getHit_points() {
        return hit_points;
    }

    public int getAlignment() {
        return alignment;
    }

    public String[] getPersonality() {
        return personality;
    }

    public int getAge() {
        return age;
    }

    public int[] getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
