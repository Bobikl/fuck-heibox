package com.max.hbimage.image;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;

/* JADX INFO: compiled from: CustomGlideImageViewFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends com.github.piasy.biv.view.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.github.piasy.biv.view.d
    public View a(Context context, int i10, int i11) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32790d7, new Class[]{Context.class, cls, cls}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (i10 != 1 && i10 != 2) {
            return super.a(context, i10, i11);
        }
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    @Override // com.github.piasy.biv.view.d
    public View d(Context context, ImageView.ScaleType scaleType, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, scaleType, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32830f7, new Class[]{Context.class, ImageView.ScaleType.class, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(context);
        if (scaleType != null) {
            imageView.setScaleType(scaleType);
        }
        return imageView;
    }

    @Override // com.github.piasy.biv.view.d
    public final void f(View view, int i10, File file) {
        com.bumptech.glide.j jVarD;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), file}, this, changeQuickRedirect, false, bb.c.g.f32810e7, new Class[]{View.class, Integer.TYPE, File.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 1 && i10 != 2) {
            super.f(view, i10, file);
            return;
        }
        if (view instanceof ImageView) {
            Context context = view.getContext();
            com.bumptech.glide.j jVarF = null;
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                    jVarD = Glide.I(fragmentActivity);
                    jVarF = jVarD;
                }
            } else if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    jVarD = Glide.D(activity);
                    jVarF = jVarD;
                }
            } else if (context != null) {
                jVarF = Glide.F(context);
            }
            ImageView imageView = (ImageView) view;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (jVarF != null) {
                jVarF.b(file).i(new com.bumptech.glide.request.h().B0(Integer.MIN_VALUE, Integer.MIN_VALUE)).C1(imageView);
            }
        }
    }

    @Override // com.github.piasy.biv.view.d
    public void h(View view, Uri uri) {
        if (!PatchProxy.proxy(new Object[]{view, uri}, this, changeQuickRedirect, false, bb.c.g.f32850g7, new Class[]{View.class, Uri.class}, Void.TYPE).isSupported && (view instanceof ImageView)) {
            Glide.F(view.getContext()).e(uri).C1((ImageView) view);
        }
    }
}
