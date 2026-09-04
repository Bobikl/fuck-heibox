package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41531d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f41532e = f41531d.getBytes(com.bumptech.glide.load.c.f40833b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41533c;

    public b0(int i10) {
        com.bumptech.glide.util.m.b(i10 > 0, "roundingRadius must be greater than 0.");
        this.f41533c = i10;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(f41532e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f41533c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        return d0.q(eVar, bitmap, this.f41533c);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return (obj instanceof b0) && this.f41533c == ((b0) obj).f41533c;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return com.bumptech.glide.util.o.q(-569625254, com.bumptech.glide.util.o.p(this.f41533c));
    }
}
