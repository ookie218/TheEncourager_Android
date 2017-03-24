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


    public void backHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
