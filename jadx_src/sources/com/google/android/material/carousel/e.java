package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: compiled from: Maskable.java */
/* JADX INFO: loaded from: classes7.dex */
public interface e {
    @n0
    RectF getMaskRectF();

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    float getMaskXPercentage();

    void setMaskXPercentage(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);

    void setOnMaskChangedListener(@p0 j jVar);
}
