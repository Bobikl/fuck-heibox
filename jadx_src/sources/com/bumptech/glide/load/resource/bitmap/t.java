package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: GranularRoundedCorners.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f41594g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f41595h = f41594g.getBytes(com.bumptech.glide.load.c.f40833b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f41596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f41597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f41598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f41599f;

    public t(float f10, float f11, float f12, float f13) {
        this.f41596c = f10;
        this.f41597d = f11;
        this.f41598e = f12;
        this.f41599f = f13;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(f41595h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f41596c).putFloat(this.f41597d).putFloat(this.f41598e).putFloat(this.f41599f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        return d0.p(eVar, bitmap, this.f41596c, this.f41597d, this.f41598e, this.f41599f);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f41596c == tVar.f41596c && this.f41597d == tVar.f41597d && this.f41598e == tVar.f41598e && this.f41599f == tVar.f41599f;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return com.bumptech.glide.util.o.o(this.f41599f, com.bumptech.glide.util.o.o(this.f41598e, com.bumptech.glide.util.o.o(this.f41597d, com.bumptech.glide.util.o.q(-2013597734, com.bumptech.glide.util.o.n(this.f41596c)))));
    }
}
