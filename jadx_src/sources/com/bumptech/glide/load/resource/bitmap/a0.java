package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Rotate.java */
/* JADX INFO: loaded from: classes6.dex */
public class a0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41526d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f41527e = f41526d.getBytes(com.bumptech.glide.load.c.f40833b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41528c;

    public a0(int i10) {
        this.f41528c = i10;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(f41527e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f41528c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        return d0.n(bitmap, this.f41528c);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return (obj instanceof a0) && this.f41528c == ((a0) obj).f41528c;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return com.bumptech.glide.util.o.q(-950519196, com.bumptech.glide.util.o.p(this.f41528c));
    }
}
