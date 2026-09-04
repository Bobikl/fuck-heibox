package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ThumbnailImageViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public q(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    @Override // com.bumptech.glide.request.target.j
    protected void m(@p0 T t10) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f41931c).getLayoutParams();
        Drawable drawableO = o(t10);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableO = new i(drawableO, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f41931c).setImageDrawable(drawableO);
    }

    protected abstract Drawable o(T t10);
}
