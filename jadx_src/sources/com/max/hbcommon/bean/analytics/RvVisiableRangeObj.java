package com.max.hbcommon.bean.analytics;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: RvVisiableRangeObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class RvVisiableRangeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int first;
    private int last;

    public RvVisiableRangeObj(int i10, int i11) {
        this.first = i10;
        this.last = i11;
    }

    public static /* synthetic */ RvVisiableRangeObj copy$default(RvVisiableRangeObj rvVisiableRangeObj, int i10, int i11, int i12, Object obj) {
        Object[] objArr = {rvVisiableRangeObj, new Integer(i10), new Integer(i11), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.d.f31386m5, new Class[]{RvVisiableRangeObj.class, cls, cls, cls, Object.class}, RvVisiableRangeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RvVisiableRangeObj) patchProxyResultProxy.result;
        }
        if ((i12 & 1) != 0) {
            i10 = rvVisiableRangeObj.first;
        }
        if ((i12 & 2) != 0) {
            i11 = rvVisiableRangeObj.last;
        }
        return rvVisiableRangeObj.copy(i10, i11);
    }

    public final int component1() {
        return this.first;
    }

    public final int component2() {
        return this.last;
    }

    @d
    public final RvVisiableRangeObj copy(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.f31363l5, new Class[]{cls, cls}, RvVisiableRangeObj.class);
        return patchProxyResultProxy.isSupported ? (RvVisiableRangeObj) patchProxyResultProxy.result : new RvVisiableRangeObj(i10, i11);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RvVisiableRangeObj)) {
            return false;
        }
        RvVisiableRangeObj rvVisiableRangeObj = (RvVisiableRangeObj) obj;
        return this.first == rvVisiableRangeObj.first && this.last == rvVisiableRangeObj.last;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
        return this.last;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31432o5, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.first * 31) + this.last;
    }

    public final void setFirst(int i10) {
        this.first = i10;
    }

    public final void setLast(int i10) {
        this.last = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31409n5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RvVisiableRangeObj(first=" + this.first + ", last=" + this.last + ')';
    }
}
