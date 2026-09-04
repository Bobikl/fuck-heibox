package com.max.hbcustomview.floatingview;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.v;
import androidx.core.view.j1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FloatingView.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f69112c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnFloatingView f69113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f69114b;

    /* JADX INFO: renamed from: com.max.hbcustomview.floatingview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FloatingView.java */
    public class RunnableC0559a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        RunnableC0559a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Sj, new Class[0], Void.TYPE).isSupported || a.this.f69113a == null) {
                return;
            }
            if (j1.O0(a.this.f69113a) && a.this.f69114b != null) {
                a.this.f69114b.removeView(a.this.f69113a);
            }
            a.this.f69113a = null;
        }
    }

    private a() {
    }

    private void l(EnFloatingView enFloatingView) {
        FrameLayout frameLayout;
        if (PatchProxy.proxy(new Object[]{enFloatingView}, this, changeQuickRedirect, false, bb.c.f.Pj, new Class[]{EnFloatingView.class}, Void.TYPE).isSupported || (frameLayout = this.f69114b) == null) {
            return;
        }
        frameLayout.addView(enFloatingView);
    }

    private void m(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.Gj, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        synchronized (this) {
            if (this.f69113a != null) {
                return;
            }
            EnFloatingView enFloatingView = new EnFloatingView(context);
            this.f69113a = enFloatingView;
            enFloatingView.setLayoutParams(p());
            l(this.f69113a);
        }
    }

    public static a n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.Ej, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f69112c == null) {
            synchronized (a.class) {
                if (f69112c == null) {
                    f69112c = new a();
                }
            }
        }
        return f69112c;
    }

    private FrameLayout o(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.Rj, new Class[]{Activity.class}, FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        if (activity == null) {
            return null;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private FrameLayout.LayoutParams p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Qj, new Class[0], FrameLayout.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout.LayoutParams) patchProxyResultProxy.result;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        layoutParams.setMargins(13, layoutParams.topMargin, layoutParams.rightMargin, 56);
        return layoutParams;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a a(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Mj, new Class[]{Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        EnFloatingView enFloatingView = this.f69113a;
        if (enFloatingView != null) {
            enFloatingView.setIconImage(i10);
        }
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a b(FrameLayout frameLayout) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, bb.c.f.Lj, new Class[]{FrameLayout.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        EnFloatingView enFloatingView = this.f69113a;
        if (enFloatingView != null && frameLayout != null && j1.O0(enFloatingView)) {
            frameLayout.removeView(this.f69113a);
        }
        if (this.f69114b == frameLayout) {
            this.f69114b = null;
        }
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.Hj, new Class[]{Context.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        m(context);
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a d(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.Kj, new Class[]{Activity.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        b(o(activity));
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a e(ViewGroup.LayoutParams layoutParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, bb.c.f.Nj, new Class[]{ViewGroup.LayoutParams.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        EnFloatingView enFloatingView = this.f69113a;
        if (enFloatingView != null) {
            enFloatingView.setLayoutParams(layoutParams);
        }
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a f(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.Ij, new Class[]{Activity.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        g(o(activity));
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a g(FrameLayout frameLayout) {
        EnFloatingView enFloatingView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, bb.c.f.Jj, new Class[]{FrameLayout.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (frameLayout == null || (enFloatingView = this.f69113a) == null) {
            this.f69114b = frameLayout;
            return this;
        }
        if (enFloatingView.getParent() == frameLayout) {
            return this;
        }
        if (this.f69114b != null) {
            ViewParent parent = this.f69113a.getParent();
            FrameLayout frameLayout2 = this.f69114b;
            if (parent == frameLayout2) {
                frameLayout2.removeView(this.f69113a);
            }
        }
        this.f69114b = frameLayout;
        frameLayout.addView(this.f69113a);
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public EnFloatingView getView() {
        return this.f69113a;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a h(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.Oj, new Class[]{c.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        EnFloatingView enFloatingView = this.f69113a;
        if (enFloatingView != null) {
            enFloatingView.setMagnetViewListener(cVar);
        }
        return this;
    }

    @Override // com.max.hbcustomview.floatingview.b
    public a remove() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fj, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0559a());
        return this;
    }
}
