package com.max.hbutils.utils;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FullScreenShotManager.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Context f73530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Activity f73531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private FrameLayout f73532c;

    public b(@dl.e Context context) {
        this.f73530a = context;
        Activity activityA = context instanceof Activity ? (Activity) context : null;
        if (activityA == null) {
            activityA = e.b().a();
            f0.o(activityA, "getCurrentActivity(...)");
        }
        this.f73531b = activityA;
        this.f73532c = new FrameLayout(activityA);
    }

    @dl.d
    public final Activity a() {
        return this.f73531b;
    }

    @dl.e
    public final Context b() {
        return this.f73530a;
    }

    @dl.e
    public final FrameLayout c() {
        return this.f73532c;
    }

    public final void d() {
        Activity activityA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Fo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f73530a;
        if (context instanceof Activity) {
            activityA = (Activity) context;
        } else {
            activityA = e.b().a();
            f0.m(activityA);
        }
        if (this.f73532c == null) {
            return;
        }
        activityA.getWindowManager().removeView(this.f73532c);
        this.f73532c = null;
    }

    public final void e(@dl.e FrameLayout frameLayout) {
        this.f73532c = frameLayout;
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Eo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FrameLayout frameLayout = this.f73532c;
        if (frameLayout != null) {
            ImageView imageView = new ImageView(this.f73531b);
            imageView.setImageBitmap(ViewUtils.U(this.f73531b.getWindow().getDecorView()));
            frameLayout.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 134219544, -2);
        layoutParams.width = -1;
        layoutParams.height = ViewUtils.u(this.f73530a);
        layoutParams.gravity = 51;
        layoutParams.y = 0;
        layoutParams.x = 0;
        this.f73531b.getWindowManager().addView(this.f73532c, layoutParams);
    }
}
