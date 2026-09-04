package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: compiled from: HianalyticsExist.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f62642a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f62643b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f62644c = false;

    public static boolean a() {
        synchronized (f62642a) {
            if (!f62643b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f62643b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + f62644c);
            }
        }
        return f62644c;
    }
}
