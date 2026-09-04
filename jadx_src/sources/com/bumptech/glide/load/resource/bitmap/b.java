package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.n0;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: compiled from: BitmapDrawableEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements com.bumptech.glide.load.h<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.h<Bitmap> f41530b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.h<Bitmap> hVar) {
        this.f41529a = eVar;
        this.f41530b = hVar;
    }

    @Override // com.bumptech.glide.load.h
    @n0
    public EncodeStrategy b(@n0 com.bumptech.glide.load.f fVar) {
        return this.f41530b.b(fVar);
    }

    @Override // com.bumptech.glide.load.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 com.bumptech.glide.load.engine.s<BitmapDrawable> sVar, @n0 File file, @n0 com.bumptech.glide.load.f fVar) {
        return this.f41530b.a((Bitmap) new g(sVar.get().getBitmap(), this.f41529a), file, fVar);
    }
}
