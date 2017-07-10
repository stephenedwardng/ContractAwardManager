package com.example.user.contractawardmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    ProgressBar currentSpendBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        currentSpendBar = (ProgressBar) findViewById(R.id.currentSpendBar);
        currentSpendBar.setProgress(75);
    }
}
