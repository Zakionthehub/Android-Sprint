package com.example.lonelytwitter;

import java.util.Date;

public class NormalTweet extends Tweet {
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public boolean isImportant() {
        return Boolean.FALSE;
    }
}
