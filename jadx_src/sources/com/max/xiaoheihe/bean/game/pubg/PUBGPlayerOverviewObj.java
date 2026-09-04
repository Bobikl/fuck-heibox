package com.max.xiaoheihe.bean.game.pubg;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.account.InventoryObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGPlayerOverviewObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ActivityObj activity;
    private String bg_cover_lottie;
    private String bg_img;
    private List<PUBGMatchObj> calendar;
    private PUBGCareerObj career;
    private String certified;
    private String download_url;
    private List<PlayerInfoObj> follow;
    private String follow_state;
    private String fpp_default;
    private List<PlayerRankObj> friends;
    private List<InventoryObj> inventory;
    private int inventory_count;
    private String inventory_open;
    private String inventory_value;
    private Boolean isExpand;
    private List<PUBGMatchObj> matches;
    private List<PUBGMenuObj> menu;
    private String message;
    private String message_time;
    private List<List<KeyDescObj>> normal_score_detail;
    private PUBGRoundDataObj normal_score_round;
    private List<PUBGGameModeObj> person_mode;
    private String personal_infomation_open;
    private PlayerInfoObj player_info;
    private PUBGRoundDataObj player_rank_round;
    private PUBGR20DataObj r20matches;
    private List<PUBGDataObj> radar_score;
    private String rating;
    private String rating_desc;
    private String rating_img;
    private List<PUBGRatingInfoObj> rating_list;
    private String rating_mode_img;
    private String rating_name;
    private String rating_rank;
    private String rating_rank_name;
    private List<KeyDescObj> regions;
    private List<KeyDescObj> seasons;
    private String show_fpp;
    private String show_person_mode;
    private PUBGGameStatsObj stats;
    private String this_season;
    private List<PUBGTrendObj> trend;
    private String update_btn_desc;
    private String update_btn_state;
    private String update_desc;
    private PlayerRankObj user_rank;

    public ActivityObj getActivity() {
        return this.activity;
    }

    public String getBg_cover_lottie() {
        return this.bg_cover_lottie;
    }

    public String getBg_img() {
        return this.bg_img;
    }

    public List<PUBGMatchObj> getCalendar() {
        return this.calendar;
    }

    public PUBGCareerObj getCareer() {
        return this.career;
    }

    public String getCertified() {
        return this.certified;
    }

    public String getDownload_url() {
        return this.download_url;
    }

    public Boolean getExpand() {
        return this.isExpand;
    }

    public List<PlayerInfoObj> getFollow() {
        return this.follow;
    }

    public String getFollow_state() {
        return this.follow_state;
    }

    public String getFpp_default() {
        return this.fpp_default;
    }

    public List<PlayerRankObj> getFriends() {
        return this.friends;
    }

    public List<InventoryObj> getInventory() {
        return this.inventory;
    }

    public int getInventory_count() {
        return this.inventory_count;
    }

    public String getInventory_open() {
        return this.inventory_open;
    }

    public String getInventory_value() {
        return this.inventory_value;
    }

    public List<PUBGMatchObj> getMatches() {
        return this.matches;
    }

    public List<PUBGMenuObj> getMenu() {
        return this.menu;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage_time() {
        return this.message_time;
    }

    public List<List<KeyDescObj>> getNormal_score_detail() {
        return this.normal_score_detail;
    }

    public PUBGRoundDataObj getNormal_score_round() {
        return this.normal_score_round;
    }

    public List<PUBGGameModeObj> getPerson_mode() {
        return this.person_mode;
    }

    public String getPersonal_infomation_open() {
        return this.personal_infomation_open;
    }

    public PlayerInfoObj getPlayer_info() {
        return this.player_info;
    }

    public PUBGRoundDataObj getPlayer_rank_round() {
        return this.player_rank_round;
    }

    public PUBGR20DataObj getR20matches() {
        return this.r20matches;
    }

    public List<PUBGDataObj> getRadar_score() {
        return this.radar_score;
    }

    public String getRating() {
        return this.rating;
    }

    public String getRating_desc() {
        return this.rating_desc;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public List<PUBGRatingInfoObj> getRating_list() {
        return this.rating_list;
    }

    public String getRating_mode_img() {
        return this.rating_mode_img;
    }

    public String getRating_name() {
        return this.rating_name;
    }

    public String getRating_rank() {
        return this.rating_rank;
    }

    public String getRating_rank_name() {
        return this.rating_rank_name;
    }

    public List<KeyDescObj> getRegions() {
        return this.regions;
    }

    public List<KeyDescObj> getSeasons() {
        return this.seasons;
    }

    public String getShow_fpp() {
        return this.show_fpp;
    }

    public String getShow_person_mode() {
        return this.show_person_mode;
    }

    public PUBGGameStatsObj getStats() {
        return this.stats;
    }

    public String getThis_season() {
        return this.this_season;
    }

    public List<PUBGTrendObj> getTrend() {
        return this.trend;
    }

    public String getUpdate_btn_desc() {
        return this.update_btn_desc;
    }

    public String getUpdate_btn_state() {
        return this.update_btn_state;
    }

    public String getUpdate_desc() {
        return this.update_desc;
    }

    public PlayerRankObj getUser_rank() {
        return this.user_rank;
    }

    public void setActivity(ActivityObj activityObj) {
        this.activity = activityObj;
    }

    public void setBg_cover_lottie(String str) {
        this.bg_cover_lottie = str;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setCalendar(List<PUBGMatchObj> list) {
        this.calendar = list;
    }

    public void setCareer(PUBGCareerObj pUBGCareerObj) {
        this.career = pUBGCareerObj;
    }

    public void setCertified(String str) {
        this.certified = str;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public void setExpand(Boolean bool) {
        this.isExpand = bool;
    }

    public void setFollow(List<PlayerInfoObj> list) {
        this.follow = list;
    }

    public void setFollow_state(String str) {
        this.follow_state = str;
    }

    public void setFpp_default(String str) {
        this.fpp_default = str;
    }

    public void setFriends(List<PlayerRankObj> list) {
        this.friends = list;
    }

    public void setInventory(List<InventoryObj> list) {
        this.inventory = list;
    }

    public void setInventory_count(int i10) {
        this.inventory_count = i10;
    }

    public void setInventory_open(String str) {
        this.inventory_open = str;
    }

    public void setInventory_value(String str) {
        this.inventory_value = str;
    }

    public void setMatches(List<PUBGMatchObj> list) {
        this.matches = list;
    }

    public void setMenu(List<PUBGMenuObj> list) {
        this.menu = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessage_time(String str) {
        this.message_time = str;
    }

    public void setNormal_score_detail(List<List<KeyDescObj>> list) {
        this.normal_score_detail = list;
    }

    public void setNormal_score_round(PUBGRoundDataObj pUBGRoundDataObj) {
        this.normal_score_round = pUBGRoundDataObj;
    }

    public void setPerson_mode(List<PUBGGameModeObj> list) {
        this.person_mode = list;
    }

    public void setPersonal_infomation_open(String str) {
        this.personal_infomation_open = str;
    }

    public void setPlayer_info(PlayerInfoObj playerInfoObj) {
        this.player_info = playerInfoObj;
    }

    public void setPlayer_rank_round(PUBGRoundDataObj pUBGRoundDataObj) {
        this.player_rank_round = pUBGRoundDataObj;
    }

    public void setR20matches(PUBGR20DataObj pUBGR20DataObj) {
        this.r20matches = pUBGR20DataObj;
    }

    public PUBGPlayerOverviewObj setRadar_score(List<PUBGDataObj> list) {
        this.radar_score = list;
        return this;
    }

    public PUBGPlayerOverviewObj setRating(String str) {
        this.rating = str;
        return this;
    }

    public void setRating_desc(String str) {
        this.rating_desc = str;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setRating_list(List<PUBGRatingInfoObj> list) {
        this.rating_list = list;
    }

    public void setRating_mode_img(String str) {
        this.rating_mode_img = str;
    }

    public void setRating_name(String str) {
        this.rating_name = str;
    }

    public PUBGPlayerOverviewObj setRating_rank(String str) {
        this.rating_rank = str;
        return this;
    }

    public void setRating_rank_name(String str) {
        this.rating_rank_name = str;
    }

    public PUBGPlayerOverviewObj setRegions(List<KeyDescObj> list) {
        this.regions = list;
        return this;
    }

    public void setSeasons(List<KeyDescObj> list) {
        this.seasons = list;
    }

    public void setShow_fpp(String str) {
        this.show_fpp = str;
    }

    public void setShow_person_mode(String str) {
        this.show_person_mode = str;
    }

    public void setStats(PUBGGameStatsObj pUBGGameStatsObj) {
        this.stats = pUBGGameStatsObj;
    }

    public void setThis_season(String str) {
        this.this_season = str;
    }

    public PUBGPlayerOverviewObj setTrend(List<PUBGTrendObj> list) {
        this.trend = list;
        return this;
    }

    public void setUpdate_btn_desc(String str) {
        this.update_btn_desc = str;
    }

    public void setUpdate_btn_state(String str) {
        this.update_btn_state = str;
    }

    public void setUpdate_desc(String str) {
        this.update_desc = str;
    }

    public void setUser_rank(PlayerRankObj playerRankObj) {
        this.user_rank = playerRankObj;
    }
}
