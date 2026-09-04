package com.heybox.imageviewer.utils;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.heybox.imageviewer.ImageViewerDialogFragment;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.core.i;
import com.heybox.imageviewer.core.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageViewerBuilder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Context f59790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final com.heybox.imageviewer.core.b f59791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final com.heybox.imageviewer.core.a f59792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final com.heybox.imageviewer.core.h f59793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private i f59794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private j f59795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private com.heybox.imageviewer.core.c f59796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private ImageViewerDialogFragment.a f59797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private ImageViewerDialogFragment f59798i;

    public c(@dl.e Context context, @dl.d com.heybox.imageviewer.core.b imageLoader, @dl.d com.heybox.imageviewer.core.a dataProvider, @dl.d com.heybox.imageviewer.core.h transformer) {
        f0.p(imageLoader, "imageLoader");
        f0.p(dataProvider, "dataProvider");
        f0.p(transformer, "transformer");
        this.f59790a = context;
        this.f59791b = imageLoader;
        this.f59792c = dataProvider;
        this.f59793d = transformer;
    }

    private final ImageViewerDialogFragment a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.O0, new Class[0], ImageViewerDialogFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageViewerDialogFragment) patchProxyResultProxy.result;
        }
        ImageViewerDialogFragment.a aVar = this.f59797h;
        if (aVar == null) {
            aVar = new ImageViewerDialogFragment.a();
        }
        return aVar.a();
    }

    public final void b() {
        ImageViewerDialogFragment imageViewerDialogFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.P0, new Class[0], Void.TYPE).isSupported || (imageViewerDialogFragment = this.f59798i) == null) {
            return;
        }
        imageViewerDialogFragment.dismiss();
    }

    @dl.d
    public final c c(@dl.e com.heybox.imageviewer.core.c cVar) {
        this.f59796g = cVar;
        return this;
    }

    @dl.d
    public final c d(@dl.d i vhCustomizer) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{vhCustomizer}, this, changeQuickRedirect, false, 194, new Class[]{i.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(vhCustomizer, "vhCustomizer");
        this.f59794e = vhCustomizer;
        return this;
    }

    @dl.d
    public final c e(@dl.d j viewerCallback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewerCallback}, this, changeQuickRedirect, false, 195, new Class[]{j.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(viewerCallback, "viewerCallback");
        this.f59795f = viewerCallback;
        return this;
    }

    @dl.d
    public final c f(@dl.e ImageViewerDialogFragment.a aVar) {
        this.f59797h = aVar;
        return this;
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 198, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Components components = Components.f59730a;
        if (components.b()) {
            return;
        }
        Context context = this.f59790a;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            components.c(this.f59791b, this.f59792c, this.f59793d);
            components.l(this.f59794e);
            components.m(this.f59795f);
            components.k(this.f59796g);
            ImageViewerDialogFragment imageViewerDialogFragmentA = a();
            this.f59798i = imageViewerDialogFragmentA;
            if (imageViewerDialogFragmentA != null) {
                imageViewerDialogFragmentA.O3(fragmentActivity.getSupportFragmentManager());
            }
        }
    }
}
