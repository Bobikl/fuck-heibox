package cn.fly.verify;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class fo extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f36589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fv f36591c;

    public fo(InputStream inputStream) {
        this.f36589a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f36589a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36589a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f36589a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f36589a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f36589a.read();
        if (i10 >= 0) {
            long j10 = this.f36590b + 1;
            this.f36590b = j10;
            fv fvVar = this.f36591c;
            if (fvVar != null) {
                fvVar.a(j10);
            }
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f36589a.read(bArr, i10, i11);
        if (i12 > 0) {
            long j10 = this.f36590b + ((long) i12);
            this.f36590b = j10;
            fv fvVar = this.f36591c;
            if (fvVar != null) {
                fvVar.a(j10);
            }
        }
        return i12;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f36589a.reset();
        this.f36590b = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        return this.f36589a.skip(j10);
    }
}
