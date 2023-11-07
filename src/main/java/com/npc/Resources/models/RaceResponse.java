package com.npc.Resources.models;

import java.util.List;

import com.npc.Models.NpcRace;

public class RaceResponse extends ResourceResponse<NpcRace> {

    public RaceResponse(List<NpcRace> data) {
        super(data);
    }
}
