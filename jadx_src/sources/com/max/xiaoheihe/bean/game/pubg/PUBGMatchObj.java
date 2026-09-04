package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGMatchObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -22267799978279175L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f76981d;
    private String damage_dealt;
    private String desc;
    private String download_url;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f76982k;

    /* JADX INFO: renamed from: kd, reason: collision with root package name */
    private String f76983kd;
    private String map_color;
    private String map_name;
    private String matchId;
    private String match_count;
    private String mode;
    private String mode_img;
    private PUBGMatchPlayerObj player_info;
    private String protocol;
    private String rank;
    private String rating;
    private String rating_diff;
    private String rating_trend;
    private String record_time;
    private String region;
    private String region_desc;
    private String score;
    private String season;
    private String season_desc;
    private String tag;
    private String tag_desc;
    private String team_count;
    private String time;
    private String title;

    public String getD() {
        return this.f76981d;
    }

    public String getDamage_dealt() {
        return this.damage_dealt;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDownload_url() {
        return this.download_url;
    }

    public String getK() {
        return this.f76982k;
    }

    public String getKd() {
        return this.f76983kd;
    }

    public String getMap_color() {
        return this.map_color;
    }

    public String getMap_name() {
        return this.map_name;
    }

    public String getMatchId() {
        return this.matchId;
    }

    public String getMatch_count() {
        return this.match_count;
    }

    public String getMode() {
        return this.mode;
    }

    public String getMode_img() {
        return this.mode_img;
    }

    public PUBGMatchPlayerObj getPlayer_info() {
        return this.player_info;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getRank() {
        return this.rank;
    }

    public String getRating() {
        return this.rating;
    }

    public String getRating_diff() {
        return this.rating_diff;
    }

    public String getRating_trend() {
        return this.rating_trend;
    }

    public String getRecord_time() {
        return this.record_time;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegion_desc() {
        return this.region_desc;
    }

    public String getScore() {
        return this.score;
    }

    public String getSeason() {
        return this.season;
    }

    public String getSeason_desc() {
        return this.season_desc;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTag_desc() {
        return this.tag_desc;
    }

    public String getTeam_count() {
        return this.team_count;
    }

    public String getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public void setD(String str) {
        this.f76981d = str;
    }

    public void setDamage_dealt(String str) {
        this.damage_dealt = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public void setK(String str) {
        this.f76982k = str;
    }

    public void setKd(String str) {
        this.f76983kd = str;
    }

    public void setMap_color(String str) {
        this.map_color = str;
    }

    public void setMap_name(String str) {
        this.map_name = str;
    }

    public void setMatchId(String str) {
        this.matchId = str;
    }

    public void setMatch_count(String str) {
        this.match_count = str;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMode_img(String str) {
        this.mode_img = str;
    }

    public void setPlayer_info(PUBGMatchPlayerObj pUBGMatchPlayerObj) {
        this.player_info = pUBGMatchPlayerObj;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public void setRating(String str) {
        this.rating = str;
    }

    public void setRating_diff(String str) {
        this.rating_diff = str;
    }

    public void setRating_trend(String str) {
        this.rating_trend = str;
    }

    public void setRecord_time(String str) {
        this.record_time = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegion_desc(String str) {
        this.region_desc = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setSeason(String str) {
        this.season = str;
    }

    public void setSeason_desc(String str) {
        this.season_desc = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTag_desc(String str) {
        this.tag_desc = str;
    }

    public void setTeam_count(String str) {
        this.team_count = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15293, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PUBGMatchObj{d='" + this.f76981d + "', k='" + this.f76982k + "', kd='" + this.f76983kd + "'}";
    }
}
