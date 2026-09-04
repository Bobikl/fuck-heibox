package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: compiled from: BaseTarget.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class b<Z> implements p<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.request.e f41891b;

    @Override // com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.e getRequest() {
        return this.f41891b;
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadCleared(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadFailed(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadStarted(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void setRequest(@p0 com.bumptech.glide.request.e eVar) {
        this.f41891b = eVar;
    }
}
