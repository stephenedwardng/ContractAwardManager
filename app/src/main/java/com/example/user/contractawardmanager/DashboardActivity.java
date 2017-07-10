package com.example.user.contractawardmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    ProgressBar currentSpendBar;
    TextView currentSpend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        AndroidBuyer buyer = new AndroidBuyer("CodeClan", "SC009857568", 250000, "2018-04-05");
        Report report = new Report(buyer);

        int spent = report.percentageBudgetSpent();
        currentSpendBar = (ProgressBar) findViewById(R.id.currentSpendBar);
        currentSpendBar.setProgress(spent);

        currentSpend = (TextView) findViewById(R.id.currentSpend);
        currentSpend.setText("£20000 spent of £250000 budget");
    }
}
