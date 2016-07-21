package com.czettner.quiz1920;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class QuizActivity extends AppCompatActivity {

    public static final int MAX_POINTS = 6;

    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    EditText answerYear;
    CheckBox answer4a;
    CheckBox answer4b;
    CheckBox answer4c;
    RadioButton answer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Instantiate inputs to avoid NullPointerException warnings
        answer1 = (RadioButton) findViewById(R.id.answer_1);
        answer2 = (RadioButton) findViewById(R.id.answer_2);
        answer3 = (RadioButton) findViewById(R.id.answer_3);
        answerYear = (EditText) findViewById(R.id.answer_year);
        answer4a = (CheckBox) findViewById(R.id.answer_4a);
        answer4b = (CheckBox) findViewById(R.id.answer_4b);
        answer4c = (CheckBox) findViewById(R.id.answer_4c);
        answer5 = (RadioButton) findViewById(R.id.answer_5);
    }
    public void onSubmit(View view) {
        Intent i = new Intent(this, CongratulationsActivity.class);
        i.putExtra("actualPoints", calculatePoints());
        i.putExtra("maxPoints", MAX_POINTS);
        startActivity(i);
    }

    private int calculatePoints() {
        int points = 0;

        if (answer1.isChecked()) {
            points++;
        }

        if (answer2.isChecked()) {
            points++;
        }

        if (answer3.isChecked()) {
            points++;
        }

        if (answerYear.getText().toString().trim().equals("1920")) {
            points++;
        }

        if (!answer4a.isChecked() && answer4b.isChecked() && answer4c.isChecked()) {
            points++;
        }

        if (answer5.isChecked()) {
            points++;
        }

        return points;
    }
}
