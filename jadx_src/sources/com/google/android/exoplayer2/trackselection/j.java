package com.google.android.exoplayer2.trackselection;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.z3;
import java.util.List;

/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public interface j extends o {

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n1 f50102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f50103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50104c;

        public a(n1 n1Var, int... iArr) {
            this(n1Var, iArr, 0);
        }

        public a(n1 n1Var, int[] iArr, int i10) {
            this.f50102a = n1Var;
            this.f50103b = iArr;
            this.f50104c = i10;
        }
    }

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public interface b {
        j[] a(a[] aVarArr, com.google.android.exoplayer2.upstream.e eVar, f0.a aVar, z3 z3Var);
    }

    int a();

    boolean b(int i10, long j10);

    void c();

    boolean d(long j10, com.google.android.exoplayer2.source.chunk.f fVar, List<? extends com.google.android.exoplayer2.source.chunk.n> list);

    void f();

    void i();

    int j(long j10, List<? extends com.google.android.exoplayer2.source.chunk.n> list);

    void k(long j10, long j11, long j12, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.o[] oVarArr);

    int l();

    a2 m();

    void n();

    boolean o(int i10, long j10);

    void q(float f10);

    @p0
    Object r();

    void s(boolean z10);

    int u();
}
