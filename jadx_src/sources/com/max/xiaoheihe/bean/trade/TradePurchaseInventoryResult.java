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

/* JADX INFO: compiled from: TradePurchaseInventoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradePurchaseInventoryResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private TradeSteamInventoryObj asset;

    @e
    private String count;

    @e
    private String fee_rate;

    @e
    private List<TradeSteamInventoryObj> list;

    public TradePurchaseInventoryResult(@e String str, @e String str2, @e TradeSteamInventoryObj tradeSteamInventoryObj, @e List<TradeSteamInventoryObj> list) {
        this.count = str;
        this.fee_rate = str2;
        this.asset = tradeSteamInventoryObj;
        this.list = list;
    }

    public static /* synthetic */ TradePurchaseInventoryResult copy$default(TradePurchaseInventoryResult tradePurchaseInventoryResult, String str, String str2, TradeSteamInventoryObj tradeSteamInventoryObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseInventoryResult, str, str2, tradeSteamInventoryObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 16138, new Class[]{TradePurchaseInventoryResult.class, String.class, String.class, TradeSteamInventoryObj.class, List.class, Integer.TYPE, Object.class}, TradePurchaseInventoryResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePurchaseInventoryResult) patchProxyResultProxy.result;
        }
        return tradePurchaseInventoryResult.copy((i10 & 1) != 0 ? tradePurchaseInventoryResult.count : str, (i10 & 2) != 0 ? tradePurchaseInventoryResult.fee_rate : str2, (i10 & 4) != 0 ? tradePurchaseInventoryResult.asset : tradeSteamInventoryObj, (i10 & 8) != 0 ? tradePurchaseInventoryResult.list : list);
    }

    @e
    public final String component1() {
        return this.count;
    }

    @e
    public final String component2() {
        return this.fee_rate;
    }

    @e
    public final TradeSteamInventoryObj component3() {
        return this.asset;
    }

    @e
    public final List<TradeSteamInventoryObj> component4() {
        return this.list;
    }

    @d
    public final TradePurchaseInventoryResult copy(@e String str, @e String str2, @e TradeSteamInventoryObj tradeSteamInventoryObj, @e List<TradeSteamInventoryObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, tradeSteamInventoryObj, list}, this, changeQuickRedirect, false, 16137, new Class[]{String.class, String.class, TradeSteamInventoryObj.class, List.class}, TradePurchaseInventoryResult.class);
        return patchProxyResultProxy.isSupported ? (TradePurchaseInventoryResult) patchProxyResultProxy.result : new TradePurchaseInventoryResult(str, str2, tradeSteamInventoryObj, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16141, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradePurchaseInventoryResult)) {
            return false;
        }
        TradePurchaseInventoryResult tradePurchaseInventoryResult = (TradePurchaseInventoryResult) obj;
        return f0.g(this.count, tradePurchaseInventoryResult.count) && f0.g(this.fee_rate, tradePurchaseInventoryResult.fee_rate) && f0.g(this.asset, tradePurchaseInventoryResult.asset) && f0.g(this.list, tradePurchaseInventoryResult.list);
    }

    @e
    public final TradeSteamInventoryObj getAsset() {
        return this.asset;
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getFee_rate() {
        return this.fee_rate;
    }

    @e
    public final List<TradeSteamInventoryObj> getList() {
        return this.list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16140, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.count;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fee_rate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TradeSteamInventoryObj tradeSteamInventoryObj = this.asset;
        int iHashCode3 = (iHashCode2 + (tradeSteamInventoryObj == null ? 0 : tradeSteamInventoryObj.hashCode())) * 31;
        List<TradeSteamInventoryObj> list = this.list;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setAsset(@e TradeSteamInventoryObj tradeSteamInventoryObj) {
        this.asset = tradeSteamInventoryObj;
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setFee_rate(@e String str) {
        this.fee_rate = str;
    }

    public final void setList(@e List<TradeSteamInventoryObj> list) {
        this.list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16139, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradePurchaseInventoryResult(count=" + this.count + ", fee_rate=" + this.fee_rate + ", asset=" + this.asset + ", list=" + this.list + ')';
    }
}
