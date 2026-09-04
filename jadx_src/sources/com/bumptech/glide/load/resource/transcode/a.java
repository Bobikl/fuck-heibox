package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: BitmapBytesTranscoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f41720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41721b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(@n0 Bitmap.CompressFormat compressFormat, int i10) {
        this.f41720a = compressFormat;
        this.f41721b = i10;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @p0
    public s<byte[]> a(@n0 s<Bitmap> sVar, @n0 com.bumptech.glide.load.f fVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sVar.get().compress(this.f41720a, this.f41721b, byteArrayOutputStream);
        sVar.recycle();
        return new w6.b(byteArrayOutputStream.toByteArray());
    }
}
