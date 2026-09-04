package com.tencent.liteav.base.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static long a(File file, int i10) {
        long jA = 0;
        if (i10 <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                jA += file2.isDirectory() ? a(file2, i10 - 1) : file2.length();
            }
        } catch (Exception e10) {
            LiteavLog.i("FileUtil", "getFolderSize exception " + e10.toString());
        }
        return jA;
    }

    public static File a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + File.separator + str);
        try {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception e10) {
            LiteavLog.e("FileUtil", "mkdirs failed.", e10);
        }
        return file;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }
}
