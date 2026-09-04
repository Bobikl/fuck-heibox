package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OnlineStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class OnlineStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String friend_num;

    @e
    private String friend_online_num;

    @e
    private String online_desc;

    @e
    private String online_state;

    public OnlineStateObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.friend_num = str;
        this.friend_online_num = str2;
        this.online_state = str3;
        this.online_desc = str4;
    }

    public static /* synthetic */ OnlineStateObj copy$default(OnlineStateObj onlineStateObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onlineStateObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 13885, new Class[]{OnlineStateObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, OnlineStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OnlineStateObj) patchProxyResultProxy.result;
        }
        return onlineStateObj.copy((i10 & 1) != 0 ? onlineStateObj.friend_num : str, (i10 & 2) != 0 ? onlineStateObj.friend_online_num : str2, (i10 & 4) != 0 ? onlineStateObj.online_state : str3, (i10 & 8) != 0 ? onlineStateObj.online_desc : str4);
    }

    @e
    public final String component1() {
        return this.friend_num;
    }

    @e
    public final String component2() {
        return this.friend_online_num;
    }

    @e
    public final String component3() {
        return this.online_state;
    }

    @e
    public final String component4() {
        return this.online_desc;
    }

    @d
    public final OnlineStateObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 13884, new Class[]{String.class, String.class, String.class, String.class}, OnlineStateObj.class);
        return patchProxyResultProxy.isSupported ? (OnlineStateObj) patchProxyResultProxy.result : new OnlineStateObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13888, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnlineStateObj)) {
            return false;
        }
        OnlineStateObj onlineStateObj = (OnlineStateObj) obj;
        return f0.g(this.friend_num, onlineStateObj.friend_num) && f0.g(this.friend_online_num, onlineStateObj.friend_online_num) && f0.g(this.online_state, onlineStateObj.online_state) && f0.g(this.online_desc, onlineStateObj.online_desc);
    }

    @e
    public final String getFriend_num() {
        return this.friend_num;
    }

    @e
    public final String getFriend_online_num() {
        return this.friend_online_num;
    }

    @e
    public final String getOnline_desc() {
        return this.online_desc;
    }

    @e
    public final String getOnline_state() {
        return this.online_state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13887, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.friend_num;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.friend_online_num;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.online_state;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.online_desc;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setFriend_num(@e String str) {
        this.friend_num = str;
    }

    public final void setFriend_online_num(@e String str) {
        this.friend_online_num = str;
    }

    public final void setOnline_desc(@e String str) {
        this.online_desc = str;
    }

    public final void setOnline_state(@e String str) {
        this.online_state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13886, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OnlineStateObj(friend_num=" + this.friend_num + ", friend_online_num=" + this.friend_online_num + ", online_state=" + this.online_state + ", online_desc=" + this.online_desc + ')';
    }
}
