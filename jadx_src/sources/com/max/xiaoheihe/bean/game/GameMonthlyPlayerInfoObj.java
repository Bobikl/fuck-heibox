package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class GameMonthlyPlayerInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avg_player;
    private String delta;
    private String delta_percent;
    private String month;
    private String peak_value;
    private String type;

    public String getAvg_player() {
        return this.avg_player;
    }

    public String getDelta() {
        return this.delta;
    }

    public String getDelta_percent() {
        return this.delta_percent;
    }

    public String getMonth() {
        return this.month;
    }

    public String getPeak_value() {
        return this.peak_value;
    }

    public String getType() {
        return this.type;
    }

    public void setAvg_player(String str) {
        this.avg_player = str;
    }

    public void setDelta(String str) {
        this.delta = str;
    }

    public void setDelta_percent(String str) {
        this.delta_percent = str;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public void setPeak_value(String str) {
        this.peak_value = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
