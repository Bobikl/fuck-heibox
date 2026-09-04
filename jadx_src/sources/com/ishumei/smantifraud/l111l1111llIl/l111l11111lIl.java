package com.ishumei.smantifraud.l111l1111llIl;

import android.util.Log;
import com.meituan.robust.Constants;
import java.util.Locale;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111lIl {
    public static String l1111l111111Il = "smsdk not init!";
    private static int l111l11111I1l = 5;
    private static boolean l111l11111lIl = false;

    private static String l1111l111111Il(String str, Object... objArr) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj instanceof String[]) {
                objArr[i10] = l1111l111111Il((String[]) obj);
            }
        }
        return Constants.ARRAY_TYPE + Thread.currentThread().getId() + "] " + String.format(Locale.US, str, objArr);
    }

    private static String l1111l111111Il(String[] strArr) {
        if (strArr.length == 0) {
            return t.f132643o;
        }
        StringBuilder sb2 = new StringBuilder(Constants.ARRAY_TYPE);
        int length = strArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(strArr[i10]);
            sb2.append(", ");
        }
        sb2.append(strArr[length]);
        sb2.append("]");
        return sb2.toString();
    }

    private static void l1111l111111Il(int i10) {
        l111l11111I1l = i10;
    }

    public static void l1111l111111Il(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 3) {
            return;
        }
        Log.d(str, l1111l111111Il(str2, objArr));
    }

    public static void l1111l111111Il(Throwable th2) {
        if (l111l11111lIl) {
            th2.printStackTrace();
        }
    }

    private static void l1111l111111Il(boolean z10) {
        l111l11111lIl = z10;
    }

    private static void l111l11111I1l(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 2) {
            return;
        }
        Log.v(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l11111Il(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 4) {
            return;
        }
        Log.i(str, l1111l111111Il(str2, objArr));
    }

    public static void l111l11111lIl(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 6) {
            return;
        }
        Log.e(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l1111l1Il(String str, String str2, Object... objArr) {
        if (!l111l11111lIl || l111l11111I1l > 5) {
            return;
        }
        Log.w(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l1111llIl(String str, String str2, Object... objArr) {
        if (l111l11111I1l <= 6) {
            Log.e(str, l1111l111111Il(str2, objArr));
        }
    }
}
