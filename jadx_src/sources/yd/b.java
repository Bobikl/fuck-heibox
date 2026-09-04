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

/* JADX INFO: compiled from: CountdownVideoUiV2Binding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f141663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f141664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f141665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final LinearLayout f141666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final ProgressBar f141667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f141668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final TextView f141669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final TextView f141670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final TextView f141671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final TextView f141672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final TextView f141673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final FrameLayout f141674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    public final LinearLayout f141675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    public final LinearLayout f141676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    public final LinearLayout f141677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public final FrameLayout f141678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @n0
    public final RelativeLayout f141679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @n0
    public final LinearLayout f141680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @n0
    public final RelativeLayout f141681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @n0
    public final RelativeLayout f141682x;

    private b(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 ImageView imageView6, @n0 LinearLayout linearLayout, @n0 ProgressBar progressBar, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 FrameLayout frameLayout, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 LinearLayout linearLayout4, @n0 FrameLayout frameLayout2, @n0 RelativeLayout relativeLayout2, @n0 LinearLayout linearLayout5, @n0 RelativeLayout relativeLayout3, @n0 RelativeLayout relativeLayout4) {
        this.f141659a = relativeLayout;
        this.f141660b = imageView;
        this.f141661c = imageView2;
        this.f141662d = imageView3;
        this.f141663e = imageView4;
        this.f141664f = imageView5;
        this.f141665g = imageView6;
        this.f141666h = linearLayout;
        this.f141667i = progressBar;
        this.f141668j = textView;
        this.f141669k = textView2;
        this.f141670l = textView3;
        this.f141671m = textView4;
        this.f141672n = textView5;
        this.f141673o = textView6;
        this.f141674p = frameLayout;
        this.f141675q = linearLayout2;
        this.f141676r = linearLayout3;
        this.f141677s = linearLayout4;
        this.f141678t = frameLayout2;
        this.f141679u = relativeLayout2;
        this.f141680v = linearLayout5;
        this.f141681w = relativeLayout3;
        this.f141682x = relativeLayout4;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Ix, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
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
                                i10 = R.id.ll_count;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout != null) {
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
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vg_info;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                                                        if (linearLayout3 != null) {
                                                                            i10 = R.id.vg_loading;
                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.vg_loading_container;
                                                                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                                                                                if (frameLayout2 != null) {
                                                                                    i10 = R.id.vg_menu;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                                                                    if (relativeLayout != null) {
                                                                                        i10 = R.id.vg_mid_info;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, i10);
                                                                                        if (linearLayout5 != null) {
                                                                                            i10 = R.id.vg_user_interface;
                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                                                            if (relativeLayout2 != null) {
                                                                                                i10 = R.id.vg_volume;
                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, i10);
                                                                                                if (relativeLayout3 != null) {
                                                                                                    return new b((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, progressBar, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout2, linearLayout3, linearLayout4, frameLayout2, relativeLayout, linearLayout5, relativeLayout2, relativeLayout3);
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

    @n0
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Gx, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Hx, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.countdown_video_ui_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141659a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Jx, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
