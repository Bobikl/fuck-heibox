package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkListResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class LinkListResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<FeedsContentBaseObj> links;

    public LinkListResultObj(@e List<FeedsContentBaseObj> list) {
        this.links = list;
    }

    public static /* synthetic */ LinkListResultObj copy$default(LinkListResultObj linkListResultObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkListResultObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15771, new Class[]{LinkListResultObj.class, List.class, Integer.TYPE, Object.class}, LinkListResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkListResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = linkListResultObj.links;
        }
        return linkListResultObj.copy(list);
    }

    @e
    public final List<FeedsContentBaseObj> component1() {
        return this.links;
    }

    @d
    public final LinkListResultObj copy(@e List<FeedsContentBaseObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15770, new Class[]{List.class}, LinkListResultObj.class);
        return patchProxyResultProxy.isSupported ? (LinkListResultObj) patchProxyResultProxy.result : new LinkListResultObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15774, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkListResultObj) && f0.g(this.links, ((LinkListResultObj) obj).links);
    }

    @e
    public final List<FeedsContentBaseObj> getLinks() {
        return this.links;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15773, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<FeedsContentBaseObj> list = this.links;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setLinks(@e List<FeedsContentBaseObj> list) {
        this.links = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15772, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LinkListResultObj(links=" + this.links + ')';
    }
}
