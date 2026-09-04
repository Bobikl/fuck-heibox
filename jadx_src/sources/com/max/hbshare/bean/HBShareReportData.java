package com.max.hbshare.bean;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBShareData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HBShareReportData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private JsonObject extra;

    @e
    private String src;

    /* JADX WARN: Multi-variable type inference failed */
    public HBShareReportData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public HBShareReportData(@e String str, @e JsonObject jsonObject) {
        this.src = str;
        this.extra = jsonObject;
    }

    public /* synthetic */ HBShareReportData(String str, JsonObject jsonObject, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : jsonObject);
    }

    public static /* synthetic */ HBShareReportData copy$default(HBShareReportData hBShareReportData, String str, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBShareReportData, str, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Ra, new Class[]{HBShareReportData.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, HBShareReportData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareReportData) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = hBShareReportData.src;
        }
        if ((i10 & 2) != 0) {
            jsonObject = hBShareReportData.extra;
        }
        return hBShareReportData.copy(str, jsonObject);
    }

    @e
    public final String component1() {
        return this.src;
    }

    @e
    public final JsonObject component2() {
        return this.extra;
    }

    @d
    public final HBShareReportData copy(@e String str, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, jsonObject}, this, changeQuickRedirect, false, c.k.Qa, new Class[]{String.class, JsonObject.class}, HBShareReportData.class);
        return patchProxyResultProxy.isSupported ? (HBShareReportData) patchProxyResultProxy.result : new HBShareReportData(str, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Ua, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HBShareReportData)) {
            return false;
        }
        HBShareReportData hBShareReportData = (HBShareReportData) obj;
        return f0.g(this.src, hBShareReportData.src) && f0.g(this.extra, hBShareReportData.extra);
    }

    @e
    public final JsonObject getExtra() {
        return this.extra;
    }

    @e
    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ta, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.src;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonObject jsonObject = this.extra;
        return iHashCode + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setExtra(@e JsonObject jsonObject) {
        this.extra = jsonObject;
    }

    public final void setSrc(@e String str) {
        this.src = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Sa, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HBShareReportData(src=" + this.src + ", extra=" + this.extra + ')';
    }
}
