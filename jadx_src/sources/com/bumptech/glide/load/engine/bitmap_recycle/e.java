package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.n0;

/* JADX INFO: compiled from: BitmapPool.java */
/* JADX INFO: loaded from: classes6.dex */
public interface e {
    void a(int i10);

    void b();

    void c(float f10);

    void d(Bitmap bitmap);

    @n0
    Bitmap e(int i10, int i11, Bitmap.Config config);

    @n0
    Bitmap f(int i10, int i11, Bitmap.Config config);

    long getMaxSize();
}
