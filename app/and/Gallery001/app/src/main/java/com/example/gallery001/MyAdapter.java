package com.example.gallery001;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyAdapter extends BaseAdapter {
    private  Context context;
    private int xmlId;
    int[] imgid;
    LayoutInflater inflater;

    MyAdapter(Context c,int latout, int[] imgid){
        this.context =c;
        this.xmlId = latout;
        this.imgid = imgid;

        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return imgid.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View converView, ViewGroup perent) {
        ImageView view;
        if(converView == null){
            converView = inflater.inflate(xmlId, null);
        }

        view =(ImageView)converView.findViewById(R.id.imgFlag);
        view.setImageResource(imgid[position]);
        return converView;
    }
}
