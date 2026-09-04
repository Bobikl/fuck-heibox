package com.umeng.pagesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;

/* JADX INFO: loaded from: classes4.dex */
public class PageManger {
    public static final String TAG = "PageManger";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f105951a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105952b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static EfsReporter f105953c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static PageConfigManger f105954d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f105955e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static float f105956f = 0.0f;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f105951a;
    }

    public static PageConfigManger getPageConfigManger() {
        return f105954d;
    }

    public static float getRefreshRate() {
        return f105956f;
    }

    public static EfsReporter getReporter() {
        return f105953c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(TAG, "init page manager error! parameter is null!");
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
            }
        } else {
            f105951a = context.getApplicationContext();
            f105953c = efsReporter;
            f105954d = new PageConfigManger(context, efsReporter);
            f105952b = true;
        }
    }

    public static boolean isControlMainThread() {
        return f105955e;
    }

    public static boolean isInit() {
        return f105952b;
    }

    public static void onTracePageBegin(Activity activity, String str) {
        try {
            onTracePageBegin(activity, str, false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void onTracePageBegin(Activity activity, String str, boolean z10) {
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z10 && (str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageBegin. parameter illegality!");
                            return;
                        }
                        return;
                    }
                    if (str.length() > 10) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageBegin. method name is " + str + "method name over length !");
                            return;
                        }
                        return;
                    }
                    if (f105955e && !e.a(activity.getApplicationContext()) && isDebug) {
                        Log.e(TAG, "tracePageBegin. Non main process !");
                    }
                    String name = activity.getClass().getName();
                    if (f105956f <= 0.0f) {
                        f105956f = Build.VERSION.SDK_INT >= 30 ? activity.getDisplay().getRefreshRate() : activity.getWindowManager().getDefaultDisplay().getRefreshRate();
                    }
                    d.a(name, str, z10);
                    return;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(TAG, "tracePageBegin. parameter null!");
        }
    }

    public static void onTracePageEnd(Activity activity, String str) {
        try {
            onTracePageEnd(activity, str, false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void onTracePageEnd(Activity activity, String str, boolean z10) {
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z10 && (str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageEnd. parameter illegality!");
                            return;
                        }
                        return;
                    } else {
                        if (str.length() <= 10) {
                            if (f105955e && !e.a(activity.getApplicationContext()) && isDebug) {
                                Log.e(TAG, "tracePageBegin. Non main process !");
                            }
                            d.b(activity.getClass().getName(), str, z10);
                            return;
                        }
                        if (isDebug) {
                            Log.e(TAG, "tracePageEnd. method name is " + str + "method name over length !");
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(TAG, "tracePageEnd. parameter null!");
        }
    }

    public static void setControlMainThread(boolean z10) {
        f105955e = z10;
    }
}
