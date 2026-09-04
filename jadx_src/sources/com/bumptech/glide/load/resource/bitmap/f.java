package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(api = 28)
public final class f implements com.bumptech.glide.load.g<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41558b = "BitmapImageDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41559a = new com.bumptech.glide.load.engine.bitmap_recycle.f();

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 ImageDecoder.Source source, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new com.bumptech.glide.load.resource.a(i10, i11, fVar));
        if (Log.isLoggable(f41558b, 2)) {
            Log.v(f41558b, "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new g(bitmapDecodeBitmap, this.f41559a);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 ImageDecoder.Source source, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }
}
