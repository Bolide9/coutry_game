package com.example.country_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {
    int mCurrentIndex = 0;

    QuectionModel[] mQuections = new QuectionModel[]{
            new QuectionModel(R.string.question1, false),
            new QuectionModel(R.string.question2, true),
            new QuectionModel(R.string.question3, true),
            new QuectionModel(R.string.question4, true),
            new QuectionModel(R.string.question5, true),
            new QuectionModel(R.string.question6, false),
    };

    TextView mQuectionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        TextView mQuectionText = (TextView)findViewById(R.id.textView);
        mQuectionText.setText(mQuections[mCurrentIndex].getmQuectionId());
    }

    public void onClick(View view){
        boolean userAnswer = true;
        checkAnswer(userAnswer);
    }

    public void onClick2(View view){
        boolean userAnswer = false;
        checkAnswer(userAnswer);
    }

    public void checkAnswer(boolean userAnswer){
        Toast toast;

        if(mQuections[mCurrentIndex].ismAnswer() == userAnswer) {
            toast = Toast.makeText( this, "Правильный ответ!", Toast.LENGTH_SHORT);
        }
        else{
            toast = Toast.makeText(this, "Неверный ответ!", Toast.LENGTH_SHORT);
        }
        toast.show();
        updateQuetion();
    }

    public void updateQuetion(){
        mCurrentIndex++;
        mQuectionText.setText(mQuections[mCurrentIndex].getmQuectionId());
    }
}               