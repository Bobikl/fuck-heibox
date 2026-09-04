package com.max.xiaoheihe.bean.dynamicso;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DynamicList.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class DynamicList implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<DynamicSoInfoObj> so_list;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DynamicList(@e List<DynamicSoInfoObj> list) {
        this.so_list = list;
    }

    public /* synthetic */ DynamicList(List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list);
    }

    public static /* synthetic */ DynamicList copy$default(DynamicList dynamicList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dynamicList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14610, new Class[]{DynamicList.class, List.class, Integer.TYPE, Object.class}, DynamicList.class);
        if (patchProxyResultProxy.isSupported) {
            return (DynamicList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = dynamicList.so_list;
        }
        return dynamicList.copy(list);
    }

    @e
    public final List<DynamicSoInfoObj> component1() {
        return this.so_list;
    }

    @d
    public final DynamicList copy(@e List<DynamicSoInfoObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14609, new Class[]{List.class}, DynamicList.class);
        return patchProxyResultProxy.isSupported ? (DynamicList) patchProxyResultProxy.result : new DynamicList(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14613, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicList) && f0.g(this.so_list, ((DynamicList) obj).so_list);
    }

    @e
    public final List<DynamicSoInfoObj> getSo_list() {
        return this.so_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14612, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<DynamicSoInfoObj> list = this.so_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setSo_list(@e List<DynamicSoInfoObj> list) {
        this.so_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14611, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DynamicList(so_list=" + this.so_list + ')';
    }
}
