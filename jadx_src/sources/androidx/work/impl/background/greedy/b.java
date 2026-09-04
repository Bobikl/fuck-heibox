package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.work.WorkInfo;
import androidx.work.impl.e;
import androidx.work.impl.g0;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.u;
import androidx.work.impl.model.x;
import androidx.work.impl.t;
import androidx.work.impl.utils.s;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.n;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o3.c;
import o3.d;

/* JADX INFO: compiled from: GreedyScheduler.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b implements t, c, e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f28820k = n.i("GreedyScheduler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f28822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f28823d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f28825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28826g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Boolean f28829j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<u> f28824e = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f28828i = new w();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f28827h = new Object();

    public b(@n0 Context context, @n0 androidx.work.a aVar, @n0 androidx.work.impl.constraints.trackers.n nVar, @n0 g0 g0Var) {
        this.f28821b = context;
        this.f28822c = g0Var;
        this.f28823d = new o3.e(nVar, this);
        this.f28825f = new a(this, aVar.k());
    }

    @j1
    public b(@n0 Context context, @n0 g0 g0Var, @n0 d dVar) {
        this.f28821b = context;
        this.f28822c = g0Var;
        this.f28823d = dVar;
    }

    private void f() {
        this.f28829j = Boolean.valueOf(s.b(this.f28821b, this.f28822c.o()));
    }

    private void g() {
        if (this.f28826g) {
            return;
        }
        this.f28822c.L().g(this);
        this.f28826g = true;
    }

    private void h(@n0 WorkGenerationalId workGenerationalId) {
        synchronized (this.f28827h) {
            for (u uVar : this.f28824e) {
                if (x.a(uVar).equals(workGenerationalId)) {
                    n.e().a(f28820k, "Stopping tracking for " + workGenerationalId);
                    this.f28824e.remove(uVar);
                    this.f28823d.a(this.f28824e);
                    break;
                }
            }
        }
    }

    @Override // o3.c
    public void a(@n0 List<u> list) {
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            WorkGenerationalId workGenerationalIdA = x.a(it.next());
            n.e().a(f28820k, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
            v vVarB = this.f28828i.b(workGenerationalIdA);
            if (vVarB != null) {
                this.f28822c.a0(vVarB);
            }
        }
    }

    @Override // androidx.work.impl.t
    public boolean b() {
        return false;
    }

    @Override // androidx.work.impl.t
    public void c(@n0 u... uVarArr) {
        if (this.f28829j == null) {
            f();
        }
        if (!this.f28829j.booleanValue()) {
            n.e().f(f28820k, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f28828i.a(x.a(uVar))) {
                long jC = uVar.c();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (uVar.state == WorkInfo.State.ENQUEUED) {
                    if (jCurrentTimeMillis < jC) {
                        a aVar = this.f28825f;
                        if (aVar != null) {
                            aVar.a(uVar);
                        }
                    } else if (uVar.B()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (uVar.constraints.getRequiresDeviceIdle()) {
                            n.e().a(f28820k, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (i10 < 24 || !uVar.constraints.e()) {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.id);
                        } else {
                            n.e().a(f28820k, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f28828i.a(x.a(uVar))) {
                        n.e().a(f28820k, "Starting work for " + uVar.id);
                        this.f28822c.X(this.f28828i.f(uVar));
                    }
                }
            }
        }
        synchronized (this.f28827h) {
            if (!hashSet.isEmpty()) {
                n.e().a(f28820k, "Starting tracking for " + TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, hashSet2));
                this.f28824e.addAll(hashSet);
                this.f28823d.a(this.f28824e);
            }
        }
    }

    @Override // androidx.work.impl.t
    public void cancel(@n0 String str) {
        if (this.f28829j == null) {
            f();
        }
        if (!this.f28829j.booleanValue()) {
            n.e().f(f28820k, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        n.e().a(f28820k, "Cancelling work ID " + str);
        a aVar = this.f28825f;
        if (aVar != null) {
            aVar.b(str);
        }
        Iterator<v> it = this.f28828i.d(str).iterator();
        while (it.hasNext()) {
            this.f28822c.a0(it.next());
        }
    }

    @Override // androidx.work.impl.e
    /* JADX INFO: renamed from: d */
    public void m(@n0 WorkGenerationalId workGenerationalId, boolean z10) {
        this.f28828i.b(workGenerationalId);
        h(workGenerationalId);
    }

    @Override // o3.c
    public void e(@n0 List<u> list) {
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            WorkGenerationalId workGenerationalIdA = x.a(it.next());
            if (!this.f28828i.a(workGenerationalIdA)) {
                n.e().a(f28820k, "Constraints met: Scheduling work ID " + workGenerationalIdA);
                this.f28822c.X(this.f28828i.e(workGenerationalIdA));
            }
        }
    }

    @j1
    public void i(@n0 a aVar) {
        this.f28825f = aVar;
    }
}
