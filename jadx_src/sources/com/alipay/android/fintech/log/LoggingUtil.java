package com.alipay.android.fintech.log;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class LoggingUtil {
    public static byte[] gzipDataByBytes(byte[] bArr, int i10, int i11) throws IllegalStateException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr, i10, i11);
                gZIPOutputStream2.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    gZIPOutputStream2.close();
                } catch (Throwable unused) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                try {
                    throw new IllegalStateException(th);
                } catch (Throwable th3) {
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th3;
                    } catch (Throwable unused4) {
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] gzipDataByString(String str) throws IllegalStateException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return gzipDataByBytes(bytes, 0, bytes.length);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2);
        }
    }
}
