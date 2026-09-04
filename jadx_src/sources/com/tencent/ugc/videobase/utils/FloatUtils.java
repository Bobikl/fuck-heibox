package com.tencent.ugc.videobase.utils;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FloatUtils {
    private static final float THRESHOLD = 1.0E-6f;

    public static List<PointF> convertFloatArrayToPointFList(float[] fArr) {
        if (fArr == null || (fArr.length & 1) == 1) {
            return null;
        }
        int i10 = 0;
        ArrayList arrayList = new ArrayList();
        while (i10 < fArr.length) {
            int i11 = i10 + 1;
            arrayList.add(new PointF(fArr[i10], fArr[i11]));
            i10 = i11 + 1;
        }
        return arrayList;
    }

    public static float[] convertPointFListToFloatArray(List<PointF> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        float[] fArr = new float[size * 2];
        for (int i10 = 0; i10 < size; i10++) {
            PointF pointF = list.get(i10);
            int i11 = i10 * 2;
            fArr[i11] = pointF.x;
            fArr[i11 + 1] = pointF.y;
        }
        return fArr;
    }

    public static boolean isEqual(double d10, double d11) {
        return Math.abs(d10 - d11) < 9.999999974752427E-7d;
    }

    public static boolean isEqual(float f10, float f11) {
        return Math.abs(f10 - f11) < THRESHOLD;
    }
}
