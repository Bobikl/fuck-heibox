package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: WorkTimer.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29343e = androidx.work.n.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.v f29344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<WorkGenerationalId, b> f29345b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<WorkGenerationalId, a> f29346c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f29347d = new Object();

    /* JADX INFO: compiled from: WorkTimer.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface a {
        void b(@n0 WorkGenerationalId workGenerationalId);
    }

    /* JADX INFO: compiled from: WorkTimer.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class b implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f29348d = "WrkTimerRunnable";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0 f29349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WorkGenerationalId f29350c;

        b(@n0 g0 g0Var, @n0 WorkGenerationalId workGenerationalId) {
            this.f29349b = g0Var;
            this.f29350c = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f29349b.f29347d) {
                if (this.f29349b.f29345b.remove(this.f29350c) != null) {
                    a aVarRemove = this.f29349b.f29346c.remove(this.f29350c);
                    if (aVarRemove != null) {
                        aVarRemove.b(this.f29350c);
                    }
                } else {
                    androidx.work.n.e().a(f29348d, String.format("Timer with %s is already marked as complete.", this.f29350c));
                }
            }
        }
    }

    public g0(@n0 androidx.work.v vVar) {
        this.f29344a = vVar;
    }

    @j1
    @n0
    public Map<WorkGenerationalId, a> a() {
        Map<WorkGenerationalId, a> map;
        synchronized (this.f29347d) {
            map = this.f29346c;
        }
        return map;
    }

    @j1
    @n0
    public Map<WorkGenerationalId, b> b() {
        Map<WorkGenerationalId, b> map;
        synchronized (this.f29347d) {
            map = this.f29345b;
        }
        return map;
    }

    public void c(@n0 WorkGenerationalId workGenerationalId, long j10, @n0 a aVar) {
        synchronized (this.f29347d) {
            androidx.work.n.e().a(f29343e, "Starting timer for " + workGenerationalId);
            d(workGenerationalId);
            b bVar = new b(this, workGenerationalId);
            this.f29345b.put(workGenerationalId, bVar);
            this.f29346c.put(workGenerationalId, aVar);
            this.f29344a.b(j10, bVar);
        }
    }

    public void d(@n0 WorkGenerationalId workGenerationalId) {
        synchronized (this.f29347d) {
            if (this.f29345b.remove(workGenerationalId) != null) {
                androidx.work.n.e().a(f29343e, "Stopping timer for " + workGenerationalId);
                this.f29346c.remove(workGenerationalId);
            }
        }
    }
}
