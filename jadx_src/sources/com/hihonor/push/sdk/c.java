package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static void a(String str) {
        String strSubstring;
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClass().equals(c.class)) {
                String className = stackTrace[i10].getClassName();
                strSubstring = className.substring(className.lastIndexOf(46) + 1);
                a("HonorPush_" + strSubstring, str, null);
            }
        }
        strSubstring = "";
        a("HonorPush_" + strSubstring, str, null);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (str2.length() > 4000) {
            int i10 = 0;
            while (i10 < str2.length()) {
                int i11 = i10 + 4000;
                if (str2.length() > i11) {
                    str2.substring(i10, i11);
                } else {
                    str2.substring(i10);
                }
                i10 = i11;
            }
        }
    }
}
