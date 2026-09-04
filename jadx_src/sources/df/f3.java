package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityWebActionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110390m;

    private f3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f110378a = relativeLayout;
        this.f110379b = frameLayout;
        this.f110380c = imageView;
        this.f110381d = imageView2;
        this.f110382e = imageView3;
        this.f110383f = imageView4;
        this.f110384g = textView;
        this.f110385h = textView2;
        this.f110386i = view;
        this.f110387j = linearLayout;
        this.f110388k = frameLayout2;
        this.f110389l = frameLayout3;
        this.f110390m = relativeLayout2;
    }

    @androidx.annotation.n0
    public static f3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16676, new Class[]{View.class}, f3.class);
        if (patchProxyResultProxy.isSupported) {
            return (f3) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.iv_game_web_exit;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_web_exit);
            if (imageView != null) {
                i10 = R.id.iv_game_web_option;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_web_option);
                if (imageView2 != null) {
                    i10 = R.id.iv_web_view_action_button;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_web_view_action_button);
                    if (imageView3 != null) {
                        i10 = R.id.iv_web_view_nav_button;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_web_view_nav_button);
                        if (imageView4 != null) {
                            i10 = R.id.tv_web_view_action;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_web_view_action);
                            if (textView != null) {
                                i10 = R.id.tv_web_view_title;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_web_view_title);
                                if (textView2 != null) {
                                    i10 = R.id.v_game_web_line;
                                    View viewA = l3.d.a(view, R.id.v_game_web_line);
                                    if (viewA != null) {
                                        i10 = R.id.vg_game_web_button;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_game_web_button);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_game_web_exit;
                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_game_web_exit);
                                            if (frameLayout2 != null) {
                                                i10 = R.id.vg_game_web_option;
                                                FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_game_web_option);
                                                if (frameLayout3 != null) {
                                                    i10 = R.id.web_view_title_bar;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.web_view_title_bar);
                                                    if (relativeLayout != null) {
                                                        return new f3((RelativeLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, viewA, linearLayout, frameLayout2, frameLayout3, relativeLayout);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16674, new Class[]{LayoutInflater.class}, f3.class);
        return patchProxyResultProxy.isSupported ? (f3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16675, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f3.class);
        if (patchProxyResultProxy.isSupported) {
            return (f3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_web_action, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110378a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16677, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
