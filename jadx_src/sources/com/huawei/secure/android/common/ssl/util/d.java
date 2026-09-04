package com.huawei.secure.android.common.ssl.util;

import android.database.Cursor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63052a = "IOUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f63053b = 4096;

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return a(inputStream, outputStream, new byte[4096]);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static InputStream a(byte[] bArr) throws IOException {
        return new ByteArrayInputStream(bArr);
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                e.b(f63052a, "closeSecure IOException");
            }
        }
    }

    public static void a(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        e.b(f63052a, "deleteSecure exception");
    }

    public static void a(InputStream inputStream) {
        a((Closeable) inputStream);
    }

    public static void a(OutputStream outputStream) {
        a((Closeable) outputStream);
    }

    public static void a(Reader reader) {
        a((Closeable) reader);
    }

    public static void a(Writer writer) {
        a((Closeable) writer);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(new File(str));
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
