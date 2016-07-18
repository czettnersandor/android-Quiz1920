package com.czettner.quiz1920;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void onSubmit(View view) {
        Intent i = new Intent(this, CongratulationsActivity.class);
        i.putExtra("maxPoints", 5);
        i.putExtra("actualPoints", 4);
        startActivity(i);
    }
}
