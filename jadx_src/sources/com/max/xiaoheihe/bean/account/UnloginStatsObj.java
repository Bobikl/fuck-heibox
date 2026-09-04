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

/* JADX INFO: compiled from: UnloginStatsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UnloginStatsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final ArrayList<String> stats_orders;

    @e
    private final String store_desc;

    @e
    private final String task_desc;

    public UnloginStatsObj(@e String str, @e String str2, @e ArrayList<String> arrayList) {
        this.store_desc = str;
        this.task_desc = str2;
        this.stats_orders = arrayList;
    }

    public static /* synthetic */ UnloginStatsObj copy$default(UnloginStatsObj unloginStatsObj, String str, String str2, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{unloginStatsObj, str, str2, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 13998, new Class[]{UnloginStatsObj.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, UnloginStatsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UnloginStatsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = unloginStatsObj.store_desc;
        }
        if ((i10 & 2) != 0) {
            str2 = unloginStatsObj.task_desc;
        }
        if ((i10 & 4) != 0) {
            arrayList = unloginStatsObj.stats_orders;
        }
        return unloginStatsObj.copy(str, str2, arrayList);
    }

    @e
    public final String component1() {
        return this.store_desc;
    }

    @e
    public final String component2() {
        return this.task_desc;
    }

    @e
    public final ArrayList<String> component3() {
        return this.stats_orders;
    }

    @d
    public final UnloginStatsObj copy(@e String str, @e String str2, @e ArrayList<String> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, arrayList}, this, changeQuickRedirect, false, 13997, new Class[]{String.class, String.class, ArrayList.class}, UnloginStatsObj.class);
        return patchProxyResultProxy.isSupported ? (UnloginStatsObj) patchProxyResultProxy.result : new UnloginStatsObj(str, str2, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14001, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnloginStatsObj)) {
            return false;
        }
        UnloginStatsObj unloginStatsObj = (UnloginStatsObj) obj;
        return f0.g(this.store_desc, unloginStatsObj.store_desc) && f0.g(this.task_desc, unloginStatsObj.task_desc) && f0.g(this.stats_orders, unloginStatsObj.stats_orders);
    }

    @e
    public final ArrayList<String> getStats_orders() {
        return this.stats_orders;
    }

    @e
    public final String getStore_desc() {
        return this.store_desc;
    }

    @e
    public final String getTask_desc() {
        return this.task_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14000, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.store_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.task_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<String> arrayList = this.stats_orders;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13999, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UnloginStatsObj(store_desc=" + this.store_desc + ", task_desc=" + this.task_desc + ", stats_orders=" + this.stats_orders + ')';
    }
}
