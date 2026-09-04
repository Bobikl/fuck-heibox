package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuChargeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117919m;

    private yc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f117907a = linearLayout;
        this.f117908b = imageView;
        this.f117909c = progressBar;
        this.f117910d = textView;
        this.f117911e = textView2;
        this.f117912f = textView3;
        this.f117913g = textView4;
        this.f117914h = view;
        this.f117915i = view2;
        this.f117916j = linearLayout2;
        this.f117917k = linearLayout3;
        this.f117918l = linearLayout4;
        this.f117919m = relativeLayout;
    }

    @androidx.annotation.n0
    public static yc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21409, new Class[]{View.class}, yc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            i10 = R.id.pb_loading;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_loading);
            if (progressBar != null) {
                i10 = R.id.tv_battery_received;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_battery_received);
                if (textView != null) {
                    i10 = R.id.tv_battery_remain_count;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_battery_remain_count);
                    if (textView2 != null) {
                        i10 = R.id.tv_charge;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_charge);
                        if (textView3 != null) {
                            i10 = R.id.tv_help;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_help);
                            if (textView4 != null) {
                                i10 = R.id.v_margin;
                                View viewA = l3.d.a(view, R.id.v_margin);
                                if (viewA != null) {
                                    i10 = R.id.v_shadow;
                                    View viewA2 = l3.d.a(view, R.id.v_shadow);
                                    if (viewA2 != null) {
                                        i10 = R.id.vg_battery_count;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_battery_count);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_battery_option;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_battery_option);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.vg_content;
                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_content);
                                                if (linearLayout3 != null) {
                                                    i10 = R.id.vg_menu_header;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_menu_header);
                                                    if (relativeLayout != null) {
                                                        return new yc0((LinearLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, viewA, viewA2, linearLayout, linearLayout2, linearLayout3, relativeLayout);
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
    public static yc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21407, new Class[]{LayoutInflater.class}, yc0.class);
        return patchProxyResultProxy.isSupported ? (yc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21408, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_charge, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117907a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21410, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
