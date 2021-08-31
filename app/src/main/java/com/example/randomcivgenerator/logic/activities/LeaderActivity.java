package com.example.randomcivgenerator.logic.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.randomcivgenerator.Helper;
import com.example.randomcivgenerator.LeaderHandler;
import com.example.randomcivgenerator.R;

public class LeaderActivity extends AppCompatActivity {

    private String listview_array[];
    ListView leader_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);
        listview_array = LeaderHandler.getLeaderList().toArray(new String[0]);
        leader_list = findViewById(R.id.leader_listView);
        leader_list.setAdapter(new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1, listview_array));
        Helper.getListViewSize(leader_list);
    }
}