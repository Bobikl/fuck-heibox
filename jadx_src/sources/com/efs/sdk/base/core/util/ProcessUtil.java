package com.efs.sdk.base.core.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ProcessUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f42557a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<Integer> f42558b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f42559c = -1;

    public static String getCurrentProcessName() {
        String str = f42557a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String processName = getProcessName(Process.myPid());
        f42557a = processName;
        return processName;
    }

    public static String getProcessName(int i10) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i10 + "/cmdline")));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i11 = bufferedReader2.read();
                    if (i11 <= 0) {
                        sb2.trimToSize();
                        String string = sb2.toString();
                        try {
                            bufferedReader2.close();
                            return string;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return string;
                        }
                    }
                    sb2.append((char) i11);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                try {
                    Log.e("efs.base", "get process name error", th);
                    return "";
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static boolean isProcessExist(Context context, String str) {
        try {
            int i10 = Integer.parseInt(str);
            List<Integer> list = f42558b;
            boolean z10 = false;
            if (list != null && !list.isEmpty() && f42559c > 0 && System.currentTimeMillis() - f42559c <= 600000) {
                z10 = true;
            }
            if (!z10) {
                List<Integer> list2 = f42558b;
                if (list2 != null) {
                    list2.clear();
                } else {
                    f42558b = new ArrayList();
                }
                if (!TextUtils.isEmpty(getProcessName(Process.myPid()))) {
                    f42558b.add(Integer.valueOf(Process.myPid()));
                }
                if (!TextUtils.isEmpty(getProcessName(i10))) {
                    f42558b.add(Integer.valueOf(i10));
                }
                f42559c = System.currentTimeMillis();
            }
            return f42558b.contains(Integer.valueOf(i10));
        } catch (Throwable th2) {
            Log.e("efs.base", "Process exist judge error", th2);
            return true;
        }
    }

    public static int myPid() {
        return Process.myPid();
    }
}
