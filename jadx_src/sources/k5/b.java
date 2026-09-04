package k5;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f124430a = true;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f124431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f124432b;
    }

    /* JADX INFO: renamed from: k5.b$b, reason: collision with other inner class name */
    public static class C1121b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int[] f124433f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int[] f124434g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f124435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f124436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f124437e;

        public C1121b(int i10, byte[] bArr) {
            this.f124431a = bArr;
            this.f124437e = (i10 & 8) == 0 ? f124433f : f124434g;
            this.f124435c = 0;
            this.f124436d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
        public boolean a(byte[] bArr, int i10, int i11, boolean z10) {
            int i12 = this.f124435c;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f124436d;
            byte[] bArr2 = this.f124431a;
            int[] iArr = this.f124437e;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & 255] << 18) | (iArr[bArr[i18 + 1] & 255] << 12) | (iArr[bArr[i18 + 2] & 255] << 6) | iArr[bArr[i18 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & 255];
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 != 4) {
                                    if (i17 == 5 && i21 != -1) {
                                        this.f124435c = 6;
                                        return false;
                                    }
                                } else if (i21 == -2) {
                                    i17++;
                                } else if (i21 != -1) {
                                    this.f124435c = 6;
                                    return false;
                                }
                            } else if (i21 >= 0) {
                                int i22 = i21 | (i16 << 6);
                                bArr2[i15 + 2] = (byte) i22;
                                bArr2[i15 + 1] = (byte) (i22 >> 8);
                                bArr2[i15] = (byte) (i22 >> 16);
                                i15 += 3;
                                i16 = i22;
                                i17 = 0;
                            } else if (i21 == -2) {
                                bArr2[i15 + 1] = (byte) (i16 >> 2);
                                bArr2[i15] = (byte) (i16 >> 10);
                                i15 += 2;
                                i17 = 5;
                            } else if (i21 != -1) {
                                this.f124435c = 6;
                                return false;
                            }
                        } else if (i21 >= 0) {
                            i21 |= i16 << 6;
                            i17++;
                            i16 = i21;
                        } else if (i21 == -2) {
                            bArr2[i15] = (byte) (i16 >> 4);
                            i15++;
                            i17 = 4;
                        } else if (i21 != -1) {
                            this.f124435c = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        i21 |= i16 << 6;
                        i17++;
                        i16 = i21;
                    } else if (i21 != -1) {
                        this.f124435c = 6;
                        return false;
                    }
                } else if (i21 >= 0) {
                    i17++;
                    i16 = i21;
                } else if (i21 != -1) {
                    this.f124435c = 6;
                    return false;
                }
                i18 = i20;
            }
            if (!z10) {
                this.f124435c = i17;
                this.f124436d = i16;
                this.f124432b = i15;
                return true;
            }
            if (i17 == 1) {
                this.f124435c = 6;
                return false;
            }
            if (i17 == 2) {
                bArr2[i15] = (byte) (i16 >> 4);
                i15++;
            } else if (i17 == 3) {
                int i23 = i15 + 1;
                bArr2[i15] = (byte) (i16 >> 10);
                i15 = i23 + 1;
                bArr2[i23] = (byte) (i16 >> 2);
            } else if (i17 == 4) {
                this.f124435c = 6;
                return false;
            }
            this.f124435c = i17;
            this.f124432b = i15;
            return true;
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f124438j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final byte[] f124439k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 45, 95};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ boolean f124440l = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f124441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f124442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f124443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f124444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f124445g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f124446h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f124447i;

        public c(int i10, byte[] bArr) {
            this.f124431a = bArr;
            this.f124444f = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f124445g = z10;
            this.f124446h = (i10 & 4) != 0;
            this.f124447i = (i10 & 8) == 0 ? f124438j : f124439k;
            this.f124441c = new byte[2];
            this.f124442d = 0;
            this.f124443e = z10 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e4]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e4 A[LOOP:0: B:25:0x0090->B:33:0x00e4, LOOP_END] */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instruction units count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k5.b.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i10) {
        return b(bArr, 0, bArr.length, i10);
    }

    public static byte[] b(byte[] bArr, int i10, int i11, int i12) {
        C1121b c1121b = new C1121b(i12, new byte[(i11 * 3) / 4]);
        if (!c1121b.a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = c1121b.f124432b;
        byte[] bArr2 = c1121b.f124431a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    public static byte[] c(byte[] bArr, int i10) {
        return d(bArr, 0, bArr.length, i10);
    }

    @SuppressLint({"Assert"})
    public static byte[] d(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!cVar.f124444f) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f124445g && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (cVar.f124446h ? 2 : 1);
        }
        cVar.f124431a = new byte[i13];
        cVar.a(bArr, i10, i11, true);
        if (f124430a || cVar.f124432b == i13) {
            return cVar.f124431a;
        }
        throw new AssertionError();
    }

    public static String e(byte[] bArr, int i10) {
        try {
            return new String(c(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
