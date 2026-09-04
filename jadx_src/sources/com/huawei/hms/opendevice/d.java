package com.huawei.hms.opendevice;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: CommFun.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f61145a;

    private static String a() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                inputStreamReader.close();
                                fileInputStream.close();
                                return "";
                            }
                            String strTrim = line.trim();
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return strTrim;
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        inputStreamReader.close();
                        throw th4;
                    }
                    inputStreamReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            } catch (Throwable th6) {
                try {
                    fileInputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (IOException unused) {
            HMSLog.e("CommFun", "get current app processes IOException!");
            return "";
        } catch (Exception e10) {
            HMSLog.e("CommFun", "get current app processes exception!" + e10.getMessage());
            return "";
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f61145a)) {
            return f61145a;
        }
        String strB = b(context);
        f61145a = strB;
        if (!TextUtils.isEmpty(strB)) {
            return f61145a;
        }
        String strA = a();
        f61145a = strA;
        return strA;
    }

    private static String b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        if (activityManager == null) {
            return "";
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() == 0) {
            HMSLog.w("CommFun", "get running app processes null!");
            return "";
        }
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName != null) {
                HMSLog.i("CommFun", "info.pid -> " + runningAppProcessInfo.pid + ", info.processName -> " + runningAppProcessInfo.processName);
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static boolean b() {
        int i10 = HwBuildEx.VERSION.EMUI_SDK_INT;
        HMSLog.d("CommFun", "Emui Api Level:" + i10);
        return i10 > 0;
    }

    public static String c(Context context) {
        String parent;
        if (Build.VERSION.SDK_INT >= 24) {
            parent = context.createDeviceProtectedStorageContext().getDataDir() + "";
        } else {
            parent = context.getFilesDir().getParent();
        }
        if (TextUtils.isEmpty(parent)) {
            HMSLog.e("CommFun", "get storage root path of the current user failed.");
        }
        return parent;
    }

    public static long d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean e(Context context) {
        return b() && HwBuildEx.VERSION.EMUI_SDK_INT < 21 && d(context) < 110001400;
    }
}
