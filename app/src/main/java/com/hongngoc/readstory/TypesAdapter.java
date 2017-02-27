package com.hongngoc.readstory;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sida on 2/21/2017.
 */

public class TypesAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Type> types;

    public TypesAdapter (Context context){
        inflater = LayoutInflater.from(context);

        types = new ArrayList<>();
        types.add(new Type(1, "Truyện cổ tích"));
        types.add(new Type(2, "Truyện ngụ ngôn"));
        types.add(new Type(3, "Truyện cười"));
        types.add(new Type(4, "Truyện khoa học"));
        types.add(new Type(5, "Truyện dân gian"));
    }

    @Override
    public int getCount() { return types.size(); }

    @Override
    public Object getItem(int position) { return types.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_type, parent, false);
        TextView txtName = (TextView)convertView.findViewById(R.id.txt_name);
        txtName.setText(types.get(position).getName());

        return convertView;
    }
}
