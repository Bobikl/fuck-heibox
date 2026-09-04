package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGStatsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc;
    private String img;
    private List<PUBGDataObj> overview;
    private String score;
    private String score_value;

    public String getDesc() {
        return this.desc;
    }

    public String getImg() {
        return this.img;
    }

    public List<PUBGDataObj> getOverview() {
        return this.overview;
    }

    public String getScore() {
        return this.score;
    }

    public String getScore_value() {
        return this.score_value;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setOverview(List<PUBGDataObj> list) {
        this.overview = list;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setScore_value(String str) {
        this.score_value = str;
    }
}
