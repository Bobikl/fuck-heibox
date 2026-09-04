package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CartDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CartDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cart_count;

    @e
    private List<CartGroupObj> carts;

    @e
    private String h_src;

    @e
    private String message;

    @e
    private String session;

    @e
    private String total_price;

    public CartDetailObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e List<CartGroupObj> list) {
        this.cart_count = str;
        this.session = str2;
        this.total_price = str3;
        this.message = str4;
        this.h_src = str5;
        this.carts = list;
    }

    public static /* synthetic */ CartDetailObj copy$default(CartDetailObj cartDetailObj, String str, String str2, String str3, String str4, String str5, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartDetailObj, str, str2, str3, str4, str5, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15564, new Class[]{CartDetailObj.class, String.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, CartDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartDetailObj) patchProxyResultProxy.result;
        }
        return cartDetailObj.copy((i10 & 1) != 0 ? cartDetailObj.cart_count : str, (i10 & 2) != 0 ? cartDetailObj.session : str2, (i10 & 4) != 0 ? cartDetailObj.total_price : str3, (i10 & 8) != 0 ? cartDetailObj.message : str4, (i10 & 16) != 0 ? cartDetailObj.h_src : str5, (i10 & 32) != 0 ? cartDetailObj.carts : list);
    }

    @e
    public final String component1() {
        return this.cart_count;
    }

    @e
    public final String component2() {
        return this.session;
    }

    @e
    public final String component3() {
        return this.total_price;
    }

    @e
    public final String component4() {
        return this.message;
    }

    @e
    public final String component5() {
        return this.h_src;
    }

    @e
    public final List<CartGroupObj> component6() {
        return this.carts;
    }

    @d
    public final CartDetailObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e List<CartGroupObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, list}, this, changeQuickRedirect, false, 15563, new Class[]{String.class, String.class, String.class, String.class, String.class, List.class}, CartDetailObj.class);
        return patchProxyResultProxy.isSupported ? (CartDetailObj) patchProxyResultProxy.result : new CartDetailObj(str, str2, str3, str4, str5, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15567, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartDetailObj)) {
            return false;
        }
        CartDetailObj cartDetailObj = (CartDetailObj) obj;
        return f0.g(this.cart_count, cartDetailObj.cart_count) && f0.g(this.session, cartDetailObj.session) && f0.g(this.total_price, cartDetailObj.total_price) && f0.g(this.message, cartDetailObj.message) && f0.g(this.h_src, cartDetailObj.h_src) && f0.g(this.carts, cartDetailObj.carts);
    }

    @e
    public final String getCart_count() {
        return this.cart_count;
    }

    @e
    public final List<CartGroupObj> getCarts() {
        return this.carts;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final String getMessage() {
        return this.message;
    }

    @e
    public final String getSession() {
        return this.session;
    }

    @e
    public final String getTotal_price() {
        return this.total_price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15566, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.cart_count;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.session;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.total_price;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h_src;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CartGroupObj> list = this.carts;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final void setCart_count(@e String str) {
        this.cart_count = str;
    }

    public final void setCarts(@e List<CartGroupObj> list) {
        this.carts = list;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setMessage(@e String str) {
        this.message = str;
    }

    public final void setSession(@e String str) {
        this.session = str;
    }

    public final void setTotal_price(@e String str) {
        this.total_price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15565, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CartDetailObj(cart_count=" + this.cart_count + ", session=" + this.session + ", total_price=" + this.total_price + ", message=" + this.message + ", h_src=" + this.h_src + ", carts=" + this.carts + ')';
    }
}
