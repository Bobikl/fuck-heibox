package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f51165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f51166c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51170g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51168e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51169f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f51167d = new byte[1];

    public p(o oVar, r rVar) {
        this.f51165b = oVar;
        this.f51166c = rVar;
    }

    private void b() throws IOException {
        if (this.f51168e) {
            return;
        }
        this.f51165b.a(this.f51166c);
        this.f51168e = true;
    }

    public long a() {
        return this.f51170g;
    }

    public void c() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f51169f) {
            return;
        }
        this.f51165b.close();
        this.f51169f = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f51167d) == -1) {
            return -1;
        }
        return this.f51167d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        com.google.android.exoplayer2.util.a.i(!this.f51169f);
        b();
        int i12 = this.f51165b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f51170g += (long) i12;
        return i12;
    }
}
