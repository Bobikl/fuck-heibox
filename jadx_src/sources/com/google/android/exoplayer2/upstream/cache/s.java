package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.u0;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ReusableBufferedOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s extends BufferedOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51070b;

    public s(OutputStream outputStream) {
        super(outputStream);
    }

    public s(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public void a(OutputStream outputStream) {
        com.google.android.exoplayer2.util.a.i(this.f51070b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f51070b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f51070b = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            u0.n1(th);
        }
    }
}
