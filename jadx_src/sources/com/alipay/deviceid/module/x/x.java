package com.alipay.deviceid.module.x;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: compiled from: LoggerClient.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        u uVar = new u(Build.MODEL, context.getApplicationContext().getApplicationInfo().packageName, "APPSecuritySDK-YD", "6.0.6.20201030", str, str2, str3);
        w.a(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", uVar.toString());
    }

    public static synchronized void a(String str) {
        w.a(str);
    }

    public static synchronized void a(Throwable th2) {
        w.a(th2);
    }
}
