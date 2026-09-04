package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameOverviewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String color;
    private String delta;
    private String desc;
    private String key;
    private String rank;
    private String value;

    public String getColor() {
        return this.color;
    }

    public String getDelta() {
        return this.delta;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getKey() {
        return this.key;
    }

    public String getRank() {
        return this.rank;
    }

    public String getValue() {
        return this.value;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setDelta(String str) {
        this.delta = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
