package com.npc.Resources;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import com.npc.Models.NpcClass;
import com.npc.PanacheEntities.ClassEntity;
import com.npc.Resources.models.ClassResponse;

import io.quarkus.panache.common.Sort;

@Path("/Classes")
@ApplicationScoped
public class ClassResource {

    @GET
    public ClassResponse get() {
        List<ClassEntity> entities = ClassEntity.listAll(Sort.by("id"));

        List<NpcClass> npcClasses = new ArrayList<>();
        if (entities != null) {
            for (ClassEntity entity : entities) {
                NpcClass npcClass = new NpcClass(entity);
                npcClasses.add(npcClass);
            }
        }
        return new ClassResponse(npcClasses);
    }
}
