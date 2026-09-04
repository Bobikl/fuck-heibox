package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProfitWithdrawResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfitWithdrawInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String amount;

    @e
    private String color;

    @e
    private String create_at;

    @e
    private String desc;

    @e
    private String way;

    public ProfitWithdrawInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.amount = str;
        this.create_at = str2;
        this.desc = str3;
        this.way = str4;
        this.color = str5;
    }

    public static /* synthetic */ ProfitWithdrawInfoObj copy$default(ProfitWithdrawInfoObj profitWithdrawInfoObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{profitWithdrawInfoObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.f34197i3, new Class[]{ProfitWithdrawInfoObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ProfitWithdrawInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProfitWithdrawInfoObj) patchProxyResultProxy.result;
        }
        return profitWithdrawInfoObj.copy((i10 & 1) != 0 ? profitWithdrawInfoObj.amount : str, (i10 & 2) != 0 ? profitWithdrawInfoObj.create_at : str2, (i10 & 4) != 0 ? profitWithdrawInfoObj.desc : str3, (i10 & 8) != 0 ? profitWithdrawInfoObj.way : str4, (i10 & 16) != 0 ? profitWithdrawInfoObj.color : str5);
    }

    @e
    public final String component1() {
        return this.amount;
    }

    @e
    public final String component2() {
        return this.create_at;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @e
    public final String component4() {
        return this.way;
    }

    @e
    public final String component5() {
        return this.color;
    }

    @d
    public final ProfitWithdrawInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, c.l.f34174h3, new Class[]{String.class, String.class, String.class, String.class, String.class}, ProfitWithdrawInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ProfitWithdrawInfoObj) patchProxyResultProxy.result : new ProfitWithdrawInfoObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.f34265l3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfitWithdrawInfoObj)) {
            return false;
        }
        ProfitWithdrawInfoObj profitWithdrawInfoObj = (ProfitWithdrawInfoObj) obj;
        return f0.g(this.amount, profitWithdrawInfoObj.amount) && f0.g(this.create_at, profitWithdrawInfoObj.create_at) && f0.g(this.desc, profitWithdrawInfoObj.desc) && f0.g(this.way, profitWithdrawInfoObj.way) && f0.g(this.color, profitWithdrawInfoObj.color);
    }

    @e
    public final String getAmount() {
        return this.amount;
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getCreate_at() {
        return this.create_at;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getWay() {
        return this.way;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34242k3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.create_at;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.way;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.color;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAmount(@e String str) {
        this.amount = str;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setCreate_at(@e String str) {
        this.create_at = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setWay(@e String str) {
        this.way = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34219j3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProfitWithdrawInfoObj(amount=" + this.amount + ", create_at=" + this.create_at + ", desc=" + this.desc + ", way=" + this.way + ", color=" + this.color + ')';
    }
}
