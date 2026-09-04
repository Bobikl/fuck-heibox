package com.max.hbimage.preview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.g;
import com.bumptech.glide.request.target.p;
import com.max.hbimage.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.previewlibrary.wight.SmoothImageView;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBPreviewImageLoader.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements fg.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: HBPreviewImageLoader.kt */
    public static final class a implements g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f70513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fg.b f70514c;

        a(ImageView imageView, fg.b bVar) {
            this.f70513b = imageView;
            this.f70514c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ImageView imageView) {
            if (!PatchProxy.proxy(new Object[]{imageView}, null, changeQuickRedirect, true, bb.c.g.Fe, new Class[]{ImageView.class}, Void.TYPE).isSupported && (imageView instanceof SmoothImageView)) {
                ((SmoothImageView) imageView).s();
            }
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@e GlideException glideException, @e Object obj, @d p<Drawable> target, boolean z10) {
            Object[] objArr = {glideException, obj, target, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.De, new Class[]{GlideException.class, Object.class, p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(target, "target");
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Ge, new Class[]{Object.class, Object.class, p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d(drawable, obj, pVar, dataSource, z10);
        }

        public boolean d(@d Drawable resource, @d Object model, @e p<Drawable> pVar, @d DataSource dataSource, boolean z10) {
            Object[] objArr = {resource, model, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Ee, new Class[]{Drawable.class, Object.class, p.class, DataSource.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(resource, "resource");
            f0.p(model, "model");
            f0.p(dataSource, "dataSource");
            final ImageView imageView = this.f70513b;
            imageView.post(new Runnable() { // from class: com.max.hbimage.preview.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.e(imageView);
                }
            });
            this.f70514c.a(resource);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.max.hbimage.preview.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HBPreviewImageLoader.kt */
    public static final class C0570b implements g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f70515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fg.b f70516c;

        C0570b(ImageView imageView, fg.b bVar) {
            this.f70515b = imageView;
            this.f70516c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ImageView imageView) {
            if (!PatchProxy.proxy(new Object[]{imageView}, null, changeQuickRedirect, true, bb.c.g.Je, new Class[]{ImageView.class}, Void.TYPE).isSupported && (imageView instanceof SmoothImageView)) {
                ((SmoothImageView) imageView).s();
            }
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@e GlideException glideException, @e Object obj, @d p<Drawable> target, boolean z10) {
            Object[] objArr = {glideException, obj, target, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.He, new Class[]{GlideException.class, Object.class, p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(target, "target");
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Ke, new Class[]{Object.class, Object.class, p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d(drawable, obj, pVar, dataSource, z10);
        }

        public boolean d(@d Drawable resource, @d Object model, @e p<Drawable> pVar, @d DataSource dataSource, boolean z10) {
            Object[] objArr = {resource, model, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Ie, new Class[]{Drawable.class, Object.class, p.class, DataSource.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(resource, "resource");
            f0.p(model, "model");
            f0.p(dataSource, "dataSource");
            final ImageView imageView = this.f70515b;
            imageView.post(new Runnable() { // from class: com.max.hbimage.preview.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C0570b.e(imageView);
                }
            });
            this.f70516c.a(resource);
            return false;
        }
    }

    @Override // fg.a
    public void a(@d Fragment context, @d String path, @e ImageView imageView, @d fg.b simpleTarget) {
        if (PatchProxy.proxy(new Object[]{context, path, imageView, simpleTarget}, this, changeQuickRedirect, false, bb.c.g.Ae, new Class[]{Fragment.class, String.class, ImageView.class, fg.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        f0.p(simpleTarget, "simpleTarget");
        if (imageView != null) {
            Glide.H(context).load(path).E1(new a(imageView, simpleTarget)).C1(imageView);
        } else {
            simpleTarget.onLoadFailed(null);
        }
    }

    @Override // fg.a
    public void b(@d Fragment context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.g.Be, new Class[]{Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
    }

    @Override // fg.a
    public void c(@d Context c10) {
        if (PatchProxy.proxy(new Object[]{c10}, this, changeQuickRedirect, false, bb.c.g.Ce, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(c10, "c");
    }

    @Override // fg.a
    public void d(@d Fragment context, @d String path, @e ImageView imageView, @d fg.b simpleTarget) {
        if (PatchProxy.proxy(new Object[]{context, path, imageView, simpleTarget}, this, changeQuickRedirect, false, bb.c.g.f33236ze, new Class[]{Fragment.class, String.class, ImageView.class, fg.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(path, "path");
        f0.p(simpleTarget, "simpleTarget");
        if (imageView != null) {
            Glide.H(context).load(path).F0(imageView.getDrawable()).w(R.drawable.common_default_placeholder_375x210).E1(new C0570b(imageView, simpleTarget)).C1(imageView);
        } else {
            simpleTarget.onLoadFailed(null);
        }
    }
}
