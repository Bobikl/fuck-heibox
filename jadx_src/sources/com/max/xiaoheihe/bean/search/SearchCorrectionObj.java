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

/* JADX INFO: compiled from: SearchCorrectionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchCorrectionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<SearchCorrectionInfo> item_list;

    public SearchCorrectionObj(@e List<SearchCorrectionInfo> list) {
        this.item_list = list;
    }

    public static /* synthetic */ SearchCorrectionObj copy$default(SearchCorrectionObj searchCorrectionObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchCorrectionObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15837, new Class[]{SearchCorrectionObj.class, List.class, Integer.TYPE, Object.class}, SearchCorrectionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchCorrectionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = searchCorrectionObj.item_list;
        }
        return searchCorrectionObj.copy(list);
    }

    @e
    public final List<SearchCorrectionInfo> component1() {
        return this.item_list;
    }

    @d
    public final SearchCorrectionObj copy(@e List<SearchCorrectionInfo> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15836, new Class[]{List.class}, SearchCorrectionObj.class);
        return patchProxyResultProxy.isSupported ? (SearchCorrectionObj) patchProxyResultProxy.result : new SearchCorrectionObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15840, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCorrectionObj) && f0.g(this.item_list, ((SearchCorrectionObj) obj).item_list);
    }

    @e
    public final List<SearchCorrectionInfo> getItem_list() {
        return this.item_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15839, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<SearchCorrectionInfo> list = this.item_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setItem_list(@e List<SearchCorrectionInfo> list) {
        this.item_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15838, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchCorrectionObj(item_list=" + this.item_list + ')';
    }
}
