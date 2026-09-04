package com.max.xiaoheihe.bean.game.ow;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.game.GameGridDataCardObj;
import com.max.xiaoheihe.bean.game.ac.AcContentMenuObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OWPlayerOverviewObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private OWAchievementsObj achievements;
    private ActivityObj activity;
    private List<OWPlayerHeroObj> heros;
    private String is_me;
    private List<KeyDescObj> medal;
    private List<AcContentMenuObj> menu;
    private String message;
    private String message_time;
    private OWPlayerInfoObj player_info;
    private List<OWSeasonObj> seasons;
    private String show_hero_dtl;
    private List<GameGridDataCardObj> summary;
    private String update;
    private String update_desc;

    public OWAchievementsObj getAchievements() {
        return this.achievements;
    }

    public ActivityObj getActivity() {
        return this.activity;
    }

    public List<OWPlayerHeroObj> getHeros() {
        return this.heros;
    }

    public String getIs_me() {
        return this.is_me;
    }

    public List<KeyDescObj> getMedal() {
        return this.medal;
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

    public OWPlayerInfoObj getPlayer_info() {
        return this.player_info;
    }

    public List<OWSeasonObj> getSeasons() {
        return this.seasons;
    }

    public String getShow_hero_dtl() {
        return this.show_hero_dtl;
    }

    public List<GameGridDataCardObj> getSummary() {
        return this.summary;
    }

    public String getUpdate() {
        return this.update;
    }

    public String getUpdate_desc() {
        return this.update_desc;
    }

    public void setAchievements(OWAchievementsObj oWAchievementsObj) {
        this.achievements = oWAchievementsObj;
    }

    public void setActivity(ActivityObj activityObj) {
        this.activity = activityObj;
    }

    public void setHeros(List<OWPlayerHeroObj> list) {
        this.heros = list;
    }

    public void setIs_me(String str) {
        this.is_me = str;
    }

    public void setMedal(List<KeyDescObj> list) {
        this.medal = list;
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

    public void setPlayer_info(OWPlayerInfoObj oWPlayerInfoObj) {
        this.player_info = oWPlayerInfoObj;
    }

    public void setSeasons(List<OWSeasonObj> list) {
        this.seasons = list;
    }

    public void setShow_hero_dtl(String str) {
        this.show_hero_dtl = str;
    }

    public void setSummary(List<GameGridDataCardObj> list) {
        this.summary = list;
    }

    public void setUpdate(String str) {
        this.update = str;
    }

    public void setUpdate_desc(String str) {
        this.update_desc = str;
    }
}
