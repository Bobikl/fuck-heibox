package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.r;
import androidx.work.impl.utils.a0;
import androidx.work.impl.utils.g0;
import androidx.work.impl.w;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SystemAlarmDispatcher.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g implements androidx.work.impl.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f28884l = n.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f28885m = "ProcessCommand";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f28886n = "KEY_START_ID";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f28887o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f28888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.c f28889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f28890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f28891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.work.impl.g0 f28892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f28893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final List<Intent> f28894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Intent f28895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private c f28896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w f28897k;

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorB;
            d dVar;
            synchronized (g.this.f28894h) {
                g gVar = g.this;
                gVar.f28895i = gVar.f28894h.get(0);
            }
            Intent intent = g.this.f28895i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f28895i.getIntExtra(g.f28886n, 0);
                n nVarE = n.e();
                String str = g.f28884l;
                nVarE.a(str, "Processing command " + g.this.f28895i + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = a0.b(g.this.f28888b, action + " (" + intExtra + ")");
                try {
                    n.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f28893g.q(gVar2.f28895i, intExtra, gVar2);
                    n.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorB = g.this.f28889c.b();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    try {
                        n nVarE2 = n.e();
                        String str2 = g.f28884l;
                        nVarE2.d(str2, "Unexpected error in onHandleIntent", th2);
                        n.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorB = g.this.f28889c.b();
                        dVar = new d(g.this);
                    } catch (Throwable th3) {
                        n.e().a(g.f28884l, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f28889c.b().execute(new d(g.this));
                        throw th3;
                    }
                }
                executorB.execute(dVar);
            }
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f28899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Intent f28900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f28901d;

        b(@n0 g gVar, @n0 Intent intent, int i10) {
            this.f28899b = gVar;
            this.f28900c = intent;
            this.f28901d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28899b.a(this.f28900c, this.f28901d);
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public interface c {
        void b();
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f28902b;

        d(@n0 g gVar) {
            this.f28902b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28902b.c();
        }
    }

    g(@n0 Context context) {
        this(context, null, null);
    }

    @j1
    g(@n0 Context context, @p0 r rVar, @p0 androidx.work.impl.g0 g0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f28888b = applicationContext;
        this.f28897k = new w();
        this.f28893g = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f28897k);
        g0Var = g0Var == null ? androidx.work.impl.g0.J(context) : g0Var;
        this.f28892f = g0Var;
        this.f28890d = new g0(g0Var.o().k());
        rVar = rVar == null ? g0Var.L() : rVar;
        this.f28891e = rVar;
        this.f28889c = g0Var.R();
        rVar.g(this);
        this.f28894h = new ArrayList();
        this.f28895i = null;
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @k0
    private boolean i(@n0 String str) {
        b();
        synchronized (this.f28894h) {
            Iterator<Intent> it = this.f28894h.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    @k0
    private void k() {
        b();
        PowerManager.WakeLock wakeLockB = a0.b(this.f28888b, f28885m);
        try {
            wakeLockB.acquire();
            this.f28892f.R().a(new a());
        } finally {
            wakeLockB.release();
        }
    }

    @k0
    public boolean a(@n0 Intent intent, int i10) {
        n nVarE = n.e();
        String str = f28884l;
        nVarE.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.e().l(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra(f28886n, i10);
        synchronized (this.f28894h) {
            boolean z10 = this.f28894h.isEmpty() ? false : true;
            this.f28894h.add(intent);
            if (!z10) {
                k();
            }
        }
        return true;
    }

    @k0
    void c() {
        n nVarE = n.e();
        String str = f28884l;
        nVarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f28894h) {
            if (this.f28895i != null) {
                n.e().a(str, "Removing command " + this.f28895i);
                if (!this.f28894h.remove(0).equals(this.f28895i)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f28895i = null;
            }
            androidx.work.impl.utils.taskexecutor.a aVarC = this.f28889c.c();
            if (!this.f28893g.p() && this.f28894h.isEmpty() && !aVarC.W()) {
                n.e().a(str, "No more commands & intents.");
                c cVar = this.f28896j;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f28894h.isEmpty()) {
                k();
            }
        }
    }

    @Override // androidx.work.impl.e
    /* JADX INFO: renamed from: d */
    public void m(@n0 WorkGenerationalId workGenerationalId, boolean z10) {
        this.f28889c.b().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f28888b, workGenerationalId, z10), 0));
    }

    r e() {
        return this.f28891e;
    }

    androidx.work.impl.utils.taskexecutor.c f() {
        return this.f28889c;
    }

    androidx.work.impl.g0 g() {
        return this.f28892f;
    }

    g0 h() {
        return this.f28890d;
    }

    void j() {
        n.e().a(f28884l, "Destroying SystemAlarmDispatcher");
        this.f28891e.o(this);
        this.f28896j = null;
    }

    void l(@n0 c cVar) {
        if (this.f28896j != null) {
            n.e().c(f28884l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f28896j = cVar;
        }
    }
}
