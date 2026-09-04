package com.google.common.hash;

import com.google.common.base.w;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: HashingOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@o9.a
public final class o extends FilterOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f58586b;

    public o(k kVar, OutputStream outputStream) {
        super((OutputStream) w.E(outputStream));
        this.f58586b = (m) w.E(kVar.i());
    }

    public HashCode a() {
        return this.f58586b.n();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f58586b.b((byte) i10);
        ((FilterOutputStream) this).out.write(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f58586b.k(bArr, i10, i11);
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }
}
