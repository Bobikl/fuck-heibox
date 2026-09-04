package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ArchTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class c extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f2995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private static final Executor f2996d = new Executor() { // from class: androidx.arch.core.executor.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.j(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private static final Executor f2997e = new Executor() { // from class: androidx.arch.core.executor.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.k(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private f f2998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final f f2999b;

    private c() {
        d dVar = new d();
        this.f2999b = dVar;
        this.f2998a = dVar;
    }

    @n0
    public static Executor g() {
        return f2997e;
    }

    @n0
    public static c h() {
        if (f2995c != null) {
            return f2995c;
        }
        synchronized (c.class) {
            if (f2995c == null) {
                f2995c = new c();
            }
        }
        return f2995c;
    }

    @n0
    public static Executor i() {
        return f2996d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        h().d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Runnable runnable) {
        h().a(runnable);
    }

    @Override // androidx.arch.core.executor.f
    public void a(@n0 Runnable runnable) {
        this.f2998a.a(runnable);
    }

    @Override // androidx.arch.core.executor.f
    public boolean c() {
        return this.f2998a.c();
    }

    @Override // androidx.arch.core.executor.f
    public void d(@n0 Runnable runnable) {
        this.f2998a.d(runnable);
    }

    public void l(@p0 f fVar) {
        if (fVar == null) {
            fVar = this.f2999b;
        }
        this.f2998a = fVar;
    }
}
