package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Representation.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f47921h = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f47923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableList<com.google.android.exoplayer2.source.dash.manifest.b> f47924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f47926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f47927g;

    /* JADX INFO: compiled from: Representation.java */
    public static class b extends j implements com.google.android.exoplayer2.source.dash.i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @j1
        final k.a f47928i;

        public b(long j10, a2 a2Var, List<com.google.android.exoplayer2.source.dash.manifest.b> list, k.a aVar, @p0 List<e> list2) {
            super(j10, a2Var, list, aVar, list2);
            this.f47928i = aVar;
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long a(long j10, long j11) {
            return this.f47928i.h(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long b(long j10, long j11) {
            return this.f47928i.d(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long c(long j10) {
            return this.f47928i.j(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long d(long j10, long j11) {
            return this.f47928i.f(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long e(long j10, long j11) {
            return this.f47928i.i(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long f(long j10) {
            return this.f47928i.g(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long g() {
            return this.f47928i.e();
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public i h(long j10) {
            return this.f47928i.k(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public boolean i() {
            return this.f47928i.l();
        }

        @Override // com.google.android.exoplayer2.source.dash.i
        public long j(long j10, long j11) {
            return this.f47928i.c(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.j
        @p0
        public String k() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.j
        public com.google.android.exoplayer2.source.dash.i l() {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.j
        @p0
        public i m() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Representation.java */
    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f47929i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f47930j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private final String f47931k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        private final i f47932l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @p0
        private final m f47933m;

        public c(long j10, a2 a2Var, List<com.google.android.exoplayer2.source.dash.manifest.b> list, k.e eVar, @p0 List<e> list2, @p0 String str, long j11) {
            super(j10, a2Var, list, eVar, list2);
            this.f47929i = Uri.parse(list.get(0).f47869a);
            i iVarC = eVar.c();
            this.f47932l = iVarC;
            this.f47931k = str;
            this.f47930j = j11;
            this.f47933m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        public static c r(long j10, a2 a2Var, String str, long j11, long j12, long j13, long j14, List<e> list, @p0 String str2, long j15) {
            return new c(j10, a2Var, ImmutableList.D(new com.google.android.exoplayer2.source.dash.manifest.b(str)), new k.e(new i(null, j11, (j12 - j11) + 1), 1L, 0L, j13, (j14 - j13) + 1), list, str2, j15);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.j
        @p0
        public String k() {
            return this.f47931k;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.j
        @p0
        public com.google.android.exoplayer2.source.dash.i l() {
            return this.f47933m;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.j
        @p0
        public i m() {
            return this.f47932l;
        }
    }

    private j(long j10, a2 a2Var, List<com.google.android.exoplayer2.source.dash.manifest.b> list, k kVar, @p0 List<e> list2) {
        com.google.android.exoplayer2.util.a.a(!list.isEmpty());
        this.f47922b = j10;
        this.f47923c = a2Var;
        this.f47924d = ImmutableList.v(list);
        this.f47926f = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f47927g = kVar.a(this);
        this.f47925e = kVar.b();
    }

    public static j o(long j10, a2 a2Var, List<com.google.android.exoplayer2.source.dash.manifest.b> list, k kVar) {
        return p(j10, a2Var, list, kVar, null);
    }

    public static j p(long j10, a2 a2Var, List<com.google.android.exoplayer2.source.dash.manifest.b> list, k kVar, @p0 List<e> list2) {
        return q(j10, a2Var, list, kVar, list2, null);
    }

    public static j q(long j10, a2 a2Var, List<com.google.android.exoplayer2.source.dash.manifest.b> list, k kVar, @p0 List<e> list2, @p0 String str) {
        if (kVar instanceof k.e) {
            return new c(j10, a2Var, list, (k.e) kVar, list2, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, a2Var, list, (k.a) kVar, list2);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    @p0
    public abstract String k();

    @p0
    public abstract com.google.android.exoplayer2.source.dash.i l();

    @p0
    public abstract i m();

    @p0
    public i n() {
        return this.f47927g;
    }
}
