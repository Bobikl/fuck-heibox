package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: DashUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {
    private j() {
    }

    public static r a(com.google.android.exoplayer2.source.dash.manifest.j jVar, com.google.android.exoplayer2.source.dash.manifest.i iVar, int i10) {
        return b(jVar, jVar.f47924d.get(0).f47869a, iVar, i10);
    }

    public static r b(com.google.android.exoplayer2.source.dash.manifest.j jVar, String str, com.google.android.exoplayer2.source.dash.manifest.i iVar, int i10) {
        return new r.b().j(iVar.b(str)).i(iVar.f47917a).h(iVar.f47918b).g(n(jVar, iVar)).c(i10).a();
    }

    @p0
    private static com.google.android.exoplayer2.source.dash.manifest.j c(com.google.android.exoplayer2.source.dash.manifest.g gVar, int i10) {
        int iA = gVar.a(i10);
        if (iA == -1) {
            return null;
        }
        List<com.google.android.exoplayer2.source.dash.manifest.j> list = gVar.f47909c.get(iA).f47863c;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @p0
    public static com.google.android.exoplayer2.extractor.e d(com.google.android.exoplayer2.upstream.o oVar, int i10, com.google.android.exoplayer2.source.dash.manifest.j jVar) throws IOException {
        return e(oVar, i10, jVar, 0);
    }

    @p0
    public static com.google.android.exoplayer2.extractor.e e(com.google.android.exoplayer2.upstream.o oVar, int i10, com.google.android.exoplayer2.source.dash.manifest.j jVar, int i11) throws IOException {
        if (jVar.n() == null) {
            return null;
        }
        com.google.android.exoplayer2.source.chunk.g gVarM = m(i10, jVar.f47923c);
        try {
            g(gVarM, oVar, jVar, i11, true);
            return gVarM.d();
        } finally {
            gVarM.release();
        }
    }

    @p0
    public static a2 f(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.source.dash.manifest.g gVar) throws IOException {
        int i10 = 2;
        com.google.android.exoplayer2.source.dash.manifest.j jVarC = c(gVar, 2);
        if (jVarC == null) {
            i10 = 1;
            jVarC = c(gVar, 1);
            if (jVarC == null) {
                return null;
            }
        }
        a2 a2Var = jVarC.f47923c;
        a2 a2VarK = k(oVar, i10, jVarC);
        return a2VarK == null ? a2Var : a2VarK.B(a2Var);
    }

    private static void g(com.google.android.exoplayer2.source.chunk.g gVar, com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.source.dash.manifest.j jVar, int i10, boolean z10) throws IOException {
        com.google.android.exoplayer2.source.dash.manifest.i iVar = (com.google.android.exoplayer2.source.dash.manifest.i) com.google.android.exoplayer2.util.a.g(jVar.n());
        if (z10) {
            com.google.android.exoplayer2.source.dash.manifest.i iVarM = jVar.m();
            if (iVarM == null) {
                return;
            }
            com.google.android.exoplayer2.source.dash.manifest.i iVarA = iVar.a(iVarM, jVar.f47924d.get(i10).f47869a);
            if (iVarA == null) {
                i(oVar, jVar, i10, gVar, iVar);
                iVar = iVarM;
            } else {
                iVar = iVarA;
            }
        }
        i(oVar, jVar, i10, gVar, iVar);
    }

    public static void h(com.google.android.exoplayer2.source.chunk.g gVar, com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.source.dash.manifest.j jVar, boolean z10) throws IOException {
        g(gVar, oVar, jVar, 0, z10);
    }

    private static void i(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.source.dash.manifest.j jVar, int i10, com.google.android.exoplayer2.source.chunk.g gVar, com.google.android.exoplayer2.source.dash.manifest.i iVar) throws IOException {
        new com.google.android.exoplayer2.source.chunk.m(oVar, b(jVar, jVar.f47924d.get(i10).f47869a, iVar, 0), jVar.f47923c, 0, null, gVar).a();
    }

    public static com.google.android.exoplayer2.source.dash.manifest.c j(com.google.android.exoplayer2.upstream.o oVar, Uri uri) throws IOException {
        return (com.google.android.exoplayer2.source.dash.manifest.c) i0.g(oVar, new com.google.android.exoplayer2.source.dash.manifest.d(), uri, 4);
    }

    @p0
    public static a2 k(com.google.android.exoplayer2.upstream.o oVar, int i10, com.google.android.exoplayer2.source.dash.manifest.j jVar) throws IOException {
        return l(oVar, i10, jVar, 0);
    }

    @p0
    public static a2 l(com.google.android.exoplayer2.upstream.o oVar, int i10, com.google.android.exoplayer2.source.dash.manifest.j jVar, int i11) throws IOException {
        if (jVar.n() == null) {
            return null;
        }
        com.google.android.exoplayer2.source.chunk.g gVarM = m(i10, jVar.f47923c);
        try {
            g(gVarM, oVar, jVar, i11, false);
            return ((a2[]) com.google.android.exoplayer2.util.a.k(gVarM.e()))[0];
        } finally {
            gVarM.release();
        }
    }

    private static com.google.android.exoplayer2.source.chunk.g m(int i10, a2 a2Var) {
        String str = a2Var.f43592l;
        return new com.google.android.exoplayer2.source.chunk.e(str != null && (str.startsWith(y.f51574h) || str.startsWith(y.C)) ? new com.google.android.exoplayer2.extractor.mkv.e() : new com.google.android.exoplayer2.extractor.mp4.g(), i10, a2Var);
    }

    public static String n(com.google.android.exoplayer2.source.dash.manifest.j jVar, com.google.android.exoplayer2.source.dash.manifest.i iVar) {
        String strK = jVar.k();
        return strK != null ? strK : iVar.b(jVar.f47924d.get(0).f47869a).toString();
    }
}
