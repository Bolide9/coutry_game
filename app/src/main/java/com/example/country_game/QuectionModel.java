package com.example.country_game;

import java.util.List;

public class QuectionModel {
    private int mQuectionId;
    private boolean mAnswer;

    public QuectionModel(int mQuectionId, boolean mAnswer) {
        this.mQuectionId = mQuectionId;
        this.mAnswer = mAnswer;
    }

    public int getmQuectionId() {
        return mQuectionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmQuectionId(int mQuectionId) {
        this.mQuectionId = mQuectionId;
    }

    public boolean getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
