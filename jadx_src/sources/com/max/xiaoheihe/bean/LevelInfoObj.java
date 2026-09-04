package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LevelInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8873678170850897882L;
    private String coin;
    private String exp;
    private String level;
    private String max_exp;
    private String next_level_desc;
    private String status;

    public String getCoin() {
        return this.coin;
    }

    public String getExp() {
        return this.exp;
    }

    public String getLevel() {
        return this.level;
    }

    public String getMax_exp() {
        return this.max_exp;
    }

    public String getNext_level_desc() {
        return this.next_level_desc;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setExp(String str) {
        this.exp = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setMax_exp(String str) {
        this.max_exp = str;
    }

    public void setNext_level_desc(String str) {
        this.next_level_desc = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
