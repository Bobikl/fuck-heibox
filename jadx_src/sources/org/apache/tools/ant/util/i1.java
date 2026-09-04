package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

/* JADX INFO: compiled from: ReaderInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class i1 extends InputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f136811h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f136812i = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f136813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetEncoder f136814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharBuffer f136815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ByteBuffer f136816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CoderResult f136817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136818g;

    public i1(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    public i1(Reader reader, String str) {
        this(reader, Charset.forName(str));
    }

    public i1(Reader reader, Charset charset) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
    }

    public i1(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    public i1(Reader reader, CharsetEncoder charsetEncoder, int i10) {
        this.f136813b = reader;
        this.f136814c = charsetEncoder;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i10);
        this.f136815d = charBufferAllocate;
        charBufferAllocate.flip();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        this.f136816e = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    private void a() throws IOException {
        CoderResult coderResult;
        if (!this.f136818g && ((coderResult = this.f136817f) == null || coderResult.isUnderflow())) {
            this.f136815d.compact();
            int iPosition = this.f136815d.position();
            int i10 = this.f136813b.read(this.f136815d.array(), iPosition, this.f136815d.remaining());
            if (i10 == -1) {
                this.f136818g = true;
            } else {
                this.f136815d.position(iPosition + i10);
            }
            this.f136815d.flip();
        }
        this.f136816e.compact();
        this.f136817f = this.f136814c.encode(this.f136815d, this.f136816e, this.f136818g);
        this.f136816e.flip();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f136813b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f136816e.hasRemaining()) {
            a();
            if (this.f136818g && !this.f136816e.hasRemaining()) {
                return -1;
            }
        }
        return this.f136816e.get() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i11 < 0 || i10 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i10 + ", length=" + i11);
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i11 > 0) {
            if (!this.f136816e.hasRemaining()) {
                a();
                if (this.f136818g && !this.f136816e.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.f136816e.remaining(), i11);
                this.f136816e.get(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                i12 += iMin;
            }
        }
        if (i12 == 0 && this.f136818g) {
            return -1;
        }
        return i12;
    }
}
