package com.example.randomcivgenerator;

import com.example.randomcivgenerator.leaderlist.LeaderView;

import java.io.Serializable;

public class IntentPackage implements Serializable {

    LeaderView leaderView;
    String selected_language;

    public IntentPackage(LeaderView leaderView, String selected_language) {
        this.leaderView = leaderView;
        this.selected_language = selected_language;
    }

    public LeaderView getLeaderView() {
        return leaderView;
    }

    public String getSelected_language() {
        return selected_language;
    }
}
