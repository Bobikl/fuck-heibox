package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.d0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: BundledChunkExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements com.google.android.exoplayer2.extractor.m, g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g.a f47629k = new g.a() { // from class: com.google.android.exoplayer2.source.chunk.d
        @Override // com.google.android.exoplayer2.source.chunk.g.a
        public final g a(int i10, a2 a2Var, boolean z10, List list, e0 e0Var) {
            return e.g(i10, a2Var, z10, list, e0Var);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final z f47630l = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.k f47631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f47633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<a> f47634e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private g.b f47636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b0 f47638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a2[] f47639j;

    /* JADX INFO: compiled from: BundledChunkExtractor.java */
    public static final class a implements e0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f47640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f47641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private final a2 f47642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.j f47643g = new com.google.android.exoplayer2.extractor.j();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a2 f47644h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private e0 f47645i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f47646j;

        public a(int i10, int i11, @p0 a2 a2Var) {
            this.f47640d = i10;
            this.f47641e = i11;
            this.f47642f = a2Var;
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public int a(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10, int i11) throws IOException {
            return ((e0) u0.k(this.f47645i)).b(kVar, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public /* synthetic */ int b(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) {
            return d0.a(this, kVar, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public /* synthetic */ void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
            d0.b(this, e0Var, i10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void d(a2 a2Var) {
            a2 a2Var2 = this.f47642f;
            if (a2Var2 != null) {
                a2Var = a2Var.B(a2Var2);
            }
            this.f47644h = a2Var;
            ((e0) u0.k(this.f47645i)).d(this.f47644h);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void e(long j10, int i10, int i11, int i12, @p0 e0.a aVar) {
            long j11 = this.f47646j;
            if (j11 != com.google.android.exoplayer2.j.f46377b && j10 >= j11) {
                this.f47645i = this.f47643g;
            }
            ((e0) u0.k(this.f47645i)).e(j10, i10, i11, i12, aVar);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void f(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11) {
            ((e0) u0.k(this.f47645i)).c(e0Var, i10);
        }

        public void g(@p0 g.b bVar, long j10) {
            if (bVar == null) {
                this.f47645i = this.f47643g;
                return;
            }
            this.f47646j = j10;
            e0 e0VarB = bVar.b(this.f47640d, this.f47641e);
            this.f47645i = e0VarB;
            a2 a2Var = this.f47644h;
            if (a2Var != null) {
                e0VarB.d(a2Var);
            }
        }
    }

    public e(com.google.android.exoplayer2.extractor.k kVar, int i10, a2 a2Var) {
        this.f47631b = kVar;
        this.f47632c = i10;
        this.f47633d = a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g g(int i10, a2 a2Var, boolean z10, List list, e0 e0Var) {
        com.google.android.exoplayer2.extractor.k gVar;
        String str = a2Var.f43592l;
        if (y.s(str)) {
            if (!y.f51607x0.equals(str)) {
                return null;
            }
            gVar = new p8.a(a2Var);
        } else if (y.r(str)) {
            gVar = new com.google.android.exoplayer2.extractor.mkv.e(1);
        } else {
            gVar = new com.google.android.exoplayer2.extractor.mp4.g(z10 ? 4 : 0, null, null, list, e0Var);
        }
        return new e(gVar, i10, a2Var);
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    public boolean a(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int iG = this.f47631b.g(lVar, f47630l);
        com.google.android.exoplayer2.util.a.i(iG != 1);
        return iG == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public e0 b(int i10, int i11) {
        a aVar = this.f47634e.get(i10);
        if (aVar == null) {
            com.google.android.exoplayer2.util.a.i(this.f47639j == null);
            aVar = new a(i10, i11, i11 == this.f47632c ? this.f47633d : null);
            aVar.g(this.f47636g, this.f47637h);
            this.f47634e.put(i10, aVar);
        }
        return aVar;
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    public void c(@p0 g.b bVar, long j10, long j11) {
        this.f47636g = bVar;
        this.f47637h = j11;
        if (!this.f47635f) {
            this.f47631b.b(this);
            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                this.f47631b.a(0L, j10);
            }
            this.f47635f = true;
            return;
        }
        com.google.android.exoplayer2.extractor.k kVar = this.f47631b;
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            j10 = 0;
        }
        kVar.a(0L, j10);
        for (int i10 = 0; i10 < this.f47634e.size(); i10++) {
            this.f47634e.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    @p0
    public com.google.android.exoplayer2.extractor.e d() {
        b0 b0Var = this.f47638i;
        if (b0Var instanceof com.google.android.exoplayer2.extractor.e) {
            return (com.google.android.exoplayer2.extractor.e) b0Var;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    @p0
    public a2[] e() {
        return this.f47639j;
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void n() {
        a2[] a2VarArr = new a2[this.f47634e.size()];
        for (int i10 = 0; i10 < this.f47634e.size(); i10++) {
            a2VarArr[i10] = (a2) com.google.android.exoplayer2.util.a.k(this.f47634e.valueAt(i10).f47644h);
        }
        this.f47639j = a2VarArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    public void release() {
        this.f47631b.release();
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void t(b0 b0Var) {
        this.f47638i = b0Var;
    }
}
