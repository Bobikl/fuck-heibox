package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f51215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f51216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f51217d = Uri.EMPTY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, List<String>> f51218e = Collections.emptyMap();

    public r0(o oVar) {
        this.f51215b = (o) com.google.android.exoplayer2.util.a.g(oVar);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        this.f51217d = rVar.f51194a;
        this.f51218e = Collections.emptyMap();
        long jA = this.f51215b.a(rVar);
        this.f51217d = (Uri) com.google.android.exoplayer2.util.a.g(getUri());
        this.f51218e = b();
        return jA;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return this.f51215b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        this.f51215b.close();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f51215b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f51215b.getUri();
    }

    public long p() {
        return this.f51216c;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f51215b.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f51216c += (long) i12;
        }
        return i12;
    }

    public Uri w() {
        return this.f51217d;
    }

    public Map<String, List<String>> x() {
        return this.f51218e;
    }

    public void y() {
        this.f51216c = 0L;
    }
}
