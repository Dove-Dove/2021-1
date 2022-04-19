package com.example.listview;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    Drawable icon;
    String title;
    String descriString;

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriString() {
        return descriString;
    }

    public void setDescriString(String descriString) {
        this.descriString = descriString;
    }
}