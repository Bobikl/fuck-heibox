package com.max.hbcommon.bean.segmentfilter;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class FilterRangeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private FilterItem end;
    private FilterItem start;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.Q5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterRangeObj filterRangeObj = (FilterRangeObj) obj;
        FilterItem filterItem = this.start;
        if (filterItem == null ? filterRangeObj.start != null : !filterItem.equals(filterRangeObj.start)) {
            return false;
        }
        FilterItem filterItem2 = this.end;
        FilterItem filterItem3 = filterRangeObj.end;
        if (filterItem2 != null) {
            return filterItem2.equals(filterItem3);
        }
        return filterItem3 == null;
    }

    public FilterItem getEnd() {
        return this.end;
    }

    public FilterItem getStart() {
        return this.start;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.R5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        FilterItem filterItem = this.start;
        int iHashCode = (filterItem != null ? filterItem.hashCode() : 0) * 31;
        FilterItem filterItem2 = this.end;
        return iHashCode + (filterItem2 != null ? filterItem2.hashCode() : 0);
    }

    public void setEnd(FilterItem filterItem) {
        this.end = filterItem;
    }

    public void setStart(FilterItem filterItem) {
        this.start = filterItem;
    }
}
