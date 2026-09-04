package com.tencent.liteav.videobase.utils;

import android.graphics.PointF;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class PerspectiveTransformMatrixCalculator {
    public static float[] getPerspectiveTransformMatrix(List<PointF> list, List<PointF> list2) {
        return nativeGetPerspectiveTransformMatrix(com.tencent.liteav.base.util.g.a(list), com.tencent.liteav.base.util.g.a(list2));
    }

    public static native float[] nativeGetPerspectiveTransformMatrix(float[] fArr, float[] fArr2);
}
