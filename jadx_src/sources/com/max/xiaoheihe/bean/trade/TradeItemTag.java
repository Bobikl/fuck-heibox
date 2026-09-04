package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeItemTag.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeItemTag implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f77013id;

    public TradeItemTag(@e String str, @e String str2) {
        this.f77013id = str;
        this.desc = str2;
    }

    public static /* synthetic */ TradeItemTag copy$default(TradeItemTag tradeItemTag, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemTag, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16102, new Class[]{TradeItemTag.class, String.class, String.class, Integer.TYPE, Object.class}, TradeItemTag.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeItemTag) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tradeItemTag.f77013id;
        }
        if ((i10 & 2) != 0) {
            str2 = tradeItemTag.desc;
        }
        return tradeItemTag.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.f77013id;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final TradeItemTag copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16101, new Class[]{String.class, String.class}, TradeItemTag.class);
        return patchProxyResultProxy.isSupported ? (TradeItemTag) patchProxyResultProxy.result : new TradeItemTag(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16100, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(TradeItemTag.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.trade.TradeItemTag");
        return f0.g(this.f77013id, ((TradeItemTag) obj).f77013id);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getId() {
        return this.f77013id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16104, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f77013id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setId(@e String str) {
        this.f77013id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16103, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeItemTag(id=" + this.f77013id + ", desc=" + this.desc + ')';
    }
}
