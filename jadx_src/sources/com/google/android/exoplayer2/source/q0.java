package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: compiled from: MergingMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0[] f48613b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f48615d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private c0.a f48617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private p1 f48618g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e1 f48620i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<c0> f48616e = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<d1, Integer> f48614c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c0[] f48619h = new c0[0];

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class a implements c0, c0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f48621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c0.a f48623d;

        public a(c0 c0Var, long j10) {
            this.f48621b = c0Var;
            this.f48622c = j10;
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public boolean a() {
            return this.f48621b.a();
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public boolean d(long j10) {
            return this.f48621b.d(j10 - this.f48622c);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public long e() {
            long jE = this.f48621b.e();
            if (jE == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f48622c + jE;
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public void f(long j10) {
            this.f48621b.f(j10 - this.f48622c);
        }

        @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
        public long g() {
            long jG = this.f48621b.g();
            if (jG == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f48622c + jG;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long h(long j10, r3 r3Var) {
            return this.f48621b.h(j10 - this.f48622c, r3Var) + this.f48622c;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public List<StreamKey> i(List<com.google.android.exoplayer2.trackselection.j> list) {
            return this.f48621b.i(list);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long j(long j10) {
            return this.f48621b.j(j10 - this.f48622c) + this.f48622c;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long k() {
            long jK = this.f48621b.k();
            return jK == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.j.f46377b : this.f48622c + jK;
        }

        @Override // com.google.android.exoplayer2.source.c0
        public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
            d1[] d1VarArr2 = new d1[d1VarArr.length];
            int i10 = 0;
            while (true) {
                d1 d1VarA = null;
                if (i10 >= d1VarArr.length) {
                    break;
                }
                b bVar = (b) d1VarArr[i10];
                if (bVar != null) {
                    d1VarA = bVar.a();
                }
                d1VarArr2[i10] = d1VarA;
                i10++;
            }
            long jL = this.f48621b.l(jVarArr, zArr, d1VarArr2, zArr2, j10 - this.f48622c);
            for (int i11 = 0; i11 < d1VarArr.length; i11++) {
                d1 d1Var = d1VarArr2[i11];
                if (d1Var == null) {
                    d1VarArr[i11] = null;
                } else {
                    d1 d1Var2 = d1VarArr[i11];
                    if (d1Var2 == null || ((b) d1Var2).a() != d1Var) {
                        d1VarArr[i11] = new b(d1Var, this.f48622c);
                    }
                }
            }
            return jL + this.f48622c;
        }

        @Override // com.google.android.exoplayer2.source.e1.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void n(c0 c0Var) {
            ((c0.a) com.google.android.exoplayer2.util.a.g(this.f48623d)).n(this);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public p1 o() {
            return this.f48621b.o();
        }

        @Override // com.google.android.exoplayer2.source.c0.a
        public void q(c0 c0Var) {
            ((c0.a) com.google.android.exoplayer2.util.a.g(this.f48623d)).q(this);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void r(c0.a aVar, long j10) {
            this.f48623d = aVar;
            this.f48621b.r(this, j10 - this.f48622c);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void u() throws IOException {
            this.f48621b.u();
        }

        @Override // com.google.android.exoplayer2.source.c0
        public void v(long j10, boolean z10) {
            this.f48621b.v(j10 - this.f48622c, z10);
        }
    }

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class b implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d1 f48624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48625c;

        public b(d1 d1Var, long j10) {
            this.f48624b = d1Var;
            this.f48625c = j10;
        }

        public d1 a() {
            return this.f48624b;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() throws IOException {
            this.f48624b.b();
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iC = this.f48624b.c(b2Var, decoderInputBuffer, i10);
            if (iC == -4) {
                decoderInputBuffer.f44490g = Math.max(0L, decoderInputBuffer.f44490g + this.f48625c);
            }
            return iC;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return this.f48624b.isReady();
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            return this.f48624b.n(j10 - this.f48625c);
        }
    }

    public q0(g gVar, long[] jArr, c0... c0VarArr) {
        this.f48615d = gVar;
        this.f48613b = c0VarArr;
        this.f48620i = gVar.a(new e1[0]);
        for (int i10 = 0; i10 < c0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f48613b[i10] = new a(c0VarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f48620i.a();
    }

    public c0 b(int i10) {
        c0 c0Var = this.f48613b[i10];
        return c0Var instanceof a ? ((a) c0Var).f48621b : c0Var;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        if (this.f48616e.isEmpty()) {
            return this.f48620i.d(j10);
        }
        int size = this.f48616e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48616e.get(i10).d(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        return this.f48620i.e();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        this.f48620i.f(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return this.f48620i.g();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        c0[] c0VarArr = this.f48619h;
        return (c0VarArr.length > 0 ? c0VarArr[0] : this.f48613b[0]).h(j10, r3Var);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public /* synthetic */ List i(List list) {
        return b0.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        long j11 = this.f48619h[0].j(j10);
        int i10 = 1;
        while (true) {
            c0[] c0VarArr = this.f48619h;
            if (i10 >= c0VarArr.length) {
                return j11;
            }
            if (c0VarArr[i10].j(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        long j10 = -9223372036854775807L;
        for (c0 c0Var : this.f48619h) {
            long jK = c0Var.k();
            if (jK == com.google.android.exoplayer2.j.f46377b) {
                if (j10 != com.google.android.exoplayer2.j.f46377b && c0Var.j(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == com.google.android.exoplayer2.j.f46377b) {
                for (c0 c0Var2 : this.f48619h) {
                    if (c0Var2 == c0Var) {
                        break;
                    }
                    if (c0Var2.j(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jK;
            } else if (jK != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            Integer num = d1Var == null ? null : this.f48614c.get(d1Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i10];
            if (jVar != null) {
                n1 n1VarH = jVar.h();
                int i11 = 0;
                while (true) {
                    c0[] c0VarArr = this.f48613b;
                    if (i11 >= c0VarArr.length) {
                        break;
                    }
                    if (c0VarArr[i11].o().d(n1VarH) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f48614c.clear();
        int length = jVarArr.length;
        d1[] d1VarArr2 = new d1[length];
        d1[] d1VarArr3 = new d1[jVarArr.length];
        com.google.android.exoplayer2.trackselection.j[] jVarArr2 = new com.google.android.exoplayer2.trackselection.j[jVarArr.length];
        ArrayList arrayList = new ArrayList(this.f48613b.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f48613b.length) {
            for (int i13 = 0; i13 < jVarArr.length; i13++) {
                d1VarArr3[i13] = iArr[i13] == i12 ? d1VarArr[i13] : null;
                jVarArr2[i13] = iArr2[i13] == i12 ? jVarArr[i13] : null;
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            com.google.android.exoplayer2.trackselection.j[] jVarArr3 = jVarArr2;
            long jL = this.f48613b[i12].l(jVarArr2, zArr, d1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jL;
            } else if (jL != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < jVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    d1 d1Var2 = (d1) com.google.android.exoplayer2.util.a.g(d1VarArr3[i15]);
                    d1VarArr2[i15] = d1VarArr3[i15];
                    this.f48614c.put(d1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    com.google.android.exoplayer2.util.a.i(d1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f48613b[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            jVarArr2 = jVarArr3;
        }
        System.arraycopy(d1VarArr2, 0, d1VarArr, 0, length);
        c0[] c0VarArr2 = (c0[]) arrayList.toArray(new c0[0]);
        this.f48619h = c0VarArr2;
        this.f48620i = this.f48615d.a(c0VarArr2);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void n(c0 c0Var) {
        ((c0.a) com.google.android.exoplayer2.util.a.g(this.f48617f)).n(this);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return (p1) com.google.android.exoplayer2.util.a.g(this.f48618g);
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    public void q(c0 c0Var) {
        this.f48616e.remove(c0Var);
        if (this.f48616e.isEmpty()) {
            int i10 = 0;
            for (c0 c0Var2 : this.f48613b) {
                i10 += c0Var2.o().f48609b;
            }
            n1[] n1VarArr = new n1[i10];
            int i11 = 0;
            for (c0 c0Var3 : this.f48613b) {
                p1 p1VarO = c0Var3.o();
                int i12 = p1VarO.f48609b;
                int i13 = 0;
                while (i13 < i12) {
                    n1VarArr[i11] = p1VarO.c(i13);
                    i13++;
                    i11++;
                }
            }
            this.f48618g = new p1(n1VarArr);
            ((c0.a) com.google.android.exoplayer2.util.a.g(this.f48617f)).q(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f48617f = aVar;
        Collections.addAll(this.f48616e, this.f48613b);
        for (c0 c0Var : this.f48613b) {
            c0Var.r(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        for (c0 c0Var : this.f48613b) {
            c0Var.u();
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        for (c0 c0Var : this.f48619h) {
            c0Var.v(j10, z10);
        }
    }
}
