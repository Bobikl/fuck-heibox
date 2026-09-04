package com.max.mediaselector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.l;
import com.max.hbimage.bean.common.HBLocalThumbModelKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBLocalThumbGlideEngine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements me.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f74745a = new c();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: HBLocalThumbGlideEngine.kt */
    public static final class a extends com.bumptech.glide.request.target.e<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ oe.c<Bitmap> f74746b;

        a(oe.c<Bitmap> cVar) {
            this.f74746b = cVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@dl.e Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.p
        public void onLoadFailed(@dl.e Drawable drawable) {
            oe.c<Bitmap> cVar;
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.l.W9, new Class[]{Drawable.class}, Void.TYPE).isSupported || (cVar = this.f74746b) == null) {
                return;
            }
            cVar.a(null);
        }

        public void onResourceReady(@dl.d Bitmap resource, @dl.e com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, bb.c.l.V9, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            oe.c<Bitmap> cVar = this.f74746b;
            if (cVar != null) {
                cVar.a(resource);
            }
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.l.X9, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    private c() {
    }

    @Override // me.d
    public void a(@dl.e Context context) {
    }

    @Override // me.d
    public void b(@dl.d Context context, @dl.d String url, int i10, int i11, @dl.e oe.c<Bitmap> cVar) {
        Object[] objArr = {context, url, new Integer(i10), new Integer(i11), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.S9, new Class[]{Context.class, String.class, cls, cls, oe.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        if (com.max.mediaselector.lib.utils.a.a(context)) {
            Glide.F(context).l().B0(i10, i11).load(url).z1(new a(cVar));
        }
    }

    @Override // me.d
    public void c(@dl.d Context context, @dl.d String url, @dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{context, url, imageView}, this, changeQuickRedirect, false, bb.c.l.R9, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        f0.p(imageView, "imageView");
        if (com.max.mediaselector.lib.utils.a.a(context)) {
            Glide.F(context).load(url).C1(imageView);
        }
    }

    @Override // me.d
    public void d(@dl.e Context context) {
    }

    @Override // me.d
    public void e(@dl.d Context context, @dl.d String url, @dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{context, url, imageView}, this, changeQuickRedirect, false, bb.c.l.T9, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        f0.p(imageView, "imageView");
        if (com.max.mediaselector.lib.utils.a.a(context)) {
            if (Build.VERSION.SDK_INT >= 29) {
                Glide.F(context).l().d(HBLocalThumbModelKt.toHBLocalThumbModel(url)).Y0(new l(), new b0(8)).E0(R.drawable.ps_image_placeholder).C1(imageView);
            } else {
                Glide.F(context).l().load(url).Y0(new l(), new b0(8)).E0(R.drawable.ps_image_placeholder).C1(imageView);
            }
        }
    }

    @Override // me.d
    public void f(@dl.d Context context, @dl.d String url, @dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{context, url, imageView}, this, changeQuickRedirect, false, bb.c.l.U9, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        f0.p(imageView, "imageView");
        if (com.max.mediaselector.lib.utils.a.a(context)) {
            if (Build.VERSION.SDK_INT >= 29) {
                Glide.F(context).d(HBLocalThumbModelKt.toHBLocalThumbModel(url)).k().E0(R.drawable.ps_image_placeholder).C1(imageView);
            } else {
                Glide.F(context).load(url).k().E0(R.drawable.ps_image_placeholder).C1(imageView);
            }
        }
    }
}
