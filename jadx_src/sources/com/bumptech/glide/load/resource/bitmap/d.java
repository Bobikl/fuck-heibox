package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: BitmapDrawableTransformation.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class d implements com.bumptech.glide.load.i<BitmapDrawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i<Drawable> f41539c;

    public d(com.bumptech.glide.load.i<Bitmap> iVar) {
        this.f41539c = (com.bumptech.glide.load.i) com.bumptech.glide.util.m.e(new q(iVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.s<BitmapDrawable> c(com.bumptech.glide.load.engine.s<Drawable> sVar) {
        if (sVar.get() instanceof BitmapDrawable) {
            return sVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + sVar.get());
    }

    private static com.bumptech.glide.load.engine.s<Drawable> d(com.bumptech.glide.load.engine.s<BitmapDrawable> sVar) {
        return sVar;
    }

    @Override // com.bumptech.glide.load.i
    @n0
    public com.bumptech.glide.load.engine.s<BitmapDrawable> a(@n0 Context context, @n0 com.bumptech.glide.load.engine.s<BitmapDrawable> sVar, int i10, int i11) {
        return c(this.f41539c.a(context, d(sVar), i10, i11));
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        this.f41539c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f41539c.equals(((d) obj).f41539c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f41539c.hashCode();
    }
}
