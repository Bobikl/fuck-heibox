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
public final class BubbleTimestampObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Long end;

    @e
    private Long start;

    public BubbleTimestampObj(@e Long l10, @e Long l11) {
        this.start = l10;
        this.end = l11;
    }

    public static /* synthetic */ BubbleTimestampObj copy$default(BubbleTimestampObj bubbleTimestampObj, Long l10, Long l11, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bubbleTimestampObj, l10, l11, new Integer(i10), obj}, null, changeQuickRedirect, true, 14112, new Class[]{BubbleTimestampObj.class, Long.class, Long.class, Integer.TYPE, Object.class}, BubbleTimestampObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BubbleTimestampObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            l10 = bubbleTimestampObj.start;
        }
        if ((i10 & 2) != 0) {
            l11 = bubbleTimestampObj.end;
        }
        return bubbleTimestampObj.copy(l10, l11);
    }

    @e
    public final Long component1() {
        return this.start;
    }

    @e
    public final Long component2() {
        return this.end;
    }

    @d
    public final BubbleTimestampObj copy(@e Long l10, @e Long l11) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, l11}, this, changeQuickRedirect, false, 14111, new Class[]{Long.class, Long.class}, BubbleTimestampObj.class);
        return patchProxyResultProxy.isSupported ? (BubbleTimestampObj) patchProxyResultProxy.result : new BubbleTimestampObj(l10, l11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14115, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleTimestampObj)) {
            return false;
        }
        BubbleTimestampObj bubbleTimestampObj = (BubbleTimestampObj) obj;
        return f0.g(this.start, bubbleTimestampObj.start) && f0.g(this.end, bubbleTimestampObj.end);
    }

    @e
    public final Long getEnd() {
        return this.end;
    }

    @e
    public final Long getStart() {
        return this.start;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14114, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Long l10 = this.start;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.end;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setEnd(@e Long l10) {
        this.end = l10;
    }

    public final void setStart(@e Long l10) {
        this.start = l10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14113, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BubbleTimestampObj(start=" + this.start + ", end=" + this.end + ')';
    }
}
