package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MultiInputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class y extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<? extends f> f58721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private InputStream f58722c;

    public y(Iterator<? extends f> it) throws IOException {
        this.f58721b = (Iterator) com.google.common.base.w.E(it);
        a();
    }

    private void a() throws IOException {
        close();
        if (this.f58721b.hasNext()) {
            this.f58722c = this.f58721b.next().m();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f58722c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f58722c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f58722c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f58722c;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read();
            if (i10 != -1) {
                return i10;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        com.google.common.base.w.E(bArr);
        while (true) {
            InputStream inputStream = this.f58722c;
            if (inputStream == null) {
                return -1;
            }
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                return i12;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        InputStream inputStream = this.f58722c;
        if (inputStream == null || j10 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j10);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f58722c.skip(j10 - 1) + 1;
    }
}
