package com.lzy.okgo.cache.policy;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: RequestFailedCachePolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public class g<T> extends com.lzy.okgo.cache.policy.a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: RequestFailedCachePolicy.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64678b;

        a(com.lzy.okgo.model.b bVar) {
            this.f64678b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 400, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.this.f64649f.c(this.f64678b);
            g.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: RequestFailedCachePolicy.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64680b;

        b(com.lzy.okgo.model.b bVar) {
            this.f64680b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 401, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.this.f64649f.e(this.f64680b);
            g.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: RequestFailedCachePolicy.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64682b;

        c(com.lzy.okgo.model.b bVar) {
            this.f64682b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 402, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.this.f64649f.b(this.f64682b);
            g.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: RequestFailedCachePolicy.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 403, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g gVar = g.this;
            gVar.f64649f.f(gVar.f64644a);
            try {
                g.this.d();
                g.this.i();
            } catch (Throwable th2) {
                g.this.f64649f.b(com.lzy.okgo.model.b.c(false, g.this.f64648e, null, th2));
            }
        }
    }

    public g(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void b(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.H4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        CacheEntity<T> cacheEntity = this.f64650g;
        if (cacheEntity != null) {
            k(new b(com.lzy.okgo.model.b.p(true, cacheEntity.c(), bVar.e(), bVar.f())));
        } else {
            k(new c(bVar));
        }
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void c(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.G4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new a(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void f(CacheEntity<T> cacheEntity, ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cacheEntity, cVar}, this, changeQuickRedirect, false, bb.c.b.J4, new Class[]{CacheEntity.class, ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64649f = cVar;
        k(new d());
    }

    @Override // com.lzy.okgo.cache.policy.b
    public com.lzy.okgo.model.b<T> g(CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, bb.c.b.I4, new Class[]{CacheEntity.class}, com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        try {
            d();
            com.lzy.okgo.model.b<T> bVarJ = j();
            return (bVarJ.i() || cacheEntity == null) ? bVarJ : com.lzy.okgo.model.b.p(true, cacheEntity.c(), this.f64648e, bVarJ.f());
        } catch (Throwable th2) {
            return com.lzy.okgo.model.b.c(false, this.f64648e, null, th2);
        }
    }
}
