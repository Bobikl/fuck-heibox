package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.util.m;

/* JADX INFO: compiled from: BitmapDrawableTranscoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f41722a;

    public b(@n0 Context context) {
        this(context.getResources());
    }

    public b(@n0 Resources resources) {
        this.f41722a = (Resources) m.e(resources);
    }

    @Deprecated
    public b(@n0 Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(resources);
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @p0
    public s<BitmapDrawable> a(@n0 s<Bitmap> sVar, @n0 com.bumptech.glide.load.f fVar) {
        return x.d(this.f41722a, sVar);
    }
}
