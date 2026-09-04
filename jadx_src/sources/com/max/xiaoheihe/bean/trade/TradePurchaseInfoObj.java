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

/* JADX INFO: compiled from: TradePurchaseInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradePurchaseInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private TradeSteamInventoryObj asset;

    @e
    private String count;

    @e
    private String create_time;

    @e
    private String high_price;

    @e
    private List<TradePurchaseItemObj> list;

    @e
    private String pcs_id;

    @e
    private String price;

    @e
    private String state;

    @e
    private String supply;

    @e
    private String time_left;

    @e
    private String total;

    public TradePurchaseInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e TradeSteamInventoryObj tradeSteamInventoryObj, @e List<TradePurchaseItemObj> list) {
        this.high_price = str;
        this.supply = str2;
        this.create_time = str3;
        this.total = str4;
        this.count = str5;
        this.pcs_id = str6;
        this.state = str7;
        this.time_left = str8;
        this.price = str9;
        this.asset = tradeSteamInventoryObj;
        this.list = list;
    }

    public static /* synthetic */ TradePurchaseInfoObj copy$default(TradePurchaseInfoObj tradePurchaseInfoObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, TradeSteamInventoryObj tradeSteamInventoryObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseInfoObj, str, str2, str3, str4, str5, str6, str7, str8, str9, tradeSteamInventoryObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 16133, new Class[]{TradePurchaseInfoObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, TradeSteamInventoryObj.class, List.class, Integer.TYPE, Object.class}, TradePurchaseInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePurchaseInfoObj) patchProxyResultProxy.result;
        }
        return tradePurchaseInfoObj.copy((i10 & 1) != 0 ? tradePurchaseInfoObj.high_price : str, (i10 & 2) != 0 ? tradePurchaseInfoObj.supply : str2, (i10 & 4) != 0 ? tradePurchaseInfoObj.create_time : str3, (i10 & 8) != 0 ? tradePurchaseInfoObj.total : str4, (i10 & 16) != 0 ? tradePurchaseInfoObj.count : str5, (i10 & 32) != 0 ? tradePurchaseInfoObj.pcs_id : str6, (i10 & 64) != 0 ? tradePurchaseInfoObj.state : str7, (i10 & 128) != 0 ? tradePurchaseInfoObj.time_left : str8, (i10 & 256) != 0 ? tradePurchaseInfoObj.price : str9, (i10 & 512) != 0 ? tradePurchaseInfoObj.asset : tradeSteamInventoryObj, (i10 & 1024) != 0 ? tradePurchaseInfoObj.list : list);
    }

    @e
    public final String component1() {
        return this.high_price;
    }

    @e
    public final TradeSteamInventoryObj component10() {
        return this.asset;
    }

    @e
    public final List<TradePurchaseItemObj> component11() {
        return this.list;
    }

    @e
    public final String component2() {
        return this.supply;
    }

    @e
    public final String component3() {
        return this.create_time;
    }

    @e
    public final String component4() {
        return this.total;
    }

    @e
    public final String component5() {
        return this.count;
    }

    @e
    public final String component6() {
        return this.pcs_id;
    }

    @e
    public final String component7() {
        return this.state;
    }

    @e
    public final String component8() {
        return this.time_left;
    }

    @e
    public final String component9() {
        return this.price;
    }

    @d
    public final TradePurchaseInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e TradeSteamInventoryObj tradeSteamInventoryObj, @e List<TradePurchaseItemObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, tradeSteamInventoryObj, list}, this, changeQuickRedirect, false, 16132, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, TradeSteamInventoryObj.class, List.class}, TradePurchaseInfoObj.class);
        return patchProxyResultProxy.isSupported ? (TradePurchaseInfoObj) patchProxyResultProxy.result : new TradePurchaseInfoObj(str, str2, str3, str4, str5, str6, str7, str8, str9, tradeSteamInventoryObj, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16136, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradePurchaseInfoObj)) {
            return false;
        }
        TradePurchaseInfoObj tradePurchaseInfoObj = (TradePurchaseInfoObj) obj;
        return f0.g(this.high_price, tradePurchaseInfoObj.high_price) && f0.g(this.supply, tradePurchaseInfoObj.supply) && f0.g(this.create_time, tradePurchaseInfoObj.create_time) && f0.g(this.total, tradePurchaseInfoObj.total) && f0.g(this.count, tradePurchaseInfoObj.count) && f0.g(this.pcs_id, tradePurchaseInfoObj.pcs_id) && f0.g(this.state, tradePurchaseInfoObj.state) && f0.g(this.time_left, tradePurchaseInfoObj.time_left) && f0.g(this.price, tradePurchaseInfoObj.price) && f0.g(this.asset, tradePurchaseInfoObj.asset) && f0.g(this.list, tradePurchaseInfoObj.list);
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
    public final String getCreate_time() {
        return this.create_time;
    }

    @e
    public final String getHigh_price() {
        return this.high_price;
    }

    @e
    public final List<TradePurchaseItemObj> getList() {
        return this.list;
    }

    @e
    public final String getPcs_id() {
        return this.pcs_id;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getSupply() {
        return this.supply;
    }

    @e
    public final String getTime_left() {
        return this.time_left;
    }

    @e
    public final String getTotal() {
        return this.total;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16135, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.high_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.supply;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.create_time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.total;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.count;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pcs_id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.time_left;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.price;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        TradeSteamInventoryObj tradeSteamInventoryObj = this.asset;
        int iHashCode10 = (iHashCode9 + (tradeSteamInventoryObj == null ? 0 : tradeSteamInventoryObj.hashCode())) * 31;
        List<TradePurchaseItemObj> list = this.list;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final void setAsset(@e TradeSteamInventoryObj tradeSteamInventoryObj) {
        this.asset = tradeSteamInventoryObj;
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setCreate_time(@e String str) {
        this.create_time = str;
    }

    public final void setHigh_price(@e String str) {
        this.high_price = str;
    }

    public final void setList(@e List<TradePurchaseItemObj> list) {
        this.list = list;
    }

    public final void setPcs_id(@e String str) {
        this.pcs_id = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setSupply(@e String str) {
        this.supply = str;
    }

    public final void setTime_left(@e String str) {
        this.time_left = str;
    }

    public final void setTotal(@e String str) {
        this.total = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16134, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradePurchaseInfoObj(high_price=" + this.high_price + ", supply=" + this.supply + ", create_time=" + this.create_time + ", total=" + this.total + ", count=" + this.count + ", pcs_id=" + this.pcs_id + ", state=" + this.state + ", time_left=" + this.time_left + ", price=" + this.price + ", asset=" + this.asset + ", list=" + this.list + ')';
    }
}
