package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.n0;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapDrawableDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class a<DataType> implements com.bumptech.glide.load.g<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.g<DataType, Bitmap> f41524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f41525b;

    public a(Context context, com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this(context.getResources(), gVar);
    }

    @Deprecated
    public a(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this(resources, gVar);
    }

    public a(@n0 Resources resources, @n0 com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this.f41525b = (Resources) com.bumptech.glide.util.m.e(resources);
        this.f41524a = (com.bumptech.glide.load.g) com.bumptech.glide.util.m.e(gVar);
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@n0 DataType datatype, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return this.f41524a.a(datatype, fVar);
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.s<BitmapDrawable> b(@n0 DataType datatype, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return x.d(this.f41525b, this.f41524a.b(datatype, i10, i11, fVar));
    }
}
