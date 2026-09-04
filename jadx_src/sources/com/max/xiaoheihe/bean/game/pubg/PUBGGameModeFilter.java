package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGGameModeFilter implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5348769792943379070L;
    private String color;
    private boolean custom_checked;
    private String key;
    private String match_count;
    private String rating_img;
    private String value;

    public String getColor() {
        return this.color;
    }

    public String getKey() {
        return this.key;
    }

    public String getMatch_count() {
        return this.match_count;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isCustom_checked() {
        return this.custom_checked;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setCustom_checked(boolean z10) {
        this.custom_checked = z10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMatch_count(String str) {
        this.match_count = str;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
