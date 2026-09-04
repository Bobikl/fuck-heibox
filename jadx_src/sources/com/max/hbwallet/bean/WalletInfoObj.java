package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WalletInfoObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String coupon_desc;

    @e
    private Boolean enable_hbalance_to_hcoin;

    @e
    private WalletBalanceObj hbalance;

    @e
    private WalletHcoinObj hcoin;

    @e
    private WalletProfitObj profit;

    @e
    private Boolean show_full_deduct_limit;

    public WalletInfoObj(@e WalletBalanceObj walletBalanceObj, @e WalletHcoinObj walletHcoinObj, @e String str, @e Boolean bool, @e Boolean bool2, @e WalletProfitObj walletProfitObj) {
        this.hbalance = walletBalanceObj;
        this.hcoin = walletHcoinObj;
        this.coupon_desc = str;
        this.enable_hbalance_to_hcoin = bool;
        this.show_full_deduct_limit = bool2;
        this.profit = walletProfitObj;
    }

    public static /* synthetic */ WalletInfoObj copy$default(WalletInfoObj walletInfoObj, WalletBalanceObj walletBalanceObj, WalletHcoinObj walletHcoinObj, String str, Boolean bool, Boolean bool2, WalletProfitObj walletProfitObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletInfoObj, walletBalanceObj, walletHcoinObj, str, bool, bool2, walletProfitObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.H3, new Class[]{WalletInfoObj.class, WalletBalanceObj.class, WalletHcoinObj.class, String.class, Boolean.class, Boolean.class, WalletProfitObj.class, Integer.TYPE, Object.class}, WalletInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WalletInfoObj) patchProxyResultProxy.result;
        }
        return walletInfoObj.copy((i10 & 1) != 0 ? walletInfoObj.hbalance : walletBalanceObj, (i10 & 2) != 0 ? walletInfoObj.hcoin : walletHcoinObj, (i10 & 4) != 0 ? walletInfoObj.coupon_desc : str, (i10 & 8) != 0 ? walletInfoObj.enable_hbalance_to_hcoin : bool, (i10 & 16) != 0 ? walletInfoObj.show_full_deduct_limit : bool2, (i10 & 32) != 0 ? walletInfoObj.profit : walletProfitObj);
    }

    @e
    public final WalletBalanceObj component1() {
        return this.hbalance;
    }

    @e
    public final WalletHcoinObj component2() {
        return this.hcoin;
    }

    @e
    public final String component3() {
        return this.coupon_desc;
    }

    @e
    public final Boolean component4() {
        return this.enable_hbalance_to_hcoin;
    }

    @e
    public final Boolean component5() {
        return this.show_full_deduct_limit;
    }

    @e
    public final WalletProfitObj component6() {
        return this.profit;
    }

    @d
    public final WalletInfoObj copy(@e WalletBalanceObj walletBalanceObj, @e WalletHcoinObj walletHcoinObj, @e String str, @e Boolean bool, @e Boolean bool2, @e WalletProfitObj walletProfitObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletBalanceObj, walletHcoinObj, str, bool, bool2, walletProfitObj}, this, changeQuickRedirect, false, c.l.G3, new Class[]{WalletBalanceObj.class, WalletHcoinObj.class, String.class, Boolean.class, Boolean.class, WalletProfitObj.class}, WalletInfoObj.class);
        return patchProxyResultProxy.isSupported ? (WalletInfoObj) patchProxyResultProxy.result : new WalletInfoObj(walletBalanceObj, walletHcoinObj, str, bool, bool2, walletProfitObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.K3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletInfoObj)) {
            return false;
        }
        WalletInfoObj walletInfoObj = (WalletInfoObj) obj;
        return f0.g(this.hbalance, walletInfoObj.hbalance) && f0.g(this.hcoin, walletInfoObj.hcoin) && f0.g(this.coupon_desc, walletInfoObj.coupon_desc) && f0.g(this.enable_hbalance_to_hcoin, walletInfoObj.enable_hbalance_to_hcoin) && f0.g(this.show_full_deduct_limit, walletInfoObj.show_full_deduct_limit) && f0.g(this.profit, walletInfoObj.profit);
    }

    @e
    public final String getCoupon_desc() {
        return this.coupon_desc;
    }

    @e
    public final Boolean getEnable_hbalance_to_hcoin() {
        return this.enable_hbalance_to_hcoin;
    }

    @e
    public final WalletBalanceObj getHbalance() {
        return this.hbalance;
    }

    @e
    public final WalletHcoinObj getHcoin() {
        return this.hcoin;
    }

    @e
    public final WalletProfitObj getProfit() {
        return this.profit;
    }

    @e
    public final Boolean getShow_full_deduct_limit() {
        return this.show_full_deduct_limit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.J3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WalletBalanceObj walletBalanceObj = this.hbalance;
        int iHashCode = (walletBalanceObj == null ? 0 : walletBalanceObj.hashCode()) * 31;
        WalletHcoinObj walletHcoinObj = this.hcoin;
        int iHashCode2 = (iHashCode + (walletHcoinObj == null ? 0 : walletHcoinObj.hashCode())) * 31;
        String str = this.coupon_desc;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.enable_hbalance_to_hcoin;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.show_full_deduct_limit;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        WalletProfitObj walletProfitObj = this.profit;
        return iHashCode5 + (walletProfitObj != null ? walletProfitObj.hashCode() : 0);
    }

    public final void setCoupon_desc(@e String str) {
        this.coupon_desc = str;
    }

    public final void setEnable_hbalance_to_hcoin(@e Boolean bool) {
        this.enable_hbalance_to_hcoin = bool;
    }

    public final void setHbalance(@e WalletBalanceObj walletBalanceObj) {
        this.hbalance = walletBalanceObj;
    }

    public final void setHcoin(@e WalletHcoinObj walletHcoinObj) {
        this.hcoin = walletHcoinObj;
    }

    public final void setProfit(@e WalletProfitObj walletProfitObj) {
        this.profit = walletProfitObj;
    }

    public final void setShow_full_deduct_limit(@e Boolean bool) {
        this.show_full_deduct_limit = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.I3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WalletInfoObj(hbalance=" + this.hbalance + ", hcoin=" + this.hcoin + ", coupon_desc=" + this.coupon_desc + ", enable_hbalance_to_hcoin=" + this.enable_hbalance_to_hcoin + ", show_full_deduct_limit=" + this.show_full_deduct_limit + ", profit=" + this.profit + ')';
    }
}
