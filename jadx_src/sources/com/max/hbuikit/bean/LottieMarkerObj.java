package com.max.hbuikit.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: UiKitLottieObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class LottieMarkerObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String dark_marker;

    @e
    private String light_marker;

    @e
    private String marker;

    public LottieMarkerObj(@e String str, @e String str2, @e String str3) {
        this.marker = str;
        this.light_marker = str2;
        this.dark_marker = str3;
    }

    public static /* synthetic */ LottieMarkerObj copy$default(LottieMarkerObj lottieMarkerObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lottieMarkerObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33487ck, new Class[]{LottieMarkerObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, LottieMarkerObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LottieMarkerObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = lottieMarkerObj.marker;
        }
        if ((i10 & 2) != 0) {
            str2 = lottieMarkerObj.light_marker;
        }
        if ((i10 & 4) != 0) {
            str3 = lottieMarkerObj.dark_marker;
        }
        return lottieMarkerObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.marker;
    }

    @e
    public final String component2() {
        return this.light_marker;
    }

    @e
    public final String component3() {
        return this.dark_marker;
    }

    @d
    public final LottieMarkerObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.k.f33464bk, new Class[]{String.class, String.class, String.class}, LottieMarkerObj.class);
        return patchProxyResultProxy.isSupported ? (LottieMarkerObj) patchProxyResultProxy.result : new LottieMarkerObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33557fk, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieMarkerObj)) {
            return false;
        }
        LottieMarkerObj lottieMarkerObj = (LottieMarkerObj) obj;
        return f0.g(this.marker, lottieMarkerObj.marker) && f0.g(this.light_marker, lottieMarkerObj.light_marker) && f0.g(this.dark_marker, lottieMarkerObj.dark_marker);
    }

    @e
    public final String getDark_marker() {
        return this.dark_marker;
    }

    @e
    public final String getLight_marker() {
        return this.light_marker;
    }

    @e
    public final String getMarker() {
        return this.marker;
    }

    @e
    public final String getTargetMarker(boolean z10) {
        boolean z11 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.k.f33441ak, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = z10 ? this.dark_marker : this.light_marker;
        if (str != null && !u.V1(str)) {
            z11 = false;
        }
        return z11 ? this.marker : str;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33534ek, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.marker;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.light_marker;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dark_marker;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDark_marker(@e String str) {
        this.dark_marker = str;
    }

    public final void setLight_marker(@e String str) {
        this.light_marker = str;
    }

    public final void setMarker(@e String str) {
        this.marker = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33511dk, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LottieMarkerObj(marker=" + this.marker + ", light_marker=" + this.light_marker + ", dark_marker=" + this.dark_marker + ')';
    }
}
