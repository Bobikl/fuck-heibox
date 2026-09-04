package com.taobao.accs.a;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.k;
import com.taobao.accs.utl.v;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final String TAG = "a";

    public static void a(Context context, Intent intent) {
        String className;
        String packageName;
        if (context == null || intent == null) {
            ALog.e(TAG, "dispatchIntent context or intent is null", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (intent.getComponent() == null) {
                className = intent.toString();
                packageName = "";
            } else {
                className = intent.getComponent().getClassName();
                packageName = intent.getComponent().getPackageName();
            }
            if (v.a(applicationContext)) {
                ALog.i(TAG, "dispatchIntent bind service start", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                if (applicationContext.bindService(intent, new b(intent, applicationContext, context, 0), 1) || !context.getPackageName().equals(packageName)) {
                    return;
                }
                k.a("accs", "bind", intent.toString(), UtilityImpl.a(-2), "dispatchIntent bindService return false");
                return;
            }
            ALog.i(TAG, "dispatchIntent start service ", new Object[0]);
            applicationContext.startService(intent);
            if (context.getPackageName().equals(packageName)) {
                k.a("accs", "bind", className);
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "dispatchIntent method call with exception ", th2, new Object[0]);
            if (context.getPackageName().equals(null)) {
                k.a("accs", "bind", intent.toString(), UtilityImpl.a(-1), "dispatchIntent method call with exception");
            }
        }
    }
}
