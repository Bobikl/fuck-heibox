package com.google.common.hash;

import com.google.common.base.w;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: AbstractHashFunction.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public abstract class c implements k {
    c() {
    }

    @Override // com.google.common.hash.k
    public m a(int i10) {
        w.k(i10 >= 0, "expectedInputSize must be >= 0 but was %s", i10);
        return i();
    }

    @Override // com.google.common.hash.k
    public HashCode b(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.k
    public HashCode c(int i10) {
        return a(4).c(i10).n();
    }

    @Override // com.google.common.hash.k
    public <T> HashCode d(@t T t10, Funnel<? super T> funnel) {
        return i().o(t10, funnel).n();
    }

    @Override // com.google.common.hash.k
    public HashCode e(long j10) {
        return a(8).d(j10).n();
    }

    @Override // com.google.common.hash.k
    public HashCode f(CharSequence charSequence, Charset charset) {
        return i().m(charSequence, charset).n();
    }

    @Override // com.google.common.hash.k
    public HashCode g(CharSequence charSequence) {
        return a(charSequence.length() * 2).j(charSequence).n();
    }

    @Override // com.google.common.hash.k
    public HashCode j(ByteBuffer byteBuffer) {
        return a(byteBuffer.remaining()).l(byteBuffer).n();
    }

    @Override // com.google.common.hash.k
    public HashCode k(byte[] bArr, int i10, int i11) {
        w.f0(i10, i10 + i11, bArr.length);
        return a(i11).k(bArr, i10, i11).n();
    }
}
