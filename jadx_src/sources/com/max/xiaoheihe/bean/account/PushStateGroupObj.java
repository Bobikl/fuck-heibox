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

/* JADX INFO: compiled from: PushStateGroupObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PushStateGroupObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String group_name;

    @e
    private ArrayList<PushStateObj> items;

    public PushStateGroupObj(@e ArrayList<PushStateObj> arrayList, @e String str) {
        this.items = arrayList;
        this.group_name = str;
    }

    public static /* synthetic */ PushStateGroupObj copy$default(PushStateGroupObj pushStateGroupObj, ArrayList arrayList, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pushStateGroupObj, arrayList, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 13925, new Class[]{PushStateGroupObj.class, ArrayList.class, String.class, Integer.TYPE, Object.class}, PushStateGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PushStateGroupObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = pushStateGroupObj.items;
        }
        if ((i10 & 2) != 0) {
            str = pushStateGroupObj.group_name;
        }
        return pushStateGroupObj.copy(arrayList, str);
    }

    @e
    public final ArrayList<PushStateObj> component1() {
        return this.items;
    }

    @e
    public final String component2() {
        return this.group_name;
    }

    @d
    public final PushStateGroupObj copy(@e ArrayList<PushStateObj> arrayList, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str}, this, changeQuickRedirect, false, 13924, new Class[]{ArrayList.class, String.class}, PushStateGroupObj.class);
        return patchProxyResultProxy.isSupported ? (PushStateGroupObj) patchProxyResultProxy.result : new PushStateGroupObj(arrayList, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13928, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushStateGroupObj)) {
            return false;
        }
        PushStateGroupObj pushStateGroupObj = (PushStateGroupObj) obj;
        return f0.g(this.items, pushStateGroupObj.items) && f0.g(this.group_name, pushStateGroupObj.group_name);
    }

    @e
    public final String getGroup_name() {
        return this.group_name;
    }

    @e
    public final ArrayList<PushStateObj> getItems() {
        return this.items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13927, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<PushStateObj> arrayList = this.items;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.group_name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setGroup_name(@e String str) {
        this.group_name = str;
    }

    public final void setItems(@e ArrayList<PushStateObj> arrayList) {
        this.items = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13926, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PushStateGroupObj(items=" + this.items + ", group_name=" + this.group_name + ')';
    }
}
