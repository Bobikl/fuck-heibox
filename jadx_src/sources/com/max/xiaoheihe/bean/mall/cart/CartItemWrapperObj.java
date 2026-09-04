package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.mall.cart.CartListItemType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CartDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CartItemWrapperObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private CartGroupObj gourp;

    @e
    private Boolean is_checked;

    @e
    private CartItemObj item;

    @d
    private CartListItemType item_type;

    public CartItemWrapperObj(@d CartGroupObj gourp, @e CartItemObj cartItemObj, @e Boolean bool, @d CartListItemType item_type) {
        f0.p(gourp, "gourp");
        f0.p(item_type, "item_type");
        this.gourp = gourp;
        this.item = cartItemObj;
        this.is_checked = bool;
        this.item_type = item_type;
    }

    public static /* synthetic */ CartItemWrapperObj copy$default(CartItemWrapperObj cartItemWrapperObj, CartGroupObj cartGroupObj, CartItemObj cartItemObj, Boolean bool, CartListItemType cartListItemType, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartItemWrapperObj, cartGroupObj, cartItemObj, bool, cartListItemType, new Integer(i10), obj}, null, changeQuickRedirect, true, 15584, new Class[]{CartItemWrapperObj.class, CartGroupObj.class, CartItemObj.class, Boolean.class, CartListItemType.class, Integer.TYPE, Object.class}, CartItemWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartItemWrapperObj) patchProxyResultProxy.result;
        }
        return cartItemWrapperObj.copy((i10 & 1) != 0 ? cartItemWrapperObj.gourp : cartGroupObj, (i10 & 2) != 0 ? cartItemWrapperObj.item : cartItemObj, (i10 & 4) != 0 ? cartItemWrapperObj.is_checked : bool, (i10 & 8) != 0 ? cartItemWrapperObj.item_type : cartListItemType);
    }

    @d
    public final CartGroupObj component1() {
        return this.gourp;
    }

    @e
    public final CartItemObj component2() {
        return this.item;
    }

    @e
    public final Boolean component3() {
        return this.is_checked;
    }

    @d
    public final CartListItemType component4() {
        return this.item_type;
    }

    @d
    public final CartItemWrapperObj copy(@d CartGroupObj gourp, @e CartItemObj cartItemObj, @e Boolean bool, @d CartListItemType item_type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gourp, cartItemObj, bool, item_type}, this, changeQuickRedirect, false, 15583, new Class[]{CartGroupObj.class, CartItemObj.class, Boolean.class, CartListItemType.class}, CartItemWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartItemWrapperObj) patchProxyResultProxy.result;
        }
        f0.p(gourp, "gourp");
        f0.p(item_type, "item_type");
        return new CartItemWrapperObj(gourp, cartItemObj, bool, item_type);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15587, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItemWrapperObj)) {
            return false;
        }
        CartItemWrapperObj cartItemWrapperObj = (CartItemWrapperObj) obj;
        return f0.g(this.gourp, cartItemWrapperObj.gourp) && f0.g(this.item, cartItemWrapperObj.item) && f0.g(this.is_checked, cartItemWrapperObj.is_checked) && this.item_type == cartItemWrapperObj.item_type;
    }

    @d
    public final CartGroupObj getGourp() {
        return this.gourp;
    }

    @e
    public final CartItemObj getItem() {
        return this.item;
    }

    @d
    public final CartListItemType getItem_type() {
        return this.item_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15586, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.gourp.hashCode() * 31;
        CartItemObj cartItemObj = this.item;
        int iHashCode2 = (iHashCode + (cartItemObj == null ? 0 : cartItemObj.hashCode())) * 31;
        Boolean bool = this.is_checked;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.item_type.hashCode();
    }

    @e
    public final Boolean is_checked() {
        return this.is_checked;
    }

    public final void setGourp(@d CartGroupObj cartGroupObj) {
        if (PatchProxy.proxy(new Object[]{cartGroupObj}, this, changeQuickRedirect, false, 15581, new Class[]{CartGroupObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cartGroupObj, "<set-?>");
        this.gourp = cartGroupObj;
    }

    public final void setItem(@e CartItemObj cartItemObj) {
        this.item = cartItemObj;
    }

    public final void setItem_type(@d CartListItemType cartListItemType) {
        if (PatchProxy.proxy(new Object[]{cartListItemType}, this, changeQuickRedirect, false, 15582, new Class[]{CartListItemType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cartListItemType, "<set-?>");
        this.item_type = cartListItemType;
    }

    public final void set_checked(@e Boolean bool) {
        this.is_checked = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15585, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CartItemWrapperObj(gourp=" + this.gourp + ", item=" + this.item + ", is_checked=" + this.is_checked + ", item_type=" + this.item_type + ')';
    }
}
