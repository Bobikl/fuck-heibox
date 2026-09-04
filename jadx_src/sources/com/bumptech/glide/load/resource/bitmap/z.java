package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ResourceBitmapDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class z implements com.bumptech.glide.load.g<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.drawable.g f41633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41634b;

    public z(com.bumptech.glide.load.resource.drawable.g gVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f41633a = gVar;
        this.f41634b = eVar;
    }

    @Override // com.bumptech.glide.load.g
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.load.engine.s<Drawable> sVarB = this.f41633a.b(uri, i10, i11, fVar);
        if (sVarB == null) {
            return null;
        }
        return p.a(this.f41634b, sVarB.get(), i10, i11);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 Uri uri, @n0 com.bumptech.glide.load.f fVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
