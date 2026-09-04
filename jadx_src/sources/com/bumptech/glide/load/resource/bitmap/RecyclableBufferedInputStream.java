package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.j1;
import androidx.annotation.n0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile byte[] f41503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41508g;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, 65536);
    }

    @j1
    RecyclableBufferedInputStream(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        super(inputStream);
        this.f41506e = -1;
        this.f41508g = bVar;
        this.f41503b = (byte[]) bVar.c(i10, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f41506e;
        if (i10 != -1) {
            int i11 = this.f41507f - i10;
            int i12 = this.f41505d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f41504c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f41508g.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f41503b = bArr2;
                    this.f41508g.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f41507f - this.f41506e;
                this.f41507f = i13;
                this.f41506e = 0;
                this.f41504c = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f41507f;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f41504c = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f41506e = -1;
            this.f41507f = 0;
            this.f41504c = i16;
        }
        return i16;
    }

    private static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f41503b == null || inputStream == null) {
            throw c();
        }
        return (this.f41504c - this.f41507f) + inputStream.available();
    }

    public synchronized void b() {
        this.f41505d = this.f41503b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f41503b != null) {
            this.f41508g.put(this.f41503b);
            this.f41503b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f41505d = Math.max(this.f41505d, i10);
        this.f41506e = this.f41507f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f41503b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw c();
        }
        if (this.f41507f >= this.f41504c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f41503b && (bArr = this.f41503b) == null) {
            throw c();
        }
        int i10 = this.f41504c;
        int i11 = this.f41507f;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f41507f = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@n0 byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f41503b;
        if (bArr2 == null) {
            throw c();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw c();
        }
        int i14 = this.f41507f;
        int i15 = this.f41504c;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f41507f += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f41506e == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f41503b && (bArr2 = this.f41503b) == null) {
                    throw c();
                }
                int i17 = this.f41504c;
                int i18 = this.f41507f;
                i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f41507f += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }

    public synchronized void release() {
        if (this.f41503b != null) {
            this.f41508g.put(this.f41503b);
            this.f41503b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f41503b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f41506e;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f41507f + " markLimit: " + this.f41505d);
        }
        this.f41507f = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f41503b;
        if (bArr == null) {
            throw c();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw c();
        }
        int i10 = this.f41504c;
        int i11 = this.f41507f;
        if (i10 - i11 >= j10) {
            this.f41507f = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f41507f = i10;
        if (this.f41506e == -1 || j10 > this.f41505d) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f41506e = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f41504c;
        int i13 = this.f41507f;
        if (i12 - i13 >= j10 - j11) {
            this.f41507f = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f41507f = i12;
        return j12;
    }
}
