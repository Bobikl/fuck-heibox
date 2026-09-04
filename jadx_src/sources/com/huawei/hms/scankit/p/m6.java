package com.huawei.hms.scankit.p;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: RGBLuminanceSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m6 extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f62116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f62119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f62120g;

    public m6(int i10, int i11, ByteBuffer byteBuffer) {
        super(i10, i11);
        this.f62117d = i10;
        this.f62118e = i11;
        this.f62119f = 0;
        this.f62120g = 0;
        byte[] bArrArray = byteBuffer.array();
        int i12 = i10 * i11;
        this.f62116c = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 * 4;
            if ((bArrArray[i14 + 3] & 255) == 0) {
                this.f62116c[i13] = -1;
            } else {
                this.f62116c[i13] = (byte) ((((((bArrArray[i14] & 255) * 306) + ((bArrArray[i14 + 1] & 255) * 601)) + ((bArrArray[i14 + 2] & 255) * 117)) + 512) >> 10);
            }
        }
    }

    private m6(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15) throws Exception {
        super(i14, i15);
        if (i14 + i12 > i10 || i15 + i13 > i11) {
            try {
                throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f62116c = bArr;
        this.f62117d = i10;
        this.f62118e = i11;
        this.f62119f = i12;
        this.f62120g = i13;
    }

    @Override // com.huawei.hms.scankit.p.p4
    public p4 a(int i10, int i11, int i12, int i13) {
        return new m6(this.f62116c, this.f62117d, this.f62118e, this.f62119f + i10, this.f62120g + i11, i12, i13);
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
        System.arraycopy(this.f62116c, ((i10 + this.f62120g) * this.f62117d) + this.f62119f, bArr, 0, iC);
        return bArr;
    }

    @Override // com.huawei.hms.scankit.p.p4
    public byte[] b() {
        int iC = c();
        int iA = a();
        int i10 = this.f62117d;
        if (iC == i10 && iA == this.f62118e) {
            return this.f62116c;
        }
        int i11 = iC * iA;
        byte[] bArr = new byte[i11];
        int i12 = (this.f62120g * i10) + this.f62119f;
        if (iC == i10) {
            System.arraycopy(this.f62116c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < iA; i13++) {
            System.arraycopy(this.f62116c, i12, bArr, i13 * iC, iC);
            i12 += this.f62117d;
        }
        return bArr;
    }
}
