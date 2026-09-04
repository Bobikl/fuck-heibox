package com.google.common.io;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: compiled from: ReaderInputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class c0 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f58647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetEncoder f58648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f58649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharBuffer f58650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f58651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f58653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f58654i;

    c0(Reader reader, Charset charset, int i10) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i10);
    }

    c0(Reader reader, CharsetEncoder charsetEncoder, int i10) {
        this.f58649d = new byte[1];
        this.f58647b = (Reader) com.google.common.base.w.E(reader);
        this.f58648c = (CharsetEncoder) com.google.common.base.w.E(charsetEncoder);
        com.google.common.base.w.k(i10 > 0, "bufferSize must be positive: %s", i10);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i10);
        this.f58650e = charBufferAllocate;
        s.b(charBufferAllocate);
        this.f58651f = ByteBuffer.allocate(i10);
    }

    private static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int b(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f58651f.remaining());
        this.f58651f.get(bArr, i10, iMin);
        return iMin;
    }

    private static CharBuffer c(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        s.e(charBufferWrap, charBuffer.position());
        s.c(charBufferWrap, charBuffer.limit());
        return charBufferWrap;
    }

    private void d() throws IOException {
        if (a(this.f58650e) == 0) {
            if (this.f58650e.position() > 0) {
                s.b(this.f58650e.compact());
            } else {
                this.f58650e = c(this.f58650e);
            }
        }
        int iLimit = this.f58650e.limit();
        int i10 = this.f58647b.read(this.f58650e.array(), iLimit, a(this.f58650e));
        if (i10 == -1) {
            this.f58652g = true;
        } else {
            s.c(this.f58650e, iLimit + i10);
        }
    }

    private void e(boolean z10) {
        s.b(this.f58651f);
        if (z10 && this.f58651f.remaining() == 0) {
            this.f58651f = ByteBuffer.allocate(this.f58651f.capacity() * 2);
        } else {
            this.f58653h = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f58647b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f58649d) == 1) {
            return UnsignedBytes.p(this.f58649d[0]);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        CoderResult coderResultFlush;
        com.google.common.base.w.f0(i10, i10 + i11, bArr.length);
        if (i11 == 0) {
            return 0;
        }
        boolean z10 = this.f58652g;
        int iB = 0;
        while (true) {
            if (this.f58653h) {
                iB += b(bArr, i10 + iB, i11 - iB);
                if (iB == i11 || this.f58654i) {
                    break;
                }
                this.f58653h = false;
                s.a(this.f58651f);
            }
            while (true) {
                if (this.f58654i) {
                    coderResultFlush = CoderResult.UNDERFLOW;
                } else {
                    coderResultFlush = z10 ? this.f58648c.flush(this.f58651f) : this.f58648c.encode(this.f58650e, this.f58651f, this.f58652g);
                }
                if (coderResultFlush.isOverflow()) {
                    e(true);
                    break;
                }
                if (coderResultFlush.isUnderflow()) {
                    if (z10) {
                        this.f58654i = true;
                        e(false);
                        break;
                    }
                    if (this.f58652g) {
                        z10 = true;
                    } else {
                        d();
                    }
                } else if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                    return 0;
                }
            }
        }
        if (iB > 0) {
            return iB;
        }
        return -1;
    }
}
