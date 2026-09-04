package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
public class AvailableUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f60283a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f60284b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f60285c = false;

    public static boolean isInstallerLibExist(Context context) {
        Bundle bundle;
        Object obj;
        if (f60284b) {
            HMSLog.i("AvailableUtil", "installerInit exist: " + f60285c);
            return f60285c;
        }
        synchronized (f60283a) {
            if (!f60284b) {
                boolean z10 = false;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    HMSLog.e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");
                    try {
                        Class.forName("com.huawei.hms.update.manager.UpdateManager");
                        z10 = true;
                    } catch (ClassNotFoundException unused) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to find class UpdateManager.");
                    }
                    f60285c = z10;
                    f60284b = true;
                } else {
                    try {
                        try {
                            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("availableHMSCoreInstaller")) != null && String.valueOf(obj).equalsIgnoreCase("yes")) {
                                HMSLog.i("AvailableUtil", "available exist: true");
                                z10 = true;
                            }
                        } catch (RuntimeException e10) {
                            HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e10);
                        }
                    } catch (AndroidException unused2) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.");
                    }
                    f60285c = z10;
                    f60284b = true;
                }
                throw th;
            }
        }
        HMSLog.i("AvailableUtil", "available exist: " + f60285c);
        return f60285c;
    }
}
