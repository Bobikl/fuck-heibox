package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import okio.Utf8;

/* JADX INFO: compiled from: UUEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class q2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f136892c = 644;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f136893d = 45;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f136894e = 4500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f136895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136896b;

    public q2(String str) {
        this.f136896b = str;
    }

    private void b() {
        e("begin 644 " + this.f136896b + "\n");
    }

    private void c() {
        e(" \nend\n");
    }

    private void d(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        byte b10;
        outputStream.write((byte) ((i11 & 63) + 32));
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            byte b11 = bArr[i12 + i10];
            byte b12 = 1;
            if (i13 < i11) {
                int i14 = i13 + 1;
                byte b13 = bArr[i13 + i10];
                if (i14 < i11) {
                    int i15 = i14 + 1;
                    b10 = bArr[i14 + i10];
                    b12 = b13;
                    i13 = i15;
                } else {
                    b12 = b13;
                    i13 = i14;
                    b10 = 1;
                }
            } else {
                b10 = 1;
            }
            byte b14 = (byte) (((b11 >>> 2) & 63) + 32);
            byte b15 = (byte) ((((b11 << 4) & 48) | ((b12 >>> 4) & 15)) + 32);
            byte b16 = (byte) ((((b12 << 2) & 60) | ((b10 >>> 6) & 3)) + 32);
            byte b17 = (byte) ((b10 & Utf8.REPLACEMENT_BYTE) + 32);
            outputStream.write(b14);
            outputStream.write(b15);
            outputStream.write(b16);
            outputStream.write(b17);
            i12 = i13;
        }
        outputStream.write(10);
    }

    private void e(String str) {
        PrintStream printStream = new PrintStream(this.f136895a);
        printStream.print(str);
        printStream.flush();
    }

    public void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f136895a = outputStream;
        b();
        byte[] bArr = new byte[4500];
        while (true) {
            int i10 = 0;
            int i11 = inputStream.read(bArr, 0, 4500);
            if (i11 == -1) {
                outputStream.flush();
                c();
                return;
            } else {
                while (i11 > 0) {
                    int i12 = i11 <= 45 ? i11 : 45;
                    d(bArr, i10, i12, outputStream);
                    i10 += i12;
                    i11 -= i12;
                }
            }
        }
    }
}
