package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class MallSteamInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avatar;
    private String cookie;
    private String nickname;
    private String steamid;
    private boolean valid;

    public String getAvatar() {
        return this.avatar;
    }

    public String getCookie() {
        return this.cookie;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSteamid() {
        return this.steamid;
    }

    public boolean isValid() {
        return this.valid;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCookie(String str) {
        this.cookie = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }

    public void setValid(boolean z10) {
        this.valid = z10;
    }
}
