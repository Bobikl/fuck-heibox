package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WalletUserObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletUserObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avartar;

    @e
    private String userid;

    @e
    private String username;

    public WalletUserObj(@e String str, @e String str2, @e String str3) {
        this.avartar = str;
        this.username = str2;
        this.userid = str3;
    }

    public static /* synthetic */ WalletUserObj copy$default(WalletUserObj walletUserObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletUserObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.R3, new Class[]{WalletUserObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, WalletUserObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WalletUserObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = walletUserObj.avartar;
        }
        if ((i10 & 2) != 0) {
            str2 = walletUserObj.username;
        }
        if ((i10 & 4) != 0) {
            str3 = walletUserObj.userid;
        }
        return walletUserObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.avartar;
    }

    @e
    public final String component2() {
        return this.username;
    }

    @e
    public final String component3() {
        return this.userid;
    }

    @d
    public final WalletUserObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.l.Q3, new Class[]{String.class, String.class, String.class}, WalletUserObj.class);
        return patchProxyResultProxy.isSupported ? (WalletUserObj) patchProxyResultProxy.result : new WalletUserObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.U3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletUserObj)) {
            return false;
        }
        WalletUserObj walletUserObj = (WalletUserObj) obj;
        return f0.g(this.avartar, walletUserObj.avartar) && f0.g(this.username, walletUserObj.username) && f0.g(this.userid, walletUserObj.userid);
    }

    @e
    public final String getAvartar() {
        return this.avartar;
    }

    @e
    public final String getUserid() {
        return this.userid;
    }

    @e
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.T3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.avartar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userid;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAvartar(@e String str) {
        this.avartar = str;
    }

    public final void setUserid(@e String str) {
        this.userid = str;
    }

    public final void setUsername(@e String str) {
        this.username = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.S3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WalletUserObj(avartar=" + this.avartar + ", username=" + this.username + ", userid=" + this.userid + ')';
    }
}
