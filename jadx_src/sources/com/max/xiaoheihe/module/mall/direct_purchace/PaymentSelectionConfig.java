package com.max.xiaoheihe.module.mall.direct_purchace;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.account.steaminfo.SteamGameAccount;
import com.max.xiaoheihe.bean.game.GamePayCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PaymentSelectionConfig.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class PaymentSelectionConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f90556i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final String f90557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private final String f90558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private final String f90559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private final String f90560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private final ArrayList<Integer> f90561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private final GamePayCardObj f90562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private final SteamGameAccount f90563h;

    public PaymentSelectionConfig(@e String str, @e String str2, @e String str3, @e String str4, @e ArrayList<Integer> arrayList, @e GamePayCardObj gamePayCardObj, @e SteamGameAccount steamGameAccount) {
        this.f90557b = str;
        this.f90558c = str2;
        this.f90559d = str3;
        this.f90560e = str4;
        this.f90561f = arrayList;
        this.f90562g = gamePayCardObj;
        this.f90563h = steamGameAccount;
    }

    public static /* synthetic */ PaymentSelectionConfig i(PaymentSelectionConfig paymentSelectionConfig, String str, String str2, String str3, String str4, ArrayList arrayList, GamePayCardObj gamePayCardObj, SteamGameAccount steamGameAccount, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{paymentSelectionConfig, str, str2, str3, str4, arrayList, gamePayCardObj, steamGameAccount, new Integer(i10), obj}, null, changeQuickRedirect, true, 41886, new Class[]{PaymentSelectionConfig.class, String.class, String.class, String.class, String.class, ArrayList.class, GamePayCardObj.class, SteamGameAccount.class, Integer.TYPE, Object.class}, PaymentSelectionConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (PaymentSelectionConfig) patchProxyResultProxy.result;
        }
        return paymentSelectionConfig.h((i10 & 1) != 0 ? paymentSelectionConfig.f90557b : str, (i10 & 2) != 0 ? paymentSelectionConfig.f90558c : str2, (i10 & 4) != 0 ? paymentSelectionConfig.f90559d : str3, (i10 & 8) != 0 ? paymentSelectionConfig.f90560e : str4, (i10 & 16) != 0 ? paymentSelectionConfig.f90561f : arrayList, (i10 & 32) != 0 ? paymentSelectionConfig.f90562g : gamePayCardObj, (i10 & 64) != 0 ? paymentSelectionConfig.f90563h : steamGameAccount);
    }

    @e
    public final String a() {
        return this.f90557b;
    }

    @e
    public final String b() {
        return this.f90558c;
    }

    @e
    public final String c() {
        return this.f90559d;
    }

    @e
    public final String d() {
        return this.f90560e;
    }

    @e
    public final ArrayList<Integer> e() {
        return this.f90561f;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41889, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentSelectionConfig)) {
            return false;
        }
        PaymentSelectionConfig paymentSelectionConfig = (PaymentSelectionConfig) obj;
        return f0.g(this.f90557b, paymentSelectionConfig.f90557b) && f0.g(this.f90558c, paymentSelectionConfig.f90558c) && f0.g(this.f90559d, paymentSelectionConfig.f90559d) && f0.g(this.f90560e, paymentSelectionConfig.f90560e) && f0.g(this.f90561f, paymentSelectionConfig.f90561f) && f0.g(this.f90562g, paymentSelectionConfig.f90562g) && f0.g(this.f90563h, paymentSelectionConfig.f90563h);
    }

    @e
    public final GamePayCardObj f() {
        return this.f90562g;
    }

    @e
    public final SteamGameAccount g() {
        return this.f90563h;
    }

    @d
    public final PaymentSelectionConfig h(@e String str, @e String str2, @e String str3, @e String str4, @e ArrayList<Integer> arrayList, @e GamePayCardObj gamePayCardObj, @e SteamGameAccount steamGameAccount) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, arrayList, gamePayCardObj, steamGameAccount}, this, changeQuickRedirect, false, 41885, new Class[]{String.class, String.class, String.class, String.class, ArrayList.class, GamePayCardObj.class, SteamGameAccount.class}, PaymentSelectionConfig.class);
        return patchProxyResultProxy.isSupported ? (PaymentSelectionConfig) patchProxyResultProxy.result : new PaymentSelectionConfig(str, str2, str3, str4, arrayList, gamePayCardObj, steamGameAccount);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41888, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f90557b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90558c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90559d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90560e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.f90561f;
        int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        GamePayCardObj gamePayCardObj = this.f90562g;
        int iHashCode6 = (iHashCode5 + (gamePayCardObj == null ? 0 : gamePayCardObj.hashCode())) * 31;
        SteamGameAccount steamGameAccount = this.f90563h;
        return iHashCode6 + (steamGameAccount != null ? steamGameAccount.hashCode() : 0);
    }

    @e
    public final String j() {
        return this.f90560e;
    }

    @e
    public final GamePayCardObj k() {
        return this.f90562g;
    }

    @e
    public final String l() {
        return this.f90557b;
    }

    @e
    public final String m() {
        return this.f90558c;
    }

    @e
    public final SteamGameAccount n() {
        return this.f90563h;
    }

    @e
    public final String o() {
        return this.f90559d;
    }

    @e
    public final ArrayList<Integer> p() {
        return this.f90561f;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41887, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PaymentSelectionConfig(hint_desc=" + this.f90557b + ", hint_title=" + this.f90558c + ", title=" + this.f90559d + ", balance=" + this.f90560e + ", typeList=" + this.f90561f + ", gameInfo=" + this.f90562g + ", steamGameAccount=" + this.f90563h + ')';
    }
}
