package com.npc.NamingLogic;

import java.io.Serializable;
import java.util.ArrayList;

// This will be the default naming scheme for each race.
// Races will need to store the number that corresponds to their assigned race name scheme
// From there each Name Scheme will have an ID
// If the race has subrace dependent names, they will be bound by that ID
// Otherwise the ID will go unused

public class RaceNameScheme implements Serializable {
    private int nameID;
    private ArrayList<NameScheme> firstNames;
    private ArrayList<NameScheme> lastNames;

    public RaceNameScheme(int name_id, ArrayList<NameScheme> firsts, ArrayList<NameScheme> lasts) {
        this.nameID = name_id;
        this.firstNames = firsts;
        this.lastNames = lasts;
    }

    public int getID() {
        return nameID;
    }

    public ArrayList<NameScheme> getFirstNames() {
        return firstNames;
    }

    public ArrayList<NameScheme> getLastNames() {
        return lastNames;
    }
}
