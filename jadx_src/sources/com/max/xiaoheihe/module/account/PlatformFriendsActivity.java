package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: PlatformFriendsActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.n.class}, path = {lb.d.I3})
public final class PlatformFriendsActivity extends BaseActivity implements com.max.xiaoheihe.module.game.xbox.a {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;

    @dl.d
    public static final String S = "userid";

    @dl.d
    public static final String T = "platform";

    @dl.d
    public static final String U = "xuid";

    @dl.d
    public static final String V = "steam";

    @dl.d
    public static final String W = "xbox";

    @dl.d
    public static final String X = "playstation";

    @dl.d
    public static final String Y = "unknown";
    public static ChangeQuickRedirect changeQuickRedirect;
    private SmartRefreshLayout L;

    @dl.e
    private String M;

    @dl.d
    private String N = "unknown";

    @dl.e
    private Fragment O;
    private int P;

    /* JADX INFO: compiled from: PlatformFriendsActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.e Context context, @dl.e String str, @dl.d String platform) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, platform}, this, changeQuickRedirect, false, 23797, new Class[]{Context.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(platform, "platform");
            Intent intent = new Intent(context, (Class<?>) PlatformFriendsActivity.class);
            intent.putExtra("userid", str);
            intent.putExtra("platform", platform);
            return intent;
        }
    }

    /* JADX INFO: compiled from: PlatformFriendsActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<XboxFriendInfoWrapper>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f78219c;

        b(boolean z10) {
            this.f78219c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23799, new Class[0], Void.TYPE).isSupported && PlatformFriendsActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = PlatformFriendsActivity.this.L;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.p(0);
                SmartRefreshLayout smartRefreshLayout3 = PlatformFriendsActivity.this.L;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.A(0);
                PlatformFriendsActivity.T1(PlatformFriendsActivity.this);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 23798, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (PlatformFriendsActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = PlatformFriendsActivity.this.L;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.p(0);
                SmartRefreshLayout smartRefreshLayout3 = PlatformFriendsActivity.this.L;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.A(0);
                PlatformFriendsActivity.V1(PlatformFriendsActivity.this);
            }
        }

        public void onNext(@dl.d Result<XboxFriendInfoWrapper> result) {
            XboxFriendInfoWrapper result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23800, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (PlatformFriendsActivity.this.isActive() && (result2 = result.getResult()) != null) {
                PlatformFriendsActivity platformFriendsActivity = PlatformFriendsActivity.this;
                boolean z10 = this.f78219c;
                platformFriendsActivity.P += 30;
                if (z10) {
                    Fragment fragment = platformFriendsActivity.O;
                    kotlin.jvm.internal.f0.n(fragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.xbox.XboxFriendListFragment");
                    ((com.max.xiaoheihe.module.game.xbox.c) fragment).Q3(result2);
                } else {
                    Fragment fragment2 = platformFriendsActivity.O;
                    kotlin.jvm.internal.f0.n(fragment2, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.xbox.XboxFriendListFragment");
                    ((com.max.xiaoheihe.module.game.xbox.c) fragment2).L3(result2);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23801, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<XboxFriendInfoWrapper>) obj);
        }
    }

    /* JADX INFO: compiled from: PlatformFriendsActivity.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 23802, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            PlatformFriendsActivity.M1(PlatformFriendsActivity.this, true);
        }
    }

    /* JADX INFO: compiled from: PlatformFriendsActivity.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 23803, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            PlatformFriendsActivity.M1(PlatformFriendsActivity.this, false);
        }
    }

    public static final /* synthetic */ void M1(PlatformFriendsActivity platformFriendsActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{platformFriendsActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23794, new Class[]{PlatformFriendsActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        platformFriendsActivity.Y1(z10);
    }

    public static final /* synthetic */ void T1(PlatformFriendsActivity platformFriendsActivity) {
        if (PatchProxy.proxy(new Object[]{platformFriendsActivity}, null, changeQuickRedirect, true, 23796, new Class[]{PlatformFriendsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        platformFriendsActivity.x1();
    }

    public static final /* synthetic */ void V1(PlatformFriendsActivity platformFriendsActivity) {
        if (PatchProxy.proxy(new Object[]{platformFriendsActivity}, null, changeQuickRedirect, true, 23795, new Class[]{PlatformFriendsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        platformFriendsActivity.C1();
    }

    private final void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23785, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.L = (SmartRefreshLayout) viewFindViewById;
    }

    private final void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23789, new Class[0], Void.TYPE).isSupported || getIntent() == null) {
            return;
        }
        this.M = getIntent().getStringExtra("userid");
        String stringExtra = getIntent().getStringExtra("platform");
        if (stringExtra == null) {
            stringExtra = "unknown";
        }
        this.N = stringExtra;
    }

    private final void Y1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23787, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.N;
        if (kotlin.jvm.internal.f0.g(str, "xbox")) {
            c2(z10);
        } else if (kotlin.jvm.internal.f0.g(str, "steam")) {
            b2();
        }
    }

    private final Fragment Z1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23788, new Class[0], Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : new com.max.xiaoheihe.module.game.xbox.c();
    }

    @dl.d
    @xh.m
    public static final Intent a2(@dl.e Context context, @dl.e String str, @dl.d String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 23793, new Class[]{Context.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : Q.a(context, str, str2);
    }

    private final void b2() {
    }

    private final void c2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23792, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.P = 0;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o2(this.M, this.P, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(z10)));
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23786, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        SmartRefreshLayout smartRefreshLayout2 = null;
        if (smartRefreshLayout == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.b0(true);
        SmartRefreshLayout smartRefreshLayout3 = this.L;
        if (smartRefreshLayout3 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.i0(true);
        SmartRefreshLayout smartRefreshLayout4 = this.L;
        if (smartRefreshLayout4 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout4 = null;
        }
        smartRefreshLayout4.S(new c());
        SmartRefreshLayout smartRefreshLayout5 = this.L;
        if (smartRefreshLayout5 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
        } else {
            smartRefreshLayout2 = smartRefreshLayout5;
        }
        smartRefreshLayout2.f0(new d());
    }

    private final void f2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23782, new Class[0], Void.TYPE).isSupported && kotlin.jvm.internal.f0.g(this.N, "xbox")) {
            this.f66616q.setTitle(getString(R.string.xbox_friends));
            this.f66617r.setVisibility(0);
            this.f66617r.setBackgroundColor(this.f66601b.getResources().getColor(R.color.divider_secondary_2_color));
            this.f66617r.getLayoutParams().height = ViewUtils.f(this.f66601b, 4.0f);
        }
    }

    @Override // com.max.xiaoheihe.module.game.xbox.a
    public void D0(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23791, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
            c2(false);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23783, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_refresh_fragment_container);
        X1();
        f2();
        W1();
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.fragment_container);
        this.O = fragmentR0;
        if (fragmentR0 == null) {
            Fragment fragmentZ1 = Z1();
            this.O = fragmentZ1;
            if (fragmentZ1 != null) {
                fragmentZ1.setUserVisibleHint(true);
            }
            Fragment fragment = this.O;
            if (fragment != null) {
                fragment.setMenuVisibility(true);
            }
            Fragment fragment2 = this.O;
            if (fragment2 != null) {
                getSupportFragmentManager().u().b(R.id.fragment_container, fragment2).m();
            }
        }
        e2();
        Y1(true);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23784, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y1(true);
    }

    @Override // com.max.xiaoheihe.module.game.xbox.a
    public void u0(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23790, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
            c2(true);
        }
    }
}
