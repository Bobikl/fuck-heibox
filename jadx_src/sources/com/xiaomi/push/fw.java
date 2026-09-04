package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public class fw implements fu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    JobScheduler f107148a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    Context f444a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f445a = false;

    fw(Context context) {
        this.f444a = context;
        this.f107148a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.fu.a
    public void a() {
        this.f445a = false;
        this.f107148a.cancel(1);
    }

    void a(long j10) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f444a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j10);
        builder.setOverrideDeadline(j10);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        com.xiaomi.channel.commonutils.logger.b.c("schedule Job = " + builder.build().getId() + " in " + j10);
        this.f107148a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.fu.a
    public void a(boolean z10) {
        if (z10 || this.f445a) {
            long jB = hh.b();
            if (z10) {
                a();
                jB -= SystemClock.elapsedRealtime() % jB;
            }
            this.f445a = true;
            a(jB);
        }
    }

    @Override // com.xiaomi.push.fu.a
    /* JADX INFO: renamed from: a */
    public boolean mo390a() {
        return this.f445a;
    }
}
