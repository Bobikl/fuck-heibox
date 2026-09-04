package com.max.xiaoheihe.bean.bbs.post_edit;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendTopicObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendedTopicItems {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final List<RecommendedTopicObj> items;

    public RecommendedTopicItems(@e List<RecommendedTopicObj> list) {
        this.items = list;
    }

    public static /* synthetic */ RecommendedTopicItems copy$default(RecommendedTopicItems recommendedTopicItems, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicItems, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14557, new Class[]{RecommendedTopicItems.class, List.class, Integer.TYPE, Object.class}, RecommendedTopicItems.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendedTopicItems) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = recommendedTopicItems.items;
        }
        return recommendedTopicItems.copy(list);
    }

    @e
    public final List<RecommendedTopicObj> component1() {
        return this.items;
    }

    @d
    public final RecommendedTopicItems copy(@e List<RecommendedTopicObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14556, new Class[]{List.class}, RecommendedTopicItems.class);
        return patchProxyResultProxy.isSupported ? (RecommendedTopicItems) patchProxyResultProxy.result : new RecommendedTopicItems(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14560, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendedTopicItems) && f0.g(this.items, ((RecommendedTopicItems) obj).items);
    }

    @e
    public final List<RecommendedTopicObj> getItems() {
        return this.items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14559, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<RecommendedTopicObj> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14558, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendedTopicItems(items=" + this.items + ')';
    }
}
