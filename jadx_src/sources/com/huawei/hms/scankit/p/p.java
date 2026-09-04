package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BinaryBitmap.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f62211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f62212b;

    public p(o oVar) throws Exception {
        if (oVar != null) {
            this.f62211a = oVar;
        } else {
            try {
                throw new IllegalArgumentException("Binarizer must be non-null.");
            } catch (Exception e10) {
                throw e10;
            }
        }
    }

    private r a(int i10, int i11, int[] iArr, int[] iArr2, byte[] bArr, int i12) {
        int i13;
        r rVar = new r(i11);
        for (int i14 = 1; i14 < i11; i14++) {
            int i15 = iArr2[i14 - 1];
            byte b10 = bArr[i14];
            iArr2[i14] = i15 + ((b10 & 255) * (b10 & 255));
        }
        int i16 = i12 + 1;
        int i17 = i16;
        while (true) {
            i13 = i11 - i12;
            if (i17 >= i13) {
                break;
            }
            int i18 = i17 + i12;
            int i19 = (i17 - i12) - 1;
            double d10 = iArr[i18] - iArr[i19];
            double d11 = i10;
            if ((bArr[i17] & 255) <= (d10 / d11) * ((((double) 0.5f) * (Math.sqrt((((double) (iArr2[i18] - iArr2[i19])) - ((d10 * d10) / d11)) / ((double) (i10 - 1))) / ((double) 127))) + 1.0d)) {
                rVar.g(i17);
            }
            i17++;
        }
        if (rVar.b(i16)) {
            rVar.c(0, i16);
        }
        if (rVar.b(i13 - 1)) {
            rVar.c(i13, i11);
        }
        return rVar;
    }

    public o a() {
        return this.f62211a;
    }

    public p a(int i10, int i11, int i12, int i13) {
        return new p(this.f62211a.a(this.f62211a.c().a(i10, i11, i12, i13)));
    }

    public r a(int i10, int i11) throws a {
        int i12;
        int iE = e();
        if (iE < 45) {
            throw a.a();
        }
        r rVar = new r(iE);
        byte[] bArr = new byte[iE];
        a().c().a(i10, bArr);
        int[] iArr = new int[iE];
        int[] iArr2 = new int[iE];
        int i13 = bArr[0] & 255;
        iArr[0] = i13;
        iArr2[0] = i13 * i13;
        for (int i14 = 1; i14 < iE; i14++) {
            iArr[i14] = iArr[i14 - 1] + (bArr[i14] & 255);
        }
        if (i11 != 0) {
            return a(45, iE, iArr, iArr2, bArr, 22);
        }
        int i15 = 23;
        while (true) {
            i12 = iE - 22;
            if (i15 >= i12) {
                break;
            }
            if ((bArr[i15] & 255) + 5 < (iArr[i15 + 22] - iArr[(i15 - 22) - 1]) / 45) {
                rVar.g(i15);
            }
            i15++;
        }
        if (rVar.b(23)) {
            rVar.c(0, 23);
        }
        if (rVar.b(i12 - 1)) {
            rVar.c(i12, iE);
        }
        return rVar;
    }

    public r a(int i10, r rVar) throws a {
        return this.f62211a.a(i10, rVar);
    }

    public void a(s sVar) {
        this.f62212b = sVar;
    }

    public s b() throws a {
        if (this.f62212b == null) {
            this.f62212b = this.f62211a.a();
        }
        return this.f62212b;
    }

    public int c() {
        return this.f62211a.b();
    }

    public byte[] d() {
        return this.f62211a.c().b();
    }

    public int e() {
        return this.f62211a.d();
    }
}
