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
public final class PushStateGroupWrapperObjV4 implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<ArrayList<PushStateGroupObj>> groups;

    public PushStateGroupWrapperObjV4(@e ArrayList<ArrayList<PushStateGroupObj>> arrayList) {
        this.groups = arrayList;
    }

    public static /* synthetic */ PushStateGroupWrapperObjV4 copy$default(PushStateGroupWrapperObjV4 pushStateGroupWrapperObjV4, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pushStateGroupWrapperObjV4, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 13935, new Class[]{PushStateGroupWrapperObjV4.class, ArrayList.class, Integer.TYPE, Object.class}, PushStateGroupWrapperObjV4.class);
        if (patchProxyResultProxy.isSupported) {
            return (PushStateGroupWrapperObjV4) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = pushStateGroupWrapperObjV4.groups;
        }
        return pushStateGroupWrapperObjV4.copy(arrayList);
    }

    @e
    public final ArrayList<ArrayList<PushStateGroupObj>> component1() {
        return this.groups;
    }

    @d
    public final PushStateGroupWrapperObjV4 copy(@e ArrayList<ArrayList<PushStateGroupObj>> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 13934, new Class[]{ArrayList.class}, PushStateGroupWrapperObjV4.class);
        return patchProxyResultProxy.isSupported ? (PushStateGroupWrapperObjV4) patchProxyResultProxy.result : new PushStateGroupWrapperObjV4(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13938, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushStateGroupWrapperObjV4) && f0.g(this.groups, ((PushStateGroupWrapperObjV4) obj).groups);
    }

    @e
    public final ArrayList<ArrayList<PushStateGroupObj>> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13937, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<ArrayList<PushStateGroupObj>> arrayList = this.groups;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setGroups(@e ArrayList<ArrayList<PushStateGroupObj>> arrayList) {
        this.groups = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13936, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PushStateGroupWrapperObjV4(groups=" + this.groups + ')';
    }
}
