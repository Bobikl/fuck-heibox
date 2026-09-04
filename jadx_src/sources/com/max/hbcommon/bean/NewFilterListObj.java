package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewFilterListObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class NewFilterListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private List<NewFilterObj> filters;

    @e
    private String key;

    public NewFilterListObj(@e List<NewFilterObj> list, @e String str, @e String str2) {
        this.filters = list;
        this.desc = str;
        this.key = str2;
    }

    public static /* synthetic */ NewFilterListObj copy$default(NewFilterListObj newFilterListObj, List list, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newFilterListObj, list, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31316j4, new Class[]{NewFilterListObj.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, NewFilterListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewFilterListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = newFilterListObj.filters;
        }
        if ((i10 & 2) != 0) {
            str = newFilterListObj.desc;
        }
        if ((i10 & 4) != 0) {
            str2 = newFilterListObj.key;
        }
        return newFilterListObj.copy(list, str, str2);
    }

    @e
    public final List<NewFilterObj> component1() {
        return this.filters;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.key;
    }

    @d
    public final NewFilterListObj copy(@e List<NewFilterObj> list, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, c.d.f31293i4, new Class[]{List.class, String.class, String.class}, NewFilterListObj.class);
        return patchProxyResultProxy.isSupported ? (NewFilterListObj) patchProxyResultProxy.result : new NewFilterListObj(list, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31385m4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewFilterListObj)) {
            return false;
        }
        NewFilterListObj newFilterListObj = (NewFilterListObj) obj;
        return f0.g(this.filters, newFilterListObj.filters) && f0.g(this.desc, newFilterListObj.desc) && f0.g(this.key, newFilterListObj.key);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final List<NewFilterObj> getFilters() {
        return this.filters;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31362l4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<NewFilterObj> list = this.filters;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.key;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFilters(@e List<NewFilterObj> list) {
        this.filters = list;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31339k4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewFilterListObj(filters=" + this.filters + ", desc=" + this.desc + ", key=" + this.key + ')';
    }
}
