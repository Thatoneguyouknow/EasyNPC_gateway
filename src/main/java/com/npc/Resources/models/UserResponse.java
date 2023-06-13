package com.npc.Resources.models;

import java.util.List;

import com.npc.Models.UserClass;

public class UserResponse extends ResourceResponse<UserClass> {

    public UserResponse(List<UserClass> data) {
        super(data);
    }
}
