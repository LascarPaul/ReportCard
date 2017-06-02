package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(reportCard);
    }

    ReportCard reportCard = new ReportCard(1, "Paul", "Paul", 8.5, 9.1, 5.3, 10);


}
