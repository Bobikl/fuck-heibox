package com.umeng.ut.a.c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f106429b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f106430c = false;

    private static StackTraceElement a() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(e.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    private static String a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        int i10 = 0;
        objArr2[0] = str;
        sb2.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(a(objArr[i10], objArr[i11]));
                if (i11 < length - 1) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                i10 = i11 + 1;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    public static void a(String str, Throwable th2, Object... objArr) {
        if (f106429b) {
            Log.e(d(), a(str, objArr), th2);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m56a(String str, Object... objArr) {
        if (f106429b) {
            Log.d(d(), a(str, objArr));
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m57a() {
        return f106429b;
    }

    public static void b(String str, Throwable th2, Object... objArr) {
        if (f106430c) {
            Log.e(d(), a(str, objArr), th2);
        }
    }

    public static void b(String str, Object... objArr) {
        if (f106430c) {
            Log.d(d(), a(str, objArr));
        }
    }

    public static void c() {
        if (f106429b) {
            Log.d(d(), a((String) null, new Object[0]));
        }
    }

    private static String d() {
        String methodName;
        String strSubstring;
        StackTraceElement stackTraceElementA = a();
        if (stackTraceElementA != null) {
            String className = stackTraceElementA.getClassName();
            strSubstring = !TextUtils.isEmpty(className) ? className.substring(className.lastIndexOf(46) + 1) : "";
            methodName = stackTraceElementA.getMethodName();
        } else {
            methodName = "";
            strSubstring = methodName;
        }
        return "Utdid." + strSubstring + "." + methodName + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
    }
}
