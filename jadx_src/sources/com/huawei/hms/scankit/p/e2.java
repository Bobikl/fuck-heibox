package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes7.dex */
public class e2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f61750g = {210, bb.c.b.C1, bb.c.b.f30600e2, 244, 270, bb.c.b.f30964u2};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f61751h = {21, 25, 29, 33, 37, 41};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v6 f61753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g3 f61754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g3 f61755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g3 f61756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g3 f61757f;

    public e2(s sVar) {
        this.f61752a = sVar;
    }

    private float a(int i10, int i11, s sVar) throws a {
        int iE = sVar.e();
        int[] iArr = new int[5];
        for (int i12 = 0; i12 < 5; i12++) {
            iArr[i12] = 0;
        }
        int i13 = i10;
        while (i13 >= 0 && sVar.b(i13, i11)) {
            iArr[2] = iArr[2] + 1;
            i13--;
        }
        if (i13 < 0) {
            throw a.a();
        }
        while (i13 >= 0 && !sVar.b(i13, i11)) {
            iArr[1] = iArr[1] + 1;
            i13--;
        }
        if (i13 < 0) {
            throw a.a();
        }
        while (i13 >= 0 && sVar.b(i13, i11)) {
            iArr[0] = iArr[0] + 1;
            i13--;
        }
        int i14 = i10 + 1;
        while (i14 < iE && sVar.b(i14, i11)) {
            iArr[2] = iArr[2] + 1;
            i14++;
        }
        if (i14 == iE) {
            throw a.a();
        }
        while (i14 < iE && !sVar.b(i14, i11)) {
            iArr[3] = iArr[3] + 1;
            i14++;
        }
        if (i14 == iE) {
            throw a.a();
        }
        while (i14 < iE && sVar.b(i14, i11)) {
            iArr[4] = iArr[4] + 1;
            i14++;
        }
        return ((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) / 6.0f;
    }

    private static int a(u6 u6Var, u6 u6Var2, u6 u6Var3, float f10) throws a {
        float fA = ((u6.a(u6Var, u6Var2) / f10) + (u6.a(u6Var, u6Var3) / f10)) / 2.0f;
        if (fA >= 28.1f && fA <= 31.1f) {
            return 1;
        }
        if (fA >= 31.7f && fA <= 34.7f) {
            return 2;
        }
        if (fA >= 35.9f && fA <= 38.9f) {
            return 3;
        }
        if (fA >= 41.7f && fA <= 44.7f) {
            return 4;
        }
        if (fA >= 46.3f && fA <= 49.3f) {
            return 5;
        }
        if (fA < 54.4f || fA > 57.4f) {
            return Math.round((fA - 25.0f) / 4.0f);
        }
        return 6;
    }

    private static d6 a(u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, u6 u6Var5, u6 u6Var6, u6 u6Var7, u6 u6Var8) throws a {
        return d6.a(u6Var5.b(), u6Var5.c(), u6Var6.b(), u6Var6.c(), u6Var8.b(), u6Var8.c(), u6Var7.b(), u6Var7.c(), u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c(), u6Var4.b(), u6Var4.c(), u6Var3.b(), u6Var3.c());
    }

    private static s a(s sVar, d6 d6Var, int i10) throws a {
        return s3.a().a(sVar, i10, i10, d6Var, false);
    }

    private float b(int i10, int i11, s sVar) throws a {
        int iC = sVar.c();
        int[] iArr = new int[5];
        for (int i12 = 0; i12 < 5; i12++) {
            iArr[i12] = 0;
        }
        int i13 = i10;
        while (i13 >= 0 && sVar.b(i11, i13)) {
            iArr[2] = iArr[2] + 1;
            i13--;
        }
        if (i13 < 0) {
            throw a.a();
        }
        while (i13 >= 0 && !sVar.b(i11, i13)) {
            iArr[1] = iArr[1] + 1;
            i13--;
        }
        if (i13 < 0) {
            throw a.a();
        }
        while (i13 >= 0 && sVar.b(i11, i13)) {
            iArr[0] = iArr[0] + 1;
            i13--;
        }
        int i14 = i10 + 1;
        while (i14 < iC && sVar.b(i11, i14)) {
            iArr[2] = iArr[2] + 1;
            i14++;
        }
        if (i14 == iC) {
            throw a.a();
        }
        while (i14 < iC && !sVar.b(i11, i14)) {
            iArr[3] = iArr[3] + 1;
            i14++;
        }
        if (i14 == iC) {
            throw a.a();
        }
        while (i14 < iC && sVar.b(i11, i14)) {
            iArr[4] = iArr[4] + 1;
            i14++;
        }
        return ((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) / 6.0f;
    }

    protected final float a(u6 u6Var, u6 u6Var2, u6 u6Var3, s sVar) throws a {
        return (((((a((int) u6Var.b(), (int) u6Var.c(), sVar) + a((int) u6Var2.b(), (int) u6Var2.c(), sVar)) + a((int) u6Var3.b(), (int) u6Var3.c(), sVar)) + b((int) u6Var.c(), (int) u6Var.b(), sVar)) + b((int) u6Var2.c(), (int) u6Var2.b(), sVar)) + b((int) u6Var3.c(), (int) u6Var3.b(), sVar)) / 6.0f;
    }

    public final int a(g3[] g3VarArr, g3 g3Var) throws a {
        this.f61754c = g3VarArr[0];
        this.f61755d = g3VarArr[1];
        g3 g3Var2 = g3VarArr[2];
        this.f61756e = g3Var2;
        if (g3Var == null) {
            this.f61757f = new g3((g3Var2.b() - this.f61755d.b()) + this.f61754c.b(), (this.f61756e.c() - this.f61755d.c()) + this.f61754c.c(), 6.0f);
        } else {
            this.f61757f = g3Var;
        }
        float fA = a(this.f61755d, this.f61756e, this.f61754c, this.f61752a);
        if (fA < 1.0f) {
            throw a.a();
        }
        int iA = a(this.f61755d, this.f61756e, this.f61754c, fA);
        if (iA < 0 || iA > 7) {
            throw a.a();
        }
        return iA;
    }

    public final j2 a(int i10) throws a {
        s sVarA;
        int i11 = i10 - 1;
        double d10 = f61750g[i11];
        float fCos = (float) ((Math.cos(0.7853981633974483d) * d10) + 300.0d);
        float fCos2 = (float) (300.0d - (d10 * Math.cos(0.7853981633974483d)));
        s sVarA2 = a(this.f61752a, a(this.f61755d, this.f61756e, this.f61754c, this.f61757f, new u6(fCos2, fCos2), new u6(fCos, fCos2), new u6(fCos2, fCos), new u6(fCos, fCos)), 600);
        int i12 = f61751h[i11];
        s sVar = new s(i12, i12);
        switch (i10) {
            case 1:
                sVarA = e8.a(sVar, sVarA2, i12, 300.0d);
                break;
            case 2:
                sVarA = h8.a(sVar, sVarA2, i12, 300.0d);
                break;
            case 3:
                sVarA = g8.a(sVar, sVarA2, i12, 300.0d);
                break;
            case 4:
                sVarA = d8.a(sVar, sVarA2, i12, 300.0d);
                break;
            case 5:
                sVarA = c8.a(sVar, sVarA2, i12, 300.0d);
                break;
            case 6:
                sVarA = f8.a(sVar, sVarA2, i12, 300.0d);
                break;
            default:
                throw a.a();
        }
        return new j2(sVarA, new u6[]{this.f61754c, this.f61755d, this.f61756e, this.f61757f});
    }

    public final g3[] a(Map<l1, ?> map) throws a {
        v6 v6Var = map == null ? null : (v6) map.get(l1.NEED_RESULT_POINT_CALLBACK);
        this.f61753b = v6Var;
        return new h3(this.f61752a, v6Var).a(map);
    }
}
