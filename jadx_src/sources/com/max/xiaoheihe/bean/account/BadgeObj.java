package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BadgeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String image_url;
    private String level;
    private String name;
    private String xp;

    public String getImage_url() {
        return this.image_url;
    }

    public String getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public String getXp() {
        return this.xp;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setXp(String str) {
        this.xp = str;
    }
}
