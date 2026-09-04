package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: BitmapResource.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements com.bumptech.glide.load.engine.s<Bitmap>, com.bumptech.glide.load.engine.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f41560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41561c;

    public g(@n0 Bitmap bitmap, @n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f41560b = (Bitmap) com.bumptech.glide.util.m.f(bitmap, "Bitmap must not be null");
        this.f41561c = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.m.f(eVar, "BitmapPool must not be null");
    }

    @p0
    public static g d(@p0 Bitmap bitmap, @n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return com.bumptech.glide.util.o.i(this.f41560b);
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f41560b;
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        this.f41560b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
        this.f41561c.d(this.f41560b);
    }
}
