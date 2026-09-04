package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.EdgeTransparentView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameOverviewBaseBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LottieAnimationView f111333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f111334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f111335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final EdgeTransparentView f111337i;

    private h9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LottieAnimationView lottieAnimationView, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 EdgeTransparentView edgeTransparentView) {
        this.f111329a = relativeLayout;
        this.f111330b = imageView;
        this.f111331c = imageView2;
        this.f111332d = linearLayout;
        this.f111333e = lottieAnimationView;
        this.f111334f = circularProgressIndicator;
        this.f111335g = titleBar;
        this.f111336h = relativeLayout2;
        this.f111337i = edgeTransparentView;
    }

    @androidx.annotation.n0
    public static h9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17308, new Class[]{View.class}, h9.class);
        if (patchProxyResultProxy.isSupported) {
            return (h9) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.iv_header;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_header);
            if (imageView2 != null) {
                i10 = R.id.ll_title;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_title);
                if (linearLayout != null) {
                    i10 = R.id.lottie_bg;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) l3.d.a(view, R.id.lottie_bg);
                    if (lottieAnimationView != null) {
                        i10 = R.id.v_loading;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.v_loading);
                        if (circularProgressIndicator != null) {
                            i10 = R.id.v_title_bar;
                            TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.v_title_bar);
                            if (titleBar != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i10 = R.id.vg_content_container;
                                EdgeTransparentView edgeTransparentView = (EdgeTransparentView) l3.d.a(view, R.id.vg_content_container);
                                if (edgeTransparentView != null) {
                                    return new h9(relativeLayout, imageView, imageView2, linearLayout, lottieAnimationView, circularProgressIndicator, titleBar, relativeLayout, edgeTransparentView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17306, new Class[]{LayoutInflater.class}, h9.class);
        return patchProxyResultProxy.isSupported ? (h9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17307, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h9.class);
        if (patchProxyResultProxy.isSupported) {
            return (h9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_overview_base, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111329a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17309, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
