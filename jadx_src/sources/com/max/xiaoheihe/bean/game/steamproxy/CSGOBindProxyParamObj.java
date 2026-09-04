package com.max.xiaoheihe.bean.game.steamproxy;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CSGOBindProxyParamObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CSGOBindProxyParamObj extends BaseProxyParamObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private SteamAcceptGameParams bind_csgo;

    @e
    private SteamAcceptGameParams remember_js;

    /* JADX WARN: Multi-variable type inference failed */
    public CSGOBindProxyParamObj() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public CSGOBindProxyParamObj(@e SteamAcceptGameParams steamAcceptGameParams, @e SteamAcceptGameParams steamAcceptGameParams2) {
        super(null, null, null, null, null, null, null, null, null, 511, null);
        this.bind_csgo = steamAcceptGameParams;
        this.remember_js = steamAcceptGameParams2;
    }

    public /* synthetic */ CSGOBindProxyParamObj(SteamAcceptGameParams steamAcceptGameParams, SteamAcceptGameParams steamAcceptGameParams2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : steamAcceptGameParams, (i10 & 2) != 0 ? null : steamAcceptGameParams2);
    }

    public static /* synthetic */ CSGOBindProxyParamObj copy$default(CSGOBindProxyParamObj cSGOBindProxyParamObj, SteamAcceptGameParams steamAcceptGameParams, SteamAcceptGameParams steamAcceptGameParams2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cSGOBindProxyParamObj, steamAcceptGameParams, steamAcceptGameParams2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15418, new Class[]{CSGOBindProxyParamObj.class, SteamAcceptGameParams.class, SteamAcceptGameParams.class, Integer.TYPE, Object.class}, CSGOBindProxyParamObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CSGOBindProxyParamObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            steamAcceptGameParams = cSGOBindProxyParamObj.bind_csgo;
        }
        if ((i10 & 2) != 0) {
            steamAcceptGameParams2 = cSGOBindProxyParamObj.remember_js;
        }
        return cSGOBindProxyParamObj.copy(steamAcceptGameParams, steamAcceptGameParams2);
    }

    @e
    public final SteamAcceptGameParams component1() {
        return this.bind_csgo;
    }

    @e
    public final SteamAcceptGameParams component2() {
        return this.remember_js;
    }

    @d
    public final CSGOBindProxyParamObj copy(@e SteamAcceptGameParams steamAcceptGameParams, @e SteamAcceptGameParams steamAcceptGameParams2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamAcceptGameParams, steamAcceptGameParams2}, this, changeQuickRedirect, false, 15417, new Class[]{SteamAcceptGameParams.class, SteamAcceptGameParams.class}, CSGOBindProxyParamObj.class);
        return patchProxyResultProxy.isSupported ? (CSGOBindProxyParamObj) patchProxyResultProxy.result : new CSGOBindProxyParamObj(steamAcceptGameParams, steamAcceptGameParams2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15421, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CSGOBindProxyParamObj)) {
            return false;
        }
        CSGOBindProxyParamObj cSGOBindProxyParamObj = (CSGOBindProxyParamObj) obj;
        return f0.g(this.bind_csgo, cSGOBindProxyParamObj.bind_csgo) && f0.g(this.remember_js, cSGOBindProxyParamObj.remember_js);
    }

    @e
    public final SteamAcceptGameParams getBind_csgo() {
        return this.bind_csgo;
    }

    @e
    public final SteamAcceptGameParams getRemember_js() {
        return this.remember_js;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15420, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        SteamAcceptGameParams steamAcceptGameParams = this.bind_csgo;
        int iHashCode = (steamAcceptGameParams == null ? 0 : steamAcceptGameParams.hashCode()) * 31;
        SteamAcceptGameParams steamAcceptGameParams2 = this.remember_js;
        return iHashCode + (steamAcceptGameParams2 != null ? steamAcceptGameParams2.hashCode() : 0);
    }

    public final void setBind_csgo(@e SteamAcceptGameParams steamAcceptGameParams) {
        this.bind_csgo = steamAcceptGameParams;
    }

    public final void setRemember_js(@e SteamAcceptGameParams steamAcceptGameParams) {
        this.remember_js = steamAcceptGameParams;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15419, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CSGOBindProxyParamObj(bind_csgo=" + this.bind_csgo + ", remember_js=" + this.remember_js + ')';
    }
}
