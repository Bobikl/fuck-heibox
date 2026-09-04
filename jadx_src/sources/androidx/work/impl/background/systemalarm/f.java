package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.u;
import androidx.work.impl.model.x;
import androidx.work.impl.utils.a0;
import androidx.work.impl.utils.g0;
import androidx.work.impl.v;
import androidx.work.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DelayMetCommandHandler.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class f implements o3.c, g0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f28868n = n.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f28869o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f28870p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f28871q = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkGenerationalId f28874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f28875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o3.e f28876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f28877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f28879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f28880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private PowerManager.WakeLock f28881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final v f28883m;

    f(@n0 Context context, int i10, @n0 g gVar, @n0 v vVar) {
        this.f28872b = context;
        this.f28873c = i10;
        this.f28875e = gVar;
        this.f28874d = vVar.getId();
        this.f28883m = vVar;
        androidx.work.impl.constraints.trackers.n nVarO = gVar.g().O();
        this.f28879i = gVar.f().c();
        this.f28880j = gVar.f().b();
        this.f28876f = new o3.e(nVarO, this);
        this.f28882l = false;
        this.f28878h = 0;
        this.f28877g = new Object();
    }

    private void f() {
        synchronized (this.f28877g) {
            this.f28876f.reset();
            this.f28875e.h().d(this.f28874d);
            PowerManager.WakeLock wakeLock = this.f28881k;
            if (wakeLock != null && wakeLock.isHeld()) {
                n.e().a(f28868n, "Releasing wakelock " + this.f28881k + "for WorkSpec " + this.f28874d);
                this.f28881k.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f28878h != 0) {
            n.e().a(f28868n, "Already started work for " + this.f28874d);
            return;
        }
        this.f28878h = 1;
        n.e().a(f28868n, "onAllConstraintsMet for " + this.f28874d);
        if (this.f28875e.e().q(this.f28883m)) {
            this.f28875e.h().c(this.f28874d, 600000L, this);
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        String strF = this.f28874d.f();
        if (this.f28878h >= 2) {
            n.e().a(f28868n, "Already stopped work for " + strF);
            return;
        }
        this.f28878h = 2;
        n nVarE = n.e();
        String str = f28868n;
        nVarE.a(str, "Stopping work for WorkSpec " + strF);
        this.f28880j.execute(new g.b(this.f28875e, b.g(this.f28872b, this.f28874d), this.f28873c));
        if (!this.f28875e.e().l(this.f28874d.f())) {
            n.e().a(str, "Processor does not have WorkSpec " + strF + ". No need to reschedule");
            return;
        }
        n.e().a(str, "WorkSpec " + strF + " needs to be rescheduled");
        this.f28880j.execute(new g.b(this.f28875e, b.f(this.f28872b, this.f28874d), this.f28873c));
    }

    @Override // o3.c
    public void a(@n0 List<u> list) {
        this.f28879i.execute(new d(this));
    }

    @Override // androidx.work.impl.utils.g0.a
    public void b(@n0 WorkGenerationalId mVar) {
        n.e().a(f28868n, "Exceeded time limits on execution for " + mVar);
        this.f28879i.execute(new d(this));
    }

    @Override // o3.c
    public void e(@n0 List<u> list) {
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            if (x.a(it.next()).equals(this.f28874d)) {
                this.f28879i.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28867b.i();
                    }
                });
                return;
            }
        }
    }

    @k1
    void g() {
        String strF = this.f28874d.f();
        this.f28881k = a0.b(this.f28872b, strF + " (" + this.f28873c + ")");
        n nVarE = n.e();
        String str = f28868n;
        nVarE.a(str, "Acquiring wakelock " + this.f28881k + "for WorkSpec " + strF);
        this.f28881k.acquire();
        u uVarZ = this.f28875e.g().P().X().z(strF);
        if (uVarZ == null) {
            this.f28879i.execute(new d(this));
            return;
        }
        boolean zB = uVarZ.B();
        this.f28882l = zB;
        if (zB) {
            this.f28876f.a(Collections.singletonList(uVarZ));
            return;
        }
        n.e().a(str, "No constraints for " + strF);
        e(Collections.singletonList(uVarZ));
    }

    void h(boolean z10) {
        n.e().a(f28868n, "onExecuted " + this.f28874d + ", " + z10);
        f();
        if (z10) {
            this.f28880j.execute(new g.b(this.f28875e, b.f(this.f28872b, this.f28874d), this.f28873c));
        }
        if (this.f28882l) {
            this.f28880j.execute(new g.b(this.f28875e, b.a(this.f28872b), this.f28873c));
        }
    }
}
