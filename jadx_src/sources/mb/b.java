package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.max.hbcommon.R;
import com.max.hbcommon.component.TitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityBaseWithGestureBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartSwipeWrapper f131484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f131487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final o f131488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartSwipeWrapper f131490g;

    private b(@androidx.annotation.n0 SmartSwipeWrapper smartSwipeWrapper, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 o oVar, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 SmartSwipeWrapper smartSwipeWrapper2) {
        this.f131484a = smartSwipeWrapper;
        this.f131485b = frameLayout;
        this.f131486c = linearLayout;
        this.f131487d = titleBar;
        this.f131488e = oVar;
        this.f131489f = frameLayout2;
        this.f131490g = smartSwipeWrapper2;
    }

    @androidx.annotation.n0
    public static b a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.D5, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.multi_status_view_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.root;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
            if (linearLayout != null) {
                i10 = R.id.tb_title;
                TitleBar titleBar = (TitleBar) l3.d.a(view, i10);
                if (titleBar != null && (viewA = l3.d.a(view, (i10 = R.id.title_bar_divider))) != null) {
                    o oVarA = o.a(viewA);
                    i10 = R.id.vg_above;
                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                    if (frameLayout2 != null) {
                        SmartSwipeWrapper smartSwipeWrapper = (SmartSwipeWrapper) view;
                        return new b(smartSwipeWrapper, frameLayout, linearLayout, titleBar, oVarA, frameLayout2, smartSwipeWrapper);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static b c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.B5, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.C5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_base_with_gesture, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartSwipeWrapper b() {
        return this.f131484a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.E5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
