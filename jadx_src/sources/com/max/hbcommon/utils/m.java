package com.max.hbcommon.utils;

import androidx.lifecycle.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.uber.autodispose.v;
import io.reactivex.g0;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RetryForTimeDownHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public class m {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f68250f = "RetryForTimeDownHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f68251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f68253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f68254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y f68255e;

    /* JADX INFO: compiled from: RetryForTimeDownHelper.java */
    public class a implements g0<Long> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void a(Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.f.B1, new Class[]{Long.class}, Void.TYPE).isSupported || m.this.f68254d == null) {
                return;
            }
            m.this.f68254d.a();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.f.C1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(l10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
        }
    }

    /* JADX INFO: compiled from: RetryForTimeDownHelper.java */
    public class b implements g0<Long> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.f.D1, new Class[]{Long.class}, Void.TYPE).isSupported || m.this.f68254d == null) {
                return;
            }
            m.this.f68254d.a();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Long l10) {
            if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.f.E1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(l10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
        }
    }

    /* JADX INFO: compiled from: RetryForTimeDownHelper.java */
    public interface c {
        void a();

        void onComplete();
    }

    public m(int i10, long j10, c cVar) {
        this(null, i10, j10, cVar);
    }

    public m(y yVar, int i10, long j10, c cVar) {
        this.f68255e = yVar;
        this.f68252b = i10;
        this.f68253c = j10;
        this.f68254d = cVar;
    }

    private void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32702z1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z.O6(this.f68253c, TimeUnit.MILLISECONDS).g(new a());
    }

    private void f(y yVar) {
        if (PatchProxy.proxy(new Object[]{yVar}, this, changeQuickRedirect, false, bb.c.f.A1, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        long j10 = this.f68253c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        z.O6(j10, timeUnit);
        ((v) z.O6(this.f68253c, timeUnit).i(com.uber.autodispose.c.b(com.uber.autodispose.android.lifecycle.b.i(yVar)))).g(new b());
    }

    public int b() {
        return this.f68251a;
    }

    public boolean c() {
        return this.f68251a >= this.f68252b;
    }

    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32680y1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68251a++;
        if (this.f68251a > this.f68252b) {
            c cVar = this.f68254d;
            if (cVar != null) {
                cVar.onComplete();
                return;
            }
            return;
        }
        y yVar = this.f68255e;
        if (yVar != null) {
            f(yVar);
        } else {
            e();
        }
    }
}
