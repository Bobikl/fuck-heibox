package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGMatchPlayerObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 17842084070788611L;
    private String account_id;
    private String avatar;
    private String nickname;
    private String steam_id;

    public String getAccount_id() {
        return this.account_id;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSteam_id() {
        return this.steam_id;
    }

    public void setAccount_id(String str) {
        this.account_id = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }
}
