package com.bumptech.glide.util;

import androidx.annotation.n0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: MarkEnforcingInputStream.java */
/* JADX INFO: loaded from: classes6.dex */
public class k extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42005c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42006d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42007b;

    public k(@n0 InputStream inputStream) {
        super(inputStream);
        this.f42007b = Integer.MIN_VALUE;
    }

    private long a(long j10) {
        int i10 = this.f42007b;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    private void b(long j10) {
        int i10 = this.f42007b;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f42007b = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i10 = this.f42007b;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f42007b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        b(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@n0 byte[] bArr, int i10, int i11) throws IOException {
        int iA = (int) a(i11);
        if (iA == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iA);
        b(i12);
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f42007b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jA = a(j10);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }
}
