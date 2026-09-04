package com.bumptech.glide.load.data;

import androidx.annotation.n0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ExifOrientationStream.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f40848d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f40849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f40850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f40851g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f40852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40853c;

    static {
        byte[] bArr = {-1, -31, 0, com.google.common.base.a.F, 69, org.apache.tools.tar.c.Q, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, com.google.common.base.a.f56668u, 0, 2, 0, 0, 0, 1, 0};
        f40849e = bArr;
        int length = bArr.length;
        f40850f = length;
        f40851g = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f40852b = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f40853c;
        if (i12 < 2 || i12 > (i11 = f40851g)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f40852b : f40849e[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f40853c++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@n0 byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f40853c;
        int i14 = f40851g;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f40852b;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f40849e, this.f40853c - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f40853c += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f40853c = (int) (((long) this.f40853c) + jSkip);
        }
        return jSkip;
    }
}
