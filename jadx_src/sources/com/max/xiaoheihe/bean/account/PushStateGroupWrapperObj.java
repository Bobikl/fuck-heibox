package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PushStateGroupWrapperObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PushStateGroupWrapperObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<PushStateGroupObj> groups;

    public PushStateGroupWrapperObj(@e ArrayList<PushStateGroupObj> arrayList) {
        this.groups = arrayList;
    }

    public static /* synthetic */ PushStateGroupWrapperObj copy$default(PushStateGroupWrapperObj pushStateGroupWrapperObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pushStateGroupWrapperObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 13930, new Class[]{PushStateGroupWrapperObj.class, ArrayList.class, Integer.TYPE, Object.class}, PushStateGroupWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PushStateGroupWrapperObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = pushStateGroupWrapperObj.groups;
        }
        return pushStateGroupWrapperObj.copy(arrayList);
    }

    @e
    public final ArrayList<PushStateGroupObj> component1() {
        return this.groups;
    }

    @d
    public final PushStateGroupWrapperObj copy(@e ArrayList<PushStateGroupObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 13929, new Class[]{ArrayList.class}, PushStateGroupWrapperObj.class);
        return patchProxyResultProxy.isSupported ? (PushStateGroupWrapperObj) patchProxyResultProxy.result : new PushStateGroupWrapperObj(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13933, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushStateGroupWrapperObj) && f0.g(this.groups, ((PushStateGroupWrapperObj) obj).groups);
    }

    @e
    public final ArrayList<PushStateGroupObj> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13932, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<PushStateGroupObj> arrayList = this.groups;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setGroups(@e ArrayList<PushStateGroupObj> arrayList) {
        this.groups = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13931, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PushStateGroupWrapperObj(groups=" + this.groups + ')';
    }
}
