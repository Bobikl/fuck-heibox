package com.max.hbuikit.bean.param;

import bb.c;
import com.max.hbuikit.bean.UiKitLottieObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UiKitLottieListObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitLottieListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String last_infinite;

    @e
    private List<UiKitLottieObj> list;

    public UiKitLottieListObj(@e List<UiKitLottieObj> list, @e String str) {
        this.list = list;
        this.last_infinite = str;
    }

    public static /* synthetic */ UiKitLottieListObj copy$default(UiKitLottieListObj uiKitLottieListObj, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitLottieListObj, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Ek, new Class[]{UiKitLottieListObj.class, List.class, String.class, Integer.TYPE, Object.class}, UiKitLottieListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitLottieListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = uiKitLottieListObj.list;
        }
        if ((i10 & 2) != 0) {
            str = uiKitLottieListObj.last_infinite;
        }
        return uiKitLottieListObj.copy(list, str);
    }

    @e
    public final List<UiKitLottieObj> component1() {
        return this.list;
    }

    @e
    public final String component2() {
        return this.last_infinite;
    }

    @d
    public final UiKitLottieListObj copy(@e List<UiKitLottieObj> list, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, c.k.Dk, new Class[]{List.class, String.class}, UiKitLottieListObj.class);
        return patchProxyResultProxy.isSupported ? (UiKitLottieListObj) patchProxyResultProxy.result : new UiKitLottieListObj(list, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Hk, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitLottieListObj)) {
            return false;
        }
        UiKitLottieListObj uiKitLottieListObj = (UiKitLottieListObj) obj;
        return f0.g(this.list, uiKitLottieListObj.list) && f0.g(this.last_infinite, uiKitLottieListObj.last_infinite);
    }

    @e
    public final String getLast_infinite() {
        return this.last_infinite;
    }

    @e
    public final List<UiKitLottieObj> getList() {
        return this.list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Gk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<UiKitLottieObj> list = this.list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.last_infinite;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setLast_infinite(@e String str) {
        this.last_infinite = str;
    }

    public final void setList(@e List<UiKitLottieObj> list) {
        this.list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Fk, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitLottieListObj(list=" + this.list + ", last_infinite=" + this.last_infinite + ')';
    }
}
