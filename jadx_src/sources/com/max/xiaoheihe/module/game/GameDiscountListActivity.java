package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.GameDiscountListObj;
import com.max.xiaoheihe.bean.game.GameDiscountListResultObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.SetPushStateActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameDiscountListActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131293y4)
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(path = {lb.d.W4, lb.d.f131293y4})
public final class GameDiscountListActivity extends BaseActivity {
    public static final int Q = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private df.g0 L;

    @dl.d
    private final List<GameDiscountListObj> M = new ArrayList();

    @dl.e
    private com.max.xiaoheihe.module.game.adapter.s N;

    @dl.e
    private String O;
    private boolean P;

    /* JADX INFO: compiled from: GameDiscountListActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<GameDiscountListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33056, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GameDiscountListActivity.this.isActive()) {
                df.g0 g0Var = GameDiscountListActivity.this.L;
                df.g0 g0Var2 = null;
                if (g0Var == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    g0Var = null;
                }
                g0Var.f110741e.A(0);
                df.g0 g0Var3 = GameDiscountListActivity.this.L;
                if (g0Var3 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    g0Var2 = g0Var3;
                }
                g0Var2.f110741e.p(0);
                if (GameDiscountListActivity.this.O == null) {
                    GameDiscountListActivity.R1(GameDiscountListActivity.this);
                }
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<GameDiscountListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33057, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GameDiscountListActivity.this.isActive()) {
                GameDiscountListActivity.this.V1(result.getResult());
                df.g0 g0Var = GameDiscountListActivity.this.L;
                df.g0 g0Var2 = null;
                if (g0Var == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                    g0Var = null;
                }
                g0Var.f110741e.A(0);
                df.g0 g0Var3 = GameDiscountListActivity.this.L;
                if (g0Var3 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    g0Var2 = g0Var3;
                }
                g0Var2.f110741e.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33058, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameDiscountListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameDiscountListActivity.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33059, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GameDiscountListActivity.this.O = null;
            GameDiscountListActivity.this.T1();
        }
    }

    /* JADX INFO: compiled from: GameDiscountListActivity.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33060, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GameDiscountListActivity.this.T1();
        }
    }

    /* JADX INFO: compiled from: GameDiscountListActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33061, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.i0.e(((BaseActivity) GameDiscountListActivity.this).f66601b)) {
                com.max.xiaoheihe.utils.d.G1(((BaseActivity) GameDiscountListActivity.this).f66601b, SetPushStateActivity.Q.a(((BaseActivity) GameDiscountListActivity.this).f66601b));
            }
            df.g0 g0Var = GameDiscountListActivity.this.L;
            if (g0Var == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                g0Var = null;
            }
            g0Var.f110743g.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: GameDiscountListActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33062, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.g0 g0Var = GameDiscountListActivity.this.L;
            if (g0Var == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                g0Var = null;
            }
            g0Var.f110743g.setVisibility(8);
        }
    }

    public static final /* synthetic */ void R1(GameDiscountListActivity gameDiscountListActivity) {
        if (PatchProxy.proxy(new Object[]{gameDiscountListActivity}, null, changeQuickRedirect, true, 33055, new Class[]{GameDiscountListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDiscountListActivity.C1();
    }

    public final void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33052, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P4(this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    public final void V1(@dl.e GameDiscountListResultObj gameDiscountListResultObj) {
        if (PatchProxy.proxy(new Object[]{gameDiscountListResultObj}, this, changeQuickRedirect, false, 33053, new Class[]{GameDiscountListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.O == null) {
            this.M.clear();
            if (gameDiscountListResultObj == null || com.max.hbcommon.utils.c.w(gameDiscountListResultObj.getMsg_list())) {
                y1();
                return;
            }
            df.g0 g0Var = this.L;
            if (g0Var == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                g0Var = null;
            }
            g0Var.f110743g.setVisibility((!gameDiscountListResultObj.getPush_state() || this.P) ? 0 : 8);
        }
        List[] listArr = new List[1];
        listArr[0] = gameDiscountListResultObj != null ? gameDiscountListResultObj.getMsg_list() : null;
        if (!com.max.hbcommon.utils.c.w(listArr)) {
            this.M.size();
            if (gameDiscountListResultObj != null && gameDiscountListResultObj.getMsg_list() != null) {
                for (GameDiscountListObj gameDiscountListObj : gameDiscountListResultObj.getMsg_list()) {
                    if (gameDiscountListObj.getGame_list() != null) {
                        String description = gameDiscountListObj.getDescription();
                        String datetime = gameDiscountListObj.getDatetime();
                        List<GameObj> game_list = gameDiscountListObj.getGame_list();
                        kotlin.jvm.internal.f0.m(game_list);
                        this.M.add(new GameDiscountListObj(description, datetime, null, game_list.size(), gameDiscountListObj.getTotal(), gameDiscountListObj.getPlatform(), gameDiscountListObj.getTimestamp(), null, gameDiscountListObj.getPlatform_icon(), gameDiscountListObj.getMax_discount(), 1));
                        if (gameDiscountListObj.getGame_list() != null) {
                            List<GameObj> game_list2 = gameDiscountListObj.getGame_list();
                            kotlin.jvm.internal.f0.m(game_list2);
                            for (GameObj gameObj : game_list2) {
                                List<GameObj> game_list3 = gameDiscountListObj.getGame_list();
                                kotlin.jvm.internal.f0.m(game_list3);
                                this.M.add(new GameDiscountListObj(null, null, null, game_list3.size(), gameDiscountListObj.getTotal(), gameDiscountListObj.getPlatform(), null, gameObj, null, null, 0));
                            }
                        }
                        List<GameObj> game_list4 = gameDiscountListObj.getGame_list();
                        kotlin.jvm.internal.f0.m(game_list4);
                        this.M.add(new GameDiscountListObj(null, null, null, game_list4.size(), gameDiscountListObj.getTotal(), gameDiscountListObj.getPlatform(), gameDiscountListObj.getTimestamp(), null, null, null, 2));
                    }
                }
            }
            com.max.xiaoheihe.module.game.adapter.s sVar = this.N;
            if (sVar != null) {
                sVar.notifyDataSetChanged();
            }
            this.O = gameDiscountListResultObj != null ? gameDiscountListResultObj.getLast_timestamp() : null;
        }
        x1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33051, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        df.g0 g0VarC = df.g0.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(g0VarC, "inflate(layoutInflater)");
        this.L = g0VarC;
        df.g0 g0Var = null;
        if (g0VarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0VarC = null;
        }
        setContentView(g0VarC.b());
        this.f66616q.setTitle("游戏优惠");
        df.g0 g0Var2 = this.L;
        if (g0Var2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var2 = null;
        }
        g0Var2.f110740d.setLayoutManager(new LinearLayoutManager(this));
        this.N = new com.max.xiaoheihe.module.game.adapter.s(this, this.M);
        df.g0 g0Var3 = this.L;
        if (g0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var3 = null;
        }
        g0Var3.f110740d.setAdapter(this.N);
        df.g0 g0Var4 = this.L;
        if (g0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var4 = null;
        }
        RecyclerView recyclerView = g0Var4.f110740d;
        kotlin.jvm.internal.f0.o(recyclerView, "mBinding.rv");
        new com.max.xiaoheihe.module.game.adapter.v(this, recyclerView, false, null, 8, null);
        df.g0 g0Var5 = this.L;
        if (g0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var5 = null;
        }
        g0Var5.f110741e.b0(true);
        df.g0 g0Var6 = this.L;
        if (g0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var6 = null;
        }
        g0Var6.f110741e.i0(true);
        df.g0 g0Var7 = this.L;
        if (g0Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var7 = null;
        }
        g0Var7.f110741e.S(new b());
        df.g0 g0Var8 = this.L;
        if (g0Var8 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var8 = null;
        }
        g0Var8.f110741e.f0(new c());
        df.g0 g0Var9 = this.L;
        if (g0Var9 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            g0Var9 = null;
        }
        g0Var9.f110742f.setOnClickListener(new d());
        df.g0 g0Var10 = this.L;
        if (g0Var10 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            g0Var = g0Var10;
        }
        g0Var.f110738b.setOnClickListener(new e());
        E1();
        T1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33054, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        this.O = null;
        E1();
        T1();
    }
}
