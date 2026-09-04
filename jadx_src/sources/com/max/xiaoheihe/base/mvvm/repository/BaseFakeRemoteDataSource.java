package com.max.xiaoheihe.base.mvvm.repository;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.reactivex.z;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BaseFakeRemoteDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nBaseFakeRemoteDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFakeRemoteDataSource.kt\ncom/max/xiaoheihe/base/mvvm/repository/BaseFakeRemoteDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
@o(parameters = 0)
public abstract class BaseFakeRemoteDataSource<T> implements b<T> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76924e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private final com.max.xiaoheihe.base.mvvm.repository.a<T> f76925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final com.max.xiaoheihe.network.e f76926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private z<T> f76927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final kotlin.z f76928d;

    /* JADX INFO: compiled from: BaseFakeRemoteDataSource.kt */
    public static final class a extends com.max.hbcommon.network.d<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseFakeRemoteDataSource<T> f76929b;

        a(BaseFakeRemoteDataSource<T> baseFakeRemoteDataSource) {
            this.f76929b = baseFakeRemoteDataSource;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.yJ, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            com.max.xiaoheihe.base.mvvm.repository.a<T> aVarE = this.f76929b.e();
            if (aVarE != null) {
                aVarE.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, c.m.zJ, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            com.max.xiaoheihe.base.mvvm.repository.a<T> aVarE = this.f76929b.e();
            if (aVarE != null) {
                aVarE.onError(e10);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onNext(T t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, c.m.AJ, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(t10);
            com.max.xiaoheihe.base.mvvm.repository.a<T> aVarE = this.f76929b.e();
            if (aVarE != null) {
                aVarE.onNext(t10);
            }
        }
    }

    public BaseFakeRemoteDataSource(@e com.max.xiaoheihe.base.mvvm.repository.a<T> aVar) {
        this.f76925a = aVar;
        com.max.xiaoheihe.network.e eVarA = i.a();
        f0.o(eVarA, "createHeyBoxService()");
        this.f76926b = eVarA;
        this.f76928d = b0.c(new yh.a<io.reactivex.disposables.a>() { // from class: com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource$mCompositeDisposable$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final io.reactivex.disposables.a a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.BJ, new Class[0], io.reactivex.disposables.a.class);
                return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : new io.reactivex.disposables.a();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.disposables.a, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ io.reactivex.disposables.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.CJ, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    private final void a(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, c.m.wJ, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported || bVar == null) {
            return;
        }
        f().c(bVar);
    }

    private final io.reactivex.disposables.a f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.sJ, new Class[0], io.reactivex.disposables.a.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : (io.reactivex.disposables.a) this.f76928d.getValue();
    }

    public static /* synthetic */ void i(BaseFakeRemoteDataSource baseFakeRemoteDataSource, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{baseFakeRemoteDataSource, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.vJ, new Class[]{BaseFakeRemoteDataSource.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestData");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        baseFakeRemoteDataSource.h(z10);
    }

    @e
    public io.reactivex.disposables.b b() {
        z<T> zVarA4;
        z<T> zVarI5;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.tJ, new Class[0], io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        z<T> zVarD = d();
        if (zVarD == null || (zVarA4 = zVarD.a4(io.reactivex.android.schedulers.a.c())) == null || (zVarI5 = zVarA4.I5(io.reactivex.schedulers.b.d())) == null) {
            return null;
        }
        return (a) zVarI5.J5(new a(this));
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.xJ, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f().f();
    }

    @e
    public z<T> d() {
        return this.f76927c;
    }

    @e
    public final com.max.xiaoheihe.base.mvvm.repository.a<T> e() {
        return this.f76925a;
    }

    @d
    public final com.max.xiaoheihe.network.e g() {
        return this.f76926b;
    }

    public final void h(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.uJ, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.disposables.b bVarB = b();
        if (z10) {
            a(bVarB);
        }
    }

    public void j(@e z<T> zVar) {
        this.f76927c = zVar;
    }
}
