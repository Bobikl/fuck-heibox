package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.n0;

/* JADX INFO: compiled from: BitmapPoolAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements e {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void a(int i10) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c(float f10) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @n0
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @n0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return e(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long getMaxSize() {
        return 0L;
    }
}
