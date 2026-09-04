package com.max.xiaoheihe.bean.ads;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OverallAdInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BubbleAdContent implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String ad_duration;

    @e
    private ADReportItem ad_report;

    @e
    private String idea_id;

    @e
    private String img;

    @e
    private String intranet_only;

    @e
    private String protocol;

    @e
    private ArrayList<BubbleTimestampObj> show_time;

    @e
    private String sub_title;

    @e
    private String title;

    public BubbleAdContent(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e ADReportItem aDReportItem, @e String str7, @e ArrayList<BubbleTimestampObj> arrayList) {
        this.protocol = str;
        this.img = str2;
        this.title = str3;
        this.idea_id = str4;
        this.sub_title = str5;
        this.ad_duration = str6;
        this.ad_report = aDReportItem;
        this.intranet_only = str7;
        this.show_time = arrayList;
    }

    public static /* synthetic */ BubbleAdContent copy$default(BubbleAdContent bubbleAdContent, String str, String str2, String str3, String str4, String str5, String str6, ADReportItem aDReportItem, String str7, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleAdContent, str, str2, str3, str4, str5, str6, aDReportItem, str7, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14102, new Class[]{BubbleAdContent.class, String.class, String.class, String.class, String.class, String.class, String.class, ADReportItem.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, BubbleAdContent.class);
        if (patchProxyResultProxy.isSupported) {
            return (BubbleAdContent) patchProxyResultProxy.result;
        }
        return bubbleAdContent.copy((i10 & 1) != 0 ? bubbleAdContent.protocol : str, (i10 & 2) != 0 ? bubbleAdContent.img : str2, (i10 & 4) != 0 ? bubbleAdContent.title : str3, (i10 & 8) != 0 ? bubbleAdContent.idea_id : str4, (i10 & 16) != 0 ? bubbleAdContent.sub_title : str5, (i10 & 32) != 0 ? bubbleAdContent.ad_duration : str6, (i10 & 64) != 0 ? bubbleAdContent.ad_report : aDReportItem, (i10 & 128) != 0 ? bubbleAdContent.intranet_only : str7, (i10 & 256) != 0 ? bubbleAdContent.show_time : arrayList);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.img;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.idea_id;
    }

    @e
    public final String component5() {
        return this.sub_title;
    }

    @e
    public final String component6() {
        return this.ad_duration;
    }

    @e
    public final ADReportItem component7() {
        return this.ad_report;
    }

    @e
    public final String component8() {
        return this.intranet_only;
    }

    @e
    public final ArrayList<BubbleTimestampObj> component9() {
        return this.show_time;
    }

    @d
    public final BubbleAdContent copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e ADReportItem aDReportItem, @e String str7, @e ArrayList<BubbleTimestampObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, aDReportItem, str7, arrayList}, this, changeQuickRedirect, false, 14101, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, ADReportItem.class, String.class, ArrayList.class}, BubbleAdContent.class);
        return patchProxyResultProxy.isSupported ? (BubbleAdContent) patchProxyResultProxy.result : new BubbleAdContent(str, str2, str3, str4, str5, str6, aDReportItem, str7, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14105, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleAdContent)) {
            return false;
        }
        BubbleAdContent bubbleAdContent = (BubbleAdContent) obj;
        return f0.g(this.protocol, bubbleAdContent.protocol) && f0.g(this.img, bubbleAdContent.img) && f0.g(this.title, bubbleAdContent.title) && f0.g(this.idea_id, bubbleAdContent.idea_id) && f0.g(this.sub_title, bubbleAdContent.sub_title) && f0.g(this.ad_duration, bubbleAdContent.ad_duration) && f0.g(this.ad_report, bubbleAdContent.ad_report) && f0.g(this.intranet_only, bubbleAdContent.intranet_only) && f0.g(this.show_time, bubbleAdContent.show_time);
    }

    @e
    public final String getAd_duration() {
        return this.ad_duration;
    }

    @e
    public final ADReportItem getAd_report() {
        return this.ad_report;
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

    @e
    public final ArrayList<BubbleTimestampObj> getShow_time() {
        return this.show_time;
    }

    @e
    public final String getSub_title() {
        return this.sub_title;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14104, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idea_id;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sub_title;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ad_duration;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ADReportItem aDReportItem = this.ad_report;
        int iHashCode7 = (iHashCode6 + (aDReportItem == null ? 0 : aDReportItem.hashCode())) * 31;
        String str7 = this.intranet_only;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ArrayList<BubbleTimestampObj> arrayList = this.show_time;
        return iHashCode8 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAd_duration(@e String str) {
        this.ad_duration = str;
    }

    public final void setAd_report(@e ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
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

    public final void setShow_time(@e ArrayList<BubbleTimestampObj> arrayList) {
        this.show_time = arrayList;
    }

    public final void setSub_title(@e String str) {
        this.sub_title = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14103, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BubbleAdContent(protocol=" + this.protocol + ", img=" + this.img + ", title=" + this.title + ", idea_id=" + this.idea_id + ", sub_title=" + this.sub_title + ", ad_duration=" + this.ad_duration + ", ad_report=" + this.ad_report + ", intranet_only=" + this.intranet_only + ", show_time=" + this.show_time + ')';
    }
}
