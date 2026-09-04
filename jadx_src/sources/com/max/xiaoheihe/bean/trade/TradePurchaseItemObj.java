package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradePurchaseItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradePurchaseItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private TradeSteamInventoryObj asset;

    @e
    private String finish_time;

    @e
    private String sku_id;

    @e
    private String state;

    public TradePurchaseItemObj(@e String str, @e String str2, @e String str3, @e TradeSteamInventoryObj tradeSteamInventoryObj) {
        this.state = str;
        this.sku_id = str2;
        this.finish_time = str3;
        this.asset = tradeSteamInventoryObj;
    }

    public static /* synthetic */ TradePurchaseItemObj copy$default(TradePurchaseItemObj tradePurchaseItemObj, String str, String str2, String str3, TradeSteamInventoryObj tradeSteamInventoryObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseItemObj, str, str2, str3, tradeSteamInventoryObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 16143, new Class[]{TradePurchaseItemObj.class, String.class, String.class, String.class, TradeSteamInventoryObj.class, Integer.TYPE, Object.class}, TradePurchaseItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePurchaseItemObj) patchProxyResultProxy.result;
        }
        return tradePurchaseItemObj.copy((i10 & 1) != 0 ? tradePurchaseItemObj.state : str, (i10 & 2) != 0 ? tradePurchaseItemObj.sku_id : str2, (i10 & 4) != 0 ? tradePurchaseItemObj.finish_time : str3, (i10 & 8) != 0 ? tradePurchaseItemObj.asset : tradeSteamInventoryObj);
    }

    @e
    public final String component1() {
        return this.state;
    }

    @e
    public final String component2() {
        return this.sku_id;
    }

    @e
    public final String component3() {
        return this.finish_time;
    }

    @e
    public final TradeSteamInventoryObj component4() {
        return this.asset;
    }

    @d
    public final TradePurchaseItemObj copy(@e String str, @e String str2, @e String str3, @e TradeSteamInventoryObj tradeSteamInventoryObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 16142, new Class[]{String.class, String.class, String.class, TradeSteamInventoryObj.class}, TradePurchaseItemObj.class);
        return patchProxyResultProxy.isSupported ? (TradePurchaseItemObj) patchProxyResultProxy.result : new TradePurchaseItemObj(str, str2, str3, tradeSteamInventoryObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16146, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradePurchaseItemObj)) {
            return false;
        }
        TradePurchaseItemObj tradePurchaseItemObj = (TradePurchaseItemObj) obj;
        return f0.g(this.state, tradePurchaseItemObj.state) && f0.g(this.sku_id, tradePurchaseItemObj.sku_id) && f0.g(this.finish_time, tradePurchaseItemObj.finish_time) && f0.g(this.asset, tradePurchaseItemObj.asset);
    }

    @e
    public final TradeSteamInventoryObj getAsset() {
        return this.asset;
    }

    @e
    public final String getFinish_time() {
        return this.finish_time;
    }

    @e
    public final String getSku_id() {
        return this.sku_id;
    }

    @e
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16145, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.state;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sku_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.finish_time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TradeSteamInventoryObj tradeSteamInventoryObj = this.asset;
        return iHashCode3 + (tradeSteamInventoryObj != null ? tradeSteamInventoryObj.hashCode() : 0);
    }

    public final void setAsset(@e TradeSteamInventoryObj tradeSteamInventoryObj) {
        this.asset = tradeSteamInventoryObj;
    }

    public final void setFinish_time(@e String str) {
        this.finish_time = str;
    }

    public final void setSku_id(@e String str) {
        this.sku_id = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16144, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradePurchaseItemObj(state=" + this.state + ", sku_id=" + this.sku_id + ", finish_time=" + this.finish_time + ", asset=" + this.asset + ')';
    }
}
