package com.google.android.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.w0;
import androidx.annotation.z0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class PlatformScheduler implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47385d = "PlatformScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47386e = "service_action";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47387f = "service_package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f47388g = "requirements";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47389h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f47391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JobScheduler f47392c;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int iD = new Requirements(extras.getInt("requirements")).d(this);
            if (iD == 0) {
                String str = (String) com.google.android.exoplayer2.util.a.g(extras.getString(PlatformScheduler.f47386e));
                u0.s1(this, new Intent(str).setPackage((String) com.google.android.exoplayer2.util.a.g(extras.getString(PlatformScheduler.f47387f))));
                return false;
            }
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Requirements not met: ");
            sb2.append(iD);
            u.m(PlatformScheduler.f47385d, sb2.toString());
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        f47389h = (u0.f51536a >= 26 ? 16 : 0) | 15;
    }

    @z0("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context, int i10) {
        Context applicationContext = context.getApplicationContext();
        this.f47390a = i10;
        this.f47391b = new ComponentName(applicationContext, (Class<?>) PlatformSchedulerService.class);
        this.f47392c = (JobScheduler) com.google.android.exoplayer2.util.a.g((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    private static JobInfo c(int i10, ComponentName componentName, Requirements requirements, String str, String str2) {
        Requirements requirementsB = requirements.b(f47389h);
        if (!requirementsB.equals(requirements)) {
            int iF = requirementsB.f() ^ requirements.f();
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Ignoring unsupported requirements: ");
            sb2.append(iF);
            u.m(f47385d, sb2.toString());
        }
        JobInfo.Builder builder = new JobInfo.Builder(i10, componentName);
        if (requirements.u()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.o()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.l());
        builder.setRequiresCharging(requirements.h());
        if (u0.f51536a >= 26 && requirements.r()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f47386e, str);
        persistableBundle.putString(f47387f, str2);
        persistableBundle.putInt("requirements", requirements.f());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // com.google.android.exoplayer2.scheduler.c
    public Requirements a(Requirements requirements) {
        return requirements.b(f47389h);
    }

    @Override // com.google.android.exoplayer2.scheduler.c
    public boolean b(Requirements requirements, String str, String str2) {
        return this.f47392c.schedule(c(this.f47390a, this.f47391b, requirements, str2, str)) == 1;
    }

    @Override // com.google.android.exoplayer2.scheduler.c
    public boolean cancel() {
        this.f47392c.cancel(this.f47390a);
        return true;
    }
}
