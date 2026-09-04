package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: UPCAReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l7 extends q7 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q7 f62076h = new o2();

    private static s6 a(s6 s6Var) throws a {
        String strK = s6Var.k();
        if (strK.charAt(0) == '0') {
            return new s6(strK.substring(1), null, s6Var.j(), BarcodeFormat.UPC_A);
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(r rVar, int[] iArr, StringBuilder sb2) throws a {
        return this.f62076h.a(rVar, iArr, sb2);
    }

    @Override // com.huawei.hms.scankit.p.q7
    BarcodeFormat a() {
        return BarcodeFormat.UPC_A;
    }

    @Override // com.huawei.hms.scankit.p.q7, com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        return a(this.f62076h.a(i10, rVar, map));
    }

    @Override // com.huawei.hms.scankit.p.q7
    public s6 a(int i10, r rVar, int[] iArr, Map<l1, ?> map) throws a {
        return a(this.f62076h.a(i10, rVar, iArr, map));
    }

    @Override // com.huawei.hms.scankit.p.g5, com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws a {
        return a(this.f62076h.a(pVar, map));
    }

    @Override // com.huawei.hms.scankit.p.q7
    public boolean a(int i10, int i11, r rVar) {
        return rVar.a(i11, (i11 - i10) + i11, false, false);
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] iArr, int[] iArr2) throws a {
        int i10 = iArr2[1];
        int i11 = i10 - iArr2[0];
        int i12 = iArr[1];
        int i13 = iArr[0];
        return Math.abs(((int) Math.round(((double) (i10 - i13)) / (((double) (i11 + (i12 - i13))) / 6.0d))) + com.ss.android.ttvecamera.o.f97695q) <= 5;
    }
}
