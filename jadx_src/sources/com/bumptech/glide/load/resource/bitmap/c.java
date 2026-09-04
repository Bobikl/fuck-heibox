package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.n0;

/* JADX INFO: compiled from: BitmapDrawableResource.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends com.bumptech.glide.load.resource.drawable.d<BitmapDrawable> implements com.bumptech.glide.load.engine.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41534c;

    public c(BitmapDrawable bitmapDrawable, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(bitmapDrawable);
        this.f41534c = eVar;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return com.bumptech.glide.util.o.i(((BitmapDrawable) this.f41649b).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.resource.drawable.d, com.bumptech.glide.load.engine.o
    public void initialize() {
        ((BitmapDrawable) this.f41649b).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
        this.f41534c.d(((BitmapDrawable) this.f41649b).getBitmap());
    }
}
