package com.czettner.quiz1920;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CongratulationsActivity extends AppCompatActivity {

    int maxPoints = 0;
    int actualPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);

        Bundle b = getIntent().getExtras();
        maxPoints = b.getInt("maxPoints");
        actualPoints = b.getInt("actualPoints");
    }
}
