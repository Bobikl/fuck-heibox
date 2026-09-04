package com.lzy.okgo.cache.policy;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.exception.CacheException;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.c0;

/* JADX INFO: compiled from: DefaultCachePolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public class c<T> extends com.lzy.okgo.cache.policy.a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DefaultCachePolicy.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64652b;

        a(com.lzy.okgo.model.b bVar) {
            this.f64652b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30648g4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.f64649f.c(this.f64652b);
            c.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: DefaultCachePolicy.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64654b;

        b(com.lzy.okgo.model.b bVar) {
            this.f64654b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30671h4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.f64649f.b(this.f64654b);
            c.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: renamed from: com.lzy.okgo.cache.policy.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultCachePolicy.java */
    public class RunnableC0521c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64656b;

        RunnableC0521c(com.lzy.okgo.model.b bVar) {
            this.f64656b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30694i4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.f64649f.b(this.f64656b);
            c.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: DefaultCachePolicy.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64658b;

        d(com.lzy.okgo.model.b bVar) {
            this.f64658b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30717j4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.f64649f.e(this.f64658b);
            c.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: DefaultCachePolicy.java */
    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30740k4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c cVar = c.this;
            cVar.f64649f.f(cVar.f64644a);
            try {
                c.this.d();
                c.this.i();
            } catch (Throwable th2) {
                c.this.f64649f.b(com.lzy.okgo.model.b.c(false, c.this.f64648e, null, th2));
            }
        }
    }

    public c(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void b(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30555c4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new b(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void c(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30532b4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new a(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void f(CacheEntity<T> cacheEntity, ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cacheEntity, cVar}, this, changeQuickRedirect, false, bb.c.b.f30625f4, new Class[]{CacheEntity.class, ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64649f = cVar;
        k(new e());
    }

    @Override // com.lzy.okgo.cache.policy.b
    public com.lzy.okgo.model.b<T> g(CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, bb.c.b.f30602e4, new Class[]{CacheEntity.class}, com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        try {
            d();
            com.lzy.okgo.model.b<T> bVarJ = j();
            if (bVarJ.i() && bVarJ.b() == 304) {
                return cacheEntity == null ? com.lzy.okgo.model.b.c(true, this.f64648e, bVarJ.f(), CacheException.a(this.f64644a.H())) : com.lzy.okgo.model.b.p(true, cacheEntity.c(), this.f64648e, bVarJ.f());
            }
            return bVarJ;
        } catch (Throwable th2) {
            return com.lzy.okgo.model.b.c(false, this.f64648e, null, th2);
        }
    }

    @Override // com.lzy.okgo.cache.policy.a, com.lzy.okgo.cache.policy.b
    public boolean h(okhttp3.e eVar, c0 c0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, bb.c.b.f30579d4, new Class[]{okhttp3.e.class, c0.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (c0Var.x() != 304) {
            return false;
        }
        CacheEntity<T> cacheEntity = this.f64650g;
        if (cacheEntity == null) {
            k(new RunnableC0521c(com.lzy.okgo.model.b.c(true, eVar, c0Var, CacheException.a(this.f64644a.H()))));
        } else {
            k(new d(com.lzy.okgo.model.b.p(true, cacheEntity.c(), eVar, c0Var)));
        }
        return true;
    }
}
