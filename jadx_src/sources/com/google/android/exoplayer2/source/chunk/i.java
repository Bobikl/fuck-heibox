package com.google.android.exoplayer2.source.chunk;

import android.os.Looper;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.u;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.c1;
import com.google.android.exoplayer2.source.chunk.j;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.e1;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ChunkSampleStream.java */
/* JADX INFO: loaded from: classes7.dex */
public class i<T extends j> implements d1, e1, Loader.b<f>, Loader.f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f47658y = "ChunkSampleStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f47660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2[] f47661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f47662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T f47663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e1.a<i<T>> f47664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n0.a f47665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g0 f47666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Loader f47667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h f47668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<com.google.android.exoplayer2.source.chunk.a> f47669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<com.google.android.exoplayer2.source.chunk.a> f47670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c1 f47671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c1[] f47672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f47673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private f f47674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a2 f47675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private b<T> f47676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f47677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f47678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f47679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.source.chunk.a f47680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f47681x;

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public final class a implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i<T> f47682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c1 f47683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f47684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47685e;

        public a(i<T> iVar, c1 c1Var, int i10) {
            this.f47682b = iVar;
            this.f47683c = c1Var;
            this.f47684d = i10;
        }

        private void a() {
            if (this.f47685e) {
                return;
            }
            i.this.f47665h.i(i.this.f47660c[this.f47684d], i.this.f47661d[this.f47684d], 0, null, i.this.f47678u);
            this.f47685e = true;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() {
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.f47680w != null && i.this.f47680w.i(this.f47684d + 1) <= this.f47683c.D()) {
                return -3;
            }
            a();
            return this.f47683c.T(b2Var, decoderInputBuffer, i10, i.this.f47681x);
        }

        public void d() {
            com.google.android.exoplayer2.util.a.i(i.this.f47662e[this.f47684d]);
            i.this.f47662e[this.f47684d] = false;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return !i.this.I() && this.f47683c.L(i.this.f47681x);
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            if (i.this.I()) {
                return 0;
            }
            int iF = this.f47683c.F(j10, i.this.f47681x);
            if (i.this.f47680w != null) {
                iF = Math.min(iF, i.this.f47680w.i(this.f47684d + 1) - this.f47683c.D());
            }
            this.f47683c.f0(iF);
            if (iF > 0) {
                a();
            }
            return iF;
        }
    }

    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public interface b<T extends j> {
        void b(i<T> iVar);
    }

    public i(int i10, @p0 int[] iArr, @p0 a2[] a2VarArr, T t10, e1.a<i<T>> aVar, com.google.android.exoplayer2.upstream.b bVar, long j10, u uVar, com.google.android.exoplayer2.drm.s.a aVar2, g0 g0Var, n0.a aVar3) {
        this.f47659b = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f47660c = iArr;
        this.f47661d = a2VarArr == null ? new a2[0] : a2VarArr;
        this.f47663f = t10;
        this.f47664g = aVar;
        this.f47665h = aVar3;
        this.f47666i = g0Var;
        this.f47667j = new Loader(f47658y);
        this.f47668k = new h();
        ArrayList<com.google.android.exoplayer2.source.chunk.a> arrayList = new ArrayList<>();
        this.f47669l = arrayList;
        this.f47670m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f47672o = new c1[length];
        this.f47662e = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        c1[] c1VarArr = new c1[i12];
        c1 c1VarK = c1.k(bVar, (Looper) com.google.android.exoplayer2.util.a.g(Looper.myLooper()), uVar, aVar2);
        this.f47671n = c1VarK;
        iArr2[0] = i10;
        c1VarArr[0] = c1VarK;
        while (i11 < length) {
            c1 c1VarL = c1.l(bVar);
            this.f47672o[i11] = c1VarL;
            int i13 = i11 + 1;
            c1VarArr[i13] = c1VarL;
            iArr2[i13] = this.f47660c[i11];
            i11 = i13;
        }
        this.f47673p = new c(iArr2, c1VarArr);
        this.f47677t = j10;
        this.f47678u = j10;
    }

    private void B(int i10) {
        int iMin = Math.min(O(i10, 0), this.f47679v);
        if (iMin > 0) {
            u0.h1(this.f47669l, 0, iMin);
            this.f47679v -= iMin;
        }
    }

    private void C(int i10) {
        com.google.android.exoplayer2.util.a.i(!this.f47667j.k());
        int size = this.f47669l.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!G(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = F().f47654h;
        com.google.android.exoplayer2.source.chunk.a aVarD = D(i10);
        if (this.f47669l.isEmpty()) {
            this.f47677t = this.f47678u;
        }
        this.f47681x = false;
        this.f47665h.D(this.f47659b, aVarD.f47653g, j10);
    }

    private com.google.android.exoplayer2.source.chunk.a D(int i10) {
        com.google.android.exoplayer2.source.chunk.a aVar = this.f47669l.get(i10);
        ArrayList<com.google.android.exoplayer2.source.chunk.a> arrayList = this.f47669l;
        u0.h1(arrayList, i10, arrayList.size());
        this.f47679v = Math.max(this.f47679v, this.f47669l.size());
        int i11 = 0;
        this.f47671n.v(aVar.i(0));
        while (true) {
            c1[] c1VarArr = this.f47672o;
            if (i11 >= c1VarArr.length) {
                return aVar;
            }
            c1 c1Var = c1VarArr[i11];
            i11++;
            c1Var.v(aVar.i(i11));
        }
    }

    private com.google.android.exoplayer2.source.chunk.a F() {
        ArrayList<com.google.android.exoplayer2.source.chunk.a> arrayList = this.f47669l;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean G(int i10) {
        int iD;
        com.google.android.exoplayer2.source.chunk.a aVar = this.f47669l.get(i10);
        if (this.f47671n.D() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.f47672o;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            iD = c1VarArr[i11].D();
            i11++;
        } while (iD <= aVar.i(i11));
        return true;
    }

    private boolean H(f fVar) {
        return fVar instanceof com.google.android.exoplayer2.source.chunk.a;
    }

    private void J() {
        int iO = O(this.f47671n.D(), this.f47679v - 1);
        while (true) {
            int i10 = this.f47679v;
            if (i10 > iO) {
                return;
            }
            this.f47679v = i10 + 1;
            K(i10);
        }
    }

    private void K(int i10) {
        com.google.android.exoplayer2.source.chunk.a aVar = this.f47669l.get(i10);
        a2 a2Var = aVar.f47650d;
        if (!a2Var.equals(this.f47675r)) {
            this.f47665h.i(this.f47659b, a2Var, aVar.f47651e, aVar.f47652f, aVar.f47653g);
        }
        this.f47675r = a2Var;
    }

    private int O(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f47669l.size()) {
                return this.f47669l.size() - 1;
            }
        } while (this.f47669l.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void R() {
        this.f47671n.W();
        for (c1 c1Var : this.f47672o) {
            c1Var.W();
        }
    }

    public T E() {
        return this.f47663f;
    }

    boolean I() {
        return this.f47677t != com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void p(f fVar, long j10, long j11, boolean z10) {
        this.f47674q = null;
        this.f47680w = null;
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f47666i.c(fVar.f47647a);
        this.f47665h.r(uVar, fVar.f47649c, this.f47659b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h);
        if (z10) {
            return;
        }
        if (I()) {
            R();
        } else if (H(fVar)) {
            D(this.f47669l.size() - 1);
            if (this.f47669l.isEmpty()) {
                this.f47677t = this.f47678u;
            }
        }
        this.f47664g.n(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void q(f fVar, long j10, long j11) {
        this.f47674q = null;
        this.f47663f.g(fVar);
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f47666i.c(fVar.f47647a);
        this.f47665h.u(uVar, fVar.f47649c, this.f47659b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h);
        this.f47664g.n(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public Loader.c s(f fVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarI;
        long jB = fVar.b();
        boolean zH = H(fVar);
        int size = this.f47669l.size() - 1;
        boolean z10 = (jB != 0 && zH && G(size)) ? false : true;
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, fVar.f(), fVar.e(), j10, j11, jB);
        g0.d dVar = new g0.d(uVar, new y(fVar.f47649c, this.f47659b, fVar.f47650d, fVar.f47651e, fVar.f47652f, u0.B1(fVar.f47653g), u0.B1(fVar.f47654h)), iOException, i10);
        if (!this.f47663f.d(fVar, z10, dVar, this.f47666i)) {
            cVarI = null;
        } else if (z10) {
            cVarI = Loader.f50885k;
            if (zH) {
                com.google.android.exoplayer2.util.a.i(D(size) == fVar);
                if (this.f47669l.isEmpty()) {
                    this.f47677t = this.f47678u;
                }
            }
        } else {
            com.google.android.exoplayer2.util.u.m(f47658y, "Ignoring attempt to cancel non-cancelable load.");
            cVarI = null;
        }
        if (cVarI == null) {
            long jA = this.f47666i.a(dVar);
            cVarI = jA != com.google.android.exoplayer2.j.f46377b ? Loader.i(false, jA) : Loader.f50886l;
        }
        boolean z11 = !cVarI.c();
        this.f47665h.w(uVar, fVar.f47649c, this.f47659b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h, iOException, z11);
        if (z11) {
            this.f47674q = null;
            this.f47666i.c(fVar.f47647a);
            this.f47664g.n(this);
        }
        return cVarI;
    }

    public void P() {
        Q(null);
    }

    public void Q(@p0 b<T> bVar) {
        this.f47676s = bVar;
        this.f47671n.S();
        for (c1 c1Var : this.f47672o) {
            c1Var.S();
        }
        this.f47667j.m(this);
    }

    public void S(long j10) {
        this.f47678u = j10;
        if (I()) {
            this.f47677t = j10;
            return;
        }
        com.google.android.exoplayer2.source.chunk.a aVar = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f47669l.size(); i11++) {
            com.google.android.exoplayer2.source.chunk.a aVar2 = this.f47669l.get(i11);
            long j11 = aVar2.f47653g;
            if (j11 == j10 && aVar2.f47619k == com.google.android.exoplayer2.j.f46377b) {
                aVar = aVar2;
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        if (aVar != null ? this.f47671n.Z(aVar.i(0)) : this.f47671n.a0(j10, j10 < g())) {
            this.f47679v = O(this.f47671n.D(), 0);
            c1[] c1VarArr = this.f47672o;
            int length = c1VarArr.length;
            while (i10 < length) {
                c1VarArr[i10].a0(j10, true);
                i10++;
            }
            return;
        }
        this.f47677t = j10;
        this.f47681x = false;
        this.f47669l.clear();
        this.f47679v = 0;
        if (!this.f47667j.k()) {
            this.f47667j.h();
            R();
            return;
        }
        this.f47671n.r();
        c1[] c1VarArr2 = this.f47672o;
        int length2 = c1VarArr2.length;
        while (i10 < length2) {
            c1VarArr2[i10].r();
            i10++;
        }
        this.f47667j.g();
    }

    public i<T>.a T(long j10, int i10) {
        for (int i11 = 0; i11 < this.f47672o.length; i11++) {
            if (this.f47660c[i11] == i10) {
                com.google.android.exoplayer2.util.a.i(!this.f47662e[i11]);
                this.f47662e[i11] = true;
                this.f47672o[i11].a0(j10, true);
                return new a(this, this.f47672o[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f47667j.k();
    }

    @Override // com.google.android.exoplayer2.source.d1
    public void b() throws IOException {
        this.f47667j.b();
        this.f47671n.O();
        if (this.f47667j.k()) {
            return;
        }
        this.f47663f.b();
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (I()) {
            return -3;
        }
        com.google.android.exoplayer2.source.chunk.a aVar = this.f47680w;
        if (aVar != null && aVar.i(0) <= this.f47671n.D()) {
            return -3;
        }
        J();
        return this.f47671n.T(b2Var, decoderInputBuffer, i10, this.f47681x);
    }

    @Override // com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        List<com.google.android.exoplayer2.source.chunk.a> listEmptyList;
        long j11;
        if (this.f47681x || this.f47667j.k() || this.f47667j.j()) {
            return false;
        }
        boolean zI = I();
        if (zI) {
            listEmptyList = Collections.emptyList();
            j11 = this.f47677t;
        } else {
            listEmptyList = this.f47670m;
            j11 = F().f47654h;
        }
        this.f47663f.j(j10, j11, listEmptyList, this.f47668k);
        h hVar = this.f47668k;
        boolean z10 = hVar.f47657b;
        f fVar = hVar.f47656a;
        hVar.a();
        if (z10) {
            this.f47677t = com.google.android.exoplayer2.j.f46377b;
            this.f47681x = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.f47674q = fVar;
        if (H(fVar)) {
            com.google.android.exoplayer2.source.chunk.a aVar = (com.google.android.exoplayer2.source.chunk.a) fVar;
            if (zI) {
                long j12 = aVar.f47653g;
                long j13 = this.f47677t;
                if (j12 != j13) {
                    this.f47671n.c0(j13);
                    for (c1 c1Var : this.f47672o) {
                        c1Var.c0(this.f47677t);
                    }
                }
                this.f47677t = com.google.android.exoplayer2.j.f46377b;
            }
            aVar.k(this.f47673p);
            this.f47669l.add(aVar);
        } else if (fVar instanceof m) {
            ((m) fVar).g(this.f47673p);
        }
        this.f47665h.A(new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, this.f47667j.n(fVar, this, this.f47666i.d(fVar.f47649c))), fVar.f47649c, this.f47659b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public long e() {
        if (this.f47681x) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f47677t;
        }
        long jMax = this.f47678u;
        com.google.android.exoplayer2.source.chunk.a aVarF = F();
        if (!aVarF.h()) {
            if (this.f47669l.size() > 1) {
                ArrayList<com.google.android.exoplayer2.source.chunk.a> arrayList = this.f47669l;
                aVarF = arrayList.get(arrayList.size() - 2);
            } else {
                aVarF = null;
            }
        }
        if (aVarF != null) {
            jMax = Math.max(jMax, aVarF.f47654h);
        }
        return Math.max(jMax, this.f47671n.A());
    }

    @Override // com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        if (this.f47667j.j() || I()) {
            return;
        }
        if (!this.f47667j.k()) {
            int iE = this.f47663f.e(j10, this.f47670m);
            if (iE < this.f47669l.size()) {
                C(iE);
                return;
            }
            return;
        }
        f fVar = (f) com.google.android.exoplayer2.util.a.g(this.f47674q);
        if (!(H(fVar) && G(this.f47669l.size() - 1)) && this.f47663f.c(j10, fVar, this.f47670m)) {
            this.f47667j.g();
            if (H(fVar)) {
                this.f47680w = (com.google.android.exoplayer2.source.chunk.a) fVar;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.e1
    public long g() {
        if (I()) {
            return this.f47677t;
        }
        if (this.f47681x) {
            return Long.MIN_VALUE;
        }
        return F().f47654h;
    }

    public long h(long j10, r3 r3Var) {
        return this.f47663f.h(j10, r3Var);
    }

    @Override // com.google.android.exoplayer2.source.d1
    public boolean isReady() {
        return !I() && this.f47671n.L(this.f47681x);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void m() {
        this.f47671n.U();
        for (c1 c1Var : this.f47672o) {
            c1Var.U();
        }
        this.f47663f.release();
        b<T> bVar = this.f47676s;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int n(long j10) {
        if (I()) {
            return 0;
        }
        int iF = this.f47671n.F(j10, this.f47681x);
        com.google.android.exoplayer2.source.chunk.a aVar = this.f47680w;
        if (aVar != null) {
            iF = Math.min(iF, aVar.i(0) - this.f47671n.D());
        }
        this.f47671n.f0(iF);
        J();
        return iF;
    }

    public void v(long j10, boolean z10) {
        if (I()) {
            return;
        }
        int iY = this.f47671n.y();
        this.f47671n.q(j10, z10, true);
        int iY2 = this.f47671n.y();
        if (iY2 > iY) {
            long jZ = this.f47671n.z();
            int i10 = 0;
            while (true) {
                c1[] c1VarArr = this.f47672o;
                if (i10 >= c1VarArr.length) {
                    break;
                }
                c1VarArr[i10].q(jZ, z10, this.f47662e[i10]);
                i10++;
            }
        }
        B(iY2);
    }
}
