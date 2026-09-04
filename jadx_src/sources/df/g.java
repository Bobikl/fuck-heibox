package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbcommon.component.CollapsibleView;
import com.max.hbcustomview.SlideViewPager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityBasePostPageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsibleView f110733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomEditorBar f110734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlideViewPager f110736e;

    private g(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 CollapsibleView collapsibleView, @androidx.annotation.n0 BottomEditorBar bottomEditorBar, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 SlideViewPager slideViewPager) {
        this.f110732a = frameLayout;
        this.f110733b = collapsibleView;
        this.f110734c = bottomEditorBar;
        this.f110735d = frameLayout2;
        this.f110736e = slideViewPager;
    }

    @androidx.annotation.n0
    public static g a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16264, new Class[]{View.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_container_float;
        CollapsibleView collapsibleView = (CollapsibleView) l3.d.a(view, R.id.cv_container_float);
        if (collapsibleView != null) {
            i10 = R.id.vg_bottom_bar_root;
            BottomEditorBar bottomEditorBar = (BottomEditorBar) l3.d.a(view, R.id.vg_bottom_bar_root);
            if (bottomEditorBar != null) {
                i10 = R.id.vg_web_fullscreen;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_web_fullscreen);
                if (frameLayout != null) {
                    i10 = R.id.vp;
                    SlideViewPager slideViewPager = (SlideViewPager) l3.d.a(view, R.id.vp);
                    if (slideViewPager != null) {
                        return new g((FrameLayout) view, collapsibleView, bottomEditorBar, frameLayout, slideViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16262, new Class[]{LayoutInflater.class}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16263, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_base_post_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110732a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16265, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
