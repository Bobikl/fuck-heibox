package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: PlanarYUVLuminanceSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e6 extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f61767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f61768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f61769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61771g;

    public e6(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) throws Exception {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            try {
                throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f61767c = bArr;
        this.f61768d = i10;
        this.f61769e = i11;
        this.f61770f = i12;
        this.f61771g = i13;
        if (z10) {
            a(i14, i15);
        }
    }

    private void a(int i10, int i11) {
        byte[] bArr = this.f61767c;
        int i12 = (this.f61771g * this.f61768d) + this.f61770f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                if (w7.a(bArr, i16) && w7.a(bArr, i15)) {
                    byte b10 = bArr[i16];
                    bArr[i16] = bArr[i15];
                    bArr[i15] = b10;
                }
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f61768d;
        }
    }

    @Override // com.huawei.hms.scankit.p.p4
    public p4 a(int i10, int i11, int i12, int i13) {
        return new e6(this.f61767c, this.f61768d, this.f61769e, this.f61770f + i10, this.f61771g + i11, i12, i13, false);
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] a(int i10, byte[] bArr) throws Exception {
        if (i10 < 0 || i10 >= a()) {
            try {
                throw new IllegalArgumentException("Requested row is outside the image: " + i10);
            } catch (Exception e10) {
                throw e10;
            }
        }
        int iC = c();
        if (bArr == null || bArr.length < iC) {
            bArr = new byte[iC];
        }
        System.arraycopy(this.f61767c, ((i10 + this.f61771g) * this.f61768d) + this.f61770f, bArr, 0, iC);
        return bArr;
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] b() {
        int iC = c();
        int iA = a();
        int i10 = this.f61768d;
        if (iC == i10 && iA == this.f61769e) {
            return this.f61767c;
        }
        int i11 = iC * iA;
        byte[] bArr = new byte[i11];
        int i12 = (this.f61771g * i10) + this.f61770f;
        if (iC == i10) {
            try {
                System.arraycopy(this.f61767c, i12, bArr, 0, i11);
                return bArr;
            } catch (ArrayIndexOutOfBoundsException | Exception unused) {
                return null;
            }
        }
        for (int i13 = 0; i13 < iA; i13++) {
            try {
                System.arraycopy(this.f61767c, i12, bArr, i13 * iC, iC);
                i12 += this.f61768d;
            } catch (ArrayIndexOutOfBoundsException | Exception unused2) {
                return null;
            }
        }
        return bArr;
    }
}
