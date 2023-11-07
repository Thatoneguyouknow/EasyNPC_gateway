package com.npc.Resources;

import java.util.ArrayList;
import java.util.List;

import com.npc.Models.User;
import com.npc.PanacheEntities.UserEntity;
import com.npc.Resources.models.UserResponse;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/Users")
@ApplicationScoped
public class UserResource {

    @GET
    public UserResponse get() {
        // Sort.by("uid")
        List<UserEntity> entities = UserEntity.listAll();

        List<User> userClasses = new ArrayList<>();
        if (entities != null) {
            for (UserEntity entity : entities) {
                User userClass = new User(entity);
                userClasses.add(userClass);
            }
        }
        return new UserResponse(userClasses);
    }
}
