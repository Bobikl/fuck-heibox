package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TeeDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f51228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f51229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51231e;

    public s0(o oVar, m mVar) {
        this.f51228b = (o) com.google.android.exoplayer2.util.a.g(oVar);
        this.f51229c = (m) com.google.android.exoplayer2.util.a.g(mVar);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        long jA = this.f51228b.a(rVar);
        this.f51231e = jA;
        if (jA == 0) {
            return 0L;
        }
        if (rVar.f51201h == -1 && jA != -1) {
            rVar = rVar.f(0L, jA);
        }
        this.f51230d = true;
        this.f51229c.a(rVar);
        return this.f51231e;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return this.f51228b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        try {
            this.f51228b.close();
        } finally {
            if (this.f51230d) {
                this.f51230d = false;
                this.f51229c.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f51228b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f51228b.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f51231e == 0) {
            return -1;
        }
        int i12 = this.f51228b.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f51229c.write(bArr, i10, i12);
            long j10 = this.f51231e;
            if (j10 != -1) {
                this.f51231e = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
