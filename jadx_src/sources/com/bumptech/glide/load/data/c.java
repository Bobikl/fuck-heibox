package com.bumptech.glide.load.data;

import androidx.annotation.j1;
import androidx.annotation.n0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: BufferedOutputStream.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final OutputStream f40841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f40842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f40843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40844e;

    public c(@n0 OutputStream outputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, 65536);
    }

    @j1
    c(@n0 OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        this.f40841b = outputStream;
        this.f40843d = bVar;
        this.f40842c = (byte[]) bVar.c(i10, byte[].class);
    }

    private void a() throws IOException {
        int i10 = this.f40844e;
        if (i10 > 0) {
            this.f40841b.write(this.f40842c, 0, i10);
            this.f40844e = 0;
        }
    }

    private void b() throws IOException {
        if (this.f40844e == this.f40842c.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f40842c;
        if (bArr != null) {
            this.f40843d.put(bArr);
            this.f40842c = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f40841b.close();
            release();
        } catch (Throwable th2) {
            this.f40841b.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f40841b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f40842c;
        int i11 = this.f40844e;
        this.f40844e = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    @Override // java.io.OutputStream
    public void write(@n0 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@n0 byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f40844e;
            if (i15 == 0 && i13 >= this.f40842c.length) {
                this.f40841b.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f40842c.length - i15);
            System.arraycopy(bArr, i14, this.f40842c, this.f40844e, iMin);
            this.f40844e += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
