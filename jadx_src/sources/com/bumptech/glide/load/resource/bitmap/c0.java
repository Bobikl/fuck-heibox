package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamBitmapDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class c0 implements com.bumptech.glide.load.g<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f41535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41536b;

    /* JADX INFO: compiled from: StreamBitmapDecoder.java */
    public static class a implements o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RecyclableBufferedInputStream f41537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.util.e f41538b;

        a(RecyclableBufferedInputStream recyclableBufferedInputStream, com.bumptech.glide.util.e eVar) {
            this.f41537a = recyclableBufferedInputStream;
            this.f41538b = eVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void a() {
            this.f41537a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionB = this.f41538b.b();
            if (iOExceptionB != null) {
                if (bitmap == null) {
                    throw iOExceptionB;
                }
                eVar.d(bitmap);
                throw iOExceptionB;
            }
        }
    }

    public c0(o oVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41535a = oVar;
        this.f41536b = bVar;
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 InputStream inputStream, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        boolean z10;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z10 = false;
        } else {
            z10 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f41536b);
        }
        com.bumptech.glide.util.e eVarC = com.bumptech.glide.util.e.c(recyclableBufferedInputStream);
        try {
            return this.f41535a.g(new com.bumptech.glide.util.k(eVarC), i10, i11, fVar, new a(recyclableBufferedInputStream, eVarC));
        } finally {
            eVarC.release();
            if (z10) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.f fVar) {
        return this.f41535a.s(inputStream);
    }
}
