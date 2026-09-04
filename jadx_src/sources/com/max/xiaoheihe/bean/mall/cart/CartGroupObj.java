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
public final class CartGroupObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String index_custom;

    @d
    private List<CartItemObj> items;

    @e
    private String multi;

    @e
    private String title;

    public CartGroupObj(@e String str, @e String str2, @e String str3, @d List<CartItemObj> items) {
        f0.p(items, "items");
        this.title = str;
        this.multi = str2;
        this.index_custom = str3;
        this.items = items;
    }

    public static /* synthetic */ CartGroupObj copy$default(CartGroupObj cartGroupObj, String str, String str2, String str3, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartGroupObj, str, str2, str3, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15570, new Class[]{CartGroupObj.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, CartGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartGroupObj) patchProxyResultProxy.result;
        }
        return cartGroupObj.copy((i10 & 1) != 0 ? cartGroupObj.title : str, (i10 & 2) != 0 ? cartGroupObj.multi : str2, (i10 & 4) != 0 ? cartGroupObj.index_custom : str3, (i10 & 8) != 0 ? cartGroupObj.items : list);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.multi;
    }

    @e
    public final String component3() {
        return this.index_custom;
    }

    @d
    public final List<CartItemObj> component4() {
        return this.items;
    }

    @d
    public final CartGroupObj copy(@e String str, @e String str2, @e String str3, @d List<CartItemObj> items) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, items}, this, changeQuickRedirect, false, 15569, new Class[]{String.class, String.class, String.class, List.class}, CartGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartGroupObj) patchProxyResultProxy.result;
        }
        f0.p(items, "items");
        return new CartGroupObj(str, str2, str3, items);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15573, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartGroupObj)) {
            return false;
        }
        CartGroupObj cartGroupObj = (CartGroupObj) obj;
        return f0.g(this.title, cartGroupObj.title) && f0.g(this.multi, cartGroupObj.multi) && f0.g(this.index_custom, cartGroupObj.index_custom) && f0.g(this.items, cartGroupObj.items);
    }

    @e
    public final String getIndex_custom() {
        return this.index_custom;
    }

    @d
    public final List<CartItemObj> getItems() {
        return this.items;
    }

    @e
    public final String getMulti() {
        return this.multi;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15572, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.multi;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.index_custom;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.items.hashCode();
    }

    public final void setIndex_custom(@e String str) {
        this.index_custom = str;
    }

    public final void setItems(@d List<CartItemObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15568, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.items = list;
    }

    public final void setMulti(@e String str) {
        this.multi = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15571, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CartGroupObj(title=" + this.title + ", multi=" + this.multi + ", index_custom=" + this.index_custom + ", items=" + this.items + ')';
    }
}
