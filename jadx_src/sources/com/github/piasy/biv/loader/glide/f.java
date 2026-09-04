package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import java.io.File;

/* JADX INFO: compiled from: ImageDownloadTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements p<File>, e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.request.e f43446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f43449e;

    private f(int i10, int i11, String str) {
        this.f43447c = i10;
        this.f43448d = i11;
        this.f43449e = str;
    }

    protected f(String str) {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE, str);
    }

    @Override // com.bumptech.glide.request.target.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onResourceReady(@n0 File file, com.bumptech.glide.request.transition.f<? super File> fVar) {
        e.c(this.f43449e);
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.e getRequest() {
        return this.f43446b;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void getSize(@n0 o oVar) {
        if (com.bumptech.glide.util.o.x(this.f43447c, this.f43448d)) {
            oVar.d(this.f43447c, this.f43448d);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f43447c + " and height: " + this.f43448d + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadCleared(Drawable drawable) {
        e.c(this.f43449e);
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadFailed(Drawable drawable) {
        e.c(this.f43449e);
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadStarted(Drawable drawable) {
        e.b(this.f43449e, this);
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
        this.f43446b = eVar;
    }
}
