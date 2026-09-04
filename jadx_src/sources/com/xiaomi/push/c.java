package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106901a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final OutputStream f227a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final byte[] f228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106902b;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f227a = outputStream;
        this.f228a = bArr;
        this.f106902b = 0;
        this.f106901a = bArr.length;
    }

    private c(byte[] bArr, int i10, int i11) {
        this.f227a = null;
        this.f228a = bArr;
        this.f106902b = i10;
        this.f106901a = i10 + i11;
    }

    public static int a(int i10) {
        if (i10 >= 0) {
            return d(i10);
        }
        return 10;
    }

    public static int a(int i10, int i11) {
        return c(i10) + a(i11);
    }

    public static int a(int i10, long j10) {
        return c(i10) + a(j10);
    }

    public static int a(int i10, com.xiaomi.push.a aVar) {
        return c(i10) + a(aVar);
    }

    public static int a(int i10, e eVar) {
        return c(i10) + a(eVar);
    }

    public static int a(int i10, String str) {
        return c(i10) + a(str);
    }

    public static int a(int i10, boolean z10) {
        return c(i10) + a(z10);
    }

    public static int a(long j10) {
        return c(j10);
    }

    public static int a(com.xiaomi.push.a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int a(e eVar) {
        int iB = eVar.b();
        return d(iB) + iB;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(boolean z10) {
        return 1;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i10) {
        return new c(outputStream, new byte[i10]);
    }

    public static c a(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int b(int i10) {
        return d(i10);
    }

    public static int b(int i10, int i11) {
        return c(i10) + b(i11);
    }

    public static int b(int i10, long j10) {
        return c(i10) + b(j10);
    }

    public static int b(long j10) {
        return c(j10);
    }

    public static int c(int i10) {
        return d(f.a(i10, 0));
    }

    public static int c(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private void c() throws IOException {
        OutputStream outputStream = this.f227a;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f228a, 0, this.f106902b);
        this.f106902b = 0;
    }

    public static int d(int i10) {
        if ((i10 & n5.a.f132012g) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public int a() {
        if (this.f227a == null) {
            return this.f106901a - this.f106902b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m196a() throws IOException {
        if (this.f227a != null) {
            c();
        }
    }

    public void a(byte b10) throws IOException {
        if (this.f106902b == this.f106901a) {
            c();
        }
        byte[] bArr = this.f228a;
        int i10 = this.f106902b;
        this.f106902b = i10 + 1;
        bArr[i10] = b10;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m197a(int i10) throws IOException {
        if (i10 >= 0) {
            m216d(i10);
        } else {
            m215c(i10);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m198a(int i10, int i11) throws IOException {
        c(i10, 0);
        m197a(i11);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m199a(int i10, long j10) throws IOException {
        c(i10, 0);
        m204a(j10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m200a(int i10, com.xiaomi.push.a aVar) throws IOException {
        c(i10, 2);
        m205a(aVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m201a(int i10, e eVar) throws IOException {
        c(i10, 2);
        m206a(eVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m202a(int i10, String str) throws IOException {
        c(i10, 2);
        m207a(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m203a(int i10, boolean z10) throws IOException {
        c(i10, 0);
        m208a(z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m204a(long j10) throws IOException {
        m215c(j10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m205a(com.xiaomi.push.a aVar) throws IOException {
        byte[] bArrM140a = aVar.m140a();
        m216d(bArrM140a.length);
        a(bArrM140a);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m206a(e eVar) throws IOException {
        m216d(eVar.a());
        eVar.a(this);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m207a(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m216d(bytes.length);
        a(bytes);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m208a(boolean z10) throws IOException {
        m214c(z10 ? 1 : 0);
    }

    public void a(byte[] bArr) throws IOException {
        m209a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m209a(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f106901a;
        int i13 = this.f106902b;
        if (i12 - i13 >= i11) {
            System.arraycopy(bArr, i10, this.f228a, i13, i11);
            this.f106902b += i11;
            return;
        }
        int i14 = i12 - i13;
        System.arraycopy(bArr, i10, this.f228a, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f106902b = this.f106901a;
        c();
        if (i16 > this.f106901a) {
            this.f227a.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, this.f228a, 0, i16);
            this.f106902b = i16;
        }
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m210b(int i10) throws IOException {
        m216d(i10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m211b(int i10, int i11) throws IOException {
        c(i10, 0);
        m210b(i11);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m212b(int i10, long j10) throws IOException {
        c(i10, 0);
        m213b(j10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m213b(long j10) throws IOException {
        m215c(j10);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m214c(int i10) throws IOException {
        a((byte) i10);
    }

    public void c(int i10, int i11) throws IOException {
        m216d(f.a(i10, i11));
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m215c(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            m214c((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        m214c((int) j10);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public void m216d(int i10) throws IOException {
        while ((i10 & n5.a.f132012g) != 0) {
            m214c((i10 & 127) | 128);
            i10 >>>= 7;
        }
        m214c(i10);
    }
}
