package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: DrawableThumbnailImageViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends q<Drawable> {
    public h(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public h(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Drawable o(Drawable drawable) {
        return drawable;
    }
}
