package yd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CountdownVideoUiBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f141640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f141641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f141642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final ProgressBar f141643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f141644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f141645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final TextView f141646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final TextView f141647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final TextView f141648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final TextView f141649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final FrameLayout f141650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final LinearLayout f141651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    public final LinearLayout f141652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    public final LinearLayout f141653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    public final FrameLayout f141654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public final RelativeLayout f141655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @n0
    public final LinearLayout f141656u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @n0
    public final RelativeLayout f141657v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @n0
    public final RelativeLayout f141658w;

    private a(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 ImageView imageView6, @n0 ProgressBar progressBar, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 FrameLayout frameLayout, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 FrameLayout frameLayout2, @n0 RelativeLayout relativeLayout2, @n0 LinearLayout linearLayout4, @n0 RelativeLayout relativeLayout3, @n0 RelativeLayout relativeLayout4) {
        this.f141636a = relativeLayout;
        this.f141637b = imageView;
        this.f141638c = imageView2;
        this.f141639d = imageView3;
        this.f141640e = imageView4;
        this.f141641f = imageView5;
        this.f141642g = imageView6;
        this.f141643h = progressBar;
        this.f141644i = textView;
        this.f141645j = textView2;
        this.f141646k = textView3;
        this.f141647l = textView4;
        this.f141648m = textView5;
        this.f141649n = textView6;
        this.f141650o = frameLayout;
        this.f141651p = linearLayout;
        this.f141652q = linearLayout2;
        this.f141653r = linearLayout3;
        this.f141654s = frameLayout2;
        this.f141655t = relativeLayout2;
        this.f141656u = linearLayout4;
        this.f141657v = relativeLayout3;
        this.f141658w = relativeLayout4;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Ex, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_loading;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_mid_info;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.iv_speed_up_left;
                ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                if (imageView3 != null) {
                    i10 = R.id.iv_speed_up_right;
                    ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                    if (imageView4 != null) {
                        i10 = R.id.iv_volume_left;
                        ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                        if (imageView5 != null) {
                            i10 = R.id.iv_volume_right;
                            ImageView imageView6 = (ImageView) l3.d.a(view, i10);
                            if (imageView6 != null) {
                                i10 = R.id.pb_mid;
                                ProgressBar progressBar = (ProgressBar) l3.d.a(view, i10);
                                if (progressBar != null) {
                                    i10 = R.id.tv_error_action;
                                    TextView textView = (TextView) l3.d.a(view, i10);
                                    if (textView != null) {
                                        i10 = R.id.tv_error_message;
                                        TextView textView2 = (TextView) l3.d.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_info_text;
                                            TextView textView3 = (TextView) l3.d.a(view, i10);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_loading_info;
                                                TextView textView4 = (TextView) l3.d.a(view, i10);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_loading_speed;
                                                    TextView textView5 = (TextView) l3.d.a(view, i10);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_time_count;
                                                        TextView textView6 = (TextView) l3.d.a(view, i10);
                                                        if (textView6 != null) {
                                                            i10 = R.id.vg_error;
                                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                                            if (frameLayout != null) {
                                                                i10 = R.id.vg_fast_play;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.vg_info;
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vg_loading;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.vg_loading_container;
                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                                                                            if (frameLayout2 != null) {
                                                                                i10 = R.id.vg_menu;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                                                                if (relativeLayout != null) {
                                                                                    i10 = R.id.vg_mid_info;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                                                                    if (linearLayout4 != null) {
                                                                                        i10 = R.id.vg_user_interface;
                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                                                        if (relativeLayout2 != null) {
                                                                                            i10 = R.id.vg_volume;
                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, i10);
                                                                                            if (relativeLayout3 != null) {
                                                                                                return new a((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, progressBar, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout, linearLayout2, linearLayout3, frameLayout2, relativeLayout, linearLayout4, relativeLayout2, relativeLayout3);
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

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Cx, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Dx, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.countdown_video_ui, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141636a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Fx, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
