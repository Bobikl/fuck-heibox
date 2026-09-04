package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: PathParser.java */
/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20749a = "PathParser";

    /* JADX INFO: compiled from: PathParser.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f20751b;

        a() {
        }
    }

    /* JADX INFO: compiled from: PathParser.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f20752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f20753b;

        b(char c10, float[] fArr) {
            this.f20752a = c10;
            this.f20753b = fArr;
        }

        b(b bVar) {
            this.f20752a = bVar.f20752a;
            float[] fArr = bVar.f20753b;
            this.f20753b = m0.c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c10, char c11, float[] fArr2) {
            int i10;
            int i11;
            int i12;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            char c12 = c11;
            boolean z10 = false;
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            float f23 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    i11 = i10;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    i11 = i10;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                    i11 = 2;
                    break;
            }
            float f24 = f18;
            float f25 = f19;
            float f26 = f22;
            float f27 = f23;
            int i13 = 0;
            char c13 = c10;
            while (i13 < fArr2.length) {
                if (c12 != 'A') {
                    if (c12 == 'C') {
                        i12 = i13;
                        int i14 = i12 + 2;
                        int i15 = i12 + 3;
                        int i16 = i12 + 4;
                        int i17 = i12 + 5;
                        path.cubicTo(fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        f24 = fArr2[i16];
                        float f28 = fArr2[i17];
                        float f29 = fArr2[i14];
                        float f30 = fArr2[i15];
                        f25 = f28;
                        f21 = f30;
                        f20 = f29;
                    } else if (c12 == 'H') {
                        i12 = i13;
                        int i18 = i12 + 0;
                        path.lineTo(fArr2[i18], f25);
                        f24 = fArr2[i18];
                    } else if (c12 == 'Q') {
                        i12 = i13;
                        int i19 = i12 + 0;
                        int i20 = i12 + 1;
                        int i21 = i12 + 2;
                        int i22 = i12 + 3;
                        path.quadTo(fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                        float f31 = fArr2[i19];
                        float f32 = fArr2[i20];
                        f24 = fArr2[i21];
                        f25 = fArr2[i22];
                        f20 = f31;
                        f21 = f32;
                    } else if (c12 == 'V') {
                        i12 = i13;
                        int i23 = i12 + 0;
                        path.lineTo(f24, fArr2[i23]);
                        f25 = fArr2[i23];
                    } else if (c12 != 'a') {
                        if (c12 != 'c') {
                            if (c12 == 'h') {
                                int i24 = i13 + 0;
                                path.rLineTo(fArr2[i24], 0.0f);
                                f24 += fArr2[i24];
                            } else if (c12 != 'q') {
                                if (c12 == 'v') {
                                    int i25 = i13 + 0;
                                    path.rLineTo(0.0f, fArr2[i25]);
                                    f13 = fArr2[i25];
                                } else if (c12 == 'L') {
                                    int i26 = i13 + 0;
                                    int i27 = i13 + 1;
                                    path.lineTo(fArr2[i26], fArr2[i27]);
                                    f24 = fArr2[i26];
                                    f25 = fArr2[i27];
                                } else if (c12 == 'M') {
                                    f24 = fArr2[i13 + 0];
                                    f25 = fArr2[i13 + 1];
                                    if (i13 > 0) {
                                        path.lineTo(f24, f25);
                                    } else {
                                        path.moveTo(f24, f25);
                                        i12 = i13;
                                        f27 = f25;
                                        f26 = f24;
                                    }
                                } else if (c12 == 'S') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        f24 = (f24 * 2.0f) - f20;
                                        f25 = (f25 * 2.0f) - f21;
                                    }
                                    float f33 = f25;
                                    int i28 = i13 + 0;
                                    int i29 = i13 + 1;
                                    int i30 = i13 + 2;
                                    int i31 = i13 + 3;
                                    path.cubicTo(f24, f33, fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                                    f10 = fArr2[i28];
                                    f11 = fArr2[i29];
                                    f24 = fArr2[i30];
                                    f25 = fArr2[i31];
                                    f20 = f10;
                                    f21 = f11;
                                } else if (c12 == 'T') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f24 = (f24 * 2.0f) - f20;
                                        f25 = (f25 * 2.0f) - f21;
                                    }
                                    int i32 = i13 + 0;
                                    int i33 = i13 + 1;
                                    path.quadTo(f24, f25, fArr2[i32], fArr2[i33]);
                                    float f34 = fArr2[i32];
                                    float f35 = fArr2[i33];
                                    i12 = i13;
                                    f21 = f25;
                                    f20 = f24;
                                    f24 = f34;
                                    f25 = f35;
                                } else if (c12 == 'l') {
                                    int i34 = i13 + 0;
                                    int i35 = i13 + 1;
                                    path.rLineTo(fArr2[i34], fArr2[i35]);
                                    f24 += fArr2[i34];
                                    f13 = fArr2[i35];
                                } else if (c12 == 'm') {
                                    float f36 = fArr2[i13 + 0];
                                    f24 += f36;
                                    float f37 = fArr2[i13 + 1];
                                    f25 += f37;
                                    if (i13 > 0) {
                                        path.rLineTo(f36, f37);
                                    } else {
                                        path.rMoveTo(f36, f37);
                                        i12 = i13;
                                        f27 = f25;
                                        f26 = f24;
                                    }
                                } else if (c12 == 's') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        float f38 = f24 - f20;
                                        f14 = f25 - f21;
                                        f15 = f38;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i36 = i13 + 0;
                                    int i37 = i13 + 1;
                                    int i38 = i13 + 2;
                                    int i39 = i13 + 3;
                                    path.rCubicTo(f15, f14, fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                    f10 = fArr2[i36] + f24;
                                    f11 = fArr2[i37] + f25;
                                    f24 += fArr2[i38];
                                    f12 = fArr2[i39];
                                } else if (c12 == 't') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f16 = f24 - f20;
                                        f17 = f25 - f21;
                                    } else {
                                        f17 = 0.0f;
                                        f16 = 0.0f;
                                    }
                                    int i40 = i13 + 0;
                                    int i41 = i13 + 1;
                                    path.rQuadTo(f16, f17, fArr2[i40], fArr2[i41]);
                                    float f39 = f16 + f24;
                                    float f40 = f17 + f25;
                                    f24 += fArr2[i40];
                                    f25 += fArr2[i41];
                                    f21 = f40;
                                    f20 = f39;
                                }
                                f25 += f13;
                            } else {
                                int i42 = i13 + 0;
                                int i43 = i13 + 1;
                                int i44 = i13 + 2;
                                int i45 = i13 + 3;
                                path.rQuadTo(fArr2[i42], fArr2[i43], fArr2[i44], fArr2[i45]);
                                f10 = fArr2[i42] + f24;
                                f11 = fArr2[i43] + f25;
                                f24 += fArr2[i44];
                                f12 = fArr2[i45];
                            }
                            i12 = i13;
                        } else {
                            int i46 = i13 + 2;
                            int i47 = i13 + 3;
                            int i48 = i13 + 4;
                            int i49 = i13 + 5;
                            path.rCubicTo(fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                            f10 = fArr2[i46] + f24;
                            f11 = fArr2[i47] + f25;
                            f24 += fArr2[i48];
                            f12 = fArr2[i49];
                        }
                        f25 += f12;
                        f20 = f10;
                        f21 = f11;
                        i12 = i13;
                    } else {
                        int i50 = i13 + 5;
                        int i51 = i13 + 6;
                        i12 = i13;
                        c(path, f24, f25, fArr2[i50] + f24, fArr2[i51] + f25, fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                        f24 += fArr2[i50];
                        f25 += fArr2[i51];
                    }
                    i13 = i12 + i11;
                    c13 = c11;
                    c12 = c13;
                    z10 = false;
                } else {
                    i12 = i13;
                    int i52 = i12 + 5;
                    int i53 = i12 + 6;
                    c(path, f24, f25, fArr2[i52], fArr2[i53], fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f24 = fArr2[i52];
                    f25 = fArr2[i53];
                }
                f21 = f25;
                f20 = f24;
                i13 = i12 + i11;
                c13 = c11;
                c12 = c13;
                z10 = false;
            }
            fArr[z10 ? 1 : 0] = f24;
            fArr[1] = f25;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f26;
            fArr[5] = f27;
        }

        private static void b(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int iCeil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d16);
            double dSin = Math.sin(d16);
            double dCos2 = Math.cos(d17);
            double dSin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * dCos;
            double d22 = d13 * dSin;
            double d23 = (d21 * dSin2) - (d22 * dCos2);
            double d24 = d20 * dSin;
            double d25 = d13 * dCos;
            double d26 = (dSin2 * d24) + (dCos2 * d25);
            double d27 = d18 / ((double) iCeil);
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < iCeil) {
                double d33 = d32 + d27;
                double dSin3 = Math.sin(d33);
                double dCos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * dCos) * dCos3)) - (d22 * dSin3);
                double d35 = d11 + (d19 * dSin * dCos3) + (d25 * dSin3);
                double d36 = (d21 * dSin3) - (d22 * dCos3);
                double d37 = (dSin3 * d24) + (dCos3 * d25);
                double d38 = d33 - d32;
                double dTan = Math.tan(d38 / 2.0d);
                double dSin4 = (Math.sin(d38) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d36)), (float) (d35 - (dSin4 * d37)), (float) d34, (float) d35);
                i10++;
                d27 = d27;
                dSin = dSin;
                d30 = d34;
                d24 = d24;
                dCos = dCos;
                d32 = d33;
                d28 = d37;
                d29 = d36;
                iCeil = iCeil;
                d31 = d35;
                d19 = d12;
            }
        }

        private static void c(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f10;
            double d13 = d12 * dCos;
            double d14 = f11;
            double d15 = f14;
            double d16 = (d13 + (d14 * dSin)) / d15;
            double d17 = (((double) (-f10)) * dSin) + (d14 * dCos);
            double d18 = f15;
            double d19 = d17 / d18;
            double d20 = f13;
            double d21 = ((((double) f12) * dCos) + (d20 * dSin)) / d15;
            double d22 = ((((double) (-f12)) * dSin) + (d20 * dCos)) / d18;
            double d23 = d16 - d21;
            double d24 = d19 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d19 + d22) / 2.0d;
            double d27 = (d23 * d23) + (d24 * d24);
            if (d27 == 0.0d) {
                Log.w(m0.f20749a, " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w(m0.f20749a, "Points are too far apart " + d27);
                float fSqrt = (float) (Math.sqrt(d27) / 1.99999d);
                c(path, f10, f11, f12, f13, f14 * fSqrt, f15 * fSqrt, f16, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d28);
            double d29 = d23 * dSqrt;
            double d30 = dSqrt * d24;
            if (z10 == z11) {
                d10 = d25 - d30;
                d11 = d26 + d29;
            } else {
                d10 = d25 + d30;
                d11 = d26 - d29;
            }
            double dAtan2 = Math.atan2(d19 - d11, d16 - d10);
            double dAtan3 = Math.atan2(d22 - d11, d21 - d10) - dAtan2;
            if (z11 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d31 = d10 * d15;
            double d32 = d11 * d18;
            b(path, (d31 * dCos) - (d32 * dSin), (d31 * dSin) + (d32 * dCos), d15, d18, d12, d14, radians, dAtan2, dAtan3);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c10 = 'm';
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                b bVar = bVarArr[i10];
                a(path, fArr, c10, bVar.f20752a, bVar.f20753b);
                c10 = bVarArr[i10].f20752a;
            }
        }

        public void d(b bVar, b bVar2, float f10) {
            this.f20752a = bVar.f20752a;
            int i10 = 0;
            while (true) {
                float[] fArr = bVar.f20753b;
                if (i10 >= fArr.length) {
                    return;
                }
                this.f20753b[i10] = (fArr[i10] * (1.0f - f10)) + (bVar2.f20753b[i10] * f10);
                i10++;
            }
        }
    }

    private m0() {
    }

    private static void a(ArrayList<b> arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    public static boolean b(@androidx.annotation.p0 b[] bVarArr, @androidx.annotation.p0 b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            char c10 = bVar.f20752a;
            b bVar2 = bVarArr2[i10];
            if (c10 != bVar2.f20752a || bVar.f20753b.length != bVar2.f20753b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int iMin = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        while (i10 < str.length()) {
            int iJ = j(str, i10);
            String strTrim = str.substring(i11, iJ).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i11 = iJ;
            i10 = iJ + 1;
        }
        if (i10 - i11 == 1 && i11 < str.length()) {
            a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] bVarArrD = d(str);
        if (bVarArrD == null) {
            return null;
        }
        try {
            b.e(bVarArrD, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    private static void g(String str, int i10, a aVar) {
        aVar.f20751b = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = i10; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ' ') {
                z10 = false;
                z12 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z10 = false;
                        z12 = true;
                        break;
                    case '-':
                        if (i11 == i10 || z10) {
                            z10 = false;
                        } else {
                            aVar.f20751b = true;
                            z10 = false;
                            z12 = true;
                        }
                        break;
                    case '.':
                        if (z11) {
                            aVar.f20751b = true;
                            z10 = false;
                            z12 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                        }
                        break;
                    default:
                        z10 = false;
                        break;
                }
            } else {
                z10 = true;
            }
            if (z12) {
                aVar.f20750a = i11;
            }
        }
        aVar.f20750a = i11;
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                g(str, i10, aVar);
                int i12 = aVar.f20750a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f20751b ? i12 : i12 + 1;
            }
            return c(fArr, 0, i11);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e10);
        }
    }

    public static boolean i(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f10) {
        if (bVarArr == null || bVarArr2 == null || bVarArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (bVarArr.length != bVarArr2.length || bVarArr2.length != bVarArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!b(bVarArr2, bVarArr3)) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr[i10].d(bVarArr2[i10], bVarArr3[i10], f10);
        }
        return true;
    }

    private static int j(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f20752a = bVarArr2[i10].f20752a;
            int i11 = 0;
            while (true) {
                float[] fArr = bVarArr2[i10].f20753b;
                if (i11 < fArr.length) {
                    bVarArr[i10].f20753b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }
}
