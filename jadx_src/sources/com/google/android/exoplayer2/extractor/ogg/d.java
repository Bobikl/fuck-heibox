package com.google.android.exoplayer2.extractor.ogg;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public class d implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f45624g = new q() { // from class: com.google.android.exoplayer2.extractor.ogg.c
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return d.d();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45625h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f45626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f45627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45628f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] d() {
        return new com.google.android.exoplayer2.extractor.k[]{new d()};
    }

    private static e0 e(e0 e0Var) {
        e0Var.S(0);
        return e0Var;
    }

    @mk.e(expression = {"streamReader"}, result = true)
    private boolean h(l lVar) throws IOException {
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f45641b & 2) == 2) {
            int iMin = Math.min(fVar.f45648i, 8);
            e0 e0Var = new e0(iMin);
            lVar.l(e0Var.d(), 0, iMin);
            if (b.p(e(e0Var))) {
                this.f45627e = new b();
            } else if (j.r(e(e0Var))) {
                this.f45627e = new j();
            } else if (h.o(e(e0Var))) {
                this.f45627e = new h();
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        i iVar = this.f45627e;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f45626d = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        try {
            return h(lVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.k(this.f45626d);
        if (this.f45627e == null) {
            if (!h(lVar)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            lVar.o();
        }
        if (!this.f45628f) {
            com.google.android.exoplayer2.extractor.e0 e0VarB = this.f45626d.b(0, 1);
            this.f45626d.n();
            this.f45627e.d(this.f45626d, e0VarB);
            this.f45628f = true;
        }
        return this.f45627e.g(lVar, zVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
