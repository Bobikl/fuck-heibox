package com.github.penfeizhou.animation.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends FilterInputStream implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43314b;

    public f(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // com.github.penfeizhou.animation.io.e
    public InputStream a() throws IOException {
        return this;
    }

    @Override // com.github.penfeizhou.animation.io.e
    public byte peek() throws IOException {
        byte b10 = (byte) read();
        this.f43314b++;
        return b10;
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int position() {
        return this.f43314b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.e
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        this.f43314b += Math.max(0, i12);
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.e
    public synchronized void reset() throws IOException {
        super.reset();
        this.f43314b = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.e
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        this.f43314b = (int) (((long) this.f43314b) + jSkip);
        return jSkip;
    }
}
