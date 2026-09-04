package org.apache.tools.ant.util;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: LazyFileOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class v0 extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f136961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f136962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f136964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f136965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136966g;

    public v0(File file) {
        this(file, false);
    }

    public v0(File file, boolean z10) {
        this(file, z10, false);
    }

    public v0(File file, boolean z10, boolean z11) {
        this.f136965f = false;
        this.f136966g = false;
        this.f136962c = file;
        this.f136963d = z10;
        this.f136964e = z11;
    }

    public v0(String str) {
        this(str, false);
    }

    public v0(String str, boolean z10) {
        this(new File(str), z10);
    }

    private synchronized void a() throws IOException {
        if (this.f136966g) {
            throw new IOException(this.f136962c + " has already been closed.");
        }
        if (!this.f136965f) {
            this.f136961b = j0.h0(this.f136962c.toPath(), this.f136963d);
            this.f136965f = true;
        }
    }

    public void b() throws IOException {
        a();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f136964e && !this.f136966g) {
            a();
        }
        if (this.f136965f) {
            this.f136961b.close();
        }
        this.f136966g = true;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) throws IOException {
        a();
        this.f136961b.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        a();
        this.f136961b.write(bArr, i10, i11);
    }
}
