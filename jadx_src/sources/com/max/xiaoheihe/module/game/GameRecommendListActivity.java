package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameRecommendListActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameRecommendListActivity extends BaseActivity {

    @dl.d
    public static final a S = new a(null);
    public static final int T = 8;

    @dl.d
    private static final String U = "collection_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    public SmartRefreshLayout L;
    public RecyclerView M;
    public com.max.hbcommon.base.adapter.s<GameObj> N;
    public String O;

    @dl.d
    private a2 P = new a2();

    @dl.d
    private ArrayList<GameObj> Q = new ArrayList<>();
    private int R;

    /* JADX INFO: compiled from: GameRecommendListActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context, @dl.d String collectionID) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, collectionID}, this, changeQuickRedirect, false, 33484, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(collectionID, "collectionID");
            Intent intent = new Intent(context, (Class<?>) GameRecommendListActivity.class);
            intent.putExtra(GameRecommendListActivity.U, collectionID);
            return intent;
        }
    }

    /* JADX INFO: compiled from: GameRecommendListActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<GameObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33486, new Class[0], Void.TYPE).isSupported && GameRecommendListActivity.this.isActive()) {
                GameRecommendListActivity.M1(GameRecommendListActivity.this);
                GameRecommendListActivity.this.Y1().p(0);
                GameRecommendListActivity.this.Y1().A(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33487, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GameRecommendListActivity.this.isActive()) {
                GameRecommendListActivity.N1(GameRecommendListActivity.this);
                GameRecommendListActivity.this.Y1().p(0);
                GameRecommendListActivity.this.Y1().A(0);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<GameObj> r10) {
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 33485, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(r10, "r");
            if (GameRecommendListActivity.this.isActive() && r10.getResult() != null) {
                GameRecommendListActivity.this.a2(r10.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33488, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameRecommendListActivity.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Activity activity, ArrayList<GameObj> arrayList) {
            super(activity, arrayList, R.layout.item_mobile_rec_row);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33489, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            r1.E1(eVar, gameObj, GameRecommendListActivity.this.V1());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33490, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    /* JADX INFO: compiled from: GameRecommendListActivity.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public void k(@dl.d ng.j refreshLayout) {
            if (PatchProxy.proxy(new Object[]{refreshLayout}, this, changeQuickRedirect, false, 33491, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(refreshLayout, "refreshLayout");
            GameRecommendListActivity.this.h2(0);
            GameRecommendListActivity.this.Q1().clear();
            GameRecommendListActivity.this.O1();
        }
    }

    /* JADX INFO: compiled from: GameRecommendListActivity.kt */
    public static final class e implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.b
        public void f(@dl.d ng.j refreshLayout) {
            if (PatchProxy.proxy(new Object[]{refreshLayout}, this, changeQuickRedirect, false, 33492, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(refreshLayout, "refreshLayout");
            GameRecommendListActivity gameRecommendListActivity = GameRecommendListActivity.this;
            gameRecommendListActivity.h2(gameRecommendListActivity.W1() + 30);
            GameRecommendListActivity.this.O1();
        }
    }

    public static final /* synthetic */ void M1(GameRecommendListActivity gameRecommendListActivity) {
        if (PatchProxy.proxy(new Object[]{gameRecommendListActivity}, null, changeQuickRedirect, true, 33482, new Class[]{GameRecommendListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendListActivity.x1();
    }

    public static final /* synthetic */ void N1(GameRecommendListActivity gameRecommendListActivity) {
        if (PatchProxy.proxy(new Object[]{gameRecommendListActivity}, null, changeQuickRedirect, true, 33483, new Class[]{GameRecommendListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendListActivity.C1();
    }

    @dl.d
    @xh.m
    public static final Intent Z1(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 33481, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : S.a(context, str);
    }

    public final void O1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33479, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u2(this.R, 30, T1()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    public final ArrayList<GameObj> Q1() {
        return this.Q;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.s<GameObj> R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33471, new Class[0], com.max.hbcommon.base.adapter.s.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s<GameObj> sVar = this.N;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.f0.S("mAdapter");
        return null;
    }

    @dl.d
    public final String T1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33473, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.O;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.f0.S("mCollectionID");
        return null;
    }

    @dl.d
    public final a2 V1() {
        return this.P;
    }

    public final int W1() {
        return this.R;
    }

    @dl.d
    public final RecyclerView X1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33469, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.M;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("mRecyclerView");
        return null;
    }

    @dl.d
    public final SmartRefreshLayout Y1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33467, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        kotlin.jvm.internal.f0.S("mRefreshLayout");
        return null;
    }

    public final void a2(@dl.e GameObj gameObj) {
        List<GameObj> game_list;
        String title;
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 33480, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gameObj != null && (title = gameObj.getTitle()) != null) {
            this.f66616q.setTitle(title);
            this.f66617r.setVisibility(0);
        }
        if (gameObj == null || (game_list = gameObj.getGame_list()) == null) {
            return;
        }
        this.Q.addAll(game_list);
        R1().notifyDataSetChanged();
    }

    public final void b2(@dl.d ArrayList<GameObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 33476, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
        this.Q = arrayList;
    }

    public final void c2(@dl.d com.max.hbcommon.base.adapter.s<GameObj> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 33472, new Class[]{com.max.hbcommon.base.adapter.s.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(sVar, "<set-?>");
        this.N = sVar;
    }

    public final void e2(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33474, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.O = str;
    }

    public final void f2(@dl.d a2 a2Var) {
        if (PatchProxy.proxy(new Object[]{a2Var}, this, changeQuickRedirect, false, 33475, new Class[]{a2.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(a2Var, "<set-?>");
        this.P = a2Var;
    }

    public final void h2(int i10) {
        this.R = i10;
    }

    public final void i2(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 33470, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.M = recyclerView;
    }

    public final void j2(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 33468, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(smartRefreshLayout, "<set-?>");
        this.L = smartRefreshLayout;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33477, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        String stringExtra = getIntent().getStringExtra(U);
        if (stringExtra == null) {
            stringExtra = "";
        }
        e2(stringExtra);
        View viewFindViewById = findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.srl)");
        j2((SmartRefreshLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(R.id.rv)");
        i2((RecyclerView) viewFindViewById2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f66601b);
        linearLayoutManager.setOrientation(1);
        X1().setLayoutManager(linearLayoutManager);
        c2(new c(this.f66601b, this.Q));
        X1().setAdapter(R1());
        Y1().S(new d());
        Y1().f0(new e());
        ViewGroup.LayoutParams layoutParams = this.f66617r.getLayoutParams();
        kotlin.jvm.internal.f0.o(layoutParams, "mTitleBarDivider.layoutParams");
        layoutParams.height = ViewUtils.f(this.f66601b, 4.0f);
        this.f66617r.setBackgroundColor(getResources().getColor(R.color.divider_secondary_2_color));
        E1();
        O1();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33478, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P.f();
        super.onDestroy();
    }
}
