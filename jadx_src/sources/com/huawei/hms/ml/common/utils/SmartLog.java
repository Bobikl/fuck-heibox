package com.huawei.hms.ml.common.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class SmartLog {
    private static final int LEN_CONST = 2;
    private static final Pattern M_PATTERN = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");
    private static final char STAR = '*';

    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        public ThrowableWrapper(Throwable th2) {
            this.ownerThrowable = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th2 = this.thisCause;
            if (th2 == this) {
                return null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public void setCause(Throwable th2) {
            this.thisCause = th2;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.ownerThrowable;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.message == null) {
                return name;
            }
            String str = name + ": ";
            if (this.message.startsWith(str)) {
                return this.message;
            }
            return str + this.message;
        }
    }

    public static void d(String str, String str2) {
    }

    public static void d(String str, String str2, String str3) {
    }

    public static void d(String str, String str2, String str3, Throwable th2) {
    }

    public static void d(String str, String str2, Throwable th2) {
    }

    public static void d(String str, String str2, Throwable th2, boolean z10) {
    }

    public static void d(String str, String str2, boolean z10) {
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, getLogMsg(str2, false));
    }

    public static void e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, getLogMsg(str2, str3));
    }

    public static void e(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, getLogMsg(str2, str3), getNewThrowable(th2));
    }

    public static void e(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.e(str, getLogMsg(str2, false), getNewThrowable(th2));
    }

    public static void e(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.e(str, getLogMsg(str2, z10), getNewThrowable(th2));
    }

    public static void e(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, getLogMsg(str2, z10));
    }

    private static String formatLogWithStar(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 1;
        if (1 == length) {
            return String.valueOf(STAR);
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (M_PATTERN.matcher(String.valueOf(cCharAt)).matches()) {
                if (i10 % 2 == 0) {
                    cCharAt = '*';
                }
                i10++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    private static String getLogMsg(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(formatLogWithStar(str2));
        }
        return sb2.toString();
    }

    private static String getLogMsg(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                sb2.append(formatLogWithStar(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    private static Throwable getNewThrowable(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th2);
        throwableWrapper.setStackTrace(th2.getStackTrace());
        throwableWrapper.setMessage(modifyExceptionMessage(th2.getMessage()));
        Throwable cause = th2.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper3.setStackTrace(cause.getStackTrace());
            throwableWrapper3.setMessage(modifyExceptionMessage(cause.getMessage()));
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    public static void i(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, getLogMsg(str2, false));
    }

    public static void i(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, getLogMsg(str2, str3));
    }

    public static void i(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, getLogMsg(str2, str3), getNewThrowable(th2));
    }

    public static void i(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.i(str, getLogMsg(str2, false), getNewThrowable(th2));
    }

    public static void i(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.i(str, getLogMsg(str2, z10), getNewThrowable(th2));
    }

    public static void i(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, getLogMsg(str2, z10));
    }

    private static String modifyExceptionMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 % 2 == 0) {
                charArray[i10] = STAR;
            }
        }
        return new String(charArray);
    }

    public static void w(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, getLogMsg(str2, false));
    }

    public static void w(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, getLogMsg(str2, str3));
    }

    public static void w(String str, String str2, String str3, Throwable th2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, getLogMsg(str2, str3), getNewThrowable(th2));
    }

    public static void w(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, getLogMsg(str2, false), getNewThrowable(th2));
    }

    public static void w(String str, String str2, Throwable th2, boolean z10) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, getLogMsg(str2, z10), getNewThrowable(th2));
    }

    public static void w(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, getLogMsg(str2, z10));
    }
}
