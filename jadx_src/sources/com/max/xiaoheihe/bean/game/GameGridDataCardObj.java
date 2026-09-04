package com.max.xiaoheihe.bean.game;

import com.alibaba.fastjson.annotation.JSONField;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameGridDataCardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6672540606749198615L;
    private String desc;
    private String icon;

    @JSONField(alternateNames = {"k"}, name = "key")
    private String key;
    private String rank;
    private String rank_desc;
    private String rating_img;
    private String score;

    @JSONField(alternateNames = {"v"}, name = "value")
    private String value;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14826, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameGridDataCardObj)) {
            return false;
        }
        GameGridDataCardObj gameGridDataCardObj = (GameGridDataCardObj) obj;
        String str = this.key;
        return str != null && str.equals(gameGridDataCardObj.key);
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getKey() {
        return this.key;
    }

    public String getRank() {
        return this.rank;
    }

    public String getRank_desc() {
        return this.rank_desc;
    }

    public String getRating_img() {
        return this.rating_img;
    }

    public String getScore() {
        return this.score;
    }

    public String getValue() {
        return this.value;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public void setRank_desc(String str) {
        this.rank_desc = str;
    }

    public void setRating_img(String str) {
        this.rating_img = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
