package com.npc.NamingLogic;

public class NameScheme {
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

    public String[] getfirstHavles() {
        return firstHalfStrings;
    }

    public String[] getsecondHavles() {
        return secondHalfStrings;
    }
}
