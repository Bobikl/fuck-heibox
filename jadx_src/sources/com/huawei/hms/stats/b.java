package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: HiAnalyticsOfCpUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HiAnalyticsInstance f62641a;

    private static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f62641a = analyticsInstance;
        return analyticsInstance;
    }

    public static void a(Context context, int i10) {
        if (a(context) != null) {
            f62641a.onReport(i10);
        }
    }

    public static void a(Context context, int i10, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f62641a.onEvent(i10, str, linkedHashMap);
        }
    }

    public static void a(Context context, String str, String str2) {
        if (a(context) != null) {
            f62641a.onEvent(context, str, str2);
        }
    }

    public static void b(Context context, int i10, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f62641a.onStreamEvent(i10, str, linkedHashMap);
        }
    }
}
