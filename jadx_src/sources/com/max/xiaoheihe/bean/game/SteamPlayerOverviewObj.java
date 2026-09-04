package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.account.AchieveObj;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.account.BadgeObj;
import com.max.xiaoheihe.bean.account.GameOverviewObj;
import com.max.xiaoheihe.bean.account.InventoryObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamAccounts;
import com.max.xiaoheihe.bean.game.pubg.VacStatsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SteamPlayerOverviewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2311921659253432125L;
    private int achieve_count;
    private List<AchieveObj> achieve_list;
    private String achieve_percent;
    private ActivityObj activity;
    private int badge_count;
    private List<BadgeObj> badge_list;
    private int card_count;
    private int dlc_count;
    private String friend_via_heybox_invite_url;
    private int game_count;
    private List<GameObj> game_list;
    private List<GameOverviewObj> game_overview;
    private int inventory_count;
    private List<InventoryObj> inventory_list;
    private boolean is_my_steam_friend;
    private String not_in_db_desc;
    private String online_state_url;
    private ScreenshotInfoObj screenshot_info;
    private String share_protocol;
    private SteamIdInfoObj steam_id_info;
    private String steam_value_tips;
    private SteamAccounts steamids;
    private String update_desc;
    private String update_state;
    private VacStatsObj vac_stats;

    public int getAchieve_count() {
        return this.achieve_count;
    }

    public List<AchieveObj> getAchieve_list() {
        return this.achieve_list;
    }

    public String getAchieve_percent() {
        return this.achieve_percent;
    }

    public ActivityObj getActivity() {
        return this.activity;
    }

    public int getBadge_count() {
        return this.badge_count;
    }

    public List<BadgeObj> getBadge_list() {
        return this.badge_list;
    }

    public int getCard_count() {
        return this.card_count;
    }

    public int getDlc_count() {
        return this.dlc_count;
    }

    public String getFriend_via_heybox_invite_url() {
        return this.friend_via_heybox_invite_url;
    }

    public int getGame_count() {
        return this.game_count;
    }

    public List<GameObj> getGame_list() {
        return this.game_list;
    }

    public List<GameOverviewObj> getGame_overview() {
        return this.game_overview;
    }

    public int getInventory_count() {
        return this.inventory_count;
    }

    public List<InventoryObj> getInventory_list() {
        return this.inventory_list;
    }

    public String getNot_in_db_desc() {
        return this.not_in_db_desc;
    }

    public String getOnline_state_url() {
        return this.online_state_url;
    }

    public ScreenshotInfoObj getScreenshot_info() {
        return this.screenshot_info;
    }

    public String getShare_protocol() {
        return this.share_protocol;
    }

    public SteamIdInfoObj getSteam_id_info() {
        return this.steam_id_info;
    }

    public String getSteam_value_tips() {
        return this.steam_value_tips;
    }

    public SteamAccounts getSteamids() {
        return this.steamids;
    }

    public String getUpdate_desc() {
        return this.update_desc;
    }

    public String getUpdate_state() {
        return this.update_state;
    }

    public VacStatsObj getVac_stats() {
        return this.vac_stats;
    }

    public boolean isIs_my_steam_friend() {
        return this.is_my_steam_friend;
    }

    public void setAchieve_count(int i10) {
        this.achieve_count = i10;
    }

    public void setAchieve_list(List<AchieveObj> list) {
        this.achieve_list = list;
    }

    public void setAchieve_percent(String str) {
        this.achieve_percent = str;
    }

    public void setActivity(ActivityObj activityObj) {
        this.activity = activityObj;
    }

    public void setBadge_count(int i10) {
        this.badge_count = i10;
    }

    public void setBadge_list(List<BadgeObj> list) {
        this.badge_list = list;
    }

    public void setCard_count(int i10) {
        this.card_count = i10;
    }

    public void setDlc_count(int i10) {
        this.dlc_count = i10;
    }

    public void setFriend_via_heybox_invite_url(String str) {
        this.friend_via_heybox_invite_url = str;
    }

    public void setGame_count(int i10) {
        this.game_count = i10;
    }

    public void setGame_list(List<GameObj> list) {
        this.game_list = list;
    }

    public void setGame_overview(List<GameOverviewObj> list) {
        this.game_overview = list;
    }

    public void setInventory_count(int i10) {
        this.inventory_count = i10;
    }

    public void setInventory_list(List<InventoryObj> list) {
        this.inventory_list = list;
    }

    public void setIs_my_steam_friend(boolean z10) {
        this.is_my_steam_friend = z10;
    }

    public void setNot_in_db_desc(String str) {
        this.not_in_db_desc = str;
    }

    public void setOnline_state_url(String str) {
        this.online_state_url = str;
    }

    public void setScreenshot_info(ScreenshotInfoObj screenshotInfoObj) {
        this.screenshot_info = screenshotInfoObj;
    }

    public void setShare_protocol(String str) {
        this.share_protocol = str;
    }

    public void setSteam_id_info(SteamIdInfoObj steamIdInfoObj) {
        this.steam_id_info = steamIdInfoObj;
    }

    public void setSteam_value_tips(String str) {
        this.steam_value_tips = str;
    }

    public void setSteamids(SteamAccounts steamAccounts) {
        this.steamids = steamAccounts;
    }

    public void setUpdate_desc(String str) {
        this.update_desc = str;
    }

    public void setUpdate_state(String str) {
        this.update_state = str;
    }

    public void setVac_stats(VacStatsObj vacStatsObj) {
        this.vac_stats = vacStatsObj;
    }
}
