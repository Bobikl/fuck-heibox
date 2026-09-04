package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameCompilationDetailObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationGameListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f84189g = "game_header";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameListHeaderObj f84190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<GameObj> f84191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<GameObj> f84192d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f84193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f84194f;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 32653, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) GameCompilationGameListFragment.this).mContext, 12.0f);
            rect.set(iF, childAdapterPosition == 0 ? iF : 0, iF, iF);
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84197b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f84198c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f84199d;

            a(String str, String str2, String str3) {
                this.f84197b = str;
                this.f84198c = str2;
                this.f84199d = str3;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32656, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) GameCompilationGameListFragment.this).mContext.startActivity(z.b(((com.max.hbcommon.base.d) GameCompilationGameListFragment.this).mContext, this.f84197b, this.f84198c, this.f84199d, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 32654, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ((GameItemView) eVar.i(R.id.giv)).g(gameObj, GameObj.KEY_POINT_SCORE, null, true, null, eVar);
            eVar.b().setOnClickListener(new a(gameObj.getH_src(), gameObj.getAppid(), gameObj.getGame_type()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 32655, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32657, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationGameListFragment.this.f84193e = 0;
            GameCompilationGameListFragment.Q3(GameCompilationGameListFragment.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32658, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationGameListFragment.P3(GameCompilationGameListFragment.this, 30);
            GameCompilationGameListFragment.Q3(GameCompilationGameListFragment.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<GameCompilationDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32660, new Class[0], Void.TYPE).isSupported && GameCompilationGameListFragment.this.isActive()) {
                super.onComplete();
                GameCompilationGameListFragment.this.mRefreshLayout.A(0);
                GameCompilationGameListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32659, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameCompilationGameListFragment.this.isActive()) {
                super.onError(th2);
                GameCompilationGameListFragment.R3(GameCompilationGameListFragment.this);
                GameCompilationGameListFragment.this.mRefreshLayout.A(0);
                GameCompilationGameListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameCompilationDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32661, new Class[]{Result.class}, Void.TYPE).isSupported && GameCompilationGameListFragment.this.isActive()) {
                super.onNext(result);
                GameCompilationGameListFragment.S3(GameCompilationGameListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32662, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameCompilationDetailObj>) obj);
        }
    }

    public interface f {
        void W1(GameCompilationDetailObj gameCompilationDetailObj);
    }

    static /* synthetic */ int P3(GameCompilationGameListFragment gameCompilationGameListFragment, int i10) {
        int i11 = gameCompilationGameListFragment.f84193e + i10;
        gameCompilationGameListFragment.f84193e = i11;
        return i11;
    }

    static /* synthetic */ void Q3(GameCompilationGameListFragment gameCompilationGameListFragment) {
        if (PatchProxy.proxy(new Object[]{gameCompilationGameListFragment}, null, changeQuickRedirect, true, 32650, new Class[]{GameCompilationGameListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationGameListFragment.T3();
    }

    static /* synthetic */ void R3(GameCompilationGameListFragment gameCompilationGameListFragment) {
        if (PatchProxy.proxy(new Object[]{gameCompilationGameListFragment}, null, changeQuickRedirect, true, 32651, new Class[]{GameCompilationGameListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationGameListFragment.showError();
    }

    static /* synthetic */ void S3(GameCompilationGameListFragment gameCompilationGameListFragment, GameCompilationDetailObj gameCompilationDetailObj) {
        if (PatchProxy.proxy(new Object[]{gameCompilationGameListFragment, gameCompilationDetailObj}, null, changeQuickRedirect, true, 32652, new Class[]{GameCompilationGameListFragment.class, GameCompilationDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCompilationGameListFragment.V3(gameCompilationDetailObj);
    }

    private void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32647, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F4(this.f84190b.getCompilation_id(), this.f84193e, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static GameCompilationGameListFragment U3(GameListHeaderObj gameListHeaderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameListHeaderObj}, null, changeQuickRedirect, true, 32643, new Class[]{GameListHeaderObj.class}, GameCompilationGameListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCompilationGameListFragment) patchProxyResultProxy.result;
        }
        GameCompilationGameListFragment gameCompilationGameListFragment = new GameCompilationGameListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f84189g, gameListHeaderObj);
        gameCompilationGameListFragment.setArguments(bundle);
        return gameCompilationGameListFragment;
    }

    private void V3(GameCompilationDetailObj gameCompilationDetailObj) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailObj}, this, changeQuickRedirect, false, 32648, new Class[]{GameCompilationDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        f fVar = this.f84194f;
        if (fVar != null) {
            fVar.W1(gameCompilationDetailObj);
        }
        if (gameCompilationDetailObj == null || gameCompilationDetailObj.getGames() == null) {
            return;
        }
        if (this.f84193e == 0) {
            this.f84192d.clear();
        }
        this.f84192d.addAll(gameCompilationDetailObj.getGames());
        this.f84191c.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32646, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f84190b = (GameListHeaderObj) getArguments().getSerializable(f84189g);
        }
        this.mRefreshLayout.setBackground(com.max.hbutils.utils.q.p(this.mContext, R.color.white, 12.0f, 12.0f, 0.0f, 0.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addItemDecoration(new a());
        b bVar = new b(this.mContext, this.f84192d, R.layout.component_game_small_pic128x64);
        this.f84191c = bVar;
        this.mRecyclerView.setAdapter(bVar);
        new com.max.xiaoheihe.module.game.adapter.v(this, this.mRecyclerView, false);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        showLoading();
        T3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 32644, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof f) {
            this.f84194f = (f) getParentFragment();
            return;
        }
        if (context instanceof f) {
            this.f84194f = (f) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement GameCompilationGameListListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32645, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f84194f = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32649, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        T3();
    }
}
