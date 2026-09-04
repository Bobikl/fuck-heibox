package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class z {
    public static long a() {
        File externalStorageDirectory;
        if (!b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m781a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return true;
        }
    }

    public static boolean b() {
        try {
            return true ^ Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e10) {
            Log.e("XMPush-", "check SDCard is busy: " + e10);
            return true;
        }
    }

    public static boolean c() {
        return a() <= 102400;
    }

    public static boolean d() {
        return (b() || c() || m781a()) ? false : true;
    }
}
