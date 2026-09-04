package com.apm.lite.k;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class w {
    public static long a(File file) {
        try {
            return new StatFs(file.getPath()).getTotalBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", d());
            jSONObject.put("inner_total", f());
            jSONObject.put("sdcard_free", i());
            jSONObject.put("sdcard_total", j());
            jSONObject.put("inner_free_real", g());
            jSONObject.put("inner_total_real", h());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static boolean c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static long d() {
        try {
            return e(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long e(File file) {
        try {
            return new StatFs(file.getPath()).getFreeBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static long f() {
        try {
            return a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static long g() {
        try {
            return e(com.apm.lite.e.m().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static long h() {
        try {
            return a(com.apm.lite.e.m().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static long i() {
        try {
            if (c()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private static long j() {
        try {
            if (c()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
