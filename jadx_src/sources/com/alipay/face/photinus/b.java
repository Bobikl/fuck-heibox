package com.alipay.face.photinus;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ColorHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    b() {
    }

    static List<Integer> a(List<Integer> list, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Collections.nCopies(i10, -7829368));
        arrayList.addAll(list);
        arrayList.addAll(Collections.nCopies(i10, -7829368));
        return arrayList;
    }

    static int[] b(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return iArr;
    }

    static int c(int i10, int i11, float f10) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = 1.0f - f10;
        return Color.rgb((int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    static List<Integer> d(int[] iArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            arrayList.add(Integer.valueOf(i12));
            if (i11 < iArr.length - 1 && i12 == iArr[i11 + 1]) {
                for (int i13 = 0; i13 < i10; i13++) {
                    arrayList.add(Integer.valueOf(i12));
                }
            }
        }
        return arrayList;
    }

    static List<Integer> e(List<Integer> list, int i10) {
        if (i10 <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue = list.get(i11).intValue();
            if (i11 == list.size() - 1) {
                arrayList.add(Integer.valueOf(iIntValue));
            } else {
                int iIntValue2 = list.get(i11 + 1).intValue();
                if (iIntValue == iIntValue2) {
                    arrayList.add(Integer.valueOf(iIntValue));
                } else {
                    int i12 = i10 + 1;
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList.add(Integer.valueOf(c(iIntValue, iIntValue2, i13 / i12)));
                    }
                }
            }
        }
        return arrayList;
    }
}
