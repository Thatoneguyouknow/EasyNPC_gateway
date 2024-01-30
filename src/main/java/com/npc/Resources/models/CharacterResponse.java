package com.npc.Resources.models;

import java.util.List;

import com.npc.Models.NpcCharacter;

public class CharacterResponse extends ResourceResponse<NpcCharacter> {

    public CharacterResponse(List<NpcCharacter> data) {
        super(data);
    }
}
