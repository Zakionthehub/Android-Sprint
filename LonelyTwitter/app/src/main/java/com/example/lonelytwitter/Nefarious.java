package com.example.lonelytwitter;

import java.util.Date;

public class Nefarious extends Mood {
    public Nefarious(String current_mood) {
        super(current_mood);
    }

    public Nefarious(Date date, String current_mood) {
        super(date, current_mood);
    }

    @Override
    public String getMood() {
        return "Nefarious";
    }
}
