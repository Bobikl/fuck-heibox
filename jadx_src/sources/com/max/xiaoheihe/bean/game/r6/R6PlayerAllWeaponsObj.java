package com.max.xiaoheihe.bean.game.r6;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: R6PlayerAllWeaponsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6PlayerAllWeaponsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<KeyDescObj> filter;

    @e
    private ArrayList<R6ContentWeaponObj> infoByClass;

    @e
    private R6PlayerWeaponsObj infoDetail;

    public R6PlayerAllWeaponsObj(@e ArrayList<KeyDescObj> arrayList, @e ArrayList<R6ContentWeaponObj> arrayList2, @e R6PlayerWeaponsObj r6PlayerWeaponsObj) {
        this.filter = arrayList;
        this.infoByClass = arrayList2;
        this.infoDetail = r6PlayerWeaponsObj;
    }

    public static /* synthetic */ R6PlayerAllWeaponsObj copy$default(R6PlayerAllWeaponsObj r6PlayerAllWeaponsObj, ArrayList arrayList, ArrayList arrayList2, R6PlayerWeaponsObj r6PlayerWeaponsObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r6PlayerAllWeaponsObj, arrayList, arrayList2, r6PlayerWeaponsObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15301, new Class[]{R6PlayerAllWeaponsObj.class, ArrayList.class, ArrayList.class, R6PlayerWeaponsObj.class, Integer.TYPE, Object.class}, R6PlayerAllWeaponsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6PlayerAllWeaponsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = r6PlayerAllWeaponsObj.filter;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = r6PlayerAllWeaponsObj.infoByClass;
        }
        if ((i10 & 4) != 0) {
            r6PlayerWeaponsObj = r6PlayerAllWeaponsObj.infoDetail;
        }
        return r6PlayerAllWeaponsObj.copy(arrayList, arrayList2, r6PlayerWeaponsObj);
    }

    @e
    public final ArrayList<KeyDescObj> component1() {
        return this.filter;
    }

    @e
    public final ArrayList<R6ContentWeaponObj> component2() {
        return this.infoByClass;
    }

    @e
    public final R6PlayerWeaponsObj component3() {
        return this.infoDetail;
    }

    @d
    public final R6PlayerAllWeaponsObj copy(@e ArrayList<KeyDescObj> arrayList, @e ArrayList<R6ContentWeaponObj> arrayList2, @e R6PlayerWeaponsObj r6PlayerWeaponsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2, r6PlayerWeaponsObj}, this, changeQuickRedirect, false, 15300, new Class[]{ArrayList.class, ArrayList.class, R6PlayerWeaponsObj.class}, R6PlayerAllWeaponsObj.class);
        return patchProxyResultProxy.isSupported ? (R6PlayerAllWeaponsObj) patchProxyResultProxy.result : new R6PlayerAllWeaponsObj(arrayList, arrayList2, r6PlayerWeaponsObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15304, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6PlayerAllWeaponsObj)) {
            return false;
        }
        R6PlayerAllWeaponsObj r6PlayerAllWeaponsObj = (R6PlayerAllWeaponsObj) obj;
        return f0.g(this.filter, r6PlayerAllWeaponsObj.filter) && f0.g(this.infoByClass, r6PlayerAllWeaponsObj.infoByClass) && f0.g(this.infoDetail, r6PlayerAllWeaponsObj.infoDetail);
    }

    @e
    public final ArrayList<KeyDescObj> getFilter() {
        return this.filter;
    }

    @e
    public final ArrayList<R6ContentWeaponObj> getInfoByClass() {
        return this.infoByClass;
    }

    @e
    public final R6PlayerWeaponsObj getInfoDetail() {
        return this.infoDetail;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15303, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<KeyDescObj> arrayList = this.filter;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<R6ContentWeaponObj> arrayList2 = this.infoByClass;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        R6PlayerWeaponsObj r6PlayerWeaponsObj = this.infoDetail;
        return iHashCode2 + (r6PlayerWeaponsObj != null ? r6PlayerWeaponsObj.hashCode() : 0);
    }

    public final void setFilter(@e ArrayList<KeyDescObj> arrayList) {
        this.filter = arrayList;
    }

    public final void setInfoByClass(@e ArrayList<R6ContentWeaponObj> arrayList) {
        this.infoByClass = arrayList;
    }

    public final void setInfoDetail(@e R6PlayerWeaponsObj r6PlayerWeaponsObj) {
        this.infoDetail = r6PlayerWeaponsObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15302, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "R6PlayerAllWeaponsObj(filter=" + this.filter + ", infoByClass=" + this.infoByClass + ", infoDetail=" + this.infoDetail + ')';
    }
}
