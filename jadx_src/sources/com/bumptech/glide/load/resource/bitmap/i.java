package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;

/* JADX INFO: compiled from: BitmapTransitionOptions.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends com.bumptech.glide.k<i, Bitmap> {
    @n0
    public static i m(@n0 com.bumptech.glide.request.transition.g<Bitmap> gVar) {
        return new i().f(gVar);
    }

    @n0
    public static i n() {
        return new i().h();
    }

    @n0
    public static i o(int i10) {
        return new i().i(i10);
    }

    @n0
    public static i p(@n0 com.bumptech.glide.request.transition.c.a aVar) {
        return new i().j(aVar);
    }

    @n0
    public static i q(@n0 com.bumptech.glide.request.transition.c cVar) {
        return new i().k(cVar);
    }

    @n0
    public static i r(@n0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return new i().l(gVar);
    }

    @Override // com.bumptech.glide.k
    public boolean equals(Object obj) {
        return (obj instanceof i) && super.equals(obj);
    }

    @n0
    public i h() {
        return j(new com.bumptech.glide.request.transition.c.a());
    }

    @Override // com.bumptech.glide.k
    public int hashCode() {
        return super.hashCode();
    }

    @n0
    public i i(int i10) {
        return j(new com.bumptech.glide.request.transition.c.a(i10));
    }

    @n0
    public i j(@n0 com.bumptech.glide.request.transition.c.a aVar) {
        return l(aVar.a());
    }

    @n0
    public i k(@n0 com.bumptech.glide.request.transition.c cVar) {
        return l(cVar);
    }

    @n0
    public i l(@n0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return f(new com.bumptech.glide.request.transition.b(gVar));
    }
}
