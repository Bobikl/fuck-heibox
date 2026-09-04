package com.bumptech.glide.util;

import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: ExceptionPassthroughInputStream.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("POOL")
    private static final Queue<e> f41990d = o.g(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f41991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f41992c;

    e() {
    }

    static void a() {
        synchronized (f41990d) {
            while (true) {
                Queue<e> queue = f41990d;
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
    }

    @n0
    public static e c(@n0 InputStream inputStream) {
        e eVarPoll;
        Queue<e> queue = f41990d;
        synchronized (queue) {
            eVarPoll = queue.poll();
        }
        if (eVarPoll == null) {
            eVarPoll = new e();
        }
        eVarPoll.d(inputStream);
        return eVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f41991b.available();
    }

    @p0
    public IOException b() {
        return this.f41992c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41991b.close();
    }

    void d(@n0 InputStream inputStream) {
        this.f41991b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f41991b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f41991b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f41991b.read();
        } catch (IOException e10) {
            this.f41992c = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f41991b.read(bArr);
        } catch (IOException e10) {
            this.f41992c = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f41991b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f41992c = e10;
            throw e10;
        }
    }

    public void release() {
        this.f41992c = null;
        this.f41991b = null;
        Queue<e> queue = f41990d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f41991b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f41991b.skip(j10);
        } catch (IOException e10) {
            this.f41992c = e10;
            throw e10;
        }
    }
}
