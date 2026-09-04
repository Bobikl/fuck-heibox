package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public class GlideLoaderException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f43400b;

    public GlideLoaderException(Drawable drawable) {
        this.f43400b = drawable;
    }

    public Drawable a() {
        return this.f43400b;
    }
}
