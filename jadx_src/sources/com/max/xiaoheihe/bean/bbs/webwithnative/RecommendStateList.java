package com.max.xiaoheihe.bean.bbs.webwithnative;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendStateList.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendStateList implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<RecommendStateObj> state_list;

    public RecommendStateList(@e List<RecommendStateObj> list) {
        this.state_list = list;
    }

    public static /* synthetic */ RecommendStateList copy$default(RecommendStateList recommendStateList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendStateList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14571, new Class[]{RecommendStateList.class, List.class, Integer.TYPE, Object.class}, RecommendStateList.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendStateList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = recommendStateList.state_list;
        }
        return recommendStateList.copy(list);
    }

    @e
    public final List<RecommendStateObj> component1() {
        return this.state_list;
    }

    @d
    public final RecommendStateList copy(@e List<RecommendStateObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14570, new Class[]{List.class}, RecommendStateList.class);
        return patchProxyResultProxy.isSupported ? (RecommendStateList) patchProxyResultProxy.result : new RecommendStateList(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14574, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendStateList) && f0.g(this.state_list, ((RecommendStateList) obj).state_list);
    }

    @e
    public final List<RecommendStateObj> getState_list() {
        return this.state_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14573, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<RecommendStateObj> list = this.state_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setState_list(@e List<RecommendStateObj> list) {
        this.state_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14572, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendStateList(state_list=" + this.state_list + ')';
    }
}
