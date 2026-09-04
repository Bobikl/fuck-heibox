package com.apm.lite.k;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f40072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static File f40073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static File f40074d;

    public static File A(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "logcat.txt");
    }

    public static File B(Context context) {
        return new File(E(context), "apmlite/alogCrash");
    }

    public static File C(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "fds.txt");
    }

    public static File D(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "threads.txt");
    }

    public static String E(Context context) {
        if (TextUtils.isEmpty(f40071a)) {
            try {
                f40071a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e10) {
                f40071a = "/sdcard/";
                e10.printStackTrace();
            }
        }
        return f40071a;
    }

    public static File F(Context context) {
        return new File(E(context) + IOUtils.DIR_SEPARATOR_UNIX + "apmlite/CustomFile" + IOUtils.DIR_SEPARATOR_UNIX + com.apm.lite.e.l());
    }

    public static File G(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "meminfo.txt");
    }

    public static File H(Context context) {
        return new File(E(context), "apmlite/CustomFile");
    }

    public static File I(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "pthreads.txt");
    }

    public static File J(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "rountines.txt");
    }

    public static File K(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "leakd_threads.txt");
    }

    public static File L(File file) {
        return new File(file, "abortmsg.txt");
    }

    public static File a() {
        File file = f40073c;
        return file == null ? o(com.apm.lite.e.m()) : file;
    }

    public static File b(Context context) {
        return new File(E(context), "apmlite/CrashLogJava");
    }

    public static File c(Context context, String str) {
        return new File(E(context) + IOUtils.DIR_SEPARATOR_UNIX + "apmlite/CrashCommonLog" + IOUtils.DIR_SEPARATOR_UNIX + str);
    }

    public static File d(File file) {
        return new File(file, "flog.txt");
    }

    public static File e(File file, String str) {
        return new File(file, file.getName() + str);
    }

    public static File f(String str) {
        return new File(c(com.apm.lite.e.m(), str), "fds.txt");
    }

    public static File g(Context context) {
        return new File(E(context), "apmlite/CrashLogSimple");
    }

    public static File h(Context context, String str) {
        return new File(E(context) + IOUtils.DIR_SEPARATOR_UNIX + "apmlite/CustomFile" + IOUtils.DIR_SEPARATOR_UNIX + str);
    }

    public static File i(File file) {
        return new File(file, "tombstone.txt");
    }

    public static File j(String str) {
        return new File(c(com.apm.lite.e.m(), str), "threads.txt");
    }

    public static String k() {
        return "anr_" + com.apm.lite.e.k();
    }

    public static File l(Context context) {
        return new File(E(context), "apmlite/RuntimeContext");
    }

    public static File m(File file) {
        return new File(file, "header.bin");
    }

    public static File n(String str) {
        return new File(c(com.apm.lite.e.m(), str), "meminfo.txt");
    }

    public static File o(Context context) {
        if (f40073c == null) {
            if (context == null) {
                context = com.apm.lite.e.m();
            }
            f40073c = new File(E(context), "apmlite/CrashLogNative");
        }
        return f40073c;
    }

    public static File p(File file) {
        return new File(c(com.apm.lite.e.m(), file.getName()), "maps.txt");
    }

    public static File q(String str) {
        return new File(c(com.apm.lite.e.m(), str), "pthreads.txt");
    }

    public static File r(Context context) {
        if (f40074d == null) {
            f40074d = new File(E(context) + IOUtils.DIR_SEPARATOR_UNIX + "apmlite/CrashCommonLog" + IOUtils.DIR_SEPARATOR_UNIX + com.apm.lite.e.l());
        }
        return f40074d;
    }

    public static File s(File file) {
        return new File(file, "callback.json");
    }

    public static File t(String str) {
        return new File(c(com.apm.lite.e.m(), str), "rountines.txt");
    }

    public static File u(Context context) {
        return new File(E(context), "apmlite/CrashCommonLog");
    }

    public static File v(File file) {
        return new File(file, "upload.json");
    }

    public static File w(String str) {
        return new File(c(com.apm.lite.e.m(), str), "leakd_threads.txt");
    }

    public static File x(Context context) {
        return new File(E(context), "apmlite/issueCrashTimes");
    }

    public static File y(File file) {
        return new File(file, "javastack.txt");
    }

    public static File z(Context context) {
        return new File(E(context) + IOUtils.DIR_SEPARATOR_UNIX + "apmlite/issueCrashTimes" + IOUtils.DIR_SEPARATOR_UNIX + "current.times");
    }
}
