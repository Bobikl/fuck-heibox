package com.umeng.socialize.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.Closeable;

/* JADX INFO: compiled from: Misc.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f106076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f106077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f106078c;

    public static Object a(Object obj, String str, int i10) {
        try {
            return ((PackageManager) obj).getPackageInfo(str, i10);
        } catch (Throwable th2) {
            if (!a.f106070c) {
                return null;
            }
            UMRTLog.e("MISC", "pkg:" + str + " failed:" + th2.getMessage());
            return null;
        }
    }

    public static String a() {
        if (TextUtils.isEmpty(f106076a)) {
            String str = Build.BRAND;
            f106076a = str;
            if (TextUtils.isEmpty(str)) {
                f106076a = Build.MANUFACTURER;
            }
        }
        return f106076a;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context) {
        return UMUtils.isMainProgress(context);
    }

    public static String b() {
        if (TextUtils.isEmpty(f106077b)) {
            f106077b = Build.MODEL;
        }
        return f106077b;
    }

    public static boolean b(Context context) {
        return UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }

    public static String c() {
        if (TextUtils.isEmpty(f106078c)) {
            f106078c = Build.BOARD;
        }
        return f106078c;
    }
}
