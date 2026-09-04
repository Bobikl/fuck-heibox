package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.component.SearchView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TitleBarDefaultBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final RelativeLayout B;

    @androidx.annotation.n0
    public final FrameLayout C;

    @androidx.annotation.n0
    public final SearchView D;

    @androidx.annotation.n0
    public final ViewStub E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131653y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131654z;

    private m1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 ImageView imageView10, @androidx.annotation.n0 ImageView imageView11, @androidx.annotation.n0 ImageView imageView12, @androidx.annotation.n0 ImageView imageView13, @androidx.annotation.n0 ImageView imageView14, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 SearchView searchView, @androidx.annotation.n0 ViewStub viewStub) {
        this.f131629a = relativeLayout;
        this.f131630b = linearLayout;
        this.f131631c = linearLayout2;
        this.f131632d = imageView;
        this.f131633e = imageView2;
        this.f131634f = imageView3;
        this.f131635g = imageView4;
        this.f131636h = imageView5;
        this.f131637i = imageView6;
        this.f131638j = imageView7;
        this.f131639k = imageView8;
        this.f131640l = imageView9;
        this.f131641m = imageView10;
        this.f131642n = imageView11;
        this.f131643o = imageView12;
        this.f131644p = imageView13;
        this.f131645q = imageView14;
        this.f131646r = linearLayout3;
        this.f131647s = relativeLayout2;
        this.f131648t = textView;
        this.f131649u = textView2;
        this.f131650v = textView3;
        this.f131651w = textView4;
        this.f131652x = textView5;
        this.f131653y = textView6;
        this.f131654z = frameLayout;
        this.A = linearLayout4;
        this.B = relativeLayout3;
        this.C = frameLayout2;
        this.D = searchView;
        this.E = viewStub;
    }

    @androidx.annotation.n0
    public static m1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31991ra, new Class[]{View.class}, m1.class);
        if (patchProxyResultProxy.isSupported) {
            return (m1) patchProxyResultProxy.result;
        }
        int i10 = R.id.button_left;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.button_right;
            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
            if (linearLayout2 != null) {
                i10 = R.id.iv_action_point;
                ImageView imageView = (ImageView) l3.d.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.iv_action_point_x;
                    ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.iv_appbar_action_button;
                        ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                        if (imageView3 != null) {
                            i10 = R.id.iv_appbar_action_button_more;
                            ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                            if (imageView4 != null) {
                                i10 = R.id.iv_appbar_action_button_x;
                                ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                                if (imageView5 != null) {
                                    i10 = R.id.iv_appbar_left_action_button;
                                    ImageView imageView6 = (ImageView) l3.d.a(view, i10);
                                    if (imageView6 != null) {
                                        i10 = R.id.iv_appbar_left_action_button_x;
                                        ImageView imageView7 = (ImageView) l3.d.a(view, i10);
                                        if (imageView7 != null) {
                                            i10 = R.id.iv_appbar_left_action_button_y;
                                            ImageView imageView8 = (ImageView) l3.d.a(view, i10);
                                            if (imageView8 != null) {
                                                i10 = R.id.iv_appbar_left_action_button_y_arrow;
                                                ImageView imageView9 = (ImageView) l3.d.a(view, i10);
                                                if (imageView9 != null) {
                                                    i10 = R.id.iv_appbar_logo;
                                                    ImageView imageView10 = (ImageView) l3.d.a(view, i10);
                                                    if (imageView10 != null) {
                                                        i10 = R.id.iv_appbar_nav_button;
                                                        ImageView imageView11 = (ImageView) l3.d.a(view, i10);
                                                        if (imageView11 != null) {
                                                            i10 = R.id.iv_left_action_point;
                                                            ImageView imageView12 = (ImageView) l3.d.a(view, i10);
                                                            if (imageView12 != null) {
                                                                i10 = R.id.iv_left_action_point_x;
                                                                ImageView imageView13 = (ImageView) l3.d.a(view, i10);
                                                                if (imageView13 != null) {
                                                                    i10 = R.id.iv_new_msg;
                                                                    ImageView imageView14 = (ImageView) l3.d.a(view, i10);
                                                                    if (imageView14 != null) {
                                                                        i10 = R.id.ll_content;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                                                        if (linearLayout3 != null) {
                                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                            i10 = R.id.tv_appbar_action;
                                                                            TextView textView = (TextView) l3.d.a(view, i10);
                                                                            if (textView != null) {
                                                                                i10 = R.id.tv_appbar_action_x;
                                                                                TextView textView2 = (TextView) l3.d.a(view, i10);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.tv_appbar_left_action;
                                                                                    TextView textView3 = (TextView) l3.d.a(view, i10);
                                                                                    if (textView3 != null) {
                                                                                        i10 = R.id.tv_appbar_left_action_button_y;
                                                                                        TextView textView4 = (TextView) l3.d.a(view, i10);
                                                                                        if (textView4 != null) {
                                                                                            i10 = R.id.tv_appbar_left_action_x;
                                                                                            TextView textView5 = (TextView) l3.d.a(view, i10);
                                                                                            if (textView5 != null) {
                                                                                                i10 = R.id.tv_appbar_title;
                                                                                                TextView textView6 = (TextView) l3.d.a(view, i10);
                                                                                                if (textView6 != null) {
                                                                                                    i10 = R.id.vg_action_x;
                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                                                                                    if (frameLayout != null) {
                                                                                                        i10 = R.id.vg_appbar_left_action_button_y;
                                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                                                                                        if (linearLayout4 != null) {
                                                                                                            i10 = R.id.vg_appbar_nav_button;
                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                                                                            if (relativeLayout2 != null) {
                                                                                                                i10 = R.id.vg_left_action;
                                                                                                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                                                                                                                if (frameLayout2 != null) {
                                                                                                                    i10 = R.id.vg_search;
                                                                                                                    SearchView searchView = (SearchView) l3.d.a(view, i10);
                                                                                                                    if (searchView != null) {
                                                                                                                        i10 = R.id.vs_tab_layout;
                                                                                                                        ViewStub viewStub = (ViewStub) l3.d.a(view, i10);
                                                                                                                        if (viewStub != null) {
                                                                                                                            return new m1(relativeLayout, linearLayout, linearLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, linearLayout3, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout4, relativeLayout2, frameLayout2, searchView, viewStub);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31957pa, new Class[]{LayoutInflater.class}, m1.class);
        return patchProxyResultProxy.isSupported ? (m1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31974qa, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m1.class);
        if (patchProxyResultProxy.isSupported) {
            return (m1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.title_bar_default, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131629a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32008sa, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
