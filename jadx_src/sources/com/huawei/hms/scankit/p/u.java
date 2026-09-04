package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f62382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b8 f62383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l3 f62384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62385d;

    u(s sVar) throws a {
        int iC = sVar.c();
        if (iC < 21 || (iC & 3) != 1) {
            throw a.a();
        }
        this.f62382a = sVar;
    }

    private int a(int i10, int i11, int i12) {
        return this.f62385d ? this.f62382a.b(i11, i10) : this.f62382a.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    void a() {
        int i10 = 0;
        while (i10 < this.f62382a.e()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f62382a.c(); i12++) {
                if (this.f62382a.b(i10, i12) != this.f62382a.b(i12, i10)) {
                    this.f62382a.a(i12, i10);
                    this.f62382a.a(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    void a(boolean z10) {
        this.f62383b = null;
        this.f62384c = null;
        this.f62385d = z10;
    }

    byte[] b() throws Exception {
        l3 l3VarC = c();
        b8 b8VarD = d();
        g1 g1Var = g1.values()[l3VarC.a()];
        int iC = this.f62382a.c();
        g1Var.a(this.f62382a, iC);
        s sVarA = b8VarD.a();
        byte[] bArr = new byte[b8VarD.e()];
        int i10 = iC - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < iC; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!sVarA.b(i18, i16)) {
                        i14++;
                        i13 <<= 1;
                        if (this.f62382a.b(i18, i16)) {
                            i13 |= 1;
                        }
                        if (i14 == 8) {
                            bArr[i12] = (byte) i13;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == b8VarD.e()) {
            return bArr;
        }
        throw a.a();
    }

    l3 c() throws a {
        l3 l3Var = this.f62384c;
        if (l3Var != null) {
            return l3Var;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int iC = this.f62382a.c();
        int i12 = iC - 7;
        for (int i13 = iC - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iC - 8; i14 < iC; i14++) {
            iA = a(i14, 8, iA);
        }
        l3 l3VarA = l3.a(iA3, iA);
        this.f62384c = l3VarA;
        if (l3VarA != null) {
            return l3VarA;
        }
        throw a.a();
    }

    b8 d() throws a {
        b8 b8Var = this.f62383b;
        if (b8Var != null) {
            return b8Var;
        }
        int iC = this.f62382a.c();
        int i10 = (iC - 17) / 4;
        if (i10 <= 6) {
            return b8.c(i10);
        }
        int i11 = iC - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iC - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        b8 b8VarA = b8.a(iA2);
        if (b8VarA != null && b8VarA.d() == iC) {
            this.f62383b = b8VarA;
            return b8VarA;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iC - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        b8 b8VarA2 = b8.a(iA);
        if (b8VarA2 == null || b8VarA2.d() != iC) {
            throw a.a();
        }
        this.f62383b = b8VarA2;
        return b8VarA2;
    }

    void e() {
        if (this.f62384c == null) {
            return;
        }
        g1.values()[this.f62384c.a()].a(this.f62382a, this.f62382a.c());
    }
}
