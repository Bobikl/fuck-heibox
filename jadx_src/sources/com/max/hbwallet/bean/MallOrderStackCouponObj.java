package com.max.hbwallet.bean;

import bb.c;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallOrderStackCouponObj.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nMallOrderStackCouponObj.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallOrderStackCouponObj.kt\ncom/max/hbwallet/bean/MallOrderStackCouponObj\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1855#2,2:39\n*S KotlinDebug\n*F\n+ 1 MallOrderStackCouponObj.kt\ncom/max/hbwallet/bean/MallOrderStackCouponObj\n*L\n19#1:39,2\n*E\n"})
public final class MallOrderStackCouponObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String available_stack_cnt;

    @d
    private String coupon_sku_id;

    @d
    private ArrayList<MallCouponObj> coupons;

    @d
    private StackCouponPriceObj price;

    @e
    private Boolean selected;

    @e
    private MallOrderSuggestCoupon suggest_coupon;

    @e
    private String tip;

    @d
    private String total_value;

    public MallOrderStackCouponObj(@e MallOrderSuggestCoupon mallOrderSuggestCoupon, @d StackCouponPriceObj price, @e String str, @d String total_value, @d String coupon_sku_id, @e Boolean bool, @e String str2, @d ArrayList<MallCouponObj> coupons) {
        f0.p(price, "price");
        f0.p(total_value, "total_value");
        f0.p(coupon_sku_id, "coupon_sku_id");
        f0.p(coupons, "coupons");
        this.suggest_coupon = mallOrderSuggestCoupon;
        this.price = price;
        this.tip = str;
        this.total_value = total_value;
        this.coupon_sku_id = coupon_sku_id;
        this.selected = bool;
        this.available_stack_cnt = str2;
        this.coupons = coupons;
    }

    public /* synthetic */ MallOrderStackCouponObj(MallOrderSuggestCoupon mallOrderSuggestCoupon, StackCouponPriceObj stackCouponPriceObj, String str, String str2, String str3, Boolean bool, String str4, ArrayList arrayList, int i10, u uVar) {
        this(mallOrderSuggestCoupon, stackCouponPriceObj, str, str2, str3, (i10 & 32) != 0 ? Boolean.FALSE : bool, str4, arrayList);
    }

    public static /* synthetic */ MallOrderStackCouponObj copy$default(MallOrderStackCouponObj mallOrderStackCouponObj, MallOrderSuggestCoupon mallOrderSuggestCoupon, StackCouponPriceObj stackCouponPriceObj, String str, String str2, String str3, Boolean bool, String str4, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderStackCouponObj, mallOrderSuggestCoupon, stackCouponPriceObj, str, str2, str3, bool, str4, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 10106, new Class[]{MallOrderStackCouponObj.class, MallOrderSuggestCoupon.class, StackCouponPriceObj.class, String.class, String.class, String.class, Boolean.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, MallOrderStackCouponObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderStackCouponObj) patchProxyResultProxy.result;
        }
        return mallOrderStackCouponObj.copy((i10 & 1) != 0 ? mallOrderStackCouponObj.suggest_coupon : mallOrderSuggestCoupon, (i10 & 2) != 0 ? mallOrderStackCouponObj.price : stackCouponPriceObj, (i10 & 4) != 0 ? mallOrderStackCouponObj.tip : str, (i10 & 8) != 0 ? mallOrderStackCouponObj.total_value : str2, (i10 & 16) != 0 ? mallOrderStackCouponObj.coupon_sku_id : str3, (i10 & 32) != 0 ? mallOrderStackCouponObj.selected : bool, (i10 & 64) != 0 ? mallOrderStackCouponObj.available_stack_cnt : str4, (i10 & 128) != 0 ? mallOrderStackCouponObj.coupons : arrayList);
    }

    @e
    public final MallOrderSuggestCoupon component1() {
        return this.suggest_coupon;
    }

    @d
    public final StackCouponPriceObj component2() {
        return this.price;
    }

    @e
    public final String component3() {
        return this.tip;
    }

    @d
    public final String component4() {
        return this.total_value;
    }

    @d
    public final String component5() {
        return this.coupon_sku_id;
    }

    @e
    public final Boolean component6() {
        return this.selected;
    }

    @e
    public final String component7() {
        return this.available_stack_cnt;
    }

    @d
    public final ArrayList<MallCouponObj> component8() {
        return this.coupons;
    }

    @d
    public final MallOrderStackCouponObj copy(@e MallOrderSuggestCoupon mallOrderSuggestCoupon, @d StackCouponPriceObj price, @e String str, @d String total_value, @d String coupon_sku_id, @e Boolean bool, @e String str2, @d ArrayList<MallCouponObj> coupons) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderSuggestCoupon, price, str, total_value, coupon_sku_id, bool, str2, coupons}, this, changeQuickRedirect, false, 10105, new Class[]{MallOrderSuggestCoupon.class, StackCouponPriceObj.class, String.class, String.class, String.class, Boolean.class, String.class, ArrayList.class}, MallOrderStackCouponObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderStackCouponObj) patchProxyResultProxy.result;
        }
        f0.p(price, "price");
        f0.p(total_value, "total_value");
        f0.p(coupon_sku_id, "coupon_sku_id");
        f0.p(coupons, "coupons");
        return new MallOrderStackCouponObj(mallOrderSuggestCoupon, price, str, total_value, coupon_sku_id, bool, str2, coupons);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 10109, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderStackCouponObj)) {
            return false;
        }
        MallOrderStackCouponObj mallOrderStackCouponObj = (MallOrderStackCouponObj) obj;
        return f0.g(this.suggest_coupon, mallOrderStackCouponObj.suggest_coupon) && f0.g(this.price, mallOrderStackCouponObj.price) && f0.g(this.tip, mallOrderStackCouponObj.tip) && f0.g(this.total_value, mallOrderStackCouponObj.total_value) && f0.g(this.coupon_sku_id, mallOrderStackCouponObj.coupon_sku_id) && f0.g(this.selected, mallOrderStackCouponObj.selected) && f0.g(this.available_stack_cnt, mallOrderStackCouponObj.available_stack_cnt) && f0.g(this.coupons, mallOrderStackCouponObj.coupons);
    }

    @e
    public final String getAvailable_stack_cnt() {
        return this.available_stack_cnt;
    }

    @d
    public final String getCoupon_sku_id() {
        return this.coupon_sku_id;
    }

    @d
    public final ArrayList<MallCouponObj> getCoupons() {
        return this.coupons;
    }

    @d
    public final ArrayList<MallCouponObj> getFlat_coupons() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10104, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<MallCouponObj> arrayList = new ArrayList<>();
        for (MallCouponObj mallCouponObj : this.coupons) {
            int iU = fi.u.u(n.q(mallCouponObj.getNum()), 1);
            for (int i10 = 0; i10 < iU; i10++) {
                arrayList.add(mallCouponObj);
            }
        }
        return arrayList;
    }

    @d
    public final StackCouponPriceObj getPrice() {
        return this.price;
    }

    @e
    public final Boolean getSelected() {
        return this.selected;
    }

    @e
    public final MallOrderSuggestCoupon getSuggest_coupon() {
        return this.suggest_coupon;
    }

    @e
    public final String getTip() {
        return this.tip;
    }

    @d
    public final String getTotal_value() {
        return this.total_value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10108, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        MallOrderSuggestCoupon mallOrderSuggestCoupon = this.suggest_coupon;
        int iHashCode = (((mallOrderSuggestCoupon == null ? 0 : mallOrderSuggestCoupon.hashCode()) * 31) + this.price.hashCode()) * 31;
        String str = this.tip;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.total_value.hashCode()) * 31) + this.coupon_sku_id.hashCode()) * 31;
        Boolean bool = this.selected;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.available_stack_cnt;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.coupons.hashCode();
    }

    public final void setAvailable_stack_cnt(@e String str) {
        this.available_stack_cnt = str;
    }

    public final void setCoupon_sku_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 10102, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.coupon_sku_id = str;
    }

    public final void setCoupons(@d ArrayList<MallCouponObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 10103, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.coupons = arrayList;
    }

    public final void setPrice(@d StackCouponPriceObj stackCouponPriceObj) {
        if (PatchProxy.proxy(new Object[]{stackCouponPriceObj}, this, changeQuickRedirect, false, 10100, new Class[]{StackCouponPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(stackCouponPriceObj, "<set-?>");
        this.price = stackCouponPriceObj;
    }

    public final void setSelected(@e Boolean bool) {
        this.selected = bool;
    }

    public final void setSuggest_coupon(@e MallOrderSuggestCoupon mallOrderSuggestCoupon) {
        this.suggest_coupon = mallOrderSuggestCoupon;
    }

    public final void setTip(@e String str) {
        this.tip = str;
    }

    public final void setTotal_value(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.l.T2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.total_value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10107, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallOrderStackCouponObj(suggest_coupon=" + this.suggest_coupon + ", price=" + this.price + ", tip=" + this.tip + ", total_value=" + this.total_value + ", coupon_sku_id=" + this.coupon_sku_id + ", selected=" + this.selected + ", available_stack_cnt=" + this.available_stack_cnt + ", coupons=" + this.coupons + ')';
    }
}
