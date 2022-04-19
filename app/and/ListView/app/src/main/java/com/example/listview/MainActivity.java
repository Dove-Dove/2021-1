package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvMoviePoster;
    ListviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMoviePoster =(ListView)findViewById(R.id.lvMoviePoster);
        adapter = new ListviewAdapter();

        lvMoviePoster.setAdapter(adapter);

        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"어무니","010-1111-1111");
        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"아부지","010-1111-1111");
        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"형","010-1111-1111");
        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"친구 1","010-1111-1111");
        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"친구 2","010-1111-1111");
        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"이모","010-1111-1111");
        adapter.additem(ContextCompat.getDrawable(this,R.drawable.they),"외할머니","010-1111-1111");

    }
}