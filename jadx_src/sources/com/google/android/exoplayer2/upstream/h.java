package com.google.android.exoplayer2.upstream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ByteArrayDataSink.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteArrayOutputStream f51123a;

    @Override // com.google.android.exoplayer2.upstream.m
    public void a(r rVar) {
        long j10 = rVar.f51201h;
        if (j10 == -1) {
            this.f51123a = new ByteArrayOutputStream();
        } else {
            com.google.android.exoplayer2.util.a.a(j10 <= 2147483647L);
            this.f51123a = new ByteArrayOutputStream((int) rVar.f51201h);
        }
    }

    @androidx.annotation.p0
    public byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = this.f51123a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void close() throws IOException {
        ((ByteArrayOutputStream) com.google.android.exoplayer2.util.u0.k(this.f51123a)).close();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void write(byte[] bArr, int i10, int i11) {
        ((ByteArrayOutputStream) com.google.android.exoplayer2.util.u0.k(this.f51123a)).write(bArr, i10, i11);
    }
}
