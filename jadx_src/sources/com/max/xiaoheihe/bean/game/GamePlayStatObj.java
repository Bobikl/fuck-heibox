package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.account.AchieveObj;
import com.max.xiaoheihe.bean.account.HeyboxRankObj;
import com.max.xiaoheihe.bean.account.InventoryObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.max.xiaoheihe.bean.account.steaminfo.BadgeListObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePlayStatObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AchieveObj> achieve_list;
    private int achieved_count;
    private String achieved_end_color;
    private String achieved_point;
    private String achieved_rank;
    private String achieved_start_color;
    private int achivement_count;
    private BadgeListObj badge_detail;
    private String end_color;
    private List<SteamIdInfoObj> friends;
    private int friends_count;
    private GameObj game_info;
    private List<HeyboxRankObj> heybox_rank;
    private int inventory_count;
    private List<InventoryObj> inventory_list;
    private int is_owner;
    private List<GameMonthlyPlayerInfoObj> monthly_player;
    private String playtime_2weeks;
    private String playtime_forever;
    private String playtime_percent;
    private String playtime_rank;
    private String start_color;
    private SteamIdInfoObj steam_id_info;
    private String summary_url;
    private GameUserNumObj user_num;
    private HeyboxRankObj user_rank;

    public List<AchieveObj> getAchieve_list() {
        return this.achieve_list;
    }

    public int getAchieved_count() {
        return this.achieved_count;
    }

    public String getAchieved_end_color() {
        return this.achieved_end_color;
    }

    public String getAchieved_point() {
        return this.achieved_point;
    }

    public String getAchieved_rank() {
        return this.achieved_rank;
    }

    public String getAchieved_start_color() {
        return this.achieved_start_color;
    }

    public int getAchivement_count() {
        return this.achivement_count;
    }

    public BadgeListObj getBadge_detail() {
        return this.badge_detail;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public List<SteamIdInfoObj> getFriends() {
        return this.friends;
    }

    public int getFriends_count() {
        return this.friends_count;
    }

    public GameObj getGame_info() {
        return this.game_info;
    }

    public List<HeyboxRankObj> getHeybox_rank() {
        return this.heybox_rank;
    }

    public int getInventory_count() {
        return this.inventory_count;
    }

    public List<InventoryObj> getInventory_list() {
        return this.inventory_list;
    }

    public int getIs_owner() {
        return this.is_owner;
    }

    public List<GameMonthlyPlayerInfoObj> getMonthly_player() {
        return this.monthly_player;
    }

    public String getPlaytime_2weeks() {
        return this.playtime_2weeks;
    }

    public String getPlaytime_forever() {
        return this.playtime_forever;
    }

    public String getPlaytime_percent() {
        return this.playtime_percent;
    }

    public String getPlaytime_rank() {
        return this.playtime_rank;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public SteamIdInfoObj getSteam_id_info() {
        return this.steam_id_info;
    }

    public String getSummary_url() {
        return this.summary_url;
    }

    public GameUserNumObj getUser_num() {
        return this.user_num;
    }

    public HeyboxRankObj getUser_rank() {
        return this.user_rank;
    }

    public GamePlayStatObj setAchieve_list(List<AchieveObj> list) {
        this.achieve_list = list;
        return this;
    }

    public GamePlayStatObj setAchieved_count(int i10) {
        this.achieved_count = i10;
        return this;
    }

    public void setAchieved_end_color(String str) {
        this.achieved_end_color = str;
    }

    public void setAchieved_point(String str) {
        this.achieved_point = str;
    }

    public void setAchieved_rank(String str) {
        this.achieved_rank = str;
    }

    public void setAchieved_start_color(String str) {
        this.achieved_start_color = str;
    }

    public GamePlayStatObj setAchivement_count(int i10) {
        this.achivement_count = i10;
        return this;
    }

    public GamePlayStatObj setBadge_detail(BadgeListObj badgeListObj) {
        this.badge_detail = badgeListObj;
        return this;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public GamePlayStatObj setFriends(List<SteamIdInfoObj> list) {
        this.friends = list;
        return this;
    }

    public GamePlayStatObj setFriends_count(int i10) {
        this.friends_count = i10;
        return this;
    }

    public GamePlayStatObj setGame_info(GameObj gameObj) {
        this.game_info = gameObj;
        return this;
    }

    public void setHeybox_rank(List<HeyboxRankObj> list) {
        this.heybox_rank = list;
    }

    public GamePlayStatObj setInventory_count(int i10) {
        this.inventory_count = i10;
        return this;
    }

    public GamePlayStatObj setInventory_list(List<InventoryObj> list) {
        this.inventory_list = list;
        return this;
    }

    public void setIs_owner(int i10) {
        this.is_owner = i10;
    }

    public void setMonthly_player(List<GameMonthlyPlayerInfoObj> list) {
        this.monthly_player = list;
    }

    public GamePlayStatObj setPlaytime_2weeks(String str) {
        this.playtime_2weeks = str;
        return this;
    }

    public GamePlayStatObj setPlaytime_forever(String str) {
        this.playtime_forever = str;
        return this;
    }

    public void setPlaytime_percent(String str) {
        this.playtime_percent = str;
    }

    public void setPlaytime_rank(String str) {
        this.playtime_rank = str;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setSteam_id_info(SteamIdInfoObj steamIdInfoObj) {
        this.steam_id_info = steamIdInfoObj;
    }

    public GamePlayStatObj setSummary_url(String str) {
        this.summary_url = str;
        return this;
    }

    public void setUser_num(GameUserNumObj gameUserNumObj) {
        this.user_num = gameUserNumObj;
    }

    public void setUser_rank(HeyboxRankObj heyboxRankObj) {
        this.user_rank = heyboxRankObj;
    }
}
