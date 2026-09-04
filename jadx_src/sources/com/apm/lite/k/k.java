package com.apm.lite.k;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes6.dex */
public final class k {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str, int i10) {
        com.apm.lite.f.a.b("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i10), -1, -1);
    }

    public static void c(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
