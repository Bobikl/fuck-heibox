package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes7.dex */
public interface l extends com.google.android.exoplayer2.upstream.k {
    int c(int i10) throws IOException;

    boolean f(int i10, boolean z10) throws IOException;

    boolean g(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long getLength();

    long getPosition();

    <E extends Throwable> void i(long j10, E e10) throws Throwable;

    int j(byte[] bArr, int i10, int i11) throws IOException;

    void l(byte[] bArr, int i10, int i11) throws IOException;

    boolean n(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void o();

    long q();

    @Override // com.google.android.exoplayer2.upstream.k
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;

    void s(int i10) throws IOException;

    void t(int i10) throws IOException;

    boolean u(int i10, boolean z10) throws IOException;
}
