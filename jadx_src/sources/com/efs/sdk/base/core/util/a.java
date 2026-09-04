package com.efs.sdk.base.core.util;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f42560a = "efs";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f42561b;

    public static File a(Context context) {
        File dir = context.getDir(f42560a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File a(Context context, String str) {
        return new File(g(context, str), "efs_cst");
    }

    public static void a(String str) {
        f42560a = str;
    }

    public static File b(Context context, String str) {
        return new File(g(context, str), "efs_config");
    }

    public static File c(Context context, String str) {
        return new File(g(context, str), "efs_flow");
    }

    public static File d(Context context, String str) {
        File file = new File(g(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File e(Context context, String str) {
        File file = new File(d(context, str), String.valueOf(ProcessUtil.myPid()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File f(Context context, String str) {
        File file = new File(g(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File g(Context context, String str) {
        if (f42561b == null) {
            synchronized (a.class) {
                if (f42561b == null) {
                    f42561b = a(context);
                }
            }
        }
        File file = new File(f42561b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
