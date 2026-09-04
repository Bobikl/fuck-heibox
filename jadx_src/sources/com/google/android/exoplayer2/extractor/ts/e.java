package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.q f45757g = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.ts.d
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return e.d();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45758h = 8192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45759i = 16384;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45760j = 7;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f45761d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45762e = new com.google.android.exoplayer2.util.e0(16384);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45763f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] d() {
        return new com.google.android.exoplayer2.extractor.k[]{new e()};
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        this.f45763f = false;
        this.f45761d.b();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f45761d.f(mVar, new i0.e(0, 1));
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
            lVar.l(e0Var.d(), 0, 7);
            e0Var.S(0);
            int iM = e0Var.M();
            if (iM == 44096 || iM == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iE = com.google.android.exoplayer2.audio.c.e(e0Var.d(), iM);
                if (iE == -1) {
                    return false;
                }
                lVar.s(iE - 7);
            } else {
                lVar.o();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.s(i12);
                i11 = 0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        int i10 = lVar.read(this.f45762e.d(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f45762e.S(0);
        this.f45762e.R(i10);
        if (!this.f45763f) {
            this.f45761d.e(0L, 4);
            this.f45763f = true;
        }
        this.f45761d.c(this.f45762e);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
