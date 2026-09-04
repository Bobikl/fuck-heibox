package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsContentRecUsersObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsContentRecUsersObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<BBSUserInfoObj> items;

    public FeedsContentRecUsersObj(@e List<BBSUserInfoObj> list) {
        this.items = list;
    }

    public static /* synthetic */ FeedsContentRecUsersObj copy$default(FeedsContentRecUsersObj feedsContentRecUsersObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentRecUsersObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15746, new Class[]{FeedsContentRecUsersObj.class, List.class, Integer.TYPE, Object.class}, FeedsContentRecUsersObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsContentRecUsersObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = feedsContentRecUsersObj.items;
        }
        return feedsContentRecUsersObj.copy(list);
    }

    @e
    public final List<BBSUserInfoObj> component1() {
        return this.items;
    }

    @d
    public final FeedsContentRecUsersObj copy(@e List<BBSUserInfoObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15745, new Class[]{List.class}, FeedsContentRecUsersObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsContentRecUsersObj) patchProxyResultProxy.result : new FeedsContentRecUsersObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15749, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedsContentRecUsersObj) && f0.g(this.items, ((FeedsContentRecUsersObj) obj).items);
    }

    @e
    public final List<BBSUserInfoObj> getItems() {
        return this.items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15748, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<BBSUserInfoObj> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setItems(@e List<BBSUserInfoObj> list) {
        this.items = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15747, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsContentRecUsersObj(items=" + this.items + ')';
    }
}
