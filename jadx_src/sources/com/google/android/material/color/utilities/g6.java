package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: QuantizerMap.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class g6 implements e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<Integer, Integer> f53862a;

    @Override // com.google.android.material.color.utilities.e6
    public h6 a(int[] iArr, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(iIntValue));
        }
        this.f53862a = linkedHashMap;
        return new h6(linkedHashMap);
    }

    public Map<Integer, Integer> b() {
        return this.f53862a;
    }
}
