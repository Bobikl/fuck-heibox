package com.google.common.hash;

import com.google.common.base.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: AbstractNonStreamingHashFunction.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public abstract class e extends c {

    /* JADX INFO: compiled from: AbstractNonStreamingHashFunction.java */
    public final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f58561a;

        a(int i10) {
            this.f58561a = new b(i10);
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m b(byte b10) throws IOException {
            this.f58561a.write(b10);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m k(byte[] bArr, int i10, int i11) throws IOException {
            this.f58561a.write(bArr, i10, i11);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
        public m l(ByteBuffer byteBuffer) {
            this.f58561a.c(byteBuffer);
            return this;
        }

        @Override // com.google.common.hash.m
        public HashCode n() {
            return e.this.k(this.f58561a.a(), 0, this.f58561a.b());
        }
    }

    /* JADX INFO: compiled from: AbstractNonStreamingHashFunction.java */
    public static final class b extends ByteArrayOutputStream {
        b(int i10) {
            super(i10);
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int b() {
            return ((ByteArrayOutputStream) this).count;
        }

        void c(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i10 = ((ByteArrayOutputStream) this).count;
            int i11 = i10 + iRemaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i11 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i10 + iRemaining);
            }
            byteBuffer.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, iRemaining);
            ((ByteArrayOutputStream) this).count += iRemaining;
        }
    }

    e() {
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public m a(int i10) {
        w.d(i10 >= 0);
        return new a(i10);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode c(int i10) {
        return b(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode e(long j10) {
        return b(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode f(CharSequence charSequence, Charset charset) {
        return b(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode g(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i10 = 0; i10 < length; i10++) {
            byteBufferOrder.putChar(charSequence.charAt(i10));
        }
        return b(byteBufferOrder.array());
    }

    @Override // com.google.common.hash.k
    public m i() {
        return a(32);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public HashCode j(ByteBuffer byteBuffer) {
        return a(byteBuffer.remaining()).l(byteBuffer).n();
    }

    @Override // com.google.common.hash.c, com.google.common.hash.k
    public abstract HashCode k(byte[] bArr, int i10, int i11);
}
