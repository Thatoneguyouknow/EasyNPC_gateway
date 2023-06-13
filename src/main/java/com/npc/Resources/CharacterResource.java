package com.npc.Resources;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import com.npc.PanacheEntities.CharacterEntity;

import java.util.List;

import io.quarkus.panache.common.Sort;

@Path("/Characters")
@ApplicationScoped
public class CharacterResource {

    @GET
    public List<CharacterEntity> get() {
        return CharacterEntity.listAll(Sort.by("name"));
    }
    
}
