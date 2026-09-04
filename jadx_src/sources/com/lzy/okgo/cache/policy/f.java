package com.lzy.okgo.cache.policy;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NoneCacheRequestPolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public class f<T> extends com.lzy.okgo.cache.policy.a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: NoneCacheRequestPolicy.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64672b;

        a(com.lzy.okgo.model.b bVar) {
            this.f64672b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.D4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            f.this.f64649f.c(this.f64672b);
            f.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: NoneCacheRequestPolicy.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64674b;

        b(com.lzy.okgo.model.b bVar) {
            this.f64674b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.E4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            f.this.f64649f.b(this.f64674b);
            f.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: NoneCacheRequestPolicy.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CacheEntity f64676b;

        c(CacheEntity cacheEntity) {
            this.f64676b = cacheEntity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.F4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            f fVar = f.this;
            fVar.f64649f.f(fVar.f64644a);
            try {
                f.this.d();
                CacheEntity cacheEntity = this.f64676b;
                if (cacheEntity == null) {
                    f.this.i();
                    return;
                }
                f.this.f64649f.e(com.lzy.okgo.model.b.p(true, cacheEntity.c(), f.this.f64648e, null));
                f.this.f64649f.onFinish();
            } catch (Throwable th2) {
                f.this.f64649f.b(com.lzy.okgo.model.b.c(false, f.this.f64648e, null, th2));
            }
        }
    }

    public f(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void b(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.A4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new b(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void c(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f31076z4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new a(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void f(CacheEntity<T> cacheEntity, ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cacheEntity, cVar}, this, changeQuickRedirect, false, bb.c.b.C4, new Class[]{CacheEntity.class, ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64649f = cVar;
        k(new c(cacheEntity));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public com.lzy.okgo.model.b<T> g(CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, bb.c.b.B4, new Class[]{CacheEntity.class}, com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        try {
            d();
            com.lzy.okgo.model.b<T> bVarP = cacheEntity != null ? com.lzy.okgo.model.b.p(true, cacheEntity.c(), this.f64648e, null) : null;
            return bVarP == null ? j() : bVarP;
        } catch (Throwable th2) {
            return com.lzy.okgo.model.b.c(false, this.f64648e, null, th2);
        }
    }
}
