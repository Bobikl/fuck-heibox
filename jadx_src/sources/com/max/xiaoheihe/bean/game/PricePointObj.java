package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PriceHistoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PricePointObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String currency;

    @e
    private String date;

    @e
    private String desc;

    @e
    private String discount;

    @e
    private String price;

    @e
    private String rmb_price;

    public PricePointObj(@e String str, @e String str2, @e String str3) {
        this(str, str2, str3, null, null, null);
    }

    public PricePointObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.date = str;
        this.price = str2;
        this.desc = str3;
        this.discount = str4;
        this.rmb_price = str5;
        this.currency = str6;
    }

    public static /* synthetic */ PricePointObj copy$default(PricePointObj pricePointObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pricePointObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 14957, new Class[]{PricePointObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PricePointObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PricePointObj) patchProxyResultProxy.result;
        }
        return pricePointObj.copy((i10 & 1) != 0 ? pricePointObj.date : str, (i10 & 2) != 0 ? pricePointObj.price : str2, (i10 & 4) != 0 ? pricePointObj.desc : str3, (i10 & 8) != 0 ? pricePointObj.discount : str4, (i10 & 16) != 0 ? pricePointObj.rmb_price : str5, (i10 & 32) != 0 ? pricePointObj.currency : str6);
    }

    @e
    public final String component1() {
        return this.date;
    }

    @e
    public final String component2() {
        return this.price;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @e
    public final String component4() {
        return this.discount;
    }

    @e
    public final String component5() {
        return this.rmb_price;
    }

    @e
    public final String component6() {
        return this.currency;
    }

    @d
    public final PricePointObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 14956, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, PricePointObj.class);
        return patchProxyResultProxy.isSupported ? (PricePointObj) patchProxyResultProxy.result : new PricePointObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14955, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(PricePointObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.PricePointObj");
        return f0.g(this.date, ((PricePointObj) obj).date);
    }

    @e
    public final String getCurrency() {
        return this.currency;
    }

    @e
    public final String getDate() {
        return this.date;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getDiscount() {
        return this.discount;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    @e
    public final String getRmb_price() {
        return this.rmb_price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14959, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rmb_price;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currency;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCurrency(@e String str) {
        this.currency = str;
    }

    public final void setDate(@e String str) {
        this.date = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setDiscount(@e String str) {
        this.discount = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    public final void setRmb_price(@e String str) {
        this.rmb_price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14958, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PricePointObj(date=" + this.date + ", price=" + this.price + ", desc=" + this.desc + ", discount=" + this.discount + ", rmb_price=" + this.rmb_price + ", currency=" + this.currency + ')';
    }
}
