package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameBundlesListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameBundlesListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameBundleObj> bundles;

    @e
    private List<FilterGroup> filters;

    @e
    private ArrayList<KeyDescObj> sort_type;

    public GameBundlesListObj(@e List<GameBundleObj> list, @e List<FilterGroup> list2, @e ArrayList<KeyDescObj> arrayList) {
        this.bundles = list;
        this.filters = list2;
        this.sort_type = arrayList;
    }

    public static /* synthetic */ GameBundlesListObj copy$default(GameBundlesListObj gameBundlesListObj, List list, List list2, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameBundlesListObj, list, list2, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14688, new Class[]{GameBundlesListObj.class, List.class, List.class, ArrayList.class, Integer.TYPE, Object.class}, GameBundlesListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameBundlesListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = gameBundlesListObj.bundles;
        }
        if ((i10 & 2) != 0) {
            list2 = gameBundlesListObj.filters;
        }
        if ((i10 & 4) != 0) {
            arrayList = gameBundlesListObj.sort_type;
        }
        return gameBundlesListObj.copy(list, list2, arrayList);
    }

    @e
    public final List<GameBundleObj> component1() {
        return this.bundles;
    }

    @e
    public final List<FilterGroup> component2() {
        return this.filters;
    }

    @e
    public final ArrayList<KeyDescObj> component3() {
        return this.sort_type;
    }

    @d
    public final GameBundlesListObj copy(@e List<GameBundleObj> list, @e List<FilterGroup> list2, @e ArrayList<KeyDescObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2, arrayList}, this, changeQuickRedirect, false, 14687, new Class[]{List.class, List.class, ArrayList.class}, GameBundlesListObj.class);
        return patchProxyResultProxy.isSupported ? (GameBundlesListObj) patchProxyResultProxy.result : new GameBundlesListObj(list, list2, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14691, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameBundlesListObj)) {
            return false;
        }
        GameBundlesListObj gameBundlesListObj = (GameBundlesListObj) obj;
        return f0.g(this.bundles, gameBundlesListObj.bundles) && f0.g(this.filters, gameBundlesListObj.filters) && f0.g(this.sort_type, gameBundlesListObj.sort_type);
    }

    @e
    public final List<GameBundleObj> getBundles() {
        return this.bundles;
    }

    @e
    public final List<FilterGroup> getFilters() {
        return this.filters;
    }

    @e
    public final ArrayList<KeyDescObj> getSort_type() {
        return this.sort_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14690, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameBundleObj> list = this.bundles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FilterGroup> list2 = this.filters;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList = this.sort_type;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setBundles(@e List<GameBundleObj> list) {
        this.bundles = list;
    }

    public final void setFilters(@e List<FilterGroup> list) {
        this.filters = list;
    }

    public final void setSort_type(@e ArrayList<KeyDescObj> arrayList) {
        this.sort_type = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14689, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameBundlesListObj(bundles=" + this.bundles + ", filters=" + this.filters + ", sort_type=" + this.sort_type + ')';
    }
}
