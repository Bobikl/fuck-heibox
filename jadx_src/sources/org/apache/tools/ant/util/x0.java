package org.apache.tools.ant.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: LineOrientedOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x0 extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f136978d = 132;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f136979e = 13;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f136980f = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteArrayOutputStream f136981b = new ByteArrayOutputStream(132);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136982c = false;

    protected void a() throws IOException {
        try {
            c(this.f136981b.toByteArray());
        } finally {
            this.f136981b.reset();
        }
    }

    protected abstract void b(String str) throws IOException;

    protected void c(byte[] bArr) throws IOException {
        b(new String(bArr));
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f136981b.size() > 0) {
            a();
        }
        super.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (b10 != 10 && b10 != 13) {
            this.f136981b.write(i10);
        } else if (!this.f136982c) {
            a();
        }
        this.f136982c = b10 == 13;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        byte b10;
        while (i11 > 0) {
            int i12 = i10;
            while (i11 > 0 && (b10 = bArr[i12]) != 10 && b10 != 13) {
                i12++;
                i11--;
            }
            int i13 = i12 - i10;
            if (i13 > 0) {
                this.f136981b.write(bArr, i10, i13);
            }
            i10 = i12;
            while (i11 > 0) {
                byte b11 = bArr[i10];
                if (b11 != 10 && b11 != 13) {
                    break;
                }
                write(b11);
                i10++;
                i11--;
            }
        }
    }
}
