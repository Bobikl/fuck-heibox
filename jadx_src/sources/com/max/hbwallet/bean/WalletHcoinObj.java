package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WalletHcoinObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletHcoinObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Long coin;

    @e
    private String desc;

    @e
    private Long full_deduct_coin;

    public WalletHcoinObj(@e Long l10, @e Long l11, @e String str) {
        this.coin = l10;
        this.full_deduct_coin = l11;
        this.desc = str;
    }

    public static /* synthetic */ WalletHcoinObj copy$default(WalletHcoinObj walletHcoinObj, Long l10, Long l11, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletHcoinObj, l10, l11, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.C3, new Class[]{WalletHcoinObj.class, Long.class, Long.class, String.class, Integer.TYPE, Object.class}, WalletHcoinObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WalletHcoinObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            l10 = walletHcoinObj.coin;
        }
        if ((i10 & 2) != 0) {
            l11 = walletHcoinObj.full_deduct_coin;
        }
        if ((i10 & 4) != 0) {
            str = walletHcoinObj.desc;
        }
        return walletHcoinObj.copy(l10, l11, str);
    }

    @e
    public final Long component1() {
        return this.coin;
    }

    @e
    public final Long component2() {
        return this.full_deduct_coin;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @d
    public final WalletHcoinObj copy(@e Long l10, @e Long l11, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, l11, str}, this, changeQuickRedirect, false, c.l.B3, new Class[]{Long.class, Long.class, String.class}, WalletHcoinObj.class);
        return patchProxyResultProxy.isSupported ? (WalletHcoinObj) patchProxyResultProxy.result : new WalletHcoinObj(l10, l11, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.F3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletHcoinObj)) {
            return false;
        }
        WalletHcoinObj walletHcoinObj = (WalletHcoinObj) obj;
        return f0.g(this.coin, walletHcoinObj.coin) && f0.g(this.full_deduct_coin, walletHcoinObj.full_deduct_coin) && f0.g(this.desc, walletHcoinObj.desc);
    }

    @e
    public final Long getCoin() {
        return this.coin;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Long getFull_deduct_coin() {
        return this.full_deduct_coin;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.E3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Long l10 = this.coin;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.full_deduct_coin;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.desc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setCoin(@e Long l10) {
        this.coin = l10;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFull_deduct_coin(@e Long l10) {
        this.full_deduct_coin = l10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.D3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WalletHcoinObj(coin=" + this.coin + ", full_deduct_coin=" + this.full_deduct_coin + ", desc=" + this.desc + ')';
    }
}
