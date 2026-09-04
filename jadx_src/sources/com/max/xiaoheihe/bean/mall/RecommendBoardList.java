package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendBoardList.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendBoardList implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<RecommendBoardItem> items;

    public RecommendBoardList(@e List<RecommendBoardItem> list) {
        this.items = list;
    }

    public static /* synthetic */ RecommendBoardList copy$default(RecommendBoardList recommendBoardList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendBoardList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15559, new Class[]{RecommendBoardList.class, List.class, Integer.TYPE, Object.class}, RecommendBoardList.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendBoardList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = recommendBoardList.items;
        }
        return recommendBoardList.copy(list);
    }

    @e
    public final List<RecommendBoardItem> component1() {
        return this.items;
    }

    @d
    public final RecommendBoardList copy(@e List<RecommendBoardItem> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15558, new Class[]{List.class}, RecommendBoardList.class);
        return patchProxyResultProxy.isSupported ? (RecommendBoardList) patchProxyResultProxy.result : new RecommendBoardList(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15562, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendBoardList) && f0.g(this.items, ((RecommendBoardList) obj).items);
    }

    @e
    public final List<RecommendBoardItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15561, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<RecommendBoardItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setItems(@e List<RecommendBoardItem> list) {
        this.items = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15560, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendBoardList(items=" + this.items + ')';
    }
}
