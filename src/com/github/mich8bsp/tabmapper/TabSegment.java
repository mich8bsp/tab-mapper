package com.github.mich8bsp.tabmapper;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mich8 on 12-May-17.
 */
public class TabSegment {
    private String lyrics;
    private List<String> tabs;
    private ChordSequence chords;

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public List<String> getTabs() {
        return tabs;
    }

    public void setTabs(List<String> tabs) {
        this.tabs = tabs;
    }

    public ChordSequence getChords() {
        return chords;
    }

    public void setChords(ChordSequence chords) {
        this.chords = chords;
    }

    public List<String> getLines() {
        List<String> lines = new LinkedList<>();
        if(chords!=null) {
            String chordsLine = chords.getElements().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "));
            lines.add(chordsLine);
        }
        if(tabs!=null) {
            lines.addAll(tabs);
        }
        if(lyrics!=null){
            lines.add(lyrics);
        }
        return lines;
    }
}
