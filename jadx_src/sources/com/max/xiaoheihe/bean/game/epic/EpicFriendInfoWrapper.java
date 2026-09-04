package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicFriendInfoWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicFriendInfoWrapper implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private ArrayList<EpicFriendInfo> list;

    @e
    private EpicFriendInfo user_rank;

    public EpicFriendInfoWrapper(@e ArrayList<EpicFriendInfo> arrayList, @e String str, @e EpicFriendInfo epicFriendInfo) {
        this.list = arrayList;
        this.count = str;
        this.user_rank = epicFriendInfo;
    }

    public static /* synthetic */ EpicFriendInfoWrapper copy$default(EpicFriendInfoWrapper epicFriendInfoWrapper, ArrayList arrayList, String str, EpicFriendInfo epicFriendInfo, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicFriendInfoWrapper, arrayList, str, epicFriendInfo, new Integer(i10), obj}, null, changeQuickRedirect, true, 15176, new Class[]{EpicFriendInfoWrapper.class, ArrayList.class, String.class, EpicFriendInfo.class, Integer.TYPE, Object.class}, EpicFriendInfoWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicFriendInfoWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = epicFriendInfoWrapper.list;
        }
        if ((i10 & 2) != 0) {
            str = epicFriendInfoWrapper.count;
        }
        if ((i10 & 4) != 0) {
            epicFriendInfo = epicFriendInfoWrapper.user_rank;
        }
        return epicFriendInfoWrapper.copy(arrayList, str, epicFriendInfo);
    }

    @e
    public final ArrayList<EpicFriendInfo> component1() {
        return this.list;
    }

    @e
    public final String component2() {
        return this.count;
    }

    @e
    public final EpicFriendInfo component3() {
        return this.user_rank;
    }

    @d
    public final EpicFriendInfoWrapper copy(@e ArrayList<EpicFriendInfo> arrayList, @e String str, @e EpicFriendInfo epicFriendInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, epicFriendInfo}, this, changeQuickRedirect, false, 15175, new Class[]{ArrayList.class, String.class, EpicFriendInfo.class}, EpicFriendInfoWrapper.class);
        return patchProxyResultProxy.isSupported ? (EpicFriendInfoWrapper) patchProxyResultProxy.result : new EpicFriendInfoWrapper(arrayList, str, epicFriendInfo);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15179, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicFriendInfoWrapper)) {
            return false;
        }
        EpicFriendInfoWrapper epicFriendInfoWrapper = (EpicFriendInfoWrapper) obj;
        return f0.g(this.list, epicFriendInfoWrapper.list) && f0.g(this.count, epicFriendInfoWrapper.count) && f0.g(this.user_rank, epicFriendInfoWrapper.user_rank);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final ArrayList<EpicFriendInfo> getList() {
        return this.list;
    }

    @e
    public final EpicFriendInfo getUser_rank() {
        return this.user_rank;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15178, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<EpicFriendInfo> arrayList = this.list;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.count;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EpicFriendInfo epicFriendInfo = this.user_rank;
        return iHashCode2 + (epicFriendInfo != null ? epicFriendInfo.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setList(@e ArrayList<EpicFriendInfo> arrayList) {
        this.list = arrayList;
    }

    public final void setUser_rank(@e EpicFriendInfo epicFriendInfo) {
        this.user_rank = epicFriendInfo;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15177, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicFriendInfoWrapper(list=" + this.list + ", count=" + this.count + ", user_rank=" + this.user_rank + ')';
    }
}
