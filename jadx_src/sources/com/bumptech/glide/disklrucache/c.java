package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f40647g = 13;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f40648h = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f40649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Charset f40650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f40651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40653f;

    /* JADX INFO: compiled from: StrictLineReader.java */
    public class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, c.this.f40650c.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f40655a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f40649b = inputStream;
        this.f40650c = charset;
        this.f40651d = new byte[i10];
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f40649b;
        byte[] bArr = this.f40651d;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f40652e = 0;
        this.f40653f = i10;
    }

    public boolean c() {
        return this.f40653f == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f40649b) {
            if (this.f40651d != null) {
                this.f40651d = null;
                this.f40649b.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public String d() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f40649b) {
            if (this.f40651d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f40652e >= this.f40653f) {
                b();
            }
            for (int i12 = this.f40652e; i12 != this.f40653f; i12++) {
                byte[] bArr2 = this.f40651d;
                if (bArr2[i12] == 10) {
                    int i13 = this.f40652e;
                    if (i12 != i13) {
                        i11 = i12 - 1;
                        if (bArr2[i11] != 13) {
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                    }
                    String str = new String(bArr2, i13, i11 - i13, this.f40650c.name());
                    this.f40652e = i12 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f40653f - this.f40652e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f40651d;
                int i14 = this.f40652e;
                aVar.write(bArr3, i14, this.f40653f - i14);
                this.f40653f = -1;
                b();
                i10 = this.f40652e;
                while (i10 != this.f40653f) {
                    bArr = this.f40651d;
                    if (bArr[i10] == 10) {
                        break loop1;
                    }
                    i10++;
                }
            }
            int i15 = this.f40652e;
            if (i10 != i15) {
                aVar.write(bArr, i15, i10 - i15);
            }
            this.f40652e = i10 + 1;
            return aVar.toString();
        }
    }
}
