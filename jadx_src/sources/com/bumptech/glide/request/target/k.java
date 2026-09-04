package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ImageViewTargetFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class k {
    @n0
    public <Z> r<ImageView, Z> a(@n0 ImageView imageView, @n0 Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new c(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new g(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
