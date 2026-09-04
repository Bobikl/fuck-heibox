package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: QueryPackageListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class QueryPackageListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> package_list;

    public QueryPackageListObj(@e List<String> list) {
        this.package_list = list;
    }

    public static /* synthetic */ QueryPackageListObj copy$default(QueryPackageListObj queryPackageListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{queryPackageListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14977, new Class[]{QueryPackageListObj.class, List.class, Integer.TYPE, Object.class}, QueryPackageListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (QueryPackageListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = queryPackageListObj.package_list;
        }
        return queryPackageListObj.copy(list);
    }

    @e
    public final List<String> component1() {
        return this.package_list;
    }

    @d
    public final QueryPackageListObj copy(@e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14976, new Class[]{List.class}, QueryPackageListObj.class);
        return patchProxyResultProxy.isSupported ? (QueryPackageListObj) patchProxyResultProxy.result : new QueryPackageListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14980, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof QueryPackageListObj) && f0.g(this.package_list, ((QueryPackageListObj) obj).package_list);
    }

    @e
    public final List<String> getPackage_list() {
        return this.package_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14979, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<String> list = this.package_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setPackage_list(@e List<String> list) {
        this.package_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14978, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "QueryPackageListObj(package_list=" + this.package_list + ')';
    }
}
