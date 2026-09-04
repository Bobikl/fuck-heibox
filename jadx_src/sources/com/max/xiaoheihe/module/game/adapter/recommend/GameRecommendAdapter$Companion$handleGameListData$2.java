package com.max.xiaoheihe.module.game.adapter.recommend;

import com.google.gson.JsonObject;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.max.xiaoheihe.bean.game.recommend.GameDuoListObj;
import com.max.xiaoheihe.bean.game.recommend.GameListObj;
import com.max.xiaoheihe.bean.game.recommend.GameListWithTabObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.GameTabListObj;
import com.max.xiaoheihe.bean.game.recommend.SpaceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: GameRecommendAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter$Companion$handleGameListData$2", f = "GameRecommendAdapter.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"listTemp"}, s = {"L$0"})
public final class GameRecommendAdapter$Companion$handleGameListData$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Boolean>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f85979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f85980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f85981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<GameRecommendBaseObj> f85982e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter$Companion$handleGameListData$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: GameRecommendAdapter.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter$Companion$handleGameListData$2$3", f = "GameRecommendAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f85983b;

        AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35881, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35883, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35882, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35880, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f85983b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameRecommendAdapter$Companion$handleGameListData$2(List<GameRecommendBaseObj> list, kotlin.coroutines.c<? super GameRecommendAdapter$Companion$handleGameListData$2> cVar) {
        super(2, cVar);
        this.f85982e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35877, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameRecommendAdapter$Companion$handleGameListData$2(this.f85982e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35879, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35878, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameRecommendAdapter$Companion$handleGameListData$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Iterator<GameRecommendBaseObj> it;
        List list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35876, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f85981d;
        if (i10 == 0) {
            t0.n(obj);
            ArrayList arrayList = new ArrayList();
            it = this.f85982e.iterator();
            list = arrayList;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.f85980c;
            list = (List) this.f85979b;
            t0.n(obj);
        }
        while (it.hasNext()) {
            GameRecommendBaseObj next = it.next();
            if (next instanceof GameDuoListObj) {
                GameDuoListObj gameDuoListObj = (GameDuoListObj) next;
                ArrayList<RecommendGameListItemObj> games = gameDuoListObj.getGames();
                if (games != null) {
                    int size = (games.size() + 1) / 2;
                    int i11 = 0;
                    while (i11 < size) {
                        GameDuoListObj gameDuoListObj2 = new GameDuoListObj();
                        gameDuoListObj2.setType(gameDuoListObj.getType());
                        gameDuoListObj2.setGames(new ArrayList<>());
                        ArrayList<RecommendGameListItemObj> games2 = gameDuoListObj2.getGames();
                        f0.m(games2);
                        int i12 = i11 * 2;
                        games2.add(games.get(i12));
                        int i13 = i12 + 1;
                        if (i13 < games.size()) {
                            ArrayList<RecommendGameListItemObj> games3 = gameDuoListObj2.getGames();
                            f0.m(games3);
                            games3.add(games.get(i13));
                        }
                        gameDuoListObj2.setReport_path(gameDuoListObj.getReport_path());
                        if (gameDuoListObj.getReport_additional() != null) {
                            gameDuoListObj2.setReport_additional(gameDuoListObj.getReport_additional().deepCopy());
                        } else {
                            gameDuoListObj2.setReport_additional(new JsonObject());
                        }
                        gameDuoListObj2.getReport_additional().addProperty("idx", kotlin.coroutines.jvm.internal.a.f(i11));
                        list.add(gameDuoListObj2);
                        i11++;
                        if (i11 * 2 < games.size()) {
                            SpaceObj spaceObj = new SpaceObj();
                            spaceObj.setType("space");
                            spaceObj.setHeight("18");
                            list.add(spaceObj);
                        }
                    }
                }
            } else if (next instanceof GameListObj) {
                List<GameObj> games4 = ((GameListObj) next).getGames();
                if (games4 != null) {
                    int size2 = games4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        list.add(GameRecommendAdapter.f85954d.a(next, games4.get(i14), i14));
                    }
                }
            } else if (next instanceof GameListWithTabObj) {
                list.add(next);
                GameListWithTabObj gameListWithTabObj = (GameListWithTabObj) next;
                if (!com.max.hbcommon.utils.c.w(gameListWithTabObj.getTabs())) {
                    int iQ = n.q(gameListWithTabObj.getCurrent_tab());
                    if (iQ >= 0) {
                        ArrayList<GameTabListObj> tabs = gameListWithTabObj.getTabs();
                        f0.m(tabs);
                        if (iQ >= tabs.size()) {
                            iQ = 0;
                        }
                    } else {
                        iQ = 0;
                    }
                    ArrayList<GameTabListObj> tabs2 = gameListWithTabObj.getTabs();
                    f0.m(tabs2);
                    if (!com.max.hbcommon.utils.c.w(tabs2.get(iQ).getGames())) {
                        ArrayList<GameTabListObj> tabs3 = gameListWithTabObj.getTabs();
                        f0.m(tabs3);
                        List<GameObj> games5 = tabs3.get(iQ).getGames();
                        f0.m(games5);
                        Iterator<GameObj> it2 = games5.iterator();
                        int i15 = 0;
                        while (it2.hasNext()) {
                            list.add(GameRecommendAdapter.f85954d.a(next, it2.next(), i15));
                            i15++;
                        }
                    }
                }
            } else if (next instanceof GameCardVideoObj) {
                list.add(next);
                n2 n2VarE = e1.e();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                this.f85979b = list;
                this.f85980c = it;
                this.f85981d = 1;
                if (i.h(n2VarE, anonymousClass3, this) == objH) {
                    return objH;
                }
            } else {
                list.add(next);
            }
        }
        this.f85982e.clear();
        return kotlin.coroutines.jvm.internal.a.a(this.f85982e.addAll(list));
    }
}
