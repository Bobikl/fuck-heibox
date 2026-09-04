package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamReviewInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamReviewInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String steam_review;

    public SteamReviewInfo(@e String str) {
        this.steam_review = str;
    }

    public static /* synthetic */ SteamReviewInfo copy$default(SteamReviewInfo steamReviewInfo, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamReviewInfo, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15004, new Class[]{SteamReviewInfo.class, String.class, Integer.TYPE, Object.class}, SteamReviewInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamReviewInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = steamReviewInfo.steam_review;
        }
        return steamReviewInfo.copy(str);
    }

    @e
    public final String component1() {
        return this.steam_review;
    }

    @d
    public final SteamReviewInfo copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15003, new Class[]{String.class}, SteamReviewInfo.class);
        return patchProxyResultProxy.isSupported ? (SteamReviewInfo) patchProxyResultProxy.result : new SteamReviewInfo(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15007, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SteamReviewInfo) && f0.g(this.steam_review, ((SteamReviewInfo) obj).steam_review);
    }

    @e
    public final String getSteam_review() {
        return this.steam_review;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15006, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.steam_review;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSteam_review(@e String str) {
        this.steam_review = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15005, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamReviewInfo(steam_review=" + this.steam_review + ')';
    }
}
