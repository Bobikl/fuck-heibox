package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f62359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a8 f62360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m3 f62361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62362d;

    t(s sVar) throws a {
        int iC = sVar.c();
        if (iC < 21 || (iC & 3) != 1) {
            throw a.a();
        }
        this.f62359a = sVar;
    }

    private int a(int i10, int i11, int i12) {
        return this.f62362d ? this.f62359a.b(i11, i10) : this.f62359a.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    void a() throws a {
        if (this.f62359a == null) {
            throw a.a();
        }
        int i10 = 0;
        while (i10 < this.f62359a.e()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f62359a.c(); i12++) {
                if (this.f62359a.b(i10, i12) != this.f62359a.b(i12, i10)) {
                    this.f62359a.a(i12, i10);
                    this.f62359a.a(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    void a(boolean z10) {
        this.f62360b = null;
        this.f62361c = null;
        this.f62362d = z10;
    }

    byte[] b() throws Exception {
        m3 m3VarC = c();
        a8 a8VarD = d();
        f1 f1Var = f1.values()[m3VarC.b()];
        int iC = this.f62359a.c();
        f1Var.a(this.f62359a, iC);
        s sVarA = a8VarD.a();
        byte[] bArr = new byte[a8VarD.l()];
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
                        if (this.f62359a.b(i18, i16)) {
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
        if (i12 == a8VarD.l()) {
            return bArr;
        }
        throw a.a();
    }

    m3 c() throws a {
        m3 m3Var = this.f62361c;
        if (m3Var != null) {
            return m3Var;
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
        int iC = this.f62359a.c();
        int i12 = iC - 7;
        for (int i13 = iC - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iC - 8; i14 < iC; i14++) {
            iA = a(i14, 8, iA);
        }
        m3 m3VarA = m3.a(iA3, iA);
        this.f62361c = m3VarA;
        if (m3VarA != null) {
            return m3VarA;
        }
        throw a.a();
    }

    a8 d() throws a {
        a8 a8Var = this.f62360b;
        if (a8Var != null) {
            return a8Var;
        }
        int iC = this.f62359a.c();
        int i10 = (iC - 17) / 4;
        if (i10 <= 6) {
            return a8.b(i10);
        }
        int i11 = iC - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iC - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        a8 a8VarA = a8.a(iA2);
        if (a8VarA != null && a8VarA.k() == iC) {
            this.f62360b = a8VarA;
            return a8VarA;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iC - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        a8 a8VarA2 = a8.a(iA);
        if (a8VarA2 == null || a8VarA2.k() != iC) {
            throw a.a();
        }
        this.f62360b = a8VarA2;
        return a8VarA2;
    }

    void e() {
        if (this.f62361c == null) {
            return;
        }
        f1.values()[this.f62361c.b()].a(this.f62359a, this.f62359a.c());
    }
}
