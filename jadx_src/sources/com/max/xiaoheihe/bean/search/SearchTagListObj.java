package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchTagListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchTagListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<SearchTagObj> filter_tags;

    public SearchTagListObj(@e List<SearchTagObj> list) {
        this.filter_tags = list;
    }

    public static /* synthetic */ SearchTagListObj copy$default(SearchTagListObj searchTagListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchTagListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15873, new Class[]{SearchTagListObj.class, List.class, Integer.TYPE, Object.class}, SearchTagListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchTagListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = searchTagListObj.filter_tags;
        }
        return searchTagListObj.copy(list);
    }

    @e
    public final List<SearchTagObj> component1() {
        return this.filter_tags;
    }

    @d
    public final SearchTagListObj copy(@e List<SearchTagObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15872, new Class[]{List.class}, SearchTagListObj.class);
        return patchProxyResultProxy.isSupported ? (SearchTagListObj) patchProxyResultProxy.result : new SearchTagListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15876, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchTagListObj) && f0.g(this.filter_tags, ((SearchTagListObj) obj).filter_tags);
    }

    @e
    public final List<SearchTagObj> getFilter_tags() {
        return this.filter_tags;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15875, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<SearchTagObj> list = this.filter_tags;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setFilter_tags(@e List<SearchTagObj> list) {
        this.filter_tags = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15874, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchTagListObj(filter_tags=" + this.filter_tags + ')';
    }
}
