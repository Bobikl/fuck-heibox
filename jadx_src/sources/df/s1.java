package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.widget.OverlayTouchDownDetectView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityPostTabBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final OverlayTouchDownDetectView f115377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f115378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f115379e;

    private s1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 OverlayTouchDownDetectView overlayTouchDownDetectView, @androidx.annotation.n0 ViewStub viewStub, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f115375a = relativeLayout;
        this.f115376b = frameLayout;
        this.f115377c = overlayTouchDownDetectView;
        this.f115378d = viewStub;
        this.f115379e = viewPager2;
    }

    @androidx.annotation.n0
    public static s1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16520, new Class[]{View.class}, s1.class);
        if (patchProxyResultProxy.isSupported) {
            return (s1) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_bottom_post_tools_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_bottom_post_tools_container);
        if (frameLayout != null) {
            i10 = R.id.overlay_touch_detect_view;
            OverlayTouchDownDetectView overlayTouchDownDetectView = (OverlayTouchDownDetectView) l3.d.a(view, R.id.overlay_touch_detect_view);
            if (overlayTouchDownDetectView != null) {
                i10 = R.id.view_stub_post_tools_v2;
                ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.view_stub_post_tools_v2);
                if (viewStub != null) {
                    i10 = R.id.vp;
                    ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp);
                    if (viewPager2 != null) {
                        return new s1((RelativeLayout) view, frameLayout, overlayTouchDownDetectView, viewStub, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16518, new Class[]{LayoutInflater.class}, s1.class);
        return patchProxyResultProxy.isSupported ? (s1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16519, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s1.class);
        if (patchProxyResultProxy.isSupported) {
            return (s1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_post_tab, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115375a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16521, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
