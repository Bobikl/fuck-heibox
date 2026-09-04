package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.lifecycle.LiveData;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.R;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: WorkManagerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g0 extends WorkManager {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f29008m = 22;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f29009n = 23;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f29010o = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.a f29015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f29016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.work.impl.utils.taskexecutor.c f29017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<t> f29018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f29019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.work.impl.utils.r f29020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f29022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile androidx.work.multiprocess.e f29023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.work.impl.constraints.trackers.n f29024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f29007l = androidx.work.n.i("WorkManagerImpl");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static g0 f29011p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static g0 f29012q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f29013r = new Object();

    /* JADX INFO: compiled from: WorkManagerImpl.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f29025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.r f29026c;

        a(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.r rVar) {
            this.f29025b = aVar;
            this.f29026c = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f29025b.p(Long.valueOf(this.f29026c.a()));
            } catch (Throwable th2) {
                this.f29025b.q(th2);
            }
        }
    }

    /* JADX INFO: compiled from: WorkManagerImpl.java */
    public class b implements f0.a<List<androidx.work.impl.model.u.WorkInfoPojo>, WorkInfo> {
        b() {
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkInfo apply(List<androidx.work.impl.model.u.WorkInfoPojo> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).w();
        }
    }

    /* JADX INFO: compiled from: WorkManagerImpl.java */
    @w0(24)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar) {
        this(context, aVar, cVar, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, @androidx.annotation.n0 WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        androidx.work.n.h(new androidx.work.n.a(aVar.j()));
        androidx.work.impl.constraints.trackers.n nVar = new androidx.work.impl.constraints.trackers.n(applicationContext, cVar);
        this.f29024k = nVar;
        List<t> listF = F(applicationContext, aVar, nVar);
        S(context, aVar, cVar, workDatabase, listF, new r(context, aVar, cVar, workDatabase, listF));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, @androidx.annotation.n0 WorkDatabase workDatabase, @androidx.annotation.n0 List<t> list, @androidx.annotation.n0 r rVar) {
        this(context, aVar, cVar, workDatabase, list, rVar, new androidx.work.impl.constraints.trackers.n(context.getApplicationContext(), cVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, @androidx.annotation.n0 WorkDatabase workDatabase, @androidx.annotation.n0 List<t> list, @androidx.annotation.n0 r rVar, @androidx.annotation.n0 androidx.work.impl.constraints.trackers.n nVar) {
        this.f29024k = nVar;
        S(context, aVar, cVar, workDatabase, list, rVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public g0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, boolean z10) {
        this(context, aVar, cVar, WorkDatabase.Q(context.getApplicationContext(), cVar.c(), z10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void B(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar) {
        synchronized (f29013r) {
            g0 g0Var = f29011p;
            if (g0Var != null && f29012q != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (g0Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (f29012q == null) {
                    f29012q = new g0(applicationContext, aVar, new androidx.work.impl.utils.taskexecutor.d(aVar.m()));
                }
                f29011p = f29012q;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean C() {
        return I() != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    @Deprecated
    public static g0 I() {
        synchronized (f29013r) {
            g0 g0Var = f29011p;
            if (g0Var != null) {
                return g0Var;
            }
            return f29012q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static g0 J(@androidx.annotation.n0 Context context) {
        g0 g0VarI;
        synchronized (f29013r) {
            g0VarI = I();
            if (g0VarI == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof androidx.work.a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                B(applicationContext, ((androidx.work.a.c) applicationContext).a());
                g0VarI = J(applicationContext);
            }
        }
        return g0VarI;
    }

    private void S(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.utils.taskexecutor.c cVar, @androidx.annotation.n0 WorkDatabase workDatabase, @androidx.annotation.n0 List<t> list, @androidx.annotation.n0 r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f29014a = applicationContext;
        this.f29015b = aVar;
        this.f29017d = cVar;
        this.f29016c = workDatabase;
        this.f29018e = list;
        this.f29019f = rVar;
        this.f29020g = new androidx.work.impl.utils.r(workDatabase);
        this.f29021h = false;
        if (Build.VERSION.SDK_INT >= 24 && c.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f29017d.a(new ForceStopRunnable(applicationContext, this));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void V(@p0 g0 g0Var) {
        synchronized (f29013r) {
            f29011p = g0Var;
        }
    }

    private void b0() {
        try {
            this.f29023j = (androidx.work.multiprocess.e) Class.forName(f29010o).getConstructor(Context.class, g0.class).newInstance(this.f29014a, this);
        } catch (Throwable th2) {
            androidx.work.n.e().b(f29007l, "Unable to initialize multi-process support", th2);
        }
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public LiveData<List<WorkInfo>> A(@androidx.annotation.n0 androidx.work.x xVar) {
        return androidx.work.impl.utils.l.a(this.f29016c.T().a(androidx.work.impl.utils.u.b(xVar)), androidx.work.impl.model.u.f29128x, this.f29017d);
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q D() {
        androidx.work.impl.utils.t tVar = new androidx.work.impl.utils.t(this);
        this.f29017d.a(tVar);
        return tVar.a();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<WorkManager.UpdateResult> E(@androidx.annotation.n0 androidx.work.y yVar) {
        return WorkerUpdater.h(this, yVar);
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<t> F(@androidx.annotation.n0 Context context, @androidx.annotation.n0 androidx.work.a aVar, @androidx.annotation.n0 androidx.work.impl.constraints.trackers.n nVar) {
        return Arrays.asList(u.a(context, this), new androidx.work.impl.background.greedy.b(context, aVar, nVar, this));
    }

    @androidx.annotation.n0
    public x G(@androidx.annotation.n0 String str, @androidx.annotation.n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @androidx.annotation.n0 androidx.work.s sVar) {
        return new x(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(sVar));
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context H() {
        return this.f29014a;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.r K() {
        return this.f29020g;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public r L() {
        return this.f29019f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public androidx.work.multiprocess.e M() {
        if (this.f29023j == null) {
            synchronized (f29013r) {
                if (this.f29023j == null) {
                    b0();
                    if (this.f29023j == null && !TextUtils.isEmpty(this.f29015b.c())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.f29023j;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<t> N() {
        return this.f29018e;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.constraints.trackers.n O() {
        return this.f29024k;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkDatabase P() {
        return this.f29016c;
    }

    LiveData<List<WorkInfo>> Q(@androidx.annotation.n0 List<String> list) {
        return androidx.work.impl.utils.l.a(this.f29016c.X().t(list), androidx.work.impl.model.u.f29128x, this.f29017d);
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.c R() {
        return this.f29017d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void T() {
        synchronized (f29013r) {
            this.f29021h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f29022i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f29022i = null;
            }
        }
    }

    public void U() {
        androidx.work.impl.background.systemjob.j.a(H());
        P().X().B();
        u.b(o(), P(), N());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void W(@androidx.annotation.n0 BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f29013r) {
            BroadcastReceiver.PendingResult pendingResult2 = this.f29022i;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.f29022i = pendingResult;
            if (this.f29021h) {
                pendingResult.finish();
                this.f29022i = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void X(@androidx.annotation.n0 v vVar) {
        Y(vVar, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void Y(@androidx.annotation.n0 v vVar, @p0 WorkerParameters.a aVar) {
        this.f29017d.a(new androidx.work.impl.utils.w(this, vVar, aVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void Z(@androidx.annotation.n0 WorkGenerationalId workGenerationalId) {
        this.f29017d.a(new androidx.work.impl.utils.y(this, new v(workGenerationalId), true));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a0(@androidx.annotation.n0 v vVar) {
        this.f29017d.a(new androidx.work.impl.utils.y(this, vVar, false));
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.w b(@androidx.annotation.n0 String str, @androidx.annotation.n0 ExistingWorkPolicy existingWorkPolicy, @androidx.annotation.n0 List<androidx.work.o> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new x(this, str, existingWorkPolicy, list);
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.w d(@androidx.annotation.n0 List<androidx.work.o> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new x(this, list);
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q e() {
        androidx.work.impl.utils.c cVarB = androidx.work.impl.utils.c.b(this);
        this.f29017d.a(cVarB);
        return cVarB.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q f(@androidx.annotation.n0 String str) {
        androidx.work.impl.utils.c cVarE = androidx.work.impl.utils.c.e(str, this);
        this.f29017d.a(cVarE);
        return cVarE.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q g(@androidx.annotation.n0 String str) {
        androidx.work.impl.utils.c cVarD = androidx.work.impl.utils.c.d(str, this, true);
        this.f29017d.a(cVarD);
        return cVarD.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q h(@androidx.annotation.n0 UUID uuid) {
        androidx.work.impl.utils.c cVarC = androidx.work.impl.utils.c.c(uuid, this);
        this.f29017d.a(cVarC);
        return cVarC.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public PendingIntent i(@androidx.annotation.n0 UUID uuid) {
        return PendingIntent.getService(this.f29014a, 0, androidx.work.impl.foreground.b.c(this.f29014a, uuid.toString()), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q k(@androidx.annotation.n0 List<? extends androidx.work.y> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).c();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q l(@androidx.annotation.n0 String str, @androidx.annotation.n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @androidx.annotation.n0 androidx.work.s sVar) {
        return existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE ? WorkerUpdater.d(this, str, sVar) : G(str, existingPeriodicWorkPolicy, sVar).c();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.q n(@androidx.annotation.n0 String str, @androidx.annotation.n0 ExistingWorkPolicy existingWorkPolicy, @androidx.annotation.n0 List<androidx.work.o> list) {
        return new x(this, str, existingWorkPolicy, list).c();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public androidx.work.a o() {
        return this.f29015b;
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<Long> r() {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        this.f29017d.a(new a(aVarU, this.f29020g));
        return aVarU;
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public LiveData<Long> s() {
        return this.f29020g.b();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<WorkInfo> t(@androidx.annotation.n0 UUID uuid) {
        androidx.work.impl.utils.x<WorkInfo> xVarC = androidx.work.impl.utils.x.c(this, uuid);
        this.f29017d.c().execute(xVarC);
        return xVarC.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public LiveData<WorkInfo> u(@androidx.annotation.n0 UUID uuid) {
        return androidx.work.impl.utils.l.a(this.f29016c.X().t(Collections.singletonList(uuid.toString())), new b(), this.f29017d);
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<List<WorkInfo>> v(@androidx.annotation.n0 androidx.work.x xVar) {
        androidx.work.impl.utils.x<List<WorkInfo>> xVarE = androidx.work.impl.utils.x.e(this, xVar);
        this.f29017d.c().execute(xVarE);
        return xVarE.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<List<WorkInfo>> w(@androidx.annotation.n0 String str) {
        androidx.work.impl.utils.x<List<WorkInfo>> xVarB = androidx.work.impl.utils.x.b(this, str);
        this.f29017d.c().execute(xVarB);
        return xVarB.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public LiveData<List<WorkInfo>> x(@androidx.annotation.n0 String str) {
        return androidx.work.impl.utils.l.a(this.f29016c.X().p(str), androidx.work.impl.model.u.f29128x, this.f29017d);
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<List<WorkInfo>> y(@androidx.annotation.n0 String str) {
        androidx.work.impl.utils.x<List<WorkInfo>> xVarD = androidx.work.impl.utils.x.d(this, str);
        this.f29017d.c().execute(xVarD);
        return xVarD.f();
    }

    @Override // androidx.work.WorkManager
    @androidx.annotation.n0
    public LiveData<List<WorkInfo>> z(@androidx.annotation.n0 String str) {
        return androidx.work.impl.utils.l.a(this.f29016c.X().o(str), androidx.work.impl.model.u.f29128x, this.f29017d);
    }
}
