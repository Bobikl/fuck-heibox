package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGGameModeObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String color;
    private String match_count;
    private String mode;
    private String mode_desc;
    private String mode_icon;
    private String mode_img;
    private String rating_desc;
    private String rating_img;
    private String score;
    private String season;
    private List<PUBGDataObj> values;

    public String getColor() {
        return this.color;
    }

    public String getMatch_count() {
        return this.match_count;
    }

    public String getMode() {
        return this.mode;
    }

    public String getMode_desc() {
        return this.mode_desc;
    }

    public String getMode_icon() {
        return this.mode_icon;
    }

    public String getMode_img() {
        return this.mode_img;
    }

    public String getRating_desc() {
        return this.rating_desc;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public String getScore() {
        return this.score;
    }

    public String getSeason() {
        return this.season;
    }

    public List<PUBGDataObj> getValues() {
        return this.values;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setMatch_count(String str) {
        this.match_count = str;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMode_desc(String str) {
        this.mode_desc = str;
    }

    public void setMode_icon(String str) {
        this.mode_icon = str;
    }

    public void setMode_img(String str) {
        this.mode_img = str;
    }

    public void setRating_desc(String str) {
        this.rating_desc = str;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setSeason(String str) {
        this.season = str;
    }

    public void setValues(List<PUBGDataObj> list) {
        this.values = list;
    }
}
