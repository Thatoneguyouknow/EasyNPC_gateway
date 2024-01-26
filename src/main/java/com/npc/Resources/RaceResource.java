package com.npc.Resources;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import com.npc.Models.NpcRace;
import com.npc.PanacheEntities.RaceEntity;
import com.npc.PanacheEntities.RaceSubraceMappingEntity;
import com.npc.Resources.models.RaceResponse;

import io.quarkus.panache.common.Sort;

@Path("/Races")
@ApplicationScoped
public class RaceResource {
    @GET
    public RaceResponse get() {
        List<RaceEntity> entities = RaceEntity.listAll(Sort.by("id"));
        List<RaceSubraceMappingEntity> mappings = RaceSubraceMappingEntity.listAll();

        List<NpcRace> npcRaces = new ArrayList<>();
        if (entities != null) {
            for (RaceEntity entity : entities) {
                RaceSubraceMappingEntity[] raceMapping = mappings.stream().filter(mapping -> entity.id.equals(mapping.race_id)).toArray(RaceSubraceMappingEntity[]::new);
                NpcRace npcRace = new NpcRace(entity, raceMapping);
                npcRaces.add(npcRace);
            }
        }
        return new RaceResponse(npcRaces);
    }
}
