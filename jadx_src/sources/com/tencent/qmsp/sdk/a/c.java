package com.tencent.qmsp.sdk.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import androidx.core.view.q0;
import java.io.File;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static int a() {
        try {
            String str = com.tencent.qmsp.sdk.app.a.getContext().getPackageManager().getPackageInfo(com.tencent.qmsp.sdk.app.a.getContext().getPackageName(), 0).packageName;
            ApplicationInfo applicationInfo = com.tencent.qmsp.sdk.app.a.getContext().getApplicationInfo();
            if (applicationInfo.packageName.equals(str)) {
                return Integer.valueOf((int) new File(applicationInfo.publicSourceDir).length()).intValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0;
    }

    public static String a(int i10) {
        return String.format("%d.%d.%d", Integer.valueOf(i10 >> 24), Integer.valueOf((16711680 & i10) >> 16), Integer.valueOf((i10 & q0.f21790f) >> 8));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.tencent.qmsp.sdk.f.e.a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String b() {
        try {
            String packageName = com.tencent.qmsp.sdk.app.a.getContext().getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return null;
            }
            return packageName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c() {
        try {
            PackageInfo packageInfo = com.tencent.qmsp.sdk.app.a.getContext().getPackageManager().getPackageInfo(com.tencent.qmsp.sdk.app.a.getContext().getPackageName(), 0);
            if (TextUtils.isEmpty(packageInfo.versionName)) {
                return null;
            }
            return packageInfo.versionName.replaceAll("[^0-9.]", "");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String d() {
        return a(512);
    }

    public static String e() {
        try {
            return com.tencent.qmsp.sdk.c.b.f101771c;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f() {
        PackageInfo packageInfo;
        try {
            packageInfo = com.tencent.qmsp.sdk.app.a.getContext().getPackageManager().getPackageInfo(com.tencent.qmsp.sdk.app.a.getContext().getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            packageInfo = null;
        }
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr.length <= 0) {
            return "";
        }
        try {
            return com.tencent.qmsp.sdk.f.e.a(MessageDigest.getInstance("MD5").digest(signatureArr[0].toByteArray()));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static int g() {
        int i10;
        String str;
        try {
            String[] strArrSplit = c().split("\\.");
            if (strArrSplit.length != 2) {
                if (strArrSplit.length == 3) {
                    i10 = (Integer.parseInt(strArrSplit[0]) << 24) | 0 | (Integer.parseInt(strArrSplit[1]) << 16);
                    str = strArrSplit[2];
                }
                return 0;
            }
            i10 = (Integer.parseInt(strArrSplit[0]) << 16) | 0;
            str = strArrSplit[1];
            return (Integer.parseInt(str) << 8) | i10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean h() {
        String property = System.getProperty("os.arch");
        return property != null && property.contains("64");
    }
}
