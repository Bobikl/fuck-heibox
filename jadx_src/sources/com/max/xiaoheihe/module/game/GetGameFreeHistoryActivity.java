package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GetGameHistoryListObj;
import com.max.xiaoheihe.bean.game.GetGameHistoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GetGameFreeHistoryActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GetGameFreeHistoryActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;

    @dl.d
    public static final String S = "platform_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    public mb.b1 L;

    @dl.e
    private String M;

    @dl.e
    private String N;

    @dl.e
    private com.max.xiaoheihe.module.game.adapter.b0 O;

    @dl.d
    private List<GetGameHistoryObj> P = new ArrayList();

    /* JADX INFO: compiled from: GetGameFreeHistoryActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 35020, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) GetGameFreeHistoryActivity.class);
            intent.putExtra(GetGameFreeHistoryActivity.S, str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: GetGameFreeHistoryActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<GetGameHistoryListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35021, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GetGameFreeHistoryActivity.this.isActive()) {
                super.onError(e10);
                GetGameFreeHistoryActivity.this.T1().f131496c.P();
                GetGameFreeHistoryActivity.this.T1().f131496c.w();
                GetGameFreeHistoryActivity.N1(GetGameFreeHistoryActivity.this);
            }
        }

        public void onNext(@dl.d Result<GetGameHistoryListObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 35022, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            if (GetGameFreeHistoryActivity.this.isActive()) {
                super.onNext(t10);
                GetGameFreeHistoryActivity.this.T1().f131496c.P();
                GetGameFreeHistoryActivity.this.T1().f131496c.w();
                GetGameFreeHistoryActivity.this.Q1(t10.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35023, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GetGameHistoryListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GetGameFreeHistoryActivity.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 35024, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GetGameFreeHistoryActivity.this.N = null;
            GetGameFreeHistoryActivity.this.O1();
        }
    }

    /* JADX INFO: compiled from: GetGameFreeHistoryActivity.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 35025, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GetGameFreeHistoryActivity.this.O1();
        }
    }

    public static final /* synthetic */ void N1(GetGameFreeHistoryActivity getGameFreeHistoryActivity) {
        if (PatchProxy.proxy(new Object[]{getGameFreeHistoryActivity}, null, changeQuickRedirect, true, 35019, new Class[]{GetGameFreeHistoryActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFreeHistoryActivity.C1();
    }

    @dl.d
    @xh.m
    public static final Intent R1(@dl.d Context context, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 35018, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : Q.a(context, str);
    }

    private final void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T1().f131495b.setLayoutManager(new LinearLayoutManager(this.f66601b));
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        this.O = new com.max.xiaoheihe.module.game.adapter.b0(mContext, this.P);
        T1().f131495b.setAdapter(this.O);
        T1().f131496c.setBackgroundColor(getResources().getColor(R.color.background_layer_2_color));
        T1().f131496c.S(new c());
        T1().f131496c.f0(new d());
    }

    public final void O1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.M;
        if ("steam".equals(str)) {
            str = null;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C6(str, this.N).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    public final void Q1(@dl.e GetGameHistoryListObj getGameHistoryListObj) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{getGameHistoryListObj}, this, changeQuickRedirect, false, 35016, new Class[]{GetGameHistoryListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (getGameHistoryListObj != null) {
            if (this.N == null) {
                this.P.clear();
            }
            if (!com.max.hbcommon.utils.c.w(getGameHistoryListObj.getGames())) {
                this.N = getGameHistoryListObj.getLast_time();
                if (this.P.size() > 0) {
                    String key = getGameHistoryListObj.getGames().get(0).getKey();
                    if (key != null) {
                        List<GetGameHistoryObj> list = this.P;
                        if (key.equals(list.get(list.size() - 1).getKey())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        List<GetGameHistoryObj> list2 = this.P;
                        list2.get(list2.size() - 1).getValue().addAll(getGameHistoryListObj.getGames().get(0).getValue());
                        getGameHistoryListObj.getGames().remove(0);
                    }
                }
                this.P.addAll(getGameHistoryListObj.getGames());
                com.max.xiaoheihe.module.game.adapter.b0 b0Var = this.O;
                if (b0Var != null) {
                    b0Var.notifyDataSetChanged();
                }
                x1();
                return;
            }
        }
        if (this.N == null) {
            y1();
        }
    }

    @dl.d
    public final mb.b1 T1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35011, new Class[0], mb.b1.class);
        if (patchProxyResultProxy.isSupported) {
            return (mb.b1) patchProxyResultProxy.result;
        }
        mb.b1 b1Var = this.L;
        if (b1Var != null) {
            return b1Var;
        }
        kotlin.jvm.internal.f0.S("mBinding");
        return null;
    }

    public final void W1(@dl.d mb.b1 b1Var) {
        if (PatchProxy.proxy(new Object[]{b1Var}, this, changeQuickRedirect, false, 35012, new Class[]{mb.b1.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(b1Var, "<set-?>");
        this.L = b1Var;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35013, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        mb.b1 b1VarC = mb.b1.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(b1VarC, "inflate(layoutInflater)");
        W1(b1VarC);
        setContentView(T1().b());
        String stringExtra = getIntent().getStringExtra(S);
        this.M = stringExtra;
        if ("steam".equals(stringExtra)) {
            c1().setTitle("Steam历史限免");
        } else if ("epic".equals(this.M)) {
            c1().setTitle("Epic历史限免");
        } else {
            c1().setTitle("历史限免");
        }
        V1();
        n1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35017, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        E1();
        O1();
    }
}
