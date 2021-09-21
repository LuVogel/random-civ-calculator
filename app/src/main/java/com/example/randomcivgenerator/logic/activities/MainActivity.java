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
import com.example.randomcivgenerator.leaderlist.LeaderView;
import com.example.randomcivgenerator.logic.locale.LocaleHelper;

import java.util.ArrayList;
import java.util.Random;

/**
 * MainActivity
 */
public class MainActivity extends AppCompatActivity {

    //TextView for RandomLeader TODO: delete if RandomActivity is created
    TextView textViewRand;
    // textview for language selection
    TextView lang_selector, lang_textView;
    // different buttons
    Button pickRandomButton, dlcButton, leaderButton;
    // current LeaderList
    ArrayList<LeaderView> leaderPool;
    // solution
    String randomPickedLeader;

    RelativeLayout show_language_layout;
    Context context;
    Resources resources;
    int lang_selected;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get ID's from XML
        textViewRand = findViewById(R.id.random_leader_solution_textView);
        pickRandomButton = findViewById(R.id.random_button);
        dlcButton = findViewById(R.id.dlc_button);
        leaderButton = findViewById(R.id.leader_button);
        lang_selector= findViewById(R.id.lang_textView);
        show_language_layout = findViewById(R.id.relative_language_layout);
        lang_textView = findViewById(R.id.random_leader_solution_textView);

        //set language
        if (LocaleHelper.getLanguage(MainActivity.this).equalsIgnoreCase("de")) {
            //set to german
            context = LocaleHelper.setLocale(MainActivity.this, "de");
            resources = context.getResources();
            lang_textView.setText("DEUTSCH");
            pickRandomButton.setText(resources.getString(R.string.pick_random));
            dlcButton.setText(resources.getString(R.string.dlc_s));
            leaderButton.setText(resources.getString(R.string.leaders));
            setTitle(resources.getString(R.string.app_name));
            setTitle(resources.getString(R.string.app_name));
            lang_selected = 1;
        }
        else if ((LocaleHelper.getLanguage(MainActivity.this).equalsIgnoreCase("en"))) {
            //set to english or default
            context = LocaleHelper.setLocale(MainActivity.this, "en");
            resources = context.getResources();
            lang_textView.setText("ENGLISH");
            pickRandomButton.setText(resources.getString(R.string.pick_random));
            dlcButton.setText(resources.getString(R.string.dlc_s));
            leaderButton.setText(resources.getString(R.string.leaders));
            setTitle(resources.getString(R.string.app_name));
            lang_selected = 0;
        }

        // changing language
        show_language_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] language = {"ENGLISH", "DEUTSCH"};
                final int checkItem;
                Log.d("Clicked", "Clicked");
                final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MainActivity.this);
                //new dialog for selecting language
                dialogBuilder.setTitle("Select a Language")
                        .setSingleChoiceItems(language, lang_selected, new DialogInterface.OnClickListener() {
                            @SuppressLint("ResourceType")
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //language was chosen
                                lang_textView.setText(language[which]);
                                if (language[which].equals("ENGLISH")) {
                                    //set to english
                                    context = LocaleHelper.setLocale(MainActivity.this, "en");
                                    resources = context.getResources();
                                    lang_selected = 0;

                                } else if (language[which].equals("DEUTSCH")) {
                                    //set to german
                                    context = LocaleHelper.setLocale(MainActivity.this, "de");
                                    resources = context.getResources();
                                    lang_selected = 1;
                                }
                            }
                        }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @SuppressLint("ResourceType")
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //change language of buttons
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
        //TODO: not click Listener --> own activity
        pickRandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaderPool = LeaderHandler.getLeaderList();
                if (leaderPool == null || leaderPool.size() == 0) {
                    textViewRand.setText(R.string.no_leader_in_pool);
                } else {
                    Random random = new Random();
                    randomPickedLeader = leaderPool.get(random.nextInt(leaderPool.size())).getLeaderName();
                    textViewRand.setText(randomPickedLeader);
                }


            }
        });

    }


    /**
     * starts DLC Activity
     * sends Language Key to Dlc Activity
     * @param view
     */
    public void dlcButton(View view) {
        Intent intent = new Intent(this, DlcActivity.class);
        intent.putExtra("language_key", lang_selector.getText());
        startActivity(intent);
    }


    /**
     *
     * checks if leaderList is empty (if empty, nothing happens)
     * if not empty, starting Leader Activity
     * @param view
     */
    public void leaderButton(View view) {
        Intent intent = new Intent(this, LeaderActivity.class);
        if (LeaderHandler.getLeaderList() == null || LeaderHandler.getLeaderList().size() == 0) {
            textViewRand.setText(R.string.no_leader_in_pool);
        } else {
            startActivity(intent);
        }
    }





    public void random_button(View view) {
        //TODO: open another activity for each leader (with picture)
    }
}