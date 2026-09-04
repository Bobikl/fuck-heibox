package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2UnitObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2UnitObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> backpack;

    @e
    private String desc;

    @e
    private List<String> items;

    @e
    private String neutral;

    public Dota2UnitObj(@e String str, @e List<String> list, @e List<String> list2, @e String str2) {
        this.desc = str;
        this.items = list;
        this.backpack = list2;
        this.neutral = str2;
    }

    public static /* synthetic */ Dota2UnitObj copy$default(Dota2UnitObj dota2UnitObj, String str, List list, List list2, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2UnitObj, str, list, list2, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15117, new Class[]{Dota2UnitObj.class, String.class, List.class, List.class, String.class, Integer.TYPE, Object.class}, Dota2UnitObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2UnitObj) patchProxyResultProxy.result;
        }
        return dota2UnitObj.copy((i10 & 1) != 0 ? dota2UnitObj.desc : str, (i10 & 2) != 0 ? dota2UnitObj.items : list, (i10 & 4) != 0 ? dota2UnitObj.backpack : list2, (i10 & 8) != 0 ? dota2UnitObj.neutral : str2);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final List<String> component2() {
        return this.items;
    }

    @e
    public final List<String> component3() {
        return this.backpack;
    }

    @e
    public final String component4() {
        return this.neutral;
    }

    @d
    public final Dota2UnitObj copy(@e String str, @e List<String> list, @e List<String> list2, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, list2, str2}, this, changeQuickRedirect, false, 15116, new Class[]{String.class, List.class, List.class, String.class}, Dota2UnitObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2UnitObj) patchProxyResultProxy.result : new Dota2UnitObj(str, list, list2, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15120, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2UnitObj)) {
            return false;
        }
        Dota2UnitObj dota2UnitObj = (Dota2UnitObj) obj;
        return f0.g(this.desc, dota2UnitObj.desc) && f0.g(this.items, dota2UnitObj.items) && f0.g(this.backpack, dota2UnitObj.backpack) && f0.g(this.neutral, dota2UnitObj.neutral);
    }

    @e
    public final List<String> getBackpack() {
        return this.backpack;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final List<String> getItems() {
        return this.items;
    }

    @e
    public final String getNeutral() {
        return this.neutral;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15119, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.backpack;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.neutral;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBackpack(@e List<String> list) {
        this.backpack = list;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setItems(@e List<String> list) {
        this.items = list;
    }

    public final void setNeutral(@e String str) {
        this.neutral = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15118, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2UnitObj(desc=" + this.desc + ", items=" + this.items + ", backpack=" + this.backpack + ", neutral=" + this.neutral + ')';
    }
}
