package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseBaseInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseBaseInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private PurchaseCouponObj coupon_params;

    @e
    private PurchaseParamObj params;

    @e
    private String reference_price_text;

    public PurchaseBaseInfoObj(@e String str, @e PurchaseCouponObj purchaseCouponObj, @e PurchaseParamObj purchaseParamObj) {
        this.reference_price_text = str;
        this.coupon_params = purchaseCouponObj;
        this.params = purchaseParamObj;
    }

    public static /* synthetic */ PurchaseBaseInfoObj copy$default(PurchaseBaseInfoObj purchaseBaseInfoObj, String str, PurchaseCouponObj purchaseCouponObj, PurchaseParamObj purchaseParamObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseBaseInfoObj, str, purchaseCouponObj, purchaseParamObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15675, new Class[]{PurchaseBaseInfoObj.class, String.class, PurchaseCouponObj.class, PurchaseParamObj.class, Integer.TYPE, Object.class}, PurchaseBaseInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseBaseInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = purchaseBaseInfoObj.reference_price_text;
        }
        if ((i10 & 2) != 0) {
            purchaseCouponObj = purchaseBaseInfoObj.coupon_params;
        }
        if ((i10 & 4) != 0) {
            purchaseParamObj = purchaseBaseInfoObj.params;
        }
        return purchaseBaseInfoObj.copy(str, purchaseCouponObj, purchaseParamObj);
    }

    @e
    public final String component1() {
        return this.reference_price_text;
    }

    @e
    public final PurchaseCouponObj component2() {
        return this.coupon_params;
    }

    @e
    public final PurchaseParamObj component3() {
        return this.params;
    }

    @d
    public final PurchaseBaseInfoObj copy(@e String str, @e PurchaseCouponObj purchaseCouponObj, @e PurchaseParamObj purchaseParamObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, purchaseCouponObj, purchaseParamObj}, this, changeQuickRedirect, false, 15674, new Class[]{String.class, PurchaseCouponObj.class, PurchaseParamObj.class}, PurchaseBaseInfoObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseBaseInfoObj) patchProxyResultProxy.result : new PurchaseBaseInfoObj(str, purchaseCouponObj, purchaseParamObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15678, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseBaseInfoObj)) {
            return false;
        }
        PurchaseBaseInfoObj purchaseBaseInfoObj = (PurchaseBaseInfoObj) obj;
        return f0.g(this.reference_price_text, purchaseBaseInfoObj.reference_price_text) && f0.g(this.coupon_params, purchaseBaseInfoObj.coupon_params) && f0.g(this.params, purchaseBaseInfoObj.params);
    }

    @e
    public final PurchaseCouponObj getCoupon_params() {
        return this.coupon_params;
    }

    @e
    public final PurchaseParamObj getParams() {
        return this.params;
    }

    @e
    public final String getReference_price_text() {
        return this.reference_price_text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15677, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.reference_price_text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PurchaseCouponObj purchaseCouponObj = this.coupon_params;
        int iHashCode2 = (iHashCode + (purchaseCouponObj == null ? 0 : purchaseCouponObj.hashCode())) * 31;
        PurchaseParamObj purchaseParamObj = this.params;
        return iHashCode2 + (purchaseParamObj != null ? purchaseParamObj.hashCode() : 0);
    }

    public final void setCoupon_params(@e PurchaseCouponObj purchaseCouponObj) {
        this.coupon_params = purchaseCouponObj;
    }

    public final void setParams(@e PurchaseParamObj purchaseParamObj) {
        this.params = purchaseParamObj;
    }

    public final void setReference_price_text(@e String str) {
        this.reference_price_text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15676, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseBaseInfoObj(reference_price_text=" + this.reference_price_text + ", coupon_params=" + this.coupon_params + ", params=" + this.params + ')';
    }
}
