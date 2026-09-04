package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.q f45723g = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.ts.a
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45724h = 8192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45725i = 2935;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45726j = 2786;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f45727d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45728e = new com.google.android.exoplayer2.util.e0(2786);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45729f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] d() {
        return new com.google.android.exoplayer2.extractor.k[]{new b()};
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f45729f = false;
        this.f45727d.b();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f45727d.f(mVar, new i0.e(0, 1));
        mVar.n();
        mVar.t(new com.google.android.exoplayer2.extractor.b0.b(com.google.android.exoplayer2.j.f46377b));
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(10);
        int i10 = 0;
        while (true) {
            lVar.l(e0Var.d(), 0, 10);
            e0Var.S(0);
            if (e0Var.J() != 4801587) {
                break;
            }
            e0Var.T(3);
            int iF = e0Var.F();
            i10 += iF + 10;
            lVar.s(iF);
        }
        lVar.o();
        lVar.s(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.l(e0Var.d(), 0, 6);
            e0Var.S(0);
            if (e0Var.M() != 2935) {
                lVar.o();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.s(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iF2 = com.google.android.exoplayer2.audio.b.f(e0Var.d());
                if (iF2 == -1) {
                    return false;
                }
                lVar.s(iF2 - 6);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        int i10 = lVar.read(this.f45728e.d(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f45728e.S(0);
        this.f45728e.R(i10);
        if (!this.f45729f) {
            this.f45727d.e(0L, 4);
            this.f45729f = true;
        }
        this.f45727d.c(this.f45728e);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
