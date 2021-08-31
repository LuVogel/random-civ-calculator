package com.example.randomcivgenerator;

import android.content.Context;
import android.content.res.Resources;

import com.example.randomcivgenerator.logic.locale.LocaleHelper;

import java.util.List;

public class LeaderHandler {

    public static List<String> leaderList;

    Resources resources;


    public LeaderHandler(List<String> leaderList, Resources resources) {
        this.leaderList = leaderList;
        this.resources = resources;


    }

    public void addVanilla() {
        leaderList.add(resources.getString(R.string.cath_de_med_bq));
        leaderList.add(resources.getString(R.string.cath_de_med_mag));
        leaderList.add(resources.getString(R.string.cleopatra));
        leaderList.add(resources.getString(R.string.fred_barbar));
        leaderList.add(resources.getString(R.string.gandhi));
        leaderList.add(resources.getString(R.string.gilgamesh));
        leaderList.add(resources.getString(R.string.gorgo));
        leaderList.add(resources.getString(R.string.gilgamesh));
        leaderList.add(resources.getString(R.string.hojo_toki));
        leaderList.add(resources.getString(R.string.montezuma));
        leaderList.add(resources.getString(R.string.mvemba));
        leaderList.add(resources.getString(R.string.pedro));
        leaderList.add(resources.getString(R.string.pericles));
        leaderList.add(resources.getString(R.string.peter));
        leaderList.add(resources.getString(R.string.philipp_ii));
        leaderList.add(resources.getString(R.string.qinshi));
        leaderList.add(resources.getString(R.string.saladin));
        leaderList.add(resources.getString(R.string.teddy_roose_bm));
        leaderList.add(resources.getString(R.string.teddy_roose_rr));
        leaderList.add(resources.getString(R.string.tomyris));
        leaderList.add(resources.getString(R.string.trajan));
        leaderList.add(resources.getString(R.string.victoria));
    }
    public void addPersiaAndMacedon() {
        leaderList.add(resources.getString(R.string.alexander));
        leaderList.add(resources.getString(R.string.cyrus));
    }
    public void addNubia() {
        leaderList.add(resources.getString(R.string.amanitore));
    }

    public void addByzantiumAndGaul() {
        leaderList.add(resources.getString(R.string.basil_ii));
        leaderList.add(resources.getString(R.string.ambiorix));
    }

    public void addVietnamAndKublai() {
        leaderList.add(resources.getString(R.string.batrieu));
        leaderList.add(resources.getString(R.string.kublai_mong));
        leaderList.add(resources.getString(R.string.kublai_chin));
    }
    public void addKhmerAndIndonesia() {
        leaderList.add(resources.getString(R.string.jayavarman));
        leaderList.add(resources.getString(R.string.gitarja));
    }

    public void addBabylon() {
        leaderList.add(resources.getString(R.string.hammurabi));
    }

    public void addPoland() {
        leaderList.add(resources.getString(R.string.jadigwa));
    }

    public void addPortugal() {
        leaderList.add(resources.getString(R.string.joao_iii));
    }

    public void addAustralia() {
        leaderList.add(resources.getString(R.string.john_curtin));
    }

    public void addMayaAndColumbia() {
        leaderList.add(resources.getString(R.string.simon_bolivar));
        leaderList.add(resources.getString(R.string.ladysixsky));
    }

    public void addEthiopia() {
        leaderList.add(resources.getString(R.string.menelik));
    }

    public void addRiseAndFall() {
        leaderList.add(resources.getString(R.string.chandragupta));
        leaderList.add(resources.getString(R.string.genghis_khan));
        leaderList.add(resources.getString(R.string.lautaro));
        leaderList.add(resources.getString(R.string.poundmaker));
        leaderList.add(resources.getString(R.string.robert_the_bruce));
        leaderList.add(resources.getString(R.string.seondeok));
        leaderList.add(resources.getString(R.string.shaka));
        leaderList.add(resources.getString(R.string.tamar));
        leaderList.add(resources.getString(R.string.wilhemina));
    }

    public void addGatherAndStorm() {
        leaderList.add(resources.getString(R.string.dido));
        leaderList.add(resources.getString(R.string.eleanor_french));
        leaderList.add(resources.getString(R.string.eleanor_english));
        leaderList.add(resources.getString(R.string.kristina));
        leaderList.add(resources.getString(R.string.kupe));
        leaderList.add(resources.getString(R.string.mansa_musa));
        leaderList.add(resources.getString(R.string.matthias_corvinus));
        leaderList.add(resources.getString(R.string.pachacuti));
        leaderList.add(resources.getString(R.string.suleiman));
        leaderList.add(resources.getString(R.string.wilfrid_laurier));
    }
    public static List<String> getLeaderList() {
        return leaderList;
    }


}
