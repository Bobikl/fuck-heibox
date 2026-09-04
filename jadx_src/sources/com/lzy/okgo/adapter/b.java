package com.lzy.okgo.adapter;

import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.cache.policy.f;
import com.lzy.okgo.cache.policy.g;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CacheCall.java */
/* JADX INFO: loaded from: classes.dex */
public class b<T> implements c<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.lzy.okgo.cache.policy.b<T> f64620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Request<T, ? extends Request> f64621b;

    /* JADX INFO: compiled from: CacheCall.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64622a;

        static {
            int[] iArr = new int[CacheMode.valuesCustom().length];
            f64622a = iArr;
            try {
                iArr[CacheMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64622a[CacheMode.NO_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64622a[CacheMode.IF_NONE_CACHE_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64622a[CacheMode.FIRST_CACHE_THEN_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64622a[CacheMode.REQUEST_FAILED_READ_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(Request<T, ? extends Request> request) {
        this.f64620a = null;
        this.f64621b = request;
        this.f64620a = b();
    }

    private com.lzy.okgo.cache.policy.b<T> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.D3, new Class[0], com.lzy.okgo.cache.policy.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.cache.policy.b) patchProxyResultProxy.result;
        }
        int i10 = a.f64622a[this.f64621b.I().ordinal()];
        if (i10 == 1) {
            this.f64620a = new com.lzy.okgo.cache.policy.c(this.f64621b);
        } else if (i10 == 2) {
            this.f64620a = new com.lzy.okgo.cache.policy.e(this.f64621b);
        } else if (i10 == 3) {
            this.f64620a = new f(this.f64621b);
        } else if (i10 == 4) {
            this.f64620a = new com.lzy.okgo.cache.policy.d(this.f64621b);
        } else if (i10 == 5) {
            this.f64620a = new g(this.f64621b);
        }
        if (this.f64621b.J() != null) {
            this.f64620a = this.f64621b.J();
        }
        la.b.b(this.f64620a, "policy == null");
        return this.f64620a;
    }

    @Override // com.lzy.okgo.adapter.c
    public void a(ia.c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.b.C3, new Class[]{ia.c.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.b(cVar, "callback == null");
        this.f64620a.f(this.f64620a.e(), cVar);
    }

    @Override // com.lzy.okgo.adapter.c
    public void cancel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.F3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64620a.cancel();
    }

    @Override // com.lzy.okgo.adapter.c
    public c<T> clone() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.H3, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new b(this.f64621b);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39clone() throws CloneNotSupportedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.I3, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : clone();
    }

    @Override // com.lzy.okgo.adapter.c
    public com.lzy.okgo.model.b<T> execute() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.B3, new Class[0], com.lzy.okgo.model.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okgo.model.b) patchProxyResultProxy.result;
        }
        return this.f64620a.g(this.f64620a.e());
    }

    @Override // com.lzy.okgo.adapter.c
    public Request getRequest() {
        return this.f64621b;
    }

    @Override // com.lzy.okgo.adapter.c
    public boolean isCanceled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.G3, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f64620a.isCanceled();
    }

    @Override // com.lzy.okgo.adapter.c
    public boolean isExecuted() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.E3, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f64620a.isExecuted();
    }
}
