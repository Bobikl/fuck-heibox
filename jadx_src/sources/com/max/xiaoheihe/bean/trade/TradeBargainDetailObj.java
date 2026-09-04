package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBargainDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeBargainDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BargainInfo bargain_info;

    @e
    private String fee_rate;

    @e
    private String is_seller;

    @e
    private String lowest_estimate_price;

    @d
    private TradeSteamInventoryObj sku_info;

    @e
    private BargainTips tips;

    @e
    private Double total_hbalance;

    @e
    private Double total_profit;

    public TradeBargainDetailObj(@e String str, @e String str2, @e String str3, @e BargainTips bargainTips, @e Double d10, @e Double d11, @e BargainInfo bargainInfo, @d TradeSteamInventoryObj sku_info) {
        f0.p(sku_info, "sku_info");
        this.lowest_estimate_price = str;
        this.is_seller = str2;
        this.fee_rate = str3;
        this.tips = bargainTips;
        this.total_hbalance = d10;
        this.total_profit = d11;
        this.bargain_info = bargainInfo;
        this.sku_info = sku_info;
    }

    public static /* synthetic */ TradeBargainDetailObj copy$default(TradeBargainDetailObj tradeBargainDetailObj, String str, String str2, String str3, BargainTips bargainTips, Double d10, Double d11, BargainInfo bargainInfo, TradeSteamInventoryObj tradeSteamInventoryObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeBargainDetailObj, str, str2, str3, bargainTips, d10, d11, bargainInfo, tradeSteamInventoryObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 16040, new Class[]{TradeBargainDetailObj.class, String.class, String.class, String.class, BargainTips.class, Double.class, Double.class, BargainInfo.class, TradeSteamInventoryObj.class, Integer.TYPE, Object.class}, TradeBargainDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBargainDetailObj) patchProxyResultProxy.result;
        }
        return tradeBargainDetailObj.copy((i10 & 1) != 0 ? tradeBargainDetailObj.lowest_estimate_price : str, (i10 & 2) != 0 ? tradeBargainDetailObj.is_seller : str2, (i10 & 4) != 0 ? tradeBargainDetailObj.fee_rate : str3, (i10 & 8) != 0 ? tradeBargainDetailObj.tips : bargainTips, (i10 & 16) != 0 ? tradeBargainDetailObj.total_hbalance : d10, (i10 & 32) != 0 ? tradeBargainDetailObj.total_profit : d11, (i10 & 64) != 0 ? tradeBargainDetailObj.bargain_info : bargainInfo, (i10 & 128) != 0 ? tradeBargainDetailObj.sku_info : tradeSteamInventoryObj);
    }

    @e
    public final String component1() {
        return this.lowest_estimate_price;
    }

    @e
    public final String component2() {
        return this.is_seller;
    }

    @e
    public final String component3() {
        return this.fee_rate;
    }

    @e
    public final BargainTips component4() {
        return this.tips;
    }

    @e
    public final Double component5() {
        return this.total_hbalance;
    }

    @e
    public final Double component6() {
        return this.total_profit;
    }

    @e
    public final BargainInfo component7() {
        return this.bargain_info;
    }

    @d
    public final TradeSteamInventoryObj component8() {
        return this.sku_info;
    }

    @d
    public final TradeBargainDetailObj copy(@e String str, @e String str2, @e String str3, @e BargainTips bargainTips, @e Double d10, @e Double d11, @e BargainInfo bargainInfo, @d TradeSteamInventoryObj sku_info) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, bargainTips, d10, d11, bargainInfo, sku_info}, this, changeQuickRedirect, false, 16039, new Class[]{String.class, String.class, String.class, BargainTips.class, Double.class, Double.class, BargainInfo.class, TradeSteamInventoryObj.class}, TradeBargainDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBargainDetailObj) patchProxyResultProxy.result;
        }
        f0.p(sku_info, "sku_info");
        return new TradeBargainDetailObj(str, str2, str3, bargainTips, d10, d11, bargainInfo, sku_info);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16043, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeBargainDetailObj)) {
            return false;
        }
        TradeBargainDetailObj tradeBargainDetailObj = (TradeBargainDetailObj) obj;
        return f0.g(this.lowest_estimate_price, tradeBargainDetailObj.lowest_estimate_price) && f0.g(this.is_seller, tradeBargainDetailObj.is_seller) && f0.g(this.fee_rate, tradeBargainDetailObj.fee_rate) && f0.g(this.tips, tradeBargainDetailObj.tips) && f0.g(this.total_hbalance, tradeBargainDetailObj.total_hbalance) && f0.g(this.total_profit, tradeBargainDetailObj.total_profit) && f0.g(this.bargain_info, tradeBargainDetailObj.bargain_info) && f0.g(this.sku_info, tradeBargainDetailObj.sku_info);
    }

    @e
    public final BargainInfo getBargain_info() {
        return this.bargain_info;
    }

    @e
    public final String getFee_rate() {
        return this.fee_rate;
    }

    @e
    public final String getLowest_estimate_price() {
        return this.lowest_estimate_price;
    }

    @d
    public final TradeSteamInventoryObj getSku_info() {
        return this.sku_info;
    }

    @e
    public final BargainTips getTips() {
        return this.tips;
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16042, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.lowest_estimate_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.is_seller;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fee_rate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BargainTips bargainTips = this.tips;
        int iHashCode4 = (iHashCode3 + (bargainTips == null ? 0 : bargainTips.hashCode())) * 31;
        Double d10 = this.total_hbalance;
        int iHashCode5 = (iHashCode4 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.total_profit;
        int iHashCode6 = (iHashCode5 + (d11 == null ? 0 : d11.hashCode())) * 31;
        BargainInfo bargainInfo = this.bargain_info;
        return ((iHashCode6 + (bargainInfo != null ? bargainInfo.hashCode() : 0)) * 31) + this.sku_info.hashCode();
    }

    @e
    public final String is_seller() {
        return this.is_seller;
    }

    public final void setBargain_info(@e BargainInfo bargainInfo) {
        this.bargain_info = bargainInfo;
    }

    public final void setFee_rate(@e String str) {
        this.fee_rate = str;
    }

    public final void setLowest_estimate_price(@e String str) {
        this.lowest_estimate_price = str;
    }

    public final void setSku_info(@d TradeSteamInventoryObj tradeSteamInventoryObj) {
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryObj}, this, changeQuickRedirect, false, 16038, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tradeSteamInventoryObj, "<set-?>");
        this.sku_info = tradeSteamInventoryObj;
    }

    public final void setTips(@e BargainTips bargainTips) {
        this.tips = bargainTips;
    }

    public final void setTotal_hbalance(@e Double d10) {
        this.total_hbalance = d10;
    }

    public final void setTotal_profit(@e Double d10) {
        this.total_profit = d10;
    }

    public final void set_seller(@e String str) {
        this.is_seller = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16041, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeBargainDetailObj(lowest_estimate_price=" + this.lowest_estimate_price + ", is_seller=" + this.is_seller + ", fee_rate=" + this.fee_rate + ", tips=" + this.tips + ", total_hbalance=" + this.total_hbalance + ", total_profit=" + this.total_profit + ", bargain_info=" + this.bargain_info + ", sku_info=" + this.sku_info + ')';
    }
}
