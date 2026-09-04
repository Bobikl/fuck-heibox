package com.max.xiaoheihe.module.account.mine;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.SteamNativeListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SteamPoweredApiCache.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class SteamApiResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79055d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private SteamNativeListObj f79056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f79057c;

    public SteamApiResponse(@dl.e SteamNativeListObj steamNativeListObj, long j10) {
        this.f79056b = steamNativeListObj;
        this.f79057c = j10;
    }

    public /* synthetic */ SteamApiResponse(SteamNativeListObj steamNativeListObj, long j10, int i10, u uVar) {
        this(steamNativeListObj, (i10 & 2) != 0 ? 0L : j10);
    }

    public static /* synthetic */ SteamApiResponse d(SteamApiResponse steamApiResponse, SteamNativeListObj steamNativeListObj, long j10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamApiResponse, steamNativeListObj, new Long(j10), new Integer(i10), obj}, null, changeQuickRedirect, true, 25084, new Class[]{SteamApiResponse.class, SteamNativeListObj.class, Long.TYPE, Integer.TYPE, Object.class}, SteamApiResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamApiResponse) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            steamNativeListObj = steamApiResponse.f79056b;
        }
        if ((i10 & 2) != 0) {
            j10 = steamApiResponse.f79057c;
        }
        return steamApiResponse.c(steamNativeListObj, j10);
    }

    @dl.e
    public final SteamNativeListObj a() {
        return this.f79056b;
    }

    public final long b() {
        return this.f79057c;
    }

    @dl.d
    public final SteamApiResponse c(@dl.e SteamNativeListObj steamNativeListObj, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamNativeListObj, new Long(j10)}, this, changeQuickRedirect, false, 25083, new Class[]{SteamNativeListObj.class, Long.TYPE}, SteamApiResponse.class);
        return patchProxyResultProxy.isSupported ? (SteamApiResponse) patchProxyResultProxy.result : new SteamApiResponse(steamNativeListObj, j10);
    }

    public final long e() {
        return this.f79057c;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25087, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamApiResponse)) {
            return false;
        }
        SteamApiResponse steamApiResponse = (SteamApiResponse) obj;
        return f0.g(this.f79056b, steamApiResponse.f79056b) && this.f79057c == steamApiResponse.f79057c;
    }

    @dl.e
    public final SteamNativeListObj f() {
        return this.f79056b;
    }

    public final void g(long j10) {
        this.f79057c = j10;
    }

    public final void h(@dl.e SteamNativeListObj steamNativeListObj) {
        this.f79056b = steamNativeListObj;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25086, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        SteamNativeListObj steamNativeListObj = this.f79056b;
        return ((steamNativeListObj != null ? steamNativeListObj.hashCode() : 0) * 31) + androidx.collection.k.a(this.f79057c);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25085, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamApiResponse(steamNativeListObj=" + this.f79056b + ", receivedResponseMillis=" + this.f79057c + ')';
    }
}
