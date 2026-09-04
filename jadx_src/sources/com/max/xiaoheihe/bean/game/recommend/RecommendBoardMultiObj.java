package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendBoardMultiObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendBoardMultiObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<RecommendBoardItem> items;

    public RecommendBoardMultiObj(@e List<RecommendBoardItem> list) {
        this.items = list;
    }

    public static /* synthetic */ RecommendBoardMultiObj copy$default(RecommendBoardMultiObj recommendBoardMultiObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendBoardMultiObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15405, new Class[]{RecommendBoardMultiObj.class, List.class, Integer.TYPE, Object.class}, RecommendBoardMultiObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendBoardMultiObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = recommendBoardMultiObj.items;
        }
        return recommendBoardMultiObj.copy(list);
    }

    @e
    public final List<RecommendBoardItem> component1() {
        return this.items;
    }

    @d
    public final RecommendBoardMultiObj copy(@e List<RecommendBoardItem> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15404, new Class[]{List.class}, RecommendBoardMultiObj.class);
        return patchProxyResultProxy.isSupported ? (RecommendBoardMultiObj) patchProxyResultProxy.result : new RecommendBoardMultiObj(list);
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15402, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendBoardMultiObj) && f0.g(this.items, ((RecommendBoardMultiObj) obj).items);
    }

    @e
    public final List<RecommendBoardItem> getItems() {
        return this.items;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15403, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<RecommendBoardItem> list = this.items;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final void setItems(@e List<RecommendBoardItem> list) {
        this.items = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15406, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendBoardMultiObj(items=" + this.items + ')';
    }
}
