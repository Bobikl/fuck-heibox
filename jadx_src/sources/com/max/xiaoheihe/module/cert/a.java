package com.max.xiaoheihe.module.cert;

import ad.c;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.cert.AppCertResultObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import io.reactivex.schedulers.b;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: AppCertManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final C0727a f83510a = new C0727a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83511b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f83512c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.cert.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppCertManager.kt */
    public static final class C0727a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.cert.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AppCertManager.kt */
        public static final class C0728a extends com.max.hbcommon.network.d<Result<AppCertResultObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0728a() {
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onComplete() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31358, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                super.onComplete();
                a.f83510a.e(false);
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31356, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                super.onError(e10);
            }

            public void onNext(@d Result<AppCertResultObj> t10) {
                if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31357, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(t10, "t");
                super.onNext(t10);
                AppCertResultObj result = t10.getResult();
                if (result != null) {
                    if (result.getUpdated()) {
                        EncryptionParamsObj data = result.getData();
                        if (data != null) {
                            String strV = com.max.xiaoheihe.utils.d.v(data);
                            g.f74531b.M("[OAID] cert: " + strV);
                            MMKVManager.f71329a.o("common", c.f1225e, strV, false);
                        }
                    } else {
                        g.f74531b.M("[OAID] 没有新的证书");
                    }
                    a.f83510a.d();
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31359, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<AppCertResultObj>) obj);
            }
        }

        private C0727a() {
        }

        public /* synthetic */ C0727a(u uVar) {
            this();
        }

        @d
        @m
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31353, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            String strI = MMKVManager.f71329a.i("common", c.f1225e, "", false);
            return strI == null ? "" : strI;
        }

        public final boolean b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31350, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a.f83512c;
        }

        @m
        public final boolean c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31354, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return (System.currentTimeMillis() / ((long) 1000)) - MMKVManager.f71329a.g("common", c.f1226f, 0L, false) > 604800;
        }

        @m
        public final void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31355, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MMKVManager.f71329a.n("common", c.f1226f, System.currentTimeMillis() / ((long) 1000), false);
        }

        public final void e(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31351, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a.f83512c = z10;
        }

        @m
        @SuppressLint({"CheckResult"})
        public final void f() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31352, new Class[0], Void.TYPE).isSupported || b() || !c()) {
                return;
            }
            e(true);
            i.a().O("oaid", com.max.xiaoheihe.utils.d.a1(a())).I5(b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0728a());
        }
    }

    @d
    @m
    public static final String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31347, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f83510a.a();
    }

    @m
    public static final boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31348, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f83510a.c();
    }

    @m
    public static final void e() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31349, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f83510a.d();
    }

    @m
    @SuppressLint({"CheckResult"})
    public static final void f() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31346, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f83510a.f();
    }
}
