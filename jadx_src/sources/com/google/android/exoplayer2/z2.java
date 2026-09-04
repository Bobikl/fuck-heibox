package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class z2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final com.google.android.exoplayer2.source.f0.a f52062t = new com.google.android.exoplayer2.source.f0.a(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f52063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.f0.a f52064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final ExoPlaybackException f52068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f52069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.p1 f52070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.x f52071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Metadata> f52072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.f0.a f52073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f52074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f52075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b3 f52076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f52077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f52078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f52079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f52080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f52081s;

    public z2(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar, long j10, long j11, int i10, @androidx.annotation.p0 ExoPlaybackException exoPlaybackException, boolean z10, com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.x xVar, List<Metadata> list, com.google.android.exoplayer2.source.f0.a aVar2, boolean z11, int i11, b3 b3Var, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.f52063a = z3Var;
        this.f52064b = aVar;
        this.f52065c = j10;
        this.f52066d = j11;
        this.f52067e = i10;
        this.f52068f = exoPlaybackException;
        this.f52069g = z10;
        this.f52070h = p1Var;
        this.f52071i = xVar;
        this.f52072j = list;
        this.f52073k = aVar2;
        this.f52074l = z11;
        this.f52075m = i11;
        this.f52076n = b3Var;
        this.f52079q = j12;
        this.f52080r = j13;
        this.f52081s = j14;
        this.f52077o = z12;
        this.f52078p = z13;
    }

    public static z2 k(com.google.android.exoplayer2.trackselection.x xVar) {
        z3 z3Var = z3.f52082b;
        com.google.android.exoplayer2.source.f0.a aVar = f52062t;
        return new z2(z3Var, aVar, j.f46377b, 0L, 1, null, false, com.google.android.exoplayer2.source.p1.f48606e, xVar, ImmutableList.B(), aVar, false, 0, b3.f44367e, 0L, 0L, 0L, false, false);
    }

    public static com.google.android.exoplayer2.source.f0.a l() {
        return f52062t;
    }

    @androidx.annotation.j
    public z2 a(boolean z10) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, z10, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 b(com.google.android.exoplayer2.source.f0.a aVar) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, aVar, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 c(com.google.android.exoplayer2.source.f0.a aVar, long j10, long j11, long j12, long j13, com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.x xVar, List<Metadata> list) {
        return new z2(this.f52063a, aVar, j11, j12, this.f52067e, this.f52068f, this.f52069g, p1Var, xVar, list, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, j13, j10, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 d(boolean z10) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, z10, this.f52078p);
    }

    @androidx.annotation.j
    public z2 e(boolean z10, int i10) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, z10, i10, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 f(@androidx.annotation.p0 ExoPlaybackException exoPlaybackException) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, exoPlaybackException, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 g(b3 b3Var) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, b3Var, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 h(int i10) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, i10, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }

    @androidx.annotation.j
    public z2 i(boolean z10) {
        return new z2(this.f52063a, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, z10);
    }

    @androidx.annotation.j
    public z2 j(z3 z3Var) {
        return new z2(z3Var, this.f52064b, this.f52065c, this.f52066d, this.f52067e, this.f52068f, this.f52069g, this.f52070h, this.f52071i, this.f52072j, this.f52073k, this.f52074l, this.f52075m, this.f52076n, this.f52079q, this.f52080r, this.f52081s, this.f52077o, this.f52078p);
    }
}
