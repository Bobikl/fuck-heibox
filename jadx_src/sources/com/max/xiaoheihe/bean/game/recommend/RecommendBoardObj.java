package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.recommend.GeneralGameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendBoardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendBoardObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private RecommendBoardItem item;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    @d
    public PathSrcNode copyToPathNode() {
        GeneralGameObj game;
        GeneralGameObj game2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15407, new Class[0], PathSrcNode.class);
        if (patchProxyResultProxy.isSupported) {
            return (PathSrcNode) patchProxyResultProxy.result;
        }
        PathSrcNode node = super.copyToPathNode();
        JsonObject addition = node.getAddition();
        RecommendBoardItem recommendBoardItem = this.item;
        String h_src = null;
        addition.addProperty("app_id", (recommendBoardItem == null || (game2 = recommendBoardItem.getGame()) == null) ? null : game2.getAppid());
        JsonObject addition2 = node.getAddition();
        RecommendBoardItem recommendBoardItem2 = this.item;
        if (recommendBoardItem2 != null && (game = recommendBoardItem2.getGame()) != null) {
            h_src = game.getH_src();
        }
        addition2.addProperty("h_src", h_src);
        f0.o(node, "node");
        return node;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15408, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendBoardObj) && super.equals(obj) && f0.g(this.item, ((RecommendBoardObj) obj).item);
    }

    @e
    public final RecommendBoardItem getItem() {
        return this.item;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15409, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        RecommendBoardItem recommendBoardItem = this.item;
        if (recommendBoardItem != null) {
            return recommendBoardItem.hashCode();
        }
        return 0;
    }

    public final void setItem(@e RecommendBoardItem recommendBoardItem) {
        this.item = recommendBoardItem;
    }
}
