package com.max.xiaoheihe.bean.account.steaminfo;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SteamPrivacyJsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 510685351131737126L;
    private String getSteamPrivacyJs;
    private String openSteamPrivacyJs;

    public String getGetSteamPrivacyJs() {
        return this.getSteamPrivacyJs;
    }

    public String getOpenSteamPrivacyJs() {
        return this.openSteamPrivacyJs;
    }

    public void setGetSteamPrivacyJs(String str) {
        this.getSteamPrivacyJs = str;
    }

    public void setOpenSteamPrivacyJs(String str) {
        this.openSteamPrivacyJs = str;
    }
}
