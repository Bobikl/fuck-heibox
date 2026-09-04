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
public final class WalletProfitObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Double balance;

    @e
    private String desc;

    public WalletProfitObj(@e Double d10, @e String str) {
        this.balance = d10;
        this.desc = str;
    }

    public static /* synthetic */ WalletProfitObj copy$default(WalletProfitObj walletProfitObj, Double d10, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletProfitObj, d10, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.M3, new Class[]{WalletProfitObj.class, Double.class, String.class, Integer.TYPE, Object.class}, WalletProfitObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WalletProfitObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            d10 = walletProfitObj.balance;
        }
        if ((i10 & 2) != 0) {
            str = walletProfitObj.desc;
        }
        return walletProfitObj.copy(d10, str);
    }

    @e
    public final Double component1() {
        return this.balance;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final WalletProfitObj copy(@e Double d10, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d10, str}, this, changeQuickRedirect, false, c.l.L3, new Class[]{Double.class, String.class}, WalletProfitObj.class);
        return patchProxyResultProxy.isSupported ? (WalletProfitObj) patchProxyResultProxy.result : new WalletProfitObj(d10, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.P3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletProfitObj)) {
            return false;
        }
        WalletProfitObj walletProfitObj = (WalletProfitObj) obj;
        return f0.g(this.balance, walletProfitObj.balance) && f0.g(this.desc, walletProfitObj.desc);
    }

    @e
    public final Double getBalance() {
        return this.balance;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.O3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Double d10 = this.balance;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        String str = this.desc;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setBalance(@e Double d10) {
        this.balance = d10;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.N3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WalletProfitObj(balance=" + this.balance + ", desc=" + this.desc + ')';
    }
}
