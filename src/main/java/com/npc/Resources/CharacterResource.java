package com.npc.Resources;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import com.npc.Models.NpcCharacter;
import com.npc.PanacheEntities.CharacterEntity;
import com.npc.Resources.models.CharacterResponse;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.panache.common.Sort;

@Path("/Characters")
@ApplicationScoped
public class CharacterResource {

    @GET
    public CharacterResponse get() {
        List<CharacterEntity> entities = CharacterEntity.listAll(Sort.by("id"));

        List<NpcCharacter> npcCharacters = new ArrayList<>();
        if (entities != null) {
            for (CharacterEntity entity : entities) {
                NpcCharacter npcCharacter = new NpcCharacter(entity);
                npcCharacters.add(npcCharacter);
            }
        }
        return new CharacterResponse(npcCharacters);
    }

}
