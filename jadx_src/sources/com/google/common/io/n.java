package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: CountingInputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class n extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f58699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58700c;

    public n(InputStream inputStream) {
        super((InputStream) com.google.common.base.w.E(inputStream));
        this.f58700c = -1L;
    }

    public long a() {
        return this.f58699b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f58700c = this.f58699b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f58699b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f58699b += (long) i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f58700c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f58699b = this.f58700c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j10);
        this.f58699b += jSkip;
        return jSkip;
    }
}
