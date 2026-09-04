package com.google.android.exoplayer2.source.dash.offline;

import androidx.annotation.p0;
import androidx.profileinstaller.f;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.d0;
import com.google.android.exoplayer2.source.dash.i;
import com.google.android.exoplayer2.source.dash.k;
import com.google.android.exoplayer2.source.dash.manifest.c;
import com.google.android.exoplayer2.source.dash.manifest.d;
import com.google.android.exoplayer2.source.dash.manifest.g;
import com.google.android.exoplayer2.source.dash.manifest.j;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DashDownloader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends d0<c> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.b f47991m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.offline.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DashDownloader.java */
    public class C0383a extends h0<e, IOException> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ o f47992i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f47993j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ j f47994k;

        C0383a(a aVar, o oVar, int i10, j jVar) {
            this.f47992i = oVar;
            this.f47993j = i10;
            this.f47994k = jVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.h0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public e d() throws IOException {
            return com.google.android.exoplayer2.source.dash.j.d(this.f47992i, this.f47993j, this.f47994k);
        }
    }

    public a(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar) {
        this(i2Var, dVar, new f());
    }

    public a(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        this(i2Var, new d(), dVar, executor);
    }

    public a(i2 i2Var, i0.a<c> aVar, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        super(i2Var, aVar, dVar, executor);
        this.f47991m = new com.google.android.exoplayer2.source.dash.b();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7 A[SYNTHETIC] */
    private void l(o oVar, com.google.android.exoplayer2.source.dash.manifest.a aVar, long j10, long j11, boolean z10, ArrayList<d0.c> arrayList) throws InterruptedException, IOException {
        for (int i10 = 0; i10 < aVar.f47863c.size(); i10++) {
            j jVar = aVar.f47863c.get(i10);
            try {
                try {
                    i iVarN = n(oVar, aVar.f47862b, jVar, z10);
                    if (iVarN != null) {
                        long jF = iVarN.f(j11);
                        if (jF == -1) {
                            throw new DownloadException("Unbounded segment index");
                        }
                        String str = ((com.google.android.exoplayer2.source.dash.manifest.b) u0.k(this.f47991m.j(jVar.f47924d))).f47869a;
                        com.google.android.exoplayer2.source.dash.manifest.i iVarN2 = jVar.n();
                        if (iVarN2 != null) {
                            arrayList.add(m(jVar, str, j10, iVarN2));
                        }
                        com.google.android.exoplayer2.source.dash.manifest.i iVarM = jVar.m();
                        if (iVarM != null) {
                            arrayList.add(m(jVar, str, j10, iVarM));
                        }
                        long jG = iVarN.g();
                        long j12 = (jG + jF) - 1;
                        for (long j13 = jG; j13 <= j12; j13++) {
                            arrayList.add(m(jVar, str, j10 + iVarN.c(j13), iVarN.h(j13)));
                        }
                    } else {
                        try {
                            throw new DownloadException("Missing segment index");
                        } catch (IOException e10) {
                            e = e10;
                            if (z10) {
                                throw e;
                            }
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    if (z10) {
                        throw e;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
    }

    private d0.c m(j jVar, String str, long j10, com.google.android.exoplayer2.source.dash.manifest.i iVar) {
        return new d0.c(j10, com.google.android.exoplayer2.source.dash.j.b(jVar, str, iVar, 0));
    }

    @p0
    private i n(o oVar, int i10, j jVar, boolean z10) throws InterruptedException, IOException {
        i iVarL = jVar.l();
        if (iVarL != null) {
            return iVarL;
        }
        e eVar = (e) e(new C0383a(this, oVar, i10, jVar), z10);
        if (eVar == null) {
            return null;
        }
        return new k(eVar, jVar.f47925e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.d0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public List<d0.c> h(o oVar, c cVar, boolean z10) throws InterruptedException, IOException {
        ArrayList<d0.c> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < cVar.e(); i10++) {
            g gVarD = cVar.d(i10);
            long jU0 = u0.U0(gVarD.f47908b);
            long jG = cVar.g(i10);
            int i11 = 0;
            for (List<com.google.android.exoplayer2.source.dash.manifest.a> list = gVarD.f47909c; i11 < list.size(); list = list) {
                l(oVar, list.get(i11), jU0, jG, z10, arrayList);
                i11++;
            }
        }
        return arrayList;
    }
}
