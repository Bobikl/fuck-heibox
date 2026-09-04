package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import java.io.File;

/* JADX INFO: compiled from: PrefetchTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements p<File> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.request.e f43452d;

    public g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private g(int i10, int i11) {
        this.f43450b = i10;
        this.f43451c = i11;
    }

    @Override // com.bumptech.glide.request.target.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.e getRequest() {
        return this.f43452d;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void getSize(@n0 o oVar) {
        if (com.bumptech.glide.util.o.x(this.f43450b, this.f43451c)) {
            oVar.d(this.f43450b, this.f43451c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f43450b + " and height: " + this.f43451c + ", either provide dimensions in the constructor or call override()");
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
    public void removeCallback(@n0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void setRequest(@p0 com.bumptech.glide.request.e eVar) {
        this.f43452d = eVar;
    }
}
