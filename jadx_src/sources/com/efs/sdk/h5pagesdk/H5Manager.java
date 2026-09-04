package com.efs.sdk.h5pagesdk;

import android.content.Context;
import android.view.View;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;

/* JADX INFO: loaded from: classes6.dex */
public class H5Manager {
    public static final String TAG = "H5Manager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static EfsReporter f42602g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static H5ConfigMananger f42603h = null;
    public static boolean isDebug = true;

    public static H5ConfigMananger getH5ConfigMananger() {
        return f42603h;
    }

    public static EfsReporter getReporter() {
        return f42602g;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.e(TAG, "init H5 manager error! parameter is null!");
        } else {
            f42602g = efsReporter;
            f42603h = new H5ConfigMananger(context, efsReporter);
        }
    }

    public static void setWebView(View view) {
        H5ConfigMananger h5ConfigMananger;
        if (view == null || (h5ConfigMananger = f42603h) == null) {
            if (isDebug) {
                Log.e(TAG, "webView为null，或H5功能未初始化完成");
                return;
            }
            return;
        }
        if (h5ConfigMananger.isH5TracerEnable() || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            UApmJSBridge uApmJSBridge = new UApmJSBridge();
            try {
                Class<?> cls = view.getClass();
                try {
                    Object objInvoke = cls.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                    if (objInvoke != null) {
                        objInvoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE).invoke(objInvoke, Boolean.TRUE);
                    }
                } catch (Throwable unused) {
                }
                cls.getMethod("addJavascriptInterface", Object.class, String.class).invoke(view, uApmJSBridge, "UAPM_JSBridge");
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        if (isDebug) {
            Log.d(TAG, "未注入JavascriptInterface：H5命中状态=" + f42603h.isH5TracerEnable() + "; 集成测试状态=" + IntegrationTestingUtil.isIntegrationTestingInPeriod());
        }
    }
}
