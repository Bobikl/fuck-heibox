package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f46098g = "Id3Reader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f46100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46101c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46104f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46099a = new com.google.android.exoplayer2.util.e0(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f46102d = com.google.android.exoplayer2.j.f46377b;

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f46101c = false;
        this.f46102d = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.util.a.k(this.f46100b);
        if (this.f46101c) {
            int iA = e0Var.a();
            int i10 = this.f46104f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(e0Var.d(), e0Var.e(), this.f46099a.d(), this.f46104f, iMin);
                if (this.f46104f + iMin == 10) {
                    this.f46099a.S(0);
                    if (73 != this.f46099a.G() || 68 != this.f46099a.G() || 51 != this.f46099a.G()) {
                        com.google.android.exoplayer2.util.u.m(f46098g, "Discarding invalid ID3 tag");
                        this.f46101c = false;
                        return;
                    } else {
                        this.f46099a.T(3);
                        this.f46103e = this.f46099a.F() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f46103e - this.f46104f);
            this.f46100b.c(e0Var, iMin2);
            this.f46104f += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
        int i10;
        com.google.android.exoplayer2.util.a.k(this.f46100b);
        if (this.f46101c && (i10 = this.f46103e) != 0 && this.f46104f == i10) {
            long j10 = this.f46102d;
            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                this.f46100b.e(j10, 1, i10, 0, null);
            }
            this.f46101c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f46101c = true;
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46102d = j10;
        }
        this.f46103e = 0;
        this.f46104f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 5);
        this.f46100b = e0VarB;
        e0VarB.d(new a2.b().S(eVar.b()).e0(com.google.android.exoplayer2.util.y.f51591p0).E());
    }
}
