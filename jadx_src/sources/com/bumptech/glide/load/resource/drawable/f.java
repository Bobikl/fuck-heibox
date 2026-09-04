package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: NonOwnedDrawableResource.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends d<Drawable> {
    private f(Drawable drawable) {
        super(drawable);
    }

    @p0
    static s<Drawable> d(@p0 Drawable drawable) {
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return Math.max(1, this.f41649b.getIntrinsicWidth() * this.f41649b.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<Drawable> b() {
        return this.f41649b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
