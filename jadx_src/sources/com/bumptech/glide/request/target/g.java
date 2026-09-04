package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.p0;

/* JADX INFO: compiled from: DrawableImageViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public g(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@p0 Drawable drawable) {
        ((ImageView) this.f41931c).setImageDrawable(drawable);
    }
}
