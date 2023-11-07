package com.npc.Resources;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import com.npc.Models.NpcSubrace;
import com.npc.PanacheEntities.SubraceEntity;
import com.npc.Resources.models.SubraceResponse;

import io.quarkus.panache.common.Sort;

@Path("/Subraces")
@ApplicationScoped
public class SubraceResource {
    @GET
    public SubraceResponse get() {
        List<SubraceEntity> entities = SubraceEntity.listAll(Sort.by("id"));

        List<NpcSubrace> npcSubraces = new ArrayList<>();
        if (entities != null) {
            for (SubraceEntity entity : entities) {
                NpcSubrace npcSubrace = new NpcSubrace(entity);
                npcSubraces.add(npcSubrace);
            }
        }
        return new SubraceResponse(npcSubraces);
    }
}
