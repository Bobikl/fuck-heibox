package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class UserGroupInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6390788972031007726L;
    private String display_purchase_guarantee;
    private String display_steam_icon;
    private String display_steam_msg;
    private String display_steam_preview;

    public String getDisplay_purchase_guarantee() {
        return this.display_purchase_guarantee;
    }

    public String getDisplay_steam_icon() {
        return this.display_steam_icon;
    }

    public String getDisplay_steam_msg() {
        return this.display_steam_msg;
    }

    public String getDisplay_steam_preview() {
        return this.display_steam_preview;
    }

    public void setDisplay_purchase_guarantee(String str) {
        this.display_purchase_guarantee = str;
    }

    public void setDisplay_steam_icon(String str) {
        this.display_steam_icon = str;
    }

    public void setDisplay_steam_msg(String str) {
        this.display_steam_msg = str;
    }

    public void setDisplay_steam_preview(String str) {
        this.display_steam_preview = str;
    }
}
