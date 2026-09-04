package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.o0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45378a = "AtomParsers";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f45379b = 1668047728;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f45380c = 1835299937;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f45381d = 1835365473;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f45382e = 1852009571;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f45383f = 1852009592;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f45384g = 1935832172;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45385h = 1936684398;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45386i = 1937072756;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45387j = 1952807028;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45388k = 1986618469;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45389l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f45390m = u0.y0("OpusHead");

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f45394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f45395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e0 f45396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e0 f45397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45398h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f45399i;

        public a(e0 e0Var, e0 e0Var2, boolean z10) throws ParserException {
            this.f45397g = e0Var;
            this.f45396f = e0Var2;
            this.f45395e = z10;
            e0Var2.S(12);
            this.f45391a = e0Var2.K();
            e0Var.S(12);
            this.f45399i = e0Var.K();
            com.google.android.exoplayer2.extractor.n.a(e0Var.o() == 1, "first_chunk must be 1");
            this.f45392b = -1;
        }

        public boolean a() {
            int i10 = this.f45392b + 1;
            this.f45392b = i10;
            if (i10 == this.f45391a) {
                return false;
            }
            this.f45394d = this.f45395e ? this.f45396f.L() : this.f45396f.I();
            if (this.f45392b == this.f45398h) {
                this.f45393c = this.f45397g.K();
                this.f45397g.T(4);
                int i11 = this.f45399i - 1;
                this.f45399i = i11;
                this.f45398h = i11 > 0 ? this.f45397g.K() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    public interface InterfaceC0378b {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f45400e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f45401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public a2 f45402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45404d = 0;

        public c(int i10) {
            this.f45401a = new p[i10];
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class d implements InterfaceC0378b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f45407c;

        public d(com.google.android.exoplayer2.extractor.mp4.a.b bVar, a2 a2Var) {
            e0 e0Var = bVar.C1;
            this.f45407c = e0Var;
            e0Var.S(12);
            int iK = e0Var.K();
            if (y.I.equals(a2Var.f43593m)) {
                int iO0 = u0.o0(a2Var.B, a2Var.f43606z);
                if (iK == 0 || iK % iO0 != 0) {
                    StringBuilder sb2 = new StringBuilder(88);
                    sb2.append("Audio sample size mismatch. stsd sample size: ");
                    sb2.append(iO0);
                    sb2.append(", stsz sample size: ");
                    sb2.append(iK);
                    u.m(b.f45378a, sb2.toString());
                    iK = iO0;
                }
            }
            this.f45405a = iK == 0 ? -1 : iK;
            this.f45406b = e0Var.K();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0378b
        public int a() {
            int i10 = this.f45405a;
            return i10 == -1 ? this.f45407c.K() : i10;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0378b
        public int b() {
            return this.f45406b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0378b
        public int c() {
            return this.f45405a;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class e implements InterfaceC0378b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0 f45408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45412e;

        public e(com.google.android.exoplayer2.extractor.mp4.a.b bVar) {
            e0 e0Var = bVar.C1;
            this.f45408a = e0Var;
            e0Var.S(12);
            this.f45410c = e0Var.K() & 255;
            this.f45409b = e0Var.K();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0378b
        public int a() {
            int i10 = this.f45410c;
            if (i10 == 8) {
                return this.f45408a.G();
            }
            if (i10 == 16) {
                return this.f45408a.M();
            }
            int i11 = this.f45411d;
            this.f45411d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f45412e & 15;
            }
            int iG = this.f45408a.G();
            this.f45412e = iG;
            return (iG & 240) >> 4;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0378b
        public int b() {
            return this.f45409b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.b.InterfaceC0378b
        public int c() {
            return -1;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f45414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45415c;

        public f(int i10, long j10, int i11) {
            this.f45413a = i10;
            this.f45414b = j10;
            this.f45415c = i11;
        }
    }

    private b() {
    }

    public static List<r> A(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, w wVar, long j10, @p0 DrmInitData drmInitData, boolean z10, boolean z11, com.google.common.base.n<o, o> nVar) throws ParserException {
        o oVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0377a.E1.size(); i10++) {
            com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a2 = c0377a.E1.get(i10);
            if (c0377a2.f45377a == 1953653099 && (oVarApply = nVar.apply(z(c0377a2, (com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45321h0)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(v(oVarApply, (com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(((com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(((com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(c0377a2.g(com.google.android.exoplayer2.extractor.mp4.a.f45327j0))).g(com.google.android.exoplayer2.extractor.mp4.a.f45330k0))).g(com.google.android.exoplayer2.extractor.mp4.a.f45333l0)), wVar));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> B(com.google.android.exoplayer2.extractor.mp4.a.b bVar) {
        e0 e0Var = bVar.C1;
        e0Var.S(8);
        Metadata metadataC = null;
        Metadata metadataU = null;
        while (e0Var.a() >= 8) {
            int iE = e0Var.e();
            int iO = e0Var.o();
            int iO2 = e0Var.o();
            if (iO2 == 1835365473) {
                e0Var.S(iE);
                metadataC = C(e0Var, iE + iO);
            } else if (iO2 == 1936553057) {
                e0Var.S(iE);
                metadataU = u(e0Var, iE + iO);
            }
            e0Var.S(iE + iO);
        }
        return Pair.create(metadataC, metadataU);
    }

    @p0
    private static Metadata C(e0 e0Var, int i10) {
        e0Var.T(8);
        e(e0Var);
        while (e0Var.e() < i10) {
            int iE = e0Var.e();
            int iO = e0Var.o();
            if (e0Var.o() == 1768715124) {
                e0Var.S(iE);
                return l(e0Var, iE + iO);
            }
            e0Var.S(iE + iO);
        }
        return null;
    }

    private static void D(e0 e0Var, int i10, int i11, int i12, int i13, int i14, @p0 DrmInitData drmInitData, c cVar, int i15) throws ParserException {
        String str;
        DrmInitData drmInitData2;
        byte[] bArr;
        float f10;
        List<byte[]> list;
        String str2;
        int i16 = i11;
        int i17 = i12;
        DrmInitData drmInitDataC = drmInitData;
        c cVar2 = cVar;
        e0Var.S(i16 + 8 + 8);
        e0Var.T(16);
        int iM = e0Var.M();
        int iM2 = e0Var.M();
        e0Var.T(50);
        int iE = e0Var.e();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, p> pairS = s(e0Var, i16, i17);
            if (pairS != null) {
                iIntValue = ((Integer) pairS.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((p) pairS.second).f45565b);
                cVar2.f45401a[i15] = (p) pairS.second;
            }
            e0Var.S(iE);
        }
        String str3 = y.f51576i;
        if (iIntValue == 1831958048) {
            str = y.f51592q;
        } else {
            str = iIntValue == 1211250227 ? y.f51576i : null;
        }
        float fQ = 1.0f;
        byte[] bArrR = null;
        String str4 = null;
        List<byte[]> listD = null;
        int i18 = -1;
        int iC = -1;
        int i19 = -1;
        int iD = -1;
        ByteBuffer byteBuffer = null;
        boolean z10 = false;
        while (true) {
            if (iE - i16 >= i17) {
                drmInitData2 = drmInitDataC;
                break;
            }
            e0Var.S(iE);
            int iE2 = e0Var.e();
            String str5 = str3;
            int iO = e0Var.o();
            if (iO == 0) {
                drmInitData2 = drmInitDataC;
                if (e0Var.e() - i16 == i17) {
                    break;
                }
            } else {
                drmInitData2 = drmInitDataC;
            }
            com.google.android.exoplayer2.extractor.n.a(iO > 0, "childAtomSize must be positive");
            int iO2 = e0Var.o();
            if (iO2 == 1635148611) {
                com.google.android.exoplayer2.extractor.n.a(str == null, null);
                e0Var.S(iE2 + 8);
                com.google.android.exoplayer2.video.a aVarB = com.google.android.exoplayer2.video.a.b(e0Var);
                listD = aVarB.f51696a;
                cVar2.f45403c = aVarB.f51697b;
                if (!z10) {
                    fQ = aVarB.f51700e;
                }
                str4 = aVarB.f51701f;
                str2 = "video/avc";
            } else if (iO2 == 1752589123) {
                com.google.android.exoplayer2.extractor.n.a(str == null, null);
                e0Var.S(iE2 + 8);
                com.google.android.exoplayer2.video.g gVarA = com.google.android.exoplayer2.video.g.a(e0Var);
                listD = gVarA.f51759a;
                cVar2.f45403c = gVarA.f51760b;
                if (!z10) {
                    fQ = gVarA.f51763e;
                }
                str4 = gVarA.f51764f;
                str2 = "video/hevc";
            } else {
                if (iO2 == 1685480259 || iO2 == 1685485123) {
                    iM2 = iM2;
                    iIntValue = iIntValue;
                    bArr = bArrR;
                    f10 = fQ;
                    list = listD;
                    com.google.android.exoplayer2.video.e eVarA = com.google.android.exoplayer2.video.e.a(e0Var);
                    if (eVarA != null) {
                        str4 = eVarA.f51741c;
                        str = "video/dolby-vision";
                    }
                } else if (iO2 == 1987076931) {
                    com.google.android.exoplayer2.extractor.n.a(str == null, null);
                    str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else {
                    if (iO2 == 1635135811) {
                        com.google.android.exoplayer2.extractor.n.a(str == null, null);
                        str2 = "video/av01";
                    } else if (iO2 == 1668050025) {
                        ByteBuffer byteBufferA = byteBuffer == null ? a() : byteBuffer;
                        byteBufferA.position(21);
                        byteBufferA.putShort(e0Var.C());
                        byteBufferA.putShort(e0Var.C());
                        byteBuffer = byteBufferA;
                    } else if (iO2 == 1835295606) {
                        ByteBuffer byteBufferA2 = byteBuffer == null ? a() : byteBuffer;
                        short sC = e0Var.C();
                        short sC2 = e0Var.C();
                        short sC3 = e0Var.C();
                        short sC4 = e0Var.C();
                        short sC5 = e0Var.C();
                        List<byte[]> list2 = listD;
                        short sC6 = e0Var.C();
                        byte[] bArr2 = bArrR;
                        short sC7 = e0Var.C();
                        float f11 = fQ;
                        short sC8 = e0Var.C();
                        long jI = e0Var.I();
                        long jI2 = e0Var.I();
                        byteBufferA2.position(1);
                        byteBufferA2.putShort(sC5);
                        byteBufferA2.putShort(sC6);
                        byteBufferA2.putShort(sC);
                        byteBufferA2.putShort(sC2);
                        byteBufferA2.putShort(sC3);
                        byteBufferA2.putShort(sC4);
                        byteBufferA2.putShort(sC7);
                        byteBufferA2.putShort(sC8);
                        byteBufferA2.putShort((short) (jI / 10000));
                        byteBufferA2.putShort((short) (jI2 / 10000));
                        byteBuffer = byteBufferA2;
                        listD = list2;
                        bArrR = bArr2;
                        fQ = f11;
                    } else {
                        iM2 = iM2;
                        iIntValue = iIntValue;
                        bArr = bArrR;
                        f10 = fQ;
                        list = listD;
                        if (iO2 == 1681012275) {
                            com.google.android.exoplayer2.extractor.n.a(str == null, null);
                            str = str5;
                        } else if (iO2 == 1702061171) {
                            com.google.android.exoplayer2.extractor.n.a(str == null, null);
                            Pair<String, byte[]> pairI = i(e0Var, iE2);
                            String str6 = (String) pairI.first;
                            byte[] bArr3 = (byte[]) pairI.second;
                            listD = bArr3 != null ? ImmutableList.D(bArr3) : list;
                            str = str6;
                            bArrR = bArr;
                            fQ = f10;
                        } else if (iO2 == 1885434736) {
                            fQ = q(e0Var, iE2);
                            listD = list;
                            bArrR = bArr;
                            z10 = true;
                        } else {
                            if (iO2 == 1937126244) {
                                bArrR = r(e0Var, iE2, iO);
                                listD = list;
                            } else if (iO2 == 1936995172) {
                                int iG = e0Var.G();
                                e0Var.T(3);
                                if (iG == 0) {
                                    int iG2 = e0Var.G();
                                    if (iG2 == 0) {
                                        i18 = 0;
                                    } else if (iG2 == 1) {
                                        i18 = 1;
                                    } else if (iG2 == 2) {
                                        i18 = 2;
                                    } else if (iG2 == 3) {
                                        i18 = 3;
                                    }
                                }
                            } else if (iO2 == 1668246642) {
                                int iO3 = e0Var.o();
                                if (iO3 == f45383f || iO3 == f45382e) {
                                    int iM3 = e0Var.M();
                                    int iM4 = e0Var.M();
                                    e0Var.T(2);
                                    boolean z11 = iO == 19 && (e0Var.G() & 128) != 0;
                                    iC = com.google.android.exoplayer2.video.c.c(iM3);
                                    i19 = z11 ? 1 : 2;
                                    iD = com.google.android.exoplayer2.video.c.d(iM4);
                                } else {
                                    String strValueOf = String.valueOf(com.google.android.exoplayer2.extractor.mp4.a.a(iO3));
                                    u.m(f45378a, strValueOf.length() != 0 ? "Unsupported color type: ".concat(strValueOf) : new String("Unsupported color type: "));
                                }
                            }
                            fQ = f10;
                        }
                    }
                    iE += iO;
                    i16 = i11;
                    i17 = i12;
                    cVar2 = cVar;
                    str3 = str5;
                    drmInitDataC = drmInitData2;
                    iIntValue = iIntValue;
                    iM2 = iM2;
                }
                listD = list;
                bArrR = bArr;
                fQ = f10;
                iE += iO;
                i16 = i11;
                i17 = i12;
                cVar2 = cVar;
                str3 = str5;
                drmInitDataC = drmInitData2;
                iIntValue = iIntValue;
                iM2 = iM2;
            }
            str = str2;
            iE += iO;
            i16 = i11;
            i17 = i12;
            cVar2 = cVar;
            str3 = str5;
            drmInitDataC = drmInitData2;
            iIntValue = iIntValue;
            iM2 = iM2;
        }
        int i20 = iM2;
        byte[] bArr4 = bArrR;
        float f12 = fQ;
        List<byte[]> list3 = listD;
        if (str == null) {
            return;
        }
        a2.b bVarM = new a2.b().R(i13).e0(str).I(str4).j0(iM).Q(i20).a0(f12).d0(i14).b0(bArr4).h0(i18).T(list3).M(drmInitData2);
        int i21 = iC;
        int i22 = i19;
        int i23 = iD;
        if (i21 != -1 || i22 != -1 || i23 != -1 || byteBuffer != null) {
            bVarM.J(new com.google.android.exoplayer2.video.c(i21, i22, i23, byteBuffer != null ? byteBuffer.array() : null));
        }
        cVar.f45402b = bVarM.E();
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[u0.s(4, 0, length)] && jArr[u0.s(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(e0 e0Var, int i10, int i11, int i12) throws ParserException {
        int iE = e0Var.e();
        com.google.android.exoplayer2.extractor.n.a(iE >= i11, null);
        while (iE - i11 < i12) {
            e0Var.S(iE);
            int iO = e0Var.o();
            com.google.android.exoplayer2.extractor.n.a(iO > 0, "childAtomSize must be positive");
            if (e0Var.o() == i10) {
                return iE;
            }
            iE += iO;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == f45385h) {
            return 1;
        }
        if (i10 == f45388k) {
            return 2;
        }
        if (i10 == f45387j || i10 == f45384g || i10 == f45386i || i10 == f45379b) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(e0 e0Var) {
        int iE = e0Var.e();
        e0Var.T(4);
        if (e0Var.o() != 1751411826) {
            iE += 4;
        }
        e0Var.S(iE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0163  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0198  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:169:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0302 A[SYNTHETIC] */
    private static void f(e0 e0Var, int i10, int i11, int i12, int i13, String str, boolean z10, @p0 DrmInitData drmInitData, c cVar, int i14) throws ParserException {
        int iM;
        int iH;
        int iO;
        int iK;
        int i15;
        String str2;
        String str3;
        List<byte[]> listD;
        int iO2;
        boolean z11;
        int iO3;
        int iC;
        byte[] bArr;
        boolean z12;
        int i16 = i11;
        int i17 = i12;
        DrmInitData drmInitDataC = drmInitData;
        e0Var.S(i16 + 8 + 8);
        if (z10) {
            iM = e0Var.M();
            e0Var.T(6);
        } else {
            e0Var.T(8);
            iM = 0;
        }
        if (iM == 0 || iM == 1) {
            int iM2 = e0Var.M();
            e0Var.T(6);
            iH = e0Var.H();
            e0Var.S(e0Var.e() - 4);
            iO = e0Var.o();
            if (iM == 1) {
                e0Var.T(16);
            }
            iK = iM2;
        } else {
            if (iM != 2) {
                return;
            }
            e0Var.T(16);
            iH = (int) Math.round(e0Var.m());
            iK = e0Var.K();
            e0Var.T(20);
            iO = 0;
        }
        int iE = e0Var.e();
        int iIntValue = i10;
        if (iIntValue == 1701733217) {
            Pair<Integer, p> pairS = s(e0Var, i16, i17);
            if (pairS != null) {
                iIntValue = ((Integer) pairS.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((p) pairS.second).f45565b);
                cVar.f45401a[i14] = (p) pairS.second;
            }
            e0Var.S(iE);
        }
        String str4 = y.I;
        if (iIntValue == 1633889587) {
            str4 = y.L;
        } else if (iIntValue == 1700998451) {
            str4 = y.M;
        } else if (iIntValue == 1633889588) {
            str4 = y.O;
        } else if (iIntValue == 1685353315) {
            str4 = y.Q;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str4 = y.R;
        } else if (iIntValue == 1685353317) {
            str4 = y.S;
        } else if (iIntValue == 1685353336) {
            str4 = y.T;
        } else if (iIntValue == 1935764850) {
            str4 = y.X;
        } else {
            if (iIntValue != 1935767394) {
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i15 = 2;
                } else if (iIntValue == 1953984371) {
                    i15 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str4 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str4 = y.G;
                } else if (iIntValue == 1835560241) {
                    str4 = y.H;
                } else if (iIntValue == 1634492771) {
                    str4 = y.f51561a0;
                } else if (iIntValue == 1634492791) {
                    str4 = y.J;
                } else if (iIntValue == 1970037111) {
                    str4 = y.K;
                } else if (iIntValue == 1332770163) {
                    str4 = y.V;
                } else if (iIntValue == 1716281667) {
                    str4 = y.Z;
                } else if (iIntValue == 1835823201) {
                    str4 = y.P;
                } else {
                    i15 = -1;
                    str4 = null;
                }
                str2 = str4;
                str3 = null;
                listD = null;
                while (iE - i16 < i17) {
                    e0Var.S(iE);
                    iO2 = e0Var.o();
                    if (iO2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    com.google.android.exoplayer2.extractor.n.a(z11, "childAtomSize must be positive");
                    iO3 = e0Var.o();
                    if (iO3 == 1835557187) {
                        int i18 = iO2 - 13;
                        byte[] bArr2 = new byte[i18];
                        e0Var.S(iE + 13);
                        e0Var.k(bArr2, 0, i18);
                        listD = ImmutableList.D(bArr2);
                    } else {
                        if (iO3 != 1702061171 || (z10 && iO3 == 2002876005)) {
                            if (iO3 == 1702061171) {
                                iC = iE;
                            } else {
                                iC = c(e0Var, com.google.android.exoplayer2.extractor.mp4.a.f45336m0, iE, iO2);
                            }
                            if (iC != -1) {
                                Pair<String, byte[]> pairI = i(e0Var, iC);
                                str2 = (String) pairI.first;
                                bArr = (byte[]) pairI.second;
                                if (bArr != null) {
                                    if (y.A.equals(str2)) {
                                        com.google.android.exoplayer2.audio.a.c cVarF = com.google.android.exoplayer2.audio.a.f(bArr);
                                        iH = cVarF.f44062a;
                                        iK = cVarF.f44063b;
                                        str3 = cVarF.f44064c;
                                    }
                                    listD = ImmutableList.D(bArr);
                                }
                            }
                        } else {
                            if (iO3 == 1684103987) {
                                e0Var.S(iE + 8);
                                cVar.f45402b = com.google.android.exoplayer2.audio.b.c(e0Var, Integer.toString(i13), str, drmInitDataC);
                            } else if (iO3 == 1684366131) {
                                e0Var.S(iE + 8);
                                cVar.f45402b = com.google.android.exoplayer2.audio.b.g(e0Var, Integer.toString(i13), str, drmInitDataC);
                            } else if (iO3 == 1684103988) {
                                e0Var.S(iE + 8);
                                cVar.f45402b = com.google.android.exoplayer2.audio.c.b(e0Var, Integer.toString(i13), str, drmInitDataC);
                            } else if (iO3 == 1684892784) {
                                if (iO <= 0) {
                                    StringBuilder sb2 = new StringBuilder(60);
                                    sb2.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb2.append(iO);
                                    throw ParserException.a(sb2.toString(), null);
                                }
                                iH = iO;
                                iK = 2;
                            } else if (iO3 == 1684305011) {
                                cVar.f45402b = new a2.b().R(i13).e0(str2).H(iK).f0(iH).M(drmInitDataC).V(str).E();
                            } else if (iO3 == 1682927731) {
                                int i19 = iO2 - 8;
                                byte[] bArr3 = f45390m;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i19);
                                e0Var.S(iE + 8);
                                e0Var.k(bArrCopyOf, bArr3.length, i19);
                                listD = o0.a(bArrCopyOf);
                            } else if (iO3 == 1684425825) {
                                int i20 = iO2 - 12;
                                byte[] bArr4 = new byte[i20 + 4];
                                bArr4[0] = 102;
                                bArr4[1] = org.apache.tools.tar.c.O;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                e0Var.S(iE + 12);
                                e0Var.k(bArr4, 4, i20);
                                listD = ImmutableList.D(bArr4);
                            } else if (iO3 == 1634492771) {
                                int i21 = iO2 - 12;
                                byte[] bArr5 = new byte[i21];
                                e0Var.S(iE + 12);
                                e0Var.k(bArr5, 0, i21);
                                Pair<Integer, Integer> pairG = com.google.android.exoplayer2.util.f.g(bArr5);
                                int iIntValue2 = ((Integer) pairG.first).intValue();
                                int iIntValue3 = ((Integer) pairG.second).intValue();
                                listD = ImmutableList.D(bArr5);
                                iH = iIntValue2;
                                iK = iIntValue3;
                            } else {
                                z12 = false;
                            }
                            z12 = false;
                        }
                        iE += iO2;
                        i16 = i11;
                        i17 = i12;
                    }
                    iE += iO2;
                    i16 = i11;
                    i17 = i12;
                }
                if (cVar.f45402b == null || str2 == null) {
                }
                cVar.f45402b = new a2.b().R(i13).e0(str2).I(str3).H(iK).f0(iH).Y(i15).T(listD).M(drmInitDataC).V(str).E();
                return;
            }
            str4 = y.Y;
        }
        i15 = -1;
        str2 = str4;
        str3 = null;
        listD = null;
        while (iE - i16 < i17) {
            e0Var.S(iE);
            iO2 = e0Var.o();
            if (iO2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            com.google.android.exoplayer2.extractor.n.a(z11, "childAtomSize must be positive");
            iO3 = e0Var.o();
            if (iO3 == 1835557187) {
                int i110 = iO2 - 13;
                byte[] bArr6 = new byte[i110];
                e0Var.S(iE + 13);
                e0Var.k(bArr6, 0, i110);
                listD = ImmutableList.D(bArr6);
            } else {
                if (iO3 != 1702061171) {
                    if (iO3 == 1702061171) {
                        iC = iE;
                    } else {
                        iC = c(e0Var, com.google.android.exoplayer2.extractor.mp4.a.f45336m0, iE, iO2);
                    }
                    if (iC != -1) {
                        Pair<String, byte[]> pairI2 = i(e0Var, iC);
                        str2 = (String) pairI2.first;
                        bArr = (byte[]) pairI2.second;
                        if (bArr != null) {
                            if (y.A.equals(str2)) {
                                com.google.android.exoplayer2.audio.a.c cVarF2 = com.google.android.exoplayer2.audio.a.f(bArr);
                                iH = cVarF2.f44062a;
                                iK = cVarF2.f44063b;
                                str3 = cVarF2.f44064c;
                            }
                            listD = ImmutableList.D(bArr);
                        }
                    }
                } else {
                    if (iO3 == 1702061171) {
                        iC = iE;
                    } else {
                        iC = c(e0Var, com.google.android.exoplayer2.extractor.mp4.a.f45336m0, iE, iO2);
                    }
                    if (iC != -1) {
                        Pair<String, byte[]> pairI3 = i(e0Var, iC);
                        str2 = (String) pairI3.first;
                        bArr = (byte[]) pairI3.second;
                        if (bArr != null) {
                            if (y.A.equals(str2)) {
                                com.google.android.exoplayer2.audio.a.c cVarF3 = com.google.android.exoplayer2.audio.a.f(bArr);
                                iH = cVarF3.f44062a;
                                iK = cVarF3.f44063b;
                                str3 = cVarF3.f44064c;
                            }
                            listD = ImmutableList.D(bArr);
                        }
                    }
                }
                iE += iO2;
                i16 = i11;
                i17 = i12;
            }
            iE += iO2;
            i16 = i11;
            i17 = i12;
        }
        if (cVar.f45402b == null) {
        }
    }

    @p0
    static Pair<Integer, p> g(e0 e0Var, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        String strD = null;
        Integer numValueOf = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            e0Var.S(i12);
            int iO = e0Var.o();
            int iO2 = e0Var.o();
            if (iO2 == 1718775137) {
                numValueOf = Integer.valueOf(e0Var.o());
            } else if (iO2 == 1935894637) {
                e0Var.T(4);
                strD = e0Var.D(4);
            } else if (iO2 == 1935894633) {
                i13 = i12;
                i14 = iO;
            }
            i12 += iO;
        }
        if (!com.google.android.exoplayer2.j.Q1.equals(strD) && !com.google.android.exoplayer2.j.R1.equals(strD) && !com.google.android.exoplayer2.j.S1.equals(strD) && !com.google.android.exoplayer2.j.T1.equals(strD)) {
            return null;
        }
        com.google.android.exoplayer2.extractor.n.a(numValueOf != null, "frma atom is mandatory");
        com.google.android.exoplayer2.extractor.n.a(i13 != -1, "schi atom is mandatory");
        p pVarT = t(e0Var, i13, i14, strD);
        com.google.android.exoplayer2.extractor.n.a(pVarT != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (p) u0.k(pVarT));
    }

    @p0
    private static Pair<long[], long[]> h(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a) {
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45357t0);
        if (bVarH == null) {
            return null;
        }
        e0 e0Var = bVarH.C1;
        e0Var.S(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        int iK = e0Var.K();
        long[] jArr = new long[iK];
        long[] jArr2 = new long[iK];
        for (int i10 = 0; i10 < iK; i10++) {
            jArr[i10] = iC == 1 ? e0Var.L() : e0Var.I();
            jArr2[i10] = iC == 1 ? e0Var.z() : e0Var.o();
            if (e0Var.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            e0Var.T(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> i(e0 e0Var, int i10) {
        e0Var.S(i10 + 8 + 4);
        e0Var.T(1);
        j(e0Var);
        e0Var.T(2);
        int iG = e0Var.G();
        if ((iG & 128) != 0) {
            e0Var.T(2);
        }
        if ((iG & 64) != 0) {
            e0Var.T(e0Var.M());
        }
        if ((iG & 32) != 0) {
            e0Var.T(2);
        }
        e0Var.T(1);
        j(e0Var);
        String strH = y.h(e0Var.G());
        if ("audio/mpeg".equals(strH) || y.Q.equals(strH) || y.R.equals(strH)) {
            return Pair.create(strH, null);
        }
        e0Var.T(12);
        e0Var.T(1);
        int iJ = j(e0Var);
        byte[] bArr = new byte[iJ];
        e0Var.k(bArr, 0, iJ);
        return Pair.create(strH, bArr);
    }

    private static int j(e0 e0Var) {
        int iG = e0Var.G();
        int i10 = iG & 127;
        while ((iG & 128) == 128) {
            iG = e0Var.G();
            i10 = (i10 << 7) | (iG & 127);
        }
        return i10;
    }

    private static int k(e0 e0Var) {
        e0Var.S(16);
        return e0Var.o();
    }

    @p0
    private static Metadata l(e0 e0Var, int i10) {
        e0Var.T(8);
        ArrayList arrayList = new ArrayList();
        while (e0Var.e() < i10) {
            Metadata.Entry entryC = h.c(e0Var);
            if (entryC != null) {
                arrayList.add(entryC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> m(e0 e0Var) {
        e0Var.S(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        e0Var.T(iC == 0 ? 8 : 16);
        long jI = e0Var.I();
        e0Var.T(iC == 0 ? 4 : 8);
        int iM = e0Var.M();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((iM >> 10) & 31) + 96));
        sb2.append((char) (((iM >> 5) & 31) + 96));
        sb2.append((char) ((iM & 31) + 96));
        return Pair.create(Long.valueOf(jI), sb2.toString());
    }

    @p0
    public static Metadata n(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a) {
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45363v0);
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH2 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45322h1);
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH3 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45325i1);
        if (bVarH == null || bVarH2 == null || bVarH3 == null || k(bVarH.C1) != f45380c) {
            return null;
        }
        e0 e0Var = bVarH2.C1;
        e0Var.S(12);
        int iO = e0Var.o();
        String[] strArr = new String[iO];
        for (int i10 = 0; i10 < iO; i10++) {
            int iO2 = e0Var.o();
            e0Var.T(4);
            strArr[i10] = e0Var.D(iO2 - 8);
        }
        e0 e0Var2 = bVarH3.C1;
        e0Var2.S(8);
        ArrayList arrayList = new ArrayList();
        while (e0Var2.a() > 8) {
            int iE = e0Var2.e();
            int iO3 = e0Var2.o();
            int iO4 = e0Var2.o() - 1;
            if (iO4 < 0 || iO4 >= iO) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(iO4);
                u.m(f45378a, sb2.toString());
            } else {
                MdtaMetadataEntry mdtaMetadataEntryF = h.f(e0Var2, iE + iO3, strArr[iO4]);
                if (mdtaMetadataEntryF != null) {
                    arrayList.add(mdtaMetadataEntryF);
                }
            }
            e0Var2.S(iE + iO3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void o(e0 e0Var, int i10, int i11, int i12, c cVar) {
        e0Var.S(i11 + 8 + 8);
        if (i10 == 1835365492) {
            e0Var.A();
            String strA = e0Var.A();
            if (strA != null) {
                cVar.f45402b = new a2.b().R(i12).e0(strA).E();
            }
        }
    }

    private static long p(e0 e0Var) {
        e0Var.S(8);
        e0Var.T(com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o()) != 0 ? 16 : 8);
        return e0Var.I();
    }

    private static float q(e0 e0Var, int i10) {
        e0Var.S(i10 + 8);
        return e0Var.K() / e0Var.K();
    }

    @p0
    private static byte[] r(e0 e0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            e0Var.S(i12);
            int iO = e0Var.o();
            if (e0Var.o() == 1886547818) {
                return Arrays.copyOfRange(e0Var.d(), i12, iO + i12);
            }
            i12 += iO;
        }
        return null;
    }

    @p0
    private static Pair<Integer, p> s(e0 e0Var, int i10, int i11) throws ParserException {
        Pair<Integer, p> pairG;
        int iE = e0Var.e();
        while (iE - i10 < i11) {
            e0Var.S(iE);
            int iO = e0Var.o();
            com.google.android.exoplayer2.extractor.n.a(iO > 0, "childAtomSize must be positive");
            if (e0Var.o() == 1936289382 && (pairG = g(e0Var, iE, iO)) != null) {
                return pairG;
            }
            iE += iO;
        }
        return null;
    }

    @p0
    private static p t(e0 e0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            e0Var.S(i14);
            int iO = e0Var.o();
            if (e0Var.o() == 1952804451) {
                int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
                e0Var.T(1);
                if (iC == 0) {
                    e0Var.T(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iG = e0Var.G();
                    i12 = iG & 15;
                    i13 = (iG & 240) >> 4;
                }
                boolean z10 = e0Var.G() == 1;
                int iG2 = e0Var.G();
                byte[] bArr2 = new byte[16];
                e0Var.k(bArr2, 0, 16);
                if (z10 && iG2 == 0) {
                    int iG3 = e0Var.G();
                    bArr = new byte[iG3];
                    e0Var.k(bArr, 0, iG3);
                }
                return new p(z10, str, iG2, bArr2, i13, i12, bArr);
            }
            i14 += iO;
        }
    }

    @p0
    private static Metadata u(e0 e0Var, int i10) {
        e0Var.T(12);
        while (e0Var.e() < i10) {
            int iE = e0Var.e();
            int iO = e0Var.o();
            if (e0Var.o() == 1935766900) {
                if (iO < 14) {
                    return null;
                }
                e0Var.T(5);
                int iG = e0Var.G();
                if (iG != 12 && iG != 13) {
                    return null;
                }
                float f10 = iG == 12 ? 240.0f : 120.0f;
                e0Var.T(1);
                return new Metadata(new SmtaMetadataEntry(f10, e0Var.G()));
            }
            e0Var.S(iE + iO);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x03df  */
    /* JADX WARN: Code duplicated, block: B:164:0x041a  */
    /* JADX WARN: Code duplicated, block: B:165:0x041c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0421  */
    /* JADX WARN: Code duplicated, block: B:172:0x043b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0440  */
    /* JADX WARN: Code duplicated, block: B:176:0x0443  */
    /* JADX WARN: Code duplicated, block: B:178:0x0446  */
    /* JADX WARN: Code duplicated, block: B:179:0x0449  */
    /* JADX WARN: Code duplicated, block: B:181:0x044d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0451  */
    /* JADX WARN: Code duplicated, block: B:184:0x0454  */
    /* JADX WARN: Code duplicated, block: B:188:0x0460  */
    /* JADX WARN: Code duplicated, block: B:190:0x046c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0480  */
    /* JADX WARN: Code duplicated, block: B:194:0x048c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0430 A[EDGE_INSN: B:207:0x0430->B:169:0x0430 BREAK  A[LOOP:2: B:152:0x03d2->B:168:0x0428], SYNTHETIC] */
    private static r v(o oVar, com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, w wVar) throws ParserException {
        InterfaceC0378b eVar;
        boolean z10;
        int iK;
        int iK2;
        int iK3;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        o oVar2;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i14;
        int i15;
        long j10;
        long[] jArr2;
        int iO;
        int i16;
        int i17;
        int[] iArr3;
        long j11;
        long[] jArr3;
        boolean z12;
        int[] iArr4;
        int[] iArr5;
        long[] jArr4;
        int i18;
        boolean z13;
        int i19;
        int i20;
        long[] jArr5;
        int[] iArr6;
        int i21;
        int i22;
        boolean z14;
        long[] jArr6;
        int[] iArr7;
        int[] iArr8;
        long[] jArr7;
        int i23;
        long j12;
        long j13;
        int i24;
        int i25;
        int[] iArr9;
        int[] iArr10;
        long j14;
        int[] iArr11;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z15;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.T0);
        if (bVarH != null) {
            eVar = new d(bVarH, oVar.f45557f);
        } else {
            com.google.android.exoplayer2.extractor.mp4.a.b bVarH2 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.U0);
            if (bVarH2 == null) {
                throw ParserException.a("Track has no sample table size information", null);
            }
            eVar = new e(bVarH2);
        }
        int iB = eVar.b();
        if (iB == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH3 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.V0);
        if (bVarH3 == null) {
            bVarH3 = (com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.W0));
            z10 = true;
        } else {
            z10 = false;
        }
        e0 e0Var = bVarH3.C1;
        e0 e0Var2 = ((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.S0))).C1;
        e0 e0Var3 = ((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.P0))).C1;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH4 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.Q0);
        e0 e0Var4 = bVarH4 != null ? bVarH4.C1 : null;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH5 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.R0);
        e0 e0Var5 = bVarH5 != null ? bVarH5.C1 : null;
        a aVar = new a(e0Var2, e0Var, z10);
        e0Var3.S(12);
        int iK4 = e0Var3.K() - 1;
        int iK5 = e0Var3.K();
        int iK6 = e0Var3.K();
        if (e0Var5 != null) {
            e0Var5.S(12);
            iK = e0Var5.K();
        } else {
            iK = 0;
        }
        if (e0Var4 != null) {
            e0Var4.S(12);
            iK3 = e0Var4.K();
            if (iK3 > 0) {
                iK2 = e0Var4.K() - 1;
            } else {
                iK2 = -1;
                e0Var4 = null;
            }
        } else {
            iK2 = -1;
            iK3 = 0;
        }
        int iC = eVar.c();
        String str = oVar.f45557f.f43593m;
        if (iC != -1 && (y.I.equals(str) || y.K.equals(str) || y.J.equals(str)) && iK4 == 0 && iK == 0 && iK3 == 0) {
            int i30 = aVar.f45391a;
            long[] jArr8 = new long[i30];
            int[] iArr12 = new int[i30];
            while (aVar.a()) {
                int i31 = aVar.f45392b;
                jArr8[i31] = aVar.f45394d;
                iArr12[i31] = aVar.f45393c;
            }
            com.google.android.exoplayer2.extractor.mp4.d.b bVarA = com.google.android.exoplayer2.extractor.mp4.d.a(iC, jArr8, iArr12, iK6);
            long[] jArr9 = bVarA.f45421a;
            int[] iArr13 = bVarA.f45422b;
            int i32 = bVarA.f45423c;
            long[] jArr10 = bVarA.f45424d;
            int[] iArr14 = bVarA.f45425e;
            long j15 = bVarA.f45426f;
            i15 = iB;
            jArr = jArr9;
            iArr = iArr13;
            i14 = i32;
            jArr2 = jArr10;
            iArr2 = iArr14;
            j10 = j15;
            oVar2 = oVar;
        } else {
            long[] jArrCopyOf = new long[iB];
            int[] iArrCopyOf = new int[iB];
            long[] jArrCopyOf2 = new long[iB];
            int[] iArrCopyOf2 = new int[iB];
            int iK7 = iK2;
            int i33 = 0;
            int i34 = 0;
            int iO2 = 0;
            int i35 = 0;
            int iK8 = 0;
            long j16 = 0;
            long j17 = 0;
            int i36 = iK;
            int i37 = iK6;
            int i38 = iK5;
            int i39 = iK4;
            int i40 = iK3;
            while (true) {
                i10 = i39;
                if (i33 >= iB) {
                    i11 = i38;
                    i12 = i35;
                    break;
                }
                long j18 = j17;
                int i41 = i35;
                boolean zA = true;
                while (i41 == 0) {
                    zA = aVar.a();
                    if (!zA) {
                        break;
                    }
                    int i42 = i38;
                    long j19 = aVar.f45394d;
                    i41 = aVar.f45393c;
                    j18 = j19;
                    i38 = i42;
                    i37 = i37;
                    iB = iB;
                }
                int i43 = iB;
                i11 = i38;
                int i44 = i37;
                if (!zA) {
                    u.m(f45378a, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i33);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i33);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i33);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i33);
                    iB = i33;
                    i12 = i41;
                    break;
                }
                if (e0Var5 != null) {
                    while (iK8 == 0 && i36 > 0) {
                        iK8 = e0Var5.K();
                        iO2 = e0Var5.o();
                        i36--;
                    }
                    iK8--;
                }
                int i45 = iO2;
                jArrCopyOf[i33] = j18;
                int iA = eVar.a();
                iArrCopyOf[i33] = iA;
                if (iA > i34) {
                    i34 = iA;
                }
                jArrCopyOf2[i33] = j16 + ((long) i45);
                iArrCopyOf2[i33] = e0Var4 == null ? 1 : 0;
                if (i33 == iK7) {
                    iArrCopyOf2[i33] = 1;
                    i40--;
                    if (i40 > 0) {
                        iK7 = ((e0) com.google.android.exoplayer2.util.a.g(e0Var4)).K() - 1;
                    }
                }
                int i46 = iK7;
                j16 += (long) i44;
                int iK9 = i11 - 1;
                if (iK9 != 0 || i10 <= 0) {
                    iO = i44;
                    i16 = i10;
                } else {
                    iK9 = e0Var3.K();
                    iO = e0Var3.o();
                    i16 = i10 - 1;
                }
                int i47 = iK9;
                long j20 = j18 + ((long) iArrCopyOf[i33]);
                i35 = i41 - 1;
                i33++;
                j17 = j20;
                iK7 = i46;
                i37 = iO;
                iB = i43;
                iO2 = i45;
                i39 = i16;
                i38 = i47;
            }
            long j21 = j16 + ((long) iO2);
            if (e0Var5 == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i36 <= 0) {
                    z11 = true;
                    break;
                }
                if (e0Var5.K() != 0) {
                    z11 = false;
                    break;
                }
                e0Var5.o();
                i36--;
            }
            if (i40 == 0 && i11 == 0 && i12 == 0 && i10 == 0) {
                i13 = iK8;
                if (i13 == 0 && z11) {
                    oVar2 = oVar;
                }
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                iArr2 = iArrCopyOf2;
                i14 = i34;
                i15 = iB;
                j10 = j21;
                jArr2 = jArrCopyOf2;
            } else {
                i13 = iK8;
            }
            oVar2 = oVar;
            int i48 = oVar2.f45552a;
            String str2 = !z11 ? ", ctts invalid" : "";
            StringBuilder sb2 = new StringBuilder(str2.length() + bb.c.b.f30553c2);
            sb2.append("Inconsistent stbl box for track ");
            sb2.append(i48);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i40);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(i11);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i12);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i10);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i13);
            sb2.append(str2);
            u.m(f45378a, sb2.toString());
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            iArr2 = iArrCopyOf2;
            i14 = i34;
            i15 = iB;
            j10 = j21;
            jArr2 = jArrCopyOf2;
        }
        long jJ1 = u0.j1(j10, 1000000L, oVar2.f45554c);
        long[] jArr11 = oVar2.f45559h;
        if (jArr11 == null) {
            u0.l1(jArr2, 1000000L, oVar2.f45554c);
            return new r(oVar, jArr, iArr, i14, jArr2, iArr2, jJ1);
        }
        if (jArr11.length == 1 && oVar2.f45553b == 1 && jArr2.length >= 2) {
            long j22 = ((long[]) com.google.android.exoplayer2.util.a.g(oVar2.f45560i))[0];
            long jJ2 = j22 + u0.j1(oVar2.f45559h[0], oVar2.f45554c, oVar2.f45555d);
            i17 = i15;
            if (b(jArr2, j10, j22, jJ2)) {
                long jJ3 = u0.j1(j22 - jArr2[0], oVar2.f45557f.A, oVar2.f45554c);
                iArr3 = iArr2;
                j11 = j10;
                long jJ4 = u0.j1(j10 - jJ2, oVar2.f45557f.A, oVar2.f45554c);
                if ((jJ3 != 0 || jJ4 != 0) && jJ3 <= 2147483647L && jJ4 <= 2147483647L) {
                    wVar.f46211a = (int) jJ3;
                    wVar.f46212b = (int) jJ4;
                    u0.l1(jArr2, 1000000L, oVar2.f45554c);
                    return new r(oVar, jArr, iArr, i14, jArr2, iArr3, u0.j1(oVar2.f45559h[0], 1000000L, oVar2.f45555d));
                }
            }
            jArr3 = oVar2.f45559h;
            if (jArr3.length != 1 && jArr3[0] == 0) {
                long j23 = ((long[]) com.google.android.exoplayer2.util.a.g(oVar2.f45560i))[0];
                for (int i49 = 0; i49 < jArr2.length; i49++) {
                    jArr2[i49] = u0.j1(jArr2[i49] - j23, 1000000L, oVar2.f45554c);
                }
                return new r(oVar, jArr, iArr, i14, jArr2, iArr3, u0.j1(j11 - j23, 1000000L, oVar2.f45554c));
            }
            if (oVar2.f45553b == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            iArr4 = new int[jArr3.length];
            iArr5 = new int[jArr3.length];
            jArr4 = (long[]) com.google.android.exoplayer2.util.a.g(oVar2.f45560i);
            i18 = 0;
            z13 = false;
            i19 = 0;
            i20 = 0;
            while (true) {
                jArr5 = oVar2.f45559h;
                if (i18 < jArr5.length) {
                    break;
                }
                j14 = jArr4[i18];
                if (j14 != -1) {
                    i27 = i20;
                    iArr11 = iArr;
                    long jJ5 = u0.j1(jArr5[i18], oVar2.f45554c, oVar2.f45555d);
                    iArr4[i18] = u0.j(jArr2, j14, true, true);
                    iArr5[i18] = u0.f(jArr2, j14 + jJ5, z12, false);
                    while (true) {
                        i28 = iArr4[i18];
                        i29 = iArr5[i18];
                        if (i28 >= i29 || (iArr3[i28] & 1) != 0) {
                            break;
                        }
                        iArr4[i18] = i28 + 1;
                    }
                    i19 += i29 - i28;
                    if (i27 != i28) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z13 = z15 | z13;
                    i26 = i29;
                } else {
                    iArr11 = iArr;
                    i26 = i20;
                }
                i18++;
                i20 = i26;
                i14 = i14;
                iArr = iArr11;
            }
            iArr6 = iArr;
            i21 = i14;
            i22 = 0;
            z14 = z13 | (i19 != i17);
            if (z14) {
                jArr6 = new long[i19];
            } else {
                jArr6 = jArr;
            }
            if (z14) {
                iArr7 = new int[i19];
            } else {
                iArr7 = iArr6;
            }
            if (z14) {
                i21 = 0;
            }
            if (z14) {
                iArr8 = new int[i19];
            } else {
                iArr8 = iArr3;
            }
            jArr7 = new long[i19];
            i23 = 0;
            j12 = 0;
            while (i22 < oVar2.f45559h.length) {
                j13 = oVar2.f45560i[i22];
                i24 = iArr4[i22];
                i25 = iArr5[i22];
                int[] iArr15 = iArr5;
                if (z14) {
                    int i50 = i25 - i24;
                    System.arraycopy(jArr, i24, jArr6, i23, i50);
                    iArr9 = iArr6;
                    System.arraycopy(iArr9, i24, iArr7, i23, i50);
                    iArr10 = iArr3;
                    System.arraycopy(iArr10, i24, iArr8, i23, i50);
                } else {
                    iArr9 = iArr6;
                    iArr10 = iArr3;
                }
                int i51 = i21;
                while (i24 < i25) {
                    int[] iArr16 = iArr10;
                    int i52 = i22;
                    long j24 = j12;
                    long[] jArr12 = jArr2;
                    int i53 = i24;
                    jArr7[i23] = u0.j1(j12, 1000000L, oVar2.f45555d) + u0.j1(Math.max(0L, jArr2[i24] - j13), 1000000L, oVar2.f45554c);
                    if (!z14 && iArr7[i23] > i51) {
                        i51 = iArr9[i53];
                    }
                    i23++;
                    i24 = i53 + 1;
                    jArr2 = jArr12;
                    j12 = j24;
                    i22 = i52;
                    iArr10 = iArr16;
                }
                iArr3 = iArr10;
                int i54 = i22;
                j12 += oVar2.f45559h[i54];
                i22 = i54 + 1;
                i21 = i51;
                iArr5 = iArr15;
                jArr = jArr;
                jArr2 = jArr2;
                iArr6 = iArr9;
                iArr4 = iArr4;
            }
            return new r(oVar, jArr6, iArr7, i21, jArr7, iArr8, u0.j1(j12, 1000000L, oVar2.f45555d));
        }
        i17 = i15;
        iArr3 = iArr2;
        j11 = j10;
        jArr3 = oVar2.f45559h;
        if (jArr3.length != 1) {
        }
        if (oVar2.f45553b == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        iArr4 = new int[jArr3.length];
        iArr5 = new int[jArr3.length];
        jArr4 = (long[]) com.google.android.exoplayer2.util.a.g(oVar2.f45560i);
        i18 = 0;
        z13 = false;
        i19 = 0;
        i20 = 0;
        while (true) {
            jArr5 = oVar2.f45559h;
            if (i18 < jArr5.length) {
                break;
                break;
            }
            j14 = jArr4[i18];
            if (j14 != -1) {
                i27 = i20;
                iArr11 = iArr;
                long jJ6 = u0.j1(jArr5[i18], oVar2.f45554c, oVar2.f45555d);
                iArr4[i18] = u0.j(jArr2, j14, true, true);
                iArr5[i18] = u0.f(jArr2, j14 + jJ6, z12, false);
                while (true) {
                    i28 = iArr4[i18];
                    i29 = iArr5[i18];
                    if (i28 >= i29) {
                        break;
                    }
                    break;
                    break;
                    iArr4[i18] = i28 + 1;
                }
                i19 += i29 - i28;
                if (i27 != i28) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z13 = z15 | z13;
                i26 = i29;
            } else {
                iArr11 = iArr;
                i26 = i20;
            }
            i18++;
            i20 = i26;
            i14 = i14;
            iArr = iArr11;
        }
        iArr6 = iArr;
        i21 = i14;
        i22 = 0;
        z14 = z13 | (i19 != i17);
        if (z14) {
            jArr6 = new long[i19];
        } else {
            jArr6 = jArr;
        }
        if (z14) {
            iArr7 = new int[i19];
        } else {
            iArr7 = iArr6;
        }
        if (z14) {
            i21 = 0;
        }
        if (z14) {
            iArr8 = new int[i19];
        } else {
            iArr8 = iArr3;
        }
        jArr7 = new long[i19];
        i23 = 0;
        j12 = 0;
        while (i22 < oVar2.f45559h.length) {
            j13 = oVar2.f45560i[i22];
            i24 = iArr4[i22];
            i25 = iArr5[i22];
            int[] iArr17 = iArr5;
            if (z14) {
                int i55 = i25 - i24;
                System.arraycopy(jArr, i24, jArr6, i23, i55);
                iArr9 = iArr6;
                System.arraycopy(iArr9, i24, iArr7, i23, i55);
                iArr10 = iArr3;
                System.arraycopy(iArr10, i24, iArr8, i23, i55);
            } else {
                iArr9 = iArr6;
                iArr10 = iArr3;
            }
            int i56 = i21;
            while (i24 < i25) {
                int[] iArr18 = iArr10;
                int i57 = i22;
                long j25 = j12;
                long[] jArr13 = jArr2;
                int i58 = i24;
                jArr7[i23] = u0.j1(j12, 1000000L, oVar2.f45555d) + u0.j1(Math.max(0L, jArr2[i24] - j13), 1000000L, oVar2.f45554c);
                if (!z14) {
                }
                i23++;
                i24 = i58 + 1;
                jArr2 = jArr13;
                j12 = j25;
                i22 = i57;
                iArr10 = iArr18;
            }
            iArr3 = iArr10;
            int i59 = i22;
            j12 += oVar2.f45559h[i59];
            i22 = i59 + 1;
            i21 = i56;
            iArr5 = iArr17;
            jArr = jArr;
            jArr2 = jArr2;
            iArr6 = iArr9;
            iArr4 = iArr4;
        }
        return new r(oVar, jArr6, iArr7, i21, jArr7, iArr8, u0.j1(j12, 1000000L, oVar2.f45555d));
    }

    private static c w(e0 e0Var, int i10, int i11, String str, @p0 DrmInitData drmInitData, boolean z10) throws ParserException {
        int i12;
        e0Var.S(12);
        int iO = e0Var.o();
        c cVar = new c(iO);
        for (int i13 = 0; i13 < iO; i13++) {
            int iE = e0Var.e();
            int iO2 = e0Var.o();
            com.google.android.exoplayer2.extractor.n.a(iO2 > 0, "childAtomSize must be positive");
            int iO3 = e0Var.o();
            if (iO3 == 1635148593 || iO3 == 1635148595 || iO3 == 1701733238 || iO3 == 1831958048 || iO3 == 1836070006 || iO3 == 1752589105 || iO3 == 1751479857 || iO3 == 1932670515 || iO3 == 1211250227 || iO3 == 1987063864 || iO3 == 1987063865 || iO3 == 1635135537 || iO3 == 1685479798 || iO3 == 1685479729 || iO3 == 1685481573 || iO3 == 1685481521) {
                i12 = iE;
                D(e0Var, iO3, i12, iO2, i10, i11, drmInitData, cVar, i13);
            } else if (iO3 == 1836069985 || iO3 == 1701733217 || iO3 == 1633889587 || iO3 == 1700998451 || iO3 == 1633889588 || iO3 == 1835823201 || iO3 == 1685353315 || iO3 == 1685353317 || iO3 == 1685353320 || iO3 == 1685353324 || iO3 == 1685353336 || iO3 == 1935764850 || iO3 == 1935767394 || iO3 == 1819304813 || iO3 == 1936684916 || iO3 == 1953984371 || iO3 == 778924082 || iO3 == 778924083 || iO3 == 1835557169 || iO3 == 1835560241 || iO3 == 1634492771 || iO3 == 1634492791 || iO3 == 1970037111 || iO3 == 1332770163 || iO3 == 1716281667) {
                i12 = iE;
                f(e0Var, iO3, iE, iO2, i10, str, z10, drmInitData, cVar, i13);
            } else {
                if (iO3 == 1414810956 || iO3 == 1954034535 || iO3 == 2004251764 || iO3 == 1937010800 || iO3 == 1664495672) {
                    x(e0Var, iO3, iE, iO2, i10, str, cVar);
                } else if (iO3 == 1835365492) {
                    o(e0Var, iO3, iE, i10, cVar);
                } else if (iO3 == 1667329389) {
                    cVar.f45402b = new a2.b().R(i10).e0(y.B0).E();
                }
                i12 = iE;
            }
            e0Var.S(i12 + iO2);
        }
        return cVar;
    }

    private static void x(e0 e0Var, int i10, int i11, int i12, int i13, String str, c cVar) {
        e0Var.S(i11 + 8 + 8);
        String str2 = y.f51599t0;
        ImmutableList immutableListD = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                e0Var.k(bArr, 0, i14);
                immutableListD = ImmutableList.D(bArr);
                str2 = y.f51601u0;
            } else if (i10 == 2004251764) {
                str2 = y.f51603v0;
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                cVar.f45404d = 1;
                str2 = y.f51605w0;
            }
        }
        cVar.f45402b = new a2.b().R(i13).e0(str2).V(str).i0(j10).T(immutableListD).E();
    }

    private static f y(e0 e0Var) {
        boolean z10;
        e0Var.S(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        e0Var.T(iC == 0 ? 8 : 16);
        int iO = e0Var.o();
        e0Var.T(4);
        int iE = e0Var.e();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (e0Var.d()[iE + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = com.google.android.exoplayer2.j.f46377b;
        if (z10) {
            e0Var.T(i10);
        } else {
            long jI = iC == 0 ? e0Var.I() : e0Var.L();
            if (jI != 0) {
                j10 = jI;
            }
        }
        e0Var.T(16);
        int iO2 = e0Var.o();
        int iO3 = e0Var.o();
        e0Var.T(4);
        int iO4 = e0Var.o();
        int iO5 = e0Var.o();
        if (iO2 == 0 && iO3 == 65536 && iO4 == -65536 && iO5 == 0) {
            i11 = 90;
        } else if (iO2 == 0 && iO3 == -65536 && iO4 == 65536 && iO5 == 0) {
            i11 = 270;
        } else if (iO2 == -65536 && iO3 == 0 && iO4 == 0 && iO5 == -65536) {
            i11 = 180;
        }
        return new f(iO, j10, i11);
    }

    @p0
    private static o z(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, com.google.android.exoplayer2.extractor.mp4.a.b bVar, long j10, @p0 DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377aG;
        Pair<long[], long[]> pairH;
        com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a2 = (com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(c0377a.g(com.google.android.exoplayer2.extractor.mp4.a.f45327j0));
        int iD = d(k(((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a2.h(com.google.android.exoplayer2.extractor.mp4.a.f45363v0))).C1));
        if (iD == -1) {
            return null;
        }
        f fVarY = y(((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45351r0))).C1);
        long jJ1 = com.google.android.exoplayer2.j.f46377b;
        long j11 = j10 == com.google.android.exoplayer2.j.f46377b ? fVarY.f45414b : j10;
        long jP = p(bVar.C1);
        if (j11 != com.google.android.exoplayer2.j.f46377b) {
            jJ1 = u0.j1(j11, 1000000L, jP);
        }
        long j12 = jJ1;
        com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a3 = (com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(((com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(c0377a2.g(com.google.android.exoplayer2.extractor.mp4.a.f45330k0))).g(com.google.android.exoplayer2.extractor.mp4.a.f45333l0));
        Pair<Long, String> pairM = m(((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a2.h(com.google.android.exoplayer2.extractor.mp4.a.f45360u0))).C1);
        c cVarW = w(((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a3.h(com.google.android.exoplayer2.extractor.mp4.a.f45366w0))).C1, fVarY.f45413a, fVarY.f45415c, (String) pairM.second, drmInitData, z11);
        if (z10 || (c0377aG = c0377a.g(com.google.android.exoplayer2.extractor.mp4.a.f45354s0)) == null || (pairH = h(c0377aG)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairH.first;
            jArr2 = (long[]) pairH.second;
            jArr = jArr3;
        }
        if (cVarW.f45402b == null) {
            return null;
        }
        return new o(fVarY.f45413a, iD, ((Long) pairM.first).longValue(), jP, j12, cVarW.f45402b, cVarW.f45404d, cVarW.f45401a, cVarW.f45403c, jArr, jArr2);
    }
}
