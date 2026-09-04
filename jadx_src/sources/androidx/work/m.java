package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.google.common.util.concurrent.p0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ListenableWorker.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private Context f29430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private WorkerParameters f29431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f29432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29433e;

    /* JADX INFO: compiled from: ListenableWorker.java */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ListenableWorker.java */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0235a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f29434a;

            public C0235a() {
                this(e.f28775c);
            }

            public C0235a(@n0 e eVar) {
                this.f29434a = eVar;
            }

            @Override // androidx.work.m.a
            @n0
            public e c() {
                return this.f29434a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0235a.class != obj.getClass()) {
                    return false;
                }
                return this.f29434a.equals(((C0235a) obj).f29434a);
            }

            public int hashCode() {
                return (C0235a.class.getName().hashCode() * 31) + this.f29434a.hashCode();
            }

            @n0
            public String toString() {
                return "Failure {mOutputData=" + this.f29434a + '}';
            }
        }

        /* JADX INFO: compiled from: ListenableWorker.java */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class b extends a {
            @Override // androidx.work.m.a
            @n0
            public e c() {
                return e.f28775c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            @n0
            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: compiled from: ListenableWorker.java */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f29435a;

            public c() {
                this(e.f28775c);
            }

            public c(@n0 e eVar) {
                this.f29435a = eVar;
            }

            @Override // androidx.work.m.a
            @n0
            public e c() {
                return this.f29435a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f29435a.equals(((c) obj).f29435a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f29435a.hashCode();
            }

            @n0
            public String toString() {
                return "Success {mOutputData=" + this.f29435a + '}';
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        a() {
        }

        @n0
        public static a a() {
            return new C0235a();
        }

        @n0
        public static a b(@n0 e eVar) {
            return new C0235a(eVar);
        }

        @n0
        public static a d() {
            return new b();
        }

        @n0
        public static a e() {
            return new c();
        }

        @n0
        public static a f(@n0 e eVar) {
            return new c(eVar);
        }

        @n0
        public abstract e c();
    }

    public m(@n0 Context context, @n0 WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f29430b = context;
        this.f29431c = workerParameters;
    }

    @n0
    public final Context b() {
        return this.f29430b;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor c() {
        return this.f29431c.a();
    }

    @n0
    public p0<h> d() {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        aVarU.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVarU;
    }

    @n0
    public final UUID f() {
        return this.f29431c.d();
    }

    @n0
    public final e g() {
        return this.f29431c.e();
    }

    @w0(28)
    @androidx.annotation.p0
    public final Network h() {
        return this.f29431c.f();
    }

    @f0(from = 0)
    public final int i() {
        return this.f29431c.h();
    }

    @n0
    public final Set<String> j() {
        return this.f29431c.j();
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.c k() {
        return this.f29431c.k();
    }

    @n0
    @w0(24)
    public final List<String> l() {
        return this.f29431c.l();
    }

    @n0
    @w0(24)
    public final List<Uri> m() {
        return this.f29431c.m();
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public z n() {
        return this.f29431c.n();
    }

    public final boolean o() {
        return this.f29432d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean p() {
        return this.f29433e;
    }

    public void q() {
    }

    @n0
    public final p0<Void> r(@n0 h hVar) {
        return this.f29431c.b().a(b(), f(), hVar);
    }

    @n0
    public p0<Void> s(@n0 e eVar) {
        return this.f29431c.g().a(b(), f(), eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void t() {
        this.f29433e = true;
    }

    @n0
    @k0
    public abstract p0<a> u();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void v() {
        this.f29432d = true;
        q();
    }
}
