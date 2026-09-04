package com.max.xiaoheihe.bean.ads;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OverallAdInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CornerAdObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ADReportItem ad_report;

    @e
    private String border_color;

    @e
    private String idea_id;

    @e
    private String img;

    @e
    private String intranet_only;

    @e
    private String protocol;

    public CornerAdObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e ADReportItem aDReportItem) {
        this.protocol = str;
        this.border_color = str2;
        this.img = str3;
        this.idea_id = str4;
        this.intranet_only = str5;
        this.ad_report = aDReportItem;
    }

    public static /* synthetic */ CornerAdObj copy$default(CornerAdObj cornerAdObj, String str, String str2, String str3, String str4, String str5, ADReportItem aDReportItem, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cornerAdObj, str, str2, str3, str4, str5, aDReportItem, new Integer(i10), obj}, null, changeQuickRedirect, true, 14117, new Class[]{CornerAdObj.class, String.class, String.class, String.class, String.class, String.class, ADReportItem.class, Integer.TYPE, Object.class}, CornerAdObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CornerAdObj) patchProxyResultProxy.result;
        }
        return cornerAdObj.copy((i10 & 1) != 0 ? cornerAdObj.protocol : str, (i10 & 2) != 0 ? cornerAdObj.border_color : str2, (i10 & 4) != 0 ? cornerAdObj.img : str3, (i10 & 8) != 0 ? cornerAdObj.idea_id : str4, (i10 & 16) != 0 ? cornerAdObj.intranet_only : str5, (i10 & 32) != 0 ? cornerAdObj.ad_report : aDReportItem);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.border_color;
    }

    @e
    public final String component3() {
        return this.img;
    }

    @e
    public final String component4() {
        return this.idea_id;
    }

    @e
    public final String component5() {
        return this.intranet_only;
    }

    @e
    public final ADReportItem component6() {
        return this.ad_report;
    }

    @d
    public final CornerAdObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e ADReportItem aDReportItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, aDReportItem}, this, changeQuickRedirect, false, 14116, new Class[]{String.class, String.class, String.class, String.class, String.class, ADReportItem.class}, CornerAdObj.class);
        return patchProxyResultProxy.isSupported ? (CornerAdObj) patchProxyResultProxy.result : new CornerAdObj(str, str2, str3, str4, str5, aDReportItem);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14120, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CornerAdObj)) {
            return false;
        }
        CornerAdObj cornerAdObj = (CornerAdObj) obj;
        return f0.g(this.protocol, cornerAdObj.protocol) && f0.g(this.border_color, cornerAdObj.border_color) && f0.g(this.img, cornerAdObj.img) && f0.g(this.idea_id, cornerAdObj.idea_id) && f0.g(this.intranet_only, cornerAdObj.intranet_only) && f0.g(this.ad_report, cornerAdObj.ad_report);
    }

    @e
    public final ADReportItem getAd_report() {
        return this.ad_report;
    }

    @e
    public final String getBorder_color() {
        return this.border_color;
    }

    @e
    public final String getIdea_id() {
        return this.idea_id;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getIntranet_only() {
        return this.intranet_only;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14119, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.border_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idea_id;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.intranet_only;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ADReportItem aDReportItem = this.ad_report;
        return iHashCode5 + (aDReportItem != null ? aDReportItem.hashCode() : 0);
    }

    public final void setAd_report(@e ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public final void setBorder_color(@e String str) {
        this.border_color = str;
    }

    public final void setIdea_id(@e String str) {
        this.idea_id = str;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setIntranet_only(@e String str) {
        this.intranet_only = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14118, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CornerAdObj(protocol=" + this.protocol + ", border_color=" + this.border_color + ", img=" + this.img + ", idea_id=" + this.idea_id + ", intranet_only=" + this.intranet_only + ", ad_report=" + this.ad_report + ')';
    }
}
