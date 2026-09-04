package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.component.WebViewProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentWebviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f109288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f109291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.i1 f109292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final r80 f109293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final WebViewProgressBar f109297m;

    private cc(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ViewStub viewStub, @androidx.annotation.n0 mb.i1 i1Var, @androidx.annotation.n0 r80 r80Var, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 WebViewProgressBar webViewProgressBar) {
        this.f109285a = relativeLayout;
        this.f109286b = frameLayout;
        this.f109287c = smartRefreshLayout;
        this.f109288d = titleBar;
        this.f109289e = imageView;
        this.f109290f = relativeLayout2;
        this.f109291g = viewStub;
        this.f109292h = i1Var;
        this.f109293i = r80Var;
        this.f109294j = linearLayout;
        this.f109295k = relativeLayout3;
        this.f109296l = frameLayout2;
        this.f109297m = webViewProgressBar;
    }

    @androidx.annotation.n0
    public static cc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17600, new Class[]{View.class}, cc.class);
        if (patchProxyResultProxy.isSupported) {
            return (cc) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.tb_web;
                TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.tb_web);
                if (titleBar != null) {
                    i10 = R.id.v_bg;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.v_bg);
                    if (imageView != null) {
                        i10 = R.id.vg_bg;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bg);
                        if (relativeLayout != null) {
                            i10 = R.id.vg_bottom_bar_root;
                            ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.vg_bottom_bar_root);
                            if (viewStub != null) {
                                i10 = R.id.vg_loading;
                                View viewA = l3.d.a(view, R.id.vg_loading);
                                if (viewA != null) {
                                    mb.i1 i1VarA = mb.i1.a(viewA);
                                    i10 = R.id.vg_message;
                                    View viewA2 = l3.d.a(view, R.id.vg_message);
                                    if (viewA2 != null) {
                                        r80 r80VarA = r80.a(viewA2);
                                        i10 = R.id.vg_title_root;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_title_root);
                                        if (linearLayout != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                            i10 = R.id.vg_wrap_webview_container;
                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_wrap_webview_container);
                                            if (frameLayout2 != null) {
                                                i10 = R.id.webView_progress;
                                                WebViewProgressBar webViewProgressBar = (WebViewProgressBar) l3.d.a(view, R.id.webView_progress);
                                                if (webViewProgressBar != null) {
                                                    return new cc(relativeLayout2, frameLayout, smartRefreshLayout, titleBar, imageView, relativeLayout, viewStub, i1VarA, r80VarA, linearLayout, relativeLayout2, frameLayout2, webViewProgressBar);
                                                }
                                            }
                                        }
                                    }
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
    public static cc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17598, new Class[]{LayoutInflater.class}, cc.class);
        return patchProxyResultProxy.isSupported ? (cc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17599, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cc.class);
        if (patchProxyResultProxy.isSupported) {
            return (cc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_webview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109285a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17601, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
