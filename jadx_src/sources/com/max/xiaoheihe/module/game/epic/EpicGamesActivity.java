package com.max.xiaoheihe.module.game.epic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.epic.EpicDetailInfo;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import mb.b1;
import ng.j;
import xh.m;

/* JADX INFO: compiled from: EpicGamesActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class EpicGamesActivity extends BaseActivity {

    @dl.d
    public static final a R = new a(null);
    public static final int S = 8;

    @dl.d
    public static final String T = "user_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private b1 M;

    @e
    private com.max.xiaoheihe.module.game.epic.adapter.b N;
    private int Q;

    @dl.d
    private String L = "-1";

    @dl.d
    private List<GameObj> O = new ArrayList();
    private boolean P = true;

    /* JADX INFO: compiled from: EpicGamesActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final Intent a(@dl.d Context context, @dl.d String userId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, userId}, this, changeQuickRedirect, false, 37497, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(userId, "userId");
            Intent intent = new Intent(context, (Class<?>) EpicGamesActivity.class);
            intent.putExtra("user_id", userId);
            return intent;
        }
    }

    /* JADX INFO: compiled from: EpicGamesActivity.kt */
    @t0({"SMAP\nEpicGamesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpicGamesActivity.kt\ncom/max/xiaoheihe/module/game/epic/EpicGamesActivity$getEpicGames$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class b extends com.max.hbcommon.network.d<Result<EpicDetailInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 37498, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (EpicGamesActivity.this.isActive()) {
                super.onError(e10);
                b1 b1Var = EpicGamesActivity.this.M;
                b1 b1Var2 = null;
                if (b1Var == null) {
                    f0.S("mBinding");
                    b1Var = null;
                }
                b1Var.f131496c.w();
                b1 b1Var3 = EpicGamesActivity.this.M;
                if (b1Var3 == null) {
                    f0.S("mBinding");
                } else {
                    b1Var2 = b1Var3;
                }
                b1Var2.f131496c.P();
                EpicGamesActivity.X1(EpicGamesActivity.this);
            }
        }

        public void onNext(@dl.d Result<EpicDetailInfo> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 37499, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            if (t10.getResult() != null) {
                if (EpicGamesActivity.this.Q == 0) {
                    EpicGamesActivity.this.O.clear();
                }
                EpicDetailInfo result = t10.getResult();
                f0.m(result);
                if (!com.max.hbcommon.utils.c.w(result.getGames())) {
                    EpicDetailInfo result2 = t10.getResult();
                    f0.m(result2);
                    List<GameObj> games = result2.getGames();
                    if (games != null) {
                        EpicGamesActivity.this.O.addAll(games);
                    }
                    com.max.xiaoheihe.module.game.epic.adapter.b bVar = EpicGamesActivity.this.N;
                    if (bVar != null) {
                        bVar.notifyDataSetChanged();
                    }
                    EpicGamesActivity.V1(EpicGamesActivity.this);
                } else if (EpicGamesActivity.this.Q == 0) {
                    EpicGamesActivity.W1(EpicGamesActivity.this);
                }
            }
            b1 b1Var = EpicGamesActivity.this.M;
            b1 b1Var2 = null;
            if (b1Var == null) {
                f0.S("mBinding");
                b1Var = null;
            }
            b1Var.f131496c.w();
            b1 b1Var3 = EpicGamesActivity.this.M;
            if (b1Var3 == null) {
                f0.S("mBinding");
            } else {
                b1Var2 = b1Var3;
            }
            b1Var2.f131496c.P();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37500, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<EpicDetailInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: EpicGamesActivity.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37501, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            EpicGamesActivity.this.Q = 0;
            EpicGamesActivity.M1(EpicGamesActivity.this);
        }
    }

    /* JADX INFO: compiled from: EpicGamesActivity.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37502, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            EpicGamesActivity.this.Q += 30;
            EpicGamesActivity.M1(EpicGamesActivity.this);
        }
    }

    public static final /* synthetic */ void M1(EpicGamesActivity epicGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicGamesActivity}, null, changeQuickRedirect, true, 37493, new Class[]{EpicGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicGamesActivity.Y1();
    }

    public static final /* synthetic */ void V1(EpicGamesActivity epicGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicGamesActivity}, null, changeQuickRedirect, true, 37495, new Class[]{EpicGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicGamesActivity.x1();
    }

    public static final /* synthetic */ void W1(EpicGamesActivity epicGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicGamesActivity}, null, changeQuickRedirect, true, 37496, new Class[]{EpicGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicGamesActivity.y1();
    }

    public static final /* synthetic */ void X1(EpicGamesActivity epicGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicGamesActivity}, null, changeQuickRedirect, true, 37494, new Class[]{EpicGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicGamesActivity.C1();
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37490, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().ra(this.L, this.Q, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    @m
    public static final Intent Z1(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 37492, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : R.a(context, str);
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37489, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.P) {
            c1().setTitle(R.string.my_game_x);
        } else {
            c1().setTitle(R.string.his_game);
        }
        b1 b1Var = this.M;
        b1 b1Var2 = null;
        if (b1Var == null) {
            f0.S("mBinding");
            b1Var = null;
        }
        b1Var.f131495b.setLayoutManager(new LinearLayoutManager(this.f66601b));
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        this.N = new com.max.xiaoheihe.module.game.epic.adapter.b(mContext, this.O);
        b1 b1Var3 = this.M;
        if (b1Var3 == null) {
            f0.S("mBinding");
            b1Var3 = null;
        }
        b1Var3.f131495b.setAdapter(this.N);
        b1 b1Var4 = this.M;
        if (b1Var4 == null) {
            f0.S("mBinding");
            b1Var4 = null;
        }
        b1Var4.f131496c.setBackgroundColor(getResources().getColor(R.color.white));
        b1 b1Var5 = this.M;
        if (b1Var5 == null) {
            f0.S("mBinding");
            b1Var5 = null;
        }
        b1Var5.f131496c.b0(true);
        b1 b1Var6 = this.M;
        if (b1Var6 == null) {
            f0.S("mBinding");
            b1Var6 = null;
        }
        b1Var6.f131496c.S(new c());
        b1 b1Var7 = this.M;
        if (b1Var7 == null) {
            f0.S("mBinding");
        } else {
            b1Var2 = b1Var7;
        }
        b1Var2.f131496c.f0(new d());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37488, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        String stringExtra = getIntent().getStringExtra("user_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.L = stringExtra;
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            this.L = "-1";
        }
        b1 b1VarC = b1.c(getLayoutInflater());
        f0.o(b1VarC, "inflate(layoutInflater)");
        this.M = b1VarC;
        if (b1VarC == null) {
            f0.S("mBinding");
            b1VarC = null;
        }
        setContentView(b1VarC.b());
        this.P = i0.q(this.L);
        a2();
        E1();
        Y1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37491, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        this.Q = 0;
        E1();
        Y1();
    }
}
