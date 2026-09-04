package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ImageViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j<Z> extends r<ImageView, Z> implements com.bumptech.glide.request.transition.f.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private Animatable f41916k;

    public j(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public j(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    private void l(@p0 Z z10) {
        if (!(z10 instanceof Animatable)) {
            this.f41916k = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f41916k = animatable;
        animatable.start();
    }

    private void n(@p0 Z z10) {
        m(z10);
        l(z10);
    }

    @Override // com.bumptech.glide.request.transition.f.a
    @p0
    public Drawable a() {
        return ((ImageView) this.f41931c).getDrawable();
    }

    @Override // com.bumptech.glide.request.transition.f.a
    public void b(Drawable drawable) {
        ((ImageView) this.f41931c).setImageDrawable(drawable);
    }

    protected abstract void m(@p0 Z z10);

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void onLoadCleared(@p0 Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f41916k;
        if (animatable != null) {
            animatable.stop();
        }
        n(null);
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void onLoadFailed(@p0 Drawable drawable) {
        super.onLoadFailed(drawable);
        n(null);
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void onLoadStarted(@p0 Drawable drawable) {
        super.onLoadStarted(drawable);
        n(null);
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.p
    public void onResourceReady(@n0 Z z10, @p0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        if (fVar == null || !fVar.a(z10, this)) {
            n(z10);
        } else {
            l(z10);
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.k
    public void onStart() {
        Animatable animatable = this.f41916k;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.k
    public void onStop() {
        Animatable animatable = this.f41916k;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
