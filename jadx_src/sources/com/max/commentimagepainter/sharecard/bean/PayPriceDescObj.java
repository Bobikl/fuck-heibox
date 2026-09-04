package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PayPriceDescObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String percent;

    @e
    private String prefix;

    @e
    private String suffix;

    public PayPriceDescObj(@e String str, @e String str2, @e String str3) {
        this.prefix = str;
        this.percent = str2;
        this.suffix = str3;
    }

    public static /* synthetic */ PayPriceDescObj copy$default(PayPriceDescObj payPriceDescObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{payPriceDescObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Xj, new Class[]{PayPriceDescObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PayPriceDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PayPriceDescObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = payPriceDescObj.prefix;
        }
        if ((i10 & 2) != 0) {
            str2 = payPriceDescObj.percent;
        }
        if ((i10 & 4) != 0) {
            str3 = payPriceDescObj.suffix;
        }
        return payPriceDescObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.prefix;
    }

    @e
    public final String component2() {
        return this.percent;
    }

    @e
    public final String component3() {
        return this.suffix;
    }

    @d
    public final PayPriceDescObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.b.Wj, new Class[]{String.class, String.class, String.class}, PayPriceDescObj.class);
        return patchProxyResultProxy.isSupported ? (PayPriceDescObj) patchProxyResultProxy.result : new PayPriceDescObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.f30525ak, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPriceDescObj)) {
            return false;
        }
        PayPriceDescObj payPriceDescObj = (PayPriceDescObj) obj;
        return f0.g(this.prefix, payPriceDescObj.prefix) && f0.g(this.percent, payPriceDescObj.percent) && f0.g(this.suffix, payPriceDescObj.suffix);
    }

    @e
    public final String getPercent() {
        return this.percent;
    }

    @e
    public final String getPrefix() {
        return this.prefix;
    }

    @e
    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Zj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.prefix;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.percent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffix;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setPercent(@e String str) {
        this.percent = str;
    }

    public final void setPrefix(@e String str) {
        this.prefix = str;
    }

    public final void setSuffix(@e String str) {
        this.suffix = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Yj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PayPriceDescObj(prefix=" + this.prefix + ", percent=" + this.percent + ", suffix=" + this.suffix + ')';
    }
}
