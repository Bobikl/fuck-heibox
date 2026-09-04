package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchMallListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchMallListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<? extends MallProductObj> mall_list;

    @e
    private String more_prot;

    public SearchMallListObj(@e String str, @e List<? extends MallProductObj> list) {
        this.more_prot = str;
        this.mall_list = list;
    }

    public static /* synthetic */ SearchMallListObj copy$default(SearchMallListObj searchMallListObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchMallListObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15868, new Class[]{SearchMallListObj.class, String.class, List.class, Integer.TYPE, Object.class}, SearchMallListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchMallListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = searchMallListObj.more_prot;
        }
        if ((i10 & 2) != 0) {
            list = searchMallListObj.mall_list;
        }
        return searchMallListObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.more_prot;
    }

    @e
    public final List<MallProductObj> component2() {
        return this.mall_list;
    }

    @d
    public final SearchMallListObj copy(@e String str, @e List<? extends MallProductObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 15867, new Class[]{String.class, List.class}, SearchMallListObj.class);
        return patchProxyResultProxy.isSupported ? (SearchMallListObj) patchProxyResultProxy.result : new SearchMallListObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15871, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMallListObj)) {
            return false;
        }
        SearchMallListObj searchMallListObj = (SearchMallListObj) obj;
        return f0.g(this.more_prot, searchMallListObj.more_prot) && f0.g(this.mall_list, searchMallListObj.mall_list);
    }

    @e
    public final List<MallProductObj> getMall_list() {
        return this.mall_list;
    }

    @e
    public final String getMore_prot() {
        return this.more_prot;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15870, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.more_prot;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends MallProductObj> list = this.mall_list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setMall_list(@e List<? extends MallProductObj> list) {
        this.mall_list = list;
    }

    public final void setMore_prot(@e String str) {
        this.more_prot = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15869, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchMallListObj(more_prot=" + this.more_prot + ", mall_list=" + this.mall_list + ')';
    }
}
