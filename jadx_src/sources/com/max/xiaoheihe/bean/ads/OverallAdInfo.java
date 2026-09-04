package com.max.xiaoheihe.bean.ads;

import androidx.compose.runtime.internal.o;
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
public final class OverallAdInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BubbleAdInfo bubble_ad;

    @e
    private CornerAdObj home_corner_ad;

    @e
    private String now_identification;

    public OverallAdInfo(@e BubbleAdInfo bubbleAdInfo, @e CornerAdObj cornerAdObj, @e String str) {
        this.bubble_ad = bubbleAdInfo;
        this.home_corner_ad = cornerAdObj;
        this.now_identification = str;
    }

    public static /* synthetic */ OverallAdInfo copy$default(OverallAdInfo overallAdInfo, BubbleAdInfo bubbleAdInfo, CornerAdObj cornerAdObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{overallAdInfo, bubbleAdInfo, cornerAdObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14122, new Class[]{OverallAdInfo.class, BubbleAdInfo.class, CornerAdObj.class, String.class, Integer.TYPE, Object.class}, OverallAdInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (OverallAdInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bubbleAdInfo = overallAdInfo.bubble_ad;
        }
        if ((i10 & 2) != 0) {
            cornerAdObj = overallAdInfo.home_corner_ad;
        }
        if ((i10 & 4) != 0) {
            str = overallAdInfo.now_identification;
        }
        return overallAdInfo.copy(bubbleAdInfo, cornerAdObj, str);
    }

    @e
    public final BubbleAdInfo component1() {
        return this.bubble_ad;
    }

    @e
    public final CornerAdObj component2() {
        return this.home_corner_ad;
    }

    @e
    public final String component3() {
        return this.now_identification;
    }

    @d
    public final OverallAdInfo copy(@e BubbleAdInfo bubbleAdInfo, @e CornerAdObj cornerAdObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleAdInfo, cornerAdObj, str}, this, changeQuickRedirect, false, 14121, new Class[]{BubbleAdInfo.class, CornerAdObj.class, String.class}, OverallAdInfo.class);
        return patchProxyResultProxy.isSupported ? (OverallAdInfo) patchProxyResultProxy.result : new OverallAdInfo(bubbleAdInfo, cornerAdObj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14125, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverallAdInfo)) {
            return false;
        }
        OverallAdInfo overallAdInfo = (OverallAdInfo) obj;
        return f0.g(this.bubble_ad, overallAdInfo.bubble_ad) && f0.g(this.home_corner_ad, overallAdInfo.home_corner_ad) && f0.g(this.now_identification, overallAdInfo.now_identification);
    }

    @e
    public final BubbleAdInfo getBubble_ad() {
        return this.bubble_ad;
    }

    @e
    public final CornerAdObj getHome_corner_ad() {
        return this.home_corner_ad;
    }

    @e
    public final String getNow_identification() {
        return this.now_identification;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14124, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BubbleAdInfo bubbleAdInfo = this.bubble_ad;
        int iHashCode = (bubbleAdInfo == null ? 0 : bubbleAdInfo.hashCode()) * 31;
        CornerAdObj cornerAdObj = this.home_corner_ad;
        int iHashCode2 = (iHashCode + (cornerAdObj == null ? 0 : cornerAdObj.hashCode())) * 31;
        String str = this.now_identification;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setBubble_ad(@e BubbleAdInfo bubbleAdInfo) {
        this.bubble_ad = bubbleAdInfo;
    }

    public final void setHome_corner_ad(@e CornerAdObj cornerAdObj) {
        this.home_corner_ad = cornerAdObj;
    }

    public final void setNow_identification(@e String str) {
        this.now_identification = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14123, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OverallAdInfo(bubble_ad=" + this.bubble_ad + ", home_corner_ad=" + this.home_corner_ad + ", now_identification=" + this.now_identification + ')';
    }
}
