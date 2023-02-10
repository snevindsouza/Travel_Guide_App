package com.snevinleoneel.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class VeniceActivity extends AppCompatActivity {
    //Button  venice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venice);

        /*
        venice.findViewById(R.id.button);
        venice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.in/Tourism-g187870-Venice_Veneto-Vacations.html"));
                startActivity(browserIntent);
            }
        });
        */




    }


}
