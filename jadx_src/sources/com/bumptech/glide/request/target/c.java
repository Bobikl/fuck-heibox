package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: BitmapImageViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public c(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(Bitmap bitmap) {
        ((ImageView) this.f41931c).setImageBitmap(bitmap);
    }
}
