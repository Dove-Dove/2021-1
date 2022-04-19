package com.example.gallery001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Gallery gallery;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imgid = {R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.
                poland,R.drawable.saudi_arabia,R.drawable.korea};
        final ImageView mainimg=(ImageView) findViewById(R.id.mainimg);
        gallery = (Gallery) findViewById(R.id.galFlag);
        myAdapter = new MyAdapter(getApplicationContext(),R.layout.row, imgid);


        gallery.setAdapter(myAdapter);

        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            mainimg.setImageResource(imgid[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}