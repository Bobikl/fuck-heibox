package com.max.xiaoheihe.bean.game.ow;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class OWPlayerRankObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String latest;
    private String level;
    private String level_rank;
    private String rank_img;
    private String season;

    public String getLatest() {
        return this.latest;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLevel_rank() {
        return this.level_rank;
    }

    public String getRank_img() {
        return this.rank_img;
    }

    public String getSeason() {
        return this.season;
    }

    public void setLatest(String str) {
        this.latest = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevel_rank(String str) {
        this.level_rank = str;
    }

    public void setRank_img(String str) {
        this.rank_img = str;
    }

    public void setSeason(String str) {
        this.season = str;
    }
}
