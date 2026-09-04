package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameMonthlyPlayerInfoObj;
import com.max.xiaoheihe.bean.game.GamePlayStatObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameMonthlyPlayerActivty extends BaseActivity {
    private static final String P = "GameMonthlyPlayerActivty";
    private static final String Q = "steam_appid";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<GameMonthlyPlayerInfoObj> L = new ArrayList();
    private com.max.hbcommon.base.adapter.s<GameMonthlyPlayerInfoObj> M;
    private com.max.hbcommon.base.adapter.t N;
    private String O;

    @BindView(R.id.rv)
    RecyclerView mRvList;

    @BindView(R.id.srl)
    SmartRefreshLayout mSmartRefreshLayout;

    public class a extends com.max.hbcommon.base.adapter.s<GameMonthlyPlayerInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameMonthlyPlayerInfoObj gameMonthlyPlayerInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameMonthlyPlayerInfoObj}, this, changeQuickRedirect, false, 33325, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameMonthlyPlayerInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            r1.F1(eVar.itemView, gameMonthlyPlayerInfoObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameMonthlyPlayerInfoObj gameMonthlyPlayerInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameMonthlyPlayerInfoObj}, this, changeQuickRedirect, false, 33326, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameMonthlyPlayerInfoObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33327, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMonthlyPlayerActivty.M1(GameMonthlyPlayerActivty.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<GamePlayStatObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            SmartRefreshLayout smartRefreshLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33329, new Class[0], Void.TYPE).isSupported || !GameMonthlyPlayerActivty.this.isActive() || (smartRefreshLayout = GameMonthlyPlayerActivty.this.mSmartRefreshLayout) == null) {
                return;
            }
            smartRefreshLayout.A(0);
            GameMonthlyPlayerActivty.this.mSmartRefreshLayout.p(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33328, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameMonthlyPlayerActivty.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = GameMonthlyPlayerActivty.this.mSmartRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                    GameMonthlyPlayerActivty.this.mSmartRefreshLayout.p(0);
                }
                super.onError(th2);
                GameMonthlyPlayerActivty.N1(GameMonthlyPlayerActivty.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<GamePlayStatObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33330, new Class[]{Result.class}, Void.TYPE).isSupported && GameMonthlyPlayerActivty.this.isActive()) {
                if (result == null || result.getResult().getMonthly_player() == null) {
                    GameMonthlyPlayerActivty.Q1(GameMonthlyPlayerActivty.this);
                } else {
                    GameMonthlyPlayerActivty.O1(GameMonthlyPlayerActivty.this, result.getResult().getMonthly_player());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33331, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePlayStatObj>) obj);
        }
    }

    static /* synthetic */ void M1(GameMonthlyPlayerActivty gameMonthlyPlayerActivty) {
        if (PatchProxy.proxy(new Object[]{gameMonthlyPlayerActivty}, null, changeQuickRedirect, true, 33321, new Class[]{GameMonthlyPlayerActivty.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMonthlyPlayerActivty.R1();
    }

    static /* synthetic */ void N1(GameMonthlyPlayerActivty gameMonthlyPlayerActivty) {
        if (PatchProxy.proxy(new Object[]{gameMonthlyPlayerActivty}, null, changeQuickRedirect, true, 33322, new Class[]{GameMonthlyPlayerActivty.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMonthlyPlayerActivty.C1();
    }

    static /* synthetic */ void O1(GameMonthlyPlayerActivty gameMonthlyPlayerActivty, List list) {
        if (PatchProxy.proxy(new Object[]{gameMonthlyPlayerActivty, list}, null, changeQuickRedirect, true, 33323, new Class[]{GameMonthlyPlayerActivty.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMonthlyPlayerActivty.V1(list);
    }

    static /* synthetic */ void Q1(GameMonthlyPlayerActivty gameMonthlyPlayerActivty) {
        if (PatchProxy.proxy(new Object[]{gameMonthlyPlayerActivty}, null, changeQuickRedirect, true, 33324, new Class[]{GameMonthlyPlayerActivty.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMonthlyPlayerActivty.C1();
    }

    private void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33318, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C0(this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static Intent T1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 33316, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameMonthlyPlayerActivty.class);
        intent.putExtra("steam_appid", str);
        return intent;
    }

    private void V1(List<GameMonthlyPlayerInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33320, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.L.clear();
        if (!com.max.hbcommon.utils.c.w(list)) {
            this.L.addAll(list);
        }
        this.N.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33317, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.f66620u = ButterKnife.a(this);
        this.O = getIntent().getStringExtra("steam_appid");
        this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.monthly_player));
        this.mRvList.setLayoutManager(new LinearLayoutManager(this.f66601b));
        a aVar = new a(this.f66601b, this.L, R.layout.item_game_monthly_player_stat);
        this.M = aVar;
        this.N = new com.max.hbcommon.base.adapter.t(aVar);
        this.N.p(R.layout.header_game_monthly_player_stat, this.f66601b.getLayoutInflater().inflate(R.layout.header_game_monthly_player_stat, (ViewGroup) this.mRvList, false));
        this.mRvList.addItemDecoration(new com.max.hbcommon.base.adapter.i(this.f66601b));
        this.mRvList.setAdapter(this.N);
        this.mSmartRefreshLayout.S(new b());
        this.mSmartRefreshLayout.b0(false);
        E1();
        R1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33319, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        R1();
    }
}
