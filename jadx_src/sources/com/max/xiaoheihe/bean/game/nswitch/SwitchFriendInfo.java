package com.max.xiaoheihe.bean.game.nswitch;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SwitchFriendInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SwitchFriendInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccountDetailObj heybox;

    @e
    private SwitchAccountInfo switch_account_info;

    public SwitchFriendInfo(@e AccountDetailObj accountDetailObj, @e SwitchAccountInfo switchAccountInfo) {
        this.heybox = accountDetailObj;
        this.switch_account_info = switchAccountInfo;
    }

    public static /* synthetic */ SwitchFriendInfo copy$default(SwitchFriendInfo switchFriendInfo, AccountDetailObj accountDetailObj, SwitchAccountInfo switchAccountInfo, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{switchFriendInfo, accountDetailObj, switchAccountInfo, new Integer(i10), obj}, null, changeQuickRedirect, true, 15284, new Class[]{SwitchFriendInfo.class, AccountDetailObj.class, SwitchAccountInfo.class, Integer.TYPE, Object.class}, SwitchFriendInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SwitchFriendInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            accountDetailObj = switchFriendInfo.heybox;
        }
        if ((i10 & 2) != 0) {
            switchAccountInfo = switchFriendInfo.switch_account_info;
        }
        return switchFriendInfo.copy(accountDetailObj, switchAccountInfo);
    }

    @e
    public final AccountDetailObj component1() {
        return this.heybox;
    }

    @e
    public final SwitchAccountInfo component2() {
        return this.switch_account_info;
    }

    @d
    public final SwitchFriendInfo copy(@e AccountDetailObj accountDetailObj, @e SwitchAccountInfo switchAccountInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountDetailObj, switchAccountInfo}, this, changeQuickRedirect, false, 15283, new Class[]{AccountDetailObj.class, SwitchAccountInfo.class}, SwitchFriendInfo.class);
        return patchProxyResultProxy.isSupported ? (SwitchFriendInfo) patchProxyResultProxy.result : new SwitchFriendInfo(accountDetailObj, switchAccountInfo);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15287, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchFriendInfo)) {
            return false;
        }
        SwitchFriendInfo switchFriendInfo = (SwitchFriendInfo) obj;
        return f0.g(this.heybox, switchFriendInfo.heybox) && f0.g(this.switch_account_info, switchFriendInfo.switch_account_info);
    }

    @e
    public final AccountDetailObj getHeybox() {
        return this.heybox;
    }

    @e
    public final SwitchAccountInfo getSwitch_account_info() {
        return this.switch_account_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15286, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        AccountDetailObj accountDetailObj = this.heybox;
        int iHashCode = (accountDetailObj == null ? 0 : accountDetailObj.hashCode()) * 31;
        SwitchAccountInfo switchAccountInfo = this.switch_account_info;
        return iHashCode + (switchAccountInfo != null ? switchAccountInfo.hashCode() : 0);
    }

    public final void setHeybox(@e AccountDetailObj accountDetailObj) {
        this.heybox = accountDetailObj;
    }

    public final void setSwitch_account_info(@e SwitchAccountInfo switchAccountInfo) {
        this.switch_account_info = switchAccountInfo;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15285, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SwitchFriendInfo(heybox=" + this.heybox + ", switch_account_info=" + this.switch_account_info + ')';
    }
}
