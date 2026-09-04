package com.tencent.liteav.videoconsumer.decoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f100542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f100543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f100544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f100545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final OutputStream f100546f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100548h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f100541a = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f100547g = new int[8];

    public b(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f100543c = inputStream;
        this.f100546f = outputStream;
        this.f100544d = inputStream.read();
        this.f100545e = inputStream.read();
    }

    private void a(long j10, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            f(((int) (j10 >> ((i10 - i11) - 1))) & 1);
        }
    }

    private int c(boolean z10) throws IOException {
        if (this.f100542b == 8) {
            f();
            if (this.f100544d == -1) {
                return -1;
            }
        }
        int i10 = this.f100544d;
        int i11 = this.f100542b;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.f100542b = i11 + 1;
        if (z10 && this.f100546f != null) {
            f(i12);
        }
        return i12;
    }

    private long e(int i10) throws IOException {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long jC = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            jC = (jC << 1) | ((long) c(true));
        }
        return jC;
    }

    private void f() throws IOException {
        this.f100544d = this.f100545e;
        this.f100545e = this.f100543c.read();
        this.f100542b = 0;
    }

    private void f(int i10) throws IOException {
        if (this.f100548h == 8) {
            this.f100548h = 0;
            h();
        }
        int[] iArr = this.f100547g;
        int i11 = this.f100548h;
        this.f100548h = i11 + 1;
        iArr[i11] = i10;
    }

    private int g() throws IOException {
        int i10 = 0;
        while (c(true) == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i10) - 1)) + e(i10));
    }

    private void h() throws IOException {
        int[] iArr = this.f100547g;
        this.f100546f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public final long a() throws IOException {
        long jE = e(8);
        String.valueOf(jE);
        return jE;
    }

    public final void a(int i10) throws IOException {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            c(true);
        }
    }

    public final boolean a(boolean z10) throws IOException {
        return c(z10) == 1;
    }

    public final int b() throws IOException {
        int i10 = 0;
        while (c(false) == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long jC = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            jC = (jC << 1) | ((long) c(false));
        }
        return (int) (((long) ((1 << i10) - 1)) + jC);
    }

    public final void b(int i10) throws IOException {
        a(i10);
    }

    public final void b(boolean z10) throws IOException {
        f(z10 ? 1 : 0);
    }

    public final int c() throws IOException {
        int iG = g();
        String.valueOf(iG);
        return iG;
    }

    public final void c(int i10) throws IOException {
        int[] iArr = new int[i10];
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                int iG = g();
                int i14 = iG & 1;
                int i15 = ((iG >> 1) + i14) * ((i14 << 1) - 1);
                String.valueOf(i15);
                i11 = ((i15 + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
            iArr[i13] = i12;
        }
    }

    public final void d() throws IOException {
        int i10 = 0;
        while (c(true) == 0) {
            i10++;
        }
        if (i10 > 0) {
            a(i10);
        }
    }

    public final void d(int i10) throws IOException {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 15) {
            int i14 = (1 << i12) + i13;
            if (i10 < i14) {
                i11 = i12;
                break;
            } else {
                i12++;
                i13 = i14;
            }
        }
        a(0L, i11);
        f(1);
        a(i10 - i13, i11);
    }

    public final void e() throws IOException {
        f(1);
        a(0L, 8 - this.f100548h);
        for (int i10 = this.f100548h; i10 < 8; i10++) {
            this.f100547g[i10] = 0;
        }
        this.f100548h = 0;
        h();
    }
}
