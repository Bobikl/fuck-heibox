package com.umeng.message.proguard;

import com.umeng.message.common.UPLog;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class bc {
    public static void a(byte[] bArr, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream2.write(bArr);
                f.a(gZIPOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                try {
                    UPLog.e("zip", th.getMessage());
                } finally {
                    f.a(gZIPOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void b(byte[] bArr, OutputStream outputStream) {
        GZIPInputStream gZIPInputStream = null;
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream2.read(bArr2);
                    if (i10 == -1) {
                        f.a(gZIPInputStream2);
                        return;
                    }
                    outputStream.write(bArr2, 0, i10);
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPInputStream = gZIPInputStream2;
                try {
                    UPLog.e("unzip", th.getMessage());
                } finally {
                    f.a(gZIPInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
