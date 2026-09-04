package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SteamApiStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamApiStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean need_reset;

    @e
    private String protocol;

    public SteamApiStateObj(boolean z10, @e String str) {
        this.need_reset = z10;
        this.protocol = str;
    }

    public /* synthetic */ SteamApiStateObj(boolean z10, String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, str);
    }

    public static /* synthetic */ SteamApiStateObj copy$default(SteamApiStateObj steamApiStateObj, boolean z10, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamApiStateObj, new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14056, new Class[]{SteamApiStateObj.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, SteamApiStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamApiStateObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = steamApiStateObj.need_reset;
        }
        if ((i10 & 2) != 0) {
            str = steamApiStateObj.protocol;
        }
        return steamApiStateObj.copy(z10, str);
    }

    public final boolean component1() {
        return this.need_reset;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @d
    public final SteamApiStateObj copy(boolean z10, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 14055, new Class[]{Boolean.TYPE, String.class}, SteamApiStateObj.class);
        return patchProxyResultProxy.isSupported ? (SteamApiStateObj) patchProxyResultProxy.result : new SteamApiStateObj(z10, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14059, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamApiStateObj)) {
            return false;
        }
        SteamApiStateObj steamApiStateObj = (SteamApiStateObj) obj;
        return this.need_reset == steamApiStateObj.need_reset && f0.g(this.protocol, steamApiStateObj.protocol);
    }

    public final boolean getNeed_reset() {
        return this.need_reset;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14058, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.need_reset;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = r10 * 31;
        String str = this.protocol;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final void setNeed_reset(boolean z10) {
        this.need_reset = z10;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14057, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamApiStateObj(need_reset=" + this.need_reset + ", protocol=" + this.protocol + ')';
    }
}
