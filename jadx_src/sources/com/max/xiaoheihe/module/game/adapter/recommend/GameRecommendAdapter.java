package com.max.xiaoheihe.module.game.adapter.recommend;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.g;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameListObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.MiniProgramListObj;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendVHBParam;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import xh.m;

/* JADX INFO: compiled from: GameRecommendAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameRecommendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRecommendAdapter.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/GameRecommendAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n288#2,2:352\n288#2,2:354\n1864#2,3:356\n*S KotlinDebug\n*F\n+ 1 GameRecommendAdapter.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/GameRecommendAdapter\n*L\n168#1:352,2\n170#1:354,2\n186#1:356,3\n*E\n"})
@o(parameters = 0)
public final class GameRecommendAdapter extends u<GameRecommendBaseObj> {

    @dl.d
    public static final String A = "factory_list";

    @dl.d
    public static final String B = "game_card_single_with_tab";

    @dl.d
    public static final String C = "middle_game_card_video";

    @dl.d
    public static final String D = "rec_goods";

    @dl.d
    public static final String E = "mall_newcomer";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final Companion f85954d = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f85955e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f85956f = "title";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f85957g = "header";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f85958h = "menu";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f85959i = "menu_v2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f85960j = "mini_app";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f85961k = "mini_app_v2";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f85962l = "space";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f85963m = "game_card_duo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f85964n = "game_card_duo_release_date";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f85965o = "game_card_single";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f85966p = "big_game_card";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f85967q = "middle_game_card";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f85968r = "big_game_card_scroll";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f85969s = "big_game_card_scroll_v2";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f85970t = "big_game_series_card_scroll";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f85971u = "middle_game_scroll";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f85972v = "game_card_scroll";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f85973w = "game_list_rectangle";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f85974x = "game_list_square";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f85975y = "game_comment";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f85976z = "game_comment_multi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a f85978c;

    /* JADX INFO: compiled from: GameRecommendAdapter.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @m
        public final GameListObj a(@dl.d GameRecommendBaseObj obj, @dl.d GameObj game, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, game, new Integer(i10)}, this, changeQuickRedirect, false, 35875, new Class[]{GameRecommendBaseObj.class, GameObj.class, Integer.TYPE}, GameListObj.class);
            if (patchProxyResultProxy.isSupported) {
                return (GameListObj) patchProxyResultProxy.result;
            }
            f0.p(obj, "obj");
            f0.p(game, "game");
            GameListObj gameListObj = new GameListObj();
            gameListObj.setType(GameRecommendAdapter.f85965o);
            gameListObj.setGames(new ArrayList());
            List<GameObj> games = gameListObj.getGames();
            f0.m(games);
            games.add(game);
            if (obj.getReport_additional() != null) {
                gameListObj.setReport_additional(obj.getReport_additional().deepCopy());
            } else {
                gameListObj.setReport_additional(new JsonObject());
            }
            gameListObj.getReport_additional().addProperty("idx", Integer.valueOf(i10));
            gameListObj.getReport_additional().addProperty("app_id", game.getAppid());
            gameListObj.setReport_path(obj.getReport_path());
            return gameListObj;
        }

        @dl.e
        @m
        public final Object b(@dl.d Context context, @dl.d List<GameRecommendBaseObj> list, @dl.d kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, list, cVar}, this, changeQuickRedirect, false, 35874, new Class[]{Context.class, List.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i.h(e1.a(), new GameRecommendAdapter$Companion$handleGameListData$2(list, null), cVar);
        }
    }

    /* JADX INFO: compiled from: GameRecommendAdapter.kt */
    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameRecommendAdapter(@dl.d Context mContext, @dl.d List<GameRecommendBaseObj> list, @dl.d a mIGameRecommendListener) {
        super(mContext, list);
        f0.p(mContext, "mContext");
        f0.p(list, "list");
        f0.p(mIGameRecommendListener, "mIGameRecommendListener");
        this.f85977b = mContext;
        this.f85978c = mIGameRecommendListener;
    }

    @dl.d
    @m
    public static final GameListObj n(@dl.d GameRecommendBaseObj gameRecommendBaseObj, @dl.d GameObj gameObj, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRecommendBaseObj, gameObj, new Integer(i10)}, null, changeQuickRedirect, true, 35870, new Class[]{GameRecommendBaseObj.class, GameObj.class, Integer.TYPE}, GameListObj.class);
        return patchProxyResultProxy.isSupported ? (GameListObj) patchProxyResultProxy.result : f85954d.a(gameRecommendBaseObj, gameObj, i10);
    }

    @dl.e
    @m
    public static final Object u(@dl.d Context context, @dl.d List<GameRecommendBaseObj> list, @dl.d kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, list, cVar}, null, changeQuickRedirect, true, 35869, new Class[]{Context.class, List.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : f85954d.b(context, list, cVar);
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, GameRecommendBaseObj gameRecommendBaseObj) {
        Object[] objArr = {new Integer(i10), gameRecommendBaseObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35873, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : q(i10, gameRecommendBaseObj);
    }

    public final void o(@dl.d s.e viewHolder, @dl.e GameRecommendBaseObj gameRecommendBaseObj, @dl.d List<PathSrcNode> mShownList) {
        if (PatchProxy.proxy(new Object[]{viewHolder, gameRecommendBaseObj, mShownList}, this, changeQuickRedirect, false, 35865, new Class[]{s.e.class, GameRecommendBaseObj.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(mShownList, "mShownList");
        if (gameRecommendBaseObj != null) {
            Object objH = viewHolder.h(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()));
            if (objH instanceof r) {
                View view = viewHolder.itemView;
                f0.o(view, "viewHolder.itemView");
                ((r) objH).p(view, mShownList, gameRecommendBaseObj);
            }
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 35871, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        v(eVar, (GameRecommendBaseObj) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, 35872, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        w((s.e) viewHolder);
    }

    public final int p(@dl.e GameRecommendBaseObj gameRecommendBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRecommendBaseObj}, this, changeQuickRedirect, false, 35868, new Class[]{GameRecommendBaseObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int size = this.mDataList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f0.g(gameRecommendBaseObj, this.mDataList.get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public int q(int i10, @dl.e GameRecommendBaseObj gameRecommendBaseObj) {
        Object[] objArr = {new Integer(i10), gameRecommendBaseObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35866, new Class[]{cls, GameRecommendBaseObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return r(gameRecommendBaseObj != null ? gameRecommendBaseObj.getType() : null);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ff A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0160 A[RETURN, SYNTHETIC] */
    public final int r(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35867, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return R.layout.layout_space;
        }
        switch (str.hashCode()) {
            case -2004202929:
                return !str.equals(C) ? R.layout.layout_space : R.layout.item_recommend_game_video_card;
            case -1880535373:
                return !str.equals(A) ? R.layout.layout_space : R.layout.item_recyclerview_factory_list;
            case -1819023123:
                return !str.equals(f85969s) ? R.layout.layout_space : R.layout.item_big_game_card_scroll_v2;
            case -1404215812:
                if (str.equals(f85963m)) {
                    return R.layout.item_game_recommend_1x2;
                }
                return R.layout.layout_space;
            case -1359492551:
                return !str.equals("mini_app") ? R.layout.layout_space : R.layout.item_miniprogram_container;
            case -1354478055:
                return !str.equals(E) ? R.layout.layout_space : R.layout.item_recommend_newcomer_card;
            case -1261964852:
                return !str.equals(f85976z) ? R.layout.layout_space : R.layout.item_recommend_board_multi_container;
            case -1221270899:
                return !str.equals("header") ? R.layout.layout_space : R.layout.item_triple_banner;
            case -895758574:
                return !str.equals("game_comment") ? R.layout.layout_space : R.layout.item_recommend_board;
            case -648178255:
                return !str.equals(B) ? R.layout.layout_space : R.layout.item_recommend_game_list_tab;
            case -571200773:
                if (str.equals(f85973w)) {
                    return R.layout.item_recommend_game_ablum;
                }
                return R.layout.layout_space;
            case 3347807:
                return !str.equals(f85958h) ? R.layout.layout_space : R.layout.item_menu_container;
            case 109637894:
                str.equals("space");
                return R.layout.layout_space;
            case 110371416:
                return !str.equals("title") ? R.layout.layout_space : R.layout.item_list_section_header;
            case 157132561:
                if (str.equals(f85974x)) {
                    return R.layout.item_recommend_game_ablum;
                }
                return R.layout.layout_space;
            case 401221135:
                return !str.equals(f85972v) ? R.layout.layout_space : R.layout.item_recyclerview_game_card_scroll;
            case 406635402:
                return !str.equals(f85965o) ? R.layout.layout_space : R.layout.component_game_game_list_normal;
            case 525666023:
                return !str.equals(D) ? R.layout.layout_space : R.layout.item_game_recommend_goods_container;
            case 612084590:
                return !str.equals(f85968r) ? R.layout.layout_space : R.layout.item_recyclerview_big_game_card_scroll;
            case 738012435:
                return !str.equals("middle_game_card") ? R.layout.layout_space : R.layout.item_recommend_middle_game_card;
            case 899109442:
                return !str.equals("mini_app_v2") ? R.layout.layout_space : R.layout.item_miniprogram_container_v2;
            case 950365532:
                return !str.equals(f85959i) ? R.layout.layout_space : R.layout.item_recyclerview_menu_v2;
            case 1020273680:
                return !str.equals(f85971u) ? R.layout.layout_space : R.layout.item_recyclerview_middle_game_scroll;
            case 1089390270:
                return !str.equals("big_game_card") ? R.layout.layout_space : R.layout.item_big_game_card;
            case 1859588681:
                if (str.equals(f85964n)) {
                    return R.layout.item_game_recommend_1x2;
                }
                return R.layout.layout_space;
            default:
                return R.layout.layout_space;
        }
    }

    @dl.d
    public final Context s() {
        return this.f85977b;
    }

    @dl.d
    public final a t() {
        return this.f85978c;
    }

    public void v(@dl.e s.e eVar, @dl.e GameRecommendBaseObj gameRecommendBaseObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameRecommendBaseObj}, this, changeQuickRedirect, false, 35863, new Class[]{s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported || eVar == null) {
            return;
        }
        eVar.itemView.setTag(gameRecommendBaseObj);
        r rVarA = com.max.xiaoheihe.module.game.adapter.recommend.binder.s.f86251a.a(new RecommendVHBParam(this.f85977b, this), gameRecommendBaseObj != null ? gameRecommendBaseObj.getType() : null);
        if (gameRecommendBaseObj != null) {
            if (rVarA != null) {
                rVarA.f(eVar, gameRecommendBaseObj);
            }
            eVar.n(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()), rVarA);
        }
    }

    public void w(@dl.d s.e holder) {
        if (PatchProxy.proxy(new Object[]{holder}, this, changeQuickRedirect, false, 35864, new Class[]{s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.a();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @dl.e
    public final Object x(@dl.d List<GameRecommendBaseObj> list, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object next;
        Object next2;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, cVar}, this, changeQuickRedirect, false, 35862, new Class[]{List.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((GameRecommendBaseObj) next) instanceof MiniProgramListObj));
        g gVar = (GameRecommendBaseObj) next;
        List<T> mDataList = this.mDataList;
        f0.o(mDataList, "mDataList");
        Iterator it2 = mDataList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!(((GameRecommendBaseObj) next2) instanceof MiniProgramListObj));
        GameRecommendBaseObj gameRecommendBaseObj = (GameRecommendBaseObj) next2;
        if (!(gVar instanceof MiniProgramListObj) || !(gameRecommendBaseObj instanceof MiniProgramListObj)) {
            return b2.f124493a;
        }
        MiniProgramListObj miniProgramListObj = (MiniProgramListObj) gameRecommendBaseObj;
        List<MiniProgramObj> items = miniProgramListObj.getItems();
        Integer numF = items != null ? kotlin.coroutines.jvm.internal.a.f(items.size()) : null;
        MiniProgramListObj miniProgramListObj2 = (MiniProgramListObj) gVar;
        List<MiniProgramObj> items2 = miniProgramListObj2.getItems();
        if (!f0.g(numF, items2 != null ? kotlin.coroutines.jvm.internal.a.f(items2.size()) : null)) {
            int iIndexOf = this.mDataList.indexOf(gameRecommendBaseObj);
            this.mDataList.set(iIndexOf, (T) gVar);
            Object objH = i.h(e1.e(), new GameRecommendAdapter$updateMiniProgramBoard$2(this, iIndexOf, null), cVar);
            return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
        }
        List<MiniProgramObj> items3 = miniProgramListObj.getItems();
        if (items3 != null) {
            int i10 = 0;
            for (Object obj : items3) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                MiniProgramObj miniProgramObj = (MiniProgramObj) obj;
                List<MiniProgramObj> items4 = miniProgramListObj2.getItems();
                if (!f0.g(miniProgramObj, items4 != null ? items4.get(i10) : null)) {
                    z10 = true;
                }
                i10 = i11;
            }
        }
        if (!z10) {
            return b2.f124493a;
        }
        int iIndexOf2 = this.mDataList.indexOf(gameRecommendBaseObj);
        this.mDataList.set(iIndexOf2, (T) gVar);
        Object objH2 = i.h(e1.e(), new GameRecommendAdapter$updateMiniProgramBoard$4(this, iIndexOf2, null), cVar);
        return objH2 == kotlin.coroutines.intrinsics.b.h() ? objH2 : b2.f124493a;
    }
}
