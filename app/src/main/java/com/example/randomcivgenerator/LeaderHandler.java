package com.example.randomcivgenerator;

import android.content.res.Resources;

import com.example.randomcivgenerator.leaderlist.LeaderView;

import java.util.ArrayList;

/**
 * handles our ArrayList with Leadernames, ID of images...
 *
 */
public class LeaderHandler {



    Resources resources;
    static ArrayList<LeaderView> leaderList;
    static ArrayList<LeaderView> finalLeaderList;


    // contains current resource (for language) and ArrayList
    public LeaderHandler(ArrayList<LeaderView> leaderList, Resources resources) {
        this.resources = resources;
        this.leaderList = leaderList;
    }


    /**
     * add all Vanilla Leaders incl. images
     */
    public void addVanilla() {
        leaderList.add(new LeaderView(R.drawable.catherineblackqueen, resources.getString(R.string.cath_de_med_bq), resources.getString(R.string.cath_bq_bonus), resources.getString(R.string.cath_bq_abilities), resources.getString(R.string.cath_bq_unit_1), resources.getString(R.string.cath_bq_building), 0));
        leaderList.add(new LeaderView(R.drawable.catherinemagnificence, resources.getString(R.string.cath_de_med_mag), resources.getString(R.string.cath_mag_bonus), resources.getString(R.string.cath_mag_abilities), resources.getString(R.string.cath_mag_unit_1), resources.getString(R.string.cath_mag_building), 0));
        leaderList.add(new LeaderView(R.drawable.cleopatra, resources.getString(R.string.cleopatra), resources.getString(R.string.cleo_bonus), resources.getString(R.string.cleo_abilities), resources.getString(R.string.cleo_unit_1), resources.getString(R.string.cleo_building), 0));
        leaderList.add(new LeaderView(R.drawable.frederickbarbarossa, resources.getString(R.string.fred_barbar), resources.getString(R.string.fred_barb_bonus), resources.getString(R.string.fred_barb_abilities), resources.getString(R.string.fred_barb_unit_1), resources.getString(R.string.fred_barb_building), 0));
        leaderList.add(new LeaderView(R.drawable.gandhi, resources.getString(R.string.gandhi), resources.getString(R.string.gandhi_bonus), resources.getString(R.string.gandhi_abilities), resources.getString(R.string.gandhi_unit_1), resources.getString(R.string.gandhi_building), 0));
        leaderList.add(new LeaderView(R.drawable.gilgamesh, resources.getString(R.string.gilgamesh), resources.getString(R.string.gilga_bonus), resources.getString(R.string.gilga_abilities), resources.getString(R.string.gilga_unit_1), resources.getString(R.string.gilga_building), 0));
        leaderList.add(new LeaderView(R.drawable.gorgo, resources.getString(R.string.gorgo), resources.getString(R.string.gorgo_bonus), resources.getString(R.string.gorgo_abilities), resources.getString(R.string.gorgo_unit_1), resources.getString(R.string.gorgo_building), 0));
        leaderList.add(new LeaderView(R.drawable.haraldhardrada, resources.getString(R.string.harald), resources.getString(R.string.harald_bonus), resources.getString(R.string.harald_abilities), resources.getString(R.string.harald_unit_1), resources.getString(R.string.harald_building), resources.getString(R.string.harald_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.hojotokimune, resources.getString(R.string.hojo_toki), resources.getString(R.string.hojo_bonus), resources.getString(R.string.hojo_abilities), resources.getString(R.string.hojo_unit_1), resources.getString(R.string.hojo_building), 0));
        leaderList.add(new LeaderView(R.drawable.montezuma, resources.getString(R.string.montezuma), resources.getString(R.string.monte_bonus), resources.getString(R.string.monte_abilities), resources.getString(R.string.monte_unit_1), resources.getString(R.string.monte_building), 0));
        leaderList.add(new LeaderView(R.drawable.mvembanzinga, resources.getString(R.string.mvemba), resources.getString(R.string.mvemba_bonus), resources.getString(R.string.mvemba_abilities), resources.getString(R.string.mvemba_unit_1), resources.getString(R.string.mvemba_building), 0));
        leaderList.add(new LeaderView(R.drawable.pedroii, resources.getString(R.string.pedro), resources.getString(R.string.pedro_bonus), resources.getString(R.string.pedro_abilities), resources.getString(R.string.pedro_unit_1), resources.getString(R.string.pedro_building), resources.getString(R.string.pedro_building_2), 2));
        leaderList.add(new LeaderView(R.drawable.pericles, resources.getString(R.string.pericles), resources.getString(R.string.pericles_bonus), resources.getString(R.string.pericles_abilities), resources.getString(R.string.pericles_unit_1), resources.getString(R.string.pericles_building), 0));
        leaderList.add(new LeaderView(R.drawable.peter, resources.getString(R.string.peter), resources.getString(R.string.peter_bonus), resources.getString(R.string.peter_abilities), resources.getString(R.string.peter_unit_1), resources.getString(R.string.peter_building), 0));
        leaderList.add(new LeaderView(R.drawable.philippii, resources.getString(R.string.philipp_ii), resources.getString(R.string.philipp_bonus), resources.getString(R.string.philipp_abilities), resources.getString(R.string.philipp_unit_1), resources.getString(R.string.philipp_building), 0));
        leaderList.add(new LeaderView(R.drawable.qinshihuang, resources.getString(R.string.qinshi), resources.getString(R.string.qinshi_bonus), resources.getString(R.string.qinshi_abilities), resources.getString(R.string.qinshi_unit_1), resources.getString(R.string.qinshi_building), 0));
        leaderList.add(new LeaderView(R.drawable.saladin, resources.getString(R.string.saladin), resources.getString(R.string.saladin_bonus), resources.getString(R.string.saladin_abilities), resources.getString(R.string.saladin_unit_1), resources.getString(R.string.saladin_building), 0));
        leaderList.add(new LeaderView(R.drawable.teddyrooseveltbullmoose, resources.getString(R.string.teddy_roose_bm), resources.getString(R.string.teddy_bm_bonus), resources.getString(R.string.teddy_bm_abilities), resources.getString(R.string.teddy_bm_unit_1), resources.getString(R.string.teddy_bm_building), 0));
        leaderList.add(new LeaderView(R.drawable.teddyrooseveltroughrider, resources.getString(R.string.teddy_roose_rr), resources.getString(R.string.teddy_rr_bonus), resources.getString(R.string.teddy_rr_abilities), resources.getString(R.string.teddy_rr_unit_1), resources.getString(R.string.teddy_rr_building), resources.getString(R.string.teddy_rr_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.tomyris, resources.getString(R.string.tomyris), resources.getString(R.string.tomyris_bonus), resources.getString(R.string.tomyris_abilities), resources.getString(R.string.tomyris_unit_1), resources.getString(R.string.tomyris_building), 0));
        leaderList.add(new LeaderView(R.drawable.trajan, resources.getString(R.string.trajan), resources.getString(R.string.trajan_bonus), resources.getString(R.string.trajan_abilities), resources.getString(R.string.trajan_unit_1), resources.getString(R.string.trajan_building), 0));
        leaderList.add(new LeaderView(R.drawable.victoria, resources.getString(R.string.victoria), resources.getString(R.string.victoria_bonus), resources.getString(R.string.victoria_abilities), resources.getString(R.string.victoria_unit_1), resources.getString(R.string.victoria_building), resources.getString(R.string.victoria_unit_2), 1));
    }


    public void addPersiaAndMacedon() {
        leaderList.add(new LeaderView(R.drawable.alexander, resources.getString(R.string.alexander), resources.getString(R.string.alexander_bonus), resources.getString(R.string.alexander_abilities), resources.getString(R.string.alexander_unit_1), resources.getString(R.string.alexander_building), resources.getString(R.string.alexander_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.cyrus, resources.getString(R.string.cyrus), resources.getString(R.string.cyrus_bonus), resources.getString(R.string.cyrus_abilities), resources.getString(R.string.cyrus_unit_1), resources.getString(R.string.cyrus_building), 0));
    }
    public void addNubia() {
        leaderList.add(new LeaderView(R.drawable.amanitore, resources.getString(R.string.amanitore), resources.getString(R.string.amanitore_bonus), resources.getString(R.string.amanitore_abilities), resources.getString(R.string.amanitore_unit_1), resources.getString(R.string.amanitore_building), 0));
    }

    public void addByzantiumAndGaul() {
        leaderList.add(new LeaderView(R.drawable.basilii, resources.getString(R.string.basil_ii), resources.getString(R.string.basil_bonus), resources.getString(R.string.basil_abilities), resources.getString(R.string.basil_unit_1), resources.getString(R.string.basil_building), resources.getString(R.string.basil_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.ambiorix, resources.getString(R.string.ambiorix), resources.getString(R.string.ambiorix_bonus), resources.getString(R.string.ambiorix_abilities), resources.getString(R.string.ambiorix_unit_1), resources.getString(R.string.ambiorix_building), 0));
    }

    public void addVietnamAndKublai() {
        leaderList.add(new LeaderView(R.drawable.batrieu, resources.getString(R.string.batrieu), resources.getString(R.string.batrieu_bonus), resources.getString(R.string.batrieu_abilities), resources.getString(R.string.batrieu_unit_1), resources.getString(R.string.batrieu_building), 0));
        leaderList.add(new LeaderView(R.drawable.kublaimongolian, resources.getString(R.string.kublai_mong), resources.getString(R.string.kublai_mong_bonus), resources.getString(R.string.kublai_mong_abilities), resources.getString(R.string.kublai_mong_unit_1), resources.getString(R.string.kublai_mong_building),0 ));
        leaderList.add(new LeaderView(R.drawable.kublaichinese, resources.getString(R.string.kublai_chin), resources.getString(R.string.kublai_china_bonus), resources.getString(R.string.kublai_china_abilities), resources.getString(R.string.kublai_china_unit_1), resources.getString(R.string.kublai_china_building),0));
    }
    public void addKhmerAndIndonesia() {
        leaderList.add(new LeaderView(R.drawable.jayavarman, resources.getString(R.string.jayavarman), resources.getString(R.string.jaya_bonus), resources.getString(R.string.jaya_abilities), resources.getString(R.string.jaya_unit_1), resources.getString(R.string.jaya_building), 0));
        leaderList.add(new LeaderView(R.drawable.gitarja, resources.getString(R.string.gitarja), resources.getString(R.string.gitarja_bonus), resources.getString(R.string.gitarja_abilities), resources.getString(R.string.gitarja_unit_1), resources.getString(R.string.gitarja_building), 0));
    }

    public void addBabylon() {
        leaderList.add(new LeaderView(R.drawable.hammurabi, resources.getString(R.string.hammurabi), resources.getString(R.string.hammu_bonus), resources.getString(R.string.hammu_abilities), resources.getString(R.string.hammu_unit_1), resources.getString(R.string.hammu_building), 0));
    }

    public void addPoland() {
        leaderList.add(new LeaderView(R.drawable.jadwiga, resources.getString(R.string.jadigwa), resources.getString(R.string.jadigwa_bonus), resources.getString(R.string.jadigwa_abilities), resources.getString(R.string.jadigwa_unit_1), resources.getString(R.string.jadigwa_building), 0));
    }

    public void addPortugal() {
        leaderList.add(new LeaderView(R.drawable.joaoiii, resources.getString(R.string.joao_iii), resources.getString(R.string.joao_bonus), resources.getString(R.string.joao_abilities), resources.getString(R.string.joao_unit_1), resources.getString(R.string.joao_building), resources.getString(R.string.joao_building_2), 2));
    }

    public void addAustralia() {
        leaderList.add(new LeaderView(R.drawable.johncurtin, resources.getString(R.string.john_curtin), resources.getString(R.string.jcurtin_bonus), resources.getString(R.string.jcurtin_abilities), resources.getString(R.string.jcurtin_unit_1), resources.getString(R.string.jcurtin_building), 0));
    }

    public void addMayaAndColumbia() {
        leaderList.add(new LeaderView(R.drawable.simonbolivar, resources.getString(R.string.simon_bolivar), resources.getString(R.string.simon_bonus), resources.getString(R.string.simon_abilities), resources.getString(R.string.simon_unit_1), resources.getString(R.string.simon_building), resources.getString(R.string.simon_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.ladysixsky, resources.getString(R.string.ladysixsky), resources.getString(R.string.ladyss_bonus), resources.getString(R.string.ladyss_abilities), resources.getString(R.string.ladyss_unit_1), resources.getString(R.string.ladyss_building) ,0));
    }

    public void addEthiopia() {
        leaderList.add(new LeaderView(R.drawable.menelikii, resources.getString(R.string.menelik), resources.getString(R.string.menelik_bonus), resources.getString(R.string.menelik_abilities), resources.getString(R.string.menelik_unit_1), resources.getString(R.string.menelik_building), 0));
    }

    public void addRiseAndFall() {
        leaderList.add(new LeaderView(R.drawable.chandragupta, resources.getString(R.string.chandragupta), resources.getString(R.string.changdragupta_bonus), resources.getString(R.string.changdragupta_abilities), resources.getString(R.string.changdragupta_unit_1), resources.getString(R.string.changragupta_building),0 ));
        leaderList.add(new LeaderView(R.drawable.genghiskhan, resources.getString(R.string.genghis_khan), resources.getString(R.string.genghis_bonus), resources.getString(R.string.genghis_abilities), resources.getString(R.string.genghis_unit_1), resources.getString(R.string.genghis_building), 0));
        leaderList.add(new LeaderView(R.drawable.lautaro, resources.getString(R.string.lautaro), resources.getString(R.string.lautaro_bonus), resources.getString(R.string.lautaro_abilities), resources.getString(R.string.lautaro_unit_1), resources.getString(R.string.lautaro_building), 0));
        leaderList.add(new LeaderView(R.drawable.poundmaker, resources.getString(R.string.poundmaker), resources.getString(R.string.pound_bonus), resources.getString(R.string.pound_abilities), resources.getString(R.string.pound_unit_1), resources.getString(R.string.pound_building), 0));
        leaderList.add(new LeaderView(R.drawable.robertthebruce, resources.getString(R.string.robert_the_bruce), resources.getString(R.string.robtb_bonus), resources.getString(R.string.robtb_abilities), resources.getString(R.string.robtb_unit_1), resources.getString(R.string.robtb_building), 0));
        leaderList.add(new LeaderView(R.drawable.seondeok, resources.getString(R.string.seondeok), resources.getString(R.string.seon_bonus), resources.getString(R.string.seon_ability), resources.getString(R.string.seon_unit_1), resources.getString(R.string.seon_building), 0));
        leaderList.add(new LeaderView(R.drawable.shaka, resources.getString(R.string.shaka), resources.getString(R.string.shaka_bonus), resources.getString(R.string.shaka_abilities), resources.getString(R.string.shaka_unit_1), resources.getString(R.string.shaka_building), 0));
        leaderList.add(new LeaderView(R.drawable.tamar, resources.getString(R.string.tamar), resources.getString(R.string.tamar_bonus), resources.getString(R.string.tamar_abilities), resources.getString(R.string.tamar_unit_1), resources.getString(R.string.tamar_building), 0));
        leaderList.add(new LeaderView(R.drawable.wilhemina, resources.getString(R.string.wilhemina), resources.getString(R.string.wilhemina_bonus), resources.getString(R.string.wilhemina_abilities), resources.getString(R.string.wilhemina_unit_1), resources.getString(R.string.wilhemina_building), 0));
    }

    public void addGatherAndStorm() {
        leaderList.add(new LeaderView(R.drawable.dido, resources.getString(R.string.dido), resources.getString(R.string.dido_bonus), resources.getString(R.string.dido_abilities), resources.getString(R.string.dido_unit_1), resources.getString(R.string.dido_building),0));
        leaderList.add(new LeaderView(R.drawable.eleanorfrench, resources.getString(R.string.eleanor_french), resources.getString(R.string.eleanor_french_bonus), resources.getString(R.string.eleanor_french_abilities), resources.getString(R.string.eleanor_french_unit_1), resources.getString(R.string.eleanor_french_building), 0));
        leaderList.add(new LeaderView(R.drawable.eleanoreng, resources.getString(R.string.eleanor_english), resources.getString(R.string.eleanor_eng_bonus), resources.getString(R.string.eleanor_eng_abilities), resources.getString(R.string.eleanor_eng_unit_1), resources.getString(R.string.eleanor_eng_bonus), 0));
        leaderList.add(new LeaderView(R.drawable.kristina, resources.getString(R.string.kristina), resources.getString(R.string.kristina_bonus), resources.getString(R.string.kristina_abilities), resources.getString(R.string.kristina_unit_1), resources.getString(R.string.kristina_building), resources.getString(R.string.kristina_building_2), 2));
        leaderList.add(new LeaderView(R.drawable.kupe, resources.getString(R.string.kupe), resources.getString(R.string.kupe_bonus), resources.getString(R.string.kupe_abilities), resources.getString(R.string.kupe_unit_1), resources.getString(R.string.kupe_building), resources.getString(R.string.kupe_building_2), 2));
        leaderList.add(new LeaderView(R.drawable.mansamusa, resources.getString(R.string.mansa_musa), resources.getString(R.string.mansa_bonus), resources.getString(R.string.mansa_abilities), resources.getString(R.string.mansa_unit_1), resources.getString(R.string.mansa_building), 0));
        leaderList.add(new LeaderView(R.drawable.matthiascorvinus, resources.getString(R.string.matthias_corvinus), resources.getString(R.string.math_corv_bonus), resources.getString(R.string.math_corv_abilities), resources.getString(R.string.math_corv_unit_1), resources.getString(R.string.math_corv_building), resources.getString(R.string.math_corv_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.pachacuti, resources.getString(R.string.pachacuti), resources.getString(R.string.pacha_bonus), resources.getString(R.string.pacha_abilities), resources.getString(R.string.pacha_unit_1), resources.getString(R.string.pacha_building), resources.getString(R.string.pacha_building_2), 2));
        leaderList.add(new LeaderView(R.drawable.suleiman, resources.getString(R.string.suleiman), resources.getString(R.string.sulei_bonus), resources.getString(R.string.sulei_abilities), resources.getString(R.string.sulei_unit_1), resources.getString(R.string.sulei_building), resources.getString(R.string.sulei_unit_2), 1));
        leaderList.add(new LeaderView(R.drawable.wilfridlaurier, resources.getString(R.string.wilfrid_laurier), resources.getString(R.string.wilfried_bonus), resources.getString(R.string.wilfried_abilities), resources.getString(R.string.wilfried_unit_1), resources.getString(R.string.wilfried_building),0));
    }

    /**
     *
     * @return current ArrayList containing LeaderView (names, ID's, Bonus-info, Ability-info, Unit1, Building1, Unit2 or Building2)
     */
    public static ArrayList<LeaderView> getLeaderList() {
        return leaderList;
    }

    public static ArrayList<LeaderView> deleteUnchecked() {
        finalLeaderList = new ArrayList<LeaderView>(leaderList);
        for (int i = 0; i < finalLeaderList.size(); i++) {
            if (finalLeaderList.get(i).getDeleteHint() == 'x') {
                finalLeaderList.remove(i);
                --i;
            }
        }
        return finalLeaderList;

    }

    public static void deleteAll() {
        finalLeaderList.clear();
        leaderList.clear();

    }






}
