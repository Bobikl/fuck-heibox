package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import com.bumptech.glide.k;

/* JADX INFO: compiled from: DrawableTransitionOptions.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends k<e, Drawable> {
    @n0
    public static e l(@n0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return new e().f(gVar);
    }

    @n0
    public static e m() {
        return new e().h();
    }

    @n0
    public static e n(int i10) {
        return new e().i(i10);
    }

    @n0
    public static e o(@n0 com.bumptech.glide.request.transition.c.a aVar) {
        return new e().j(aVar);
    }

    @n0
    public static e p(@n0 com.bumptech.glide.request.transition.c cVar) {
        return new e().k(cVar);
    }

    @Override // com.bumptech.glide.k
    public boolean equals(Object obj) {
        return (obj instanceof e) && super.equals(obj);
    }

    @n0
    public e h() {
        return j(new com.bumptech.glide.request.transition.c.a());
    }

    @Override // com.bumptech.glide.k
    public int hashCode() {
        return super.hashCode();
    }

    @n0
    public e i(int i10) {
        return j(new com.bumptech.glide.request.transition.c.a(i10));
    }

    @n0
    public e j(@n0 com.bumptech.glide.request.transition.c.a aVar) {
        return k(aVar.a());
    }

    @n0
    public e k(@n0 com.bumptech.glide.request.transition.c cVar) {
        return f(cVar);
    }
}
