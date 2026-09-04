package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBargainOrderInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeBargainOrderInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bargain_price;

    @e
    private String count;

    @e
    private String create_time;

    @e
    private String current_price;

    @e
    private String error_desc;

    @e
    private String order_id;

    @e
    private String order_state;

    @e
    private String pay_price;

    @e
    private String profit;

    @e
    private TradeSteamInventoryObj sku_info;

    @e
    private String state_desc;

    @e
    private String time_left;

    public TradeBargainOrderInfoObj(@e String str, @e String str2, @e TradeSteamInventoryObj tradeSteamInventoryObj, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11) {
        this.error_desc = str;
        this.count = str2;
        this.sku_info = tradeSteamInventoryObj;
        this.order_id = str3;
        this.state_desc = str4;
        this.profit = str5;
        this.create_time = str6;
        this.order_state = str7;
        this.current_price = str8;
        this.bargain_price = str9;
        this.pay_price = str10;
        this.time_left = str11;
    }

    public static /* synthetic */ TradeBargainOrderInfoObj copy$default(TradeBargainOrderInfoObj tradeBargainOrderInfoObj, String str, String str2, TradeSteamInventoryObj tradeSteamInventoryObj, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeBargainOrderInfoObj, str, str2, tradeSteamInventoryObj, str3, str4, str5, str6, str7, str8, str9, str10, str11, new Integer(i10), obj}, null, changeQuickRedirect, true, 16051, new Class[]{TradeBargainOrderInfoObj.class, String.class, String.class, TradeSteamInventoryObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeBargainOrderInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBargainOrderInfoObj) patchProxyResultProxy.result;
        }
        return tradeBargainOrderInfoObj.copy((i10 & 1) != 0 ? tradeBargainOrderInfoObj.error_desc : str, (i10 & 2) != 0 ? tradeBargainOrderInfoObj.count : str2, (i10 & 4) != 0 ? tradeBargainOrderInfoObj.sku_info : tradeSteamInventoryObj, (i10 & 8) != 0 ? tradeBargainOrderInfoObj.order_id : str3, (i10 & 16) != 0 ? tradeBargainOrderInfoObj.state_desc : str4, (i10 & 32) != 0 ? tradeBargainOrderInfoObj.profit : str5, (i10 & 64) != 0 ? tradeBargainOrderInfoObj.create_time : str6, (i10 & 128) != 0 ? tradeBargainOrderInfoObj.order_state : str7, (i10 & 256) != 0 ? tradeBargainOrderInfoObj.current_price : str8, (i10 & 512) != 0 ? tradeBargainOrderInfoObj.bargain_price : str9, (i10 & 1024) != 0 ? tradeBargainOrderInfoObj.pay_price : str10, (i10 & 2048) != 0 ? tradeBargainOrderInfoObj.time_left : str11);
    }

    @e
    public final String component1() {
        return this.error_desc;
    }

    @e
    public final String component10() {
        return this.bargain_price;
    }

    @e
    public final String component11() {
        return this.pay_price;
    }

    @e
    public final String component12() {
        return this.time_left;
    }

    @e
    public final String component2() {
        return this.count;
    }

    @e
    public final TradeSteamInventoryObj component3() {
        return this.sku_info;
    }

    @e
    public final String component4() {
        return this.order_id;
    }

    @e
    public final String component5() {
        return this.state_desc;
    }

    @e
    public final String component6() {
        return this.profit;
    }

    @e
    public final String component7() {
        return this.create_time;
    }

    @e
    public final String component8() {
        return this.order_state;
    }

    @e
    public final String component9() {
        return this.current_price;
    }

    @d
    public final TradeBargainOrderInfoObj copy(@e String str, @e String str2, @e TradeSteamInventoryObj tradeSteamInventoryObj, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, tradeSteamInventoryObj, str3, str4, str5, str6, str7, str8, str9, str10, str11}, this, changeQuickRedirect, false, 16050, new Class[]{String.class, String.class, TradeSteamInventoryObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, TradeBargainOrderInfoObj.class);
        return patchProxyResultProxy.isSupported ? (TradeBargainOrderInfoObj) patchProxyResultProxy.result : new TradeBargainOrderInfoObj(str, str2, tradeSteamInventoryObj, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16054, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeBargainOrderInfoObj)) {
            return false;
        }
        TradeBargainOrderInfoObj tradeBargainOrderInfoObj = (TradeBargainOrderInfoObj) obj;
        return f0.g(this.error_desc, tradeBargainOrderInfoObj.error_desc) && f0.g(this.count, tradeBargainOrderInfoObj.count) && f0.g(this.sku_info, tradeBargainOrderInfoObj.sku_info) && f0.g(this.order_id, tradeBargainOrderInfoObj.order_id) && f0.g(this.state_desc, tradeBargainOrderInfoObj.state_desc) && f0.g(this.profit, tradeBargainOrderInfoObj.profit) && f0.g(this.create_time, tradeBargainOrderInfoObj.create_time) && f0.g(this.order_state, tradeBargainOrderInfoObj.order_state) && f0.g(this.current_price, tradeBargainOrderInfoObj.current_price) && f0.g(this.bargain_price, tradeBargainOrderInfoObj.bargain_price) && f0.g(this.pay_price, tradeBargainOrderInfoObj.pay_price) && f0.g(this.time_left, tradeBargainOrderInfoObj.time_left);
    }

    @e
    public final String getBargain_price() {
        return this.bargain_price;
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
    public final String getCurrent_price() {
        return this.current_price;
    }

    @e
    public final String getError_desc() {
        return this.error_desc;
    }

    @e
    public final String getOrder_id() {
        return this.order_id;
    }

    @e
    public final String getOrder_state() {
        return this.order_state;
    }

    @e
    public final String getPay_price() {
        return this.pay_price;
    }

    @e
    public final String getProfit() {
        return this.profit;
    }

    @e
    public final TradeSteamInventoryObj getSku_info() {
        return this.sku_info;
    }

    @e
    public final String getState_desc() {
        return this.state_desc;
    }

    @e
    public final String getTime_left() {
        return this.time_left;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16053, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.error_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.count;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TradeSteamInventoryObj tradeSteamInventoryObj = this.sku_info;
        int iHashCode3 = (iHashCode2 + (tradeSteamInventoryObj == null ? 0 : tradeSteamInventoryObj.hashCode())) * 31;
        String str3 = this.order_id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state_desc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profit;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.create_time;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.order_state;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.current_price;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bargain_price;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pay_price;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.time_left;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setBargain_price(@e String str) {
        this.bargain_price = str;
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setCreate_time(@e String str) {
        this.create_time = str;
    }

    public final void setCurrent_price(@e String str) {
        this.current_price = str;
    }

    public final void setError_desc(@e String str) {
        this.error_desc = str;
    }

    public final void setOrder_id(@e String str) {
        this.order_id = str;
    }

    public final void setOrder_state(@e String str) {
        this.order_state = str;
    }

    public final void setPay_price(@e String str) {
        this.pay_price = str;
    }

    public final void setProfit(@e String str) {
        this.profit = str;
    }

    public final void setSku_info(@e TradeSteamInventoryObj tradeSteamInventoryObj) {
        this.sku_info = tradeSteamInventoryObj;
    }

    public final void setState_desc(@e String str) {
        this.state_desc = str;
    }

    public final void setTime_left(@e String str) {
        this.time_left = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16052, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeBargainOrderInfoObj(error_desc=" + this.error_desc + ", count=" + this.count + ", sku_info=" + this.sku_info + ", order_id=" + this.order_id + ", state_desc=" + this.state_desc + ", profit=" + this.profit + ", create_time=" + this.create_time + ", order_state=" + this.order_state + ", current_price=" + this.current_price + ", bargain_price=" + this.bargain_price + ", pay_price=" + this.pay_price + ", time_left=" + this.time_left + ')';
    }
}
