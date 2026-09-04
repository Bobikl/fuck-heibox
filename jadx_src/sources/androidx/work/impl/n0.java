package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.k1;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.common.util.concurrent.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class n0 implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f29198t = androidx.work.n.i("WorkerWrapper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f29199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<t> f29201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkerParameters.a f29202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.work.impl.model.u f29203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.work.m f29204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.work.impl.utils.taskexecutor.c f29205h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.work.a f29207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.work.impl.foreground.a f29208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WorkDatabase f29209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.work.impl.model.v f29210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.work.impl.model.b f29211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<String> f29212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29213p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f29216s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    androidx.work.m.a f29206i = androidx.work.m.a.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    androidx.work.impl.utils.futures.a<Boolean> f29214q = androidx.work.impl.utils.futures.a.u();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    final androidx.work.impl.utils.futures.a<androidx.work.m.a> f29215r = androidx.work.impl.utils.futures.a.u();

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f29217b;

        a(p0 p0Var) {
            this.f29217b = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n0.this.f29215r.isCancelled()) {
                return;
            }
            try {
                this.f29217b.get();
                androidx.work.n.e().a(n0.f29198t, "Starting work for " + n0.this.f29203f.workerClassName);
                n0 n0Var = n0.this;
                n0Var.f29215r.r(n0Var.f29204g.u());
            } catch (Throwable th2) {
                n0.this.f29215r.q(th2);
            }
        }
    }

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29219b;

        b(String str) {
            this.f29219b = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    androidx.work.m.a aVar = n0.this.f29215r.get();
                    if (aVar == null) {
                        androidx.work.n.e().c(n0.f29198t, n0.this.f29203f.workerClassName + " returned a null result. Treating it as a failure.");
                    } else {
                        androidx.work.n.e().a(n0.f29198t, n0.this.f29203f.workerClassName + " returned a " + aVar + ".");
                        n0.this.f29206i = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    androidx.work.n.e().d(n0.f29198t, this.f29219b + " failed because it threw an exception/error", e);
                } catch (CancellationException e11) {
                    androidx.work.n.e().g(n0.f29198t, this.f29219b + " was cancelled", e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    androidx.work.n.e().d(n0.f29198t, this.f29219b + " failed because it threw an exception/error", e);
                }
                n0.this.j();
            } catch (Throwable th2) {
                n0.this.j();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: WorkerWrapper.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        Context f29221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        androidx.work.m f29222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.n0
        androidx.work.impl.foreground.a f29223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.n0
        androidx.work.impl.utils.taskexecutor.c f29224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.n0
        androidx.work.a f29225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.n0
        WorkDatabase f29226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.n0
        androidx.work.impl.model.u f29227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List<t> f29228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List<String> f29229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.n0
        WorkerParameters.a f29230j = new WorkerParameters.a();

        public c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, @androidx.annotation.n0 androidx.work.impl.foreground.a aVar2, @androidx.annotation.n0 WorkDatabase workDatabase, @androidx.annotation.n0 androidx.work.impl.model.u uVar, @androidx.annotation.n0 List<String> list) {
            this.f29221a = context.getApplicationContext();
            this.f29224d = cVar;
            this.f29223c = aVar2;
            this.f29225e = aVar;
            this.f29226f = workDatabase;
            this.f29227g = uVar;
            this.f29229i = list;
        }

        @androidx.annotation.n0
        public n0 b() {
            return new n0(this);
        }

        @androidx.annotation.n0
        public c c(@androidx.annotation.p0 WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f29230j = aVar;
            }
            return this;
        }

        @androidx.annotation.n0
        public c d(@androidx.annotation.n0 List<t> list) {
            this.f29228h = list;
            return this;
        }

        @j1
        @androidx.annotation.n0
        public c e(@androidx.annotation.n0 androidx.work.m mVar) {
            this.f29222b = mVar;
            return this;
        }
    }

    n0(@androidx.annotation.n0 c cVar) {
        this.f29199b = cVar.f29221a;
        this.f29205h = cVar.f29224d;
        this.f29208k = cVar.f29223c;
        androidx.work.impl.model.u uVar = cVar.f29227g;
        this.f29203f = uVar;
        this.f29200c = uVar.id;
        this.f29201d = cVar.f29228h;
        this.f29202e = cVar.f29230j;
        this.f29204g = cVar.f29222b;
        this.f29207j = cVar.f29225e;
        WorkDatabase workDatabase = cVar.f29226f;
        this.f29209l = workDatabase;
        this.f29210m = workDatabase.X();
        this.f29211n = this.f29209l.R();
        this.f29212o = cVar.f29229i;
    }

    private String b(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f29200c);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(androidx.work.m.a aVar) {
        if (aVar instanceof androidx.work.m.a.c) {
            androidx.work.n.e().f(f29198t, "Worker result SUCCESS for " + this.f29213p);
            if (this.f29203f.D()) {
                l();
                return;
            } else {
                q();
                return;
            }
        }
        if (aVar instanceof androidx.work.m.a.b) {
            androidx.work.n.e().f(f29198t, "Worker result RETRY for " + this.f29213p);
            k();
            return;
        }
        androidx.work.n.e().f(f29198t, "Worker result FAILURE for " + this.f29213p);
        if (this.f29203f.D()) {
            l();
        } else {
            p();
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f29210m.g(str2) != WorkInfo.State.CANCELLED) {
                this.f29210m.m(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f29211n.b(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(p0 p0Var) {
        if (this.f29215r.isCancelled()) {
            p0Var.cancel(true);
        }
    }

    private void k() {
        this.f29209l.e();
        try {
            this.f29210m.m(WorkInfo.State.ENQUEUED, this.f29200c);
            this.f29210m.h(this.f29200c, System.currentTimeMillis());
            this.f29210m.C(this.f29200c, -1L);
            this.f29209l.O();
        } finally {
            this.f29209l.k();
            m(true);
        }
    }

    private void l() {
        this.f29209l.e();
        try {
            this.f29210m.h(this.f29200c, System.currentTimeMillis());
            this.f29210m.m(WorkInfo.State.ENQUEUED, this.f29200c);
            this.f29210m.s(this.f29200c);
            this.f29210m.v(this.f29200c);
            this.f29210m.C(this.f29200c, -1L);
            this.f29209l.O();
        } finally {
            this.f29209l.k();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f29209l.e();
        try {
            if (!this.f29209l.X().r()) {
                androidx.work.impl.utils.q.c(this.f29199b, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f29210m.m(WorkInfo.State.ENQUEUED, this.f29200c);
                this.f29210m.C(this.f29200c, -1L);
            }
            if (this.f29203f != null && this.f29204g != null && this.f29208k.b(this.f29200c)) {
                this.f29208k.a(this.f29200c);
            }
            this.f29209l.O();
            this.f29209l.k();
            this.f29214q.p(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f29209l.k();
            throw th2;
        }
    }

    private void n() {
        WorkInfo.State stateG = this.f29210m.g(this.f29200c);
        if (stateG == WorkInfo.State.RUNNING) {
            androidx.work.n.e().a(f29198t, "Status for " + this.f29200c + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        androidx.work.n.e().a(f29198t, "Status for " + this.f29200c + " is " + stateG + " ; not doing any work");
        m(false);
    }

    private void o() {
        androidx.work.e eVarB;
        if (r()) {
            return;
        }
        this.f29209l.e();
        try {
            androidx.work.impl.model.u uVar = this.f29203f;
            if (uVar.state != WorkInfo.State.ENQUEUED) {
                n();
                this.f29209l.O();
                androidx.work.n.e().a(f29198t, this.f29203f.workerClassName + " is not in ENQUEUED state. Nothing more to do");
                this.f29209l.k();
                return;
            }
            if ((uVar.D() || this.f29203f.C()) && System.currentTimeMillis() < this.f29203f.c()) {
                androidx.work.n.e().a(f29198t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f29203f.workerClassName));
                m(true);
                this.f29209l.O();
                this.f29209l.k();
                return;
            }
            this.f29209l.O();
            this.f29209l.k();
            if (this.f29203f.D()) {
                eVarB = this.f29203f.input;
            } else {
                androidx.work.k kVarB = this.f29207j.f().b(this.f29203f.inputMergerClassName);
                if (kVarB == null) {
                    androidx.work.n.e().c(f29198t, "Could not create Input Merger " + this.f29203f.inputMergerClassName);
                    p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f29203f.input);
                arrayList.addAll(this.f29210m.j(this.f29200c));
                eVarB = kVarB.b(arrayList);
            }
            androidx.work.e eVar = eVarB;
            UUID uuidFromString = UUID.fromString(this.f29200c);
            List<String> list = this.f29212o;
            WorkerParameters.a aVar = this.f29202e;
            androidx.work.impl.model.u uVar2 = this.f29203f;
            WorkerParameters workerParameters = new WorkerParameters(uuidFromString, eVar, list, aVar, uVar2.runAttemptCount, uVar2.z(), this.f29207j.d(), this.f29205h, this.f29207j.n(), new androidx.work.impl.utils.f0(this.f29209l, this.f29205h), new androidx.work.impl.utils.e0(this.f29209l, this.f29208k, this.f29205h));
            if (this.f29204g == null) {
                this.f29204g = this.f29207j.n().b(this.f29199b, this.f29203f.workerClassName, workerParameters);
            }
            androidx.work.m mVar = this.f29204g;
            if (mVar == null) {
                androidx.work.n.e().c(f29198t, "Could not create Worker " + this.f29203f.workerClassName);
                p();
                return;
            }
            if (mVar.p()) {
                androidx.work.n.e().c(f29198t, "Received an already-used Worker " + this.f29203f.workerClassName + "; Worker Factory should return new instances");
                p();
                return;
            }
            this.f29204g.t();
            if (!s()) {
                n();
                return;
            }
            if (r()) {
                return;
            }
            androidx.work.impl.utils.d0 d0Var = new androidx.work.impl.utils.d0(this.f29199b, this.f29203f, this.f29204g, workerParameters.b(), this.f29205h);
            this.f29205h.b().execute(d0Var);
            final p0<Void> p0VarB = d0Var.b();
            this.f29215r.V(new Runnable() { // from class: androidx.work.impl.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29051b.i(p0VarB);
                }
            }, new androidx.work.impl.utils.z());
            p0VarB.V(new a(p0VarB), this.f29205h.b());
            this.f29215r.V(new b(this.f29213p), this.f29205h.c());
        } catch (Throwable th2) {
            this.f29209l.k();
            throw th2;
        }
    }

    private void q() {
        this.f29209l.e();
        try {
            this.f29210m.m(WorkInfo.State.SUCCEEDED, this.f29200c);
            this.f29210m.F(this.f29200c, ((androidx.work.m.a.c) this.f29206i).c());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f29211n.b(this.f29200c)) {
                if (this.f29210m.g(str) == WorkInfo.State.BLOCKED && this.f29211n.c(str)) {
                    androidx.work.n.e().f(f29198t, "Setting status to enqueued for " + str);
                    this.f29210m.m(WorkInfo.State.ENQUEUED, str);
                    this.f29210m.h(str, jCurrentTimeMillis);
                }
            }
            this.f29209l.O();
        } finally {
            this.f29209l.k();
            m(false);
        }
    }

    private boolean r() {
        if (!this.f29216s) {
            return false;
        }
        androidx.work.n.e().a(f29198t, "Work interrupted for " + this.f29213p);
        WorkInfo.State stateG = this.f29210m.g(this.f29200c);
        if (stateG == null) {
            m(false);
        } else {
            m(!stateG.isFinished());
        }
        return true;
    }

    private boolean s() {
        boolean z10;
        this.f29209l.e();
        try {
            if (this.f29210m.g(this.f29200c) == WorkInfo.State.ENQUEUED) {
                this.f29210m.m(WorkInfo.State.RUNNING, this.f29200c);
                this.f29210m.I(this.f29200c);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29209l.O();
            return z10;
        } finally {
            this.f29209l.k();
        }
    }

    @androidx.annotation.n0
    public p0<Boolean> c() {
        return this.f29214q;
    }

    @androidx.annotation.n0
    public WorkGenerationalId d() {
        return androidx.work.impl.model.x.a(this.f29203f);
    }

    @androidx.annotation.n0
    public androidx.work.impl.model.u e() {
        return this.f29203f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g() {
        this.f29216s = true;
        r();
        this.f29215r.cancel(true);
        if (this.f29204g != null && this.f29215r.isCancelled()) {
            this.f29204g.v();
            return;
        }
        androidx.work.n.e().a(f29198t, "WorkSpec " + this.f29203f + " is already done. Not interrupting.");
    }

    void j() {
        if (!r()) {
            this.f29209l.e();
            try {
                WorkInfo.State stateG = this.f29210m.g(this.f29200c);
                this.f29209l.W().a(this.f29200c);
                if (stateG == null) {
                    m(false);
                } else if (stateG == WorkInfo.State.RUNNING) {
                    f(this.f29206i);
                } else if (!stateG.isFinished()) {
                    k();
                }
                this.f29209l.O();
                this.f29209l.k();
            } catch (Throwable th2) {
                this.f29209l.k();
                throw th2;
            }
        }
        List<t> list = this.f29201d;
        if (list != null) {
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(this.f29200c);
            }
            u.b(this.f29207j, this.f29209l, this.f29201d);
        }
    }

    @j1
    void p() {
        this.f29209l.e();
        try {
            h(this.f29200c);
            this.f29210m.F(this.f29200c, ((androidx.work.m.a.C0235a) this.f29206i).c());
            this.f29209l.O();
        } finally {
            this.f29209l.k();
            m(false);
        }
    }

    @Override // java.lang.Runnable
    @k1
    public void run() {
        this.f29213p = b(this.f29212o);
        o();
    }
}
