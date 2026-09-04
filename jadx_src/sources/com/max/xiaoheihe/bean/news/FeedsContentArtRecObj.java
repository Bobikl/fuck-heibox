package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsContentArtRecObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsContentArtRecObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String card_img;

    @e
    private String card_type;

    public FeedsContentArtRecObj(@e String str, @e String str2) {
        this.card_type = str;
        this.card_img = str2;
    }

    public static /* synthetic */ FeedsContentArtRecObj copy$default(FeedsContentArtRecObj feedsContentArtRecObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentArtRecObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15735, new Class[]{FeedsContentArtRecObj.class, String.class, String.class, Integer.TYPE, Object.class}, FeedsContentArtRecObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsContentArtRecObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = feedsContentArtRecObj.card_type;
        }
        if ((i10 & 2) != 0) {
            str2 = feedsContentArtRecObj.card_img;
        }
        return feedsContentArtRecObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.card_type;
    }

    @e
    public final String component2() {
        return this.card_img;
    }

    @d
    public final FeedsContentArtRecObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15734, new Class[]{String.class, String.class}, FeedsContentArtRecObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsContentArtRecObj) patchProxyResultProxy.result : new FeedsContentArtRecObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15738, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedsContentArtRecObj)) {
            return false;
        }
        FeedsContentArtRecObj feedsContentArtRecObj = (FeedsContentArtRecObj) obj;
        return f0.g(this.card_type, feedsContentArtRecObj.card_type) && f0.g(this.card_img, feedsContentArtRecObj.card_img);
    }

    @e
    public final String getCard_img() {
        return this.card_img;
    }

    @e
    public final String getCard_type() {
        return this.card_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15737, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.card_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.card_img;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCard_img(@e String str) {
        this.card_img = str;
    }

    public final void setCard_type(@e String str) {
        this.card_type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15736, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsContentArtRecObj(card_type=" + this.card_type + ", card_img=" + this.card_img + ')';
    }
}
