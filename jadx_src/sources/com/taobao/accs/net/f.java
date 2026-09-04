package com.taobao.accs.net;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.internal.AccsJobService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class f extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JobScheduler f98322c;

    f(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.g
    @SuppressLint({"NewApi"})
    protected void a(int i10) {
        if (this.f98322c == null) {
            this.f98322c = (JobScheduler) this.f98325a.getSystemService("jobscheduler");
        }
        this.f98322c.cancel(2050);
        long j10 = i10 * 1000;
        this.f98322c.schedule(new JobInfo.Builder(2050, new ComponentName(this.f98325a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j10).setOverrideDeadline(j10).setRequiredNetworkType(1).build());
    }
}
