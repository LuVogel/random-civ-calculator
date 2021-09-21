package com.example.randomcivgenerator.leaderlist;


import java.io.Serializable;

/**
 * contains all values for the LeaderActivity (list)
 */
public class LeaderView implements Serializable {

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
    private int checkExtraUnique;
    private char deleteHint;


    public LeaderView(int imageId, String leaderName, String infoBonus, String infoAbilities, String infoUnit1, String infoUnit2, String infoBuilding1, String infoBuilding2, int checkExtraUnique) {
        this.imageId = imageId;
        this.leaderName = leaderName;
        this.infoBonus = infoBonus;
        this.infoAbilities = infoAbilities;
        this.infoUnit1 = infoUnit1;
        this.infoUnit2 = infoUnit2;
        this.infoBuilding1 = infoBuilding1;
        this.infoBuilding2 = infoBuilding2;
        this.checkExtraUnique = checkExtraUnique;
        this.deleteHint = 'x';


    }

    public LeaderView(int imageId, String leaderName, String infoBonus, String infoAbilities, String infoUnit1, String infoBuilding1, String infoBuildUnit, int checkExtraUnique) {
        this.imageId = imageId;
        this.leaderName = leaderName;
        this.infoBonus = infoBonus;
        this.infoAbilities = infoAbilities;
        this.infoUnit1 = infoUnit1;
        this.infoBuilding1 = infoBuilding1;
        this.checkExtraUnique = checkExtraUnique;
        if (checkExtraUnique == 1) {
            this.infoUnit2 = infoBuildUnit;
        } else if (checkExtraUnique == 2) {
            this.infoBuilding2 = infoBuildUnit;
        }
        this.deleteHint = 'x';
    }

    public LeaderView(int imageId, String leaderName, String infoBonus, String infoAbilities, String infoUnit1, String infoBuilding1, int checkExtraUnique) {
        this.imageId = imageId;
        this.leaderName = leaderName;
        this.infoBonus = infoBonus;
        this.infoAbilities = infoAbilities;
        this.infoUnit1 = infoUnit1;
        this.infoBuilding1 = infoBuilding1;
        this.checkExtraUnique = checkExtraUnique;
        this.deleteHint = 'x';
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

    public int getCheckExtraUnique() {
        return checkExtraUnique;
    }


    public String getAllInfos() {
        return infoBonus + "%" + infoAbilities + "%" + infoUnit1 + "%" +infoBuilding1 + "%" + infoBuildUnit + "%" + deleteHint;
    }

    public void setDeleteHint(char deleteHint) {
        this.deleteHint = deleteHint;
    }

    public char getDeleteHint() {
        return deleteHint;
    }
}
