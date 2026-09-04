package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: HashFunction.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public interface k {
    m a(int i10);

    HashCode b(byte[] bArr);

    HashCode c(int i10);

    <T> HashCode d(@t T t10, Funnel<? super T> funnel);

    HashCode e(long j10);

    HashCode f(CharSequence charSequence, Charset charset);

    HashCode g(CharSequence charSequence);

    int h();

    m i();

    HashCode j(ByteBuffer byteBuffer);

    HashCode k(byte[] bArr, int i10, int i11);
}
