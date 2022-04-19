package com.example.implictitent01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCall,btnWeb, btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall =(Button) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:01045613071");
                Intent intentCall = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intentCall);
            }
        });

        btnWeb =(Button) findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://naver.com");
                Intent intentCall = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intentCall);
            }
        });

        btnMap =(Button) findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:35.16577141680619, 129.07177051250582");
                Intent intentCall = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intentCall);
            }
        });
    }
}