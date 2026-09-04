package com.max.hbutils.anim;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import kotlin.b2;

/* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final WeakReference<ViewGroup> f73416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final WeakReference<LottieAnimationView> f73417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final WeakReference<FrameLayout> f73418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final yh.a<b2> f73419d;

    public a(@dl.e ViewGroup viewGroup, @dl.e LottieAnimationView lottieAnimationView, @dl.e FrameLayout frameLayout, @dl.e yh.a<b2> aVar) {
        this.f73416a = new WeakReference<>(viewGroup);
        this.f73417b = new WeakReference<>(lottieAnimationView);
        this.f73418c = new WeakReference<>(frameLayout);
        this.f73419d = aVar;
    }

    public final void a() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Cm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.d("OneshotLottieAnimHelper", "[cancelAnimation]\nrootView: " + this.f73416a.get() + "\nlottieView: " + this.f73417b.get() + "\nonAnimCancelListenerRef: " + this.f73419d);
        yh.a<b2> aVar = this.f73419d;
        if (aVar != null) {
            aVar.invoke();
        }
        ViewGroup viewGroup = this.f73416a.get();
        LottieAnimationView lottieAnimationView = this.f73417b.get();
        FrameLayout frameLayout = this.f73418c.get();
        if (lottieAnimationView != null && lottieAnimationView.A()) {
            z10 = true;
        }
        if (z10) {
            lottieAnimationView.p();
        }
        if (frameLayout == null) {
            com.max.heybox.hblog.g.f74531b.v("[OneshotLottieAnimHelper][cancelAnimation] no containerView found");
        } else if (viewGroup == null) {
            frameLayout.removeView(lottieAnimationView);
        } else {
            frameLayout.removeView(lottieAnimationView);
            viewGroup.removeView(frameLayout);
        }
    }

    public final boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Dm, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        LottieAnimationView lottieAnimationView = this.f73417b.get();
        return lottieAnimationView != null && lottieAnimationView.A();
    }
}
