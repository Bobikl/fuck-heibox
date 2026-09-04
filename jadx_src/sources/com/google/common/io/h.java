package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CharSequenceReader.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class h extends Reader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private CharSequence f58679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58681d;

    public h(CharSequence charSequence) {
        this.f58679b = (CharSequence) com.google.common.base.w.E(charSequence);
    }

    private void a() throws IOException {
        if (this.f58679b == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean b() {
        return c() > 0;
    }

    private int c() {
        Objects.requireNonNull(this.f58679b);
        return this.f58679b.length() - this.f58680c;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f58679b = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i10) throws IOException {
        com.google.common.base.w.k(i10 >= 0, "readAheadLimit (%s) may not be negative", i10);
        a();
        this.f58681d = this.f58680c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        a();
        Objects.requireNonNull(this.f58679b);
        if (b()) {
            CharSequence charSequence = this.f58679b;
            int i10 = this.f58680c;
            this.f58680c = i10 + 1;
            iCharAt = charSequence.charAt(i10);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        com.google.common.base.w.E(charBuffer);
        a();
        Objects.requireNonNull(this.f58679b);
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), c());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f58679b;
            int i11 = this.f58680c;
            this.f58680c = i11 + 1;
            charBuffer.put(charSequence.charAt(i11));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i10, int i11) throws IOException {
        com.google.common.base.w.f0(i10, i10 + i11, cArr.length);
        a();
        Objects.requireNonNull(this.f58679b);
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(i11, c());
        for (int i12 = 0; i12 < iMin; i12++) {
            CharSequence charSequence = this.f58679b;
            int i13 = this.f58680c;
            this.f58680c = i13 + 1;
            cArr[i10 + i12] = charSequence.charAt(i13);
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        a();
        this.f58680c = this.f58681d;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j10) throws IOException {
        int iMin;
        com.google.common.base.w.p(j10 >= 0, "n (%s) may not be negative", j10);
        a();
        iMin = (int) Math.min(c(), j10);
        this.f58680c += iMin;
        return iMin;
    }
}
