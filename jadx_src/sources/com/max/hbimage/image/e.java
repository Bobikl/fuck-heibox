package com.max.hbimage.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CustomDrawableImageViewTarget.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends com.bumptech.glide.request.target.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private ImageView f70443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d ImageView imageView) {
        super(imageView);
        f0.p(imageView, "imageView");
        this.f70443l = imageView;
    }

    @Override // com.bumptech.glide.request.target.g, com.bumptech.glide.request.target.j
    public /* bridge */ /* synthetic */ void m(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32770c7, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        m(drawable);
    }

    @Override // com.bumptech.glide.request.target.g
    /* JADX INFO: renamed from: o */
    public void m(@dl.e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32730a7, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        super.m(drawable);
    }

    @Override // com.bumptech.glide.request.target.j, com.bumptech.glide.request.target.p
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
        if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.g.f32750b7, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
            return;
        }
        q((Drawable) obj, fVar);
    }

    @dl.d
    public final ImageView p() {
        return this.f70443l;
    }

    public void q(@dl.d Drawable resource, @dl.e com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
        if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, bb.c.g.Y6, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(resource, "resource");
        super.onResourceReady(resource, fVar);
    }

    public final void r(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.g.X6, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f70443l = imageView;
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void setRequest(@dl.e com.bumptech.glide.request.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.g.Z6, new Class[]{com.bumptech.glide.request.e.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setRequest(eVar);
    }
}
