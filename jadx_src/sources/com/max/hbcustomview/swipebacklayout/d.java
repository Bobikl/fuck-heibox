package com.max.hbcustomview.swipebacklayout;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SwipeBackActivityHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f69588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActivitySwipeBackLayout f69589b;

    public d(Activity activity) {
        this.f69588a = activity;
    }

    public View a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Xs, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ActivitySwipeBackLayout activitySwipeBackLayout = this.f69589b;
        if (activitySwipeBackLayout != null) {
            return activitySwipeBackLayout.findViewById(i10);
        }
        return null;
    }

    public void b() {
        ActivitySwipeBackLayout activitySwipeBackLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ws, new Class[0], Void.TYPE).isSupported || (activitySwipeBackLayout = this.f69589b) == null) {
            return;
        }
        activitySwipeBackLayout.I();
    }

    public ActivitySwipeBackLayout c() {
        return this.f69589b;
    }

    public void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Us, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69588a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f69588a.getWindow().getDecorView().setBackgroundDrawable(null);
        ActivitySwipeBackLayout activitySwipeBackLayout = (ActivitySwipeBackLayout) LayoutInflater.from(this.f69588a).inflate(R.layout.hbcustomview_layout_swipeback, (ViewGroup) null);
        this.f69589b = activitySwipeBackLayout;
        activitySwipeBackLayout.f69522f = z10;
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Vs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69589b.w(this.f69588a);
        this.f69589b.y();
    }
}
