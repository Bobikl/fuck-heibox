package com.apm.lite.k;

/* JADX INFO: loaded from: classes6.dex */
public class u {
    public static boolean a(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
