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
import com.max.xiaoheihe.bean.game.GameDeveloperObj;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameDeveloperListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f84440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f84441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<GameDeveloperObj> f84442d = new ArrayList();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a extends com.max.hbcommon.base.adapter.s<GameDeveloperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameDeveloperListFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0748a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameDeveloperObj f84444b;

            ViewOnClickListenerC0748a(GameDeveloperObj gameDeveloperObj) {
                this.f84444b = gameDeveloperObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33043, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.d) GameDeveloperListFragment.this).mContext.startActivity(GameDeveloperDetailActivity.o2(((com.max.hbcommon.base.d) GameDeveloperListFragment.this).mContext, this.f84444b.getDvpid()));
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameDeveloperObj gameDeveloperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameDeveloperObj}, this, changeQuickRedirect, false, 33041, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameDeveloperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            r1.t1(eVar, gameDeveloperObj);
            View viewI = eVar.i(R.id.divider);
            View viewB = eVar.b();
            if (eVar.getAdapterPosition() == getItemCount() - 1) {
                viewI.setVisibility(8);
            } else {
                viewI.setVisibility(0);
            }
            viewB.setOnClickListener(new ViewOnClickListenerC0748a(gameDeveloperObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameDeveloperObj gameDeveloperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameDeveloperObj}, this, changeQuickRedirect, false, 33042, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameDeveloperObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33044, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDeveloperListFragment.this.f84440b = 0;
            GameDeveloperListFragment.P3(GameDeveloperListFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33045, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDeveloperListFragment.O3(GameDeveloperListFragment.this, 30);
            GameDeveloperListFragment.P3(GameDeveloperListFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33046, new Class[0], Void.TYPE).isSupported && GameDeveloperListFragment.this.isActive()) {
                super.onComplete();
                GameDeveloperListFragment.this.mRefreshLayout.A(0);
                GameDeveloperListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33047, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameDeveloperListFragment.this.isActive()) {
                super.onError(th2);
                GameDeveloperListFragment.Q3(GameDeveloperListFragment.this);
                GameDeveloperListFragment.this.mRefreshLayout.A(0);
                GameDeveloperListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33048, new Class[]{Result.class}, Void.TYPE).isSupported && GameDeveloperListFragment.this.isActive()) {
                super.onNext(result);
                GameDeveloperListFragment.R3(GameDeveloperListFragment.this, result.getResult().getDevelopers());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33049, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    static /* synthetic */ int O3(GameDeveloperListFragment gameDeveloperListFragment, int i10) {
        int i11 = gameDeveloperListFragment.f84440b + i10;
        gameDeveloperListFragment.f84440b = i11;
        return i11;
    }

    static /* synthetic */ void P3(GameDeveloperListFragment gameDeveloperListFragment) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperListFragment}, null, changeQuickRedirect, true, 33038, new Class[]{GameDeveloperListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperListFragment.S3();
    }

    static /* synthetic */ void Q3(GameDeveloperListFragment gameDeveloperListFragment) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperListFragment}, null, changeQuickRedirect, true, 33039, new Class[]{GameDeveloperListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperListFragment.showError();
    }

    static /* synthetic */ void R3(GameDeveloperListFragment gameDeveloperListFragment, List list) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperListFragment, list}, null, changeQuickRedirect, true, 33040, new Class[]{GameDeveloperListFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperListFragment.U3(list);
    }

    private void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C9(this.f84440b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static GameDeveloperListFragment T3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33033, new Class[0], GameDeveloperListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDeveloperListFragment) patchProxyResultProxy.result;
        }
        GameDeveloperListFragment gameDeveloperListFragment = new GameDeveloperListFragment();
        gameDeveloperListFragment.setArguments(new Bundle());
        return gameDeveloperListFragment;
    }

    private void U3(List<GameDeveloperObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33036, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f84440b == 0) {
                this.f84442d.clear();
            }
            this.f84442d.addAll(list);
            this.f84441c.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33034, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        com.max.hbcommon.base.adapter.t tVar = new com.max.hbcommon.base.adapter.t(new a(this.mContext, this.f84442d, R.layout.item_game_developer));
        this.f84441c = tVar;
        this.mRecyclerView.setAdapter(tVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        showLoading();
        S3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33037, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        S3();
    }
}
