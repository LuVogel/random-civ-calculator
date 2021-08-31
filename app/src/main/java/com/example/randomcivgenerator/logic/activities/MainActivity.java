package com.example.randomcivgenerator.logic.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.randomcivgenerator.LeaderHandler;
import com.example.randomcivgenerator.R;
import com.example.randomcivgenerator.logic.locale.LocaleHelper;

import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView textViewRand;
    TextView lang_selector, lang_textView;
    Button pickRandomButton, dlcButton, leaderButton;
    List<String> leaderPool;
    String randomPickedLeader;
    RelativeLayout show_language_layout;
    Context context;
    Resources resources;
    int lang_selected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewRand = findViewById(R.id.random_leader_solution_textView);
        pickRandomButton = findViewById(R.id.random_button);
        dlcButton = findViewById(R.id.dlc_button);
        leaderButton = findViewById(R.id.leader_button);
        lang_selector= findViewById(R.id.lang_textView);
        show_language_layout = findViewById(R.id.relative_language_layout);
        lang_textView = findViewById(R.id.random_leader_solution_textView);

        handleLanguage(pickRandomButton, dlcButton, leaderButton);

        show_language_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] language = {"ENGLISH", "DEUTSCH"};
                final int checkItem;
                Log.d("Clicked", "Clicked");
                final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MainActivity.this);
                dialogBuilder.setTitle("Select a Language")
                        .setSingleChoiceItems(language, lang_selected, new DialogInterface.OnClickListener() {
                            @SuppressLint("ResourceType")
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                lang_textView.setText(language[which]);
                                if (language[which].equals("ENGLISH")) {
                                    context = LocaleHelper.setLocale(MainActivity.this, "en");
                                    resources = context.getResources();
                                    lang_selected = 0;
                                }
                                if (language[which].equals("DEUTSCH")) {
                                    context = LocaleHelper.setLocale(MainActivity.this, "de");
                                    resources = context.getResources();
                                    lang_selected = 1;
                                }
                            }
                        }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @SuppressLint("ResourceType")
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        if (lang_selected == 1) {
                            lang_selector.setText("DEUTSCH");
                        } else {
                            lang_selector.setText("ENGLISH");
                        }
                        setTitle(resources.getString(R.string.app_name));
                        pickRandomButton.setText(resources.getString(R.string.pick_random));
                        dlcButton.setText(resources.getString(R.string.dlc_s));
                        leaderButton.setText(resources.getString(R.string.leaders));
                    }
                });
                dialogBuilder.create().show();
            }
        });

        pickRandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaderPool = LeaderHandler.getLeaderList();
                if (leaderPool == null || leaderPool.size() == 0) {
                    textViewRand.setText("No Leaders in Pool, Please Chose at least one Leader");
                } else {
                    Random random = new Random();
                    randomPickedLeader = leaderPool.get(random.nextInt(leaderPool.size()));
                    textViewRand.setText(randomPickedLeader);
                }


            }
        });

    }




    public void dlcButton(View view) {
        Intent intent = new Intent(this, DlcActivity.class);
        intent.putExtra("language_key", lang_selector.getText());
        startActivity(intent);
    }






    @SuppressLint("ResourceType")
    public void handleLanguage(Button randomButton, Button dlcButton, Button leaderButton) {
        if (LocaleHelper.getLanguage(MainActivity.this).equalsIgnoreCase("en")) {
            context = LocaleHelper.setLocale(MainActivity.this, "en");
            resources = context.getResources();
            lang_textView.setText("ENGLISH");
            randomButton.setText(resources.getString(R.id.random_button));
            dlcButton.setText(resources.getString(R.id.dlc_button));
            leaderButton.setText(resources.getString(R.id.leader_button));
            setTitle(resources.getString(R.string.app_name));
            lang_selected = 0;
        }
        else if (LocaleHelper.getLanguage(MainActivity.this).equalsIgnoreCase("de")) {
            context = LocaleHelper.setLocale(MainActivity.this, "de");
            resources = context.getResources();
            lang_textView.setText("DEUTSCH");
            randomButton.setText(resources.getString(R.id.random_button));
            dlcButton.setText(resources.getString(R.id.dlc_button));
            leaderButton.setText(resources.getString(R.id.leader_button));
            setTitle(resources.getString(R.string.app_name));
            lang_selected = 1;
        }
    }




    public void random_button(View view) {
        //TODO: open another activity for each leader (with picture)
    }
}