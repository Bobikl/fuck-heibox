package com.max.xiaoheihe.bean.game.csgob5;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CSGOB5MatchObj {
    public static final String MATCH_LOST = "0";
    public static final String MATCH_TIED = "2";
    public static final String MATCH_WON = "1";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String assist;
    private String class_name;
    private String death;
    private String detail_url;
    private String elo;
    private String elo_change;
    private String elo_desc;
    private String elo_img;
    private String kill;
    private String map_color;
    private String map_name;
    private String match_id;
    private String rank;
    private String rating;
    private String score;
    private List<String> settlement;
    private String time;
    private String win;

    public String getAssist() {
        return this.assist;
    }

    public String getClass_name() {
        return this.class_name;
    }

    public String getDeath() {
        return this.death;
    }

    public String getDetail_url() {
        return this.detail_url;
    }

    public String getElo() {
        return this.elo;
    }

    public String getElo_change() {
        return this.elo_change;
    }

    public String getElo_desc() {
        return this.elo_desc;
    }

    public String getElo_img() {
        return this.elo_img;
    }

    public String getKill() {
        return this.kill;
    }

    public String getMap_color() {
        return this.map_color;
    }

    public String getMap_name() {
        return this.map_name;
    }

    public String getMatch_id() {
        return this.match_id;
    }

    public String getRank() {
        return this.rank;
    }

    public String getRating() {
        return this.rating;
    }

    public String getScore() {
        return this.score;
    }

    public List<String> getSettlement() {
        return this.settlement;
    }

    public String getTime() {
        return this.time;
    }

    public String getWin() {
        return this.win;
    }

    public void setAssist(String str) {
        this.assist = str;
    }

    public void setClass_name(String str) {
        this.class_name = str;
    }

    public void setDeath(String str) {
        this.death = str;
    }

    public void setDetail_url(String str) {
        this.detail_url = str;
    }

    public void setElo(String str) {
        this.elo = str;
    }

    public void setElo_change(String str) {
        this.elo_change = str;
    }

    public void setElo_desc(String str) {
        this.elo_desc = str;
    }

    public void setElo_img(String str) {
        this.elo_img = str;
    }

    public void setKill(String str) {
        this.kill = str;
    }

    public void setMap_color(String str) {
        this.map_color = str;
    }

    public void setMap_name(String str) {
        this.map_name = str;
    }

    public void setMatch_id(String str) {
        this.match_id = str;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public void setRating(String str) {
        this.rating = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setSettlement(List<String> list) {
        this.settlement = list;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setWin(String str) {
        this.win = str;
    }
}
