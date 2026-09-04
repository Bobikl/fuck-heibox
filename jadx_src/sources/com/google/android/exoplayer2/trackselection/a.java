package com.google.android.exoplayer2.trackselection;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.l1;
import com.google.common.collect.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends c {
    public static final int A = 25000;
    public static final int B = 25000;
    public static final int C = 1279;
    public static final int D = 719;
    public static final float E = 0.7f;
    public static final float F = 0.75f;
    private static final long G = 1000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f50008y = "AdaptiveTrackSelection";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f50009z = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.e f50010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f50011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f50012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f50013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f50014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f50015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f50016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f50017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ImmutableList<C0398a> f50018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f50019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f50020t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50021u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f50023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.source.chunk.n f50024x;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class C0398a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f50026b;

        public C0398a(long j10, long j11) {
            this.f50025a = j10;
            this.f50026b = j11;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0398a)) {
                return false;
            }
            C0398a c0398a = (C0398a) obj;
            return this.f50025a == c0398a.f50025a && this.f50026b == c0398a.f50026b;
        }

        public int hashCode() {
            return (((int) this.f50025a) * 31) + ((int) this.f50026b);
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class b implements j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f50028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f50029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f50030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f50031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f50032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f50033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.e f50034h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, com.google.android.exoplayer2.util.e.f51387a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, com.google.android.exoplayer2.util.e eVar) {
            this(i10, i11, i12, 1279, 719, f10, f11, eVar);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10) {
            this(i10, i11, i12, i13, i14, f10, 0.75f, com.google.android.exoplayer2.util.e.f51387a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, com.google.android.exoplayer2.util.e eVar) {
            this.f50027a = i10;
            this.f50028b = i11;
            this.f50029c = i12;
            this.f50030d = i13;
            this.f50031e = i14;
            this.f50032f = f10;
            this.f50033g = f11;
            this.f50034h = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.j.b
        public final j[] a(j.a[] aVarArr, com.google.android.exoplayer2.upstream.e eVar, f0.a aVar, z3 z3Var) {
            ImmutableList immutableListB = a.B(aVarArr);
            j[] jVarArr = new j[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                j.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f50103b;
                    if (iArr.length != 0) {
                        jVarArr[i10] = iArr.length == 1 ? new k(aVar2.f50102a, iArr[0], aVar2.f50104c) : b(aVar2.f50102a, iArr, aVar2.f50104c, eVar, (ImmutableList) immutableListB.get(i10));
                    }
                }
            }
            return jVarArr;
        }

        protected a b(n1 n1Var, int[] iArr, int i10, com.google.android.exoplayer2.upstream.e eVar, ImmutableList<C0398a> immutableList) {
            return new a(n1Var, iArr, i10, eVar, this.f50027a, this.f50028b, this.f50029c, this.f50030d, this.f50031e, this.f50032f, this.f50033g, immutableList, this.f50034h);
        }
    }

    protected a(n1 n1Var, int[] iArr, int i10, com.google.android.exoplayer2.upstream.e eVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0398a> list, com.google.android.exoplayer2.util.e eVar2) {
        long j13;
        super(n1Var, iArr, i10);
        if (j12 < j10) {
            com.google.android.exoplayer2.util.u.m(f50008y, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f50010j = eVar;
        this.f50011k = j10 * 1000;
        this.f50012l = j11 * 1000;
        this.f50013m = j13 * 1000;
        this.f50014n = i11;
        this.f50015o = i12;
        this.f50016p = f10;
        this.f50017q = f11;
        this.f50018r = ImmutableList.v(list);
        this.f50019s = eVar2;
        this.f50020t = 1.0f;
        this.f50022v = 0;
        this.f50023w = com.google.android.exoplayer2.j.f46377b;
    }

    public a(n1 n1Var, int[] iArr, com.google.android.exoplayer2.upstream.e eVar) {
        this(n1Var, iArr, 0, eVar, 10000L, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, ImmutableList.B(), com.google.android.exoplayer2.util.e.f51387a);
    }

    private int A(long j10, long j11) {
        long jC = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f50036d; i11++) {
            if (j10 == Long.MIN_VALUE || !b(i11, j10)) {
                a2 a2VarP = p(i11);
                if (z(a2VarP, a2VarP.f43589i, jC)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<C0398a>> B(j.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (j.a aVar : aVarArr) {
            if (aVar == null || aVar.f50103b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.a aVarQ = ImmutableList.q();
                aVarQ.a(new C0398a(0L, 0L));
                arrayList.add(aVarQ);
            }
        }
        long[][] jArrG = G(aVarArr);
        int[] iArr = new int[jArrG.length];
        long[] jArr = new long[jArrG.length];
        for (int i10 = 0; i10 < jArrG.length; i10++) {
            long[] jArr2 = jArrG[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        y(arrayList, jArr);
        ImmutableList<Integer> immutableListH = H(jArrG);
        for (int i11 = 0; i11 < immutableListH.size(); i11++) {
            int iIntValue = immutableListH.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrG[iIntValue][i12];
            y(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        y(arrayList, jArr);
        ImmutableList.a aVarQ2 = ImmutableList.q();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ImmutableList.a aVar2 = (ImmutableList.a) arrayList.get(i14);
            aVarQ2.a(aVar2 == null ? ImmutableList.B() : aVar2.e());
        }
        return aVarQ2.e();
    }

    private long C(long j10) {
        long jI = I(j10);
        if (this.f50018r.isEmpty()) {
            return jI;
        }
        int i10 = 1;
        while (i10 < this.f50018r.size() - 1 && this.f50018r.get(i10).f50025a < jI) {
            i10++;
        }
        C0398a c0398a = this.f50018r.get(i10 - 1);
        C0398a c0398a2 = this.f50018r.get(i10);
        long j11 = c0398a.f50025a;
        float f10 = (jI - j11) / (c0398a2.f50025a - j11);
        long j12 = c0398a.f50026b;
        return j12 + ((long) (f10 * (c0398a2.f50026b - j12)));
    }

    private long D(List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        if (list.isEmpty()) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        com.google.android.exoplayer2.source.chunk.n nVar = (com.google.android.exoplayer2.source.chunk.n) l1.w(list);
        long j10 = nVar.f47653g;
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        long j11 = nVar.f47654h;
        return j11 != com.google.android.exoplayer2.j.f46377b ? j11 - j10 : com.google.android.exoplayer2.j.f46377b;
    }

    private long F(com.google.android.exoplayer2.source.chunk.o[] oVarArr, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        int i10 = this.f50021u;
        if (i10 < oVarArr.length && oVarArr[i10].next()) {
            com.google.android.exoplayer2.source.chunk.o oVar = oVarArr[this.f50021u];
            return oVar.a() - oVar.c();
        }
        for (com.google.android.exoplayer2.source.chunk.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.a() - oVar2.c();
            }
        }
        return D(list);
    }

    private static long[][] G(j.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            j.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f50103b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f50103b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f50102a.c(iArr[i11]).f43589i;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> H(long[][] jArr) {
        r1 r1VarJ = MultimapBuilder.h().a().a();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    r1VarJ.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return ImmutableList.v(r1VarJ.values());
    }

    private long I(long j10) {
        long jC = (long) (this.f50010j.c() * this.f50016p);
        long jA = this.f50010j.a();
        if (jA == com.google.android.exoplayer2.j.f46377b || j10 == com.google.android.exoplayer2.j.f46377b) {
            return (long) (jC / this.f50020t);
        }
        float f10 = j10;
        return (long) ((jC * Math.max((f10 / this.f50020t) - jA, 0.0f)) / f10);
    }

    private long J(long j10) {
        return (j10 > com.google.android.exoplayer2.j.f46377b ? 1 : (j10 == com.google.android.exoplayer2.j.f46377b ? 0 : -1)) != 0 && (j10 > this.f50011k ? 1 : (j10 == this.f50011k ? 0 : -1)) <= 0 ? (long) (j10 * this.f50017q) : this.f50011k;
    }

    private static void y(List<ImmutableList.a<C0398a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImmutableList.a<C0398a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0398a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f50013m;
    }

    protected boolean K(long j10, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        long j11 = this.f50023w;
        return j11 == com.google.android.exoplayer2.j.f46377b || j10 - j11 >= 1000 || !(list.isEmpty() || ((com.google.android.exoplayer2.source.chunk.n) l1.w(list)).equals(this.f50024x));
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int a() {
        return this.f50021u;
    }

    @Override // com.google.android.exoplayer2.trackselection.c, com.google.android.exoplayer2.trackselection.j
    @androidx.annotation.i
    public void c() {
        this.f50024x = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.c, com.google.android.exoplayer2.trackselection.j
    @androidx.annotation.i
    public void i() {
        this.f50023w = com.google.android.exoplayer2.j.f46377b;
        this.f50024x = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.c, com.google.android.exoplayer2.trackselection.j
    public int j(long j10, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        int i10;
        int i11;
        long jB = this.f50019s.b();
        if (!K(jB, list)) {
            return list.size();
        }
        this.f50023w = jB;
        this.f50024x = list.isEmpty() ? null : (com.google.android.exoplayer2.source.chunk.n) l1.w(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jP0 = u0.p0(list.get(size - 1).f47653g - j10, this.f50020t);
        long jE = E();
        if (jP0 < jE) {
            return size;
        }
        a2 a2VarP = p(A(jB, D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            com.google.android.exoplayer2.source.chunk.n nVar = list.get(i12);
            a2 a2Var = nVar.f47650d;
            if (u0.p0(nVar.f47653g - j10, this.f50020t) >= jE && a2Var.f43589i < a2VarP.f43589i && (i10 = a2Var.f43599s) != -1 && i10 <= this.f50015o && (i11 = a2Var.f43598r) != -1 && i11 <= this.f50014n && i10 < a2VarP.f43599s) {
                return i12;
            }
        }
        return size;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public void k(long j10, long j11, long j12, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.o[] oVarArr) {
        long jB = this.f50019s.b();
        long jF = F(oVarArr, list);
        int i10 = this.f50022v;
        if (i10 == 0) {
            this.f50022v = 1;
            this.f50021u = A(jB, jF);
            return;
        }
        int i11 = this.f50021u;
        int iT = list.isEmpty() ? -1 : t(((com.google.android.exoplayer2.source.chunk.n) l1.w(list)).f47650d);
        if (iT != -1) {
            i10 = ((com.google.android.exoplayer2.source.chunk.n) l1.w(list)).f47651e;
            i11 = iT;
        }
        int iA = A(jB, jF);
        if (!b(i11, jB)) {
            a2 a2VarP = p(i11);
            a2 a2VarP2 = p(iA);
            if ((a2VarP2.f43589i > a2VarP.f43589i && j11 < J(j12)) || (a2VarP2.f43589i < a2VarP.f43589i && j11 >= this.f50012l)) {
                iA = i11;
            }
        }
        if (iA != i11) {
            i10 = 3;
        }
        this.f50022v = i10;
        this.f50021u = iA;
    }

    @Override // com.google.android.exoplayer2.trackselection.c, com.google.android.exoplayer2.trackselection.j
    public void q(float f10) {
        this.f50020t = f10;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    @p0
    public Object r() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.j
    public int u() {
        return this.f50022v;
    }

    protected boolean z(a2 a2Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
