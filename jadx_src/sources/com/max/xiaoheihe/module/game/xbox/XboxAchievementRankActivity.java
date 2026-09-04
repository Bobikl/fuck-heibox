package com.max.xiaoheihe.module.game.xbox;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfoWrapper;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import ng.j;
import xh.m;

/* JADX INFO: compiled from: XboxAchievementRankActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
@ig.d(path = {lb.d.H3})
public final class XboxAchievementRankActivity extends BaseActivity implements com.max.xiaoheihe.module.game.xbox.a {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;

    @dl.d
    public static final String R = "xuid";
    public static ChangeQuickRedirect changeQuickRedirect;
    private SmartRefreshLayout L;

    @e
    private Fragment M;

    @e
    private String N;
    private int O;

    /* JADX INFO: compiled from: XboxAchievementRankActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final Intent a(@dl.d Context context, @dl.d String xuid) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, xuid}, this, changeQuickRedirect, false, 38414, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(xuid, "xuid");
            Intent intent = new Intent(context, (Class<?>) XboxAchievementRankActivity.class);
            intent.putExtra("xuid", xuid);
            return intent;
        }
    }

    /* JADX INFO: compiled from: XboxAchievementRankActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<XboxFriendInfoWrapper>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f88538c;

        b(boolean z10) {
            this.f88538c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38416, new Class[0], Void.TYPE).isSupported && XboxAchievementRankActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = XboxAchievementRankActivity.this.L;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.p(0);
                SmartRefreshLayout smartRefreshLayout3 = XboxAchievementRankActivity.this.L;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.A(0);
                XboxAchievementRankActivity.T1(XboxAchievementRankActivity.this);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38415, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (XboxAchievementRankActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = XboxAchievementRankActivity.this.L;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.p(0);
                SmartRefreshLayout smartRefreshLayout3 = XboxAchievementRankActivity.this.L;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.A(0);
                XboxAchievementRankActivity.V1(XboxAchievementRankActivity.this);
            }
        }

        public void onNext(@dl.d Result<XboxFriendInfoWrapper> result) {
            XboxFriendInfoWrapper result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38417, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (XboxAchievementRankActivity.this.isActive() && (result2 = result.getResult()) != null) {
                boolean z10 = this.f88538c;
                XboxAchievementRankActivity xboxAchievementRankActivity = XboxAchievementRankActivity.this;
                if (z10) {
                    Fragment fragment = xboxAchievementRankActivity.M;
                    f0.n(fragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.xbox.XboxFriendListFragment");
                    ((com.max.xiaoheihe.module.game.xbox.c) fragment).Q3(result2);
                } else {
                    Fragment fragment2 = xboxAchievementRankActivity.M;
                    f0.n(fragment2, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.xbox.XboxFriendListFragment");
                    ((com.max.xiaoheihe.module.game.xbox.c) fragment2).L3(result2);
                }
                xboxAchievementRankActivity.O += 30;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38418, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<XboxFriendInfoWrapper>) obj);
        }
    }

    /* JADX INFO: compiled from: XboxAchievementRankActivity.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 38419, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            XboxAchievementRankActivity.Q1(XboxAchievementRankActivity.this, true);
        }
    }

    /* JADX INFO: compiled from: XboxAchievementRankActivity.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 38420, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            XboxAchievementRankActivity.Q1(XboxAchievementRankActivity.this, false);
        }
    }

    public static final /* synthetic */ void Q1(XboxAchievementRankActivity xboxAchievementRankActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{xboxAchievementRankActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38411, new Class[]{XboxAchievementRankActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        xboxAchievementRankActivity.X1(z10);
    }

    public static final /* synthetic */ void T1(XboxAchievementRankActivity xboxAchievementRankActivity) {
        if (PatchProxy.proxy(new Object[]{xboxAchievementRankActivity}, null, changeQuickRedirect, true, 38413, new Class[]{XboxAchievementRankActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        xboxAchievementRankActivity.x1();
    }

    public static final /* synthetic */ void V1(XboxAchievementRankActivity xboxAchievementRankActivity) {
        if (PatchProxy.proxy(new Object[]{xboxAchievementRankActivity}, null, changeQuickRedirect, true, 38412, new Class[]{XboxAchievementRankActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        xboxAchievementRankActivity.C1();
    }

    private final void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.srl);
        f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.L = (SmartRefreshLayout) viewFindViewById;
    }

    private final void X1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38404, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.O = 0;
        }
        V((io.reactivex.disposables.b) i.a().U0(this.N, this.O, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(z10)));
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38407, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.fragment_container);
        this.M = fragmentR0;
        if (fragmentR0 == null) {
            com.max.xiaoheihe.module.game.xbox.c cVar = new com.max.xiaoheihe.module.game.xbox.c();
            this.M = cVar;
            cVar.setUserVisibleHint(true);
            Fragment fragment = this.M;
            if (fragment != null) {
                fragment.setMenuVisibility(true);
            }
            Fragment fragment2 = this.M;
            if (fragment2 != null) {
                getSupportFragmentManager().u().b(R.id.fragment_container, fragment2).m();
            }
        }
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        SmartRefreshLayout smartRefreshLayout2 = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.b0(true);
        SmartRefreshLayout smartRefreshLayout3 = this.L;
        if (smartRefreshLayout3 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.i0(true);
        SmartRefreshLayout smartRefreshLayout4 = this.L;
        if (smartRefreshLayout4 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout4 = null;
        }
        smartRefreshLayout4.S(new c());
        SmartRefreshLayout smartRefreshLayout5 = this.L;
        if (smartRefreshLayout5 == null) {
            f0.S("mRefreshLayout");
        } else {
            smartRefreshLayout2 = smartRefreshLayout5;
        }
        smartRefreshLayout2.f0(new d());
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38406, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("成就排行");
        this.f66617r.setVisibility(0);
        this.f66617r.setBackgroundColor(this.f66601b.getResources().getColor(R.color.divider_secondary_2_color));
        this.f66617r.getLayoutParams().height = ViewUtils.f(this.f66601b, 4.0f);
    }

    @dl.d
    @m
    public static final Intent b2(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38410, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : P.a(context, str);
    }

    private final void getIntentInfo() {
        Intent intent;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38405, new Class[0], Void.TYPE).isSupported || (intent = getIntent()) == null) {
            return;
        }
        this.N = intent.getStringExtra("xuid");
    }

    @Override // com.max.xiaoheihe.module.game.xbox.a
    public void D0(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38409, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
            X1(false);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38400, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_refresh_fragment_container);
        W1();
        getIntentInfo();
        a2();
        Y1();
        Z1();
        X1(true);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38401, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        X1(true);
    }

    @Override // com.max.xiaoheihe.module.game.xbox.a
    public void u0(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38408, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
            X1(true);
        }
    }
}
