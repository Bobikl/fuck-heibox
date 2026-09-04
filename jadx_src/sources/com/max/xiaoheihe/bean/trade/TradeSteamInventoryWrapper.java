package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeSteamInventoryWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSteamInventoryWrapper implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private TradeSteamInventoryGroup itemGroup;

    @e
    private TradeSteamInventoryObj singleItem;

    public TradeSteamInventoryWrapper(@e TradeSteamInventoryObj tradeSteamInventoryObj, @e TradeSteamInventoryGroup tradeSteamInventoryGroup) {
        this.singleItem = tradeSteamInventoryObj;
        this.itemGroup = tradeSteamInventoryGroup;
    }

    public /* synthetic */ TradeSteamInventoryWrapper(TradeSteamInventoryObj tradeSteamInventoryObj, TradeSteamInventoryGroup tradeSteamInventoryGroup, int i10, u uVar) {
        this(tradeSteamInventoryObj, (i10 & 2) != 0 ? null : tradeSteamInventoryGroup);
    }

    public static /* synthetic */ TradeSteamInventoryWrapper copy$default(TradeSteamInventoryWrapper tradeSteamInventoryWrapper, TradeSteamInventoryObj tradeSteamInventoryObj, TradeSteamInventoryGroup tradeSteamInventoryGroup, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSteamInventoryWrapper, tradeSteamInventoryObj, tradeSteamInventoryGroup, new Integer(i10), obj}, null, changeQuickRedirect, true, 16193, new Class[]{TradeSteamInventoryWrapper.class, TradeSteamInventoryObj.class, TradeSteamInventoryGroup.class, Integer.TYPE, Object.class}, TradeSteamInventoryWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamInventoryWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            tradeSteamInventoryObj = tradeSteamInventoryWrapper.singleItem;
        }
        if ((i10 & 2) != 0) {
            tradeSteamInventoryGroup = tradeSteamInventoryWrapper.itemGroup;
        }
        return tradeSteamInventoryWrapper.copy(tradeSteamInventoryObj, tradeSteamInventoryGroup);
    }

    @e
    public final TradeSteamInventoryObj component1() {
        return this.singleItem;
    }

    @e
    public final TradeSteamInventoryGroup component2() {
        return this.itemGroup;
    }

    @d
    public final TradeSteamInventoryWrapper copy(@e TradeSteamInventoryObj tradeSteamInventoryObj, @e TradeSteamInventoryGroup tradeSteamInventoryGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSteamInventoryObj, tradeSteamInventoryGroup}, this, changeQuickRedirect, false, 16192, new Class[]{TradeSteamInventoryObj.class, TradeSteamInventoryGroup.class}, TradeSteamInventoryWrapper.class);
        return patchProxyResultProxy.isSupported ? (TradeSteamInventoryWrapper) patchProxyResultProxy.result : new TradeSteamInventoryWrapper(tradeSteamInventoryObj, tradeSteamInventoryGroup);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16196, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSteamInventoryWrapper)) {
            return false;
        }
        TradeSteamInventoryWrapper tradeSteamInventoryWrapper = (TradeSteamInventoryWrapper) obj;
        return f0.g(this.singleItem, tradeSteamInventoryWrapper.singleItem) && f0.g(this.itemGroup, tradeSteamInventoryWrapper.itemGroup);
    }

    @e
    public final TradeSteamInventoryGroup getItemGroup() {
        return this.itemGroup;
    }

    @e
    public final TradeSteamInventoryObj getSingleItem() {
        return this.singleItem;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16195, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        TradeSteamInventoryObj tradeSteamInventoryObj = this.singleItem;
        int iHashCode = (tradeSteamInventoryObj == null ? 0 : tradeSteamInventoryObj.hashCode()) * 31;
        TradeSteamInventoryGroup tradeSteamInventoryGroup = this.itemGroup;
        return iHashCode + (tradeSteamInventoryGroup != null ? tradeSteamInventoryGroup.hashCode() : 0);
    }

    public final void setItemGroup(@e TradeSteamInventoryGroup tradeSteamInventoryGroup) {
        this.itemGroup = tradeSteamInventoryGroup;
    }

    public final void setSingleItem(@e TradeSteamInventoryObj tradeSteamInventoryObj) {
        this.singleItem = tradeSteamInventoryObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16194, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSteamInventoryWrapper(singleItem=" + this.singleItem + ", itemGroup=" + this.itemGroup + ')';
    }
}
