package com.max.xiaoheihe.bean.account;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameAchievementObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int achieved;
    private String achieved_point;
    private String achieved_rank;
    private int achievement_count;
    private String appicon;

    @SerializedName(alternate = {d0.f87248t}, value = "appid")
    @JSONField(alternateNames = {d0.f87248t}, name = "appid")
    private String appid;
    private String background;
    private List<String> genres;
    private int has_achievement;
    private int has_game_detail;
    private String image;
    private boolean is_free;
    private List<AchieveObj> items;
    private String name;
    private String peak_user_num;
    private List<?> platforms;
    private String playtime_forever;
    private String release_date;
    private String score;
    private String type;

    public int getAchieved() {
        return this.achieved;
    }

    public String getAchieved_point() {
        return this.achieved_point;
    }

    public String getAchieved_rank() {
        return this.achieved_rank;
    }

    public int getAchievement_count() {
        return this.achievement_count;
    }

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBackground() {
        return this.background;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    public int getHas_achievement() {
        return this.has_achievement;
    }

    public int getHas_game_detail() {
        return this.has_game_detail;
    }

    public String getImage() {
        return this.image;
    }

    public List<AchieveObj> getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public String getPeak_user_num() {
        return this.peak_user_num;
    }

    public List<?> getPlatforms() {
        return this.platforms;
    }

    public String getPlaytime_forever() {
        return this.playtime_forever;
    }

    public String getRelease_date() {
        return this.release_date;
    }

    public String getScore() {
        return this.score;
    }

    public String getType() {
        return this.type;
    }

    public boolean isIs_free() {
        return this.is_free;
    }

    public boolean is_free() {
        return this.is_free;
    }

    public void setAchieved(int i10) {
        this.achieved = i10;
    }

    public void setAchieved_point(String str) {
        this.achieved_point = str;
    }

    public void setAchieved_rank(String str) {
        this.achieved_rank = str;
    }

    public void setAchievement_count(int i10) {
        this.achievement_count = i10;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setGenres(List<String> list) {
        this.genres = list;
    }

    public void setHas_achievement(int i10) {
        this.has_achievement = i10;
    }

    public void setHas_game_detail(int i10) {
        this.has_game_detail = i10;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setIs_free(boolean z10) {
        this.is_free = z10;
    }

    public void setItems(List<AchieveObj> list) {
        this.items = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPeak_user_num(String str) {
        this.peak_user_num = str;
    }

    public void setPlatforms(List<?> list) {
        this.platforms = list;
    }

    public void setPlaytime_forever(String str) {
        this.playtime_forever = str;
    }

    public void setRelease_date(String str) {
        this.release_date = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
