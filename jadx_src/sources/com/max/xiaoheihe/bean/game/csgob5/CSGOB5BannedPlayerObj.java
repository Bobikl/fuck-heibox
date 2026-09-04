package com.max.xiaoheihe.bean.game.csgob5;

import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class CSGOB5BannedPlayerObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String banned_time;
    private PlayerInfoObj player_info;

    public String getBanned_time() {
        return this.banned_time;
    }

    public PlayerInfoObj getPlayer_info() {
        return this.player_info;
    }

    public void setBanned_time(String str) {
        this.banned_time = str;
    }

    public void setPlayer_info(PlayerInfoObj playerInfoObj) {
        this.player_info = playerInfoObj;
    }
}
