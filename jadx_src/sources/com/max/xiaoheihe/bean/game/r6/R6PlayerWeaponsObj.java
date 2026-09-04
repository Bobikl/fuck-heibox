package com.max.xiaoheihe.bean.game.r6;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: R6PlayerWeaponsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6PlayerWeaponsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<R6PlayerWeaponDataObj> data;

    @e
    private List<R6WeaponTypeInfo> typeFilter;

    public R6PlayerWeaponsObj(@e List<R6WeaponTypeInfo> list, @e List<R6PlayerWeaponDataObj> list2) {
        this.typeFilter = list;
        this.data = list2;
    }

    public static /* synthetic */ R6PlayerWeaponsObj copy$default(R6PlayerWeaponsObj r6PlayerWeaponsObj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r6PlayerWeaponsObj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15321, new Class[]{R6PlayerWeaponsObj.class, List.class, List.class, Integer.TYPE, Object.class}, R6PlayerWeaponsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6PlayerWeaponsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = r6PlayerWeaponsObj.typeFilter;
        }
        if ((i10 & 2) != 0) {
            list2 = r6PlayerWeaponsObj.data;
        }
        return r6PlayerWeaponsObj.copy(list, list2);
    }

    @e
    public final List<R6WeaponTypeInfo> component1() {
        return this.typeFilter;
    }

    @e
    public final List<R6PlayerWeaponDataObj> component2() {
        return this.data;
    }

    @d
    public final R6PlayerWeaponsObj copy(@e List<R6WeaponTypeInfo> list, @e List<R6PlayerWeaponDataObj> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 15320, new Class[]{List.class, List.class}, R6PlayerWeaponsObj.class);
        return patchProxyResultProxy.isSupported ? (R6PlayerWeaponsObj) patchProxyResultProxy.result : new R6PlayerWeaponsObj(list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15324, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6PlayerWeaponsObj)) {
            return false;
        }
        R6PlayerWeaponsObj r6PlayerWeaponsObj = (R6PlayerWeaponsObj) obj;
        return f0.g(this.typeFilter, r6PlayerWeaponsObj.typeFilter) && f0.g(this.data, r6PlayerWeaponsObj.data);
    }

    @e
    public final List<R6PlayerWeaponDataObj> getData() {
        return this.data;
    }

    @e
    public final List<R6WeaponTypeInfo> getTypeFilter() {
        return this.typeFilter;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15323, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<R6WeaponTypeInfo> list = this.typeFilter;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<R6PlayerWeaponDataObj> list2 = this.data;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setData(@e List<R6PlayerWeaponDataObj> list) {
        this.data = list;
    }

    public final void setTypeFilter(@e List<R6WeaponTypeInfo> list) {
        this.typeFilter = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15322, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "R6PlayerWeaponsObj(typeFilter=" + this.typeFilter + ", data=" + this.data + ')';
    }
}
