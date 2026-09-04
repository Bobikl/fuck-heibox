package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameMobileBundleObj;
import com.max.xiaoheihe.bean.game.GameMobileBundlesCategoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileSortedGiftsFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f84547g = "sort_type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s f84548b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f84551e;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<GameMobileBundleObj> f84549c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.adapter.d0 f84552f = new com.max.xiaoheihe.module.game.adapter.d0();

    public class a extends com.max.hbcommon.base.adapter.s<GameMobileBundleObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameMobileBundleObj gameMobileBundleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameMobileBundleObj}, this, changeQuickRedirect, false, 33307, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameMobileBundleObj.class}, Void.TYPE).isSupported) {
                return;
            }
            r1.D1(eVar, gameMobileBundleObj);
            GameMobileSortedGiftsFragment.this.f84552f.b(eVar, gameMobileBundleObj, true);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameMobileBundleObj gameMobileBundleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameMobileBundleObj}, this, changeQuickRedirect, false, 33308, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameMobileBundleObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33309, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMobileSortedGiftsFragment.this.f84551e = 0;
            GameMobileSortedGiftsFragment.O3(GameMobileSortedGiftsFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33310, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMobileSortedGiftsFragment.N3(GameMobileSortedGiftsFragment.this, 30);
            GameMobileSortedGiftsFragment.O3(GameMobileSortedGiftsFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameMobileBundlesCategoryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33311, new Class[0], Void.TYPE).isSupported && GameMobileSortedGiftsFragment.this.isActive()) {
                super.onComplete();
                GameMobileSortedGiftsFragment.this.mRefreshLayout.A(0);
                GameMobileSortedGiftsFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33312, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameMobileSortedGiftsFragment.this.isActive()) {
                super.onError(th2);
                GameMobileSortedGiftsFragment.P3(GameMobileSortedGiftsFragment.this);
                GameMobileSortedGiftsFragment.this.mRefreshLayout.A(0);
                GameMobileSortedGiftsFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameMobileBundlesCategoryObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33313, new Class[]{Result.class}, Void.TYPE).isSupported && GameMobileSortedGiftsFragment.this.isActive()) {
                super.onNext(result);
                GameMobileSortedGiftsFragment.Q3(GameMobileSortedGiftsFragment.this, result.getResult() != null ? result.getResult().getList() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33314, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameMobileBundlesCategoryObj>) obj);
        }
    }

    static /* synthetic */ int N3(GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment, int i10) {
        int i11 = gameMobileSortedGiftsFragment.f84551e + i10;
        gameMobileSortedGiftsFragment.f84551e = i11;
        return i11;
    }

    static /* synthetic */ void O3(GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment) {
        if (PatchProxy.proxy(new Object[]{gameMobileSortedGiftsFragment}, null, changeQuickRedirect, true, 33304, new Class[]{GameMobileSortedGiftsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileSortedGiftsFragment.R3();
    }

    static /* synthetic */ void P3(GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment) {
        if (PatchProxy.proxy(new Object[]{gameMobileSortedGiftsFragment}, null, changeQuickRedirect, true, 33305, new Class[]{GameMobileSortedGiftsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileSortedGiftsFragment.showError();
    }

    static /* synthetic */ void Q3(GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment, List list) {
        if (PatchProxy.proxy(new Object[]{gameMobileSortedGiftsFragment, list}, null, changeQuickRedirect, true, 33306, new Class[]{GameMobileSortedGiftsFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileSortedGiftsFragment.T3(list);
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33300, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o4(this.f84550d, this.f84551e, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static GameMobileSortedGiftsFragment S3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 33298, new Class[]{String.class}, GameMobileSortedGiftsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMobileSortedGiftsFragment) patchProxyResultProxy.result;
        }
        GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment = new GameMobileSortedGiftsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f84547g, str);
        gameMobileSortedGiftsFragment.setArguments(bundle);
        return gameMobileSortedGiftsFragment;
    }

    private void T3(List<GameMobileBundleObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33301, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f84551e == 0) {
            this.f84549c.clear();
        }
        if (list != null) {
            this.f84549c.addAll(list);
        }
        this.f84548b.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33299, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f84550d = getArguments().getString(f84547g);
        }
        this.mRefreshLayout.setBackgroundColor(getResources().getColor(R.color.white));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        a aVar = new a(this.mContext, this.f84549c, R.layout.item_game_mobile_bundle);
        this.f84548b = aVar;
        this.mRecyclerView.setAdapter(aVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        showLoading();
        R3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33303, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84552f.c();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33302, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        R3();
    }
}
