package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WalletBalanceObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletBalanceObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Double balance_expense;

    @e
    private Double balance_fee;

    @e
    private Double balance_income;

    @e
    private String desc;

    public WalletBalanceObj(@e Double d10, @e Double d11, @e Double d12, @e String str) {
        this.balance_income = d10;
        this.balance_expense = d11;
        this.balance_fee = d12;
        this.desc = str;
    }

    public static /* synthetic */ WalletBalanceObj copy$default(WalletBalanceObj walletBalanceObj, Double d10, Double d11, Double d12, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletBalanceObj, d10, d11, d12, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.f34534x3, new Class[]{WalletBalanceObj.class, Double.class, Double.class, Double.class, String.class, Integer.TYPE, Object.class}, WalletBalanceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WalletBalanceObj) patchProxyResultProxy.result;
        }
        return walletBalanceObj.copy((i10 & 1) != 0 ? walletBalanceObj.balance_income : d10, (i10 & 2) != 0 ? walletBalanceObj.balance_expense : d11, (i10 & 4) != 0 ? walletBalanceObj.balance_fee : d12, (i10 & 8) != 0 ? walletBalanceObj.desc : str);
    }

    @e
    public final Double component1() {
        return this.balance_income;
    }

    @e
    public final Double component2() {
        return this.balance_expense;
    }

    @e
    public final Double component3() {
        return this.balance_fee;
    }

    @e
    public final String component4() {
        return this.desc;
    }

    @d
    public final WalletBalanceObj copy(@e Double d10, @e Double d11, @e Double d12, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d10, d11, d12, str}, this, changeQuickRedirect, false, c.l.f34512w3, new Class[]{Double.class, Double.class, Double.class, String.class}, WalletBalanceObj.class);
        return patchProxyResultProxy.isSupported ? (WalletBalanceObj) patchProxyResultProxy.result : new WalletBalanceObj(d10, d11, d12, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.A3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBalanceObj)) {
            return false;
        }
        WalletBalanceObj walletBalanceObj = (WalletBalanceObj) obj;
        return f0.g(this.balance_income, walletBalanceObj.balance_income) && f0.g(this.balance_expense, walletBalanceObj.balance_expense) && f0.g(this.balance_fee, walletBalanceObj.balance_fee) && f0.g(this.desc, walletBalanceObj.desc);
    }

    @e
    public final Double getBalance_expense() {
        return this.balance_expense;
    }

    @e
    public final Double getBalance_fee() {
        return this.balance_fee;
    }

    @e
    public final Double getBalance_income() {
        return this.balance_income;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34578z3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Double d10 = this.balance_income;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.balance_expense;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.balance_fee;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.desc;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setBalance_expense(@e Double d10) {
        this.balance_expense = d10;
    }

    public final void setBalance_fee(@e Double d10) {
        this.balance_fee = d10;
    }

    public final void setBalance_income(@e Double d10) {
        this.balance_income = d10;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34556y3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WalletBalanceObj(balance_income=" + this.balance_income + ", balance_expense=" + this.balance_expense + ", balance_fee=" + this.balance_fee + ", desc=" + this.desc + ')';
    }
}
