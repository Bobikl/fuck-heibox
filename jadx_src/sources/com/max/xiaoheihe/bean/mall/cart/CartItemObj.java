package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CartItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CartItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String cart_id;

    @e
    private List<String> content;

    @e
    private Integer count;

    @e
    private String h_src;

    @e
    private Integer maximum;

    @e
    private String price_delta_desc;

    @d
    private MallProductObj product;

    @e
    private String sale_state_desc;

    @e
    private String state;

    @e
    private List<String> tags;

    public CartItemObj(@e String str, @d MallProductObj product, @e List<String> list, @d String cart_id, @e String str2, @e String str3, @e Integer num, @e String str4, @e List<String> list2, @e Integer num2) {
        f0.p(product, "product");
        f0.p(cart_id, "cart_id");
        this.h_src = str;
        this.product = product;
        this.content = list;
        this.cart_id = cart_id;
        this.price_delta_desc = str2;
        this.sale_state_desc = str3;
        this.maximum = num;
        this.state = str4;
        this.tags = list2;
        this.count = num2;
    }

    public /* synthetic */ CartItemObj(String str, MallProductObj mallProductObj, List list, String str2, String str3, String str4, Integer num, String str5, List list2, Integer num2, int i10, u uVar) {
        this(str, mallProductObj, list, str2, str3, str4, num, str5, list2, (i10 & 512) != 0 ? 1 : num2);
    }

    public static /* synthetic */ CartItemObj copy$default(CartItemObj cartItemObj, String str, MallProductObj mallProductObj, List list, String str2, String str3, String str4, Integer num, String str5, List list2, Integer num2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartItemObj, str, mallProductObj, list, str2, str3, str4, num, str5, list2, num2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15579, new Class[]{CartItemObj.class, String.class, MallProductObj.class, List.class, String.class, String.class, String.class, Integer.class, String.class, List.class, Integer.class, Integer.TYPE, Object.class}, CartItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartItemObj) patchProxyResultProxy.result;
        }
        return cartItemObj.copy((i10 & 1) != 0 ? cartItemObj.h_src : str, (i10 & 2) != 0 ? cartItemObj.product : mallProductObj, (i10 & 4) != 0 ? cartItemObj.content : list, (i10 & 8) != 0 ? cartItemObj.cart_id : str2, (i10 & 16) != 0 ? cartItemObj.price_delta_desc : str3, (i10 & 32) != 0 ? cartItemObj.sale_state_desc : str4, (i10 & 64) != 0 ? cartItemObj.maximum : num, (i10 & 128) != 0 ? cartItemObj.state : str5, (i10 & 256) != 0 ? cartItemObj.tags : list2, (i10 & 512) != 0 ? cartItemObj.count : num2);
    }

    @e
    public final String component1() {
        return this.h_src;
    }

    @e
    public final Integer component10() {
        return this.count;
    }

    @d
    public final MallProductObj component2() {
        return this.product;
    }

    @e
    public final List<String> component3() {
        return this.content;
    }

    @d
    public final String component4() {
        return this.cart_id;
    }

    @e
    public final String component5() {
        return this.price_delta_desc;
    }

    @e
    public final String component6() {
        return this.sale_state_desc;
    }

    @e
    public final Integer component7() {
        return this.maximum;
    }

    @e
    public final String component8() {
        return this.state;
    }

    @e
    public final List<String> component9() {
        return this.tags;
    }

    @d
    public final CartItemObj copy(@e String str, @d MallProductObj product, @e List<String> list, @d String cart_id, @e String str2, @e String str3, @e Integer num, @e String str4, @e List<String> list2, @e Integer num2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, product, list, cart_id, str2, str3, num, str4, list2, num2}, this, changeQuickRedirect, false, 15578, new Class[]{String.class, MallProductObj.class, List.class, String.class, String.class, String.class, Integer.class, String.class, List.class, Integer.class}, CartItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartItemObj) patchProxyResultProxy.result;
        }
        f0.p(product, "product");
        f0.p(cart_id, "cart_id");
        return new CartItemObj(str, product, list, cart_id, str2, str3, num, str4, list2, num2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15576, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(CartItemObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.mall.cart.CartItemObj");
        return f0.g(this.cart_id, ((CartItemObj) obj).cart_id);
    }

    @d
    public final String getCart_id() {
        return this.cart_id;
    }

    @e
    public final List<String> getContent() {
        return this.content;
    }

    @e
    public final Integer getCount() {
        return this.count;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final Integer getMaximum() {
        return this.maximum;
    }

    @e
    public final String getPrice_delta_desc() {
        return this.price_delta_desc;
    }

    @d
    public final MallProductObj getProduct() {
        return this.product;
    }

    @e
    public final String getSale_state_desc() {
        return this.sale_state_desc;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15577, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.cart_id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setCart_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15575, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.cart_id = str;
    }

    public final void setContent(@e List<String> list) {
        this.content = list;
    }

    public final void setCount(@e Integer num) {
        this.count = num;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setMaximum(@e Integer num) {
        this.maximum = num;
    }

    public final void setPrice_delta_desc(@e String str) {
        this.price_delta_desc = str;
    }

    public final void setProduct(@d MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductObj}, this, changeQuickRedirect, false, 15574, new Class[]{MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductObj, "<set-?>");
        this.product = mallProductObj;
    }

    public final void setSale_state_desc(@e String str) {
        this.sale_state_desc = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setTags(@e List<String> list) {
        this.tags = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15580, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CartItemObj(h_src=" + this.h_src + ", product=" + this.product + ", content=" + this.content + ", cart_id=" + this.cart_id + ", price_delta_desc=" + this.price_delta_desc + ", sale_state_desc=" + this.sale_state_desc + ", maximum=" + this.maximum + ", state=" + this.state + ", tags=" + this.tags + ", count=" + this.count + ')';
    }
}
