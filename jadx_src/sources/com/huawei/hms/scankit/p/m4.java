package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ImageReuse.java */
/* JADX INFO: loaded from: classes7.dex */
public class m4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f62099p = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 20, 20, 21, 21, 22, 22, 23, 24, 24, 25, 26, 26, 27, 28, 28, 29, 30, 30, 31, 32, 32, 33, 34, 35, 35, 36, 37, 38, 38, 39, 40, 41, 42, 42, 43, 44, 45, 46, 47, 48, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91, 92, 93, 95, 96, 97, 98, 100, 101, 102, 103, 105, 106, 107, 109, 110, 111, 113, 114, 115, 117, 118, 119, 121, 122, 123, 125, 126, 128, 129, 131, 132, 133, 135, 136, 138, 139, 141, 142, 144, 145, 147, 148, 150, 151, 153, 154, 156, 158, 159, 161, 162, bb.c.b.f30690i0, 166, 167, 169, bb.c.b.f30828o0, 172, bb.c.b.f30918s0, bb.c.b.f30940t0, 177, bb.c.b.f31028x0, 180, 182, 184, 185, 187, 189, bb.c.b.J0, 192, 194, bb.c.b.O0, 198, 199, 201, 203, 205, 207, 208, 210, 212, bb.c.b.f30645g1, 216, 217, 219, 221, bb.c.b.f30852p1, bb.c.b.f30897r1, bb.c.b.f30941t1, bb.c.b.f30985v1, bb.c.b.f31029x1, bb.c.b.f31073z1, bb.c.b.A1, bb.c.b.C1, bb.c.b.E1, 240, bb.c.b.I1, 244, bb.c.b.M1, bb.c.b.O1, 250, 252, 254};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f62100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f62101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f62102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f62103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f62104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f62105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p f62106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p f62107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f62108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p f62109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p f62110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p f62111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p f62112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p f62113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p f62114o;

    public static p a(p pVar) throws a {
        byte[] bArrB = pVar.a().c().b();
        if (bArrB == null || bArrB.length <= 0) {
            return pVar;
        }
        byte[] bArr = new byte[bArrB.length];
        for (int i10 = 0; i10 < bArrB.length; i10++) {
            bArr[i10] = (byte) (f62099p[bArrB[i10] & 255] & 255);
        }
        return new p(new e4(new e6(bArr, pVar.e(), pVar.c(), 0, 0, pVar.e(), pVar.c(), false)));
    }

    public static p h(p pVar) throws a {
        byte[] bArrB = pVar.a().c().b();
        if (bArrB == null || bArrB.length <= 0) {
            return pVar;
        }
        int length = bArrB.length;
        float[] fArr = new float[length];
        float f10 = 0.0f;
        float f11 = 255.0f;
        for (int i10 = 0; i10 < bArrB.length; i10++) {
            float f12 = (bArrB[i10] & 255) / 255.0f;
            fArr[i10] = f12;
            if (f12 < 0.5d) {
                fArr[i10] = 2.0f * f12 * f12;
            } else if (f12 > 0.5d) {
                fArr[i10] = ((f12 - 1.0f) * (-2.0f) * (f12 - 1.0f)) + 1.0f;
            }
            float f13 = fArr[i10];
            if (f13 > f10) {
                f10 = f13;
            }
            if (f13 < f11) {
                f11 = f13;
            }
        }
        float f14 = f10 - f11;
        if (Math.abs(f14) < 0.001d) {
            throw a.a();
        }
        byte[] bArr = new byte[bArrB.length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) (((int) (((fArr[i11] - f11) / f14) * 255.0f)) & 255);
        }
        return new p(new e4(new e6(bArr, pVar.e(), pVar.c(), 0, 0, pVar.e(), pVar.c(), false)));
    }

    public p a(p pVar, float f10) {
        if (this.f62100a == null) {
            if (r3.f62275a) {
                this.f62100a = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62100a = l4.a(pVar, f10);
            }
        }
        return this.f62100a;
    }

    public void a() {
        this.f62114o = null;
        this.f62106g = null;
        this.f62109j = null;
        this.f62110k = null;
        this.f62111l = null;
        this.f62112m = null;
        this.f62113n = null;
        this.f62107h = null;
    }

    public p b(p pVar) throws a {
        if (this.f62102c == null) {
            this.f62102c = a(pVar);
        }
        return this.f62102c;
    }

    public p b(p pVar, float f10) {
        if (this.f62101b == null) {
            if (r3.f62275a) {
                this.f62101b = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62101b = l4.a(pVar, f10);
            }
        }
        return this.f62101b;
    }

    public p c(p pVar) throws a {
        if (this.f62103d == null) {
            this.f62103d = a(pVar);
        }
        return this.f62103d;
    }

    public p c(p pVar, float f10) {
        if (this.f62108i == null) {
            if (r3.f62275a) {
                this.f62108i = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62108i = l4.a(pVar, f10);
            }
        }
        return this.f62108i;
    }

    public p d(p pVar) throws a {
        if (this.f62104e == null) {
            this.f62104e = h(pVar);
        }
        return this.f62104e;
    }

    public p d(p pVar, float f10) {
        if (this.f62105f == null) {
            if (r3.f62275a) {
                this.f62105f = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62105f = l4.a(pVar, f10);
            }
        }
        return this.f62105f;
    }

    public p e(p pVar) throws a {
        if (this.f62112m == null) {
            this.f62112m = a(pVar);
        }
        return this.f62112m;
    }

    public p e(p pVar, float f10) {
        if (this.f62114o == null) {
            if (r3.f62275a) {
                this.f62114o = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62114o = l4.a(pVar, f10);
            }
        }
        return this.f62114o;
    }

    public p f(p pVar) throws a {
        if (this.f62113n == null) {
            this.f62113n = h(pVar);
        }
        return this.f62113n;
    }

    public p f(p pVar, float f10) {
        if (this.f62111l == null) {
            if (r3.f62275a) {
                this.f62111l = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62111l = l4.a(pVar, f10);
            }
        }
        return this.f62111l;
    }

    public p g(p pVar) throws a {
        if (this.f62110k == null) {
            this.f62110k = h(pVar);
        }
        return this.f62110k;
    }

    public p g(p pVar, float f10) {
        if (this.f62109j == null) {
            if (r3.f62275a) {
                this.f62109j = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62109j = l4.a(pVar, f10);
            }
        }
        return this.f62109j;
    }

    public p h(p pVar, float f10) {
        if (this.f62106g == null) {
            if (r3.f62275a) {
                this.f62106g = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62106g = l4.a(pVar, f10);
            }
        }
        return this.f62106g;
    }

    public p i(p pVar, float f10) {
        if (this.f62107h == null) {
            if (r3.f62275a) {
                this.f62107h = l4.a(r3.f62276b, pVar, f10);
            } else {
                this.f62107h = l4.a(pVar, f10);
            }
        }
        return this.f62107h;
    }
}
