package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f61611g = {bb.c.e.A4, bb.c.b.f30696i6, 2107, bb.c.b.Gv};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f61614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f61615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61617f;

    /* JADX INFO: compiled from: Detector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f61618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f61619b;

        a(int i10, int i11) {
            this.f61618a = i10;
            this.f61619b = i11;
        }

        int a() {
            return this.f61618a;
        }

        int b() {
            return this.f61619b;
        }

        u6 c() {
            return new u6(this.f61618a, this.f61619b);
        }

        public String toString() {
            return "<" + this.f61618a + ' ' + this.f61619b + kotlin.text.y.f128597f;
        }
    }

    public c2(s sVar) {
        this.f61612a = sVar;
    }

    private static float a(a aVar, a aVar2) {
        return s4.a(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static float a(u6 u6Var, u6 u6Var2) {
        return s4.a(u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c());
    }

    private int a() {
        if (this.f61613b) {
            return (this.f61614c * 4) + 11;
        }
        int i10 = this.f61614c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    private static int a(long j10, boolean z10) throws Exception {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new p6(o3.f62193k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (com.huawei.hms.scankit.p.a unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private int a(u6 u6Var, u6 u6Var2, int i10) {
        float fA = a(u6Var, u6Var2);
        float f10 = fA / i10;
        float fB = u6Var.b();
        float fC = u6Var.c();
        float fB2 = ((u6Var2.b() - u6Var.b()) * f10) / fA;
        float fC2 = (f10 * (u6Var2.c() - u6Var.c())) / fA;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f61612a.b(s4.a((f11 * fB2) + fB), s4.a((f11 * fC2) + fC))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    private static int a(int[] iArr, int i10) throws com.huawei.hms.scankit.p.a {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f61611g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private a a(a aVar, boolean z10, int i10, int i11) {
        int iA = aVar.a() + i10;
        int iB = aVar.b();
        while (true) {
            iB += i11;
            if (!a(iA, iB) || this.f61612a.b(iA, iB) != z10) {
                break;
            }
            iA += i10;
        }
        int i12 = iA - i10;
        int i13 = iB - i11;
        while (a(i12, i13) && this.f61612a.b(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (a(i14, i13) && this.f61612a.b(i14, i13) == z10) {
            i13 += i11;
        }
        return new a(i14, i13 - i11);
    }

    private s a(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4) throws com.huawei.hms.scankit.p.a {
        s3 s3VarA = s3.a();
        int iA = a();
        float f10 = iA / 2.0f;
        float f11 = this.f61616e;
        float f12 = f10 - f11;
        float f13 = f10 + f11;
        return s3VarA.a(sVar, iA, iA, f12, f12, f13, f12, f13, f13, f12, f13, u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c(), u6Var3.b(), u6Var3.c(), u6Var4.b(), u6Var4.c());
    }

    private void a(u6[] u6VarArr) throws Exception {
        long j10;
        long j11;
        if (!a(u6VarArr[0]) || !a(u6VarArr[1]) || !a(u6VarArr[2]) || !a(u6VarArr[3])) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        int i10 = this.f61616e * 2;
        int[] iArr = {a(u6VarArr[0], u6VarArr[1], i10), a(u6VarArr[1], u6VarArr[2], i10), a(u6VarArr[2], u6VarArr[3], i10), a(u6VarArr[3], u6VarArr[0], i10)};
        this.f61617f = a(iArr, i10);
        long j12 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f61617f + i11) % 4];
            if (this.f61613b) {
                j10 = j12 << 7;
                j11 = (i12 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i12 >> 2) & bb.c.b.f30614eg) + ((i12 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int iA = a(j12, this.f61613b);
        if (this.f61613b) {
            this.f61614c = (iA >> 6) + 1;
            this.f61615d = (iA & 63) + 1;
        } else {
            this.f61614c = (iA >> 11) + 1;
            this.f61615d = (iA & bb.c.d.f31516s) + 1;
        }
    }

    private boolean a(int i10, int i11) {
        return i10 >= 0 && i10 < this.f61612a.e() && i11 > 0 && i11 < this.f61612a.c();
    }

    private boolean a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a((int) Math.ceil((((aVar.f61618a + aVar2.f61618a) + aVar3.f61618a) + aVar4.f61618a) / 4.0f), (int) Math.ceil((((aVar.f61619b + aVar2.f61619b) + aVar3.f61619b) + aVar4.f61619b) / 4.0f));
        float fA = a(aVar5, aVar);
        float fA2 = a(aVar5, aVar2);
        float fA3 = a(aVar5, aVar3);
        float fA4 = a(aVar5, aVar4);
        double d10 = fA / fA2;
        if (d10 <= 0.75d || d10 >= 1.25d) {
            return false;
        }
        double d11 = fA / fA3;
        if (d11 <= 0.75d || d11 >= 1.25d) {
            return false;
        }
        double d12 = fA / fA4;
        return d12 > 0.75d && d12 < 1.25d;
    }

    private boolean a(u6 u6Var) {
        return a(s4.a(u6Var.b()), s4.a(u6Var.c()));
    }

    private u6[] a(a aVar) throws com.huawei.hms.scankit.p.a {
        int i10;
        int i11 = 1;
        this.f61616e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z10 = true;
        while (this.f61616e < 9) {
            a aVarA = a(aVar5, z10, i11, -1);
            a aVarA2 = a(aVar4, z10, i11, i11);
            a aVarA3 = a(aVar3, z10, -1, i11);
            a aVarA4 = a(aVar2, z10, -1, -1);
            if (this.f61616e > 2) {
                double dA = (a(aVarA4, aVarA) * this.f61616e) / (a(aVar2, aVar5) * (this.f61616e + 2));
                if (dA < 0.75d || dA > 1.25d || !a(aVarA, aVarA2, aVarA3, aVarA4) || (!b(aVarA, aVarA2, aVarA3, aVarA4) && ((i10 = this.f61616e) == 5 || i10 == 7))) {
                    break;
                }
            }
            z10 = !z10;
            this.f61616e++;
            aVar2 = aVarA4;
            aVar5 = aVarA;
            aVar4 = aVarA2;
            aVar3 = aVarA3;
            i11 = 1;
        }
        int i12 = this.f61616e;
        if (i12 != 5 && i12 != 7) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        this.f61613b = i12 == 5;
        u6[] u6VarArr = {new u6(aVar5.a() + 0.5f, aVar5.b() - 0.5f), new u6(aVar4.a() + 0.5f, aVar4.b() + 0.5f), new u6(aVar3.a() - 0.5f, aVar3.b() + 0.5f), new u6(aVar2.a() - 0.5f, aVar2.b() - 0.5f)};
        int i13 = this.f61616e * 2;
        return a(u6VarArr, i13 - 3, i13);
    }

    private static u6[] a(u6[] u6VarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float fB = u6VarArr[0].b() - u6VarArr[2].b();
        float fC = u6VarArr[0].c() - u6VarArr[2].c();
        float fB2 = (u6VarArr[0].b() + u6VarArr[2].b()) / 2.0f;
        float fC2 = (u6VarArr[0].c() + u6VarArr[2].c()) / 2.0f;
        float f11 = fB * f10;
        float f12 = fC * f10;
        u6 u6Var = new u6(fB2 + f11, fC2 + f12);
        u6 u6Var2 = new u6(fB2 - f11, fC2 - f12);
        float fB3 = u6VarArr[1].b() - u6VarArr[3].b();
        float fC3 = u6VarArr[1].c() - u6VarArr[3].c();
        float fB4 = (u6VarArr[1].b() + u6VarArr[3].b()) / 2.0f;
        float fC4 = (u6VarArr[1].c() + u6VarArr[3].c()) / 2.0f;
        float f13 = fB3 * f10;
        float f14 = f10 * fC3;
        return new u6[]{u6Var, new u6(fB4 + f13, fC4 + f14), u6Var2, new u6(fB4 - f13, fC4 - f14)};
    }

    private int b(a aVar, a aVar2) {
        float fA = a(aVar, aVar2);
        float fA2 = (aVar2.a() - aVar.a()) / fA;
        float fB = (aVar2.b() - aVar.b()) / fA;
        float fA3 = aVar.a();
        float fB2 = aVar.b();
        boolean zB = this.f61612a.b(aVar.a(), aVar.b());
        int iCeil = (int) Math.ceil(fA);
        int i10 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            fA3 += fA2;
            fB2 += fB;
            if (this.f61612a.b(s4.a(fA3), s4.a(fB2)) != zB) {
                i10++;
            }
        }
        float f10 = i10 / fA;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == zB ? 1 : -1;
        }
        return 0;
    }

    private a b() {
        u6 u6VarC;
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6VarC2;
        u6 u6VarC3;
        u6 u6VarC4;
        u6 u6VarC5;
        try {
            u6[] u6VarArrA = new j8(this.f61612a).a();
            u6Var2 = u6VarArrA[0];
            u6Var3 = u6VarArrA[1];
            u6Var = u6VarArrA[2];
            u6VarC = u6VarArrA[3];
        } catch (com.huawei.hms.scankit.p.a unused) {
            int iE = this.f61612a.e() / 2;
            int iC = this.f61612a.c() / 2;
            int i10 = iE + 7;
            int i11 = iC - 7;
            u6 u6VarC6 = a(new a(i10, i11), false, 1, -1).c();
            int i12 = iC + 7;
            u6 u6VarC7 = a(new a(i10, i12), false, 1, 1).c();
            int i13 = iE - 7;
            u6 u6VarC8 = a(new a(i13, i12), false, -1, 1).c();
            u6VarC = a(new a(i13, i11), false, -1, -1).c();
            u6Var = u6VarC8;
            u6Var2 = u6VarC6;
            u6Var3 = u6VarC7;
        }
        int iA = s4.a((((u6Var2.b() + u6VarC.b()) + u6Var3.b()) + u6Var.b()) / 4.0f);
        int iA2 = s4.a((((u6Var2.c() + u6VarC.c()) + u6Var3.c()) + u6Var.c()) / 4.0f);
        try {
            u6[] u6VarArrA2 = new j8(this.f61612a, 15, iA, iA2).a();
            u6VarC2 = u6VarArrA2[0];
            u6VarC3 = u6VarArrA2[1];
            u6VarC4 = u6VarArrA2[2];
            u6VarC5 = u6VarArrA2[3];
        } catch (com.huawei.hms.scankit.p.a unused2) {
            int i14 = iA + 7;
            int i15 = iA2 - 7;
            u6VarC2 = a(new a(i14, i15), false, 1, -1).c();
            int i16 = iA2 + 7;
            u6VarC3 = a(new a(i14, i16), false, 1, 1).c();
            int i17 = iA - 7;
            u6VarC4 = a(new a(i17, i16), false, -1, 1).c();
            u6VarC5 = a(new a(i17, i15), false, -1, -1).c();
        }
        return new a(s4.a((((u6VarC2.b() + u6VarC5.b()) + u6VarC3.b()) + u6VarC4.b()) / 4.0f), s4.a((((u6VarC2.c() + u6VarC5.c()) + u6VarC3.c()) + u6VarC4.c()) / 4.0f));
    }

    private boolean b(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int iB = b(aVar8, aVar5);
        return iB != 0 && b(aVar5, aVar6) == iB && b(aVar6, aVar7) == iB && b(aVar7, aVar8) == iB;
    }

    private u6[] b(u6[] u6VarArr) {
        return a(u6VarArr, this.f61616e * 2, a());
    }

    public g a(boolean z10) throws Exception {
        u6[] u6VarArrA = a(b());
        if (z10) {
            u6 u6Var = u6VarArrA[0];
            u6VarArrA[0] = u6VarArrA[2];
            u6VarArrA[2] = u6Var;
        }
        a(u6VarArrA);
        s sVar = this.f61612a;
        int i10 = this.f61617f;
        return new g(a(sVar, u6VarArrA[i10 % 4], u6VarArrA[(i10 + 1) % 4], u6VarArrA[(i10 + 2) % 4], u6VarArrA[(i10 + 3) % 4]), b(u6VarArrA), this.f61613b, this.f61615d, this.f61614c);
    }
}
