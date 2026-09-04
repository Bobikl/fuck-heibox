package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6RadarDataObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc1;
    private String desc2;
    private String main1;
    private String main2;
    private String percent1;
    private String percent2;
    private List<R6KVObj> score;
    private String tips;
    private String tips_title;

    public String getDesc1() {
        return this.desc1;
    }

    public String getDesc2() {
        return this.desc2;
    }

    public String getMain1() {
        return this.main1;
    }

    public String getMain2() {
        return this.main2;
    }

    public String getPercent1() {
        return this.percent1;
    }

    public String getPercent2() {
        return this.percent2;
    }

    public List<R6KVObj> getScore() {
        return this.score;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTips_title() {
        return this.tips_title;
    }

    public void setDesc1(String str) {
        this.desc1 = str;
    }

    public void setDesc2(String str) {
        this.desc2 = str;
    }

    public void setMain1(String str) {
        this.main1 = str;
    }

    public void setMain2(String str) {
        this.main2 = str;
    }

    public void setPercent1(String str) {
        this.percent1 = str;
    }

    public void setPercent2(String str) {
        this.percent2 = str;
    }

    public void setScore(List<R6KVObj> list) {
        this.score = list;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTips_title(String str) {
        this.tips_title = str;
    }
}
