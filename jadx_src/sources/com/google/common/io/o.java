package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: CountingOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class o extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f58701b;

    public o(OutputStream outputStream) {
        super((OutputStream) com.google.common.base.w.E(outputStream));
    }

    public long a() {
        return this.f58701b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        this.f58701b++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f58701b += (long) i11;
    }
}
