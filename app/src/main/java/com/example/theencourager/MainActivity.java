package com.example.theencourager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.theencourager.MESSAGE";
    public static String Instagram_Url = "www.instagram.com/ookie218";
    public static String Twitter_Url = "www.twitter.com/ookie218";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void getResponse(View view) {
        Intent intent = new Intent(this, Response.class);
        EditText need = (EditText) findViewById(R.id.yourNeed);
        String getNeed = need.getText().toString();

        //Finance options we recognize for comparison
        if (getNeed.equalsIgnoreCase("money") || getNeed.equalsIgnoreCase("bills") ||
                getNeed.equalsIgnoreCase("finances") || getNeed.equalsIgnoreCase("cash") ||
                getNeed.equalsIgnoreCase("tithing") || getNeed.equalsIgnoreCase("provision")) {
            getNeed = FinancialVerses.financialResponse();
        }

        //Healing options we recognize for comparison
        else if (getNeed.equalsIgnoreCase("healing") || getNeed.equalsIgnoreCase("healer") ||
                getNeed.equalsIgnoreCase("health") || getNeed.equalsIgnoreCase("sick") ||
                getNeed.equalsIgnoreCase("sickness") || getNeed.equalsIgnoreCase("doctor")) {
            getNeed = HealingVerses.healingResponse();
        }

        //Encouragement options we recognize for comparison
        else if (getNeed.equalsIgnoreCase("depression") || getNeed.equalsIgnoreCase("depressed") ||
                getNeed.equalsIgnoreCase("uplift") || getNeed.equalsIgnoreCase("uplifted") ||
                getNeed.equalsIgnoreCase("encouragement")) {
            getNeed = EncouragementVerses.encouragementResponse();
        }

        //Prayer options we recognize for comparison
        else if (getNeed.equalsIgnoreCase("pray") || getNeed.equalsIgnoreCase("prayer")) {
            getNeed = PrayerVerses.prayResponse();
        }

        //Wisdom options we recognize for comparison
        else if (getNeed.equalsIgnoreCase("wisdom") || getNeed.equalsIgnoreCase("wise") ||
                getNeed.equalsIgnoreCase("proverbs") || getNeed.equalsIgnoreCase("learning") ||
                getNeed.equalsIgnoreCase("learn")) {
            getNeed = WisdomVerses.wiseResponse();
        }

        //Love options we recognize for comparison
        else if (getNeed.equalsIgnoreCase("love") || getNeed.equalsIgnoreCase("lust") ||
                getNeed.equalsIgnoreCase("marriage") || getNeed.equalsIgnoreCase("engagement") ||
                getNeed.equalsIgnoreCase("sex")) {
            getNeed = LoveVerses.loveResponse();
        }

        //What if response isn't what I accounted for?
        //While "answer" is not equal to x AND not equal to y AND not equal to z...
        else  {
            getNeed = "Please forgive me, but I didn't understand your need...";
        }

        intent.putExtra(EXTRA_MESSAGE, getNeed);
        startActivity(intent);
    }


    public void sendEmail () {

    }


    public void openTwitter(View veiw) {
        Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(Twitter_Url));
        if (twitterIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(twitterIntent);
        }
    }

    public void openInstagram () {

    }

}
