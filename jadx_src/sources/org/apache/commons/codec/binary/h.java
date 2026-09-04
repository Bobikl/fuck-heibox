package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: BaseNCodecInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f132895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f132896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f132897d;

    protected h(InputStream inputStream, g gVar, boolean z10) {
        super(inputStream);
        this.f132897d = new byte[1];
        this.f132895b = z10;
        this.f132896c = gVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = read(this.f132897d, 0, 1);
        while (i10 == 0) {
            i10 = read(this.f132897d, 0, 1);
        }
        if (i10 <= 0) {
            return -1;
        }
        byte b10 = this.f132897d[0];
        return b10 < 0 ? b10 + 256 : b10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 < 0 || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 > bArr.length || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int iQ = 0;
        while (iQ == 0) {
            if (!this.f132896c.l()) {
                byte[] bArr2 = new byte[this.f132895b ? 4096 : 8192];
                int i12 = ((FilterInputStream) this).in.read(bArr2);
                if (this.f132895b) {
                    this.f132896c.f(bArr2, 0, i12);
                } else {
                    this.f132896c.d(bArr2, 0, i12);
                }
            }
            iQ = this.f132896c.q(bArr, i10, i11);
        }
        return iQ;
    }
}
