package com.lzy.okgo.cache.policy;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FirstCacheRequestPolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public class d<T> extends com.lzy.okgo.cache.policy.a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: FirstCacheRequestPolicy.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64661b;

        a(com.lzy.okgo.model.b bVar) {
            this.f64661b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30855p4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.this.f64649f.c(this.f64661b);
            d.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: FirstCacheRequestPolicy.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64663b;

        b(com.lzy.okgo.model.b bVar) {
            this.f64663b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30878q4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.this.f64649f.b(this.f64663b);
            d.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: FirstCacheRequestPolicy.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CacheEntity f64665b;

        c(CacheEntity cacheEntity) {
            this.f64665b = cacheEntity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30900r4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d dVar = d.this;
            dVar.f64649f.f(dVar.f64644a);
            try {
                d.this.d();
                CacheEntity cacheEntity = this.f64665b;
                if (cacheEntity != null) {
                    d.this.f64649f.e(com.lzy.okgo.model.b.p(true, cacheEntity.c(), d.this.f64648e, null));
                }
                d.this.i();
            } catch (Throwable th2) {
                d.this.f64649f.b(com.lzy.okgo.model.b.c(false, d.this.f64648e, null, th2));
            }
        }
    }

    public d(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void b(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30786m4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new b(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void c(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 375, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new a(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void f(CacheEntity<T> cacheEntity, ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cacheEntity, cVar}, this, changeQuickRedirect, false, bb.c.b.f30832o4, new Class[]{CacheEntity.class, ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64649f = cVar;
        k(new c(cacheEntity));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public com.lzy.okgo.model.b<T> g(CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, bb.c.b.f30809n4, new Class[]{CacheEntity.class}, com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        try {
            d();
            if (cacheEntity != null) {
                com.lzy.okgo.model.b.p(true, cacheEntity.c(), this.f64648e, null);
            }
            com.lzy.okgo.model.b<T> bVarJ = j();
            return (bVarJ.i() || cacheEntity == null) ? bVarJ : com.lzy.okgo.model.b.p(true, cacheEntity.c(), this.f64648e, bVarJ.f());
        } catch (Throwable th2) {
            return com.lzy.okgo.model.b.c(false, this.f64648e, null, th2);
        }
    }
}
