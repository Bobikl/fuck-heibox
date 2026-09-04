package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBargainDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BargainTips implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String content;

    @e
    private String title;

    public BargainTips(@e String str, @e String str2) {
        this.content = str;
        this.title = str2;
    }

    public static /* synthetic */ BargainTips copy$default(BargainTips bargainTips, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bargainTips, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16003, new Class[]{BargainTips.class, String.class, String.class, Integer.TYPE, Object.class}, BargainTips.class);
        if (patchProxyResultProxy.isSupported) {
            return (BargainTips) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = bargainTips.content;
        }
        if ((i10 & 2) != 0) {
            str2 = bargainTips.title;
        }
        return bargainTips.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.content;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @d
    public final BargainTips copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16002, new Class[]{String.class, String.class}, BargainTips.class);
        return patchProxyResultProxy.isSupported ? (BargainTips) patchProxyResultProxy.result : new BargainTips(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16006, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BargainTips)) {
            return false;
        }
        BargainTips bargainTips = (BargainTips) obj;
        return f0.g(this.content, bargainTips.content) && f0.g(this.title, bargainTips.title);
    }

    @e
    public final String getContent() {
        return this.content;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16005, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setContent(@e String str) {
        this.content = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16004, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BargainTips(content=" + this.content + ", title=" + this.title + ')';
    }
}
