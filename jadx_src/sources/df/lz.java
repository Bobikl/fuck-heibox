package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.RippleView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTitleBarHomeMaterialBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RippleView f113178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f113179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113184o;

    private lz(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 RippleView rippleView, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f113170a = relativeLayout;
        this.f113171b = qMUIRadiusImageView;
        this.f113172c = imageView;
        this.f113173d = imageView2;
        this.f113174e = imageView3;
        this.f113175f = imageView4;
        this.f113176g = imageView5;
        this.f113177h = imageView6;
        this.f113178i = rippleView;
        this.f113179j = tabLayout;
        this.f113180k = textView;
        this.f113181l = textView2;
        this.f113182m = frameLayout;
        this.f113183n = linearLayout;
        this.f113184o = relativeLayout2;
    }

    @androidx.annotation.n0
    public static lz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, f7.a.d.f118806q, new Class[]{View.class}, lz.class);
        if (patchProxyResultProxy.isSupported) {
            return (lz) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_activity;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_activity);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_home_mobile;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_home_mobile);
            if (imageView != null) {
                i10 = R.id.iv_home_msg;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_home_msg);
                if (imageView2 != null) {
                    i10 = R.id.iv_home_scan;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_home_scan);
                    if (imageView3 != null) {
                        i10 = R.id.iv_home_search;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_home_search);
                        if (imageView4 != null) {
                            i10 = R.id.iv_point_home_mobile;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_point_home_mobile);
                            if (imageView5 != null) {
                                i10 = R.id.iv_point_home_msg;
                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_point_home_msg);
                                if (imageView6 != null) {
                                    i10 = R.id.rip_activity;
                                    RippleView rippleView = (RippleView) l3.d.a(view, R.id.rip_activity);
                                    if (rippleView != null) {
                                        i10 = R.id.tl_home;
                                        TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tl_home);
                                        if (tabLayout != null) {
                                            i10 = R.id.tv_internal_tag;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_internal_tag);
                                            if (textView != null) {
                                                i10 = R.id.tv_title;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                                                if (textView2 != null) {
                                                    i10 = R.id.vg_activity_dot;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_activity_dot);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.vg_back;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_back);
                                                        if (linearLayout != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                            return new lz(relativeLayout, qMUIRadiusImageView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, rippleView, tabLayout, textView, textView2, frameLayout, linearLayout, relativeLayout);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static lz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, f7.a.d.f118804o, new Class[]{LayoutInflater.class}, lz.class);
        return patchProxyResultProxy.isSupported ? (lz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, f7.a.d.f118805p, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lz.class);
        if (patchProxyResultProxy.isSupported) {
            return (lz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_title_bar_home_material, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113170a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20017, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
