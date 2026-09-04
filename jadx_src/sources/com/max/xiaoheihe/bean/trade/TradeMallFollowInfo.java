package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeMallFollowInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeMallFollowInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String follow_state;

    @e
    private ShareInfoObj share_info;

    @e
    private String spu_id;

    public TradeMallFollowInfo(@e String str, @e ShareInfoObj shareInfoObj, @e String str2) {
        this.follow_state = str;
        this.share_info = shareInfoObj;
        this.spu_id = str2;
    }

    public static /* synthetic */ TradeMallFollowInfo copy$default(TradeMallFollowInfo tradeMallFollowInfo, String str, ShareInfoObj shareInfoObj, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeMallFollowInfo, str, shareInfoObj, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16106, new Class[]{TradeMallFollowInfo.class, String.class, ShareInfoObj.class, String.class, Integer.TYPE, Object.class}, TradeMallFollowInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeMallFollowInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tradeMallFollowInfo.follow_state;
        }
        if ((i10 & 2) != 0) {
            shareInfoObj = tradeMallFollowInfo.share_info;
        }
        if ((i10 & 4) != 0) {
            str2 = tradeMallFollowInfo.spu_id;
        }
        return tradeMallFollowInfo.copy(str, shareInfoObj, str2);
    }

    @e
    public final String component1() {
        return this.follow_state;
    }

    @e
    public final ShareInfoObj component2() {
        return this.share_info;
    }

    @e
    public final String component3() {
        return this.spu_id;
    }

    @d
    public final TradeMallFollowInfo copy(@e String str, @e ShareInfoObj shareInfoObj, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, shareInfoObj, str2}, this, changeQuickRedirect, false, 16105, new Class[]{String.class, ShareInfoObj.class, String.class}, TradeMallFollowInfo.class);
        return patchProxyResultProxy.isSupported ? (TradeMallFollowInfo) patchProxyResultProxy.result : new TradeMallFollowInfo(str, shareInfoObj, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16109, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeMallFollowInfo)) {
            return false;
        }
        TradeMallFollowInfo tradeMallFollowInfo = (TradeMallFollowInfo) obj;
        return f0.g(this.follow_state, tradeMallFollowInfo.follow_state) && f0.g(this.share_info, tradeMallFollowInfo.share_info) && f0.g(this.spu_id, tradeMallFollowInfo.spu_id);
    }

    @e
    public final String getFollow_state() {
        return this.follow_state;
    }

    @e
    public final ShareInfoObj getShare_info() {
        return this.share_info;
    }

    @e
    public final String getSpu_id() {
        return this.spu_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16108, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.follow_state;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ShareInfoObj shareInfoObj = this.share_info;
        int iHashCode2 = (iHashCode + (shareInfoObj == null ? 0 : shareInfoObj.hashCode())) * 31;
        String str2 = this.spu_id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFollow_state(@e String str) {
        this.follow_state = str;
    }

    public final void setShare_info(@e ShareInfoObj shareInfoObj) {
        this.share_info = shareInfoObj;
    }

    public final void setSpu_id(@e String str) {
        this.spu_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16107, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeMallFollowInfo(follow_state=" + this.follow_state + ", share_info=" + this.share_info + ", spu_id=" + this.spu_id + ')';
    }
}
