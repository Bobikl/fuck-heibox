package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: GifFrameResourceDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements com.bumptech.glide.load.g<com.bumptech.glide.gifdecoder.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41713a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f41713a = eVar;
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Bitmap> b(@n0 com.bumptech.glide.gifdecoder.a aVar, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return com.bumptech.glide.load.resource.bitmap.g.d(aVar.i(), this.f41713a);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 com.bumptech.glide.gifdecoder.a aVar, @n0 com.bumptech.glide.load.f fVar) {
        return true;
    }
}
