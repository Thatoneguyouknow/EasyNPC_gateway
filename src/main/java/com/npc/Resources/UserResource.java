package com.npc.Resources;

import java.util.List;

import com.npc.PanacheEntities.UserEntity;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/Users")
@ApplicationScoped
public class UserResource {

    @GET
    public List<UserEntity> get() {
        return UserEntity.listAll(Sort.by("logged_in"));
    }
}
