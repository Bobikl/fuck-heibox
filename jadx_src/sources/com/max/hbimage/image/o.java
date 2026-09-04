package com.max.hbimage.image;

import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

/* JADX INFO: compiled from: PrefetchTarget.java */
/* JADX INFO: loaded from: classes10.dex */
public class o implements com.bumptech.glide.request.target.p<File> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int height;
    private com.bumptech.glide.request.e request;
    private final String url;
    private final int width;

    private o(int i10, int i11, String str) {
        this.width = i10;
        this.height = i11;
        this.url = str;
    }

    public o(String str) {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE, str);
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.e getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void getSize(@n0 com.bumptech.glide.request.target.o oVar) {
        if (PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, bb.c.g.Nd, new Class[]{com.bumptech.glide.request.target.o.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.bumptech.glide.util.o.x(this.width, this.height)) {
            oVar.d(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
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

    /* JADX WARN: Can't rename method to resolve collision */
    public void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
        if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, bb.c.g.Md, new Class[]{File.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.f70376a.put(this.url, file);
    }

    @Override // com.bumptech.glide.request.target.p
    public /* bridge */ /* synthetic */ void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
        if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, bb.c.g.Od, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
            return;
        }
        onResourceReady(file, fVar);
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void removeCallback(@n0 com.bumptech.glide.request.target.o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void setRequest(@p0 com.bumptech.glide.request.e eVar) {
        this.request = eVar;
    }
}
