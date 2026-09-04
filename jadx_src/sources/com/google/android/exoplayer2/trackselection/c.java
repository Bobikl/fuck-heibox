package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final n1 f50035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f50036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int[] f50037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a2[] f50039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long[] f50040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50041i;

    public c(n1 n1Var, int... iArr) {
        this(n1Var, iArr, 0);
    }

    public c(n1 n1Var, int[] iArr, int i10) {
        int i11 = 0;
        com.google.android.exoplayer2.util.a.i(iArr.length > 0);
        this.f50038f = i10;
        this.f50035c = (n1) com.google.android.exoplayer2.util.a.g(n1Var);
        int length = iArr.length;
        this.f50036d = length;
        this.f50039g = new a2[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f50039g[i12] = n1Var.c(iArr[i12]);
        }
        Arrays.sort(this.f50039g, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.w((a2) obj, (a2) obj2);
            }
        });
        this.f50037e = new int[this.f50036d];
        while (true) {
            int i13 = this.f50036d;
            if (i11 >= i13) {
                this.f50040h = new long[i13];
                return;
            } else {
                this.f50037e[i11] = n1Var.d(this.f50039g[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(a2 a2Var, a2 a2Var2) {
        return a2Var2.f43589i - a2Var.f43589i;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public boolean b(int i10, long j10) {
        return this.f50040h[i10] > j10;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public void c() {
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public /* synthetic */ boolean d(long j10, com.google.android.exoplayer2.source.chunk.f fVar, List list) {
        return i.d(this, j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int e(int i10) {
        return this.f50037e[i10];
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f50035c == cVar.f50035c && Arrays.equals(this.f50037e, cVar.f50037e);
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public /* synthetic */ void f() {
        i.a(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int g(int i10) {
        for (int i11 = 0; i11 < this.f50036d; i11++) {
            if (this.f50037e[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int getType() {
        return this.f50038f;
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final n1 h() {
        return this.f50035c;
    }

    public int hashCode() {
        if (this.f50041i == 0) {
            this.f50041i = (System.identityHashCode(this.f50035c) * 31) + Arrays.hashCode(this.f50037e);
        }
        return this.f50041i;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public void i() {
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int j(long j10, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public final int l() {
        return this.f50037e[a()];
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int length() {
        return this.f50037e.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public final a2 m() {
        return this.f50039g[a()];
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public /* synthetic */ void n() {
        i.c(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public boolean o(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f50036d && !zB) {
            zB = (i11 == i10 || b(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f50040h;
        jArr[i10] = Math.max(jArr[i10], u0.b(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final a2 p(int i10) {
        return this.f50039g[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public void q(float f10) {
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public /* synthetic */ void s(boolean z10) {
        i.b(this, z10);
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int t(a2 a2Var) {
        for (int i10 = 0; i10 < this.f50036d; i10++) {
            if (this.f50039g[i10] == a2Var) {
                return i10;
            }
        }
        return -1;
    }
}
