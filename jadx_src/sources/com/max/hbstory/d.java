package com.max.hbstory;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryContext.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f72841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Fragment f72842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ViewPager2 f72843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final g f72844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final c f72845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final WeakReference<Context> f72846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final WeakReference<Fragment> f72847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final WeakReference<ViewPager2> f72848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final WeakReference<g> f72849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final WeakReference<c> f72850j;

    public d(@dl.d Context context, @dl.d Fragment playerFragment, @dl.d ViewPager2 storyMainViewPager2, @dl.d g storyViewModel, @dl.d c storyService) {
        f0.p(context, "context");
        f0.p(playerFragment, "playerFragment");
        f0.p(storyMainViewPager2, "storyMainViewPager2");
        f0.p(storyViewModel, "storyViewModel");
        f0.p(storyService, "storyService");
        this.f72841a = context;
        this.f72842b = playerFragment;
        this.f72843c = storyMainViewPager2;
        this.f72844d = storyViewModel;
        this.f72845e = storyService;
        this.f72846f = new WeakReference<>(context);
        this.f72847g = new WeakReference<>(playerFragment);
        this.f72848h = new WeakReference<>(storyMainViewPager2);
        this.f72849i = new WeakReference<>(storyViewModel);
        this.f72850j = new WeakReference<>(storyService);
    }

    @dl.e
    public final Context a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33432ab, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : this.f72846f.get();
    }

    @dl.e
    public final Fragment b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33455bb, new Class[0], Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : this.f72847g.get();
    }

    @dl.e
    public final c c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33525eb, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : this.f72850j.get();
    }

    @dl.e
    public final g d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33502db, new Class[0], g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : this.f72849i.get();
    }

    @dl.e
    public final ViewPager2 e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33478cb, new Class[0], ViewPager2.class);
        return patchProxyResultProxy.isSupported ? (ViewPager2) patchProxyResultProxy.result : this.f72848h.get();
    }
}
