package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.e0;
import java.io.IOException;

/* JADX INFO: compiled from: JpegExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements k {
    private static final int A = 1024;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45042n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45043o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45044p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45045q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f45046r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45047s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f45048t = 6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f45049u = 1165519206;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f45050v = 65496;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f45051w = 65498;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f45052x = 65504;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f45053y = 65505;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f45054z = "http://ns.adobe.com/xap/1.0/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f45056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45059h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private MotionPhotoMetadata f45061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f45062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f45063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.extractor.mp4.k f45064m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f45055d = new e0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f45060i = -1;

    private void c(l lVar) throws IOException {
        this.f45055d.O(2);
        lVar.l(this.f45055d.d(), 0, 2);
        lVar.s(this.f45055d.M() - 2);
    }

    private void d() {
        h(new Metadata.Entry[0]);
        ((m) com.google.android.exoplayer2.util.a.g(this.f45056e)).n();
        this.f45056e.t(new b0.b(j.f46377b));
        this.f45057f = 6;
    }

    @p0
    private static MotionPhotoMetadata e(String str, long j10) throws IOException {
        b bVarA;
        if (j10 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j10);
    }

    private void h(Metadata.Entry... entryArr) {
        ((m) com.google.android.exoplayer2.util.a.g(this.f45056e)).b(1024, 4).d(new a2.b().K("image/jpeg").X(new Metadata(entryArr)).E());
    }

    private int i(l lVar) throws IOException {
        this.f45055d.O(2);
        lVar.l(this.f45055d.d(), 0, 2);
        return this.f45055d.M();
    }

    private void j(l lVar) throws IOException {
        this.f45055d.O(2);
        lVar.readFully(this.f45055d.d(), 0, 2);
        int iM = this.f45055d.M();
        this.f45058g = iM;
        if (iM == f45051w) {
            if (this.f45060i != -1) {
                this.f45057f = 4;
                return;
            } else {
                d();
                return;
            }
        }
        if ((iM < 65488 || iM > 65497) && iM != 65281) {
            this.f45057f = 1;
        }
    }

    private void k(l lVar) throws IOException {
        String strA;
        if (this.f45058g == f45053y) {
            e0 e0Var = new e0(this.f45059h);
            lVar.readFully(e0Var.d(), 0, this.f45059h);
            if (this.f45061j == null && f45054z.equals(e0Var.A()) && (strA = e0Var.A()) != null) {
                MotionPhotoMetadata motionPhotoMetadataE = e(strA, lVar.getLength());
                this.f45061j = motionPhotoMetadataE;
                if (motionPhotoMetadataE != null) {
                    this.f45060i = motionPhotoMetadataE.f46960e;
                }
            }
        } else {
            lVar.t(this.f45059h);
        }
        this.f45057f = 0;
    }

    private void l(l lVar) throws IOException {
        this.f45055d.O(2);
        lVar.readFully(this.f45055d.d(), 0, 2);
        this.f45059h = this.f45055d.M() - 2;
        this.f45057f = 2;
    }

    private void m(l lVar) throws IOException {
        if (!lVar.n(this.f45055d.d(), 0, 1, true)) {
            d();
            return;
        }
        lVar.o();
        if (this.f45064m == null) {
            this.f45064m = new com.google.android.exoplayer2.extractor.mp4.k();
        }
        c cVar = new c(lVar, this.f45060i);
        this.f45063l = cVar;
        if (!this.f45064m.f(cVar)) {
            d();
        } else {
            this.f45064m.b(new d(this.f45060i, (m) com.google.android.exoplayer2.util.a.g(this.f45056e)));
            n();
        }
    }

    private void n() {
        h((Metadata.Entry) com.google.android.exoplayer2.util.a.g(this.f45061j));
        this.f45057f = 5;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f45057f = 0;
            this.f45064m = null;
        } else if (this.f45057f == 5) {
            ((com.google.android.exoplayer2.extractor.mp4.k) com.google.android.exoplayer2.util.a.g(this.f45064m)).a(j10, j11);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(m mVar) {
        this.f45056e = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(l lVar) throws IOException {
        if (i(lVar) != f45050v) {
            return false;
        }
        int i10 = i(lVar);
        this.f45058g = i10;
        if (i10 == f45052x) {
            c(lVar);
            this.f45058g = i(lVar);
        }
        if (this.f45058g != f45053y) {
            return false;
        }
        lVar.s(2);
        this.f45055d.O(6);
        lVar.l(this.f45055d.d(), 0, 6);
        return this.f45055d.I() == f45049u && this.f45055d.M() == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(l lVar, z zVar) throws IOException {
        int i10 = this.f45057f;
        if (i10 == 0) {
            j(lVar);
            return 0;
        }
        if (i10 == 1) {
            l(lVar);
            return 0;
        }
        if (i10 == 2) {
            k(lVar);
            return 0;
        }
        if (i10 == 4) {
            long position = lVar.getPosition();
            long j10 = this.f45060i;
            if (position != j10) {
                zVar.f46218a = j10;
                return 1;
            }
            m(lVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f45063l == null || lVar != this.f45062k) {
            this.f45062k = lVar;
            this.f45063l = new c(lVar, this.f45060i);
        }
        int iG = ((com.google.android.exoplayer2.extractor.mp4.k) com.google.android.exoplayer2.util.a.g(this.f45064m)).g(this.f45063l, zVar);
        if (iG == 1) {
            zVar.f46218a += this.f45060i;
        }
        return iG;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
        com.google.android.exoplayer2.extractor.mp4.k kVar = this.f45064m;
        if (kVar != null) {
            kVar.release();
        }
    }
}
