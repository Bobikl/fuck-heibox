package com.taobao.accs.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.j;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public class AccsJobService extends JobService {
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        ALog.d("AccsJobService", "onStartJob", new Object[0]);
        try {
            String packageName = getPackageName();
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            intent.setClassName(packageName, j.channelService);
            com.taobao.accs.a.a.a(getApplicationContext(), intent);
        } catch (Throwable th2) {
            ALog.e("AccsJobService", "onStartJob", th2, new Object[0]);
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        try {
            Intent intent = new Intent();
            intent.setPackage(getPackageName());
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            intent.setClassName(getPackageName(), j.channelService);
            com.taobao.accs.a.a.a(getApplicationContext(), intent);
        } catch (Throwable th2) {
            ALog.e("AccsJobService", "onStopJob", th2, new Object[0]);
        }
        return false;
    }
}
