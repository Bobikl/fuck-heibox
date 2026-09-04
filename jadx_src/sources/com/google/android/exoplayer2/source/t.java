package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements com.google.android.exoplayer2.upstream.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f49166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f49168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f49169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49170f;

    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface a {
        void b(com.google.android.exoplayer2.util.e0 e0Var);
    }

    public t(com.google.android.exoplayer2.upstream.o oVar, int i10, a aVar) {
        com.google.android.exoplayer2.util.a.a(i10 > 0);
        this.f49166b = oVar;
        this.f49167c = i10;
        this.f49168d = aVar;
        this.f49169e = new byte[1];
        this.f49170f = i10;
    }

    private boolean p() throws IOException {
        if (this.f49166b.read(this.f49169e, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f49169e[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f49166b.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f49168d.b(new com.google.android.exoplayer2.util.e0(bArr, i10));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(com.google.android.exoplayer2.upstream.r rVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return this.f49166b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(com.google.android.exoplayer2.upstream.u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f49166b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f49166b.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f49170f == 0) {
            if (!p()) {
                return -1;
            }
            this.f49170f = this.f49167c;
        }
        int i12 = this.f49166b.read(bArr, i10, Math.min(this.f49170f, i11));
        if (i12 != -1) {
            this.f49170f -= i12;
        }
        return i12;
    }
}
