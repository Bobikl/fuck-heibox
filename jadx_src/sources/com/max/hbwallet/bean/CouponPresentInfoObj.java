package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CouponPresentInfoObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CouponPresentInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String time_desc;

    @e
    private WalletUserObj user_info;

    public CouponPresentInfoObj(@e String str, @e String str2, @e WalletUserObj walletUserObj) {
        this.desc = str;
        this.time_desc = str2;
        this.user_info = walletUserObj;
    }

    public static /* synthetic */ CouponPresentInfoObj copy$default(CouponPresentInfoObj couponPresentInfoObj, String str, String str2, WalletUserObj walletUserObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{couponPresentInfoObj, str, str2, walletUserObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.C2, new Class[]{CouponPresentInfoObj.class, String.class, String.class, WalletUserObj.class, Integer.TYPE, Object.class}, CouponPresentInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CouponPresentInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = couponPresentInfoObj.desc;
        }
        if ((i10 & 2) != 0) {
            str2 = couponPresentInfoObj.time_desc;
        }
        if ((i10 & 4) != 0) {
            walletUserObj = couponPresentInfoObj.user_info;
        }
        return couponPresentInfoObj.copy(str, str2, walletUserObj);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.time_desc;
    }

    @e
    public final WalletUserObj component3() {
        return this.user_info;
    }

    @d
    public final CouponPresentInfoObj copy(@e String str, @e String str2, @e WalletUserObj walletUserObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, walletUserObj}, this, changeQuickRedirect, false, c.l.B2, new Class[]{String.class, String.class, WalletUserObj.class}, CouponPresentInfoObj.class);
        return patchProxyResultProxy.isSupported ? (CouponPresentInfoObj) patchProxyResultProxy.result : new CouponPresentInfoObj(str, str2, walletUserObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.F2, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponPresentInfoObj)) {
            return false;
        }
        CouponPresentInfoObj couponPresentInfoObj = (CouponPresentInfoObj) obj;
        return f0.g(this.desc, couponPresentInfoObj.desc) && f0.g(this.time_desc, couponPresentInfoObj.time_desc) && f0.g(this.user_info, couponPresentInfoObj.user_info);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getTime_desc() {
        return this.time_desc;
    }

    @e
    public final WalletUserObj getUser_info() {
        return this.user_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10086, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WalletUserObj walletUserObj = this.user_info;
        return iHashCode2 + (walletUserObj != null ? walletUserObj.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setTime_desc(@e String str) {
        this.time_desc = str;
    }

    public final void setUser_info(@e WalletUserObj walletUserObj) {
        this.user_info = walletUserObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10085, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CouponPresentInfoObj(desc=" + this.desc + ", time_desc=" + this.time_desc + ", user_info=" + this.user_info + ')';
    }
}
