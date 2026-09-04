package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ApkResolutionFailedManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ApkResolutionFailedManager f60322c = new ApkResolutionFailedManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f60323a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Runnable> f60324b = new HashMap(2);

    private ApkResolutionFailedManager() {
    }

    public static ApkResolutionFailedManager getInstance() {
        return f60322c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "postTask is not in main thread");
        } else {
            this.f60324b.put(str, runnable);
            this.f60323a.postDelayed(runnable, 2000L);
        }
    }

    public void removeTask(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeTask is not in main thread");
            return;
        }
        Runnable runnableRemove = this.f60324b.remove(str);
        if (runnableRemove == null) {
            HMSLog.e("ApkResolutionFailedManager", "cancel runnable is null");
        } else {
            this.f60323a.removeCallbacks(runnableRemove);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        } else {
            this.f60324b.remove(str);
        }
    }
}
