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

/* JADX INFO: compiled from: R6PlayerMapsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6PlayerMapsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<R6PlayerMapDataObj> all;

    @e
    private List<R6PlayerMapDataObj> attacker;

    @e
    private List<R6PlayerMapDataObj> defender;

    public R6PlayerMapsObj(@e List<R6PlayerMapDataObj> list, @e List<R6PlayerMapDataObj> list2, @e List<R6PlayerMapDataObj> list3) {
        this.all = list;
        this.attacker = list2;
        this.defender = list3;
    }

    public static /* synthetic */ R6PlayerMapsObj copy$default(R6PlayerMapsObj r6PlayerMapsObj, List list, List list2, List list3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r6PlayerMapsObj, list, list2, list3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15311, new Class[]{R6PlayerMapsObj.class, List.class, List.class, List.class, Integer.TYPE, Object.class}, R6PlayerMapsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6PlayerMapsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = r6PlayerMapsObj.all;
        }
        if ((i10 & 2) != 0) {
            list2 = r6PlayerMapsObj.attacker;
        }
        if ((i10 & 4) != 0) {
            list3 = r6PlayerMapsObj.defender;
        }
        return r6PlayerMapsObj.copy(list, list2, list3);
    }

    @e
    public final List<R6PlayerMapDataObj> component1() {
        return this.all;
    }

    @e
    public final List<R6PlayerMapDataObj> component2() {
        return this.attacker;
    }

    @e
    public final List<R6PlayerMapDataObj> component3() {
        return this.defender;
    }

    @d
    public final R6PlayerMapsObj copy(@e List<R6PlayerMapDataObj> list, @e List<R6PlayerMapDataObj> list2, @e List<R6PlayerMapDataObj> list3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2, list3}, this, changeQuickRedirect, false, 15310, new Class[]{List.class, List.class, List.class}, R6PlayerMapsObj.class);
        return patchProxyResultProxy.isSupported ? (R6PlayerMapsObj) patchProxyResultProxy.result : new R6PlayerMapsObj(list, list2, list3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15314, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6PlayerMapsObj)) {
            return false;
        }
        R6PlayerMapsObj r6PlayerMapsObj = (R6PlayerMapsObj) obj;
        return f0.g(this.all, r6PlayerMapsObj.all) && f0.g(this.attacker, r6PlayerMapsObj.attacker) && f0.g(this.defender, r6PlayerMapsObj.defender);
    }

    @e
    public final List<R6PlayerMapDataObj> getAll() {
        return this.all;
    }

    @e
    public final List<R6PlayerMapDataObj> getAttacker() {
        return this.attacker;
    }

    @e
    public final List<R6PlayerMapDataObj> getDefender() {
        return this.defender;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15313, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<R6PlayerMapDataObj> list = this.all;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<R6PlayerMapDataObj> list2 = this.attacker;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<R6PlayerMapDataObj> list3 = this.defender;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setAll(@e List<R6PlayerMapDataObj> list) {
        this.all = list;
    }

    public final void setAttacker(@e List<R6PlayerMapDataObj> list) {
        this.attacker = list;
    }

    public final void setDefender(@e List<R6PlayerMapDataObj> list) {
        this.defender = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15312, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "R6PlayerMapsObj(all=" + this.all + ", attacker=" + this.attacker + ", defender=" + this.defender + ')';
    }
}
