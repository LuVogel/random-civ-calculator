package com.example.randomcivgenerator.logic.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
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
    ImageButton infoBox;

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

        ImageButton confirmLeader = findViewById(R.id.confirmLeader);
        // create Adapter with current LeaderList (incl. confirm button)
        LeaderViewAdapter leaderArrayAdapter = new LeaderViewAdapter(this, leaderList);
        // find ID of leaderView
        ListView leaderListView = findViewById(R.id.leaderView);
        //show List
        leaderListView.setAdapter(leaderArrayAdapter);

        confirmLeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeaderActivity.super.onBackPressed();
            }
        });


    }









}