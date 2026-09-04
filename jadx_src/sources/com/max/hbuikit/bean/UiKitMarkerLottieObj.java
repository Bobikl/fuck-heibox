package com.max.hbuikit.bean;

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

/* JADX INFO: compiled from: UiKitLottieObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitMarkerLottieObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String last_marker_infinite;

    @e
    private List<LottieMarkerObj> markers;

    /* JADX WARN: Multi-variable type inference failed */
    public UiKitMarkerLottieObj() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public UiKitMarkerLottieObj(@e List<LottieMarkerObj> list, @e String str) {
        this.markers = list;
        this.last_marker_infinite = str;
    }

    public /* synthetic */ UiKitMarkerLottieObj(List list, String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ UiKitMarkerLottieObj copy$default(UiKitMarkerLottieObj uiKitMarkerLottieObj, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitMarkerLottieObj, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33603hk, new Class[]{UiKitMarkerLottieObj.class, List.class, String.class, Integer.TYPE, Object.class}, UiKitMarkerLottieObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitMarkerLottieObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = uiKitMarkerLottieObj.markers;
        }
        if ((i10 & 2) != 0) {
            str = uiKitMarkerLottieObj.last_marker_infinite;
        }
        return uiKitMarkerLottieObj.copy(list, str);
    }

    @e
    public final List<LottieMarkerObj> component1() {
        return this.markers;
    }

    @e
    public final String component2() {
        return this.last_marker_infinite;
    }

    @d
    public final UiKitMarkerLottieObj copy(@e List<LottieMarkerObj> list, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, c.k.f33580gk, new Class[]{List.class, String.class}, UiKitMarkerLottieObj.class);
        return patchProxyResultProxy.isSupported ? (UiKitMarkerLottieObj) patchProxyResultProxy.result : new UiKitMarkerLottieObj(list, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33672kk, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitMarkerLottieObj)) {
            return false;
        }
        UiKitMarkerLottieObj uiKitMarkerLottieObj = (UiKitMarkerLottieObj) obj;
        return f0.g(this.markers, uiKitMarkerLottieObj.markers) && f0.g(this.last_marker_infinite, uiKitMarkerLottieObj.last_marker_infinite);
    }

    @e
    public final String getLast_marker_infinite() {
        return this.last_marker_infinite;
    }

    @e
    public final List<LottieMarkerObj> getMarkers() {
        return this.markers;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33649jk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<LottieMarkerObj> list = this.markers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.last_marker_infinite;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setLast_marker_infinite(@e String str) {
        this.last_marker_infinite = str;
    }

    public final void setMarkers(@e List<LottieMarkerObj> list) {
        this.markers = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33625ik, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitMarkerLottieObj(markers=" + this.markers + ", last_marker_infinite=" + this.last_marker_infinite + ')';
    }
}
