package com.vivo.push.d;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OnNotificationClickTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f106563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f106564c;

    v(u uVar, Context context, Map map) {
        this.f106564c = uVar;
        this.f106562a = context;
        this.f106563b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String packageName = this.f106562a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f106562a.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningTasks(100);
            if (runningTasks != null) {
                Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = it.next().topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        com.vivo.push.util.p.d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        u.b(intent, this.f106563b);
                        this.f106562a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "start recentIntent is error", e10);
        }
        Intent launchIntentForPackage = this.f106562a.getPackageManager().getLaunchIntentForPackage(this.f106562a.getPackageName());
        if (launchIntentForPackage == null) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "LaunchIntent is null");
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        u.b(launchIntentForPackage, this.f106563b);
        this.f106562a.startActivity(launchIntentForPackage);
    }
}
