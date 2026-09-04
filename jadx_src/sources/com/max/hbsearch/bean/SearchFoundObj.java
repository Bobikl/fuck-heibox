package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchFoundObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SearchFoundObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HotSearchObj search_found;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchFoundObj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SearchFoundObj(@e HotSearchObj hotSearchObj) {
        this.search_found = hotSearchObj;
    }

    public /* synthetic */ SearchFoundObj(HotSearchObj hotSearchObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : hotSearchObj);
    }

    public static /* synthetic */ SearchFoundObj copy$default(SearchFoundObj searchFoundObj, HotSearchObj hotSearchObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchFoundObj, hotSearchObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33951x7, new Class[]{SearchFoundObj.class, HotSearchObj.class, Integer.TYPE, Object.class}, SearchFoundObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchFoundObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            hotSearchObj = searchFoundObj.search_found;
        }
        return searchFoundObj.copy(hotSearchObj);
    }

    @e
    public final HotSearchObj component1() {
        return this.search_found;
    }

    @d
    public final SearchFoundObj copy(@e HotSearchObj hotSearchObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchObj}, this, changeQuickRedirect, false, c.k.f33929w7, new Class[]{HotSearchObj.class}, SearchFoundObj.class);
        return patchProxyResultProxy.isSupported ? (SearchFoundObj) patchProxyResultProxy.result : new SearchFoundObj(hotSearchObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.A7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchFoundObj) && f0.g(this.search_found, ((SearchFoundObj) obj).search_found);
    }

    @e
    public final HotSearchObj getSearch_found() {
        return this.search_found;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33995z7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HotSearchObj hotSearchObj = this.search_found;
        if (hotSearchObj == null) {
            return 0;
        }
        return hotSearchObj.hashCode();
    }

    public final void setSearch_found(@e HotSearchObj hotSearchObj) {
        this.search_found = hotSearchObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33973y7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchFoundObj(search_found=" + this.search_found + ')';
    }
}
