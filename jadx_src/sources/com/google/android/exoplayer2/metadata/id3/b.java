package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.p0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.metadata.g;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import io.flutter.embedding.android.KeyboardMap;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46932b = new a() { // from class: com.google.android.exoplayer2.metadata.id3.a
        @Override // com.google.android.exoplayer2.metadata.id3.b.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return b.z(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46933c = "Id3Decoder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46934d = 4801587;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46935e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f46936f = 128;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f46937g = 64;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f46938h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f46939i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f46940j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f46941k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f46942l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f46943m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f46944n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f46945o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f46946p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f46947q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final a f46948a;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class C0381b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f46950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f46951c;

        public C0381b(int i10, boolean z10, int i11) {
            this.f46949a = i10;
            this.f46950b = z10;
            this.f46951c = i11;
        }
    }

    public b() {
        this(null);
    }

    public b(@p0 a aVar) {
        this.f46948a = aVar;
    }

    private static int A(e0 e0Var, int i10) {
        byte[] bArrD = e0Var.d();
        int iE = e0Var.e();
        int i11 = iE;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iE + i10) {
                return i10;
            }
            if ((bArrD[i11] & 255) == 255 && bArrD[i12] == 0) {
                System.arraycopy(bArrD, i11 + 2, bArrD, i12, (i10 - (i11 - iE)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
  0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(e0 e0Var, int i10, int i11, boolean z10) {
        int iJ;
        long J;
        int iM;
        int i12;
        int iE = e0Var.e();
        while (true) {
            try {
                boolean z11 = true;
                if (e0Var.a() < i11) {
                    e0Var.S(iE);
                    return true;
                }
                if (i10 >= 3) {
                    iJ = e0Var.o();
                    J = e0Var.I();
                    iM = e0Var.M();
                } else {
                    iJ = e0Var.J();
                    J = e0Var.J();
                    iM = 0;
                }
                if (iJ == 0 && J == 0 && iM == 0) {
                    e0Var.S(iE);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & J) != 0) {
                        e0Var.S(iE);
                        return false;
                    }
                    J = (((J >> 24) & 255) << 21) | (J & 255) | (((J >> 8) & 255) << 7) | (((J >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iM & 64) != 0 ? 1 : 0;
                    if ((iM & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iM & 32) != 0 ? 1 : 0;
                    if ((iM & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (J < i12) {
                    e0Var.S(iE);
                    return false;
                }
                if (e0Var.a() < J) {
                    e0Var.S(iE);
                    return false;
                }
                e0Var.T((int) J);
            } catch (Throwable th2) {
                e0Var.S(iE);
                throw th2;
            }
        }
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? u0.f51541f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static ApicFrame f(e0 e0Var, int i10, int i11) throws UnsupportedEncodingException {
        int iY;
        String strConcat;
        int iG = e0Var.G();
        String strV = v(iG);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        e0Var.k(bArr, 0, i12);
        if (i11 == 2) {
            String strValueOf = String.valueOf(com.google.common.base.a.g(new String(bArr, 0, 3, "ISO-8859-1")));
            strConcat = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iY = 2;
        } else {
            iY = y(bArr, 0);
            String strG = com.google.common.base.a.g(new String(bArr, 0, iY, "ISO-8859-1"));
            if (strG.indexOf(47) != -1) {
                strConcat = strG;
            } else if (strG.length() != 0) {
                strConcat = "image/".concat(strG);
            } else {
                strG = new String("image/");
                strConcat = strG;
            }
        }
        int i13 = bArr[iY + 1] & 255;
        int i14 = iY + 2;
        int iX = x(bArr, i14, iG);
        return new ApicFrame(strConcat, new String(bArr, i14, iX - i14, strV), i13, d(bArr, iX + u(iG), i12));
    }

    private static BinaryFrame g(e0 e0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        e0Var.k(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame h(e0 e0Var, int i10, int i11, boolean z10, int i12, @p0 a aVar) throws UnsupportedEncodingException {
        int iE = e0Var.e();
        int iY = y(e0Var.d(), iE);
        String str = new String(e0Var.d(), iE, iY - iE, "ISO-8859-1");
        e0Var.S(iY + 1);
        int iO = e0Var.o();
        int iO2 = e0Var.o();
        long jI = e0Var.I();
        long j10 = jI == KeyboardMap.kValueMask ? -1L : jI;
        long jI2 = e0Var.I();
        long j11 = jI2 == KeyboardMap.kValueMask ? -1L : jI2;
        ArrayList arrayList = new ArrayList();
        int i13 = iE + i10;
        while (e0Var.e() < i13) {
            Id3Frame id3FrameK = k(i11, e0Var, z10, i12, aVar);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new ChapterFrame(str, iO, iO2, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame i(e0 e0Var, int i10, int i11, boolean z10, int i12, @p0 a aVar) throws UnsupportedEncodingException {
        int iE = e0Var.e();
        int iY = y(e0Var.d(), iE);
        String str = new String(e0Var.d(), iE, iY - iE, "ISO-8859-1");
        e0Var.S(iY + 1);
        int iG = e0Var.G();
        boolean z11 = (iG & 2) != 0;
        boolean z12 = (iG & 1) != 0;
        int iG2 = e0Var.G();
        String[] strArr = new String[iG2];
        for (int i13 = 0; i13 < iG2; i13++) {
            int iE2 = e0Var.e();
            int iY2 = y(e0Var.d(), iE2);
            strArr[i13] = new String(e0Var.d(), iE2, iY2 - iE2, "ISO-8859-1");
            e0Var.S(iY2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iE + i10;
        while (e0Var.e() < i14) {
            Id3Frame id3FrameK = k(i11, e0Var, z10, i12, aVar);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @p0
    private static CommentFrame j(e0 e0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int iG = e0Var.G();
        String strV = v(iG);
        byte[] bArr = new byte[3];
        e0Var.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        e0Var.k(bArr2, 0, i11);
        int iX = x(bArr2, 0, iG);
        String str2 = new String(bArr2, 0, iX, strV);
        int iU = iX + u(iG);
        return new CommentFrame(str, str2, p(bArr2, iU, x(bArr2, iU, iG), strV));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0222, Merged into TryCatch #1 {all -> 0x012e, UnsupportedEncodingException -> 0x0222, blocks: (B:91:0x011c, B:159:0x01f4, B:162:0x0222, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112 }] */
    @p0
    private static Id3Frame k(int i10, e0 e0Var, boolean z10, int i11, @p0 a aVar) {
        int iK;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Id3Frame id3FrameG;
        int iG = e0Var.G();
        int iG2 = e0Var.G();
        int iG3 = e0Var.G();
        int iG4 = i10 >= 3 ? e0Var.G() : 0;
        if (i10 == 4) {
            iK = e0Var.K();
            if (!z10) {
                iK = (((iK >> 24) & 255) << 21) | (iK & 255) | (((iK >> 8) & 255) << 7) | (((iK >> 16) & 255) << 14);
            }
        } else {
            iK = i10 == 3 ? e0Var.K() : e0Var.J();
        }
        int iA = iK;
        int iM = i10 >= 3 ? e0Var.M() : 0;
        if (iG == 0 && iG2 == 0 && iG3 == 0 && iG4 == 0 && iA == 0 && iM == 0) {
            e0Var.S(e0Var.f());
            return null;
        }
        int iE = e0Var.e() + iA;
        if (iE > e0Var.f()) {
            u.m(f46933c, "Frame size exceeds remaining tag data");
            e0Var.S(e0Var.f());
            return null;
        }
        if (aVar != null) {
            i12 = iE;
            if (!aVar.a(i10, iG, iG2, iG3, iG4)) {
                e0Var.S(i12);
                return null;
            }
        } else {
            i12 = iE;
        }
        if (i10 == 3) {
            int i13 = iM;
            z12 = (i13 & 128) != 0;
            z13 = (i13 & 64) != 0;
            z11 = (i13 & 32) != 0;
            z15 = z12;
            z14 = false;
        } else {
            int i14 = iM;
            if (i10 == 4) {
                boolean z16 = (i14 & 64) != 0;
                boolean z17 = (i14 & 8) != 0;
                boolean z18 = (i14 & 4) != 0;
                z14 = (i14 & 2) != 0;
                boolean z19 = (i14 & 1) != 0;
                z11 = z16;
                z12 = z19;
                z15 = z17;
                z13 = z18;
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
        }
        if (z15 || z13) {
            u.m(r4, "Skipping unsupported compressed or encrypted frame");
            e0Var.S(i12);
            return null;
        }
        if (z11) {
            iA--;
            e0Var.T(1);
        }
        if (z12) {
            iA -= 4;
            e0Var.T(4);
        }
        if (z14) {
            iA = A(e0Var, iA);
        }
        try {
            if (iG == 84 && iG2 == 88 && iG3 == 88 && (i10 == 2 || iG4 == 88)) {
                id3FrameG = r(e0Var, iA);
            } else if (iG == 84) {
                id3FrameG = q(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
            } else if (iG == 87 && iG2 == 88 && iG3 == 88 && (i10 == 2 || iG4 == 88)) {
                id3FrameG = t(e0Var, iA);
            } else if (iG == 87) {
                id3FrameG = s(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
            } else if (iG == 80 && iG2 == 82 && iG3 == 73 && iG4 == 86) {
                id3FrameG = o(e0Var, iA);
            } else if (iG == 71 && iG2 == 69 && iG3 == 79 && (iG4 == 66 || i10 == 2)) {
                id3FrameG = l(e0Var, iA);
            } else if (i10 == 2) {
                if (iG == 80 && iG2 == 73 && iG3 == 67) {
                    id3FrameG = f(e0Var, iA, i10);
                } else if (iG != 67 && iG2 == 79 && iG3 == 77 && (iG4 == 77 || i10 == 2)) {
                    id3FrameG = j(e0Var, iA);
                } else if (iG != 67 && iG2 == 72 && iG3 == 65 && iG4 == 80) {
                    id3FrameG = h(e0Var, iA, i10, z10, i11, aVar);
                } else if (iG != 67 && iG2 == 84 && iG3 == 79 && iG4 == 67) {
                    id3FrameG = i(e0Var, iA, i10, z10, i11, aVar);
                } else if (iG != 77 && iG2 == 76 && iG3 == 76 && iG4 == 84) {
                    id3FrameG = n(e0Var, iA);
                } else {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                }
            } else if (iG == 65 && iG2 == 80 && iG3 == 73 && iG4 == 67) {
                id3FrameG = f(e0Var, iA, i10);
            } else if (iG != 67) {
                if (iG != 67) {
                    if (iG != 67) {
                        if (iG != 77) {
                            id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                        } else {
                            id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                        }
                    } else if (iG != 77) {
                        id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                    } else {
                        id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                    }
                } else if (iG != 67) {
                    if (iG != 77) {
                        id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                    } else {
                        id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                    }
                } else if (iG != 77) {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                } else {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                }
            } else if (iG != 67) {
                if (iG != 67) {
                    if (iG != 77) {
                        id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                    } else {
                        id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                    }
                } else if (iG != 77) {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                } else {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                }
            } else if (iG != 67) {
                if (iG != 77) {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                } else {
                    id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
                }
            } else if (iG != 77) {
                id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
            } else {
                id3FrameG = g(e0Var, iA, w(i10, iG, iG2, iG3, iG4));
            }
            if (id3FrameG == null) {
                String strW = w(i10, iG, iG2, iG3, iG4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strW).length() + 50);
                sb2.append("Failed to decode frame: id=");
                sb2.append(strW);
                sb2.append(", frameSize=");
                sb2.append(iA);
                u.m(f46933c, sb2.toString());
            }
            e0Var.S(i12);
            return id3FrameG;
        } catch (UnsupportedEncodingException unused) {
            u.m(r4, "Unsupported character encoding");
            return null;
        } finally {
            e0Var.S(i12);
        }
    }

    private static GeobFrame l(e0 e0Var, int i10) throws UnsupportedEncodingException {
        int iG = e0Var.G();
        String strV = v(iG);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.k(bArr, 0, i11);
        int iY = y(bArr, 0);
        String str = new String(bArr, 0, iY, "ISO-8859-1");
        int i12 = iY + 1;
        int iX = x(bArr, i12, iG);
        String strP = p(bArr, i12, iX, strV);
        int iU = iX + u(iG);
        int iX2 = x(bArr, iU, iG);
        return new GeobFrame(str, strP, p(bArr, iU, iX2, strV), d(bArr, iX2 + u(iG), i11));
    }

    @p0
    private static C0381b m(e0 e0Var) {
        if (e0Var.a() < 10) {
            u.m(f46933c, "Data too short to be an ID3 tag");
            return null;
        }
        int iJ = e0Var.J();
        boolean z10 = false;
        if (iJ != 4801587) {
            String strValueOf = String.valueOf(String.format("%06X", Integer.valueOf(iJ)));
            u.m(f46933c, strValueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(strValueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int iG = e0Var.G();
        e0Var.T(1);
        int iG2 = e0Var.G();
        int iF = e0Var.F();
        if (iG == 2) {
            if ((iG2 & 64) != 0) {
                u.m(f46933c, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iG == 3) {
            if ((iG2 & 64) != 0) {
                int iO = e0Var.o();
                e0Var.T(iO);
                iF -= iO + 4;
            }
        } else {
            if (iG != 4) {
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                sb2.append(iG);
                u.m(f46933c, sb2.toString());
                return null;
            }
            if ((iG2 & 64) != 0) {
                int iF2 = e0Var.F();
                e0Var.T(iF2 - 4);
                iF -= iF2;
            }
            if ((iG2 & 16) != 0) {
                iF -= 10;
            }
        }
        if (iG < 4 && (iG2 & 128) != 0) {
            z10 = true;
        }
        return new C0381b(iG, z10, iF);
    }

    private static MlltFrame n(e0 e0Var, int i10) {
        int iM = e0Var.M();
        int iJ = e0Var.J();
        int iJ2 = e0Var.J();
        int iG = e0Var.G();
        int iG2 = e0Var.G();
        d0 d0Var = new d0();
        d0Var.n(e0Var);
        int i11 = ((i10 - 10) * 8) / (iG + iG2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = d0Var.h(iG);
            int iH2 = d0Var.h(iG2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new MlltFrame(iM, iJ, iJ2, iArr, iArr2);
    }

    private static PrivFrame o(e0 e0Var, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        e0Var.k(bArr, 0, i10);
        int iY = y(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iY, "ISO-8859-1"), d(bArr, iY + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    @p0
    private static TextInformationFrame q(e0 e0Var, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iG = e0Var.G();
        String strV = v(iG);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.k(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, x(bArr, 0, iG), strV));
    }

    @p0
    private static TextInformationFrame r(e0 e0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iG = e0Var.G();
        String strV = v(iG);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.k(bArr, 0, i11);
        int iX = x(bArr, 0, iG);
        String str = new String(bArr, 0, iX, strV);
        int iU = iX + u(iG);
        return new TextInformationFrame("TXXX", str, p(bArr, iU, x(bArr, iU, iG), strV));
    }

    private static UrlLinkFrame s(e0 e0Var, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        e0Var.k(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    @p0
    private static UrlLinkFrame t(e0 e0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iG = e0Var.G();
        String strV = v(iG);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.k(bArr, 0, i11);
        int iX = x(bArr, 0, iG);
        String str = new String(bArr, 0, iX, strV);
        int iU = iX + u(iG);
        return new UrlLinkFrame("WXXX", str, p(bArr, iU, y(bArr, iU), "ISO-8859-1"));
    }

    private static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String v(int i10) {
        if (i10 == 1) {
            return "UTF-16";
        }
        if (i10 != 2) {
            return i10 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return mj.c.f131911d;
    }

    private static String w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int x(byte[] bArr, int i10, int i11) {
        int iY = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iY;
        }
        while (iY < bArr.length - 1) {
            if ((iY - i10) % 2 == 0 && bArr[iY + 1] == 0) {
                return iY;
            }
            iY = y(bArr, iY + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.g
    @p0
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    @p0
    public Metadata e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        e0 e0Var = new e0(bArr, i10);
        C0381b c0381bM = m(e0Var);
        if (c0381bM == null) {
            return null;
        }
        int iE = e0Var.e();
        int i11 = c0381bM.f46949a == 2 ? 6 : 10;
        int iA = c0381bM.f46951c;
        if (c0381bM.f46950b) {
            iA = A(e0Var, c0381bM.f46951c);
        }
        e0Var.R(iE + iA);
        boolean z10 = false;
        if (!B(e0Var, c0381bM.f46949a, i11, false)) {
            if (c0381bM.f46949a != 4 || !B(e0Var, 4, i11, true)) {
                int i12 = c0381bM.f46949a;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Failed to validate ID3 tag with majorVersion=");
                sb2.append(i12);
                u.m(f46933c, sb2.toString());
                return null;
            }
            z10 = true;
        }
        while (e0Var.a() >= i11) {
            Id3Frame id3FrameK = k(c0381bM.f46949a, e0Var, z10, i11, this.f46948a);
            if (id3FrameK != null) {
                arrayList.add(id3FrameK);
            }
        }
        return new Metadata(arrayList);
    }
}
