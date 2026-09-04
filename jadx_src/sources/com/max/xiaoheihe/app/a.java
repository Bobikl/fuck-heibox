package com.max.xiaoheihe.app;

import android.content.Intent;
import com.max.hbsearch.o;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.AdsInfosObj;
import com.max.xiaoheihe.bean.account.TimestampResultObj;
import com.max.xiaoheihe.module.signin.SignInManager;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ForegroundRequestManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f76845a;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ForegroundRequestManager.java */
    public class C0623a extends com.max.hbcommon.network.d<Result<AdsInfosObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0623a() {
        }

        public void onNext(Result<AdsInfosObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.dF, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null) {
                return;
            }
            com.max.xiaoheihe.module.ads.b.h().a(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.eF, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AdsInfosObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ForegroundRequestManager.java */
    public class b extends com.max.hbcommon.network.d<Result<TimestampResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(Result<TimestampResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.fF, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            String timestamp = result.getResult().getTimestamp();
            com.max.hbcache.c.C(com.max.hbcache.c.f66142q, result.getResult().getUser_info());
            if (com.max.hbcommon.utils.c.u(timestamp)) {
                return;
            }
            long jR = n.r(timestamp);
            if (jR > n.r(com.max.hbcache.c.o(com.max.hbcache.c.f66140p, ""))) {
                com.max.hbcache.c.C(com.max.hbcache.c.f66140p, String.valueOf(jR));
                Intent intent = new Intent();
                intent.setAction(lb.a.f131031r);
                HeyBoxApplication.C().sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.gF, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TimestampResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ForegroundRequestManager.java */
    public class c extends com.max.hbcommon.network.d<Result<TimestampResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(Result<TimestampResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.hF, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            String timestamp = result.getResult().getTimestamp();
            if (com.max.hbcommon.utils.c.u(timestamp) || n.r(timestamp) <= n.r(com.max.hbcache.c.o(com.max.hbcache.c.f66138o, ""))) {
                return;
            }
            com.max.hbcache.c.M(true);
            com.max.hbcache.c.C(com.max.hbcache.c.f66138o, String.valueOf(timestamp));
            Intent intent = new Intent();
            intent.setAction(lb.a.f131025q);
            HeyBoxApplication.C().sendBroadcast(intent);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.iF, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TimestampResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ForegroundRequestManager.java */
    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f76849b;

        d(String str) {
            this.f76849b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.jF, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.I(this.f76849b);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.kF, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    private a() {
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.YE, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i.a().H2().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b());
    }

    private void b() {
        Map<String, String> mapI;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.aF, new Class[0], Void.TYPE).isSupported || (mapI = com.max.hbcache.c.i()) == null) {
            return;
        }
        Iterator<String> it = mapI.keySet().iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    private void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ZE, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i.a().ob().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c());
    }

    private void d(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.bF, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("appid", str);
        i.a().x8("11", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new d(str));
    }

    public static a f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.UE, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f76845a == null) {
            synchronized (a.class) {
                if (f76845a == null) {
                    f76845a = new a();
                }
            }
        }
        return f76845a;
    }

    private void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.cF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o.g();
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.XE, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i.a().u3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new C0623a());
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.VE, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e();
        a();
        c();
        b();
        SignInManager.f().c();
    }

    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.WE, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g();
    }
}
