package com.efs.sdk.memoryinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    final String activity;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    final String f42655bg;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f42656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final long f42657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final long f42658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final long f42659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final float f42660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final long f42661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final long f42662t;

    c(Context context) {
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo = null;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
                memoryInfo = processMemoryInfo[0];
            }
        } catch (Throwable unused) {
        }
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        this.f42655bg = UMMemoryMonitor.get().isForeground() ? "fg" : WebviewFragment.f94370q4;
        this.f42656n = ((long) memoryInfo.getTotalPss()) * 1024;
        this.f42657o = ((long) memoryInfo.dalvikPss) * 1024;
        this.f42658p = ((long) memoryInfo.nativePss) * 1024;
        this.f42661s = f.a(memoryInfo) * 1024;
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.f42659q = jFreeMemory;
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory != 0) {
            this.f42660r = (jFreeMemory * 1.0f) / jMaxMemory;
        } else {
            this.f42660r = 1.0f;
        }
        this.f42662t = f.a() * 1024;
        this.activity = UMMemoryMonitor.get().getCurrentActivity();
    }
}
