package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OnlineStateSettingObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class OnlineStateSettingObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String display_current_music;

    @e
    private String display_current_playing_game;

    @e
    private String online_state;

    public OnlineStateSettingObj(@e String str, @e String str2, @e String str3) {
        this.online_state = str;
        this.display_current_playing_game = str2;
        this.display_current_music = str3;
    }

    public static /* synthetic */ OnlineStateSettingObj copy$default(OnlineStateSettingObj onlineStateSettingObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onlineStateSettingObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 13890, new Class[]{OnlineStateSettingObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, OnlineStateSettingObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OnlineStateSettingObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = onlineStateSettingObj.online_state;
        }
        if ((i10 & 2) != 0) {
            str2 = onlineStateSettingObj.display_current_playing_game;
        }
        if ((i10 & 4) != 0) {
            str3 = onlineStateSettingObj.display_current_music;
        }
        return onlineStateSettingObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.online_state;
    }

    @e
    public final String component2() {
        return this.display_current_playing_game;
    }

    @e
    public final String component3() {
        return this.display_current_music;
    }

    @d
    public final OnlineStateSettingObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 13889, new Class[]{String.class, String.class, String.class}, OnlineStateSettingObj.class);
        return patchProxyResultProxy.isSupported ? (OnlineStateSettingObj) patchProxyResultProxy.result : new OnlineStateSettingObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13893, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnlineStateSettingObj)) {
            return false;
        }
        OnlineStateSettingObj onlineStateSettingObj = (OnlineStateSettingObj) obj;
        return f0.g(this.online_state, onlineStateSettingObj.online_state) && f0.g(this.display_current_playing_game, onlineStateSettingObj.display_current_playing_game) && f0.g(this.display_current_music, onlineStateSettingObj.display_current_music);
    }

    @e
    public final String getDisplay_current_music() {
        return this.display_current_music;
    }

    @e
    public final String getDisplay_current_playing_game() {
        return this.display_current_playing_game;
    }

    @e
    public final String getOnline_state() {
        return this.online_state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13892, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.online_state;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.display_current_playing_game;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.display_current_music;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDisplay_current_music(@e String str) {
        this.display_current_music = str;
    }

    public final void setDisplay_current_playing_game(@e String str) {
        this.display_current_playing_game = str;
    }

    public final void setOnline_state(@e String str) {
        this.online_state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13891, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OnlineStateSettingObj(online_state=" + this.online_state + ", display_current_playing_game=" + this.display_current_playing_game + ", display_current_music=" + this.display_current_music + ')';
    }
}
