package com.example.randomcivgenerator.logic.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.randomcivgenerator.LeaderHandler;
import com.example.randomcivgenerator.R;
import com.example.randomcivgenerator.leaderlist.LeaderView;
import com.example.randomcivgenerator.logic.locale.LocaleHelper;

import java.util.ArrayList;
import java.util.List;


/**
 * Activity to choose DLC's
 */
public class DlcActivity extends AppCompatActivity {

    // all CheckBoxes in our Activity
    CheckBox vanilla, riseAndFall, gatherAndStorm, newFrontierPass, persiaAndMacedon, nubia,
            byzantiumAndGaul, vietnamAndKublai, khmerAndIndonesia, babylon, poland, portugal, australia,
            mayaAndColumbia, ethiopia, setAll;
    // Button to confirm choices
    Button confirmButton;

    // contains all LeaderViews (name, id of image)
    public ArrayList<LeaderView> leaderList = new ArrayList<LeaderView>();
    // handles ArrayList (depending on checkBoxes)
    public LeaderHandler leaderHandler;
    Context context;
    Resources resources;
    String selected_language;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        // intent is given by MainActivity (language-key)
        selected_language = intent.getStringExtra("language_key");
        setContentView(R.layout.activity_choose_dlc);

        // find checkBoxes with ID
        setAll = findViewById(R.id.checkBoxSetAll);
        vanilla = findViewById(R.id.checkBoxVanilla);
        riseAndFall = findViewById(R.id.checkBoxRiseAndFall);
        gatherAndStorm = findViewById(R.id.checkBoxGatherAndStorm);
        newFrontierPass = findViewById(R.id.checkBoxNewFrontierPass);
        persiaAndMacedon = findViewById(R.id.checkBoxPersiaAndMacedon);
        nubia = findViewById(R.id.checkBoxNubia);
        byzantiumAndGaul = findViewById(R.id.checkBoxByzantiumAndGaul);
        khmerAndIndonesia = findViewById(R.id.checkBoxKhmerAndIndonesia);
        babylon = findViewById(R.id.checkBoxBabylon);
        poland = findViewById(R.id.checkBoxPoland);
        portugal = findViewById(R.id.checkBoxPortugal);
        australia = findViewById(R.id.checkBoxAustralia);
        mayaAndColumbia = findViewById(R.id.checkBoxMayaAndColumbia);
        ethiopia = findViewById(R.id.checkBoxEthiopia);
        vietnamAndKublai = findViewById(R.id.checkBoxVietnamAndKublai);

        // find confirmButton with ID
        confirmButton = findViewById(R.id.confirmDlc);

        // change Language of DlcActivity if needed
        if (selected_language.equals("ENGLISH")) {
            context = LocaleHelper.setLocale(DlcActivity.this, "en");
            resources = context.getResources();
        } else if (selected_language.equals("DEUTSCH")) {
            context = LocaleHelper.setLocale(DlcActivity.this, "de");
            resources = context.getResources();
        }
        // create a new LeaderHandler (adds leaders to list)
        leaderHandler = new LeaderHandler(leaderList, resources);
        // set Text on Buttons depending on chosen language
        setLanguageOnButtons(resources);

