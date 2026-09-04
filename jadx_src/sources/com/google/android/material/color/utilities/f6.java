package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: QuantizerCelebi.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class f6 {
    private f6() {
    }

    public static Map<Integer, Integer> a(int[] iArr, int i10) {
        Set<Integer> setKeySet = new QuantizerWu().a(iArr, i10).f53864a.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr2[i11] = it.next().intValue();
            i11++;
        }
        return i6.a(iArr, iArr2, i10);
    }
}
