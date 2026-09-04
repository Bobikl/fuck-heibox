package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: TeeOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class n2 extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f136874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f136875c;

    public n2(OutputStream outputStream, OutputStream outputStream2) {
        this.f136874b = outputStream;
        this.f136875c = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f136874b.close();
        } finally {
            this.f136875c.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f136874b.flush();
        this.f136875c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f136874b.write(i10);
        this.f136875c.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f136874b.write(bArr);
        this.f136875c.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f136874b.write(bArr, i10, i11);
        this.f136875c.write(bArr, i10, i11);
    }
}
