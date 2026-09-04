package com.alipay.deviceid.module.x;

import android.os.Environment;
import java.io.File;

/* JADX INFO: compiled from: SDCardStorage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s {
    public static String a(String str) {
        try {
            if (!a()) {
                return null;
            }
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            if (new File(absolutePath, str).exists()) {
                return f.a(absolutePath, str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }
}
