package com.bumptech.glide.util;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: ExceptionCatchingInputStream.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class d extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Queue<d> f41987d = o.g(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f41988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f41989c;

    d() {
    }

    static void a() {
        while (true) {
            Queue<d> queue = f41987d;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @n0
    public static d c(@n0 InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f41987d;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.d(inputStream);
        return dVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f41988b.available();
    }

    @p0
    public IOException b() {
        return this.f41989c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41988b.close();
    }

    void d(@n0 InputStream inputStream) {
        this.f41988b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f41988b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f41988b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f41988b.read();
        } catch (IOException e10) {
            this.f41989c = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f41988b.read(bArr);
        } catch (IOException e10) {
            this.f41989c = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f41988b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f41989c = e10;
            return -1;
        }
    }

    public void release() {
        this.f41989c = null;
        this.f41988b = null;
        Queue<d> queue = f41987d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f41988b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f41988b.skip(j10);
        } catch (IOException e10) {
            this.f41989c = e10;
            return 0L;
        }
    }
}
