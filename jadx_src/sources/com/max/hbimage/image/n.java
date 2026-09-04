package com.max.hbimage.image;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.InputStream;
import okhttp3.z;

/* JADX INFO: compiled from: OkHttpUrlLoader.java */
/* JADX INFO: loaded from: classes10.dex */
public class n implements com.bumptech.glide.load.model.o<com.bumptech.glide.load.model.h, InputStream> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okhttp3.e.a f70484a;

    /* JADX INFO: compiled from: OkHttpUrlLoader.java */
    public static class a implements com.bumptech.glide.load.model.p<com.bumptech.glide.load.model.h, InputStream> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile okhttp3.e.a f70485b;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private okhttp3.e.a f70486a;

        public a() {
            this(a());
        }

        public a(okhttp3.e.a aVar) {
            this.f70486a = aVar;
        }

        private static okhttp3.e.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.Kd, new Class[0], okhttp3.e.a.class);
            if (patchProxyResultProxy.isSupported) {
                return (okhttp3.e.a) patchProxyResultProxy.result;
            }
            if (f70485b == null) {
                synchronized (a.class) {
                    if (f70485b == null) {
                        f70485b = new z();
                    }
                }
            }
            return f70485b;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        public com.bumptech.glide.load.model.o<com.bumptech.glide.load.model.h, InputStream> d(com.bumptech.glide.load.model.s sVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, bb.c.g.Ld, new Class[]{com.bumptech.glide.load.model.s.class}, com.bumptech.glide.load.model.o.class);
            return patchProxyResultProxy.isSupported ? (com.bumptech.glide.load.model.o) patchProxyResultProxy.result : new n(this.f70486a);
        }
    }

    public n(okhttp3.e.a aVar) {
        this.f70484a = aVar;
    }

    @Override // com.bumptech.glide.load.model.o
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.o.a<InputStream> a(com.bumptech.glide.load.model.h hVar, int i10, int i11, com.bumptech.glide.load.f fVar) {
        Object[] objArr = {hVar, new Integer(i10), new Integer(i11), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Jd, new Class[]{Object.class, cls, cls, com.bumptech.glide.load.f.class}, com.bumptech.glide.load.model.o.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.load.model.o.a) patchProxyResultProxy.result : c(hVar, i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.model.o
    public /* bridge */ /* synthetic */ boolean b(com.bumptech.glide.load.model.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.Id, new Class[]{Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d(hVar);
    }

    public com.bumptech.glide.load.model.o.a<InputStream> c(com.bumptech.glide.load.model.h hVar, int i10, int i11, com.bumptech.glide.load.f fVar) {
        Object[] objArr = {hVar, new Integer(i10), new Integer(i11), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Hd, new Class[]{com.bumptech.glide.load.model.h.class, cls, cls, com.bumptech.glide.load.f.class}, com.bumptech.glide.load.model.o.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.load.model.o.a) patchProxyResultProxy.result : new com.bumptech.glide.load.model.o.a<>(hVar, new m(this.f70484a, hVar));
    }

    public boolean d(com.bumptech.glide.load.model.h hVar) {
        return true;
    }
}
