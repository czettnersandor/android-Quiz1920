package com.czettner.quiz1920;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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

        TextView actualView = (TextView) findViewById(R.id.actual_points);
        if (actualView != null) {
            actualView.setText(actualPoints + "");
        }

        TextView maxView = (TextView) findViewById(R.id.max_points);
        if (maxView != null) {
            maxView.setText(maxPoints + "");
        }

        TextView congrat = (TextView) findViewById(R.id.congrat);

        if (congrat != null) {
            if (actualPoints <= maxPoints / 2) {
                congrat.setText(getString(R.string.sorry));
            } else if (actualPoints == maxPoints) {
                congrat.setText(getString(R.string.perfect));
            }
        }
    }
}
