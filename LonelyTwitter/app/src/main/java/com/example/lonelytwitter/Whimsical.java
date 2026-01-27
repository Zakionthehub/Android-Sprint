package com.example.lonelytwitter;

import java.util.Date;

public class Whimsical extends Mood {
    public Whimsical(String current_mood) {
        super(current_mood);
    }

    public Whimsical(Date date, String current_mood) {
        super(date, current_mood);
    }

    @Override
    public String getMood() {
        return "Whimsical";
    }
}
