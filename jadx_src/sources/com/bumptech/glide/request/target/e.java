package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: CustomTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e<T> implements p<T> {
    private final int height;

    @p0
    private com.bumptech.glide.request.e request;
    private final int width;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public e(int i10, int i11) {
        if (com.bumptech.glide.util.o.x(i10, i11)) {
            this.width = i10;
            this.height = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public final com.bumptech.glide.request.e getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void getSize(@n0 o oVar) {
        oVar.d(this.width, this.height);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
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
    public final void removeCallback(@n0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void setRequest(@p0 com.bumptech.glide.request.e eVar) {
        this.request = eVar;
    }
}
