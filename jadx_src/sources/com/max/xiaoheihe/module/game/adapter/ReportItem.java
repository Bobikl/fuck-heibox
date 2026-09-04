package com.max.xiaoheihe.module.game.adapter;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: compiled from: GameOrProductItemReportHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ReportItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85627i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("app_id")
    @dl.e
    private final String f85628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sku_id")
    @dl.e
    private final String f85629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("name")
    @dl.e
    private final String f85630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("h_src")
    @dl.e
    private final String f85631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f85632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f85633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private JsonObject f85634h;

    public ReportItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public ReportItem(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e JsonObject jsonObject) {
        this.f85628b = str;
        this.f85629c = str2;
        this.f85630d = str3;
        this.f85631e = str4;
        this.f85632f = str5;
        this.f85633g = str6;
        this.f85634h = jsonObject;
    }

    public /* synthetic */ ReportItem(String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : jsonObject);
    }

    public static /* synthetic */ ReportItem i(ReportItem reportItem, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reportItem, str, str2, str3, str4, str5, str6, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, 35687, new Class[]{ReportItem.class, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, ReportItem.class);
        if (patchProxyResultProxy.isSupported) {
            return (ReportItem) patchProxyResultProxy.result;
        }
        return reportItem.h((i10 & 1) != 0 ? reportItem.f85628b : str, (i10 & 2) != 0 ? reportItem.f85629c : str2, (i10 & 4) != 0 ? reportItem.f85630d : str3, (i10 & 8) != 0 ? reportItem.f85631e : str4, (i10 & 16) != 0 ? reportItem.f85632f : str5, (i10 & 32) != 0 ? reportItem.f85633g : str6, (i10 & 64) != 0 ? reportItem.f85634h : jsonObject);
    }

    @dl.e
    public final String a() {
        return this.f85628b;
    }

    @dl.e
    public final String b() {
        return this.f85629c;
    }

    @dl.e
    public final String c() {
        return this.f85630d;
    }

    @dl.e
    public final String d() {
        return this.f85631e;
    }

    @dl.e
    public final String e() {
        return this.f85632f;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35690, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportItem)) {
            return false;
        }
        ReportItem reportItem = (ReportItem) obj;
        return kotlin.jvm.internal.f0.g(this.f85628b, reportItem.f85628b) && kotlin.jvm.internal.f0.g(this.f85629c, reportItem.f85629c) && kotlin.jvm.internal.f0.g(this.f85630d, reportItem.f85630d) && kotlin.jvm.internal.f0.g(this.f85631e, reportItem.f85631e) && kotlin.jvm.internal.f0.g(this.f85632f, reportItem.f85632f) && kotlin.jvm.internal.f0.g(this.f85633g, reportItem.f85633g) && kotlin.jvm.internal.f0.g(this.f85634h, reportItem.f85634h);
    }

    @dl.e
    public final String f() {
        return this.f85633g;
    }

    @dl.e
    public final JsonObject g() {
        return this.f85634h;
    }

    @dl.d
    public final ReportItem h(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, jsonObject}, this, changeQuickRedirect, false, 35686, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class}, ReportItem.class);
        return patchProxyResultProxy.isSupported ? (ReportItem) patchProxyResultProxy.result : new ReportItem(str, str2, str3, str4, str5, str6, jsonObject);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35689, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f85628b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85629c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85630d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85631e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f85632f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f85633g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        JsonObject jsonObject = this.f85634h;
        return iHashCode6 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    @dl.e
    public final JsonObject j() {
        return this.f85634h;
    }

    @dl.e
    public final String k() {
        return this.f85628b;
    }

    @dl.e
    public final String l() {
        return this.f85631e;
    }

    @dl.e
    public final String m() {
        return this.f85630d;
    }

    @dl.e
    public final String n() {
        return this.f85633g;
    }

    @dl.e
    public final String o() {
        return this.f85629c;
    }

    @dl.e
    public final String p() {
        return this.f85632f;
    }

    public final void q(@dl.e JsonObject jsonObject) {
        this.f85634h = jsonObject;
    }

    public final void r(@dl.e String str) {
        this.f85633g = str;
    }

    public final void s(@dl.e String str) {
        this.f85632f = str;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35688, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ReportItem(appid=" + this.f85628b + ", skuId=" + this.f85629c + ", name=" + this.f85630d + ", hSrc=" + this.f85631e + ", time=" + this.f85632f + ", path=" + this.f85633g + ", addition=" + this.f85634h + ')';
    }
}
