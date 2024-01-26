package com.npc.Resources;

import com.npc.Resources.models.NameResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

import com.npc.NamingLogic.Naming;
import com.npc.NamingLogic.RaceNameScheme;

@Path("/Names")
@ApplicationScoped
public class NameResource {
    @GET
    public NameResponse get() {
        Naming nameCreator = new Naming();
        List<RaceNameScheme> entities = nameCreator.createNames();
        return new NameResponse(entities);
    }
}
