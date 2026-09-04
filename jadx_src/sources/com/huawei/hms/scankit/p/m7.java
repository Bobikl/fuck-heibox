package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: UPCAWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m7 implements l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2 f62121a = new p2();

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<u2, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + barcodeFormat);
        }
        return this.f62121a.a('0' + str, BarcodeFormat.EAN_13, i10, i11, map);
    }
}
