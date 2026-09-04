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

/* JADX INFO: compiled from: DialogActivationBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111617k;

    private i4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f111607a = relativeLayout;
        this.f111608b = imageView;
        this.f111609c = progressBar;
        this.f111610d = textView;
        this.f111611e = textView2;
        this.f111612f = textView3;
        this.f111613g = textView4;
        this.f111614h = textView5;
        this.f111615i = textView6;
        this.f111616j = linearLayout;
        this.f111617k = relativeLayout2;
    }

    @androidx.annotation.n0
    public static i4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16792, new Class[]{View.class}, i4.class);
        if (patchProxyResultProxy.isSupported) {
            return (i4) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_0;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.pb_0);
        if (imageView != null) {
            i10 = R.id.pb_title;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_title);
            if (progressBar != null) {
                i10 = R.id.tv_negative_button;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_negative_button);
                if (textView != null) {
                    i10 = R.id.tv_positive_button;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_positive_button);
                    if (textView2 != null) {
                        i10 = R.id.tv_progress_0;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_progress_0);
                        if (textView3 != null) {
                            i10 = R.id.tv_progress_checked_0;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_progress_checked_0);
                            if (textView4 != null) {
                                i10 = R.id.tv_progress_desc_0;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_progress_desc_0);
                                if (textView5 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView6 != null) {
                                        i10 = R.id.vg_button_panel;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_progress_desc_0;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress_desc_0);
                                            if (relativeLayout != null) {
                                                return new i4((RelativeLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, relativeLayout);
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
    public static i4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16790, new Class[]{LayoutInflater.class}, i4.class);
        return patchProxyResultProxy.isSupported ? (i4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16791, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i4.class);
        if (patchProxyResultProxy.isSupported) {
            return (i4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_activation, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111607a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16793, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
