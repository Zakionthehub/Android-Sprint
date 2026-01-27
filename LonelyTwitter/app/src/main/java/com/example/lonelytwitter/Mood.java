package com.example.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;
    private String current_mood;

    public Mood(String current_mood) {
        this.current_mood = current_mood;
        date = new Date();
    }

    public Mood(Date date, String current_mood) {
        this.date = date;
        this.current_mood = current_mood;
    }

    public String getCurrent_Mood() {
        return current_mood;
    }

    public void setCurrent_Mood(String current_mood) {
        this.current_mood = current_mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
