package com.max.mediaselector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GlideEngine.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements me.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f74734a;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GlideEngine.java */
    public class a extends com.bumptech.glide.request.target.e<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ oe.c f74735b;

        a(oe.c cVar) {
            this.f74735b = cVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
            oe.c cVar;
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.l.P9, new Class[]{Drawable.class}, Void.TYPE).isSupported || (cVar = this.f74735b) == null) {
                return;
            }
            cVar.a(null);
        }

        public void onResourceReady(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            oe.c cVar;
            if (PatchProxy.proxy(new Object[]{bitmap, fVar}, this, changeQuickRedirect, false, bb.c.l.O9, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported || (cVar = this.f74735b) == null) {
                return;
            }
            cVar.a(bitmap);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.l.Q9, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    private b() {
    }

    public static b g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.N9, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (f74734a == null) {
            synchronized (b.class) {
                if (f74734a == null) {
                    f74734a = new b();
                }
            }
        }
        return f74734a;
    }

    @Override // me.d
    public void a(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.L9, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Glide.F(context).K();
    }

    @Override // me.d
    public void b(@n0 Context context, @n0 String str, int i10, int i11, oe.c<Bitmap> cVar) {
        Object[] objArr = {context, str, new Integer(i10), new Integer(i11), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.I9, new Class[]{Context.class, String.class, cls, cls, oe.c.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.a.a(context)) {
            Glide.F(context).l().B0(i10, i11).load(str).z1(new a(cVar));
        }
    }

    @Override // me.d
    public void c(@n0 Context context, @n0 String str, @n0 ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{context, str, imageView}, this, changeQuickRedirect, false, bb.c.l.H9, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.a.a(context)) {
            Glide.F(context).load(str).C1(imageView);
        }
    }

    @Override // me.d
    public void d(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.M9, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Glide.F(context).M();
    }

    @Override // me.d
    public void e(@n0 Context context, @n0 String str, @n0 ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{context, str, imageView}, this, changeQuickRedirect, false, bb.c.l.J9, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.a.a(context)) {
            Glide.F(context).l().load(str).B0(180, 180).P0(0.5f).Y0(new l(), new b0(8)).E0(R.drawable.ps_image_placeholder).C1(imageView);
        }
    }

    @Override // me.d
    public void f(@n0 Context context, @n0 String str, @n0 ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{context, str, imageView}, this, changeQuickRedirect, false, bb.c.l.K9, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.a.a(context)) {
            Glide.F(context).load(str).B0(200, 200).k().E0(R.drawable.ps_image_placeholder).C1(imageView);
        }
    }
}
