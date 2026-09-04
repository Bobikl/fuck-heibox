package com.lzy.okgo.request.base;

import android.text.TextUtils;
import com.lzy.okgo.adapter.c;
import com.lzy.okgo.adapter.d;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpMethod;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.z;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Request<T, R extends Request> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7174118653689916252L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f64817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f64818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected transient z f64819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected transient Object f64820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f64821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected CacheMode f64822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f64823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f64824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected HttpParams f64825j = new HttpParams();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected HttpHeaders f64826k = new HttpHeaders();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected transient a0 f64827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected transient c<T> f64828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected transient ia.c<T> f64829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected transient com.lzy.okgo.convert.b<T> f64830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected transient com.lzy.okgo.cache.policy.b<T> f64831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected transient b.c f64832q;

    public Request(String str) {
        this.f64817b = str;
        this.f64818c = str;
        com.lzy.okgo.b bVarP = com.lzy.okgo.b.p();
        String strC = HttpHeaders.c();
        if (!TextUtils.isEmpty(strC)) {
            X("Accept-Language", strC);
        }
        String strJ = HttpHeaders.j();
        if (!TextUtils.isEmpty(strJ)) {
            X("User-Agent", strJ);
        }
        if (bVarP.l() != null) {
            Y(bVarP.l());
        }
        if (bVarP.k() != null) {
            W(bVarP.k());
        }
        this.f64821f = bVarP.r();
        this.f64822g = bVarP.i();
        this.f64824i = bVarP.j();
    }

    public R A(z zVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, bb.c.b.f30838oa, new Class[]{z.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        la.b.b(zVar, "OkHttpClient == null");
        this.f64819d = zVar;
        return this;
    }

    public R B(com.lzy.okgo.convert.b<T> bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30884qa, new Class[]{com.lzy.okgo.convert.b.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        la.b.b(bVar, "converter == null");
        this.f64830o = bVar;
        return this;
    }

    public c0 C() throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qa, new Class[0], c0.class);
        return patchProxyResultProxy.isSupported ? (c0) patchProxyResultProxy.result : Q().execute();
    }

    public void D(ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 719, new Class[]{ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.b(cVar, "callback == null");
        this.f64829n = cVar;
        r().a(cVar);
    }

    public abstract a0 E(b0 b0Var);

    public abstract b0 F();

    public String G() {
        return this.f64818c;
    }

    public String H() {
        return this.f64823h;
    }

    public CacheMode I() {
        return this.f64822g;
    }

    public com.lzy.okgo.cache.policy.b<T> J() {
        return this.f64831p;
    }

    public long K() {
        return this.f64824i;
    }

    public com.lzy.okgo.convert.b<T> L() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.La, new Class[0], com.lzy.okgo.convert.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.convert.b) patchProxyResultProxy.result;
        }
        if (this.f64830o == null) {
            this.f64830o = this.f64829n;
        }
        la.b.b(this.f64830o, "converter == null, do you forget to call Request#converter(Converter<T>) ?");
        return this.f64830o;
    }

    public HttpParams.FileWrapper M(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Ka, new Class[]{String.class}, HttpParams.FileWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (HttpParams.FileWrapper) patchProxyResultProxy.result;
        }
        List<HttpParams.FileWrapper> list = this.f64825j.f64766c.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public HttpHeaders N() {
        return this.f64826k;
    }

    public abstract HttpMethod O();

    public HttpParams P() {
        return this.f64825j;
    }

    public e Q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ma, new Class[0], e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        b0 b0VarF = F();
        if (b0VarF != null) {
            b bVar = new b(b0VarF, this.f64829n);
            bVar.e(this.f64832q);
            this.f64827l = E(bVar);
        } else {
            this.f64827l = E(null);
        }
        if (this.f64819d == null) {
            this.f64819d = com.lzy.okgo.b.p().q();
        }
        return this.f64819d.a(this.f64827l);
    }

    public a0 R() {
        return this.f64827l;
    }

    public int S() {
        return this.f64821f;
    }

    public Object T() {
        return this.f64820e;
    }

    public String U() {
        return this.f64817b;
    }

    public String V(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Ja, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        List<String> list = this.f64825j.f64765b.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public R W(HttpHeaders httpHeaders) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{httpHeaders}, this, changeQuickRedirect, false, bb.c.b.f30950ta, new Class[]{HttpHeaders.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64826k.m(httpHeaders);
        return this;
    }

    public R X(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 696, new Class[]{String.class, String.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64826k.n(str, str2);
        return this;
    }

    public R Y(HttpParams httpParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{httpParams}, this, changeQuickRedirect, false, bb.c.b.f31038xa, new Class[]{HttpParams.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.b(httpParams);
        return this;
    }

    public R Z(String str, char c10, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Character(c10), zArr}, this, changeQuickRedirect, false, 706, new Class[]{String.class, Character.TYPE, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.c(str, c10, zArr);
        return this;
    }

    public R a0(String str, double d10, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Double(d10), zArr}, this, changeQuickRedirect, false, 704, new Class[]{String.class, Double.TYPE, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.d(str, d10, zArr);
        return this;
    }

    public R b0(String str, float f10, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Float(f10), zArr}, this, changeQuickRedirect, false, bb.c.b.Ba, new Class[]{String.class, Float.TYPE, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.e(str, f10, zArr);
        return this;
    }

    public R c0(String str, int i10, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), zArr}, this, changeQuickRedirect, false, 702, new Class[]{String.class, Integer.TYPE, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.f(str, i10, zArr);
        return this;
    }

    public R d0(String str, long j10, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Long(j10), zArr}, this, changeQuickRedirect, false, 705, new Class[]{String.class, Long.TYPE, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.g(str, j10, zArr);
        return this;
    }

    public R e0(String str, String str2, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, zArr}, this, changeQuickRedirect, false, 701, new Class[]{String.class, String.class, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.m(str, str2, zArr);
        return this;
    }

    public R f0(String str, boolean z10, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), zArr}, this, changeQuickRedirect, false, 707, new Class[]{String.class, Boolean.TYPE, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.n(str, z10, zArr);
        return this;
    }

    public R g0(Map<String, String> map, boolean... zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map, zArr}, this, changeQuickRedirect, false, 700, new Class[]{Map.class, boolean[].class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.o(map, zArr);
        return this;
    }

    public R h0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31016wa, new Class[0], Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64826k.clear();
        return this;
    }

    public R i0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ia, new Class[0], Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.clear();
        return this;
    }

    public R j0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30994va, new Class[]{String.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64826k.o(str);
        return this;
    }

    public R k0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Ha, new Class[]{String.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.s(str);
        return this;
    }

    public R l0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30815na, new Class[]{Integer.TYPE}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("retryCount must > 0");
        }
        this.f64821f = i10;
        return this;
    }

    public void m0(ia.c<T> cVar) {
        this.f64829n = cVar;
    }

    public R n0(Object obj) {
        this.f64820e = obj;
        return this;
    }

    public R o0(b.c cVar) {
        this.f64832q = cVar;
        return this;
    }

    public c<T> r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Na, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c<T> cVar = this.f64828m;
        return cVar == null ? new com.lzy.okgo.adapter.b(this) : cVar;
    }

    public <E> E s(com.lzy.okgo.adapter.a aVar, d<T, E> dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, dVar}, this, changeQuickRedirect, false, bb.c.b.Pa, new Class[]{com.lzy.okgo.adapter.a.class, d.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        c<T> bVar = this.f64828m;
        if (bVar == null) {
            bVar = new com.lzy.okgo.adapter.b<>(this);
        }
        return dVar.a(bVar, aVar);
    }

    public <E> E t(d<T, E> dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.b.Oa, new Class[]{d.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (E) patchProxyResultProxy.result;
        }
        c<T> bVar = this.f64828m;
        if (bVar == null) {
            bVar = new com.lzy.okgo.adapter.b<>(this);
        }
        return dVar.a(bVar, null);
    }

    public R u(String str, List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, bb.c.b.Ga, new Class[]{String.class, List.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        this.f64825j.r(str, list);
        return this;
    }

    public R v(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30928sa, new Class[]{String.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        la.b.b(str, "cacheKey == null");
        this.f64823h = str;
        return this;
    }

    public R w(CacheMode cacheMode) {
        this.f64822g = cacheMode;
        return this;
    }

    public R x(com.lzy.okgo.cache.policy.b<T> bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30906ra, new Class[]{com.lzy.okgo.cache.policy.b.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        la.b.b(bVar, "cachePolicy == null");
        this.f64831p = bVar;
        return this;
    }

    public R y(long j10) {
        if (j10 <= -1) {
            j10 = -1;
        }
        this.f64824i = j10;
        return this;
    }

    public R z(c<T> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.b.f30861pa, new Class[]{c.class}, Request.class);
        if (patchProxyResultProxy.isSupported) {
            return (R) patchProxyResultProxy.result;
        }
        la.b.b(cVar, "call == null");
        this.f64828m = cVar;
        return this;
    }
}
