package com.max.xiaoheihe.bean.ads;

import androidx.compose.runtime.internal.o;
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
public final class BubbleAdInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Long bubble_ads_interval;

    @e
    private Long bubble_single_interval;

    @e
    private ArrayList<BubbleAdContent> contents;

    public BubbleAdInfo(@e Long l10, @e Long l11, @e ArrayList<BubbleAdContent> arrayList) {
        this.bubble_single_interval = l10;
        this.bubble_ads_interval = l11;
        this.contents = arrayList;
    }

    public static /* synthetic */ BubbleAdInfo copy$default(BubbleAdInfo bubbleAdInfo, Long l10, Long l11, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleAdInfo, l10, l11, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14107, new Class[]{BubbleAdInfo.class, Long.class, Long.class, ArrayList.class, Integer.TYPE, Object.class}, BubbleAdInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (BubbleAdInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            l10 = bubbleAdInfo.bubble_single_interval;
        }
        if ((i10 & 2) != 0) {
            l11 = bubbleAdInfo.bubble_ads_interval;
        }
        if ((i10 & 4) != 0) {
            arrayList = bubbleAdInfo.contents;
        }
        return bubbleAdInfo.copy(l10, l11, arrayList);
    }

    @e
    public final Long component1() {
        return this.bubble_single_interval;
    }

    @e
    public final Long component2() {
        return this.bubble_ads_interval;
    }

    @e
    public final ArrayList<BubbleAdContent> component3() {
        return this.contents;
    }

    @d
    public final BubbleAdInfo copy(@e Long l10, @e Long l11, @e ArrayList<BubbleAdContent> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, l11, arrayList}, this, changeQuickRedirect, false, 14106, new Class[]{Long.class, Long.class, ArrayList.class}, BubbleAdInfo.class);
        return patchProxyResultProxy.isSupported ? (BubbleAdInfo) patchProxyResultProxy.result : new BubbleAdInfo(l10, l11, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14110, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleAdInfo)) {
            return false;
        }
        BubbleAdInfo bubbleAdInfo = (BubbleAdInfo) obj;
        return f0.g(this.bubble_single_interval, bubbleAdInfo.bubble_single_interval) && f0.g(this.bubble_ads_interval, bubbleAdInfo.bubble_ads_interval) && f0.g(this.contents, bubbleAdInfo.contents);
    }

    @e
    public final Long getBubble_ads_interval() {
        return this.bubble_ads_interval;
    }

    @e
    public final Long getBubble_single_interval() {
        return this.bubble_single_interval;
    }

    @e
    public final ArrayList<BubbleAdContent> getContents() {
        return this.contents;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14109, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Long l10 = this.bubble_single_interval;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.bubble_ads_interval;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        ArrayList<BubbleAdContent> arrayList = this.contents;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setBubble_ads_interval(@e Long l10) {
        this.bubble_ads_interval = l10;
    }

    public final void setBubble_single_interval(@e Long l10) {
        this.bubble_single_interval = l10;
    }

    public final void setContents(@e ArrayList<BubbleAdContent> arrayList) {
        this.contents = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14108, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BubbleAdInfo(bubble_single_interval=" + this.bubble_single_interval + ", bubble_ads_interval=" + this.bubble_ads_interval + ", contents=" + this.contents + ')';
    }
}
