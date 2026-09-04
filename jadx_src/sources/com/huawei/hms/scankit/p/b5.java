package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MultiFormatUPCEANReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b5 extends g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7[] f61568a;

    public b5(Map<l1, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(l1.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new o2());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new l7());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new q2());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new s7());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new o2());
            arrayList.add(new q2());
            arrayList.add(new s7());
        }
        this.f61568a = (q7[]) arrayList.toArray(new q7[arrayList.size()]);
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        for (int[] iArr : q7.b(rVar)) {
            for (q7 q7Var : this.f61568a) {
                try {
                    s6 s6VarA = q7Var.a(i10, rVar, iArr, map);
                    boolean z10 = s6VarA.c() == BarcodeFormat.EAN_13 && s6VarA.k().charAt(0) == '0';
                    Collection collection = map == null ? null : (Collection) map.get(l1.POSSIBLE_FORMATS);
                    return (z10 && (collection == null || collection.contains(BarcodeFormat.UPC_A))) ? new s6(s6VarA.k().substring(1), s6VarA.i(), s6VarA.j(), BarcodeFormat.UPC_A) : s6VarA;
                } catch (a unused) {
                }
            }
        }
        throw a.a();
    }
}
