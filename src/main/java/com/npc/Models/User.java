package com.npc.Models;

import java.io.Serializable;
import java.util.Date;

import com.npc.PanacheEntities.UserEntity;

public class User implements Serializable {
    private int id;
    private int user_type;
    private String email;
    private String password;
    private boolean logged_in;
    private String user_token;
    private Date token_expiration;

    public User(String email, String pass, boolean logged_in, String token, Date token_expir) {
        this.email = email;
        this.password = pass;
        this.logged_in = logged_in;
        this.user_token = token;
        this.token_expiration = token_expir;
    }

    public User(int uid, int user_type, String email, String pass, boolean logged_in, String token,
            Date token_expir) {
        this.id = uid;
        this.user_type = user_type;
        this.email = email;
        this.logged_in = logged_in;
        this.password = pass;
        this.user_token = token;
        this.token_expiration = token_expir;
    }

    public User(UserEntity userEntity) {
        // this.id = userEntity.id.intValue();
        this.id = 1;
        this.user_type = userEntity.user_type;
        this.email = userEntity.email;
        this.password = userEntity.password;
        this.logged_in = userEntity.logged_in;
        this.user_token = userEntity.user_token;
        this.token_expiration = userEntity.token_expiration;
    }

    public int getID() {
        return id;
    }

    public int getUserType() {
        return user_type;
    }

    public void setUserType(int user_type) {
        this.user_type = user_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailString) {
        this.email = emailString;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLoggedIn() {
        return logged_in;
    }

    public void setLoggedIn(boolean logged_in) {
        this.logged_in = logged_in;
    }

    public String getUserToken() {
        return user_token;
    }

    public void setUserToken(String user_token) {
        this.user_token = user_token;
    }

    public Date getTokenExpiration() {
        return token_expiration;
    }

    public void setTokenExpiration(Date token_expiration) {
        this.token_expiration = token_expiration;
    }
}
