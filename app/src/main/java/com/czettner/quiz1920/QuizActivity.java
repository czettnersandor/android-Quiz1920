package com.czettner.quiz1920;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class QuizActivity extends AppCompatActivity {

    public static int MAX_POINTS = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void onSubmit(View view) {
        Intent i = new Intent(this, CongratulationsActivity.class);
        i.putExtra("actualPoints", calculatePoints());
        i.putExtra("maxPoints", MAX_POINTS);
        startActivity(i);
    }

    private int calculatePoints() {
        int points = 0;

        RadioButton answer1 = (RadioButton) findViewById(R.id.answer_1);
        if (answer1.isChecked()) {
            points++;
        }

        RadioButton answer2 = (RadioButton) findViewById(R.id.answer_2);
        if (answer2.isChecked()) {
            points++;
        }

        RadioButton answer3 = (RadioButton) findViewById(R.id.answer_3);
        if (answer3.isChecked()) {
            points++;
        }

        EditText answerYear = (EditText) findViewById(R.id.answer_year);
        if (answerYear.getText().toString().trim().equals("1920")) {
            points++;
        }

        CheckBox answer4 = (CheckBox) findViewById(R.id.answer_4);
        CheckBox answer4b = (CheckBox) findViewById(R.id.answer_4b);
        if (answer4.isChecked() && answer4b.isChecked()) {
            points++;
        }

        RadioButton answer5 = (RadioButton) findViewById(R.id.answer_5);
        if (answer5.isChecked()) {
            points++;
        }

        return points;
    }
}
