package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;

/* JADX INFO: compiled from: LazyBitmapDrawableResource.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x implements com.bumptech.glide.load.engine.s<BitmapDrawable>, com.bumptech.glide.load.engine.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f41629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.s<Bitmap> f41630c;

    private x(@n0 Resources resources, @n0 com.bumptech.glide.load.engine.s<Bitmap> sVar) {
        this.f41629b = (Resources) com.bumptech.glide.util.m.e(resources);
        this.f41630c = (com.bumptech.glide.load.engine.s) com.bumptech.glide.util.m.e(sVar);
    }

    @p0
    public static com.bumptech.glide.load.engine.s<BitmapDrawable> d(@n0 Resources resources, @p0 com.bumptech.glide.load.engine.s<Bitmap> sVar) {
        if (sVar == null) {
            return null;
        }
        return new x(resources, sVar);
    }

    @Deprecated
    public static x e(Context context, Bitmap bitmap) {
        return (x) d(context.getResources(), g.d(bitmap, Glide.e(context).h()));
    }

    @Deprecated
    public static x f(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        return (x) d(resources, g.d(bitmap, eVar));
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return this.f41630c.a();
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f41629b, this.f41630c.get());
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        com.bumptech.glide.load.engine.s<Bitmap> sVar = this.f41630c;
        if (sVar instanceof com.bumptech.glide.load.engine.o) {
            ((com.bumptech.glide.load.engine.o) sVar).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
        this.f41630c.recycle();
    }
}
