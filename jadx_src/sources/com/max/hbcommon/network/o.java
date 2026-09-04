package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.e0;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kh.r;

/* JADX INFO: compiled from: RxPollingUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f68172a = "RxPollingUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: RxPollingUtil.java */
    public class a<T> extends d<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f68173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f68174c;

        a(c cVar, AtomicInteger atomicInteger) {
            this.f68173b = cVar;
            this.f68174c = atomicInteger;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Nc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(o.f68172a, "onComplete");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.e.Oc, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            this.f68173b.a(th2);
            com.max.hbcommon.utils.d.b(o.f68172a, "onError");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onNext(T t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.e.Pc, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(o.f68172a, "onNext ");
            if (this.f68173b.c(t10)) {
                this.f68173b.onResult(t10);
            } else if (this.f68174c.get() >= this.f68173b.e() - 1) {
                this.f68173b.d(t10);
            } else {
                this.f68173b.onResult(t10);
            }
        }
    }

    /* JADX INFO: compiled from: RxPollingUtil.java */
    public class b implements kh.o<z<Object>, e0<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f68175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f68176c;

        /* JADX INFO: compiled from: RxPollingUtil.java */
        public class a implements kh.o<Object, e0<?>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public e0<?> a(Object obj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Sc, new Class[]{Object.class}, e0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (e0) patchProxyResultProxy.result;
                }
                z zVarL3 = z.l3(0);
                b bVar = b.this;
                return zVarL3.w1(bVar.f68175b.b(bVar.f68176c.get()), TimeUnit.MILLISECONDS);
            }

            /* JADX WARN: Type inference failed for: r9v2, types: [io.reactivex.e0<?>, java.lang.Object] */
            @Override // kh.o
            public /* bridge */ /* synthetic */ e0<?> apply(Object obj) throws Exception {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Tc, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(obj);
            }
        }

        b(c cVar, AtomicInteger atomicInteger) {
            this.f68175b = cVar;
            this.f68176c = atomicInteger;
        }

        public e0<?> a(z<Object> zVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, 4240, new Class[]{z.class}, e0.class);
            return patchProxyResultProxy.isSupported ? (e0) patchProxyResultProxy.result : zVar.k2(new a());
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [io.reactivex.e0<?>, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ e0<?> apply(z<Object> zVar) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, bb.c.e.Rc, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(zVar);
        }
    }

    /* JADX INFO: compiled from: RxPollingUtil.java */
    public interface c<T> {
        void a(Throwable th2);

        long b(int i10);

        boolean c(T t10);

        void d(T t10);

        int e();

        void onResult(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(AtomicInteger atomicInteger, c cVar, Object obj) throws Exception {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{atomicInteger, cVar, obj}, null, changeQuickRedirect, true, bb.c.e.Mc, new Class[]{AtomicInteger.class, c.class, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return atomicInteger.incrementAndGet() >= cVar.e() || cVar.c(obj);
    }

    public static <T> void c(io.reactivex.disposables.a aVar, z<T> zVar, final c<T> cVar) {
        if (PatchProxy.proxy(new Object[]{aVar, zVar, cVar}, null, changeQuickRedirect, true, bb.c.e.Lc, new Class[]{io.reactivex.disposables.a.class, z.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        io.reactivex.disposables.b bVar = (io.reactivex.disposables.b) zVar.u4(new b(cVar, atomicInteger)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).m6(new r() { // from class: com.max.hbcommon.network.n
            @Override // kh.r
            public final boolean test(Object obj) {
                return o.b(atomicInteger, cVar, obj);
            }
        }).J5(new a(cVar, atomicInteger));
        if (aVar != null) {
            aVar.c(bVar);
        }
    }
}
