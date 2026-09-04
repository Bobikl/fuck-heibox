package com.lzy.okgo.cache.policy;

import android.graphics.Bitmap;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.exception.HttpException;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.c0;
import okhttp3.s;

/* JADX INFO: compiled from: BaseCachePolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T> implements b<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Request<T, ? extends Request> f64644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f64645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile int f64646c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f64647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected okhttp3.e f64648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ia.c<T> f64649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected CacheEntity<T> f64650g;

    /* JADX INFO: renamed from: com.lzy.okgo.cache.policy.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseCachePolicy.java */
    public class C0520a implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0520a() {
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, bb.c.b.Z3, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(iOException instanceof SocketTimeoutException) || a.this.f64646c >= a.this.f64644a.S()) {
                if (eVar.getCanceled()) {
                    return;
                }
                a.this.b(com.lzy.okgo.model.b.c(false, eVar, null, iOException));
                return;
            }
            a.this.f64646c++;
            a aVar = a.this;
            aVar.f64648e = aVar.f64644a.Q();
            if (a.this.f64645b) {
                a.this.f64648e.cancel();
            } else {
                a.this.f64648e.enqueue(this);
            }
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, c0 c0Var) throws IOException {
            if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, bb.c.b.f30509a4, new Class[]{okhttp3.e.class, c0.class}, Void.TYPE).isSupported) {
                return;
            }
            int iX = c0Var.x();
            if (iX == 404 || iX >= 500) {
                a.this.b(com.lzy.okgo.model.b.c(false, eVar, c0Var, HttpException.b()));
                return;
            }
            if (a.this.h(eVar, c0Var)) {
                return;
            }
            try {
                T tG = a.this.f64644a.L().g(c0Var);
                a.a(a.this, c0Var.getHeaders(), tG);
                a.this.c(com.lzy.okgo.model.b.p(false, tG, eVar, c0Var));
            } catch (Throwable th2) {
                a.this.b(com.lzy.okgo.model.b.c(false, eVar, c0Var, th2));
            }
        }
    }

    public a(Request<T, ? extends Request> request) {
        this.f64644a = request;
    }

    static /* synthetic */ void a(a aVar, s sVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{aVar, sVar, obj}, null, changeQuickRedirect, true, bb.c.b.Y3, new Class[]{a.class, s.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.l(sVar, obj);
    }

    private void l(s sVar, T t10) {
        if (PatchProxy.proxy(new Object[]{sVar, t10}, this, changeQuickRedirect, false, bb.c.b.U3, new Class[]{s.class, Object.class}, Void.TYPE).isSupported || this.f64644a.I() == CacheMode.NO_CACHE || (t10 instanceof Bitmap)) {
            return;
        }
        CacheEntity<T> cacheEntityB = la.a.b(sVar, t10, this.f64644a.I(), this.f64644a.H());
        if (cacheEntityB == null) {
            com.lzy.okgo.db.b.O().Q(this.f64644a.H());
        } else {
            com.lzy.okgo.db.b.O().R(this.f64644a.H(), cacheEntityB);
        }
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void cancel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 360, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64645b = true;
        okhttp3.e eVar = this.f64648e;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.lzy.okgo.cache.policy.b
    public synchronized okhttp3.e d() throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.R3, new Class[0], okhttp3.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (okhttp3.e) patchProxyResultProxy.result;
        }
        if (this.f64647d) {
            throw HttpException.a("Already executed!");
        }
        this.f64647d = true;
        this.f64648e = this.f64644a.Q();
        if (this.f64645b) {
            this.f64648e.cancel();
        }
        return this.f64648e;
    }

    @Override // com.lzy.okgo.cache.policy.b
    public CacheEntity<T> e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Q3, new Class[0], CacheEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheEntity) patchProxyResultProxy.result;
        }
        if (this.f64644a.H() == null) {
            Request<T, ? extends Request> request = this.f64644a;
            request.v(la.b.c(request.G(), this.f64644a.P().f64765b));
        }
        if (this.f64644a.I() == null) {
            this.f64644a.w(CacheMode.NO_CACHE);
        }
        CacheMode cacheModeI = this.f64644a.I();
        if (cacheModeI != CacheMode.NO_CACHE) {
            CacheEntity<T> cacheEntity = (CacheEntity<T>) com.lzy.okgo.db.b.O().K(this.f64644a.H());
            this.f64650g = cacheEntity;
            la.a.a(this.f64644a, cacheEntity, cacheModeI);
            CacheEntity<T> cacheEntity2 = this.f64650g;
            if (cacheEntity2 != null && cacheEntity2.a(cacheModeI, this.f64644a.K(), System.currentTimeMillis())) {
                this.f64650g.j(true);
            }
        }
        CacheEntity<T> cacheEntity3 = this.f64650g;
        if (cacheEntity3 == null || cacheEntity3.g() || this.f64650g.c() == null || this.f64650g.f() == null) {
            this.f64650g = null;
        }
        return this.f64650g;
    }

    @Override // com.lzy.okgo.cache.policy.b
    public boolean h(okhttp3.e eVar, c0 c0Var) {
        return false;
    }

    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.T3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64648e.enqueue(new C0520a());
    }

    @Override // com.lzy.okgo.cache.policy.b
    public boolean isCanceled() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.X3, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f64645b) {
            return true;
        }
        synchronized (this) {
            okhttp3.e eVar = this.f64648e;
            if (eVar != null && eVar.getCanceled()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.lzy.okgo.cache.policy.b
    public boolean isExecuted() {
        return this.f64647d;
    }

    public com.lzy.okgo.model.b<T> j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.S3, new Class[0], com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        try {
            c0 c0VarExecute = this.f64648e.execute();
            int iX = c0VarExecute.x();
            if (iX != 404 && iX < 500) {
                T tG = this.f64644a.L().g(c0VarExecute);
                l(c0VarExecute.getHeaders(), tG);
                return com.lzy.okgo.model.b.p(false, tG, this.f64648e, c0VarExecute);
            }
            return com.lzy.okgo.model.b.c(false, this.f64648e, c0VarExecute, HttpException.b());
        } catch (Throwable th2) {
            if ((th2 instanceof SocketTimeoutException) && this.f64646c < this.f64644a.S()) {
                this.f64646c++;
                this.f64648e = this.f64644a.Q();
                if (this.f64645b) {
                    this.f64648e.cancel();
                } else {
                    j();
                }
            }
            return com.lzy.okgo.model.b.c(false, this.f64648e, null, th2);
        }
    }

    public void k(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, bb.c.b.V3, new Class[]{Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        com.lzy.okgo.b.p().o().post(runnable);
    }
}
