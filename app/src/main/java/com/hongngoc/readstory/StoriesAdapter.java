package com.hongngoc.readstory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sida on 2/21/2017.
 */

public class StoriesAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Story> stories;

    public StoriesAdapter(Context context, ArrayList<Story> stories){
        inflater = LayoutInflater.from(context);
        this.stories = stories;
    }

    @Override
    public int getCount() { return stories.size(); }

    @Override
    public Object getItem(int position) { return stories.get(position) ; }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_story, parent, false);
        TextView txtName = (TextView) convertView.findViewById(R.id.txt_name);
        TextView txtAuthor = (TextView) convertView.findViewById(R.id.txt_author);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.icon);
        txtName.setText(stories.get(position).getName());
        txtAuthor.setText(stories.get(position).getAuthor());
        imageView.setImageResource(stories.get(position).getImgId());
        return convertView;
    }
}
