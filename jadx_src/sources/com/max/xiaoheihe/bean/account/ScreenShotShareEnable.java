package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenShotShareEnable.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ScreenShotShareEnable implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String game_detail;

    public ScreenShotShareEnable(@e String str) {
        this.game_detail = str;
    }

    public static /* synthetic */ ScreenShotShareEnable copy$default(ScreenShotShareEnable screenShotShareEnable, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenShotShareEnable, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 13940, new Class[]{ScreenShotShareEnable.class, String.class, Integer.TYPE, Object.class}, ScreenShotShareEnable.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenShotShareEnable) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = screenShotShareEnable.game_detail;
        }
        return screenShotShareEnable.copy(str);
    }

    @e
    public final String component1() {
        return this.game_detail;
    }

    @d
    public final ScreenShotShareEnable copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13939, new Class[]{String.class}, ScreenShotShareEnable.class);
        return patchProxyResultProxy.isSupported ? (ScreenShotShareEnable) patchProxyResultProxy.result : new ScreenShotShareEnable(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13943, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenShotShareEnable) && f0.g(this.game_detail, ((ScreenShotShareEnable) obj).game_detail);
    }

    @e
    public final String getGame_detail() {
        return this.game_detail;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13942, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.game_detail;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setGame_detail(@e String str) {
        this.game_detail = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13941, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenShotShareEnable(game_detail=" + this.game_detail + ')';
    }
}
