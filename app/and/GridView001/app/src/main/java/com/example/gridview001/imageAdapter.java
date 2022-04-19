package com.example.gridview001;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {
    private Context context;
    int[] imageId={R.drawable.movie1, R.drawable.movie2, R.drawable.movie3,R.drawable.movie4,
    R.drawable.movie1, R.drawable.movie2, R.drawable.movie3,R.drawable.movie4,
    R.drawable.movie1, R.drawable.movie2, R.drawable.movie3,R.drawable.movie4,
    R.drawable.movie1, R.drawable.movie2, R.drawable.movie3,R.drawable.movie4,
    R.drawable.movie1, R.drawable.movie2, R.drawable.movie3,R.drawable.movie4,
            R.drawable.movie1, R.drawable.movie2, R.drawable.movie3,R.drawable.movie4};

    imageAdapter(Context c){
        context = c;

    }

    public  int getCount(){
        return imageId.length;
    }


    public Object getItem(int i) {
        return null;
    }


    public long getItemId(int i) {
        return 0;
    }


    public View getView(int position, View converView, ViewGroup parnent) {
        ImageView image;
        if(converView==null){
            image = new ImageView(context);
        }
        else{
            image=(ImageView)converView;
        }
        image.setImageResource(imageId[position]);
        return image;
    }
}
