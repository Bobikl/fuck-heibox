package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.r1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class MergingMediaSource extends e<Integer> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f47432v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final i2 f47433w = new i2.c().D("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f47434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f47435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0[] f47436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z3[] f47437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList<f0> f47438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g f47439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map<Object, Long> f47440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r1<Object, c> f47441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f47442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[][] f47443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private IllegalMergeException f47444u;

    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47445c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47446b;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public IllegalMergeException(int i10) {
            this.f47446b = i10;
        }
    }

    public static final class a extends s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long[] f47447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long[] f47448i;

        public a(z3 z3Var, Map<Object, Long> map) {
            super(z3Var);
            int iW = z3Var.w();
            this.f47448i = new long[z3Var.w()];
            z3.d dVar = new z3.d();
            for (int i10 = 0; i10 < iW; i10++) {
                this.f47448i[i10] = z3Var.u(i10, dVar).f52125o;
            }
            int iN = z3Var.n();
            this.f47447h = new long[iN];
            z3.b bVar = new z3.b();
            for (int i11 = 0; i11 < iN; i11++) {
                z3Var.l(i11, bVar, true);
                long jLongValue = ((Long) com.google.android.exoplayer2.util.a.g(map.get(bVar.f52094c))).longValue();
                long[] jArr = this.f47447h;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f52096e : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = bVar.f52096e;
                if (j10 != com.google.android.exoplayer2.j.f46377b) {
                    long[] jArr2 = this.f47448i;
                    int i12 = bVar.f52095d;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            super.l(i10, bVar, z10);
            bVar.f52096e = this.f47447h[i10];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            long jMin;
            super.v(i10, dVar, j10);
            long j11 = this.f47448i[i10];
            dVar.f52125o = j11;
            if (j11 != com.google.android.exoplayer2.j.f46377b) {
                long j12 = dVar.f52124n;
                if (j12 == com.google.android.exoplayer2.j.f46377b) {
                    jMin = dVar.f52124n;
                } else {
                    jMin = Math.min(j12, j11);
                }
            } else {
                jMin = dVar.f52124n;
            }
            dVar.f52124n = jMin;
            return dVar;
        }
    }

    public MergingMediaSource(boolean z10, boolean z11, g gVar, f0... f0VarArr) {
        this.f47434k = z10;
        this.f47435l = z11;
        this.f47436m = f0VarArr;
        this.f47439p = gVar;
        this.f47438o = new ArrayList<>(Arrays.asList(f0VarArr));
        this.f47442s = -1;
        this.f47437n = new z3[f0VarArr.length];
        this.f47443t = new long[0][];
        this.f47440q = new HashMap();
        this.f47441r = MultimapBuilder.d().a().a();
    }

    public MergingMediaSource(boolean z10, boolean z11, f0... f0VarArr) {
        this(z10, z11, new j(), f0VarArr);
    }

    public MergingMediaSource(boolean z10, f0... f0VarArr) {
        this(z10, false, f0VarArr);
    }

    public MergingMediaSource(f0... f0VarArr) {
        this(false, f0VarArr);
    }

    private void Z() {
        z3.b bVar = new z3.b();
        for (int i10 = 0; i10 < this.f47442s; i10++) {
            long j10 = -this.f47437n[0].k(i10, bVar).s();
            int i11 = 1;
            while (true) {
                z3[] z3VarArr = this.f47437n;
                if (i11 < z3VarArr.length) {
                    this.f47443t[i10][i11] = j10 - (-z3VarArr[i11].k(i10, bVar).s());
                    i11++;
                }
            }
        }
    }

    private void c0() {
        z3[] z3VarArr;
        z3.b bVar = new z3.b();
        for (int i10 = 0; i10 < this.f47442s; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                z3VarArr = this.f47437n;
                if (i11 >= z3VarArr.length) {
                    break;
                }
                long jO = z3VarArr[i11].k(i10, bVar).o();
                if (jO != com.google.android.exoplayer2.j.f46377b) {
                    long j11 = jO + this.f47443t[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object objT = z3VarArr[0].t(i10);
            this.f47440q.put(objT, Long.valueOf(j10));
            Iterator<c> it = this.f47441r.v(objT).iterator();
            while (it.hasNext()) {
                it.next().x(0L, j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        super.D(u0Var);
        for (int i10 = 0; i10 < this.f47436m.length; i10++) {
            V(Integer.valueOf(i10), this.f47436m[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void F() {
        super.F();
        Arrays.fill(this.f47437n, (Object) null);
        this.f47442s = -1;
        this.f47444u = null;
        this.f47438o.clear();
        Collections.addAll(this.f47438o, this.f47436m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    @androidx.annotation.p0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public f0.a K(Integer num, f0.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void R(Integer num, f0 f0Var, z3 z3Var) {
        if (this.f47444u != null) {
            return;
        }
        if (this.f47442s == -1) {
            this.f47442s = z3Var.n();
        } else if (z3Var.n() != this.f47442s) {
            this.f47444u = new IllegalMergeException(0);
            return;
        }
        if (this.f47443t.length == 0) {
            this.f47443t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f47442s, this.f47437n.length);
        }
        this.f47438o.remove(f0Var);
        this.f47437n[num.intValue()] = z3Var;
        if (this.f47438o.isEmpty()) {
            if (this.f47434k) {
                Z();
            }
            z3 aVar = this.f47437n[0];
            if (this.f47435l) {
                c0();
                aVar = new a(aVar, this.f47440q);
            }
            E(aVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        f0[] f0VarArr = this.f47436m;
        return f0VarArr.length > 0 ? f0VarArr[0].c() : f47433w;
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.f0
    public void f() throws IOException {
        IllegalMergeException illegalMergeException = this.f47444u;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.f();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        int length = this.f47436m.length;
        c0[] c0VarArr = new c0[length];
        int iG = this.f47437n[0].g(aVar.f47719a);
        for (int i10 = 0; i10 < length; i10++) {
            c0VarArr[i10] = this.f47436m[i10].h(aVar.a(this.f47437n[i10].t(iG)), bVar, j10 - this.f47443t[iG][i10]);
        }
        q0 q0Var = new q0(this.f47439p, this.f47443t[iG], c0VarArr);
        if (!this.f47435l) {
            return q0Var;
        }
        c cVar = new c(q0Var, true, 0L, ((Long) com.google.android.exoplayer2.util.a.g(this.f47440q.get(aVar.f47719a))).longValue());
        this.f47441r.put(aVar.f47719a, cVar);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        if (this.f47435l) {
            c cVar = (c) c0Var;
            for (Map.Entry<Object, c> entry : this.f47441r.i()) {
                if (entry.getValue().equals(cVar)) {
                    this.f47441r.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            c0Var = cVar.f47581b;
        }
        q0 q0Var = (q0) c0Var;
        int i10 = 0;
        while (true) {
            f0[] f0VarArr = this.f47436m;
            if (i10 >= f0VarArr.length) {
                return;
            }
            f0VarArr[i10].k(q0Var.b(i10));
            i10++;
        }
    }
}
