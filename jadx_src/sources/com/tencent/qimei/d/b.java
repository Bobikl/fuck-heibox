package com.tencent.qimei.d;

import com.tencent.qimei.beaconid.U;
import com.tencent.qimei.l.g;

/* JADX INFO: compiled from: BeaconIdJNI.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static synchronized String a(int i10) {
        String[] strArrA = U.a(i10);
        if (strArrA == null) {
            return null;
        }
        g.a(strArrA);
        for (int i11 = 0; i11 < strArrA.length; i11++) {
            strArrA[i11] = g.a(strArrA[i11]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < strArrA.length; i12++) {
            if (i12 >= 9) {
                sb2.append("k");
                sb2.append(i12 + 2);
                sb2.append(":");
                sb2.append(strArrA[i12]);
                sb2.append(";");
            } else {
                sb2.append("k");
                sb2.append(i12 + 1);
                sb2.append(":");
                sb2.append(strArrA[i12]);
                sb2.append(";");
            }
        }
        sb2.append("k10:");
        sb2.append(1);
        return sb2.toString();
    }
}
