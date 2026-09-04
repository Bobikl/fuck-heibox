package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class LogsUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f63075a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f63076b = '*';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f63077c = 2;

    public static class a extends Throwable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f63078d = 7129050843360571879L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f63079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Throwable f63080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Throwable f63081c;

        public a(Throwable th2) {
            this.f63081c = th2;
        }

        public void a(String str) {
            this.f63079a = str;
        }

        public void a(Throwable th2) {
            this.f63080b = th2;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th2;
            th2 = this.f63080b;
            if (th2 == this) {
                th2 = null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f63079a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.f63081c;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f63079a == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f63079a.startsWith(str)) {
                return this.f63079a;
            }
            return str + this.f63079a;
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 1;
        if (1 == length) {
            return String.valueOf(f63076b);
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (f63075a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i10 % 2 == 0) {
                    cCharAt = '*';
                }
                i10++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    private static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(a(str2));
        }
        return sb2.toString();
    }

    private static String a(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                sb2.append(a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    private static Throwable a(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        a aVar = new a(th2);
        aVar.setStackTrace(th2.getStackTrace());
        aVar.a(b(th2.getMessage()));
        Throwable cause = th2.getCause();
        a aVar2 = aVar;
        while (cause != null) {
            a aVar3 = new a(cause);
            aVar3.setStackTrace(cause.getStackTrace());
            aVar3.a(b(cause.getMessage()));
            aVar2.a(aVar3);
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 % 2 == 0) {
                charArray[i10] = f63076b;
            }
        }
        return new String(charArray);
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, a(str2, false));
    }

    public static void d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, a(str2, str3));
    }

    public static void d(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, a(str2, str3), a(th2));
    }

    public static void d(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.d(str, a(str2, false), a(th2));
    }

    public static void d(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, a(str2, z10), a(th2));
    }

    public static void d(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, a(str2, z10));
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    public static void e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, a(str2, str3));
    }

    public static void e(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, a(str2, str3), a(th2));
    }

    public static void e(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.e(str, a(str2, false), a(th2));
    }

    public static void e(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.e(str, a(str2, z10), a(th2));
    }

    public static void e(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, z10));
    }

    public static void i(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, a(str2, false));
    }

    public static void i(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, a(str2, str3));
    }

    public static void i(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, a(str2, str3), a(th2));
    }

    public static void i(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.i(str, a(str2, false), a(th2));
    }

    public static void i(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.i(str, a(str2, z10), a(th2));
    }

    public static void i(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, a(str2, z10));
    }

    public static void w(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, a(str2, false));
    }

    public static void w(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, a(str2, str3));
    }

    public static void w(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, a(str2, str3), a(th2));
    }

    public static void w(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, a(str2, false), a(th2));
    }

    public static void w(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, a(str2, z10), a(th2));
    }

    public static void w(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, a(str2, z10));
    }
}
