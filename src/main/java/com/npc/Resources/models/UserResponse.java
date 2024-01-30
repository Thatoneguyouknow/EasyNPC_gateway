package com.npc.Resources.models;

import java.util.List;

import com.npc.Models.User;

public class UserResponse extends ResourceResponse<User> {

    public UserResponse(List<User> data) {
        super(data);
    }
}
