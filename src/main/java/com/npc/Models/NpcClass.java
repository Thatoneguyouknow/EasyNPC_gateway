package com.npc.Models;

import java.io.Serializable;

import com.npc.PanacheEntities.ClassEntity;

public class NpcClass implements Serializable {
    private int id;
    private int user_id;
    private String name;
    private int hit_die;
    private Integer[] stat_priority;

    public NpcClass(int user_id, String name, int hit_die, Integer[] stat_priority) {
        this.user_id = user_id;
        this.name = name;
        this.hit_die = hit_die;
        this.stat_priority = stat_priority;
    }

    public NpcClass(ClassEntity classEntity) {
        this.id = classEntity.id.intValue();
        this.user_id = classEntity.user_id;
        this.name = classEntity.name;
        this.hit_die = classEntity.hit_die;
        this.stat_priority = classEntity.stat_priority;
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

    public int getHitDie() {
        return hit_die;
    }

    public void setHitDie(int toSet) {
        this.hit_die = toSet;
    }

    public Integer[] getStatPriority() {
        return stat_priority;
    }
}
