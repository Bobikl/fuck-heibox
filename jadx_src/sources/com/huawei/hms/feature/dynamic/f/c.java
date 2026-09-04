package com.huawei.hms.feature.dynamic.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60721a = "HMSPkgManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f60722b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60723c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60724d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60725e = 5;

    public static final class a extends ArrayList<String> {
        public a() {
            add("com.huawei.hwid");
            add("com.huawei.hwid.tv");
        }
    }

    public static final class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Field f60726a;

        public b(Field field) {
            this.f60726a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f60726a.setAccessible(true);
            return null;
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            Logger.e(f60721a, "The given context is null.");
            return false;
        }
        for (String str : f60722b) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                    Logger.i(f60721a, "The HMS Core is installed, pkgName:" + str);
                    return true;
                }
                continue;
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.w(f60721a, "Query for HMS Core package name:" + str + " failed.");
            }
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.e(f60721a, "context is null or filePath is null.");
            return false;
        }
        try {
            if (!new File(str).exists()) {
                Logger.w(f60721a, "the file does not exist.");
                return false;
            }
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath.startsWith("/system/app/HFF")) {
                Logger.i(f60721a, "HFF file path, need not to verify.");
                return true;
            }
            if (canonicalPath.startsWith("/data/data/")) {
                String[] strArrSplit = canonicalPath.split("/");
                if (strArrSplit.length >= 4) {
                    return b(context, strArrSplit[3]);
                }
            } else if (canonicalPath.startsWith("/data/user_de/") || canonicalPath.startsWith("/data/user/")) {
                String[] strArrSplit2 = canonicalPath.split("/");
                if (strArrSplit2.length >= 5) {
                    return b(context, strArrSplit2[4]);
                }
            } else {
                Logger.w(f60721a, "illegal path.");
            }
            return false;
        } catch (IOException unused) {
            Logger.e(f60721a, "checkPathValidity IOException");
        }
    }

    public static boolean b(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.e(f60721a, "context is null or pkgName is null.");
            return false;
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.e(f60721a, "get PrivAppFlag err for " + str + ":" + e10.getMessage());
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            Logger.i(f60721a, "Get pkg application null:" + str);
            return false;
        }
        try {
            Field field = applicationInfo.getClass().getField("privateFlags");
            AccessController.doPrivileged(new b(field));
            Object obj = field.get(applicationInfo);
            if (!(obj instanceof Integer)) {
                Logger.i(f60721a, "Get privFlag instance error.");
                return false;
            }
            int iIntValue = ((Integer) obj).intValue();
            Logger.d(f60721a, "privFlag of " + str + " is:" + iIntValue);
            boolean z10 = (iIntValue & 8) != 0;
            Logger.i(f60721a, "pkgName:" + str + ", isPrivApp:" + z10);
            return z10;
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            Logger.e(f60721a, "get Priv App Flag err for " + str + ":" + e11.getMessage());
            return false;
        }
    }

    public static boolean c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.w(f60721a, "context is null or pkgName is null.");
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
            boolean z10 = (packageInfo == null || (packageInfo.applicationInfo.flags & 1) == 0) ? false : true;
            Logger.i(f60721a, "isHMSSystemApp:" + z10);
            if (z10) {
                Logger.i(f60721a, "The HMS package:" + str + " is SystemApp");
                return true;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.e(f60721a, "getSystemApp flag error for " + str + ":" + e10.getMessage());
        }
        return false;
    }
}
