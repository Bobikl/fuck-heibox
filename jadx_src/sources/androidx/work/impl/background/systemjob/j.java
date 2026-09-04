package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.g0;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.u;
import androidx.work.impl.model.v;
import androidx.work.impl.model.x;
import androidx.work.impl.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: SystemJobScheduler.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class j implements t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28915f = androidx.work.n.i("SystemJobScheduler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JobScheduler f28917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f28918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f28919e;

    public j(@n0 Context context, @n0 g0 g0Var) {
        this(context, g0Var, (JobScheduler) context.getSystemService("jobscheduler"), new i(context));
    }

    @j1
    public j(@n0 Context context, @n0 g0 g0Var, @n0 JobScheduler jobScheduler, @n0 i iVar) {
        this.f28916b = context;
        this.f28918d = g0Var;
        this.f28917c = jobScheduler;
        this.f28919e = iVar;
    }

    public static void a(@n0 Context context) {
        List<JobInfo> listF;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listF = f(context, jobScheduler)) == null || listF.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listF.iterator();
        while (it.hasNext()) {
            d(jobScheduler, it.next().getId());
        }
    }

    private static void d(@n0 JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            androidx.work.n.e().d(f28915f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    @p0
    private static List<Integer> e(@n0 Context context, @n0 JobScheduler jobScheduler, @n0 String str) {
        List<JobInfo> listF = f(context, jobScheduler);
        if (listF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listF) {
            WorkGenerationalId workGenerationalIdG = g(jobInfo);
            if (workGenerationalIdG != null && str.equals(workGenerationalIdG.f())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @p0
    private static List<JobInfo> f(@n0 Context context, @n0 JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            androidx.work.n.e().d(f28915f, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @p0
    private static WorkGenerationalId g(@n0 JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean h(@n0 Context context, @n0 g0 g0Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listF = f(context, jobScheduler);
        List<String> listE = g0Var.P().U().e();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listF != null ? listF.size() : 0);
        if (listF != null && !listF.isEmpty()) {
            for (JobInfo jobInfo : listF) {
                WorkGenerationalId workGenerationalIdG = g(jobInfo);
                if (workGenerationalIdG != null) {
                    hashSet.add(workGenerationalIdG.f());
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                androidx.work.n.e().a(f28915f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase workDatabaseP = g0Var.P();
            workDatabaseP.e();
            try {
                v vVarX = workDatabaseP.X();
                Iterator<String> it2 = listE.iterator();
                while (it2.hasNext()) {
                    vVarX.C(it2.next(), -1L);
                }
                workDatabaseP.O();
            } finally {
                workDatabaseP.k();
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.t
    public boolean b() {
        return true;
    }

    @Override // androidx.work.impl.t
    public void c(@n0 u... uVarArr) {
        List<Integer> listE;
        WorkDatabase workDatabaseP = this.f28918d.P();
        androidx.work.impl.utils.j jVar = new androidx.work.impl.utils.j(workDatabaseP);
        for (u uVar : uVarArr) {
            workDatabaseP.e();
            try {
                u uVarZ = workDatabaseP.X().z(uVar.id);
                if (uVarZ == null) {
                    androidx.work.n.e().l(f28915f, "Skipping scheduling " + uVar.id + " because it's no longer in the DB");
                    workDatabaseP.O();
                } else if (uVarZ.state != WorkInfo.State.ENQUEUED) {
                    androidx.work.n.e().l(f28915f, "Skipping scheduling " + uVar.id + " because it is no longer enqueued");
                    workDatabaseP.O();
                } else {
                    WorkGenerationalId workGenerationalIdA = x.a(uVar);
                    SystemIdInfo systemIdInfoD = workDatabaseP.U().d(workGenerationalIdA);
                    int iE = systemIdInfoD != null ? systemIdInfoD.systemId : jVar.e(this.f28918d.o().i(), this.f28918d.o().g());
                    if (systemIdInfoD == null) {
                        this.f28918d.P().U().c(androidx.work.impl.model.l.a(workGenerationalIdA, iE));
                    }
                    i(uVar, iE);
                    if (Build.VERSION.SDK_INT == 23 && (listE = e(this.f28916b, this.f28917c, uVar.id)) != null) {
                        int iIndexOf = listE.indexOf(Integer.valueOf(iE));
                        if (iIndexOf >= 0) {
                            listE.remove(iIndexOf);
                        }
                        i(uVar, !listE.isEmpty() ? listE.get(0).intValue() : jVar.e(this.f28918d.o().i(), this.f28918d.o().g()));
                    }
                    workDatabaseP.O();
                }
                workDatabaseP.k();
            } catch (Throwable th2) {
                workDatabaseP.k();
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.t
    public void cancel(@n0 String str) {
        List<Integer> listE = e(this.f28916b, this.f28917c, str);
        if (listE == null || listE.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listE.iterator();
        while (it.hasNext()) {
            d(this.f28917c, it.next().intValue());
        }
        this.f28918d.P().U().g(str);
    }

    @j1
    public void i(@n0 u uVar, int i10) {
        JobInfo jobInfoA = this.f28919e.a(uVar, i10);
        androidx.work.n nVarE = androidx.work.n.e();
        String str = f28915f;
        nVarE.a(str, "Scheduling work ID " + uVar.id + "Job ID " + i10);
        try {
            if (this.f28917c.schedule(jobInfoA) == 0) {
                androidx.work.n.e().l(str, "Unable to schedule work ID " + uVar.id);
                if (uVar.expedited && uVar.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.expedited = false;
                    androidx.work.n.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", uVar.id));
                    i(uVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> listF = f(this.f28916b, this.f28917c);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listF != null ? listF.size() : 0), Integer.valueOf(this.f28918d.P().X().x().size()), Integer.valueOf(this.f28918d.o().h()));
            androidx.work.n.e().c(f28915f, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
            androidx.core.util.d<Throwable> dVarL = this.f28918d.o().l();
            if (dVarL == null) {
                throw illegalStateException;
            }
            dVarL.accept(illegalStateException);
        } catch (Throwable th2) {
            androidx.work.n.e().d(f28915f, "Unable to schedule " + uVar, th2);
        }
    }
}
