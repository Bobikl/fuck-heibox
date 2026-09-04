package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: GifBitmapProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements com.bumptech.glide.gifdecoder.a.InterfaceC0323a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f41668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41669b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(eVar, null);
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @p0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41668a = eVar;
        this.f41669b = bVar;
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0323a
    @n0
    public byte[] a(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f41669b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0323a
    @n0
    public Bitmap b(int i10, int i11, @n0 Bitmap.Config config) {
        return this.f41668a.f(i10, i11, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0323a
    public void c(@n0 Bitmap bitmap) {
        this.f41668a.d(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0323a
    @n0
    public int[] d(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f41669b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0323a
    public void e(@n0 byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f41669b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0323a
    public void f(@n0 int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f41669b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
