package com.max.hbsearch.bean;

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

/* JADX INFO: compiled from: HotSearchItemObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HotSearchItemObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String icon_url;

    @e
    private String image_url;

    @e
    private String name;

    @e
    private String proto;

    @e
    private JsonObject report_extra;

    @e
    private String type;

    public HotSearchItemObj() {
        this(null, null, null, null, null, null, 63, null);
    }

    public HotSearchItemObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e JsonObject jsonObject) {
        this.name = str;
        this.icon_url = str2;
        this.image_url = str3;
        this.proto = str4;
        this.type = str5;
        this.report_extra = jsonObject;
    }

    public /* synthetic */ HotSearchItemObj(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : jsonObject);
    }

    public static /* synthetic */ HotSearchItemObj copy$default(HotSearchItemObj hotSearchItemObj, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchItemObj, str, str2, str3, str4, str5, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.X6, new Class[]{HotSearchItemObj.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, HotSearchItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchItemObj) patchProxyResultProxy.result;
        }
        return hotSearchItemObj.copy((i10 & 1) != 0 ? hotSearchItemObj.name : str, (i10 & 2) != 0 ? hotSearchItemObj.icon_url : str2, (i10 & 4) != 0 ? hotSearchItemObj.image_url : str3, (i10 & 8) != 0 ? hotSearchItemObj.proto : str4, (i10 & 16) != 0 ? hotSearchItemObj.type : str5, (i10 & 32) != 0 ? hotSearchItemObj.report_extra : jsonObject);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.icon_url;
    }

    @e
    public final String component3() {
        return this.image_url;
    }

    @e
    public final String component4() {
        return this.proto;
    }

    @e
    public final String component5() {
        return this.type;
    }

    @e
    public final JsonObject component6() {
        return this.report_extra;
    }

    @d
    public final HotSearchItemObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, jsonObject}, this, changeQuickRedirect, false, c.k.W6, new Class[]{String.class, String.class, String.class, String.class, String.class, JsonObject.class}, HotSearchItemObj.class);
        return patchProxyResultProxy.isSupported ? (HotSearchItemObj) patchProxyResultProxy.result : new HotSearchItemObj(str, str2, str3, str4, str5, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.V6, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.g(HotSearchItemObj.class, obj.getClass())) {
            return false;
        }
        HotSearchItemObj hotSearchItemObj = (HotSearchItemObj) obj;
        return f0.g(this.name, hotSearchItemObj.name) && f0.g(this.type, hotSearchItemObj.type);
    }

    @e
    public final String getIcon_url() {
        return this.icon_url;
    }

    @e
    public final String getImage_url() {
        return this.image_url;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProto() {
        return this.proto;
    }

    @e
    public final JsonObject getReport_extra() {
        return this.report_extra;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Z6, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.proto;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        JsonObject jsonObject = this.report_extra;
        return iHashCode5 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setIcon_url(@e String str) {
        this.icon_url = str;
    }

    public final void setImage_url(@e String str) {
        this.image_url = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProto(@e String str) {
        this.proto = str;
    }

    public final void setReport_extra(@e JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Y6, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotSearchItemObj(name=" + this.name + ", icon_url=" + this.icon_url + ", image_url=" + this.image_url + ", proto=" + this.proto + ", type=" + this.type + ", report_extra=" + this.report_extra + ')';
    }
}
