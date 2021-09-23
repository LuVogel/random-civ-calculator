package com.example.randomcivgenerator.logic.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.randomcivgenerator.R;
import com.example.randomcivgenerator.leaderlist.LeaderView;

public class InfoActivity extends AppCompatActivity {
    TextView infoName, infoBonus, infoAbility, infoUnit, infoBuilding, infoSecondUnique;
    ImageButton infoReturn;
    ImageView info_leader_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        LeaderView leader = (LeaderView) intent.getSerializableExtra("leader_info");
        infoName = findViewById(R.id.infoName);
        infoBonus = findViewById(R.id.infoBonus);
        infoAbility = findViewById(R.id.infoAbility);
        infoUnit = findViewById(R.id.infoUnit);
        infoBuilding = findViewById(R.id.building);
        infoSecondUnique = findViewById(R.id.infoSecondUnique);
        infoReturn = findViewById(R.id.infoReturn);
        info_leader_image = findViewById(R.id.info_leader_image);
        int imageId = leader.getImageId();
        Drawable drawable = getResources().getDrawable(imageId);
        info_leader_image.setImageDrawable(drawable);

        infoName.setText(leader.getLeaderName());
        infoBonus.setText(leader.getInfoBonus());
        infoAbility.setText(leader.getInfoAbilities());
        infoUnit.setText(leader.getInfoUnit1());
        infoBuilding.setText(leader.getInfoBuilding1());
        int uniqueExtra = leader.getCheckExtraUnique();
        if (uniqueExtra == 1) {
            infoSecondUnique.setText(leader.getInfoUnit2());
        } else if (uniqueExtra == 2) {
            infoSecondUnique.setText(leader.getInfoBuilding2());
        } else if (uniqueExtra == 0) {
            infoSecondUnique.setVisibility(View.INVISIBLE);
        }

        infoReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoActivity.super.onBackPressed();


            }
        });




    }
}