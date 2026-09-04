package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.x;

/* JADX INFO: compiled from: CarouselStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    static float a(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    abstract c b(@n0 a aVar, @n0 View view);
}
