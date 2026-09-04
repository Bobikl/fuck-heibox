package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements com.google.android.exoplayer2.extractor.k {
    public static final int A = 188;
    public static final int B = 112800;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 15;
    public static final int F = 17;
    public static final int G = 129;
    public static final int H = 138;
    public static final int I = 130;
    public static final int J = 135;
    public static final int K = 172;
    public static final int L = 2;
    public static final int M = 16;
    public static final int N = 27;
    public static final int O = 36;
    public static final int P = 21;
    public static final int Q = 134;
    public static final int R = 89;
    public static final int S = 128;
    public static final int T = 257;
    public static final int U = 71;
    private static final int V = 0;
    private static final int W = 8192;
    private static final long X = 1094921523;
    private static final long Y = 1161904947;
    private static final long Z = 1094921524;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final long f45814a0 = 1212503619;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f45815b0 = 9400;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f45816c0 = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.q f45817w = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.ts.g0
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return h0.w();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f45818x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f45819y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f45820z = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<n0> f45823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseIntArray f45825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i0.c f45826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseArray<i0> f45827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f45828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseBooleanArray f45829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0 f45830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e0 f45831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f45832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f45833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f45834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f45835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f45836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private i0 f45837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f45838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f45839v;

    /* JADX INFO: compiled from: TsExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.d0 f45840a = new com.google.android.exoplayer2.util.d0(new byte[4]);

        public b() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.b0
        public void a(n0 n0Var, com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.b0
        public void c(com.google.android.exoplayer2.util.e0 e0Var) {
            if (e0Var.G() == 0 && (e0Var.G() & 128) != 0) {
                e0Var.T(6);
                int iA = e0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    e0Var.i(this.f45840a, 4);
                    int iH = this.f45840a.h(16);
                    this.f45840a.s(3);
                    if (iH == 0) {
                        this.f45840a.s(13);
                    } else {
                        int iH2 = this.f45840a.h(13);
                        if (h0.this.f45827j.get(iH2) == null) {
                            h0.this.f45827j.put(iH2, new c0(h0.this.new c(iH2)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f45821d != 2) {
                    h0.this.f45827j.remove(0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class c implements b0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45842f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45843g = 10;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45844h = 106;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45845i = 111;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45846j = 122;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45847k = 123;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f45848l = 127;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f45849m = 89;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f45850n = 21;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.d0 f45851a = new com.google.android.exoplayer2.util.d0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<i0> f45852b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f45853c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f45854d;

        public c(int i10) {
            this.f45854d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0046  */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x005d  */
        private i0.b b(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
            int iE = e0Var.e();
            int i11 = i10 + iE;
            String strTrim = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (e0Var.e() < i11) {
                int iG = e0Var.G();
                int iE2 = e0Var.e() + e0Var.G();
                if (iE2 > i11) {
                    break;
                }
                if (iG == 5) {
                    long jI = e0Var.I();
                    if (jI == h0.X) {
                        i12 = 129;
                    } else if (jI == h0.Y) {
                        i12 = 135;
                    } else if (jI == h0.Z) {
                        i12 = 172;
                    } else if (jI == h0.f45814a0) {
                        i12 = 36;
                    }
                } else if (iG == 106) {
                    i12 = 129;
                } else if (iG == 122) {
                    i12 = 135;
                } else if (iG == 127) {
                    if (e0Var.G() == 21) {
                        i12 = 172;
                    }
                } else if (iG == 123) {
                    i12 = 138;
                } else if (iG == 10) {
                    strTrim = e0Var.D(3).trim();
                } else if (iG == 89) {
                    arrayList = new ArrayList();
                    while (e0Var.e() < iE2) {
                        String strTrim2 = e0Var.D(3).trim();
                        int iG2 = e0Var.G();
                        byte[] bArr = new byte[4];
                        e0Var.k(bArr, 0, 4);
                        arrayList.add(new i0.a(strTrim2, iG2, bArr));
                    }
                    i12 = 89;
                } else if (iG == 111) {
                    i12 = 257;
                }
                e0Var.T(iE2 - e0Var.e());
            }
            e0Var.S(i11);
            return new i0.b(i12, strTrim, arrayList, Arrays.copyOfRange(e0Var.d(), iE, i11));
        }

        @Override // com.google.android.exoplayer2.extractor.ts.b0
        public void a(n0 n0Var, com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.b0
        public void c(com.google.android.exoplayer2.util.e0 e0Var) {
            n0 n0Var;
            if (e0Var.G() != 2) {
                return;
            }
            if (h0.this.f45821d == 1 || h0.this.f45821d == 2 || h0.this.f45833p == 1) {
                n0Var = (n0) h0.this.f45823f.get(0);
            } else {
                n0Var = new n0(((n0) h0.this.f45823f.get(0)).c());
                h0.this.f45823f.add(n0Var);
            }
            if ((e0Var.G() & 128) == 0) {
                return;
            }
            e0Var.T(1);
            int iM = e0Var.M();
            int i10 = 3;
            e0Var.T(3);
            e0Var.i(this.f45851a, 2);
            this.f45851a.s(3);
            int i11 = 13;
            h0.this.f45839v = this.f45851a.h(13);
            e0Var.i(this.f45851a, 2);
            int i12 = 4;
            this.f45851a.s(4);
            e0Var.T(this.f45851a.h(12));
            if (h0.this.f45821d == 2 && h0.this.f45837t == null) {
                i0.b bVar = new i0.b(21, null, null, u0.f51541f);
                h0 h0Var = h0.this;
                h0Var.f45837t = h0Var.f45826i.a(21, bVar);
                if (h0.this.f45837t != null) {
                    h0.this.f45837t.a(n0Var, h0.this.f45832o, new i0.e(iM, 21, 8192));
                }
            }
            this.f45852b.clear();
            this.f45853c.clear();
            int iA = e0Var.a();
            while (iA > 0) {
                e0Var.i(this.f45851a, 5);
                int iH = this.f45851a.h(8);
                this.f45851a.s(i10);
                int iH2 = this.f45851a.h(i11);
                this.f45851a.s(i12);
                int iH3 = this.f45851a.h(12);
                i0.b bVarB = b(e0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarB.f45888a;
                }
                iA -= iH3 + 5;
                int i13 = h0.this.f45821d == 2 ? iH : iH2;
                if (!h0.this.f45828k.get(i13)) {
                    i0 i0VarA = (h0.this.f45821d == 2 && iH == 21) ? h0.this.f45837t : h0.this.f45826i.a(iH, bVarB);
                    if (h0.this.f45821d != 2 || iH2 < this.f45853c.get(i13, 8192)) {
                        this.f45853c.put(i13, iH2);
                        this.f45852b.put(i13, i0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f45853c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f45853c.keyAt(i14);
                int iValueAt = this.f45853c.valueAt(i14);
                h0.this.f45828k.put(iKeyAt, true);
                h0.this.f45829l.put(iValueAt, true);
                i0 i0VarValueAt = this.f45852b.valueAt(i14);
                if (i0VarValueAt != null) {
                    if (i0VarValueAt != h0.this.f45837t) {
                        i0VarValueAt.a(n0Var, h0.this.f45832o, new i0.e(iM, iKeyAt, 8192));
                    }
                    h0.this.f45827j.put(iValueAt, i0VarValueAt);
                }
            }
            if (h0.this.f45821d == 2) {
                if (h0.this.f45834q) {
                    return;
                }
                h0.this.f45832o.n();
                h0.this.f45833p = 0;
                h0.this.f45834q = true;
                return;
            }
            h0.this.f45827j.remove(this.f45854d);
            h0 h0Var2 = h0.this;
            h0Var2.f45833p = h0Var2.f45821d == 1 ? 0 : h0.this.f45833p - 1;
            if (h0.this.f45833p == 0) {
                h0.this.f45832o.n();
                h0.this.f45834q = true;
            }
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i10) {
        this(1, i10, B);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new n0(0L), new j(i11), i12);
    }

    public h0(int i10, n0 n0Var, i0.c cVar) {
        this(i10, n0Var, cVar, B);
    }

    public h0(int i10, n0 n0Var, i0.c cVar, int i11) {
        this.f45826i = (i0.c) com.google.android.exoplayer2.util.a.g(cVar);
        this.f45822e = i11;
        this.f45821d = i10;
        if (i10 == 1 || i10 == 2) {
            this.f45823f = Collections.singletonList(n0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f45823f = arrayList;
            arrayList.add(n0Var);
        }
        this.f45824g = new com.google.android.exoplayer2.util.e0(new byte[9400], 0);
        this.f45828k = new SparseBooleanArray();
        this.f45829l = new SparseBooleanArray();
        this.f45827j = new SparseArray<>();
        this.f45825h = new SparseIntArray();
        this.f45830m = new f0(i11);
        this.f45832o = com.google.android.exoplayer2.extractor.m.f45083e1;
        this.f45839v = -1;
        y();
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i10 = h0Var.f45833p;
        h0Var.f45833p = i10 + 1;
        return i10;
    }

    private boolean u(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        byte[] bArrD = this.f45824g.d();
        if (9400 - this.f45824g.e() < 188) {
            int iA = this.f45824g.a();
            if (iA > 0) {
                System.arraycopy(bArrD, this.f45824g.e(), bArrD, 0, iA);
            }
            this.f45824g.Q(bArrD, iA);
        }
        while (this.f45824g.a() < 188) {
            int iF = this.f45824g.f();
            int i10 = lVar.read(bArrD, iF, 9400 - iF);
            if (i10 == -1) {
                return false;
            }
            this.f45824g.R(iF + i10);
        }
        return true;
    }

    private int v() throws ParserException {
        int iE = this.f45824g.e();
        int iF = this.f45824g.f();
        int iA = j0.a(this.f45824g.d(), iE, iF);
        this.f45824g.S(iA);
        int i10 = iA + 188;
        if (i10 > iF) {
            int i11 = this.f45838u + (iA - iE);
            this.f45838u = i11;
            if (this.f45821d == 2 && i11 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f45838u = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] w() {
        return new com.google.android.exoplayer2.extractor.k[]{new h0()};
    }

    private void x(long j10) {
        if (this.f45835r) {
            return;
        }
        this.f45835r = true;
        if (this.f45830m.b() == com.google.android.exoplayer2.j.f46377b) {
            this.f45832o.t(new com.google.android.exoplayer2.extractor.b0.b(this.f45830m.b()));
            return;
        }
        e0 e0Var = new e0(this.f45830m.c(), this.f45830m.b(), j10, this.f45839v, this.f45822e);
        this.f45831n = e0Var;
        this.f45832o.t(e0Var.b());
    }

    private void y() {
        this.f45828k.clear();
        this.f45827j.clear();
        SparseArray<i0> sparseArrayB = this.f45826i.b();
        int size = sparseArrayB.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f45827j.put(sparseArrayB.keyAt(i10), sparseArrayB.valueAt(i10));
        }
        this.f45827j.put(0, new c0(new b()));
        this.f45837t = null;
    }

    private boolean z(int i10) {
        return this.f45821d == 2 || this.f45834q || !this.f45829l.get(i10, false);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        e0 e0Var;
        com.google.android.exoplayer2.util.a.i(this.f45821d != 2);
        int size = this.f45823f.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = this.f45823f.get(i10);
            boolean z10 = n0Var.e() == com.google.android.exoplayer2.j.f46377b;
            if (!z10) {
                long jC = n0Var.c();
                z10 = (jC == com.google.android.exoplayer2.j.f46377b || jC == 0 || jC == j11) ? false : true;
            }
            if (z10) {
                n0Var.g(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f45831n) != null) {
            e0Var.h(j11);
        }
        this.f45824g.O(0);
        this.f45825h.clear();
        for (int i11 = 0; i11 < this.f45827j.size(); i11++) {
            this.f45827j.valueAt(i11).b();
        }
        this.f45838u = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f45832o = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        boolean z10;
        byte[] bArrD = this.f45824g.d();
        lVar.l(bArrD, 0, bb.c.b.f30613ef);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArrD[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                lVar.t(i10);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        long length = lVar.getLength();
        if (this.f45834q) {
            if (((length == -1 || this.f45821d == 2) ? false : true) && !this.f45830m.d()) {
                return this.f45830m.e(lVar, zVar, this.f45839v);
            }
            x(length);
            if (this.f45836s) {
                this.f45836s = false;
                a(0L, 0L);
                if (lVar.getPosition() != 0) {
                    zVar.f46218a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f45831n;
            if (e0Var != null && e0Var.d()) {
                return this.f45831n.c(lVar, zVar);
            }
        }
        if (!u(lVar)) {
            return -1;
        }
        int iV = v();
        int iF = this.f45824g.f();
        if (iV > iF) {
            return 0;
        }
        int iO = this.f45824g.o();
        if ((8388608 & iO) != 0) {
            this.f45824g.S(iV);
            return 0;
        }
        int i10 = ((4194304 & iO) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & iO) >> 8;
        boolean z10 = (iO & 32) != 0;
        i0 i0Var = (iO & 16) != 0 ? this.f45827j.get(i11) : null;
        if (i0Var == null) {
            this.f45824g.S(iV);
            return 0;
        }
        if (this.f45821d != 2) {
            int i12 = iO & 15;
            int i13 = this.f45825h.get(i11, i12 - 1);
            this.f45825h.put(i11, i12);
            if (i13 == i12) {
                this.f45824g.S(iV);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                i0Var.b();
            }
        }
        if (z10) {
            int iG = this.f45824g.G();
            i10 |= (this.f45824g.G() & 64) != 0 ? 2 : 0;
            this.f45824g.T(iG - 1);
        }
        boolean z11 = this.f45834q;
        if (z(i11)) {
            this.f45824g.R(iV);
            i0Var.c(this.f45824g, i10);
            this.f45824g.R(iF);
        }
        if (this.f45821d != 2 && !z11 && this.f45834q && length != -1) {
            this.f45836s = true;
        }
        this.f45824g.S(iV);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
