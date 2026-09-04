package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.j1;
import com.google.android.exoplayer2.util.u0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements com.google.android.exoplayer2.text.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f49871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f49872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, g> f49873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, e> f49874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f49875f;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f49871b = dVar;
        this.f49874e = map2;
        this.f49875f = map3;
        this.f49873d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f49872c = dVar.j();
    }

    @Override // com.google.android.exoplayer2.text.g
    public long a(int i10) {
        return this.f49872c[i10];
    }

    @Override // com.google.android.exoplayer2.text.g
    public int b() {
        return this.f49872c.length;
    }

    @Override // com.google.android.exoplayer2.text.g
    public int c(long j10) {
        int iF = u0.f(this.f49872c, j10, false, false);
        if (iF < this.f49872c.length) {
            return iF;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.g
    public List<com.google.android.exoplayer2.text.b> d(long j10) {
        return this.f49871b.h(j10, this.f49873d, this.f49874e, this.f49875f);
    }

    @j1
    Map<String, g> e() {
        return this.f49873d;
    }

    @j1
    d f() {
        return this.f49871b;
    }
}
