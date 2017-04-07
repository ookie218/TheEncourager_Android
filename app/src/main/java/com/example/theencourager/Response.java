package com.example.theencourager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Response extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        Intent intent = getIntent();
        String yourNeed = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView responseView = (TextView) findViewById(R.id.responseHolder);
        responseView.setTextSize(25);
        responseView.setText(yourNeed);

//        Un-needed since I'm referencing a view already created
//        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_response);
//        layout.addView(responseView);



    }

public void sameNeed(View view) {

    finish();


    String getNeed = getIntent().getStringExtra("getNeed");

    //Finance options we recognize for comparison
    if (getNeed.equalsIgnoreCase("money") || getNeed.equalsIgnoreCase("money ")
            || getNeed.equalsIgnoreCase("bills") || getNeed.equalsIgnoreCase("bills ") ||
            getNeed.equalsIgnoreCase("finances") || getNeed.equalsIgnoreCase("finances ")
            || getNeed.equalsIgnoreCase("cash") || getNeed.equalsIgnoreCase("cash ") ||
            getNeed.equalsIgnoreCase("tithing") || getNeed.equalsIgnoreCase("tithing ") ||
            getNeed.equalsIgnoreCase("provision") || getNeed.equalsIgnoreCase("provision ")) {
        getNeed = FinancialVerses.financialResponse();
    }

    //Healing options we recognize for comparison
    else if (getNeed.equalsIgnoreCase("healing") || getNeed.equalsIgnoreCase("healing ")
            || getNeed.equalsIgnoreCase("healer") || getNeed.equalsIgnoreCase("healer ")
            || getNeed.equalsIgnoreCase("health") || getNeed.equalsIgnoreCase("health ")
            || getNeed.equalsIgnoreCase("sick") || getNeed.equalsIgnoreCase("sick ")
            || getNeed.equalsIgnoreCase("sickness") || getNeed.equalsIgnoreCase("sickness ")
            || getNeed.equalsIgnoreCase("doctor") || getNeed.equalsIgnoreCase("doctor ")) {
        getNeed = HealingVerses.healingResponse();
    }

    //Encouragement options we recognize for comparison
    else if (getNeed.equalsIgnoreCase("depression") || getNeed.equalsIgnoreCase("depression ")
            || getNeed.equalsIgnoreCase("depressed") || getNeed.equalsIgnoreCase("depressed ")
            || getNeed.equalsIgnoreCase("uplift") || getNeed.equalsIgnoreCase("uplift ")
            || getNeed.equalsIgnoreCase("uplifted") || getNeed.equalsIgnoreCase("uplifted ")
            || getNeed.equalsIgnoreCase("encouragement") || getNeed.equalsIgnoreCase("encouragement ")) {
        getNeed = EncouragementVerses.encouragementResponse();
    }

    //Prayer options we recognize for comparison
    else if (getNeed.equalsIgnoreCase("pray") || getNeed.equalsIgnoreCase("pray ")
            || getNeed.equalsIgnoreCase("prayer") || getNeed.equalsIgnoreCase("prayer ")) {
        getNeed = PrayerVerses.prayResponse();
    }

    //Wisdom options we recognize for comparison
    else if (getNeed.equalsIgnoreCase("wisdom") || getNeed.equalsIgnoreCase("wisdom ")
            || getNeed.equalsIgnoreCase("wise") || getNeed.equalsIgnoreCase("wise ")
            || getNeed.equalsIgnoreCase("proverbs") || getNeed.equalsIgnoreCase("proverbs ")
            || getNeed.equalsIgnoreCase("learning") || getNeed.equalsIgnoreCase("learning ")
            || getNeed.equalsIgnoreCase("learn") || getNeed.equalsIgnoreCase("learn ")) {
        getNeed = WisdomVerses.wiseResponse();
    }

    //Love options we recognize for comparison
    else if (getNeed.equalsIgnoreCase("love") || getNeed.equalsIgnoreCase("love ")
            || getNeed.equalsIgnoreCase("lust") || getNeed.equalsIgnoreCase("lust ")
            || getNeed.equalsIgnoreCase("marriage") || getNeed.equalsIgnoreCase("marriage ")
            || getNeed.equalsIgnoreCase("engagement") || getNeed.equalsIgnoreCase("engagement ")
            || getNeed.equalsIgnoreCase("sex") || getNeed.equalsIgnoreCase("sex ")) {
        getNeed = LoveVerses.loveResponse();
    }

    //What if response isn't what I accounted for?
    //While "answer" is not equal to x AND not equal to y AND not equal to z...
    else  {
        getNeed = "Please forgive me, but I didn't understand your need...";
    }

//Need to padd in getNeed to reload the activity

}
    public void backHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
