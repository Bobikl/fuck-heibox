package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: BitmapThumbnailImageViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public d(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Drawable o(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f41931c).getResources(), bitmap);
    }
}
