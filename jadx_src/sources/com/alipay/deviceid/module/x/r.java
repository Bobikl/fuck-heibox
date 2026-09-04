package com.alipay.deviceid.module.x;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: compiled from: PublicStorage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r {
    public static String a(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (Throwable unused) {
            property = "";
        }
        if (!e.a(property)) {
            return property;
        }
        return s.a(".SystemConfig" + File.separator + str);
    }

    public static void a(String str, String str2) {
        FileWriter fileWriter;
        Throwable th2;
        try {
            if (!e.a(str2)) {
                System.setProperty(str, str2);
            }
        } catch (Throwable unused) {
        }
        if (!s.a()) {
            return;
        }
        String str3 = ".SystemConfig" + File.separator + str;
        try {
            if (!s.a()) {
                return;
            }
            File file = new File(Environment.getExternalStorageDirectory(), str3);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            }
            FileWriter fileWriter2 = null;
            try {
                fileWriter = new FileWriter(new File(file.getAbsolutePath()), false);
                try {
                    fileWriter.write(str2);
                    try {
                        fileWriter.close();
                    } catch (IOException unused2) {
                    }
                } catch (Exception unused3) {
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        fileWriter2.close();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception unused5) {
            } catch (Throwable th4) {
                fileWriter = null;
                th2 = th4;
            }
        } catch (IOException | Exception unused6) {
        }
    }
}