        // if SetAll-Checkbox is pressed
        setAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set All to True or False (depending on checked or not)
                if (setAll.isChecked()) {
                    setAllBoxesToTrue();
                } else {
                    setAllBoxesToFalse();
                }
            }
        });

        // set all dlc's from frontier pass to true/false
        newFrontierPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newFrontierPass.isChecked()) {
                    setAllFrontierBoxesToTrue();
                } else {
                    setAllFrontierBoxesToFalse();
                }
            }
        });

        // check if a Box is Clicked and close activity
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkForBoxes();
                DlcActivity.super.onBackPressed();
            }
        });
    }


    /**
     * set Text on Boxes depending on language
     * @param resources contains current language
     */
    private void setLanguageOnButtons(Resources resources) {
        vanilla.setText(resources.getString(R.string.vanilla));
        riseAndFall.setText(resources.getString(R.string.rise_and_fall));
        gatherAndStorm.setText(resources.getString(R.string.gather_and_storm));
        newFrontierPass.setText(resources.getString(R.string.new_frontier_pass));
        persiaAndMacedon.setText(resources.getString(R.string.persia_and_macedon));
        nubia.setText(resources.getString(R.string.nubia));
        byzantiumAndGaul.setText(resources.getString(R.string.byzantium_and_gaul));
        vietnamAndKublai.setText(resources.getString(R.string.vietnam_and_kublai));
        khmerAndIndonesia.setText(resources.getString(R.string.khmer_and_indonesia));
        babylon.setText(resources.getString(R.string.babylon));
        poland.setText(resources.getString(R.string.poland));
        portugal.setText(resources.getString(R.string.portugal));
        australia.setText(resources.getString(R.string.australia));
        mayaAndColumbia.setText(resources.getString(R.string.maya_and_columbia));
        ethiopia.setText(resources.getString(R.string.ethiopia));
        setAll.setText(resources.getString(R.string.set_all));
        confirmButton.setText(resources.getString(R.string.confirm));
    }


    /**
     * check if a Box is clicked
     * if Box is clicked, add leader names and images to ArrayList
     */
    public void checkForBoxes() {
        if (vanilla.isChecked()) {
            leaderHandler.addVanilla();
        }
        if (persiaAndMacedon.isChecked()) {
            leaderHandler.addPersiaAndMacedon();
        }
        if (nubia.isChecked()) {
            leaderHandler.addNubia();
        }
        if (byzantiumAndGaul.isChecked()) {
            leaderHandler.addByzantiumAndGaul();
        }
        if (vietnamAndKublai.isChecked()) {
            leaderHandler.addVietnamAndKublai();
        }
        if (khmerAndIndonesia.isChecked()) {
            leaderHandler.addKhmerAndIndonesia();
        }
        if (babylon.isChecked()) {
            leaderHandler.addBabylon();
        }
        if (poland.isChecked()) {
            leaderHandler.addPoland();
        }
        if (portugal.isChecked()) {
            leaderHandler.addPortugal();
        }
        if (australia.isChecked()) {
            leaderHandler.addAustralia();
        }
        if (mayaAndColumbia.isChecked()) {
            leaderHandler.addMayaAndColumbia();
        }
        if (ethiopia.isChecked()) {
            leaderHandler.addEthiopia();
        }
        if (riseAndFall.isChecked()) {
            leaderHandler.addRiseAndFall();
        }
        if (gatherAndStorm.isChecked()) {
            leaderHandler.addGatherAndStorm();
        }
    }


    /**
     * sets all boxes from frontier pass to true
     */
    public void setAllFrontierBoxesToTrue() {
        mayaAndColumbia.setChecked(true);
        ethiopia.setChecked(true);
        byzantiumAndGaul.setChecked(true);
        babylon.setChecked(true);
        vietnamAndKublai.setChecked(true);
        portugal.setChecked(true);
    }

    /**
     * set all boxes from frontier pass to false
     */
    public void setAllFrontierBoxesToFalse() {
        mayaAndColumbia.setChecked(false);
        ethiopia.setChecked(false);
        byzantiumAndGaul.setChecked(false);
        babylon.setChecked(false);
        vietnamAndKublai.setChecked(false);
        portugal.setChecked(false);
    }


    /**
     * set all boxes to true
     */
    public void setAllBoxesToTrue() {
        vanilla.setChecked(true);
        riseAndFall.setChecked(true);
        gatherAndStorm.setChecked(true);
        newFrontierPass.setChecked(true);
        persiaAndMacedon.setChecked(true);
        nubia.setChecked(true);
        byzantiumAndGaul.setChecked(true);
        khmerAndIndonesia.setChecked(true);
        babylon.setChecked(true);
        poland.setChecked(true);
        australia.setChecked(true);
        mayaAndColumbia.setChecked(true);
        ethiopia.setChecked(true);
        vietnamAndKublai.setChecked(true);
        portugal.setChecked(true);
    }

    /**
     * set all boxes to false
     */
    public void setAllBoxesToFalse() {
        vanilla.setChecked(false);
        riseAndFall.setChecked(false);
        gatherAndStorm.setChecked(false);
        newFrontierPass.setChecked(false);
        persiaAndMacedon.setChecked(false);
        nubia.setChecked(false);
        byzantiumAndGaul.setChecked(false);
        khmerAndIndonesia.setChecked(false);
        babylon.setChecked(false);
        poland.setChecked(false);
        australia.setChecked(false);
        mayaAndColumbia.setChecked(false);
        ethiopia.setChecked(false);
        vietnamAndKublai.setChecked(false);
        portugal.setChecked(false);
    }
}