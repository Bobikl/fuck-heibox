package com.max.xiaoheihe.bean.game.xbox;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: XboxFriendInfoWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class XboxFriendInfoWrapper implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private ArrayList<XboxFriendInfo> list;

    @e
    private XboxFriendInfo user_rank;

    public XboxFriendInfoWrapper(@e ArrayList<XboxFriendInfo> arrayList, @e String str, @e XboxFriendInfo xboxFriendInfo) {
        this.list = arrayList;
        this.count = str;
        this.user_rank = xboxFriendInfo;
    }

    public static /* synthetic */ XboxFriendInfoWrapper copy$default(XboxFriendInfoWrapper xboxFriendInfoWrapper, ArrayList arrayList, String str, XboxFriendInfo xboxFriendInfo, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xboxFriendInfoWrapper, arrayList, str, xboxFriendInfo, new Integer(i10), obj}, null, changeQuickRedirect, true, 15454, new Class[]{XboxFriendInfoWrapper.class, ArrayList.class, String.class, XboxFriendInfo.class, Integer.TYPE, Object.class}, XboxFriendInfoWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (XboxFriendInfoWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = xboxFriendInfoWrapper.list;
        }
        if ((i10 & 2) != 0) {
            str = xboxFriendInfoWrapper.count;
        }
        if ((i10 & 4) != 0) {
            xboxFriendInfo = xboxFriendInfoWrapper.user_rank;
        }
        return xboxFriendInfoWrapper.copy(arrayList, str, xboxFriendInfo);
    }

    @e
    public final ArrayList<XboxFriendInfo> component1() {
        return this.list;
    }

    @e
    public final String component2() {
        return this.count;
    }

    @e
    public final XboxFriendInfo component3() {
        return this.user_rank;
    }

    @d
    public final XboxFriendInfoWrapper copy(@e ArrayList<XboxFriendInfo> arrayList, @e String str, @e XboxFriendInfo xboxFriendInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, xboxFriendInfo}, this, changeQuickRedirect, false, 15453, new Class[]{ArrayList.class, String.class, XboxFriendInfo.class}, XboxFriendInfoWrapper.class);
        return patchProxyResultProxy.isSupported ? (XboxFriendInfoWrapper) patchProxyResultProxy.result : new XboxFriendInfoWrapper(arrayList, str, xboxFriendInfo);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15457, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XboxFriendInfoWrapper)) {
            return false;
        }
        XboxFriendInfoWrapper xboxFriendInfoWrapper = (XboxFriendInfoWrapper) obj;
        return f0.g(this.list, xboxFriendInfoWrapper.list) && f0.g(this.count, xboxFriendInfoWrapper.count) && f0.g(this.user_rank, xboxFriendInfoWrapper.user_rank);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final ArrayList<XboxFriendInfo> getList() {
        return this.list;
    }

    @e
    public final XboxFriendInfo getUser_rank() {
        return this.user_rank;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15456, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<XboxFriendInfo> arrayList = this.list;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.count;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        XboxFriendInfo xboxFriendInfo = this.user_rank;
        return iHashCode2 + (xboxFriendInfo != null ? xboxFriendInfo.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setList(@e ArrayList<XboxFriendInfo> arrayList) {
        this.list = arrayList;
    }

    public final void setUser_rank(@e XboxFriendInfo xboxFriendInfo) {
        this.user_rank = xboxFriendInfo;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15455, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "XboxFriendInfoWrapper(list=" + this.list + ", count=" + this.count + ", user_rank=" + this.user_rank + ')';
    }
}
