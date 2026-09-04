package com.max.xiaoheihe.bean.game.csgob5;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.game.ac.AcContentMenuObj;
import com.max.xiaoheihe.bean.game.gamedata.GameDataTrendInfoObj;
import com.max.xiaoheihe.bean.game.gamedata.RadarInfoObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameStatsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CSGOB5PlayerOverviewObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ActivityObj activity;
    private CSGOB5CareerObj career;
    private KeyDescObj cur_level;
    private KeyDescObj cur_season;
    private String download_url;
    private String faq;
    private List<KeyDescObj> levels;
    private List<CSGOB5MatchObj> matches;
    private List<AcContentMenuObj> menu;
    private String message;
    private String message_time;
    private PlayerInfoObj player_info;
    private RadarInfoObj radar_info;
    private List<KeyDescObj> seasons;
    private String shade;
    private PUBGGameStatsObj stats;
    private GameDataTrendInfoObj trend;
    private String update_btn_desc;
    private String update_btn_state;
    private String update_desc;
    private List<CSGOB5WeaponObj> weapons;

    public ActivityObj getActivity() {
        return this.activity;
    }

    public CSGOB5CareerObj getCareer() {
        return this.career;
    }

    public KeyDescObj getCur_level() {
        return this.cur_level;
    }

    public KeyDescObj getCur_season() {
        return this.cur_season;
    }

    public String getDownload_url() {
        return this.download_url;
    }

    public String getFaq() {
        return this.faq;
    }

    public List<KeyDescObj> getLevels() {
        return this.levels;
    }

    public List<CSGOB5MatchObj> getMatches() {
        return this.matches;
    }

    public List<AcContentMenuObj> getMenu() {
        return this.menu;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage_time() {
        return this.message_time;
    }

    public PlayerInfoObj getPlayer_info() {
        return this.player_info;
    }

    public RadarInfoObj getRadar_info() {
        return this.radar_info;
    }

    public List<KeyDescObj> getSeasons() {
        return this.seasons;
    }

    public String getShade() {
        return this.shade;
    }

    public PUBGGameStatsObj getStats() {
        return this.stats;
    }

    public GameDataTrendInfoObj getTrend() {
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

    public List<CSGOB5WeaponObj> getWeapons() {
        return this.weapons;
    }

    public void setActivity(ActivityObj activityObj) {
        this.activity = activityObj;
    }

    public void setCareer(CSGOB5CareerObj cSGOB5CareerObj) {
        this.career = cSGOB5CareerObj;
    }

    public void setCur_level(KeyDescObj keyDescObj) {
        this.cur_level = keyDescObj;
    }

    public void setCur_season(KeyDescObj keyDescObj) {
        this.cur_season = keyDescObj;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public void setFaq(String str) {
        this.faq = str;
    }

    public void setLevels(List<KeyDescObj> list) {
        this.levels = list;
    }

    public void setMatches(List<CSGOB5MatchObj> list) {
        this.matches = list;
    }

    public void setMenu(List<AcContentMenuObj> list) {
        this.menu = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessage_time(String str) {
        this.message_time = str;
    }

    public void setPlayer_info(PlayerInfoObj playerInfoObj) {
        this.player_info = playerInfoObj;
    }

    public void setRadar_info(RadarInfoObj radarInfoObj) {
        this.radar_info = radarInfoObj;
    }

    public void setSeasons(List<KeyDescObj> list) {
        this.seasons = list;
    }

    public void setShade(String str) {
        this.shade = str;
    }

    public void setStats(PUBGGameStatsObj pUBGGameStatsObj) {
        this.stats = pUBGGameStatsObj;
    }

    public void setTrend(GameDataTrendInfoObj gameDataTrendInfoObj) {
        this.trend = gameDataTrendInfoObj;
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

    public void setWeapons(List<CSGOB5WeaponObj> list) {
        this.weapons = list;
    }
}
