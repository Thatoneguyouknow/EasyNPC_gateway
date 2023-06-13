package com.npc.PanacheEntities;

import java.util.Date;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "users")
public class UserEntity extends PanacheEntity{
    
    @Column(name = "uid")
    public int user_id;

    @Column
    public String email;

    @Column
    public String password;

    @Column
    public boolean logged_in;

    @Column
    public String user_token;

    @Column
    public Date token_expiration;
}
