package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferBitmapDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements com.bumptech.glide.load.g<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f41562a;

    public j(o oVar) {
        this.f41562a = oVar;
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 ByteBuffer byteBuffer, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return this.f41562a.h(byteBuffer, i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.f fVar) {
        return this.f41562a.t(byteBuffer);
    }
}
