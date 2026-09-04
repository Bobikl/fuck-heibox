package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Configuration.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f28723n = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    final Executor f28724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    final Executor f28725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    final z f28726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    final l f28727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    final v f28728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    final androidx.core.util.d<Throwable> f28729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    final androidx.core.util.d<Throwable> f28730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    final String f28731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f28732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f28733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f28734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f28735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f28736m;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Configuration.java */
    public class ThreadFactoryC0228a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f28737b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28738c;

        ThreadFactoryC0228a(boolean z10) {
            this.f28738c = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f28738c ? "WM.task-" : "androidx.work-") + this.f28737b.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: Configuration.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f28740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        z f28741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        l f28742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f28743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        v f28744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        androidx.core.util.d<Throwable> f28745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        androidx.core.util.d<Throwable> f28746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        String f28747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f28748i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28749j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f28750k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f28751l;

        public b() {
            this.f28748i = 4;
            this.f28749j = 0;
            this.f28750k = Integer.MAX_VALUE;
            this.f28751l = 20;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b(@n0 a aVar) {
            this.f28740a = aVar.f28724a;
            this.f28741b = aVar.f28726c;
            this.f28742c = aVar.f28727d;
            this.f28743d = aVar.f28725b;
            this.f28748i = aVar.f28732i;
            this.f28749j = aVar.f28733j;
            this.f28750k = aVar.f28734k;
            this.f28751l = aVar.f28735l;
            this.f28744e = aVar.f28728e;
            this.f28745f = aVar.f28729f;
            this.f28746g = aVar.f28730g;
            this.f28747h = aVar.f28731h;
        }

        @n0
        public a a() {
            return new a(this);
        }

        @n0
        public b b(@n0 String str) {
            this.f28747h = str;
            return this;
        }

        @n0
        public b c(@n0 Executor executor) {
            this.f28740a = executor;
            return this;
        }

        @n0
        public b d(@n0 androidx.core.util.d<Throwable> dVar) {
            this.f28745f = dVar;
            return this;
        }

        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b e(@n0 final j jVar) {
            Objects.requireNonNull(jVar);
            this.f28745f = new androidx.core.util.d() { // from class: androidx.work.b
                @Override // androidx.core.util.d
                public final void accept(Object obj) {
                    jVar.a((Throwable) obj);
                }
            };
            return this;
        }

        @n0
        public b f(@n0 l lVar) {
            this.f28742c = lVar;
            return this;
        }

        @n0
        public b g(int i10, int i11) {
            if (i11 - i10 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f28749j = i10;
            this.f28750k = i11;
            return this;
        }

        @n0
        public b h(int i10) {
            if (i10 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f28751l = Math.min(i10, 50);
            return this;
        }

        @n0
        public b i(int i10) {
            this.f28748i = i10;
            return this;
        }

        @n0
        public b j(@n0 v vVar) {
            this.f28744e = vVar;
            return this;
        }

        @n0
        public b k(@n0 androidx.core.util.d<Throwable> dVar) {
            this.f28746g = dVar;
            return this;
        }

        @n0
        public b l(@n0 Executor executor) {
            this.f28743d = executor;
            return this;
        }

        @n0
        public b m(@n0 z zVar) {
            this.f28741b = zVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: Configuration.java */
    public interface c {
        @n0
        a a();
    }

    a(@n0 b bVar) {
        Executor executor = bVar.f28740a;
        if (executor == null) {
            this.f28724a = a(false);
        } else {
            this.f28724a = executor;
        }
        Executor executor2 = bVar.f28743d;
        if (executor2 == null) {
            this.f28736m = true;
            this.f28725b = a(true);
        } else {
            this.f28736m = false;
            this.f28725b = executor2;
        }
        z zVar = bVar.f28741b;
        if (zVar == null) {
            this.f28726c = z.c();
        } else {
            this.f28726c = zVar;
        }
        l lVar = bVar.f28742c;
        if (lVar == null) {
            this.f28727d = l.c();
        } else {
            this.f28727d = lVar;
        }
        v vVar = bVar.f28744e;
        if (vVar == null) {
            this.f28728e = new androidx.work.impl.d();
        } else {
            this.f28728e = vVar;
        }
        this.f28732i = bVar.f28748i;
        this.f28733j = bVar.f28749j;
        this.f28734k = bVar.f28750k;
        this.f28735l = bVar.f28751l;
        this.f28729f = bVar.f28745f;
        this.f28730g = bVar.f28746g;
        this.f28731h = bVar.f28747h;
    }

    @n0
    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    @n0
    private ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0228a(z10);
    }

    @p0
    public String c() {
        return this.f28731h;
    }

    @n0
    public Executor d() {
        return this.f28724a;
    }

    @p0
    public androidx.core.util.d<Throwable> e() {
        return this.f28729f;
    }

    @n0
    public l f() {
        return this.f28727d;
    }

    public int g() {
        return this.f28734k;
    }

    @f0(from = com.google.android.exoplayer2.k.f46485z, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f28735l / 2 : this.f28735l;
    }

    public int i() {
        return this.f28733j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int j() {
        return this.f28732i;
    }

    @n0
    public v k() {
        return this.f28728e;
    }

    @p0
    public androidx.core.util.d<Throwable> l() {
        return this.f28730g;
    }

    @n0
    public Executor m() {
        return this.f28725b;
    }

    @n0
    public z n() {
        return this.f28726c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean o() {
        return this.f28736m;
    }
}
