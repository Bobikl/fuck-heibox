package com.umeng.analytics.pro;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes4.dex */
public class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f104415a = "OpenId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f104416b = false;

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

    public static void a(String str, Object... objArr) {
        if (f104416b) {
            Log.d("OpenId", e(str, objArr));
        }
    }

    public static void a(boolean z10) {
        Log.d("OpenId", "setDebug:" + z10);
        f104416b = z10;
    }

    public static void b(String str, Object... objArr) {
        if (f104416b) {
            Log.i("OpenId", e(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (f104416b) {
            Log.w("OpenId", e(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        if (f104416b) {
            Log.e("OpenId", e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
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
}
