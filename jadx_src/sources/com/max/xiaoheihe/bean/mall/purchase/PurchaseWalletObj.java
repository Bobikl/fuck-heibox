package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseWalletObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseWalletObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String hbalance;

    @e
    private String hcoin;

    public PurchaseWalletObj(@e String str, @e String str2) {
        this.hcoin = str;
        this.hbalance = str2;
    }

    public static /* synthetic */ PurchaseWalletObj copy$default(PurchaseWalletObj purchaseWalletObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseWalletObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15725, new Class[]{PurchaseWalletObj.class, String.class, String.class, Integer.TYPE, Object.class}, PurchaseWalletObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseWalletObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = purchaseWalletObj.hcoin;
        }
        if ((i10 & 2) != 0) {
            str2 = purchaseWalletObj.hbalance;
        }
        return purchaseWalletObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.hcoin;
    }

    @e
    public final String component2() {
        return this.hbalance;
    }

    @d
    public final PurchaseWalletObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15724, new Class[]{String.class, String.class}, PurchaseWalletObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseWalletObj) patchProxyResultProxy.result : new PurchaseWalletObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15728, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseWalletObj)) {
            return false;
        }
        PurchaseWalletObj purchaseWalletObj = (PurchaseWalletObj) obj;
        return f0.g(this.hcoin, purchaseWalletObj.hcoin) && f0.g(this.hbalance, purchaseWalletObj.hbalance);
    }

    @e
    public final String getHbalance() {
        return this.hbalance;
    }

    @e
    public final String getHcoin() {
        return this.hcoin;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15727, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.hcoin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hbalance;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setHbalance(@e String str) {
        this.hbalance = str;
    }

    public final void setHcoin(@e String str) {
        this.hcoin = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15726, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseWalletObj(hcoin=" + this.hcoin + ", hbalance=" + this.hbalance + ')';
    }
}
