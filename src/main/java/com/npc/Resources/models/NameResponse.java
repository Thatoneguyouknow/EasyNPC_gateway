package com.npc.Resources.models;

import java.util.List;

import com.npc.NamingLogic.RaceNameScheme;

public class NameResponse extends ResourceResponse<RaceNameScheme> {

    public NameResponse(List<RaceNameScheme> data) {
        super(data);
    }
}
