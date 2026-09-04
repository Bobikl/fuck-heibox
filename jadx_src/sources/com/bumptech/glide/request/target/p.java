package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: Target.java */
/* JADX INFO: loaded from: classes6.dex */
public interface p<R> extends com.bumptech.glide.manager.k {
    public static final int B0 = Integer.MIN_VALUE;

    @p0
    com.bumptech.glide.request.e getRequest();

    void getSize(@n0 o oVar);

    void onLoadCleared(@p0 Drawable drawable);

    void onLoadFailed(@p0 Drawable drawable);

    void onLoadStarted(@p0 Drawable drawable);

    void onResourceReady(@n0 R r10, @p0 com.bumptech.glide.request.transition.f<? super R> fVar);

    void removeCallback(@n0 o oVar);

    void setRequest(@p0 com.bumptech.glide.request.e eVar);
}
