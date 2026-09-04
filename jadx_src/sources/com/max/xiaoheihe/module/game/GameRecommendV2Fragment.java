package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.base.adapter.RecyclerViewItemWatcher;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoMovieObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendV2Result;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.max.xiaoheihe.module.game.component.GameVideoCardView;
import com.max.xiaoheihe.module.mall.NotificationType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.b90;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = "/game/recommend_v2")
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameRecommendV2Fragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final a f84630p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f84631q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b90 f84632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GameRecommendAdapter f84633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigBrotherAdapterWrapper<GameRecommendBaseObj> f84634d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f84637g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f84639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f84640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f84641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f84642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f84643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f84644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f84645o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<GameRecommendBaseObj> f84635e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<PathSrcNode> f84636f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f84638h = 1;

    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final GameRecommendV2Fragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33516, new Class[0], GameRecommendV2Fragment.class);
            return patchProxyResultProxy.isSupported ? (GameRecommendV2Fragment) patchProxyResultProxy.result : new GameRecommendV2Fragment();
        }
    }

    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    public static final class b implements GameRecommendAdapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33526, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b90 b90Var = GameRecommendV2Fragment.this.f84632b;
            if (b90Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                b90Var = null;
            }
            b90Var.f108880c.F();
        }

        @Override // com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter.a
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33527, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameRecommendV2Fragment.this.f84645o = true;
        }
    }

    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33528, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GameRecommendV2Fragment.this.f84637g = 0;
            GameRecommendV2Fragment.this.f84636f.clear();
            com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i.h();
            GameRecommendV2Fragment.m4(GameRecommendV2Fragment.this, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33529, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GameRecommendV2Fragment.this.f84637g += GameRecommendV2Fragment.this.f84638h;
            GameRecommendV2Fragment.m4(GameRecommendV2Fragment.this, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    public static final class e implements com.max.hbcommon.base.adapter.a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, 33531, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.base.adapter.a0.a.a(this, i10, viewHolder, f10);
            if (viewHolder instanceof com.max.hbcommon.base.adapter.s.e) {
                com.max.hbcommon.base.adapter.s.e eVar = (com.max.hbcommon.base.adapter.s.e) viewHolder;
                View view = eVar.itemView;
                kotlin.jvm.internal.f0.o(view, "viewTag.itemView");
                if ((view.getTag() instanceof GameRecommendBaseObj) && f10 >= 100.0f) {
                    Object objH = eVar.h(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()));
                    if (objH instanceof com.max.xiaoheihe.module.game.adapter.recommend.binder.r) {
                        ((com.max.xiaoheihe.module.game.adapter.recommend.binder.r) objH).q();
                    }
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            if (!PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 33530, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported && (viewHolder instanceof com.max.hbcommon.base.adapter.s.e)) {
                com.max.hbcommon.base.adapter.s.e eVar = (com.max.hbcommon.base.adapter.s.e) viewHolder;
                View view = eVar.itemView;
                kotlin.jvm.internal.f0.o(view, "viewTag.itemView");
                if (view.getTag() instanceof GameRecommendBaseObj) {
                    GameRecommendBaseObj gameRecommendBaseObj = (GameRecommendBaseObj) view.getTag();
                    GameRecommendAdapter gameRecommendAdapter = GameRecommendV2Fragment.this.f84633c;
                    if (gameRecommendAdapter == null) {
                        kotlin.jvm.internal.f0.S("mAdapter");
                        gameRecommendAdapter = null;
                    }
                    gameRecommendAdapter.o(eVar, gameRecommendBaseObj, GameRecommendV2Fragment.this.f84636f);
                }
            }
        }
    }

    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    public static final class f extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@dl.d RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 33532, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0) {
                GameRecommendV2Fragment.this.f84644n = 0;
            } else if (i10 == 1) {
                GameRecommendV2Fragment.this.f84644n = 1;
            } else if (i10 == 2) {
                GameRecommendV2Fragment.this.f84644n = 2;
            }
            GameRecommendV2Fragment.L3(GameRecommendV2Fragment.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33533, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            GameRecommendV2Fragment.this.f84641k = linearLayoutManager.findFirstVisibleItemPosition();
            GameRecommendV2Fragment.this.f84642l = linearLayoutManager.findLastVisibleItemPosition();
            GameRecommendV2Fragment gameRecommendV2Fragment = GameRecommendV2Fragment.this;
            gameRecommendV2Fragment.f84643m = (gameRecommendV2Fragment.f84642l - GameRecommendV2Fragment.this.f84641k) + 1;
            com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
            Context viewContext = GameRecommendV2Fragment.this.getViewContext();
            kotlin.jvm.internal.f0.o(viewContext, "viewContext");
            AbsVideoView absVideoViewE = aVar.e(viewContext);
            if (absVideoViewE.G()) {
                Context viewContext2 = GameRecommendV2Fragment.this.getViewContext();
                kotlin.jvm.internal.f0.o(viewContext2, "viewContext");
                GameVideoCardView gameVideoCardViewC = aVar.c(viewContext2);
                if (gameVideoCardViewC != null) {
                    GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) absVideoViewE.getTag(aVar.d());
                    if (ViewUtils.a0(gameVideoCardViewC)) {
                        GameCardVideoMovieObj movie = gameCardVideoObj != null ? gameCardVideoObj.getMovie() : null;
                        kotlin.jvm.internal.f0.m(movie);
                        if (movie.isPlaying()) {
                            absVideoViewE.K();
                        }
                    }
                }
            }
        }
    }

    public static final /* synthetic */ void L3(GameRecommendV2Fragment gameRecommendV2Fragment) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment}, null, changeQuickRedirect, true, 33509, new Class[]{GameRecommendV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendV2Fragment.j4();
    }

    public static final /* synthetic */ View M3(GameRecommendV2Fragment gameRecommendV2Fragment, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRecommendV2Fragment, new Integer(i10)}, null, changeQuickRedirect, true, 33513, new Class[]{GameRecommendV2Fragment.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : gameRecommendV2Fragment.findViewById(i10);
    }

    public static final /* synthetic */ void N3(GameRecommendV2Fragment gameRecommendV2Fragment) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment}, null, changeQuickRedirect, true, 33512, new Class[]{GameRecommendV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendV2Fragment.k4();
    }

    public static final /* synthetic */ void Y3(GameRecommendV2Fragment gameRecommendV2Fragment) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment}, null, changeQuickRedirect, true, 33510, new Class[]{GameRecommendV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendV2Fragment.o4();
    }

    public static final /* synthetic */ void g4(GameRecommendV2Fragment gameRecommendV2Fragment) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment}, null, changeQuickRedirect, true, 33514, new Class[]{GameRecommendV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendV2Fragment.showContentView();
    }

    public static final /* synthetic */ void h4(GameRecommendV2Fragment gameRecommendV2Fragment) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment}, null, changeQuickRedirect, true, 33515, new Class[]{GameRecommendV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendV2Fragment.showEmpty();
    }

    public static final /* synthetic */ void i4(GameRecommendV2Fragment gameRecommendV2Fragment) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment}, null, changeQuickRedirect, true, 33511, new Class[]{GameRecommendV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendV2Fragment.showError();
    }

    private final void j4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33502, new Class[0], Void.TYPE).isSupported && com.max.hbcommon.utils.i.e(getContext()) && this.f84644n == 0) {
            com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
            Context viewContext = getViewContext();
            kotlin.jvm.internal.f0.o(viewContext, "viewContext");
            GameVideoCardView gameVideoCardViewC = aVar.c(viewContext);
            if (gameVideoCardViewC != null) {
                Context viewContext2 = getViewContext();
                kotlin.jvm.internal.f0.o(viewContext2, "viewContext");
                GameCardVideoObj gameCardVideoObj = (GameCardVideoObj) aVar.e(viewContext2).getTag(aVar.d());
                if (!ViewUtils.a0(gameVideoCardViewC)) {
                    GameCardVideoMovieObj movie = gameCardVideoObj != null ? gameCardVideoObj.getMovie() : null;
                    kotlin.jvm.internal.f0.m(movie);
                    if (movie.isPlaying()) {
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < this.f84643m; i10++) {
                b90 b90Var = this.f84632b;
                if (b90Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    b90Var = null;
                }
                View childAt = b90Var.f108879b.getChildAt(i10);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if (tag instanceof GameCardVideoObj) {
                        GameVideoCardView gameVideoCardView = (GameVideoCardView) childAt.findViewById(R.id.game_video_card);
                        com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar2 = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
                        GameCardVideoObj gameCardVideoObj2 = (GameCardVideoObj) tag;
                        GameCardVideoMovieObj movie2 = gameCardVideoObj2.getMovie();
                        if (aVar2.g(movie2 != null ? movie2.getMovie_url() : null) || ViewUtils.a0(childAt)) {
                            if (gameVideoCardView.i()) {
                                gameVideoCardView.getVideo().K();
                            }
                        } else if (gameCardVideoObj2.getMovie() != null) {
                            GameCardVideoMovieObj movie3 = gameCardVideoObj2.getMovie();
                            kotlin.jvm.internal.f0.m(movie3);
                            if (!movie3.isCompleted()) {
                                gameVideoCardView.l(gameCardVideoObj2, false);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33503, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84639i = false;
        b90 b90Var = this.f84632b;
        b90 b90Var2 = null;
        if (b90Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var = null;
        }
        b90Var.f108880c.A(0);
        b90 b90Var3 = this.f84632b;
        if (b90Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            b90Var2 = b90Var3;
        }
        b90Var2.f108880c.p(0);
    }

    private final void l4(final boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33496, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().m7(this.f84637g, this.f84638h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<GameRecommendV2Result>>() { // from class: com.max.xiaoheihe.module.game.GameRecommendV2Fragment$getRecommendGameList$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onComplete() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33518, new Class[0], Void.TYPE).isSupported && this.f84651b.isActive()) {
                    super.onComplete();
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33517, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
                if (this.f84651b.isActive()) {
                    super.onError(e10);
                    com.max.heybox.hblog.g.f74531b.w("GameRecommendV2Fragment", e10);
                    GameRecommendV2Fragment.i4(this.f84651b);
                    GameRecommendV2Fragment.N3(this.f84651b);
                    BigBrotherAdapterWrapper bigBrotherAdapterWrapper = this.f84651b.f84634d;
                    if (bigBrotherAdapterWrapper == null) {
                        kotlin.jvm.internal.f0.S("mBBAdapter");
                        bigBrotherAdapterWrapper = null;
                    }
                    bigBrotherAdapterWrapper.F();
                }
            }

            public void onNext(@dl.d Result<GameRecommendV2Result> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33519, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                if (this.f84651b.isActive()) {
                    super.onNext(result);
                    kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this.f84651b), kotlinx.coroutines.e1.e(), null, new GameRecommendV2Fragment$getRecommendGameList$1$onNext$1(this.f84651b, z10, result, this.f84651b.f84639i, null), 2, null);
                    View viewM3 = GameRecommendV2Fragment.M3(this.f84651b, R.id.multi_status_view_container);
                    if (viewM3 != null) {
                        GameRecommendV2Fragment gameRecommendV2Fragment = this.f84651b;
                        String protocol = result.getProtocol();
                        Context context = viewM3.getContext();
                        kotlin.jvm.internal.f0.o(context, "it.context");
                        com.max.xiaoheihe.module.mall.a.a(gameRecommendV2Fragment, protocol, viewM3, com.max.accelworld.c.c(bb.c.b.f30828o0, context), NotificationType.GAME_ALL_RECOMMEND);
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33520, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<GameRecommendV2Result>) obj);
            }
        }));
    }

    static /* synthetic */ void m4(GameRecommendV2Fragment gameRecommendV2Fragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gameRecommendV2Fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 33497, new Class[]{GameRecommendV2Fragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        gameRecommendV2Fragment.l4(z10);
    }

    private final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33494, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewUtils.J(this.mContext);
        b90 b90Var = this.f84632b;
        b90 b90Var2 = null;
        if (b90Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var = null;
        }
        UniversalRecyclerView universalRecyclerView = b90Var.f108879b;
        final Activity activity = this.mContext;
        universalRecyclerView.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.max.xiaoheihe.module.game.GameRecommendV2Fragment$initView$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@dl.d RecyclerView.State state, @dl.d int[] extraLayoutSpace) {
                if (PatchProxy.proxy(new Object[]{state, extraLayoutSpace}, this, changeQuickRedirect, false, 33525, new Class[]{RecyclerView.State.class, int[].class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(state, "state");
                kotlin.jvm.internal.f0.p(extraLayoutSpace, "extraLayoutSpace");
            }
        });
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        GameRecommendAdapter gameRecommendAdapter = new GameRecommendAdapter(mContext, this.f84635e, new b());
        this.f84633c = gameRecommendAdapter;
        Activity activity2 = this.mContext;
        Activity mContext2 = this.mContext;
        kotlin.jvm.internal.f0.o(mContext2, "mContext");
        this.f84634d = new BigBrotherAdapterWrapper<>(activity2, gameRecommendAdapter, new com.max.xiaoheihe.module.game.adapter.recommend.b(mContext2));
        b90 b90Var3 = this.f84632b;
        if (b90Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var3 = null;
        }
        UniversalRecyclerView universalRecyclerView2 = b90Var3.f108879b;
        BigBrotherAdapterWrapper<GameRecommendBaseObj> bigBrotherAdapterWrapper = this.f84634d;
        if (bigBrotherAdapterWrapper == null) {
            kotlin.jvm.internal.f0.S("mBBAdapter");
            bigBrotherAdapterWrapper = null;
        }
        universalRecyclerView2.setAdapter(bigBrotherAdapterWrapper);
        b90 b90Var4 = this.f84632b;
        if (b90Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var4 = null;
        }
        b90Var4.f108879b.setItemViewCacheSize(10);
        b90 b90Var5 = this.f84632b;
        if (b90Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var5 = null;
        }
        b90Var5.f108879b.scrollToPosition(0);
        b90 b90Var6 = this.f84632b;
        if (b90Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var6 = null;
        }
        b90Var6.f108880c.setBackgroundColor(this.mContext.getResources().getColor(R.color.background_layer_2_color));
        b90 b90Var7 = this.f84632b;
        if (b90Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var7 = null;
        }
        b90Var7.f108880c.b0(false);
        b90 b90Var8 = this.f84632b;
        if (b90Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var8 = null;
        }
        b90Var8.f108880c.S(new c());
        b90 b90Var9 = this.f84632b;
        if (b90Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var9 = null;
        }
        b90Var9.f108880c.f0(new d());
        b90 b90Var10 = this.f84632b;
        if (b90Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var10 = null;
        }
        UniversalRecyclerView universalRecyclerView3 = b90Var10.f108879b;
        kotlin.jvm.internal.f0.o(universalRecyclerView3, "binding.rv");
        new OneTimeValidExposureWatcher(this, universalRecyclerView3);
        b90 b90Var11 = this.f84632b;
        if (b90Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var11 = null;
        }
        UniversalRecyclerView universalRecyclerView4 = b90Var11.f108879b;
        kotlin.jvm.internal.f0.o(universalRecyclerView4, "binding.rv");
        new RecyclerViewItemWatcher(this, universalRecyclerView4, new e(), 0, false, 24, null);
        b90 b90Var12 = this.f84632b;
        if (b90Var12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var12 = null;
        }
        b90Var12.f108879b.addOnScrollListener(new f());
        b90 b90Var13 = this.f84632b;
        if (b90Var13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var13 = null;
        }
        b90Var13.f108879b.setPreloadEnable(true);
        b90 b90Var14 = this.f84632b;
        if (b90Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var14 = null;
        }
        b90Var14.f108879b.setPreLoadGap(20);
        b90 b90Var15 = this.f84632b;
        if (b90Var15 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            b90Var2 = b90Var15;
        }
        b90Var2.f108879b.setPreLoadAction(new yh.a<kotlin.b2>() { // from class: com.max.xiaoheihe.module.game.GameRecommendV2Fragment$initView$7
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33535, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33534, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameRecommendV2Fragment.Y3(this.f84658b);
                b90 b90Var16 = this.f84658b.f84632b;
                if (b90Var16 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    b90Var16 = null;
                }
                b90Var16.f108879b.b();
            }
        });
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33500, new Class[0], Void.TYPE).isSupported || this.f84639i || !this.f84640j) {
            return;
        }
        this.f84639i = true;
        this.f84637g += this.f84638h;
        m4(this, false, 1, null);
    }

    @dl.d
    @xh.m
    public static final GameRecommendV2Fragment p4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33508, new Class[0], GameRecommendV2Fragment.class);
        return patchProxyResultProxy.isSupported ? (GameRecommendV2Fragment) patchProxyResultProxy.result : f84630p.a();
    }

    public static /* synthetic */ Object r4(GameRecommendV2Fragment gameRecommendV2Fragment, boolean z10, Result result, boolean z11, kotlin.coroutines.c cVar, int i10, Object obj) {
        Object[] objArr = {gameRecommendV2Fragment, new Byte(z10 ? (byte) 1 : (byte) 0), result, new Byte(z11 ? (byte) 1 : (byte) 0), cVar, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 33499, new Class[]{GameRecommendV2Fragment.class, cls, Result.class, cls, kotlin.coroutines.c.class, Integer.TYPE, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        return gameRecommendV2Fragment.q4(z10, result, (i10 & 4) == 0 ? z11 ? 1 : 0 : false, cVar);
    }

    private final void s4() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33501, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b90 b90Var = this.f84632b;
        if (b90Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var = null;
        }
        if (b90Var.f108879b.getLayoutManager() instanceof LinearLayoutManager) {
            b90 b90Var2 = this.f84632b;
            if (b90Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                b90Var2 = null;
            }
            if (ViewUtils.f0(b90Var2.f108879b)) {
                b90 b90Var3 = this.f84632b;
                if (b90Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    b90Var3 = null;
                }
                RecyclerView.LayoutManager layoutManager = b90Var3.f108879b.getLayoutManager();
                kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1) {
                    i10 = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
                }
                if (i10 > 0) {
                    int i11 = iFindLastVisibleItemPosition + 1;
                    while (iFindFirstVisibleItemPosition < i11) {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        if (viewFindViewByPosition != null && (viewFindViewByPosition.getTag() instanceof GameRecommendBaseObj) && ViewUtils.f0(viewFindViewByPosition)) {
                            b90 b90Var4 = this.f84632b;
                            if (b90Var4 == null) {
                                kotlin.jvm.internal.f0.S("binding");
                                b90Var4 = null;
                            }
                            RecyclerView.ViewHolder childViewHolder = b90Var4.f108879b.getChildViewHolder(viewFindViewByPosition);
                            if (childViewHolder instanceof com.max.hbcommon.base.adapter.s.e) {
                                GameRecommendBaseObj gameRecommendBaseObj = (GameRecommendBaseObj) viewFindViewByPosition.getTag();
                                GameRecommendAdapter gameRecommendAdapter = this.f84633c;
                                if (gameRecommendAdapter == null) {
                                    kotlin.jvm.internal.f0.S("mAdapter");
                                    gameRecommendAdapter = null;
                                }
                                gameRecommendAdapter.o((com.max.hbcommon.base.adapter.s.e) childViewHolder, gameRecommendBaseObj, this.f84636f);
                            }
                        }
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33504, new Class[0], Void.TYPE).isSupported && isActive()) {
            b90 b90Var = this.f84632b;
            b90 b90Var2 = null;
            if (b90Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                b90Var = null;
            }
            b90Var.f108879b.scrollToPosition(0);
            b90 b90Var3 = this.f84632b;
            if (b90Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                b90Var2 = b90Var3;
            }
            b90Var2.f108880c.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33493, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        b90 b90VarC = b90.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(b90VarC, "inflate(layoutInflater)");
        this.f84632b = b90VarC;
        if (b90VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90VarC = null;
        }
        setContentView(b90VarC);
        n4();
        showLoading();
        m4(this, false, 1, null);
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public void l1(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33506, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        s4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33507, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i.h();
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33495, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (this.f84645o && this.mIsPrepared) {
            this.f84637g = 0;
            this.f84636f.clear();
            com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i.h();
            l4(true);
            this.f84645o = false;
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33505, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        b90 b90Var = this.f84632b;
        if (b90Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            b90Var = null;
        }
        b90Var.f108880c.F();
    }

    @dl.e
    public final Object q4(boolean z10, @dl.d Result<GameRecommendV2Result> result, boolean z11, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), result, new Byte(z11 ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33498, new Class[]{cls, Result.class, cls, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlinx.coroutines.i.h(kotlinx.coroutines.e1.e(), new GameRecommendV2Fragment$onGetList$2(result, this, z11, z10, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : kotlin.b2.f124493a;
    }
}
