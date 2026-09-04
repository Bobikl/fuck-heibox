package com.lzy.okgo.cache.policy;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NoCachePolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public class e<T> extends com.lzy.okgo.cache.policy.a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: NoCachePolicy.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64667b;

        a(com.lzy.okgo.model.b bVar) {
            this.f64667b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31010w4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            e.this.f64649f.c(this.f64667b);
            e.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: NoCachePolicy.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okgo.model.b f64669b;

        b(com.lzy.okgo.model.b bVar) {
            this.f64669b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31032x4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            e.this.f64649f.b(this.f64669b);
            e.this.f64649f.onFinish();
        }
    }

    /* JADX INFO: compiled from: NoCachePolicy.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31054y4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            e eVar = e.this;
            eVar.f64649f.f(eVar.f64644a);
            try {
                e.this.d();
                e.this.i();
            } catch (Throwable th2) {
                e.this.f64649f.b(com.lzy.okgo.model.b.c(false, e.this.f64648e, null, th2));
            }
        }
    }

    public e(Request<T, ? extends Request> request) {
        super(request);
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void b(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30944t4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new b(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void c(com.lzy.okgo.model.b<T> bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.f30922s4, new Class[]{com.lzy.okgo.model.b.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new a(bVar));
    }

    @Override // com.lzy.okgo.cache.policy.b
    public void f(CacheEntity<T> cacheEntity, ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cacheEntity, cVar}, this, changeQuickRedirect, false, bb.c.b.f30988v4, new Class[]{CacheEntity.class, ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64649f = cVar;
        k(new c());
    }

    @Override // com.lzy.okgo.cache.policy.b
    public com.lzy.okgo.model.b<T> g(CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, this, changeQuickRedirect, false, bb.c.b.f30966u4, new Class[]{CacheEntity.class}, com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        try {
            d();
            return j();
        } catch (Throwable th2) {
            return com.lzy.okgo.model.b.c(false, this.f64648e, null, th2);
        }
    }
}
