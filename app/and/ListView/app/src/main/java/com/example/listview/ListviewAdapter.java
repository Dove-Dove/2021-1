package com.example.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter {

    ArrayList<ListViewItem> lsit = new ArrayList<ListViewItem>();
    @Override
    public int getCount() {
        return lsit.size();
    }

    @Override
    public Object getItem(int position) {
        return lsit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        Context context = parent.getContext();



        if (converView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            converView = inflater.inflate(R.layout.lsititem,parent,false);
        }

        ImageView icon= (ImageView)converView.findViewById(R.id.icon);
        TextView title=(TextView)converView.findViewById(R.id.title);
        TextView description=(TextView)converView.findViewById(R.id.description);

        ListViewItem item = (ListViewItem)lsit.get(position);
        icon.setImageDrawable(item.getIcon());
        title.setText(item.getTitle());
        description.setText(item.getDescriString());


        return converView;
    }

    public void additem(Drawable icon, String title, String description){
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDescriString(description);

        lsit.add(item);
    }
}
