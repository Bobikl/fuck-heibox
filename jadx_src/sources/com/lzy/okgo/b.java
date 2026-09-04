package com.lzy.okgo;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.interceptor.HttpLoggingInterceptor;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.DeleteRequest;
import com.lzy.okgo.request.GetRequest;
import com.lzy.okgo.request.HeadRequest;
import com.lzy.okgo.request.OptionsRequest;
import com.lzy.okgo.request.PatchRequest;
import com.lzy.okgo.request.PostRequest;
import com.lzy.okgo.request.PutRequest;
import com.lzy.okgo.request.TraceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import okhttp3.e;
import okhttp3.z;

/* JADX INFO: compiled from: OkGo.java */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f64623i = 60000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f64624j = 300;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f64625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f64626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f64627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpParams f64628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HttpHeaders f64629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f64630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CacheMode f64631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f64632h;

    /* JADX INFO: renamed from: com.lzy.okgo.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OkGo.java */
    public static class C0519b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f64633a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0519b() {
        }
    }

    private b() {
        this.f64626b = new Handler(Looper.getMainLooper());
        this.f64630f = 3;
        this.f64632h = -1L;
        this.f64631g = CacheMode.NO_CACHE;
        z.a aVar = new z.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor("OkGo");
        httpLoggingInterceptor.h(HttpLoggingInterceptor.Level.BODY);
        httpLoggingInterceptor.g(Level.INFO);
        aVar.c(httpLoggingInterceptor);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.j0(60000L, timeUnit);
        aVar.R0(60000L, timeUnit);
        aVar.k(60000L, timeUnit);
        com.lzy.okgo.https.a.c cVarB = com.lzy.okgo.https.a.b();
        aVar.Q0(cVarB.f64729a, cVarB.f64730b);
        aVar.Z(com.lzy.okgo.https.a.f64728b);
        this.f64627c = aVar.f();
    }

    public static <T> TraceRequest<T> C(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30854p3, new Class[]{String.class}, TraceRequest.class);
        return patchProxyResultProxy.isSupported ? (TraceRequest) patchProxyResultProxy.result : new TraceRequest<>(str);
    }

    public static void d(z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, null, changeQuickRedirect, true, bb.c.b.A3, new Class[]{z.class}, Void.TYPE).isSupported || zVar == null) {
            return;
        }
        Iterator<e> it = zVar.getDispatcher().n().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        Iterator<e> it2 = zVar.getDispatcher().p().iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    public static void f(z zVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{zVar, obj}, null, changeQuickRedirect, true, bb.c.b.f31053y3, new Class[]{z.class, Object.class}, Void.TYPE).isSupported || zVar == null || obj == null) {
            return;
        }
        for (e eVar : zVar.getDispatcher().n()) {
            if (obj.equals(eVar.request().o())) {
                eVar.cancel();
            }
        }
        for (e eVar2 : zVar.getDispatcher().p()) {
            if (obj.equals(eVar2.request().o())) {
                eVar2.cancel();
            }
        }
    }

    public static <T> DeleteRequest<T> g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30785m3, new Class[]{String.class}, DeleteRequest.class);
        return patchProxyResultProxy.isSupported ? (DeleteRequest) patchProxyResultProxy.result : new DeleteRequest<>(str);
    }

    public static <T> GetRequest<T> h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30693i3, new Class[]{String.class}, GetRequest.class);
        return patchProxyResultProxy.isSupported ? (GetRequest) patchProxyResultProxy.result : new GetRequest<>(str);
    }

    public static b p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.f30670h3, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : C0519b.f64633a;
    }

    public static <T> HeadRequest<T> s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30762l3, new Class[]{String.class}, HeadRequest.class);
        return patchProxyResultProxy.isSupported ? (HeadRequest) patchProxyResultProxy.result : new HeadRequest<>(str);
    }

    public static <T> OptionsRequest<T> u(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30808n3, new Class[]{String.class}, OptionsRequest.class);
        return patchProxyResultProxy.isSupported ? (OptionsRequest) patchProxyResultProxy.result : new OptionsRequest<>(str);
    }

    public static <T> PatchRequest<T> v(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30831o3, new Class[]{String.class}, PatchRequest.class);
        return patchProxyResultProxy.isSupported ? (PatchRequest) patchProxyResultProxy.result : new PatchRequest<>(str);
    }

    public static <T> PostRequest<T> w(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 321, new Class[]{String.class}, PostRequest.class);
        return patchProxyResultProxy.isSupported ? (PostRequest) patchProxyResultProxy.result : new PostRequest<>(str);
    }

    public static <T> PutRequest<T> x(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30739k3, new Class[]{String.class}, PutRequest.class);
        return patchProxyResultProxy.isSupported ? (PutRequest) patchProxyResultProxy.result : new PutRequest<>(str);
    }

    public b A(z zVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, bb.c.b.f30921s3, new Class[]{z.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        la.b.b(zVar, "okHttpClient == null");
        this.f64627c = zVar;
        return this;
    }

    public b B(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30965u3, new Class[]{Integer.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("retryCount must > 0");
        }
        this.f64630f = i10;
        return this;
    }

    public b a(HttpHeaders httpHeaders) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{httpHeaders}, this, changeQuickRedirect, false, bb.c.b.f31009w3, new Class[]{HttpHeaders.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (this.f64629e == null) {
            this.f64629e = new HttpHeaders();
        }
        this.f64629e.m(httpHeaders);
        return this;
    }

    public b b(HttpParams httpParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{httpParams}, this, changeQuickRedirect, false, bb.c.b.f30987v3, new Class[]{HttpParams.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (this.f64628d == null) {
            this.f64628d = new HttpParams();
        }
        this.f64628d.b(httpParams);
        return this;
    }

    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31075z3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<e> it = q().getDispatcher().n().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        Iterator<e> it2 = q().getDispatcher().p().iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    public void e(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.f31031x3, new Class[]{Object.class}, Void.TYPE).isSupported || obj == null) {
            return;
        }
        for (e eVar : q().getDispatcher().n()) {
            if (obj.equals(eVar.request().o())) {
                eVar.cancel();
            }
        }
        for (e eVar2 : q().getDispatcher().p()) {
            if (obj.equals(eVar2.request().o())) {
                eVar2.cancel();
            }
        }
    }

    public CacheMode i() {
        return this.f64631g;
    }

    public long j() {
        return this.f64632h;
    }

    public HttpHeaders k() {
        return this.f64629e;
    }

    public HttpParams l() {
        return this.f64628d;
    }

    public Context m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30877q3, new Class[0], Context.class);
        if (patchProxyResultProxy.isSupported) {
            return (Context) patchProxyResultProxy.result;
        }
        la.b.b(this.f64625a, "please call OkGo.getInstance().init() first in application!");
        return this.f64625a;
    }

    public ja.a n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30943t3, new Class[0], ja.a.class);
        return patchProxyResultProxy.isSupported ? (ja.a) patchProxyResultProxy.result : (ja.a) this.f64627c.getCookieJar();
    }

    public Handler o() {
        return this.f64626b;
    }

    public z q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30899r3, new Class[0], z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        la.b.b(this.f64627c, "please call OkGo.getInstance().setOkHttpClient() first in application!");
        return this.f64627c;
    }

    public int r() {
        return this.f64630f;
    }

    public b t(Application application) {
        this.f64625a = application;
        return this;
    }

    public b y(CacheMode cacheMode) {
        this.f64631g = cacheMode;
        return this;
    }

    public b z(long j10) {
        if (j10 <= -1) {
            j10 = -1;
        }
        this.f64632h = j10;
        return this;
    }
}
