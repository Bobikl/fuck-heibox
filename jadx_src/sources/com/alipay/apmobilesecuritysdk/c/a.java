package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import s4.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        s4.a aVarB = b(context, str, str2, str3);
        d.b(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", aVarB.toString());
    }

    public static synchronized void a(String str) {
        d.a(str);
    }

    public static synchronized void a(Throwable th2) {
        d.c(th2);
    }

    public static s4.a b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new s4.a(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202206130311", str, str2, str3);
    }
}
