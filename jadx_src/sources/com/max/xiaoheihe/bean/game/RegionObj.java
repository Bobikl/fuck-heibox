package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PriceHistoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RegionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String region;

    public RegionObj(@e String str, @e String str2) {
        this.region = str;
        this.desc = str2;
    }

    public static /* synthetic */ RegionObj copy$default(RegionObj regionObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{regionObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14984, new Class[]{RegionObj.class, String.class, String.class, Integer.TYPE, Object.class}, RegionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RegionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = regionObj.region;
        }
        if ((i10 & 2) != 0) {
            str2 = regionObj.desc;
        }
        return regionObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.region;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final RegionObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14983, new Class[]{String.class, String.class}, RegionObj.class);
        return patchProxyResultProxy.isSupported ? (RegionObj) patchProxyResultProxy.result : new RegionObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14987, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionObj)) {
            return false;
        }
        RegionObj regionObj = (RegionObj) obj;
        return f0.g(this.region, regionObj.region) && f0.g(this.desc, regionObj.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14986, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.region;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setRegion(@e String str) {
        this.region = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14985, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RegionObj(region=" + this.region + ", desc=" + this.desc + ')';
    }
}
