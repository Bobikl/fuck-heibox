package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.n0;
import androidx.transition.PathMotion;

/* JADX INFO: compiled from: MaterialArcMotion.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k extends PathMotion {
    private static PointF b(float f10, float f11, float f12, float f13) {
        return f11 > f13 ? new PointF(f12, f11) : new PointF(f10, f13);
    }

    @Override // androidx.transition.PathMotion
    @n0
    public Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        PointF pointFB = b(f10, f11, f12, f13);
        path.quadTo(pointFB.x, pointFB.y, f12, f13);
        return path;
    }
}
