package com.npc.NamingLogic;

import java.io.Serializable;

public class NameScheme implements Serializable{
    private int nameID;
    private String[] firstHalfStrings;
    private String[] secondHalfStrings;

    public NameScheme(int nameID, String[] firstHalf, String[] secondHalf) {
        this.nameID = nameID;
        this.firstHalfStrings = firstHalf;
        this.secondHalfStrings = secondHalf;
    }

    public int getID(){
        return nameID;
    }

    public String[] getfirstHalves() {
        return firstHalfStrings;
    }

    public String[] getsecondHalves() {
        return secondHalfStrings;
    }
}
