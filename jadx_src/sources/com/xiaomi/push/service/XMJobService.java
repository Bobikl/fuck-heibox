package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.push.fu;

/* JADX INFO: loaded from: classes4.dex */
public class XMJobService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Service f107830a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private IBinder f952a = null;

    @TargetApi(21)
    public static class a extends JobService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Binder f107831a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private Handler f953a;

        /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$a$a, reason: collision with other inner class name */
        public static class HandlerC1064a extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            JobService f107832a;

            HandlerC1064a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f107832a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                com.xiaomi.channel.commonutils.logger.b.m62a("Job finished " + jobParameters.getJobId());
                this.f107832a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    fu.a(false);
                }
            }
        }

        a(Service service) {
            this.f107831a = null;
            this.f107831a = (Binder) com.xiaomi.push.bk.a((Object) this, "onBind", new Intent());
            com.xiaomi.push.bk.a((Object) this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f953a == null) {
                this.f953a = new HandlerC1064a(this);
            }
            Handler handler = this.f953a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f952a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f952a = new a(this).f107831a;
        f107830a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f107830a = null;
    }
}
