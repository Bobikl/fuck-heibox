package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.p0;

/* JADX INFO: compiled from: LruPoolStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
public interface l {
    String a(int i10, int i11, Bitmap.Config config);

    int b(Bitmap bitmap);

    String c(Bitmap bitmap);

    void d(Bitmap bitmap);

    @p0
    Bitmap e(int i10, int i11, Bitmap.Config config);

    @p0
    Bitmap removeLast();
}
