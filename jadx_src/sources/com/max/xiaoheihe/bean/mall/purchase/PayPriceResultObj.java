package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PayPriceResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PayPriceResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private PurchaseCouponInfoObj coupon_info;

    @e
    private String coupon_value;

    @e
    private String deduct_coin;

    @e
    private String discount_desc;

    @e
    private String discount_total;

    @e
    private Boolean only_hcoin;

    @e
    private String pay_price;

    @e
    private String pay_price_rmb;

    public PayPriceResultObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e PurchaseCouponInfoObj purchaseCouponInfoObj, @e Boolean bool) {
        this.pay_price_rmb = str;
        this.pay_price = str2;
        this.deduct_coin = str3;
        this.coupon_value = str4;
        this.discount_desc = str5;
        this.discount_total = str6;
        this.coupon_info = purchaseCouponInfoObj;
        this.only_hcoin = bool;
    }

    public static /* synthetic */ PayPriceResultObj copy$default(PayPriceResultObj payPriceResultObj, String str, String str2, String str3, String str4, String str5, String str6, PurchaseCouponInfoObj purchaseCouponInfoObj, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{payPriceResultObj, str, str2, str3, str4, str5, str6, purchaseCouponInfoObj, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, 15670, new Class[]{PayPriceResultObj.class, String.class, String.class, String.class, String.class, String.class, String.class, PurchaseCouponInfoObj.class, Boolean.class, Integer.TYPE, Object.class}, PayPriceResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PayPriceResultObj) patchProxyResultProxy.result;
        }
        return payPriceResultObj.copy((i10 & 1) != 0 ? payPriceResultObj.pay_price_rmb : str, (i10 & 2) != 0 ? payPriceResultObj.pay_price : str2, (i10 & 4) != 0 ? payPriceResultObj.deduct_coin : str3, (i10 & 8) != 0 ? payPriceResultObj.coupon_value : str4, (i10 & 16) != 0 ? payPriceResultObj.discount_desc : str5, (i10 & 32) != 0 ? payPriceResultObj.discount_total : str6, (i10 & 64) != 0 ? payPriceResultObj.coupon_info : purchaseCouponInfoObj, (i10 & 128) != 0 ? payPriceResultObj.only_hcoin : bool);
    }

    @e
    public final String component1() {
        return this.pay_price_rmb;
    }

    @e
    public final String component2() {
        return this.pay_price;
    }

    @e
    public final String component3() {
        return this.deduct_coin;
    }

    @e
    public final String component4() {
        return this.coupon_value;
    }

    @e
    public final String component5() {
        return this.discount_desc;
    }

    @e
    public final String component6() {
        return this.discount_total;
    }

    @e
    public final PurchaseCouponInfoObj component7() {
        return this.coupon_info;
    }

    @e
    public final Boolean component8() {
        return this.only_hcoin;
    }

    @d
    public final PayPriceResultObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e PurchaseCouponInfoObj purchaseCouponInfoObj, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, purchaseCouponInfoObj, bool}, this, changeQuickRedirect, false, 15669, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, PurchaseCouponInfoObj.class, Boolean.class}, PayPriceResultObj.class);
        return patchProxyResultProxy.isSupported ? (PayPriceResultObj) patchProxyResultProxy.result : new PayPriceResultObj(str, str2, str3, str4, str5, str6, purchaseCouponInfoObj, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15673, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPriceResultObj)) {
            return false;
        }
        PayPriceResultObj payPriceResultObj = (PayPriceResultObj) obj;
        return f0.g(this.pay_price_rmb, payPriceResultObj.pay_price_rmb) && f0.g(this.pay_price, payPriceResultObj.pay_price) && f0.g(this.deduct_coin, payPriceResultObj.deduct_coin) && f0.g(this.coupon_value, payPriceResultObj.coupon_value) && f0.g(this.discount_desc, payPriceResultObj.discount_desc) && f0.g(this.discount_total, payPriceResultObj.discount_total) && f0.g(this.coupon_info, payPriceResultObj.coupon_info) && f0.g(this.only_hcoin, payPriceResultObj.only_hcoin);
    }

    @e
    public final PurchaseCouponInfoObj getCoupon_info() {
        return this.coupon_info;
    }

    @e
    public final String getCoupon_value() {
        return this.coupon_value;
    }

    @e
    public final String getDeduct_coin() {
        return this.deduct_coin;
    }

    @e
    public final String getDiscount_desc() {
        return this.discount_desc;
    }

    @e
    public final String getDiscount_total() {
        return this.discount_total;
    }

    @e
    public final Boolean getOnly_hcoin() {
        return this.only_hcoin;
    }

    @e
    public final String getPay_price() {
        return this.pay_price;
    }

    @e
    public final String getPay_price_rmb() {
        return this.pay_price_rmb;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15672, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.pay_price_rmb;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pay_price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deduct_coin;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coupon_value;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discount_desc;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discount_total;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PurchaseCouponInfoObj purchaseCouponInfoObj = this.coupon_info;
        int iHashCode7 = (iHashCode6 + (purchaseCouponInfoObj == null ? 0 : purchaseCouponInfoObj.hashCode())) * 31;
        Boolean bool = this.only_hcoin;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setCoupon_info(@e PurchaseCouponInfoObj purchaseCouponInfoObj) {
        this.coupon_info = purchaseCouponInfoObj;
    }

    public final void setCoupon_value(@e String str) {
        this.coupon_value = str;
    }

    public final void setDeduct_coin(@e String str) {
        this.deduct_coin = str;
    }

    public final void setDiscount_desc(@e String str) {
        this.discount_desc = str;
    }

    public final void setDiscount_total(@e String str) {
        this.discount_total = str;
    }

    public final void setOnly_hcoin(@e Boolean bool) {
        this.only_hcoin = bool;
    }

    public final void setPay_price(@e String str) {
        this.pay_price = str;
    }

    public final void setPay_price_rmb(@e String str) {
        this.pay_price_rmb = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15671, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PayPriceResultObj(pay_price_rmb=" + this.pay_price_rmb + ", pay_price=" + this.pay_price + ", deduct_coin=" + this.deduct_coin + ", coupon_value=" + this.coupon_value + ", discount_desc=" + this.discount_desc + ", discount_total=" + this.discount_total + ", coupon_info=" + this.coupon_info + ", only_hcoin=" + this.only_hcoin + ')';
    }
}
