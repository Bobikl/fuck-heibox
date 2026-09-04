package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f45685a = 1716281667;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f45686b = 16382;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45687c = 18;

    /* JADX INFO: compiled from: FlacMetadataReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public u f45688a;

        public a(@p0 u uVar) {
            this.f45688a = uVar;
        }
    }

    private s() {
    }

    public static boolean a(l lVar) throws IOException {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(4);
        lVar.l(e0Var.d(), 0, 4);
        return e0Var.I() == 1716281667;
    }

    public static int b(l lVar) throws IOException {
        lVar.o();
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(2);
        lVar.l(e0Var.d(), 0, 2);
        int iM = e0Var.M();
        if ((iM >> 2) == f45686b) {
            lVar.o();
            return iM;
        }
        lVar.o();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    @p0
    public static Metadata c(l lVar, boolean z10) throws IOException {
        Metadata metadataA = new x().a(lVar, z10 ? null : com.google.android.exoplayer2.metadata.id3.b.f46932b);
        if (metadataA == null || metadataA.d() == 0) {
            return null;
        }
        return metadataA;
    }

    @p0
    public static Metadata d(l lVar, boolean z10) throws IOException {
        lVar.o();
        long jQ = lVar.q();
        Metadata metadataC = c(lVar, z10);
        lVar.t((int) (lVar.q() - jQ));
        return metadataC;
    }

    public static boolean e(l lVar, a aVar) throws IOException {
        lVar.o();
        com.google.android.exoplayer2.util.d0 d0Var = new com.google.android.exoplayer2.util.d0(new byte[4]);
        lVar.l(d0Var.f51383a, 0, 4);
        boolean zG = d0Var.g();
        int iH = d0Var.h(7);
        int iH2 = d0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f45688a = i(lVar);
        } else {
            u uVar = aVar.f45688a;
            if (uVar == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                aVar.f45688a = uVar.c(g(lVar, iH2));
            } else if (iH == 4) {
                aVar.f45688a = uVar.d(k(lVar, iH2));
            } else if (iH == 6) {
                aVar.f45688a = uVar.b(Collections.singletonList(f(lVar, iH2)));
            } else {
                lVar.t(iH2);
            }
        }
        return zG;
    }

    private static PictureFrame f(l lVar, int i10) throws IOException {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(i10);
        lVar.readFully(e0Var.d(), 0, i10);
        e0Var.T(4);
        int iO = e0Var.o();
        String strE = e0Var.E(e0Var.o(), com.google.common.base.c.f56719a);
        String strD = e0Var.D(e0Var.o());
        int iO2 = e0Var.o();
        int iO3 = e0Var.o();
        int iO4 = e0Var.o();
        int iO5 = e0Var.o();
        int iO6 = e0Var.o();
        byte[] bArr = new byte[iO6];
        e0Var.k(bArr, 0, iO6);
        return new PictureFrame(iO, strE, strD, iO2, iO3, iO4, iO5, bArr);
    }

    private static u.a g(l lVar, int i10) throws IOException {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(i10);
        lVar.readFully(e0Var.d(), 0, i10);
        return h(e0Var);
    }

    public static u.a h(com.google.android.exoplayer2.util.e0 e0Var) {
        e0Var.T(1);
        int iJ = e0Var.J();
        long jE = ((long) e0Var.e()) + ((long) iJ);
        int i10 = iJ / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jZ = e0Var.z();
            if (jZ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZ;
            jArrCopyOf2[i11] = e0Var.z();
            e0Var.T(2);
        }
        e0Var.T((int) (jE - ((long) e0Var.e())));
        return new u.a(jArrCopyOf, jArrCopyOf2);
    }

    private static u i(l lVar) throws IOException {
        byte[] bArr = new byte[38];
        lVar.readFully(bArr, 0, 38);
        return new u(bArr, 4);
    }

    public static void j(l lVar) throws IOException {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(4);
        lVar.readFully(e0Var.d(), 0, 4);
        if (e0Var.I() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> k(l lVar, int i10) throws IOException {
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(i10);
        lVar.readFully(e0Var.d(), 0, i10);
        e0Var.T(4);
        return Arrays.asList(h0.i(e0Var, false, false).f45025b);
    }
}
