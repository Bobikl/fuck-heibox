package com.max.hbcommon.bean.ads;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ADReportItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nADReportItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ADReportItem.kt\ncom/max/hbcommon/bean/ads/ADReportItem\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,39:1\n215#2,2:40\n*S KotlinDebug\n*F\n+ 1 ADReportItem.kt\ncom/max/hbcommon/bean/ads/ADReportItem\n*L\n32#1:40,2\n*E\n"})
public final class ADReportItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> ad_cm;

    @e
    private String ad_cm_pro;

    @e
    private List<String> ad_pm;

    @e
    private String ad_pm_pro;

    @e
    private String ad_version;

    @e
    private String ads_id;

    @e
    private HashMap<String, Object> extra;

    @e
    private String idea_id;

    @e
    private String unit_id;

    public ADReportItem(@e String str, @e String str2, @e String str3, @e String str4, @e List<String> list, @e List<String> list2, @e String str5, @e String str6, @e HashMap<String, Object> map) {
        this.idea_id = str;
        this.unit_id = str2;
        this.ads_id = str3;
        this.ad_version = str4;
        this.ad_cm = list;
        this.ad_pm = list2;
        this.ad_pm_pro = str5;
        this.ad_cm_pro = str6;
        this.extra = map;
    }

    public static /* synthetic */ ADReportItem copy$default(ADReportItem aDReportItem, String str, String str2, String str3, String str4, List list, List list2, String str5, String str6, HashMap map, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aDReportItem, str, str2, str3, str4, list, list2, str5, str6, map, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.J4, new Class[]{ADReportItem.class, String.class, String.class, String.class, String.class, List.class, List.class, String.class, String.class, HashMap.class, Integer.TYPE, Object.class}, ADReportItem.class);
        if (patchProxyResultProxy.isSupported) {
            return (ADReportItem) patchProxyResultProxy.result;
        }
        return aDReportItem.copy((i10 & 1) != 0 ? aDReportItem.idea_id : str, (i10 & 2) != 0 ? aDReportItem.unit_id : str2, (i10 & 4) != 0 ? aDReportItem.ads_id : str3, (i10 & 8) != 0 ? aDReportItem.ad_version : str4, (i10 & 16) != 0 ? aDReportItem.ad_cm : list, (i10 & 32) != 0 ? aDReportItem.ad_pm : list2, (i10 & 64) != 0 ? aDReportItem.ad_pm_pro : str5, (i10 & 128) != 0 ? aDReportItem.ad_cm_pro : str6, (i10 & 256) != 0 ? aDReportItem.extra : map);
    }

    @e
    public final String component1() {
        return this.idea_id;
    }

    @e
    public final String component2() {
        return this.unit_id;
    }

    @e
    public final String component3() {
        return this.ads_id;
    }

    @e
    public final String component4() {
        return this.ad_version;
    }

    @e
    public final List<String> component5() {
        return this.ad_cm;
    }

    @e
    public final List<String> component6() {
        return this.ad_pm;
    }

    @e
    public final String component7() {
        return this.ad_pm_pro;
    }

    @e
    public final String component8() {
        return this.ad_cm_pro;
    }

    @e
    public final HashMap<String, Object> component9() {
        return this.extra;
    }

    @d
    public final ADReportItem copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<String> list, @e List<String> list2, @e String str5, @e String str6, @e HashMap<String, Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list, list2, str5, str6, map}, this, changeQuickRedirect, false, c.d.I4, new Class[]{String.class, String.class, String.class, String.class, List.class, List.class, String.class, String.class, HashMap.class}, ADReportItem.class);
        return patchProxyResultProxy.isSupported ? (ADReportItem) patchProxyResultProxy.result : new ADReportItem(str, str2, str3, str4, list, list2, str5, str6, map);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.M4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ADReportItem)) {
            return false;
        }
        ADReportItem aDReportItem = (ADReportItem) obj;
        return f0.g(this.idea_id, aDReportItem.idea_id) && f0.g(this.unit_id, aDReportItem.unit_id) && f0.g(this.ads_id, aDReportItem.ads_id) && f0.g(this.ad_version, aDReportItem.ad_version) && f0.g(this.ad_cm, aDReportItem.ad_cm) && f0.g(this.ad_pm, aDReportItem.ad_pm) && f0.g(this.ad_pm_pro, aDReportItem.ad_pm_pro) && f0.g(this.ad_cm_pro, aDReportItem.ad_cm_pro) && f0.g(this.extra, aDReportItem.extra);
    }

    @e
    public final List<String> getAd_cm() {
        return this.ad_cm;
    }

    @e
    public final String getAd_cm_pro() {
        return this.ad_cm_pro;
    }

    @e
    public final List<String> getAd_pm() {
        return this.ad_pm;
    }

    @e
    public final String getAd_pm_pro() {
        return this.ad_pm_pro;
    }

    @e
    public final String getAd_version() {
        return this.ad_version;
    }

    @e
    public final String getAds_id() {
        return this.ads_id;
    }

    @e
    public final HashMap<String, Object> getExtra() {
        return this.extra;
    }

    @e
    public final String getIdea_id() {
        return this.idea_id;
    }

    @e
    public final String getUnit_id() {
        return this.unit_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.L4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.idea_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unit_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ads_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ad_version;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.ad_cm;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.ad_pm;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.ad_pm_pro;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ad_cm_pro;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        HashMap<String, Object> map = this.extra;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    @d
    public final JsonObject reportAddition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.H4, new Class[0], JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        String str = this.ad_version;
        if (str != null) {
            jsonObject.addProperty("ad_version", str);
        }
        String str2 = this.idea_id;
        if (str2 != null) {
            jsonObject.addProperty("idea_id", str2);
        }
        String str3 = this.unit_id;
        if (str3 != null) {
            jsonObject.addProperty("unit_id", str3);
        }
        String str4 = this.ads_id;
        if (str4 != null) {
            jsonObject.addProperty("ads_id", str4);
        }
        HashMap<String, Object> map = this.extra;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jsonObject.addProperty(entry.getKey(), entry.getValue().toString());
            }
        }
        return jsonObject;
    }

    public final void setAd_cm(@e List<String> list) {
        this.ad_cm = list;
    }

    public final void setAd_cm_pro(@e String str) {
        this.ad_cm_pro = str;
    }

    public final void setAd_pm(@e List<String> list) {
        this.ad_pm = list;
    }

    public final void setAd_pm_pro(@e String str) {
        this.ad_pm_pro = str;
    }

    public final void setAd_version(@e String str) {
        this.ad_version = str;
    }

    public final void setAds_id(@e String str) {
        this.ads_id = str;
    }

    public final void setExtra(@e HashMap<String, Object> map) {
        this.extra = map;
    }

    public final void setIdea_id(@e String str) {
        this.idea_id = str;
    }

    public final void setUnit_id(@e String str) {
        this.unit_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.K4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ADReportItem(idea_id=" + this.idea_id + ", unit_id=" + this.unit_id + ", ads_id=" + this.ads_id + ", ad_version=" + this.ad_version + ", ad_cm=" + this.ad_cm + ", ad_pm=" + this.ad_pm + ", ad_pm_pro=" + this.ad_pm_pro + ", ad_cm_pro=" + this.ad_cm_pro + ", extra=" + this.extra + ')';
    }
}
