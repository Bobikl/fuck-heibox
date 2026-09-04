package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BarcodeValue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f62077a = new HashMap();

    m() {
    }

    void a(int i10) {
        Integer num = this.f62077a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f62077a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }

    int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.f62077a.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return n5.a(arrayList);
    }
}
