package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameDuoListObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.max.xiaoheihe.module.game.component.RecommendGameView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardDuoVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86093i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f86095h;

    public c(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86094g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        int asInt;
        String str;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35952, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameDuoListObj) {
            if (this.f86095h == 0) {
                this.f86095h = (int) (((((ViewUtils.L(this.f86094g.b()) - ViewUtils.f(this.f86094g.b(), 36.0f)) / 2.0f) * 84) / 173.5f) + 0.5f);
            }
            GameDuoListObj gameDuoListObj = (GameDuoListObj) data;
            JsonElement jsonElement = gameDuoListObj.getReport_additional().get("idx");
            if (jsonElement != null) {
                asInt = jsonElement.getAsInt();
            } else {
                JsonElement jsonElement2 = gameDuoListObj.getReport_additional().get("gidx");
                asInt = jsonElement2 != null ? jsonElement2.getAsInt() : -1;
            }
            int i10 = asInt;
            ArrayList<RecommendGameListItemObj> games = gameDuoListObj.getGames();
            if (games != null) {
                boolean zG = f0.g(GameRecommendAdapter.f85964n, gameDuoListObj.getType());
                if (games.size() > 0) {
                    View viewI = viewHolder.i(R.id.vg_game_0);
                    f0.o(viewI, "viewHolder.getView(R.id.vg_game_0)");
                    ArrayList<RecommendGameListItemObj> games2 = gameDuoListObj.getGames();
                    RecommendGameListItemObj recommendGameListItemObj = games2 != null ? games2.get(0) : null;
                    f0.m(recommendGameListItemObj);
                    String appid = recommendGameListItemObj.getAppid();
                    int i11 = i10 * 2;
                    ArrayList<RecommendGameListItemObj> games3 = gameDuoListObj.getGames();
                    RecommendGameListItemObj recommendGameListItemObj2 = games3 != null ? games3.get(0) : null;
                    f0.m(recommendGameListItemObj2);
                    str = "null cannot be cast to non-null type com.max.xiaoheihe.module.game.component.RecommendGameView";
                    s(viewI, data, appid, i11, recommendGameListItemObj2.getGame_name());
                    View viewI2 = viewHolder.i(R.id.vg_game_0);
                    f0.n(viewI2, str);
                    RecommendGameListItemObj recommendGameListItemObj3 = games.get(0);
                    f0.o(recommendGameListItemObj3, "it[0]");
                    ((RecommendGameView) viewI2).h(recommendGameListItemObj3, this.f86095h, zG);
                } else {
                    str = "null cannot be cast to non-null type com.max.xiaoheihe.module.game.component.RecommendGameView";
                }
                if (games.size() > 1) {
                    View viewI3 = viewHolder.i(R.id.vg_game_1);
                    f0.o(viewI3, "viewHolder.getView(R.id.vg_game_1)");
                    ArrayList<RecommendGameListItemObj> games4 = gameDuoListObj.getGames();
                    RecommendGameListItemObj recommendGameListItemObj4 = games4 != null ? games4.get(1) : null;
                    f0.m(recommendGameListItemObj4);
                    String appid2 = recommendGameListItemObj4.getAppid();
                    int i12 = (i10 * 2) + 1;
                    ArrayList<RecommendGameListItemObj> games5 = gameDuoListObj.getGames();
                    RecommendGameListItemObj recommendGameListItemObj5 = games5 != null ? games5.get(1) : null;
                    f0.m(recommendGameListItemObj5);
                    s(viewI3, data, appid2, i12, recommendGameListItemObj5.getGame_name());
                    View viewI4 = viewHolder.i(R.id.vg_game_1);
                    f0.n(viewI4, str);
                    RecommendGameListItemObj recommendGameListItemObj6 = games.get(1);
                    f0.o(recommendGameListItemObj6, "it[1]");
                    ((RecommendGameView) viewI4).h(recommendGameListItemObj6, this.f86095h, zG);
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        RecommendGameListItemObj recommendGameListItemObj;
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 35953, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof GameDuoListObj)) {
            return;
        }
        GameDuoListObj gameDuoListObj = (GameDuoListObj) data;
        if (com.max.hbcommon.utils.c.w(gameDuoListObj.getGames())) {
            return;
        }
        ArrayList<RecommendGameListItemObj> games = gameDuoListObj.getGames();
        f0.m(games);
        int size = games.size();
        for (int i10 = 0; i10 < size; i10++) {
            PathSrcNode node = data.copyToPathNode();
            JsonObject addition = node.getAddition();
            ArrayList<RecommendGameListItemObj> games2 = gameDuoListObj.getGames();
            String h_src = null;
            RecommendGameListItemObj recommendGameListItemObj2 = games2 != null ? games2.get(i10) : null;
            f0.m(recommendGameListItemObj2);
            addition.addProperty("app_id", recommendGameListItemObj2.getAppid());
            JsonElement jsonElement = node.getAddition().get("idx");
            Integer numValueOf = (jsonElement == null && (jsonElement = node.getAddition().get("gidx")) == null) ? null : Integer.valueOf(jsonElement.getAsInt());
            if (numValueOf != null) {
                node.getAddition().addProperty("idx", Integer.valueOf((numValueOf.intValue() * 2) + i10));
            }
            JsonObject addition2 = node.getAddition();
            ArrayList<RecommendGameListItemObj> games3 = gameDuoListObj.getGames();
            if (games3 != null && (recommendGameListItemObj = games3.get(i10)) != null) {
                h_src = recommendGameListItemObj.getH_src();
            }
            addition2.addProperty("h_src", h_src);
            if (!shownList.contains(node)) {
                f0.o(node, "node");
                shownList.add(node);
                PageEventObj pageEventObj = new PageEventObj();
                pageEventObj.setType("3");
                pageEventObj.setPath(node.getPath());
                pageEventObj.setAddition(node.getAddition());
                pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
                com.max.hbcommon.utils.d.b("zzzzgamelibreport", "pageEventLog==" + com.max.hbutils.utils.k.p(pageEventObj));
                com.max.hbcommon.analytics.d.c(pageEventObj, true);
            }
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86094g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35951, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86094g = recommendVHBParam;
    }
}
