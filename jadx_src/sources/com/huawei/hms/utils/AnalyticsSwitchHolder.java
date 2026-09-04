package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.feature.dynamic.f.e;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes7.dex */
public class AnalyticsSwitchHolder {
    public static final int ANALYTICS_DISABLED = 2;
    public static final int ANALYTICS_ENABLED = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f62736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f62737b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Long f62738c = 0L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f62739d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f62740e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62741a;

        a(Context context) {
            this.f62741a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsSwitchHolder.f(this.f62741a);
            HMSLog.i("AnalyticsSwitchHolder", "getStateForHmsAnalyticsProvider");
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62742a;

        b(Context context) {
            this.f62742a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsSwitchHolder", "enter setAnalyticsStateAndTimestamp");
            AnalyticsSwitchHolder.f(this.f62742a);
            HMSLog.i("AnalyticsSwitchHolder", "quit setAnalyticsStateAndTimestamp");
        }
    }

    private static boolean b(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.e("AnalyticsSwitchHolder", "In getBiIsReportSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.");
            } catch (RuntimeException e10) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.", e10);
            }
        }
        HMSLog.i("AnalyticsSwitchHolder", "In getBiIsReportSetting, configuration not found for bi report setting.");
        return false;
    }

    private static void c(Context context) {
        f62738c = Long.valueOf(new Timestamp(System.currentTimeMillis()).getTime());
        new Thread(new a(context), "Thread-getStateForHmsAnalyticsProvider").start();
    }

    private static boolean d(Context context) {
        return e.f60734e.equalsIgnoreCase(GrsApp.getInstance().getIssueCountryCode(context));
    }

    private static void e(Context context) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (timestamp.getTime() - f62738c.longValue() < 86400000 || f62738c.longValue() <= 0) {
            return;
        }
        f62738c = Long.valueOf(timestamp.getTime());
        new Thread(new b(context), "Thread-refreshOobeAnalyticsState").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (context == null) {
            HMSLog.e("AnalyticsSwitchHolder", "In setAnalyticsState、, context is null.");
            return;
        }
        if (HiAnalyticsUtils.getInstance().getOobeAnalyticsState(context) != 1) {
            synchronized (f62737b) {
                f62736a = 2;
            }
            com.huawei.hms.stats.a.c().a();
            return;
        }
        synchronized (f62737b) {
            f62736a = 1;
        }
        if (HiAnalyticsUtils.getInstance().getInitFlag() || f62739d) {
            return;
        }
        HMSBIInitializer.getInstance(context).initHaSDK();
        f62739d = true;
    }

    public static int getAndRefreshAnalyticsState(Context context) {
        int i10;
        synchronized (f62737b) {
            isAnalyticsDisabled(context);
            i10 = f62736a;
        }
        return i10;
    }

    public static boolean getBiSetting(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.e("AnalyticsSwitchHolder", "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.");
            } catch (RuntimeException e10) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.", e10);
            }
        }
        HMSLog.i("AnalyticsSwitchHolder", "In getBiSetting, configuration not found for bisetting.");
        return false;
    }

    public static boolean isAnalyticsDisabled(Context context) {
        synchronized (f62737b) {
            if (f62736a == 0) {
                if (context == null) {
                    return true;
                }
                if (b(context)) {
                    HMSLog.i("AnalyticsSwitchHolder", "Builder->biReportSetting :true");
                    f62736a = 1;
                } else if (getBiSetting(context)) {
                    HMSLog.i("AnalyticsSwitchHolder", "Builder->biSetting :true");
                    f62736a = 2;
                } else if (d(context)) {
                    f62736a = 1;
                } else {
                    HMSLog.i("AnalyticsSwitchHolder", "not ChinaROM");
                    f62736a = 3;
                    f62740e = true;
                    c(context);
                }
            } else if (f62740e) {
                e(context);
            }
            return f62736a != 1;
        }
    }
}
