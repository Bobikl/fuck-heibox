package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.AllRecommendGameCategoryObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameCommentsRecommendedListActivity extends BaseActivity {
    private static final String P = "title";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private com.max.hbcommon.base.adapter.s<RecommendGameListItemObj> N;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;
    private int M = 0;
    private List<RecommendGameListItemObj> O = new ArrayList();

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32549, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemCount = recyclerView.getAdapter().getItemCount();
            int iF = ViewUtils.f(((BaseActivity) GameCommentsRecommendedListActivity.this).f66601b, 4.0f);
            int iF2 = ViewUtils.f(((BaseActivity) GameCommentsRecommendedListActivity.this).f66601b, 4.0f);
            int i10 = childAdapterPosition == 0 ? iF2 : 0;
            if (childAdapterPosition == itemCount - 1) {
                iF = iF2;
            }
            rect.set(iF2, i10, iF2, iF);
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<RecommendGameListItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, RecommendGameListItemObj recommendGameListItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, recommendGameListItemObj}, this, changeQuickRedirect, false, 32550, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RecommendGameListItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            r1.g1(eVar, recommendGameListItemObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, RecommendGameListItemObj recommendGameListItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, recommendGameListItemObj}, this, changeQuickRedirect, false, 32551, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
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
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32552, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCommentsRecommendedListActivity.this.M = 0;
            GameCommentsRecommendedListActivity.R1(GameCommentsRecommendedListActivity.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32553, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCommentsRecommendedListActivity.Q1(GameCommentsRecommendedListActivity.this, 30);
            GameCommentsRecommendedListActivity.R1(GameCommentsRecommendedListActivity.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<AllRecommendGameCategoryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32555, new Class[0], Void.TYPE).isSupported && GameCommentsRecommendedListActivity.this.isActive()) {
                super.onComplete();
                GameCommentsRecommendedListActivity.this.mRefreshLayout.A(0);
                GameCommentsRecommendedListActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32554, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameCommentsRecommendedListActivity.this.isActive()) {
                super.onError(th2);
                GameCommentsRecommendedListActivity.T1(GameCommentsRecommendedListActivity.this);
                GameCommentsRecommendedListActivity.this.mRefreshLayout.A(0);
                GameCommentsRecommendedListActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<AllRecommendGameCategoryObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32556, new Class[]{Result.class}, Void.TYPE).isSupported && GameCommentsRecommendedListActivity.this.isActive()) {
                super.onNext(result);
                GameCommentsRecommendedListActivity.V1(GameCommentsRecommendedListActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32557, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AllRecommendGameCategoryObj>) obj);
        }
    }

    static /* synthetic */ int Q1(GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity, int i10) {
        int i11 = gameCommentsRecommendedListActivity.M + i10;
        gameCommentsRecommendedListActivity.M = i11;
        return i11;
    }

    static /* synthetic */ void R1(GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity) {
        if (PatchProxy.proxy(new Object[]{gameCommentsRecommendedListActivity}, null, changeQuickRedirect, true, 32546, new Class[]{GameCommentsRecommendedListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCommentsRecommendedListActivity.X1();
    }

    static /* synthetic */ void T1(GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity) {
        if (PatchProxy.proxy(new Object[]{gameCommentsRecommendedListActivity}, null, changeQuickRedirect, true, 32547, new Class[]{GameCommentsRecommendedListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCommentsRecommendedListActivity.C1();
    }

    static /* synthetic */ void V1(GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity, AllRecommendGameCategoryObj allRecommendGameCategoryObj) {
        if (PatchProxy.proxy(new Object[]{gameCommentsRecommendedListActivity, allRecommendGameCategoryObj}, null, changeQuickRedirect, true, 32548, new Class[]{GameCommentsRecommendedListActivity.class, AllRecommendGameCategoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCommentsRecommendedListActivity.Y1(allRecommendGameCategoryObj);
    }

    public static Intent W1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 32541, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameCommentsRecommendedListActivity.class);
        intent.putExtra("title", str);
        return intent;
    }

    private void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32543, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J9(this.M, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void Y1(AllRecommendGameCategoryObj allRecommendGameCategoryObj) {
        if (PatchProxy.proxy(new Object[]{allRecommendGameCategoryObj}, this, changeQuickRedirect, false, 32544, new Class[]{AllRecommendGameCategoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (allRecommendGameCategoryObj != null && allRecommendGameCategoryObj.getList() != null) {
            if (this.M == 0) {
                this.O.clear();
            }
            this.O.addAll(allRecommendGameCategoryObj.getList());
            this.N.notifyDataSetChanged();
        }
        if (this.O.size() > 0) {
            x1();
        } else {
            y1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32542, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        String stringExtra = getIntent().getStringExtra("title");
        this.L = stringExtra;
        this.f66616q.setTitle(stringExtra);
        this.f66617r.setVisibility(0);
        this.mRefreshLayout.setBackgroundDrawable(getResources().getDrawable(R.color.white));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRecyclerView.addItemDecoration(new a());
        b bVar = new b(this.f66601b, this.O, R.layout.component_game_recommend_h126);
        this.N = bVar;
        this.mRecyclerView.setAdapter(bVar);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        E1();
        X1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32545, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        X1();
    }
}
