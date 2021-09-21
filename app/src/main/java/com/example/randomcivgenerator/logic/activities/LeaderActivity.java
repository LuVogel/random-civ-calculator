package com.example.randomcivgenerator.logic.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.randomcivgenerator.LeaderHandler;
import com.example.randomcivgenerator.R;
import com.example.randomcivgenerator.leaderlist.LeaderView;
import com.example.randomcivgenerator.leaderlist.LeaderViewAdapter;

import java.util.ArrayList;

/**
 * Activity where we can chose different Leaders
 */
public class LeaderActivity extends AppCompatActivity {

    // ArrayList with leader names and ID's of images
    public ArrayList<LeaderView> leaderList;
    // confirm choices with this box
    CheckBox confirmLeaderBox;
    private View view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set content to current activity
        setContentView(R.layout.activity_leader);
        // get current ArrayList from LeaderHandler
        leaderList = LeaderHandler.getLeaderList();
        // get Resources for images
        //Resources res = getResources();
        // add confirm button to ArrayList
        //leaderList.add(new LeaderView(R.drawable.confirm_button_draw, res.getString(R.string.confirm)));


        // create Adapter with current LeaderList (incl. confirm button)
        LeaderViewAdapter leaderArrayAdapter = new LeaderViewAdapter(this, leaderList);
        // find ID of leaderView
        ListView leaderListView = findViewById(R.id.leaderView);
        //show List
        leaderListView.setAdapter(leaderArrayAdapter);

        confirmLeaderBox = findViewById(R.id.leaderView_checkbox);

    }

//TODO: add information for Leader to intent (String)
    public void infoButton(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
//TODO: parcelable interface for sending object
     //  intent.setDataAndType(leaderView, "leader_name");
        System.out.println(intent.getStringExtra("leader_name"));

    }
}