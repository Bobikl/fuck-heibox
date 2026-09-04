package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SuggestDiscountInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String coupon_id;

    @e
    private String hcoin;

    @e
    private String payment;

    @e
    private Boolean show_help;

    @e
    private String stack_coupon_id;

    public SuggestDiscountInfo(@e String str, @e String str2, @e String str3, @e Boolean bool, @e String str4) {
        this.hcoin = str;
        this.stack_coupon_id = str2;
        this.coupon_id = str3;
        this.show_help = bool;
        this.payment = str4;
    }

    public static /* synthetic */ SuggestDiscountInfo copy$default(SuggestDiscountInfo suggestDiscountInfo, String str, String str2, String str3, Boolean bool, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{suggestDiscountInfo, str, str2, str3, bool, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15632, new Class[]{SuggestDiscountInfo.class, String.class, String.class, String.class, Boolean.class, String.class, Integer.TYPE, Object.class}, SuggestDiscountInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SuggestDiscountInfo) patchProxyResultProxy.result;
        }
        return suggestDiscountInfo.copy((i10 & 1) != 0 ? suggestDiscountInfo.hcoin : str, (i10 & 2) != 0 ? suggestDiscountInfo.stack_coupon_id : str2, (i10 & 4) != 0 ? suggestDiscountInfo.coupon_id : str3, (i10 & 8) != 0 ? suggestDiscountInfo.show_help : bool, (i10 & 16) != 0 ? suggestDiscountInfo.payment : str4);
    }

    @e
    public final String component1() {
        return this.hcoin;
    }

    @e
    public final String component2() {
        return this.stack_coupon_id;
    }

    @e
    public final String component3() {
        return this.coupon_id;
    }

    @e
    public final Boolean component4() {
        return this.show_help;
    }

    @e
    public final String component5() {
        return this.payment;
    }

    @d
    public final SuggestDiscountInfo copy(@e String str, @e String str2, @e String str3, @e Boolean bool, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, bool, str4}, this, changeQuickRedirect, false, 15631, new Class[]{String.class, String.class, String.class, Boolean.class, String.class}, SuggestDiscountInfo.class);
        return patchProxyResultProxy.isSupported ? (SuggestDiscountInfo) patchProxyResultProxy.result : new SuggestDiscountInfo(str, str2, str3, bool, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15635, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestDiscountInfo)) {
            return false;
        }
        SuggestDiscountInfo suggestDiscountInfo = (SuggestDiscountInfo) obj;
        return f0.g(this.hcoin, suggestDiscountInfo.hcoin) && f0.g(this.stack_coupon_id, suggestDiscountInfo.stack_coupon_id) && f0.g(this.coupon_id, suggestDiscountInfo.coupon_id) && f0.g(this.show_help, suggestDiscountInfo.show_help) && f0.g(this.payment, suggestDiscountInfo.payment);
    }

    @e
    public final String getCoupon_id() {
        return this.coupon_id;
    }

    @e
    public final String getHcoin() {
        return this.hcoin;
    }

    @e
    public final String getPayment() {
        return this.payment;
    }

    @e
    public final Boolean getShow_help() {
        return this.show_help;
    }

    @e
    public final String getStack_coupon_id() {
        return this.stack_coupon_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15634, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.hcoin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stack_coupon_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coupon_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.show_help;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.payment;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCoupon_id(@e String str) {
        this.coupon_id = str;
    }

    public final void setHcoin(@e String str) {
        this.hcoin = str;
    }

    public final void setPayment(@e String str) {
        this.payment = str;
    }

    public final void setShow_help(@e Boolean bool) {
        this.show_help = bool;
    }

    public final void setStack_coupon_id(@e String str) {
        this.stack_coupon_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15633, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SuggestDiscountInfo(hcoin=" + this.hcoin + ", stack_coupon_id=" + this.stack_coupon_id + ", coupon_id=" + this.coupon_id + ", show_help=" + this.show_help + ", payment=" + this.payment + ')';
    }
}
