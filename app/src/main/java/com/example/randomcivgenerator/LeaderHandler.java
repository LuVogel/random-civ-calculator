package com.example.randomcivgenerator;

import java.util.List;

public class LeaderHandler {

    public static List<String> leaderList;

    public LeaderHandler(List<String> leaderList) {
        this.leaderList = leaderList;
    }

    public void addVanilla() {
        leaderList.add("cath_de_med_bq");
        leaderList.add("Catherine De Medici (Magnificence)");
        leaderList.add("Cleopatra");
        leaderList.add("Frederick Barbarossa");
        leaderList.add("Gandhi");
        leaderList.add("Gilgamesh");
        leaderList.add("Gorgo");
        leaderList.add("Harald Hardrada");
        leaderList.add("Hojo Tokimune");
        leaderList.add("Montezuma");
        leaderList.add("Mvemba A Nzinga");
        leaderList.add("Pedro II.");
        leaderList.add("Pericles");
        leaderList.add("Peter");
        leaderList.add("Philipp II.");
        leaderList.add("QinShi Huang");
        leaderList.add("Saladin");
        leaderList.add("TeddyRoosevelt Bull Moose");
        leaderList.add("TeddyRoosevelt Rough Rider");
        leaderList.add("Tomyris");
        leaderList.add("Trajan");
        leaderList.add("Victoria");
    }
    public void addPersiaAndMacedon() {
        leaderList.add("Alexander");
        leaderList.add("Cyrus");
    }
    public void addNubia() {
        leaderList.add("Amanitore");
    }

    public void addByzantiumAndGaul() {
        leaderList.add("Basil II.");
        leaderList.add("Ambiorix");
    }

    public void addVietnamAndKublai() {
        leaderList.add("Ba Trieu");
        leaderList.add("Kublai Khan (Mongolian)");
        leaderList.add("Kublai Khan (Chinese)");
    }
    public void addKhmerAndIndonesia() {
        leaderList.add("Jayavarman VII.");
        leaderList.add("Gitarja");
    }

    public void addBabylon() {
        leaderList.add("Hammurabi");
    }

    public void addPoland() {
        leaderList.add("Jadwiga");
    }

    public void addPortugal() {
        leaderList.add("Joao III.");
    }

    public void addAustralia() {
        leaderList.add("John Curtin");
    }

    public void addMayaAndColumbia() {
        leaderList.add("Simon Bolivar");
        leaderList.add("Lady Six Sky");
    }

    public void addEthiopia() {
        leaderList.add("Menelik II.");
    }

    public void addRiseAndFall() {
        leaderList.add("Chandragupta");
        leaderList.add("Genghis Khan");
        leaderList.add("Lautaro");
        leaderList.add("Poundmaker");
        leaderList.add("Robert The Bruce");
        leaderList.add("Seondeok");
        leaderList.add("Shaka");
        leaderList.add("Tamar");
        leaderList.add("Wilhemina");
    }

    public void addGatherAndStorm() {
        leaderList.add("Dido");
        leaderList.add("Eleanor Of Aquitaine (French)");
        leaderList.add("Elanor Of Aquitaine (English)");
        leaderList.add("Kristina");
        leaderList.add("Kupe");
        leaderList.add("Mansa Musa");
        leaderList.add("Matthias Corvinus");
        leaderList.add("Pachacuti");
        leaderList.add("Suleiman");
        leaderList.add("Wilfrid Laurier");
    }
    public static List<String> getLeaderList() {
        return leaderList;
    }


}
