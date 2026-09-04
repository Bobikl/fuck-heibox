package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HotSearchObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HotSearchObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<HotSearchItemObj> list;

    @e
    private String name;

    @e
    private String type;

    public HotSearchObj() {
        this(null, null, null, 7, null);
    }

    public HotSearchObj(@e String str, @e String str2, @e List<HotSearchItemObj> list) {
        this.name = str;
        this.type = str2;
        this.list = list;
    }

    public /* synthetic */ HotSearchObj(String str, String str2, List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }

    public static /* synthetic */ HotSearchObj copy$default(HotSearchObj hotSearchObj, String str, String str2, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchObj, str, str2, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33841s7, new Class[]{HotSearchObj.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, HotSearchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = hotSearchObj.name;
        }
        if ((i10 & 2) != 0) {
            str2 = hotSearchObj.type;
        }
        if ((i10 & 4) != 0) {
            list = hotSearchObj.list;
        }
        return hotSearchObj.copy(str, str2, list);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.type;
    }

    @e
    public final List<HotSearchItemObj> component3() {
        return this.list;
    }

    @d
    public final HotSearchObj copy(@e String str, @e String str2, @e List<HotSearchItemObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, this, changeQuickRedirect, false, c.k.f33819r7, new Class[]{String.class, String.class, List.class}, HotSearchObj.class);
        return patchProxyResultProxy.isSupported ? (HotSearchObj) patchProxyResultProxy.result : new HotSearchObj(str, str2, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33907v7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSearchObj)) {
            return false;
        }
        HotSearchObj hotSearchObj = (HotSearchObj) obj;
        return f0.g(this.name, hotSearchObj.name) && f0.g(this.type, hotSearchObj.type) && f0.g(this.list, hotSearchObj.list);
    }

    @e
    public final List<HotSearchItemObj> getList() {
        return this.list;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33885u7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<HotSearchItemObj> list = this.list;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setList(@e List<HotSearchItemObj> list) {
        this.list = list;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33863t7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotSearchObj(name=" + this.name + ", type=" + this.type + ", list=" + this.list + ')';
    }
}
