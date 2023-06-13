package com.npc.Resources.models;

import java.util.List;

import com.npc.Models.NpcClass;

public class ClassResponse extends ResourceResponse<NpcClass> {

    public ClassResponse(List<NpcClass> data) {
        super(data);
    }
}
