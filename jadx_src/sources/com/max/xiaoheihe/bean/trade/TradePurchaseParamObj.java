package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradePurchaseParamObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradePurchaseParamObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private TradeSteamInventoryObj asset;

    @e
    private String description;

    @e
    private String fee_rate;

    @e
    private String high_purchase_price;

    @e
    private String high_sale_price;

    @e
    private String low_sale_price;

    @e
    private String lowest_delta;

    @e
    private String lowest_limit;

    @e
    private Double total_hbalance;

    @e
    private Double total_profit;

    public TradePurchaseParamObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Double d10, @e Double d11, @d TradeSteamInventoryObj asset) {
        f0.p(asset, "asset");
        this.low_sale_price = str;
        this.high_sale_price = str2;
        this.high_purchase_price = str3;
        this.description = str4;
        this.lowest_limit = str5;
        this.lowest_delta = str6;
        this.fee_rate = str7;
        this.total_hbalance = d10;
        this.total_profit = d11;
        this.asset = asset;
    }

    public static /* synthetic */ TradePurchaseParamObj copy$default(TradePurchaseParamObj tradePurchaseParamObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d10, Double d11, TradeSteamInventoryObj tradeSteamInventoryObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseParamObj, str, str2, str3, str4, str5, str6, str7, d10, d11, tradeSteamInventoryObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 16149, new Class[]{TradePurchaseParamObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, Double.class, TradeSteamInventoryObj.class, Integer.TYPE, Object.class}, TradePurchaseParamObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePurchaseParamObj) patchProxyResultProxy.result;
        }
        return tradePurchaseParamObj.copy((i10 & 1) != 0 ? tradePurchaseParamObj.low_sale_price : str, (i10 & 2) != 0 ? tradePurchaseParamObj.high_sale_price : str2, (i10 & 4) != 0 ? tradePurchaseParamObj.high_purchase_price : str3, (i10 & 8) != 0 ? tradePurchaseParamObj.description : str4, (i10 & 16) != 0 ? tradePurchaseParamObj.lowest_limit : str5, (i10 & 32) != 0 ? tradePurchaseParamObj.lowest_delta : str6, (i10 & 64) != 0 ? tradePurchaseParamObj.fee_rate : str7, (i10 & 128) != 0 ? tradePurchaseParamObj.total_hbalance : d10, (i10 & 256) != 0 ? tradePurchaseParamObj.total_profit : d11, (i10 & 512) != 0 ? tradePurchaseParamObj.asset : tradeSteamInventoryObj);
    }

    @e
    public final String component1() {
        return this.low_sale_price;
    }

    @d
    public final TradeSteamInventoryObj component10() {
        return this.asset;
    }

    @e
    public final String component2() {
        return this.high_sale_price;
    }

    @e
    public final String component3() {
        return this.high_purchase_price;
    }

    @e
    public final String component4() {
        return this.description;
    }

    @e
    public final String component5() {
        return this.lowest_limit;
    }

    @e
    public final String component6() {
        return this.lowest_delta;
    }

    @e
    public final String component7() {
        return this.fee_rate;
    }

    @e
    public final Double component8() {
        return this.total_hbalance;
    }

    @e
    public final Double component9() {
        return this.total_profit;
    }

    @d
    public final TradePurchaseParamObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Double d10, @e Double d11, @d TradeSteamInventoryObj asset) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, d10, d11, asset}, this, changeQuickRedirect, false, 16148, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, Double.class, TradeSteamInventoryObj.class}, TradePurchaseParamObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePurchaseParamObj) patchProxyResultProxy.result;
        }
        f0.p(asset, "asset");
        return new TradePurchaseParamObj(str, str2, str3, str4, str5, str6, str7, d10, d11, asset);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16152, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradePurchaseParamObj)) {
            return false;
        }
        TradePurchaseParamObj tradePurchaseParamObj = (TradePurchaseParamObj) obj;
        return f0.g(this.low_sale_price, tradePurchaseParamObj.low_sale_price) && f0.g(this.high_sale_price, tradePurchaseParamObj.high_sale_price) && f0.g(this.high_purchase_price, tradePurchaseParamObj.high_purchase_price) && f0.g(this.description, tradePurchaseParamObj.description) && f0.g(this.lowest_limit, tradePurchaseParamObj.lowest_limit) && f0.g(this.lowest_delta, tradePurchaseParamObj.lowest_delta) && f0.g(this.fee_rate, tradePurchaseParamObj.fee_rate) && f0.g(this.total_hbalance, tradePurchaseParamObj.total_hbalance) && f0.g(this.total_profit, tradePurchaseParamObj.total_profit) && f0.g(this.asset, tradePurchaseParamObj.asset);
    }

    @d
    public final TradeSteamInventoryObj getAsset() {
        return this.asset;
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final String getFee_rate() {
        return this.fee_rate;
    }

    @e
    public final String getHigh_purchase_price() {
        return this.high_purchase_price;
    }

    @e
    public final String getHigh_sale_price() {
        return this.high_sale_price;
    }

    @e
    public final String getLow_sale_price() {
        return this.low_sale_price;
    }

    @e
    public final String getLowest_delta() {
        return this.lowest_delta;
    }

    @e
    public final String getLowest_limit() {
        return this.lowest_limit;
    }

    @e
    public final Double getTotal_hbalance() {
        return this.total_hbalance;
    }

    @e
    public final Double getTotal_profit() {
        return this.total_profit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16151, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.low_sale_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.high_sale_price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.high_purchase_price;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lowest_limit;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lowest_delta;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fee_rate;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d10 = this.total_hbalance;
        int iHashCode8 = (iHashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.total_profit;
        return ((iHashCode8 + (d11 != null ? d11.hashCode() : 0)) * 31) + this.asset.hashCode();
    }

    public final void setAsset(@d TradeSteamInventoryObj tradeSteamInventoryObj) {
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryObj}, this, changeQuickRedirect, false, 16147, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tradeSteamInventoryObj, "<set-?>");
        this.asset = tradeSteamInventoryObj;
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setFee_rate(@e String str) {
        this.fee_rate = str;
    }

    public final void setHigh_purchase_price(@e String str) {
        this.high_purchase_price = str;
    }

    public final void setHigh_sale_price(@e String str) {
        this.high_sale_price = str;
    }

    public final void setLow_sale_price(@e String str) {
        this.low_sale_price = str;
    }

    public final void setLowest_delta(@e String str) {
        this.lowest_delta = str;
    }

    public final void setLowest_limit(@e String str) {
        this.lowest_limit = str;
    }

    public final void setTotal_hbalance(@e Double d10) {
        this.total_hbalance = d10;
    }

    public final void setTotal_profit(@e Double d10) {
        this.total_profit = d10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16150, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradePurchaseParamObj(low_sale_price=" + this.low_sale_price + ", high_sale_price=" + this.high_sale_price + ", high_purchase_price=" + this.high_purchase_price + ", description=" + this.description + ", lowest_limit=" + this.lowest_limit + ", lowest_delta=" + this.lowest_delta + ", fee_rate=" + this.fee_rate + ", total_hbalance=" + this.total_hbalance + ", total_profit=" + this.total_profit + ", asset=" + this.asset + ')';
    }
}
