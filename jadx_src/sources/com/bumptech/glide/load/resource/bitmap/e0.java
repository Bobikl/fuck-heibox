package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;

/* JADX INFO: compiled from: UnitBitmapDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements com.bumptech.glide.load.g<Bitmap, Bitmap> {

    /* JADX INFO: compiled from: UnitBitmapDecoder.java */
    public static final class a implements com.bumptech.glide.load.engine.s<Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f41557b;

        a(@n0 Bitmap bitmap) {
            this.f41557b = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.s
        public int a() {
            return com.bumptech.glide.util.o.i(this.f41557b);
        }

        @Override // com.bumptech.glide.load.engine.s
        @n0
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.s
        @n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f41557b;
        }

        @Override // com.bumptech.glide.load.engine.s
        public void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 Bitmap bitmap, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 Bitmap bitmap, @n0 com.bumptech.glide.load.f fVar) {
        return true;
    }
}
