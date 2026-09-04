package com.max.xiaoheihe.bean.game.calendar;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FilterGroupListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FilterGroupListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<FilterGroup> filters;

    public FilterGroupListObj(@e List<FilterGroup> list) {
        this.filters = list;
    }

    public static /* synthetic */ FilterGroupListObj copy$default(FilterGroupListObj filterGroupListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterGroupListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15034, new Class[]{FilterGroupListObj.class, List.class, Integer.TYPE, Object.class}, FilterGroupListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FilterGroupListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = filterGroupListObj.filters;
        }
        return filterGroupListObj.copy(list);
    }

    @e
    public final List<FilterGroup> component1() {
        return this.filters;
    }

    @d
    public final FilterGroupListObj copy(@e List<FilterGroup> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15033, new Class[]{List.class}, FilterGroupListObj.class);
        return patchProxyResultProxy.isSupported ? (FilterGroupListObj) patchProxyResultProxy.result : new FilterGroupListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15037, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterGroupListObj) && f0.g(this.filters, ((FilterGroupListObj) obj).filters);
    }

    @e
    public final List<FilterGroup> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15036, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<FilterGroup> list = this.filters;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setFilters(@e List<FilterGroup> list) {
        this.filters = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15035, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FilterGroupListObj(filters=" + this.filters + ')';
    }
}
