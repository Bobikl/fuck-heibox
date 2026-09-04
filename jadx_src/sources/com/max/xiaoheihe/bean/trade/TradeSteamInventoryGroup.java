package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeSteamInventoryGroup.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSteamInventoryGroup implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<TradeSteamInventoryObj> items;

    @e
    private String warn_desc;

    public TradeSteamInventoryGroup(@d List<TradeSteamInventoryObj> items, @e String str) {
        f0.p(items, "items");
        this.items = items;
        this.warn_desc = str;
    }

    public static /* synthetic */ TradeSteamInventoryGroup copy$default(TradeSteamInventoryGroup tradeSteamInventoryGroup, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSteamInventoryGroup, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 16178, new Class[]{TradeSteamInventoryGroup.class, List.class, String.class, Integer.TYPE, Object.class}, TradeSteamInventoryGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamInventoryGroup) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = tradeSteamInventoryGroup.items;
        }
        if ((i10 & 2) != 0) {
            str = tradeSteamInventoryGroup.warn_desc;
        }
        return tradeSteamInventoryGroup.copy(list, str);
    }

    @d
    public final List<TradeSteamInventoryObj> component1() {
        return this.items;
    }

    @e
    public final String component2() {
        return this.warn_desc;
    }

    @d
    public final TradeSteamInventoryGroup copy(@d List<TradeSteamInventoryObj> items, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{items, str}, this, changeQuickRedirect, false, 16177, new Class[]{List.class, String.class}, TradeSteamInventoryGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamInventoryGroup) patchProxyResultProxy.result;
        }
        f0.p(items, "items");
        return new TradeSteamInventoryGroup(items, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16181, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSteamInventoryGroup)) {
            return false;
        }
        TradeSteamInventoryGroup tradeSteamInventoryGroup = (TradeSteamInventoryGroup) obj;
        return f0.g(this.items, tradeSteamInventoryGroup.items) && f0.g(this.warn_desc, tradeSteamInventoryGroup.warn_desc);
    }

    @d
    public final List<TradeSteamInventoryObj> getItems() {
        return this.items;
    }

    @e
    public final String getWarn_desc() {
        return this.warn_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16180, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.items.hashCode() * 31;
        String str = this.warn_desc;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setItems(@d List<TradeSteamInventoryObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 16176, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.items = list;
    }

    public final void setWarn_desc(@e String str) {
        this.warn_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16179, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSteamInventoryGroup(items=" + this.items + ", warn_desc=" + this.warn_desc + ')';
    }
}
