package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.e0;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45547b = 1751476579;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45548c = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45546a = 1903435808;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f45549d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, a.f45320h, a.f45329k, a.f45332l, a.f45347q, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, f45546a, 1297305174, 1684175153, 1769172332, 1885955686};

    private n() {
    }

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f45549d) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return c(lVar, true, false);
    }

    private static boolean c(com.google.android.exoplayer2.extractor.l lVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long length = lVar.getLength();
        long j10 = -1;
        long j11 = 4096;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i10 = (int) j11;
        e0 e0Var = new e0(64);
        boolean z17 = false;
        int i11 = 0;
        boolean z18 = false;
        while (true) {
            if (i11 < i10) {
                e0Var.O(8);
                if (lVar.n(e0Var.d(), z17 ? 1 : 0, 8, true)) {
                    long jI = e0Var.I();
                    int iO = e0Var.o();
                    int i12 = 16;
                    if (jI == 1) {
                        lVar.l(e0Var.d(), 8, 8);
                        e0Var.R(16);
                        jI = e0Var.z();
                    } else {
                        if (jI == 0) {
                            long length2 = lVar.getLength();
                            if (length2 != j10) {
                                jI = (length2 - lVar.q()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j12 = i12;
                    if (jI < j12) {
                        return z17;
                    }
                    i11 += i12;
                    if (iO == 1836019574) {
                        i10 += (int) jI;
                        if (length != -1 && i10 > length) {
                            i10 = (int) length;
                        }
                    } else if (iO == 1836019558 || iO == 1836475768) {
                        z12 = z17 ? 1 : 0;
                        z13 = true;
                        z14 = true;
                    } else {
                        long j13 = length;
                        if ((((long) i11) + jI) - j12 >= i10) {
                            z12 = false;
                            z13 = true;
                            z14 = z12 ? 1 : 0;
                        } else {
                            int i13 = (int) (jI - j12);
                            i11 += i13;
                            if (iO != 1718909296) {
                                z15 = false;
                                if (i13 != 0) {
                                    z18 = z18;
                                    lVar.s(i13);
                                    z18 = z18;
                                }
                            } else {
                                if (i13 < 8) {
                                    return false;
                                }
                                e0Var.O(i13);
                                lVar.l(e0Var.d(), 0, i13);
                                int i14 = i13 / 4;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= i14) {
                                        z16 = z18;
                                        break;
                                    }
                                    if (i15 == 1) {
                                        e0Var.T(4);
                                    } else if (a(e0Var.o(), z11)) {
                                        z16 = true;
                                        break;
                                    }
                                    i15++;
                                }
                                if (!z16) {
                                    return false;
                                }
                                z15 = false;
                                z18 = z16;
                            }
                            z18 = z18;
                            z17 = z15;
                            length = j13;
                        }
                    }
                    j10 = -1;
                    z18 = z18;
                }
                return (z18 || z10 != z14) ? z12 : z13;
            }
            z12 = z17 ? 1 : 0;
            z13 = true;
            z14 = z12 ? 1 : 0;
            if (z18) {
            }
        }
    }

    public static boolean d(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return c(lVar, false, false);
    }

    public static boolean e(com.google.android.exoplayer2.extractor.l lVar, boolean z10) throws IOException {
        return c(lVar, false, z10);
    }
}
