package com.example.randomcivgenerator.leaderlist;


/**
 * contains all values for the LeaderActivity (list)
 */
public class LeaderView {

    private int imageId;
    private String leaderName;
    private String infoBonus;
    private String infoAbilities;
    private String infoUnit1;
    private String infoUnit2;
    private String infoBuilding1;
    private String infoBuilding2;
    private String infoBuildUnit;
    private String hasTwoUnits;
    private String hasTwoBuildings;

    public LeaderView(int imageId, String leaderName, String infoBonus, String infoAbilities, String infoUnit1, String infoUnit2, String infoBuilding1, String infoBuilding2) {
        this.imageId = imageId;
        this.leaderName = leaderName;
        this.infoBonus = infoBonus;
        this.infoAbilities = infoAbilities;
        this.infoUnit1 = infoUnit1;
        this.infoUnit2 = infoUnit2;
        this.infoBuilding1 = infoBuilding1;
        this.infoBuilding2 = infoBuilding2;
    }

    public LeaderView(int imageId, String leaderName, String infoBonus, String infoAbilities, String infoUnit1, String infoBuilding1, String infoBuildUnit, boolean hasTwoUnits, boolean hasTwoBuildings) {
        this.imageId = imageId;
        this.leaderName = leaderName;
        this.infoBonus = infoBonus;
        this.infoAbilities = infoAbilities;
        this.infoUnit1 = infoUnit1;
        this.infoBuilding1 = infoBuilding1;
        if (hasTwoUnits) {
            this.infoUnit2 = infoBuildUnit;
        } else if (hasTwoBuildings) {
            this.infoBuilding2 = infoBuildUnit;
        }
    }

    public LeaderView(int imageId, String leaderName, String infoBonus, String infoAbilities, String infoUnit1, String infoBuilding1) {
        this.imageId = imageId;
        this.leaderName = leaderName;
        this.infoBonus = infoBonus;
        this.infoAbilities = infoAbilities;
        this.infoUnit1 = infoUnit1;
        this.infoBuilding1 = infoBuilding1;
    }

    /**
     *
     * @return ID of leader Image
     */
    public int getImageId() {
        return imageId;
    }

    /**
     *
     * @return name of Leader
     */
    public String getLeaderName() {
        return leaderName;
    }


    public String getInfoUnit2() {
        return infoUnit2;
    }

    public String getInfoBuilding1() {
        return infoBuilding1;
    }

    public String getInfoBuilding2() {
        return infoBuilding2;
    }

    public String getInfoUnit1() {
        return infoUnit1;
    }

    public String getInfoAbilities() {
        return infoAbilities;
    }

    public String getInfoBonus() {
        return infoBonus;
    }
}
