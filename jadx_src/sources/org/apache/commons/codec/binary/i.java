package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: BaseNCodecOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f132898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f132899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f132900d;

    public i(OutputStream outputStream, g gVar, boolean z10) {
        super(outputStream);
        this.f132900d = new byte[1];
        this.f132899c = gVar;
        this.f132898b = z10;
    }

    private void a(boolean z10) throws IOException {
        byte[] bArr;
        int iQ;
        int iB = this.f132899c.b();
        if (iB > 0 && (iQ = this.f132899c.q((bArr = new byte[iB]), 0, iB)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, iQ);
        }
        if (z10) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f132898b) {
            this.f132899c.f(this.f132900d, 0, -1);
        } else {
            this.f132899c.d(this.f132900d, 0, -1);
        }
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f132900d;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 < 0 || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 > bArr.length || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 > 0) {
            if (this.f132898b) {
                this.f132899c.f(bArr, i10, i11);
            } else {
                this.f132899c.d(bArr, i10, i11);
            }
            a(false);
        }
    }
}
