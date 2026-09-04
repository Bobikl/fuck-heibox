package com.google.common.hash;

import com.google.common.base.w;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: HashingInputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@o9.a
public final class n extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f58585b;

    public n(k kVar, InputStream inputStream) {
        super((InputStream) w.E(inputStream));
        this.f58585b = (m) w.E(kVar.i());
    }

    public HashCode a() {
        return this.f58585b.n();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @s9.a
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f58585b.b((byte) i10);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @s9.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f58585b.k(bArr, i10, i12);
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }
}
