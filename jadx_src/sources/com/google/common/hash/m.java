package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Hasher.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@o9.a
@s9.a
public interface m extends u {
    @Override // com.google.common.hash.u
    m a(float f10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u a(float f10);

    @Override // com.google.common.hash.u
    m b(byte b10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u b(byte b10);

    @Override // com.google.common.hash.u
    m c(int i10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u c(int i10);

    @Override // com.google.common.hash.u
    m d(long j10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u d(long j10);

    @Override // com.google.common.hash.u
    m e(byte[] bArr);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u e(byte[] bArr);

    @Override // com.google.common.hash.u
    m f(double d10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u f(double d10);

    @Override // com.google.common.hash.u
    m g(short s10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u g(short s10);

    @Override // com.google.common.hash.u
    m h(boolean z10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u h(boolean z10);

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.u
    m i(char c10);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u i(char c10);

    @Override // com.google.common.hash.u
    m j(CharSequence charSequence);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u j(CharSequence charSequence);

    @Override // com.google.common.hash.u
    m k(byte[] bArr, int i10, int i11);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u k(byte[] bArr, int i10, int i11);

    @Override // com.google.common.hash.u
    m l(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u l(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.u
    m m(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.u
    /* bridge */ /* synthetic */ u m(CharSequence charSequence, Charset charset);

    HashCode n();

    <T> m o(@t T t10, Funnel<? super T> funnel);
}
