package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: ByteArrayDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f51124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f51125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f51128j;

    public i(byte[] bArr) {
        super(false);
        com.google.android.exoplayer2.util.a.g(bArr);
        com.google.android.exoplayer2.util.a.a(bArr.length > 0);
        this.f51124f = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        this.f51125g = rVar.f51194a;
        y(rVar);
        long j10 = rVar.f51200g;
        byte[] bArr = this.f51124f;
        if (j10 > bArr.length) {
            throw new DataSourceException(2008);
        }
        this.f51126h = (int) j10;
        int length = bArr.length - ((int) j10);
        this.f51127i = length;
        long j11 = rVar.f51201h;
        if (j11 != -1) {
            this.f51127i = (int) Math.min(length, j11);
        }
        this.f51128j = true;
        z(rVar);
        long j12 = rVar.f51201h;
        return j12 != -1 ? j12 : this.f51127i;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
        if (this.f51128j) {
            this.f51128j = false;
            x();
        }
        this.f51125g = null;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f51125g;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f51127i;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(this.f51124f, this.f51126h, bArr, i10, iMin);
        this.f51126h += iMin;
        this.f51127i -= iMin;
        w(iMin);
        return iMin;
    }
}
