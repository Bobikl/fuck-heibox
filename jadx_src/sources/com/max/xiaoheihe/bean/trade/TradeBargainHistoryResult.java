package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.StateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBargainHistoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeBargainHistoryResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private StateObj bargain_state;

    @e
    private ArrayList<TradeBargainOrderInfoObj> orders;

    @d
    private TradeSteamInventoryObj sku_info;

    public TradeBargainHistoryResult(@e StateObj stateObj, @e ArrayList<TradeBargainOrderInfoObj> arrayList, @d TradeSteamInventoryObj sku_info) {
        f0.p(sku_info, "sku_info");
        this.bargain_state = stateObj;
        this.orders = arrayList;
        this.sku_info = sku_info;
    }

    public static /* synthetic */ TradeBargainHistoryResult copy$default(TradeBargainHistoryResult tradeBargainHistoryResult, StateObj stateObj, ArrayList arrayList, TradeSteamInventoryObj tradeSteamInventoryObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeBargainHistoryResult, stateObj, arrayList, tradeSteamInventoryObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 16046, new Class[]{TradeBargainHistoryResult.class, StateObj.class, ArrayList.class, TradeSteamInventoryObj.class, Integer.TYPE, Object.class}, TradeBargainHistoryResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBargainHistoryResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            stateObj = tradeBargainHistoryResult.bargain_state;
        }
        if ((i10 & 2) != 0) {
            arrayList = tradeBargainHistoryResult.orders;
        }
        if ((i10 & 4) != 0) {
            tradeSteamInventoryObj = tradeBargainHistoryResult.sku_info;
        }
        return tradeBargainHistoryResult.copy(stateObj, arrayList, tradeSteamInventoryObj);
    }

    @e
    public final StateObj component1() {
        return this.bargain_state;
    }

    @e
    public final ArrayList<TradeBargainOrderInfoObj> component2() {
        return this.orders;
    }

    @d
    public final TradeSteamInventoryObj component3() {
        return this.sku_info;
    }

    @d
    public final TradeBargainHistoryResult copy(@e StateObj stateObj, @e ArrayList<TradeBargainOrderInfoObj> arrayList, @d TradeSteamInventoryObj sku_info) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stateObj, arrayList, sku_info}, this, changeQuickRedirect, false, 16045, new Class[]{StateObj.class, ArrayList.class, TradeSteamInventoryObj.class}, TradeBargainHistoryResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBargainHistoryResult) patchProxyResultProxy.result;
        }
        f0.p(sku_info, "sku_info");
        return new TradeBargainHistoryResult(stateObj, arrayList, sku_info);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16049, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeBargainHistoryResult)) {
            return false;
        }
        TradeBargainHistoryResult tradeBargainHistoryResult = (TradeBargainHistoryResult) obj;
        return f0.g(this.bargain_state, tradeBargainHistoryResult.bargain_state) && f0.g(this.orders, tradeBargainHistoryResult.orders) && f0.g(this.sku_info, tradeBargainHistoryResult.sku_info);
    }

    @e
    public final StateObj getBargain_state() {
        return this.bargain_state;
    }

    @e
    public final ArrayList<TradeBargainOrderInfoObj> getOrders() {
        return this.orders;
    }

    @d
    public final TradeSteamInventoryObj getSku_info() {
        return this.sku_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16048, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StateObj stateObj = this.bargain_state;
        int iHashCode = (stateObj == null ? 0 : stateObj.hashCode()) * 31;
        ArrayList<TradeBargainOrderInfoObj> arrayList = this.orders;
        return ((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + this.sku_info.hashCode();
    }

    public final void setBargain_state(@e StateObj stateObj) {
        this.bargain_state = stateObj;
    }

    public final void setOrders(@e ArrayList<TradeBargainOrderInfoObj> arrayList) {
        this.orders = arrayList;
    }

    public final void setSku_info(@d TradeSteamInventoryObj tradeSteamInventoryObj) {
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryObj}, this, changeQuickRedirect, false, 16044, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tradeSteamInventoryObj, "<set-?>");
        this.sku_info = tradeSteamInventoryObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16047, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeBargainHistoryResult(bargain_state=" + this.bargain_state + ", orders=" + this.orders + ", sku_info=" + this.sku_info + ')';
    }
}
