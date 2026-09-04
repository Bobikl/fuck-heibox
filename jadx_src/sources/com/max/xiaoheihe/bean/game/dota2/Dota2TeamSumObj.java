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

/* JADX INFO: compiled from: Dota2TeamSumObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2TeamSumObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<Dota2ChartObj> graph_gold;

    public Dota2TeamSumObj(@e List<Dota2ChartObj> list) {
        this.graph_gold = list;
    }

    public static /* synthetic */ Dota2TeamSumObj copy$default(Dota2TeamSumObj dota2TeamSumObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2TeamSumObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15107, new Class[]{Dota2TeamSumObj.class, List.class, Integer.TYPE, Object.class}, Dota2TeamSumObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2TeamSumObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = dota2TeamSumObj.graph_gold;
        }
        return dota2TeamSumObj.copy(list);
    }

    @e
    public final List<Dota2ChartObj> component1() {
        return this.graph_gold;
    }

    @d
    public final Dota2TeamSumObj copy(@e List<Dota2ChartObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15106, new Class[]{List.class}, Dota2TeamSumObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2TeamSumObj) patchProxyResultProxy.result : new Dota2TeamSumObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15110, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dota2TeamSumObj) && f0.g(this.graph_gold, ((Dota2TeamSumObj) obj).graph_gold);
    }

    @e
    public final List<Dota2ChartObj> getGraph_gold() {
        return this.graph_gold;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15109, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<Dota2ChartObj> list = this.graph_gold;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setGraph_gold(@e List<Dota2ChartObj> list) {
        this.graph_gold = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15108, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2TeamSumObj(graph_gold=" + this.graph_gold + ')';
    }
}
