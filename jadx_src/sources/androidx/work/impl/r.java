package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: Processor.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class r implements e, androidx.work.impl.foreground.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f29239n = androidx.work.n.i("Processor");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f29240o = "ProcessorForegroundLck";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.work.a f29243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.work.impl.utils.taskexecutor.c f29244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WorkDatabase f29245f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<t> f29249j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, n0> f29247h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, n0> f29246g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<String> f29250k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<e> f29251l = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private PowerManager.WakeLock f29241b = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f29252m = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Set<v>> f29248i = new HashMap();

    /* JADX INFO: compiled from: Processor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        private e f29253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.n0
        private final WorkGenerationalId f29254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.n0
        private com.google.common.util.concurrent.p0<Boolean> f29255d;

        a(@androidx.annotation.n0 e eVar, @androidx.annotation.n0 WorkGenerationalId workGenerationalId, @androidx.annotation.n0 com.google.common.util.concurrent.p0<Boolean> p0Var) {
            this.f29253b = eVar;
            this.f29254c = workGenerationalId;
            this.f29255d = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f29255d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f29253b.m(this.f29254c, zBooleanValue);
        }
    }

    public r(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, @androidx.annotation.n0 WorkDatabase workDatabase, @androidx.annotation.n0 List<t> list) {
        this.f29242c = context;
        this.f29243d = aVar;
        this.f29244e = cVar;
        this.f29245f = workDatabase;
        this.f29249j = list;
    }

    private static boolean j(@androidx.annotation.n0 String str, @p0 n0 n0Var) {
        if (n0Var == null) {
            androidx.work.n.e().a(f29239n, "WorkerWrapper could not be found for " + str);
            return false;
        }
        n0Var.g();
        androidx.work.n.e().a(f29239n, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.work.impl.model.u n(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.f29245f.Y().c(str));
        return this.f29245f.X().z(str);
    }

    private void p(@androidx.annotation.n0 final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f29244e.b().execute(new Runnable() { // from class: androidx.work.impl.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f29236b.m(workGenerationalId, z10);
            }
        });
    }

    private void t() {
        synchronized (this.f29252m) {
            if (!(!this.f29246g.isEmpty())) {
                try {
                    this.f29242c.startService(androidx.work.impl.foreground.b.h(this.f29242c));
                } catch (Throwable th2) {
                    androidx.work.n.e().d(f29239n, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f29241b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f29241b = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(@androidx.annotation.n0 String str) {
        synchronized (this.f29252m) {
            this.f29246g.remove(str);
            t();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public boolean b(@androidx.annotation.n0 String str) {
        boolean zContainsKey;
        synchronized (this.f29252m) {
            zContainsKey = this.f29246g.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.foreground.a
    public void c(@androidx.annotation.n0 String str, @androidx.annotation.n0 androidx.work.h hVar) {
        synchronized (this.f29252m) {
            androidx.work.n.e().f(f29239n, "Moving WorkSpec (" + str + ") to the foreground");
            n0 n0VarRemove = this.f29247h.remove(str);
            if (n0VarRemove != null) {
                if (this.f29241b == null) {
                    PowerManager.WakeLock wakeLockB = androidx.work.impl.utils.a0.b(this.f29242c, f29240o);
                    this.f29241b = wakeLockB;
                    wakeLockB.acquire();
                }
                this.f29246g.put(str, n0VarRemove);
                androidx.core.content.d.x(this.f29242c, androidx.work.impl.foreground.b.g(this.f29242c, n0VarRemove.d(), hVar));
            }
        }
    }

    @Override // androidx.work.impl.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m(@androidx.annotation.n0 WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (this.f29252m) {
            n0 n0Var = this.f29247h.get(workGenerationalId.f());
            if (n0Var != null && workGenerationalId.equals(n0Var.d())) {
                this.f29247h.remove(workGenerationalId.f());
            }
            androidx.work.n.e().a(f29239n, getClass().getSimpleName() + " " + workGenerationalId.f() + " executed; reschedule = " + z10);
            Iterator<e> it = this.f29251l.iterator();
            while (it.hasNext()) {
                it.next().m(workGenerationalId, z10);
            }
        }
    }

    public void g(@androidx.annotation.n0 e eVar) {
        synchronized (this.f29252m) {
            this.f29251l.add(eVar);
        }
    }

    @p0
    public androidx.work.impl.model.u h(@androidx.annotation.n0 String str) {
        synchronized (this.f29252m) {
            n0 n0Var = this.f29246g.get(str);
            if (n0Var == null) {
                n0Var = this.f29247h.get(str);
            }
            if (n0Var == null) {
                return null;
            }
            return n0Var.e();
        }
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f29252m) {
            z10 = (this.f29247h.isEmpty() && this.f29246g.isEmpty()) ? false : true;
        }
        return z10;
    }

    public boolean k(@androidx.annotation.n0 String str) {
        boolean zContains;
        synchronized (this.f29252m) {
            zContains = this.f29250k.contains(str);
        }
        return zContains;
    }

    public boolean l(@androidx.annotation.n0 String str) {
        boolean z10;
        synchronized (this.f29252m) {
            z10 = this.f29247h.containsKey(str) || this.f29246g.containsKey(str);
        }
        return z10;
    }

    public void o(@androidx.annotation.n0 e eVar) {
        synchronized (this.f29252m) {
            this.f29251l.remove(eVar);
        }
    }

    public boolean q(@androidx.annotation.n0 v vVar) {
        return r(vVar, null);
    }

    public boolean r(@androidx.annotation.n0 v vVar, @p0 WorkerParameters.a aVar) {
        WorkGenerationalId id2 = vVar.getId();
        final String strF = id2.f();
        final ArrayList arrayList = new ArrayList();
        androidx.work.impl.model.u uVar = (androidx.work.impl.model.u) this.f29245f.L(new Callable() { // from class: androidx.work.impl.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f29233b.n(arrayList, strF);
            }
        });
        if (uVar == null) {
            androidx.work.n.e().l(f29239n, "Didn't find WorkSpec for id " + id2);
            p(id2, false);
            return false;
        }
        synchronized (this.f29252m) {
            if (l(strF)) {
                Set<v> set = this.f29248i.get(strF);
                if (set.iterator().next().getId().e() == id2.e()) {
                    set.add(vVar);
                    androidx.work.n.e().a(f29239n, "Work " + id2 + " is already enqueued for processing");
                } else {
                    p(id2, false);
                }
                return false;
            }
            if (uVar.z() != id2.e()) {
                p(id2, false);
                return false;
            }
            n0 n0VarB = new n0.c(this.f29242c, this.f29243d, this.f29244e, this, this.f29245f, uVar, arrayList).d(this.f29249j).c(aVar).b();
            com.google.common.util.concurrent.p0<Boolean> p0VarC = n0VarB.c();
            p0VarC.V(new a(this, vVar.getId(), p0VarC), this.f29244e.b());
            this.f29247h.put(strF, n0VarB);
            HashSet hashSet = new HashSet();
            hashSet.add(vVar);
            this.f29248i.put(strF, hashSet);
            this.f29244e.c().execute(n0VarB);
            androidx.work.n.e().a(f29239n, getClass().getSimpleName() + ": processing " + id2);
            return true;
        }
    }

    public boolean s(@androidx.annotation.n0 String str) {
        n0 n0VarRemove;
        boolean z10;
        synchronized (this.f29252m) {
            androidx.work.n.e().a(f29239n, "Processor cancelling " + str);
            this.f29250k.add(str);
            n0VarRemove = this.f29246g.remove(str);
            z10 = n0VarRemove != null;
            if (n0VarRemove == null) {
                n0VarRemove = this.f29247h.remove(str);
            }
            if (n0VarRemove != null) {
                this.f29248i.remove(str);
            }
        }
        boolean zJ = j(str, n0VarRemove);
        if (z10) {
            t();
        }
        return zJ;
    }

    public boolean u(@androidx.annotation.n0 v vVar) {
        n0 n0VarRemove;
        String strF = vVar.getId().f();
        synchronized (this.f29252m) {
            androidx.work.n.e().a(f29239n, "Processor stopping foreground work " + strF);
            n0VarRemove = this.f29246g.remove(strF);
            if (n0VarRemove != null) {
                this.f29248i.remove(strF);
            }
        }
        return j(strF, n0VarRemove);
    }

    public boolean v(@androidx.annotation.n0 v vVar) {
        String strF = vVar.getId().f();
        synchronized (this.f29252m) {
            n0 n0VarRemove = this.f29247h.remove(strF);
            if (n0VarRemove == null) {
                androidx.work.n.e().a(f29239n, "WorkerWrapper could not be found for " + strF);
                return false;
            }
            Set<v> set = this.f29248i.get(strF);
            if (set != null && set.contains(vVar)) {
                androidx.work.n.e().a(f29239n, "Processor stopping background work " + strF);
                this.f29248i.remove(strF);
                return j(strF, n0VarRemove);
            }
            return false;
        }
    }
}
