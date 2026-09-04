package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingExtractorInput.java */
/* JADX INFO: loaded from: classes7.dex */
public class v implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f46207b;

    public v(l lVar) {
        this.f46207b = lVar;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public int c(int i10) throws IOException {
        return this.f46207b.c(i10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean f(int i10, boolean z10) throws IOException {
        return this.f46207b.f(i10, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f46207b.g(bArr, i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public long getLength() {
        return this.f46207b.getLength();
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public long getPosition() {
        return this.f46207b.getPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public <E extends Throwable> void i(long j10, E e10) throws Throwable {
        this.f46207b.i(j10, e10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public int j(byte[] bArr, int i10, int i11) throws IOException {
        return this.f46207b.j(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void l(byte[] bArr, int i10, int i11) throws IOException {
        this.f46207b.l(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean n(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f46207b.n(bArr, i10, i11, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void o() {
        this.f46207b.o();
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public long q() {
        return this.f46207b.q();
    }

    @Override // com.google.android.exoplayer2.extractor.l, com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f46207b.read(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f46207b.readFully(bArr, i10, i11);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void s(int i10) throws IOException {
        this.f46207b.s(i10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public void t(int i10) throws IOException {
        this.f46207b.t(i10);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public boolean u(int i10, boolean z10) throws IOException {
        return this.f46207b.u(i10, z10);
    }
}
