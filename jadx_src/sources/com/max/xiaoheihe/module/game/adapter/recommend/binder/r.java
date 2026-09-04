package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardListObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: RecommendGameViewHolderBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class r extends cb.c<GameRecommendBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86241f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f86242a = R.id.rb_0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f86243b = R.id.rb_1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final q0 f86244c = r0.a(e1.e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.l f86245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private RecyclerView f86246e;

    /* JADX INFO: compiled from: RecommendGameViewHolderBinder.kt */
    public static final class a implements com.max.hbcommon.analytics.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f86249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f86250e;

        a(GameRecommendBaseObj gameRecommendBaseObj, String str, int i10, String str2) {
            this.f86247b = gameRecommendBaseObj;
            this.f86248c = str;
            this.f86249d = i10;
            this.f86250e = str2;
        }

        @Override // com.max.hbcommon.analytics.g
        @dl.e
        public JsonObject getAdditional() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36150, new Class[0], JsonObject.class);
            if (patchProxyResultProxy.isSupported) {
                return (JsonObject) patchProxyResultProxy.result;
            }
            JsonObject jsonObject = new JsonObject();
            if (this.f86247b.getReport_additional() != null) {
                for (Map.Entry<String, JsonElement> entry : this.f86247b.getReport_additional().entrySet()) {
                    f0.o(entry, "data.report_additional.entrySet()");
                    jsonObject.add(entry.getKey(), entry.getValue());
                }
            }
            jsonObject.addProperty("appid", this.f86248c);
            jsonObject.addProperty("idx", Integer.valueOf(this.f86249d));
            if (com.max.hbcommon.utils.i.e(HeyBoxApplication.C())) {
                jsonObject.addProperty("net_mode", "wifi");
            } else {
                jsonObject.addProperty("net_mode", "cellular");
            }
            return jsonObject;
        }

        @Override // com.max.hbcommon.analytics.g
        @dl.e
        public String getPath() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36149, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f86247b.getReport_path();
        }
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GameRecommendBaseObj gameRecommendBaseObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameRecommendBaseObj}, this, changeQuickRedirect, false, 36148, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, gameRecommendBaseObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36142, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        g(viewHolder, data);
        if (com.max.xiaoheihe.utils.d.P0()) {
            h(viewHolder, data);
        }
    }

    public abstract void g(@dl.d com.max.hbcommon.base.adapter.s.e eVar, @dl.d GameRecommendBaseObj gameRecommendBaseObj);

    public void h(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36143, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
    }

    public final void i(@dl.d List<PathSrcNode> shownList, @dl.d RvVisiableRangeObj range, @dl.d GameRecommendBaseObj data) {
        int first;
        int last;
        GameCardV2Obj gameCardV2Obj;
        GameCardV2Obj gameCardV2Obj2;
        GameObj game;
        String h_src;
        GameCardV2Obj gameCardV2Obj3;
        GameObj game2;
        GameCardObj gameCardObj;
        GameCardObj gameCardObj2;
        RecommendGameListItemObj game3;
        String h_src2;
        GameCardObj gameCardObj3;
        RecommendGameListItemObj game4;
        int last2 = 0;
        if (PatchProxy.proxy(new Object[]{shownList, range, data}, this, changeQuickRedirect, false, 36145, new Class[]{List.class, RvVisiableRangeObj.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shownList, "shownList");
        f0.p(range, "range");
        f0.p(data, "data");
        if (range.getFirst() != -1 && range.getLast() != -1) {
            last2 = (range.getLast() - range.getFirst()) + 1;
        }
        if (last2 <= 0 || (first = range.getFirst()) > (last = range.getLast())) {
            return;
        }
        while (true) {
            PathSrcNode pathSrcNodeCopyToPathNode = data.copyToPathNode();
            f0.o(pathSrcNodeCopyToPathNode, "data.copyToPathNode()");
            String h_src3 = null;
            if (data instanceof GameCardListObj) {
                JsonObject addition = pathSrcNodeCopyToPathNode.getAddition();
                GameCardListObj gameCardListObj = (GameCardListObj) data;
                ArrayList<GameCardObj> games = gameCardListObj.getGames();
                addition.addProperty("app_id", (games == null || (gameCardObj3 = games.get(first)) == null || (game4 = gameCardObj3.getGame()) == null) ? null : game4.getAppid());
                JsonObject addition2 = pathSrcNodeCopyToPathNode.getAddition();
                ArrayList<GameCardObj> games2 = gameCardListObj.getGames();
                if (games2 == null || (gameCardObj2 = games2.get(first)) == null || (game3 = gameCardObj2.getGame()) == null || (h_src2 = game3.getH_src()) == null) {
                    ArrayList<GameCardObj> games3 = gameCardListObj.getGames();
                    if (games3 != null && (gameCardObj = games3.get(first)) != null) {
                        h_src3 = gameCardObj.getH_src();
                    }
                } else {
                    h_src3 = h_src2;
                }
                addition2.addProperty("h_src", h_src3);
            } else if (data instanceof GameCardListV2Obj) {
                JsonObject addition3 = pathSrcNodeCopyToPathNode.getAddition();
                GameCardListV2Obj gameCardListV2Obj = (GameCardListV2Obj) data;
                ArrayList<GameCardV2Obj> games4 = gameCardListV2Obj.getGames();
                addition3.addProperty("app_id", (games4 == null || (gameCardV2Obj3 = games4.get(first)) == null || (game2 = gameCardV2Obj3.getGame()) == null) ? null : game2.getAppid());
                JsonObject addition4 = pathSrcNodeCopyToPathNode.getAddition();
                ArrayList<GameCardV2Obj> games5 = gameCardListV2Obj.getGames();
                if (games5 == null || (gameCardV2Obj2 = games5.get(first)) == null || (game = gameCardV2Obj2.getGame()) == null || (h_src = game.getH_src()) == null) {
                    ArrayList<GameCardV2Obj> games6 = gameCardListV2Obj.getGames();
                    if (games6 != null && (gameCardV2Obj = games6.get(first)) != null) {
                        h_src3 = gameCardV2Obj.getH_src();
                    }
                } else {
                    h_src3 = h_src;
                }
                addition4.addProperty("h_src", h_src3);
            }
            pathSrcNodeCopyToPathNode.getAddition().addProperty("idx", Integer.valueOf(first));
            r(shownList, pathSrcNodeCopyToPathNode);
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    @dl.e
    public final com.max.hbcommon.base.adapter.l j() {
        return this.f86245d;
    }

    @dl.e
    public final RecyclerView k() {
        return this.f86246e;
    }

    public final int l() {
        return this.f86243b;
    }

    public final int m() {
        return this.f86242a;
    }

    @dl.d
    public final q0 n() {
        return this.f86244c;
    }

    public void o() {
    }

    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36144, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || data.isReported_exposure()) {
            return;
        }
        data.setReported_exposure(true);
        PathSrcNode node = data.copyToPathNode();
        f0.o(node, "node");
        r(shownList, node);
    }

    public void q() {
    }

    public final void r(@dl.d List<PathSrcNode> shownList, @dl.d PathSrcNode node) {
        if (PatchProxy.proxy(new Object[]{shownList, node}, this, changeQuickRedirect, false, 36146, new Class[]{List.class, PathSrcNode.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shownList, "shownList");
        f0.p(node, "node");
        if (shownList.contains(node)) {
            return;
        }
        shownList.add(node);
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("3");
        pageEventObj.setPath(node.getPath());
        JsonObject jsonObject = node.getAddition() != null ? (JsonObject) com.max.hbutils.utils.k.a(node.getAddition().toString(), JsonObject.class) : new JsonObject();
        if (com.max.hbcommon.utils.i.e(HeyBoxApplication.C())) {
            jsonObject.addProperty("net_mode", "wifi");
        } else {
            jsonObject.addProperty("net_mode", "cellular");
        }
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        com.max.hbcommon.utils.d.b("zzzzgamelibreport", "pageEventLog==" + com.max.hbutils.utils.k.p(pageEventObj));
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    public final void s(@dl.d View view, @dl.d GameRecommendBaseObj data, @dl.e String str, int i10, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{view, data, str, new Integer(i10), str2}, this, changeQuickRedirect, false, 36147, new Class[]{View.class, GameRecommendBaseObj.class, String.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        f0.p(data, "data");
        view.setTag(new a(data, str, i10, str2));
    }

    public final void t(@dl.e com.max.hbcommon.base.adapter.l lVar) {
        this.f86245d = lVar;
    }

    public final void u(@dl.e RecyclerView recyclerView) {
        this.f86246e = recyclerView;
    }
}
