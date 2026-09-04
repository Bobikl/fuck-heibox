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

/* JADX INFO: compiled from: MenuChargeVerticalBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f118309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118317k;

    private zc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f118307a = linearLayout;
        this.f118308b = imageView;
        this.f118309c = progressBar;
        this.f118310d = relativeLayout;
        this.f118311e = textView;
        this.f118312f = textView2;
        this.f118313g = textView3;
        this.f118314h = textView4;
        this.f118315i = linearLayout2;
        this.f118316j = linearLayout3;
        this.f118317k = relativeLayout2;
    }

    @androidx.annotation.n0
    public static zc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21413, new Class[]{View.class}, zc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            i10 = R.id.pb_loading;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_loading);
            if (progressBar != null) {
                i10 = R.id.relativeLayout;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.relativeLayout);
                if (relativeLayout != null) {
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
                                    i10 = R.id.vg_battery_count;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_battery_count);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_battery_option;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_battery_option);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_menu_header;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_menu_header);
                                            if (relativeLayout2 != null) {
                                                return new zc0((LinearLayout) view, imageView, progressBar, relativeLayout, textView, textView2, textView3, textView4, linearLayout, linearLayout2, relativeLayout2);
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
    public static zc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21411, new Class[]{LayoutInflater.class}, zc0.class);
        return patchProxyResultProxy.isSupported ? (zc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21412, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_charge_vertical, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118307a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21414, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
