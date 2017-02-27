package com.hongngoc.readstory;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Hong Ngoc on 2/21/2017.
 */

public class TopicActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private ListView listStories;
    private StoriesManager storiesManager;
    private StoriesAdapter storiesAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_topic);
        initializeComponents();
    }

    private void initializeComponents(){
        listStories = (ListView)findViewById(R.id.liv_story);
        listStories.setOnItemClickListener(this);
        storiesManager = new StoriesManager();
        storiesAdapter = new StoriesAdapter(this, storiesManager.getStories());
        listStories.setAdapter(storiesAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this, ContentActivity.class);
        startActivity(i);
    }
}
