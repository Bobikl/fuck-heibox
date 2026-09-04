package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MultipleBarcodeDetector.java */
/* JADX INFO: loaded from: classes7.dex */
public class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<i2> f61669a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61670b = 0;

    public void a(boolean z10, byte[] bArr, int i10, int i11, int i12, boolean z11) {
        float[] fArrMultiBarcodeDetect = LoadOpencvJNIUtil.multiBarcodeDetect(bArr, i10, i11, i12, z11);
        if (fArrMultiBarcodeDetect != null) {
            this.f61670b = fArrMultiBarcodeDetect.length / 10;
        } else {
            this.f61670b = 0;
        }
        for (int i13 = 0; i13 < this.f61670b; i13++) {
            int i14 = i13 * 10;
            if (w7.a(fArrMultiBarcodeDetect, i14)) {
                int i15 = i14 + 1;
                if (w7.a(fArrMultiBarcodeDetect, i15)) {
                    int i16 = i14 + 2;
                    if (w7.a(fArrMultiBarcodeDetect, i16)) {
                        int i17 = i14 + 3;
                        if (w7.a(fArrMultiBarcodeDetect, i17)) {
                            int i18 = i14 + 4;
                            if (w7.a(fArrMultiBarcodeDetect, i18)) {
                                int i19 = i14 + 5;
                                if (w7.a(fArrMultiBarcodeDetect, i19)) {
                                    int i20 = i14 + 6;
                                    if (w7.a(fArrMultiBarcodeDetect, i20)) {
                                        int i21 = i14 + 7;
                                        if (w7.a(fArrMultiBarcodeDetect, i21)) {
                                            int i22 = i14 + 8;
                                            if (w7.a(fArrMultiBarcodeDetect, i22)) {
                                                int i23 = i14 + 9;
                                                if (w7.a(fArrMultiBarcodeDetect, i23)) {
                                                    this.f61669a.add(new i2(z10, fArrMultiBarcodeDetect[i14], fArrMultiBarcodeDetect[i15], fArrMultiBarcodeDetect[i16], fArrMultiBarcodeDetect[i17], fArrMultiBarcodeDetect[i18], fArrMultiBarcodeDetect[i19], fArrMultiBarcodeDetect[i20], fArrMultiBarcodeDetect[i21], fArrMultiBarcodeDetect[i22], fArrMultiBarcodeDetect[i23]));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
