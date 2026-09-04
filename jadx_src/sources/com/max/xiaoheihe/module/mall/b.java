package com.max.xiaoheihe.module.mall;

import androidx.lifecycle.i0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.mall.MallBalanceOrderStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallBalanceOrderProgressViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f90005j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f90006k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final String f90007l = "1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final String f90008m = "2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f90009n = "3";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f90010o = "4";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f90011p = "5";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final String f90012q = "6";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final String f90013r = "7";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final String f90014s = "8";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final String f90015t = "-1";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final String f90016u = "1";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f90017v = "2";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f90018w = "3";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final String f90019x = "4";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final String f90020y = "6";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final String f90021z = " 7";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final i0<MallBalanceOrderStateObj> f90022d = new i0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ArrayList<String> f90023e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private i0<Integer> f90024f = new i0<>(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f90025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f90026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f90027i;

    /* JADX INFO: compiled from: MallBalanceOrderProgressViewModel.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39932, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90019x;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39931, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90018w;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39933, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90020y;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39930, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90017v;
        }

        @dl.d
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39934, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90021z;
        }

        @dl.d
        public final String f() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39929, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90016u;
        }

        @dl.d
        public final String g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39922, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90009n;
        }

        @dl.d
        public final String h() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39928, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90015t;
        }

        @dl.d
        public final String i() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39921, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90008m;
        }

        @dl.d
        public final String j() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39926, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90013r;
        }

        @dl.d
        public final String k() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39925, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90012q;
        }

        @dl.d
        public final String l() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39924, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90011p;
        }

        @dl.d
        public final String m() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39927, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90014s;
        }

        @dl.d
        public final String n() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39920, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90007l;
        }

        @dl.d
        public final String o() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39923, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f90010o;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MallBalanceOrderProgressViewModel.kt */
    public static final class C0820b extends com.max.hbcommon.network.d<Result<MallBalanceOrderStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0820b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39935, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            b.this.f().o(BaseViewModel.TYPE_STATE.ERROR);
            b.this.K(false);
        }

        public void onNext(@dl.d Result<MallBalanceOrderStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39936, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            b.this.f().o(BaseViewModel.TYPE_STATE.NORMAL);
            b.this.K(false);
            b.this.z().o(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39937, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallBalanceOrderStateObj>) obj);
        }
    }

    public final boolean A() {
        return this.f90026h;
    }

    @dl.d
    public final ArrayList<String> B() {
        return this.f90023e;
    }

    @dl.d
    public final String C() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39913, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.f90027i;
        if (str != null) {
            return str;
        }
        f0.S("mOrderId");
        return null;
    }

    @dl.d
    public final i0<Integer> D() {
        return this.f90024f;
    }

    public final int E() {
        return this.f90025g;
    }

    public final boolean F() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39917, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f90022d.f() == null) {
            return false;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = this.f90022d.f();
        f0.m(mallBalanceOrderStateObjF);
        if (!f0.g(mallBalanceOrderStateObjF.getState(), f90008m)) {
            return false;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF2 = this.f90022d.f();
        f0.m(mallBalanceOrderStateObjF2);
        return mallBalanceOrderStateObjF2.getRedirect_url() != null;
    }

    public final boolean G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39918, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f90022d.f() == null) {
            return false;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = this.f90022d.f();
        f0.m(mallBalanceOrderStateObjF);
        return mallBalanceOrderStateObjF.getAcc_proxy() != null;
    }

    public final boolean H() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39916, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String str = f90011p;
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = this.f90022d.f();
        if (f0.g(str, mallBalanceOrderStateObjF != null ? mallBalanceOrderStateObjF.getState() : null)) {
            if (this.f90025g <= 30) {
                return false;
            }
        } else if (this.f90025g <= 10) {
            return false;
        }
        return true;
    }

    public final void I() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39915, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e().f();
        this.f90026h = false;
    }

    public final void J() {
        long j10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39919, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        switch (this.f90025g) {
            case 0:
                j10 = 0;
                break;
            case 1:
            case 2:
                j10 = 1;
                break;
            case 3:
            case 4:
            case 5:
                j10 = 2;
                break;
            case 6:
            case 7:
            case 8:
                j10 = 3;
                break;
            default:
                j10 = 5;
                break;
        }
        long j11 = F() ? 5L : j10;
        if (this.f90026h) {
            return;
        }
        this.f90025g++;
        this.f90026h = true;
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90027i;
        if (str == null) {
            f0.S("mOrderId");
            str = null;
        }
        c((io.reactivex.disposables.b) eVarA.X2(str).C1(j11, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new C0820b()));
    }

    public final void K(boolean z10) {
        this.f90026h = z10;
    }

    public final void L(@dl.d String orderId) {
        if (PatchProxy.proxy(new Object[]{orderId}, this, changeQuickRedirect, false, 39912, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(orderId, "orderId");
        this.f90027i = orderId;
    }

    public final void M(@dl.d i0<Integer> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 39911, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f90024f = i0Var;
    }

    public final void N(int i10) {
        this.f90025g = i10;
    }

    public final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39914, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f90025g = 0;
        J();
    }

    @dl.d
    public final i0<MallBalanceOrderStateObj> z() {
        return this.f90022d;
    }
}
