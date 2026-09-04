package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WithdrawHomeResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WithdrawHomeResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String alipay_logon_id;

    @e
    private String desc;

    @e
    private Double profit;

    public WithdrawHomeResult(@e Double d10, @e String str, @e String str2) {
        this.profit = d10;
        this.alipay_logon_id = str;
        this.desc = str2;
    }

    public static /* synthetic */ WithdrawHomeResult copy$default(WithdrawHomeResult withdrawHomeResult, Double d10, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{withdrawHomeResult, d10, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.W3, new Class[]{WithdrawHomeResult.class, Double.class, String.class, String.class, Integer.TYPE, Object.class}, WithdrawHomeResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (WithdrawHomeResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            d10 = withdrawHomeResult.profit;
        }
        if ((i10 & 2) != 0) {
            str = withdrawHomeResult.alipay_logon_id;
        }
        if ((i10 & 4) != 0) {
            str2 = withdrawHomeResult.desc;
        }
        return withdrawHomeResult.copy(d10, str, str2);
    }

    @e
    public final Double component1() {
        return this.profit;
    }

    @e
    public final String component2() {
        return this.alipay_logon_id;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @d
    public final WithdrawHomeResult copy(@e Double d10, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d10, str, str2}, this, changeQuickRedirect, false, c.l.V3, new Class[]{Double.class, String.class, String.class}, WithdrawHomeResult.class);
        return patchProxyResultProxy.isSupported ? (WithdrawHomeResult) patchProxyResultProxy.result : new WithdrawHomeResult(d10, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.Z3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawHomeResult)) {
            return false;
        }
        WithdrawHomeResult withdrawHomeResult = (WithdrawHomeResult) obj;
        return f0.g(this.profit, withdrawHomeResult.profit) && f0.g(this.alipay_logon_id, withdrawHomeResult.alipay_logon_id) && f0.g(this.desc, withdrawHomeResult.desc);
    }

    @e
    public final String getAlipay_logon_id() {
        return this.alipay_logon_id;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Double getProfit() {
        return this.profit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Y3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Double d10 = this.profit;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        String str = this.alipay_logon_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAlipay_logon_id(@e String str) {
        this.alipay_logon_id = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setProfit(@e Double d10) {
        this.profit = d10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.X3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WithdrawHomeResult(profit=" + this.profit + ", alipay_logon_id=" + this.alipay_logon_id + ", desc=" + this.desc + ')';
    }
}
