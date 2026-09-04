package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsLinkListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsLinkListObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<FeedsLinkListItemObj> link_list;

    public FeedsLinkListObj(@e List<FeedsLinkListItemObj> list) {
        this.link_list = list;
    }

    public static /* synthetic */ FeedsLinkListObj copy$default(FeedsLinkListObj feedsLinkListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsLinkListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15756, new Class[]{FeedsLinkListObj.class, List.class, Integer.TYPE, Object.class}, FeedsLinkListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsLinkListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = feedsLinkListObj.link_list;
        }
        return feedsLinkListObj.copy(list);
    }

    @e
    public final List<FeedsLinkListItemObj> component1() {
        return this.link_list;
    }

    @d
    public final FeedsLinkListObj copy(@e List<FeedsLinkListItemObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15755, new Class[]{List.class}, FeedsLinkListObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsLinkListObj) patchProxyResultProxy.result : new FeedsLinkListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15759, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedsLinkListObj) && f0.g(this.link_list, ((FeedsLinkListObj) obj).link_list);
    }

    @e
    public final List<FeedsLinkListItemObj> getLink_list() {
        return this.link_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15758, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<FeedsLinkListItemObj> list = this.link_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setLink_list(@e List<FeedsLinkListItemObj> list) {
        this.link_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15757, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsLinkListObj(link_list=" + this.link_list + ')';
    }
}
