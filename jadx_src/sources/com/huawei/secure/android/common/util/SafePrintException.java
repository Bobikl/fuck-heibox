package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SafePrintException {
    private static boolean a(String str) {
        String[] strArr = {"java.io.FileNotFoundException", "java.util.jar.JarException", "java.util.MissingResourceException", "java.security.acl.NotOwnerException", "java.util.ConcurrentModificationException", "javax.naming.InsufficientResourcesException", "java.net.BindException", "java.lang.OutOfMemoryError", "java.lang.StackOverflowError", "java.sql.SQLException"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (str.contains(strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public static String getStackTrace(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        sb2.append("Exception: ");
        sb2.append(th2.getClass().getName());
        sb2.append('\n');
        if (!a(th2.getClass().getCanonicalName())) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace == null) {
                sb2.append("Stack trace is NULL!");
                sb2.append('\n');
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append('\n');
                }
            }
        }
        return sb2.toString();
    }

    public static void print(String str, String str2, Throwable th2) {
        if (th2 == null) {
            return;
        }
        Log.w(str, getStackTrace(str2, th2));
    }
}
