package com.example.country_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void  onClick(View view){
        Toast toast;
        toast = Toast.makeText(this,"Нажата кнопка!!!", Toast.LENGTH_LONG);
        toast.show();
    }
}