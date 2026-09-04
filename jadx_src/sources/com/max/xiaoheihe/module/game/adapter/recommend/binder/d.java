package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameListObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardSingleVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86096h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86097g;

    public d(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86097g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35955, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        aVar.q("GameCardSingleVHB, contentBinding " + viewHolder);
        if (data instanceof GameListObj) {
            GameItemView gameItemView = (GameItemView) viewHolder.i(R.id.giv);
            List<GameObj> games = ((GameListObj) data).getGames();
            if (games == null || !(true ^ games.isEmpty())) {
                return;
            }
            aVar.q("GameCardSingleVHB, contentBinding " + games.get(0).getName());
            gameItemView.g(games.get(0), null, null, true, null, viewHolder);
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 35956, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (data instanceof GameListObj) {
            GameListObj gameListObj = (GameListObj) data;
            if (com.max.hbcommon.utils.c.u(gameListObj.getReport_path()) || gameListObj.isReported_exposure()) {
                return;
            }
            gameListObj.setReported_exposure(true);
            List<GameObj> games = gameListObj.getGames();
            if (games == null || !(!games.isEmpty())) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("GameCardSingleVHB, onItemViewExposure " + games.get(0).getName());
            GameObj gameObj = games.get(0);
            if (gameObj.isReported_exposure()) {
                return;
            }
            gameObj.setReported_exposure(true);
            PathSrcNode node = data.copyToPathNode();
            JsonObject addition = node.getAddition();
            if (addition != null) {
                addition.addProperty("app_id", gameObj.getAppid());
            }
            JsonObject addition2 = node.getAddition();
            if (addition2 != null) {
                addition2.addProperty("h_src", gameObj.getH_src());
            }
            ArrayList arrayList = new ArrayList();
            f0.o(node, "node");
            r(arrayList, node);
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86097g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35954, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86097g = recommendVHBParam;
    }
}
