package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PlayInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String end_color;
    private double percent;
    private String playtime;
    private String playtime_2weeks;
    private String playtime_forever;
    private int rank;
    private String start_color;

    public String getEnd_color() {
        return this.end_color;
    }

    public double getPercent() {
        return this.percent;
    }

    public String getPlaytime() {
        return this.playtime;
    }

    public String getPlaytime_2weeks() {
        return this.playtime_2weeks;
    }

    public String getPlaytime_forever() {
        return this.playtime_forever;
    }

    public int getRank() {
        return this.rank;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setPercent(double d10) {
        this.percent = d10;
    }

    public void setPlaytime(String str) {
        this.playtime = str;
    }

    public void setPlaytime_2weeks(String str) {
        this.playtime_2weeks = str;
    }

    public void setPlaytime_forever(String str) {
        this.playtime_forever = str;
    }

    public void setRank(int i10) {
        this.rank = i10;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }
}
