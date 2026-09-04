package com.umeng.powersdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class PowerManager {
    public static final String TAG = "PowerManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f105993a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105994b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static EfsReporter f105995c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static PowerConfigManager f105996d = null;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f105993a;
    }

    public static PowerConfigManager getPowerConfigManager() {
        return f105996d;
    }

    public static EfsReporter getReporter() {
        return f105995c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(TAG, "init power manager error! parameter is null!");
                    return;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        if (isInit()) {
            if (isDebug) {
                Log.e(TAG, "invalid init ！");
                return;
            }
            return;
        }
        f105993a = context.getApplicationContext();
        f105995c = efsReporter;
        f105996d = new PowerConfigManager(context, efsReporter);
        f105994b = true;
        final c cVar = c.a.f106021a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer()) {
                return;
            }
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("efs_power", 0);
            if (sharedPreferences != null) {
                cVar.f106006b = sharedPreferences.getInt("apm_powerperf_collect_interval", 5);
                cVar.f106007c = sharedPreferences.getInt("apm_powerperf_collect_max_period_sec", 100);
            }
            final HandlerThread handlerThread = new HandlerThread("power-info");
            handlerThread.start();
            final Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.umeng.powersdk.c.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == c.this.f106005a) {
                        try {
                            handlerThread.quit();
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            handler.post(new Runnable() { // from class: com.umeng.powersdk.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final c cVar2 = c.this;
                        final Handler handler2 = handler;
                        final int i10 = cVar2.f106006b;
                        final int i11 = cVar2.f106007c;
                        final long jElapsedRealtime = SystemClock.elapsedRealtime();
                        handler2.post(new Runnable() { // from class: com.umeng.powersdk.c.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (c.this.f106009e) {
                                    if (SystemClock.elapsedRealtime() - jElapsedRealtime > i11 * 1000) {
                                        handler2.sendEmptyMessage(c.this.f106005a);
                                        return;
                                    }
                                    try {
                                        EfsJSONLog efsJSONLog = new EfsJSONLog("powerperf");
                                        efsJSONLog.put("power", c.this.a());
                                        EfsReporter reporter = PowerManager.getReporter();
                                        if (reporter != null) {
                                            reporter.send(efsJSONLog);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                handler2.postDelayed(this, i10 * 1000);
                            }
                        });
                    } catch (Throwable unused) {
                        handler.sendEmptyMessage(c.this.f106005a);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean isInit() {
        return f105994b;
    }

    public static void onActivityResumed(Activity activity) {
        c cVar = c.a.f106021a;
        try {
            if (getPowerConfigManager() != null && getPowerConfigManager().enableTracer()) {
                cVar.f106008d = new WeakReference<>(activity);
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStarted(Activity activity) {
        c cVar = c.a.f106021a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (cVar.f106011g) {
                cVar.f106011g = false;
                return;
            }
            int i10 = cVar.f106010f + 1;
            cVar.f106010f = i10;
            if (i10 == 1) {
                cVar.f106009e = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStopped(Activity activity) {
        c cVar = c.a.f106021a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (activity.isChangingConfigurations()) {
                cVar.f106011g = true;
                return;
            }
            int i10 = cVar.f106010f - 1;
            cVar.f106010f = i10;
            if (i10 == 0) {
                cVar.f106009e = false;
            }
        } catch (Throwable unused) {
        }
    }
}
