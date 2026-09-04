package com.max.hbcommon.network;

import android.util.Log;
import androidx.annotation.n0;
import com.google.gson.Gson;
import com.max.hbcommon.bean.RequestTagMapObj;
import com.max.hbcommon.network.eventlistener.HBNetEventListener;
import com.max.hbcommon.network.interceptor.ErrorHandleInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.u;
import okhttp3.z;
import retrofit2.t;

/* JADX INFO: compiled from: ApiModule.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f68049f = "TAG_ADD_CLIENT_KEY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f68050g = "TAG_SEND_REQUEST";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile b f68051h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f68053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static List<String> f68054k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f68055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z f68056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f68057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f68058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final okhttp3.t f68048e = okhttp3.t.J("https://" + lb.a.f131021p1 + "/");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f68052i = false;

    /* JADX INFO: compiled from: ApiModule.java */
    public class a implements u {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // okhttp3.u
        public c0 intercept(u.a aVar) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.e.f31975qb, new Class[]{u.a.class}, c0.class);
            return patchProxyResultProxy.isSupported ? (c0) patchProxyResultProxy.result : b.this.h(aVar);
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.network.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApiModule.java */
    public class C0548b implements okhttp3.p.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0548b() {
        }

        @Override // okhttp3.p.c
        @n0
        public okhttp3.p create(@n0 okhttp3.e eVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.e.f31992rb, new Class[]{okhttp3.e.class}, okhttp3.p.class);
            return patchProxyResultProxy.isSupported ? (okhttp3.p) patchProxyResultProxy.result : new HBNetEventListener();
        }
    }

    private b() {
    }

    private z a(z zVar, boolean z10, u... uVarArr) {
        okhttp3.o oVarH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar, new Byte(z10 ? (byte) 1 : (byte) 0), uVarArr}, this, changeQuickRedirect, false, bb.c.e.f31856jb, new Class[]{z.class, Boolean.TYPE, u[].class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        z.a aVarE0 = zVar.e0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVarE0.k(20L, timeUnit).j0(20L, timeUnit).R0(20L, timeUnit);
        if (z10) {
            if (ob.a.k().c()) {
                aVarE0.l0(false);
                aVarE0.c(new com.max.hbcommon.network.interceptor.l(zVar));
            } else {
                aVarE0.c(new a());
            }
            aVarE0.c(new ErrorHandleInterceptor());
        }
        aVarE0.c(new HttpLoggingInterceptor(new k()).g(HttpLoggingInterceptor.Level.BODY));
        for (u uVar : uVarArr) {
            aVarE0.c(uVar);
        }
        aVarE0.s(new C0548b());
        DohDns.a aVar = DohDns.f68019b;
        if (aVar.a() && (oVarH = aVar.d().h()) != null) {
            aVarE0.g0(Proxy.NO_PROXY);
            aVarE0.q(oVarH);
        }
        return aVarE0.f();
    }

    public static String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f31806gb, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "https://" + d() + "/";
    }

    public static String d() {
        return f68052i ? lb.a.f131039s1 : lb.a.f131021p1;
    }

    public static String e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f31823hb, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "https://" + f() + "/";
    }

    public static String f() {
        return f68052i ? lb.a.f131057v1 : lb.a.f131051u1;
    }

    public static b g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f31789fb, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (f68051h == null) {
            synchronized (b.class) {
                if (f68051h == null) {
                    f68051h = new b();
                }
            }
        }
        return f68051h;
    }

    private boolean i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.f31958pb, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (f68054k == null) {
            f68054k = Arrays.asList("/store/register_order/", "/store/get_order_detail/", "/store/get_game_package_price/", "/store/check_buy_game_condition/", "/store/cancel_order/", "/store/purchase_code/", "/store/switch/proxy/", "/store/purchase_game_v3/", "/mall/cancel/orders/", "/mall/order/detail/v2/", "/mall/final/price/", "/mall/steam_info/", "/mall/check/purchase_code/", "/mall/check/pay/", "/mall/physical/order/confirm/receipt/", "/mall/pay/", "/mall/activite/proxy/", "/mall/coupons/", "/mall/activate/data/", "/pay/order/extra_info", "/pay/mall/unifiedorder", "/pay/ali_order_query/", "/pay/wx_order_query/");
        }
        return f68054k.contains(str);
    }

    public Gson b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31772eb, new Class[0], Gson.class);
        return patchProxyResultProxy.isSupported ? (Gson) patchProxyResultProxy.result : com.max.hbutils.utils.k.c();
    }

    public c0 h(u.a aVar) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.e.f31873kb, new Class[]{u.a.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        RequestTagMapObj requestTagMapObj = null;
        if (aVar == null) {
            return null;
        }
        a0 a0VarRequest = aVar.request();
        if (a0VarRequest.p(RequestTagMapObj.class) != null) {
            try {
                requestTagMapObj = (RequestTagMapObj) a0VarRequest.p(RequestTagMapObj.class);
            } catch (Exception e10) {
                Log.e("ApiModule", e10.getMessage());
            }
        }
        boolean z10 = requestTagMapObj != null && com.max.hbcommon.utils.c.x(requestTagMapObj.get(f68049f));
        String strX = a0VarRequest.q().x();
        okhttp3.t.a aVarH = a0VarRequest.q().H();
        String strF = a0VarRequest.q().getHost();
        if (p(strX)) {
            strF = lb.a.f131033r1;
        }
        ob.a aVar2 = ob.a.f132240a;
        if (ob.a.b().t()) {
            strF = lb.a.a(strF);
        }
        if (strF != null) {
            aVarH.x(strF);
        }
        ob.a.k().b(aVarH, strX);
        return aVar.proceed(a0VarRequest.n().a("Referer", "http://api.maxjia.com/").a("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").n("Cookie", ob.a.k().a(z10, a0VarRequest)).D(aVarH.h()).b());
    }

    public z j(z zVar, boolean z10, u... uVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar, new Byte(z10 ? (byte) 1 : (byte) 0), uVarArr}, this, changeQuickRedirect, false, bb.c.e.f31840ib, new Class[]{z.class, Boolean.TYPE, u[].class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        if (z10) {
            if (this.f68055a == null) {
                this.f68055a = a(zVar, true, uVarArr);
            }
            return this.f68055a;
        }
        if (this.f68056b == null) {
            this.f68056b = a(zVar, false, uVarArr);
        }
        return this.f68056b;
    }

    public t k(okhttp3.t tVar, z zVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar, zVar}, this, changeQuickRedirect, false, bb.c.e.f31907mb, new Class[]{okhttp3.t.class, z.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        if (this.f68057c == null) {
            this.f68057c = new t.b().j(zVar).e(tVar).b(nb.a.a(b())).f();
        }
        return this.f68057c;
    }

    public okhttp3.t l() {
        return f68048e;
    }

    public t m(okhttp3.t tVar, z zVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar, zVar}, this, changeQuickRedirect, false, bb.c.e.f31924nb, new Class[]{okhttp3.t.class, z.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        if (this.f68058d == null) {
            this.f68058d = new t.b().j(zVar).e(tVar).b(retrofit2.converter.gson.a.a()).a(retrofit2.adapter.rxjava2.g.d()).f();
        }
        return this.f68058d;
    }

    public t n(okhttp3.t tVar, z zVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar, zVar}, this, changeQuickRedirect, false, bb.c.e.f31890lb, new Class[]{okhttp3.t.class, z.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        if (this.f68057c == null) {
            this.f68057c = new t.b().j(zVar).e(tVar).b(nb.a.a(b())).a(retrofit2.adapter.rxjava2.g.d()).f();
        }
        return this.f68057c;
    }

    public void o() {
        this.f68055a = null;
        this.f68056b = null;
    }

    public boolean p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.f31941ob, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f68053j && i(str);
    }
}
