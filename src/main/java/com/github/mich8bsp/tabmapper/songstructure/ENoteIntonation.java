package com.github.mich8bsp.tabmapper.songstructure;

/**
 * Created by mich8 on 12-May-17.
 */
public enum ENoteIntonation {
    NONE(""), FLAT("b"), SHARP("#");

    private String stringRepr = "";

    ENoteIntonation(String s) {
        stringRepr = s;
    }

    @Override
    public String toString() {
        return stringRepr;
    }
}
