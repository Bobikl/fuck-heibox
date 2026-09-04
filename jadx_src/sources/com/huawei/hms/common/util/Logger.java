package com.huawei.hms.common.util;

import android.annotation.SuppressLint;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f60582a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f60583b = "Logger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f60584c = "|";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60585d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60586e = 20;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f60587f = "dynamic-api_";

    public static class b extends Throwable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f60588d = 7129050843360571879L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f60589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Throwable f60590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Throwable f60591c;

        public b(Throwable th2) {
            this.f60591c = th2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Throwable th2) {
            this.f60590b = th2;
        }

        public void a(String str) {
            this.f60589a = str;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th2 = this.f60590b;
            if (th2 == this) {
                return null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f60589a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.f60591c;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f60589a == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f60589a.startsWith(str)) {
                return this.f60589a;
            }
            return str + this.f60589a;
        }
    }

    public static int a(int i10, String str, String str2) {
        return Log.println(i10, a(str), a(str2, 7));
    }

    public static String a(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i10) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myTid() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    public static String a(String str) {
        return f60587f + str;
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return a(i10);
        }
        return a(i10) + "|" + str;
    }

    public static Throwable a(Throwable th2) {
        if (isLoggable(3)) {
            return th2;
        }
        if (th2 == null) {
            return null;
        }
        int i10 = ((th2 instanceof IOException) || (th2 instanceof JSONException)) ? 8 : 20;
        b bVar = new b(th2);
        StackTraceElement[] stackTrace = bVar.getStackTrace();
        if (stackTrace.length > i10) {
            bVar.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i10));
        } else {
            bVar.setStackTrace(stackTrace);
        }
        bVar.a(anonymizeMessage(th2.getMessage()));
        Throwable cause = th2.getCause();
        b bVar2 = bVar;
        while (cause != null) {
            b bVar3 = new b(cause);
            bVar3.a(anonymizeMessage(cause.getMessage()));
            bVar2.a(bVar3);
            cause = cause.getCause();
            bVar2 = bVar3;
        }
        return bVar;
    }

    public static String anonymizeMessage(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 % 2 == 1) {
                charArray[i10] = '*';
            }
        }
        return new String(charArray);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    public static void e(String str, String str2, Throwable th2) {
        Log.e(a(str), a(str2, 5), a(th2));
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isLoggable(int i10) {
        return Log.isLoggable(f60587f, i10);
    }

    public static void println(int i10, String str, Object obj) {
        if (i10 >= 3 && isLoggable(i10)) {
            a(i10, str, obj == null ? "null" : obj.toString());
        }
    }

    public static void println(int i10, String str, String str2, Object... objArr) {
        if (i10 < 3) {
            return;
        }
        if (str2 == null) {
            Log.w(f60583b, "format is null, not log");
            return;
        }
        try {
            if (isLoggable(i10)) {
                a(i10, str, format(str2, objArr));
            }
        } catch (IllegalFormatException e10) {
            w(f60583b, "log format error" + str2, e10);
        }
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void w(String str, String str2, Throwable th2) {
        Log.w(a(str), a(str2, 5), a(th2));
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }
}
