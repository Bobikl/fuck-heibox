package com.igexin.push.extension.distribution.basic.c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f63951a;

    private a() {
    }

    public static synchronized a a() {
        if (f63951a == null) {
            f63951a = new a();
        }
        return f63951a;
    }

    public boolean a(Context context, Intent intent, int i10) {
        com.igexin.a.a.c.b.a("JobSender| JobSender.runJob()", new Object[0]);
        if (Build.VERSION.SDK_INT >= 26 && context != null && intent != null && intent.getComponent() != null) {
            try {
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                JobInfo jobInfoBuild = new JobInfo.Builder(i10, intent.getComponent()).setOverrideDeadline(0L).build();
                Class<?> cls = Class.forName("android.app.job.JobWorkItem");
                JobScheduler.class.getDeclaredMethod("enqueue", JobInfo.class, cls).invoke(jobScheduler, jobInfoBuild, cls.getConstructor(Intent.class).newInstance(intent));
                com.igexin.a.a.c.b.a("JobSender| started by JobSender", new Object[0]);
                return true;
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a("JobSender|" + th2.toString(), new Object[0]);
            }
        }
        return false;
    }
}
