package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: DrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f41724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.resource.gif.c, byte[]> f41725c;

    public c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 e<Bitmap, byte[]> eVar2, @n0 e<com.bumptech.glide.load.resource.gif.c, byte[]> eVar3) {
        this.f41723a = eVar;
        this.f41724b = eVar2;
        this.f41725c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    private static s<com.bumptech.glide.load.resource.gif.c> b(@n0 s<Drawable> sVar) {
        return sVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @p0
    public s<byte[]> a(@n0 s<Drawable> sVar, @n0 com.bumptech.glide.load.f fVar) {
        Drawable drawable = sVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f41724b.a(com.bumptech.glide.load.resource.bitmap.g.d(((BitmapDrawable) drawable).getBitmap(), this.f41723a), fVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.f41725c.a(b(sVar), fVar);
        }
        return null;
    }
}
