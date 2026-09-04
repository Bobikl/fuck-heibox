package com.max.xiaoheihe.module.story;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: StoryUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryUtils.kt\ncom/max/xiaoheihe/module/story/StoryUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,55:1\n13579#2,2:56\n13579#2,2:58\n*S KotlinDebug\n*F\n+ 1 StoryUtils.kt\ncom/max/xiaoheihe/module/story/StoryUtilsKt\n*L\n12#1:56,2\n18#1:58,2\n*E\n"})
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: StoryUtils.kt */
    public static final class a implements TextureView.SurfaceTextureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        @SuppressLint({"Recycle"})
        public void onSurfaceTextureAvailable(@dl.d SurfaceTexture surface, int i10, int i11) {
            Object[] objArr = {surface, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43529, new Class[]{SurfaceTexture.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(surface, "surface");
            Surface surface2 = new Surface(surface);
            if (Build.VERSION.SDK_INT >= 31) {
                surface2.setFrameRate(60.0f, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@dl.d SurfaceTexture surface) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{surface}, this, changeQuickRedirect, false, 43531, new Class[]{SurfaceTexture.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(surface, "surface");
            surface.release();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@dl.d SurfaceTexture surface, int i10, int i11) {
            Object[] objArr = {surface, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43530, new Class[]{SurfaceTexture.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(surface, "surface");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@dl.d SurfaceTexture surface) {
            if (PatchProxy.proxy(new Object[]{surface}, this, changeQuickRedirect, false, 43532, new Class[]{SurfaceTexture.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(surface, "surface");
        }
    }

    public static final void a(@dl.d View... views) {
        if (PatchProxy.proxy(new Object[]{views}, null, changeQuickRedirect, true, 43527, new Class[]{View[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(views, "views");
        for (View view : views) {
            view.setVisibility(8);
        }
    }

    public static final void b(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 43528, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        new TextureView(context).setSurfaceTextureListener(new a());
    }

    public static final void c(@dl.d View... views) {
        if (PatchProxy.proxy(new Object[]{views}, null, changeQuickRedirect, true, 43526, new Class[]{View[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(views, "views");
        for (View view : views) {
            view.setVisibility(0);
        }
    }
}
