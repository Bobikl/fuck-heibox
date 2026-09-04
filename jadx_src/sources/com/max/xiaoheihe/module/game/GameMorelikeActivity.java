package com.max.xiaoheihe.module.game;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.MorelikeGameObj;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131152e3)
@ig.d(path = {lb.d.f131152e3})
public class GameMorelikeActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private List<GameObj> M = new ArrayList();
    private com.max.hbcommon.base.adapter.s<GameObj> N;
    private int O;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33341, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ((GameItemView) eVar.i(R.id.giv)).g(gameObj, GameObj.KEY_POINT_SCORE, null, true, null, eVar);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 33342, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33343, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMorelikeActivity.this.O = 0;
            GameMorelikeActivity.O1(GameMorelikeActivity.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33344, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMorelikeActivity.N1(GameMorelikeActivity.this, 30);
            GameMorelikeActivity.O1(GameMorelikeActivity.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<MorelikeGameObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33346, new Class[0], Void.TYPE).isSupported && GameMorelikeActivity.this.isActive()) {
                super.onComplete();
                GameMorelikeActivity.this.mRefreshLayout.A(0);
                GameMorelikeActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33345, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameMorelikeActivity.this.isActive()) {
                super.onError(th2);
                GameMorelikeActivity.Q1(GameMorelikeActivity.this);
                GameMorelikeActivity.this.mRefreshLayout.A(0);
                GameMorelikeActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<MorelikeGameObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33347, new Class[]{Result.class}, Void.TYPE).isSupported && GameMorelikeActivity.this.isActive()) {
                super.onNext(result);
                GameMorelikeActivity.R1(GameMorelikeActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33348, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MorelikeGameObj>) obj);
        }
    }

    static /* synthetic */ int N1(GameMorelikeActivity gameMorelikeActivity, int i10) {
        int i11 = gameMorelikeActivity.O + i10;
        gameMorelikeActivity.O = i11;
        return i11;
    }

    static /* synthetic */ void O1(GameMorelikeActivity gameMorelikeActivity) {
        if (PatchProxy.proxy(new Object[]{gameMorelikeActivity}, null, changeQuickRedirect, true, 33338, new Class[]{GameMorelikeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMorelikeActivity.T1();
    }

    static /* synthetic */ void Q1(GameMorelikeActivity gameMorelikeActivity) {
        if (PatchProxy.proxy(new Object[]{gameMorelikeActivity}, null, changeQuickRedirect, true, 33339, new Class[]{GameMorelikeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMorelikeActivity.C1();
    }

    static /* synthetic */ void R1(GameMorelikeActivity gameMorelikeActivity, MorelikeGameObj morelikeGameObj) {
        if (PatchProxy.proxy(new Object[]{gameMorelikeActivity, morelikeGameObj}, null, changeQuickRedirect, true, 33340, new Class[]{GameMorelikeActivity.class, MorelikeGameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMorelikeActivity.V1(morelikeGameObj);
    }

    private void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z0(this.L, this.O, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void V1(MorelikeGameObj morelikeGameObj) {
        if (PatchProxy.proxy(new Object[]{morelikeGameObj}, this, changeQuickRedirect, false, 33335, new Class[]{MorelikeGameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (morelikeGameObj == null || morelikeGameObj.getApps() == null) {
            return;
        }
        if (this.O == 0) {
            this.M.clear();
        }
        this.M.addAll(morelikeGameObj.getApps());
        this.N.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33337, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.L);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33333, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.L = getIntent().getStringExtra("app_id");
        this.f66616q.setTitle("相似游戏");
        this.f66617r.setVisibility(0);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b, 1, false));
        a aVar = new a(this.f66601b, this.M, R.layout.component_game_game_list_normal);
        this.N = aVar;
        this.mRecyclerView.setAdapter(aVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        new com.max.xiaoheihe.module.game.adapter.v(this, this.mRecyclerView, false);
        E1();
        T1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33336, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        this.O = 0;
        T1();
    }
}
