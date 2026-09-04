package com.max.xiaoheihe.bean;

import bb.c;
import com.max.xiaoheihe.bean.account.SteamNativeObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SteamNativeListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String game_count;
    private List<SteamNativeObj> players;

    public String getGame_count() {
        return this.game_count;
    }

    public List<SteamNativeObj> getPlayers() {
        return this.players;
    }

    public void setGame_count(String str) {
        this.game_count = str;
    }

    public SteamNativeListObj setPlayers(List<SteamNativeObj> list) {
        this.players = list;
        return this;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.mN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamNativeListObj{players=" + this.players + ", game_count='" + this.game_count + "'}";
    }
}
