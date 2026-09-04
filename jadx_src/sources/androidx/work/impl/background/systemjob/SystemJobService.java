package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.work.WorkerParameters;
import androidx.work.impl.g0;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.v;
import androidx.work.impl.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@w0(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements androidx.work.impl.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28905e = androidx.work.n.i("SystemJobService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f28906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<WorkGenerationalId, JobParameters> f28907c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f28908d = new w();

    @w0(24)
    public static class a {
        private a() {
        }

        @u
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @u
        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @w0(28)
    public static class b {
        private b() {
        }

        @u
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @p0
    private static WorkGenerationalId a(@n0 JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.e
    /* JADX INFO: renamed from: d */
    public void m(@n0 WorkGenerationalId mVar, boolean z10) {
        JobParameters jobParametersRemove;
        androidx.work.n.e().a(f28905e, mVar.f() + " executed on JobScheduler");
        synchronized (this.f28907c) {
            jobParametersRemove = this.f28907c.remove(mVar);
        }
        this.f28908d.b(mVar);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            g0 g0VarJ = g0.J(getApplicationContext());
            this.f28906b = g0VarJ;
            g0VarJ.L().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            androidx.work.n.e().l(f28905e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        g0 g0Var = this.f28906b;
        if (g0Var != null) {
            g0Var.L().o(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@n0 JobParameters jobParameters) {
        if (this.f28906b == null) {
            androidx.work.n.e().a(f28905e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId mVarA = a(jobParameters);
        if (mVarA == null) {
            androidx.work.n.e().c(f28905e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f28907c) {
            if (this.f28907c.containsKey(mVarA)) {
                androidx.work.n.e().a(f28905e, "Job is already being executed by SystemJobService: " + mVarA);
                return false;
            }
            androidx.work.n.e().a(f28905e, "onStartJob for " + mVarA);
            this.f28907c.put(mVarA, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f28721b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f28720a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f28722c = b.a(jobParameters);
                }
            }
            this.f28906b.Y(this.f28908d.e(mVarA), aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@n0 JobParameters jobParameters) {
        if (this.f28906b == null) {
            androidx.work.n.e().a(f28905e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId mVarA = a(jobParameters);
        if (mVarA == null) {
            androidx.work.n.e().c(f28905e, "WorkSpec id not found!");
            return false;
        }
        androidx.work.n.e().a(f28905e, "onStopJob for " + mVarA);
        synchronized (this.f28907c) {
            this.f28907c.remove(mVarA);
        }
        v vVarB = this.f28908d.b(mVarA);
        if (vVarB != null) {
            this.f28906b.a0(vVarB);
        }
        return !this.f28906b.L().k(mVarA.f());
    }
}
