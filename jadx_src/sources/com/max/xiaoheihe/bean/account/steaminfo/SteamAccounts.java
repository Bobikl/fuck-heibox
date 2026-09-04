package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamAccounts.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamAccounts implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<SteamGameAccount> accounts;

    @e
    private SteamGameAccount master;

    public SteamAccounts(@e List<SteamGameAccount> list, @e SteamGameAccount steamGameAccount) {
        this.accounts = list;
        this.master = steamGameAccount;
    }

    public static /* synthetic */ SteamAccounts copy$default(SteamAccounts steamAccounts, List list, SteamGameAccount steamGameAccount, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamAccounts, list, steamGameAccount, new Integer(i10), obj}, null, changeQuickRedirect, true, 14046, new Class[]{SteamAccounts.class, List.class, SteamGameAccount.class, Integer.TYPE, Object.class}, SteamAccounts.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamAccounts) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = steamAccounts.accounts;
        }
        if ((i10 & 2) != 0) {
            steamGameAccount = steamAccounts.master;
        }
        return steamAccounts.copy(list, steamGameAccount);
    }

    @e
    public final List<SteamGameAccount> component1() {
        return this.accounts;
    }

    @e
    public final SteamGameAccount component2() {
        return this.master;
    }

    @d
    public final SteamAccounts copy(@e List<SteamGameAccount> list, @e SteamGameAccount steamGameAccount) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, steamGameAccount}, this, changeQuickRedirect, false, 14045, new Class[]{List.class, SteamGameAccount.class}, SteamAccounts.class);
        return patchProxyResultProxy.isSupported ? (SteamAccounts) patchProxyResultProxy.result : new SteamAccounts(list, steamGameAccount);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14049, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamAccounts)) {
            return false;
        }
        SteamAccounts steamAccounts = (SteamAccounts) obj;
        return f0.g(this.accounts, steamAccounts.accounts) && f0.g(this.master, steamAccounts.master);
    }

    @e
    public final List<SteamGameAccount> getAccounts() {
        return this.accounts;
    }

    @e
    public final SteamGameAccount getMaster() {
        return this.master;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14048, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<SteamGameAccount> list = this.accounts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        SteamGameAccount steamGameAccount = this.master;
        return iHashCode + (steamGameAccount != null ? steamGameAccount.hashCode() : 0);
    }

    public final void setAccounts(@e List<SteamGameAccount> list) {
        this.accounts = list;
    }

    public final void setMaster(@e SteamGameAccount steamGameAccount) {
        this.master = steamGameAccount;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14047, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamAccounts(accounts=" + this.accounts + ", master=" + this.master + ')';
    }
}
