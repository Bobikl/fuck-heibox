package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: CenterInside.java */
/* JADX INFO: loaded from: classes6.dex */
public class m extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41566c = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f41567d = f41566c.getBytes(com.bumptech.glide.load.c.f40833b);

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(f41567d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        return d0.c(eVar, bitmap, i10, i11);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return -670243078;
    }
}
