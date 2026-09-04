package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.AllRecommendGameCategoryObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131284x2)
@ig.d(path = {lb.d.f131284x2})
public class GameRecommendedListActivity extends BaseActivity {
    private static final String Q = "title";
    private static final String R = "show_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private com.max.hbcommon.base.adapter.s<RecommendGameListItemObj> O;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;
    private int N = 0;
    private List<RecommendGameListItemObj> P = new ArrayList();

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 33553, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iF = ViewUtils.f(((BaseActivity) GameRecommendedListActivity.this).f66601b, 12.0f);
            rect.set(iF, childAdapterPosition == 0 ? iF : 0, iF, iF);
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<RecommendGameListItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, RecommendGameListItemObj recommendGameListItemObj) {
            String str;
            if (PatchProxy.proxy(new Object[]{eVar, recommendGameListItemObj}, this, changeQuickRedirect, false, 33554, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RecommendGameListItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameItemView gameItemView = (GameItemView) eVar.i(R.id.giv);
            GameObj gameObjW = r1.w(recommendGameListItemObj);
            if (com.max.hbutils.utils.n.p(recommendGameListItemObj.getScore()) > 0.0f) {
                gameObjW.setScore(recommendGameListItemObj.getScore());
                str = GameObj.KEY_POINT_SCORE;
            } else {
                str = "discount";
            }
            gameItemView.g(gameObjW, str, null, true, null, eVar);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, RecommendGameListItemObj recommendGameListItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, recommendGameListItemObj}, this, changeQuickRedirect, false, 33555, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, recommendGameListItemObj);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33556, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameRecommendedListActivity.this.N = 0;
            GameRecommendedListActivity.Q1(GameRecommendedListActivity.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33557, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameRecommendedListActivity.O1(GameRecommendedListActivity.this, 30);
            GameRecommendedListActivity.Q1(GameRecommendedListActivity.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<AllRecommendGameCategoryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33559, new Class[0], Void.TYPE).isSupported && GameRecommendedListActivity.this.isActive()) {
                super.onComplete();
                GameRecommendedListActivity.this.mRefreshLayout.A(0);
                GameRecommendedListActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33558, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameRecommendedListActivity.this.isActive()) {
                super.onError(th2);
                GameRecommendedListActivity.R1(GameRecommendedListActivity.this);
                GameRecommendedListActivity.this.mRefreshLayout.A(0);
                GameRecommendedListActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<AllRecommendGameCategoryObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33560, new Class[]{Result.class}, Void.TYPE).isSupported && GameRecommendedListActivity.this.isActive()) {
                super.onNext(result);
                GameRecommendedListActivity.T1(GameRecommendedListActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33561, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AllRecommendGameCategoryObj>) obj);
        }
    }

    static /* synthetic */ int O1(GameRecommendedListActivity gameRecommendedListActivity, int i10) {
        int i11 = gameRecommendedListActivity.N + i10;
        gameRecommendedListActivity.N = i11;
        return i11;
    }

    static /* synthetic */ void Q1(GameRecommendedListActivity gameRecommendedListActivity) {
        if (PatchProxy.proxy(new Object[]{gameRecommendedListActivity}, null, changeQuickRedirect, true, 33550, new Class[]{GameRecommendedListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendedListActivity.W1();
    }

    static /* synthetic */ void R1(GameRecommendedListActivity gameRecommendedListActivity) {
        if (PatchProxy.proxy(new Object[]{gameRecommendedListActivity}, null, changeQuickRedirect, true, 33551, new Class[]{GameRecommendedListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendedListActivity.C1();
    }

    static /* synthetic */ void T1(GameRecommendedListActivity gameRecommendedListActivity, AllRecommendGameCategoryObj allRecommendGameCategoryObj) {
        if (PatchProxy.proxy(new Object[]{gameRecommendedListActivity, allRecommendGameCategoryObj}, null, changeQuickRedirect, true, 33552, new Class[]{GameRecommendedListActivity.class, AllRecommendGameCategoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRecommendedListActivity.X1(allRecommendGameCategoryObj);
    }

    public static Intent V1(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 33544, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameRecommendedListActivity.class);
        intent.putExtra("title", str);
        intent.putExtra(R, str2);
        return intent;
    }

    private void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33546, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t1(this.M, this.N, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void X1(AllRecommendGameCategoryObj allRecommendGameCategoryObj) {
        if (PatchProxy.proxy(new Object[]{allRecommendGameCategoryObj}, this, changeQuickRedirect, false, 33547, new Class[]{AllRecommendGameCategoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (allRecommendGameCategoryObj != null && allRecommendGameCategoryObj.getList() != null) {
            if (this.N == 0) {
                this.P.clear();
            }
            this.P.addAll(allRecommendGameCategoryObj.getList());
            this.O.notifyDataSetChanged();
        }
        if (this.P.size() > 0) {
            x1();
        } else {
            y1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33549, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        String str = this.M;
        if (str == null) {
            str = "";
        }
        jsonObject.addProperty(R, str);
        return com.max.hbutils.utils.k.p(jsonObject);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33545, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.L = getIntent().getStringExtra("title");
        this.M = getIntent().getStringExtra(R);
        this.f66616q.setTitle(this.L);
        this.f66617r.setVisibility(0);
        this.mRefreshLayout.setBackgroundResource(R.color.background_layer_2_color);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRecyclerView.addItemDecoration(new a());
        b bVar = new b(this.f66601b, this.P, R.layout.component_game_small_pic128x64);
        this.O = bVar;
        this.mRecyclerView.setAdapter(bVar);
        new com.max.xiaoheihe.module.game.adapter.v(this, this.mRecyclerView, false);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        E1();
        W1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33548, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        W1();
    }
}
