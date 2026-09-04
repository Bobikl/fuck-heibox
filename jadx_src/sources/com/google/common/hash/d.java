package com.google.common.hash;

import com.google.common.base.w;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: AbstractHasher.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.a
public abstract class d implements m {
    d() {
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public final m a(float f10) {
        return c(Float.floatToRawIntBits(f10));
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public /* bridge */ /* synthetic */ u b(byte b10) {
        return b(b10);
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m c(int i10) {
        b((byte) i10);
        b((byte) (i10 >>> 8));
        b((byte) (i10 >>> 16));
        b((byte) (i10 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m d(long j10) {
        for (int i10 = 0; i10 < 64; i10 += 8) {
            b((byte) (j10 >>> i10));
        }
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m e(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public final m f(double d10) {
        return d(Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m g(short s10) {
        b((byte) s10);
        b((byte) (s10 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public final m h(boolean z10) {
        return b(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m i(char c10) {
        b((byte) c10);
        b((byte) (c10 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            i(charSequence.charAt(i10));
        }
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m k(byte[] bArr, int i10, int i11) {
        w.f0(i10, i10 + i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            b(bArr[i10 + i12]);
        }
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m l(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            q.d(byteBuffer, byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                b(byteBuffer.get());
            }
        }
        return this;
    }

    @Override // com.google.common.hash.m, com.google.common.hash.u
    public m m(CharSequence charSequence, Charset charset) {
        return e(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.m
    public <T> m o(@t T t10, Funnel<? super T> funnel) {
        funnel.funnel(t10, this);
        return this;
    }
}
