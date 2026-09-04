package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.y1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f44988i = 65536;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44989j = 524288;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44990k = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.k f44992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f44993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f44994e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44997h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f44995f = new byte[65536];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f44991b = new byte[4096];

    static {
        y1.a("goog.exo.extractor");
    }

    public g(com.google.android.exoplayer2.upstream.k kVar, long j10, long j11) {
        this.f44992c = kVar;
        this.f44994e = j10;
        this.f44993d = j11;
    }

    private void A(int i10) {
        int i11 = this.f44997h - i10;
        this.f44997h = i11;
        this.f44996g = 0;
        byte[] bArr = this.f44995f;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f44995f = bArr2;
    }

    private void p(int i10) {
        if (i10 != -1) {
            this.f44994e += (long) i10;
        }
    }

    private void w(int i10) {
        int i11 = this.f44996g + i10;
        byte[] bArr = this.f44995f;
        if (i11 > bArr.length) {
            this.f44995f = Arrays.copyOf(this.f44995f, u0.s(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int x(byte[] bArr, int i10, int i11) {
        int i12 = this.f44997h;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f44995f, 0, bArr, i10, iMin);
        A(iMin);
        return iMin;
    }

    private int y(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f44992c.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int z(int i10) {
        int iMin = Math.min(this.f44997h, i10);
        A(iMin);
        return iMin;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public int c(int i10) throws IOException {
        int iZ = z(i10);
        if (iZ == 0) {
            byte[] bArr = this.f44991b;
            iZ = y(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        p(iZ);
        return iZ;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean f(int i10, boolean z10) throws IOException {
        int iZ = z(i10);
        while (iZ < i10 && iZ != -1) {
            iZ = y(this.f44991b, -iZ, Math.min(i10, this.f44991b.length + iZ), iZ, z10);
        }
        p(iZ);
        return iZ != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iX = x(bArr, i10, i11);
        while (iX < i11 && iX != -1) {
            iX = y(bArr, i10, i11, iX, z10);
        }
        p(iX);
        return iX != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public long getLength() {
        return this.f44993d;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public long getPosition() {
        return this.f44994e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.google.android.exoplayer2.extractor.l
    public <E extends Throwable> void i(long j10, E e10) throws Throwable {
        com.google.android.exoplayer2.util.a.a(j10 >= 0);
        this.f44994e = j10;
        throw e10;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public int j(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        w(i11);
        int i12 = this.f44997h;
        int i13 = this.f44996g;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = y(this.f44995f, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f44997h += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f44995f, this.f44996g, bArr, i10, iMin);
        this.f44996g += iMin;
        return iMin;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void l(byte[] bArr, int i10, int i11) throws IOException {
        n(bArr, i10, i11, false);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean n(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!u(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f44995f, this.f44996g - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void o() {
        this.f44996g = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public long q() {
        return this.f44994e + ((long) this.f44996g);
    }

    @Override // com.google.android.exoplayer2.extractor.l, com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iX = x(bArr, i10, i11);
        if (iX == 0) {
            iX = y(bArr, i10, i11, 0, true);
        }
        p(iX);
        return iX;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        g(bArr, i10, i11, false);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void s(int i10) throws IOException {
        u(i10, false);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void t(int i10) throws IOException {
        f(i10, false);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean u(int i10, boolean z10) throws IOException {
        w(i10);
        int iY = this.f44997h - this.f44996g;
        while (iY < i10) {
            iY = y(this.f44995f, this.f44996g, i10, iY, z10);
            if (iY == -1) {
                return false;
            }
            this.f44997h = this.f44996g + iY;
        }
        this.f44996g += i10;
        return true;
    }
}
