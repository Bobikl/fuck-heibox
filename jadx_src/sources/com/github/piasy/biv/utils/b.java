package com.github.piasy.biv.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f43459a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f43460b = 2048;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43461c = -1;

    public static void a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int d(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jG = g(inputStream, outputStream);
        if (jG > 2147483647L) {
            return -1;
        }
        return (int) jG;
    }

    public static int e(Reader reader, Writer writer) throws IOException {
        long jI = i(reader, writer);
        if (jI > 2147483647L) {
            return -1;
        }
        return (int) jI;
    }

    public static long f(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        return h(inputStream, outputStream, new byte[i10]);
    }

    public static long g(InputStream inputStream, OutputStream outputStream) throws IOException {
        return f(inputStream, outputStream, 4096);
    }

    public static long h(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
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

    public static long i(Reader reader, Writer writer) throws IOException {
        return j(reader, writer, new char[4096]);
    }

    public static long j(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }
}
