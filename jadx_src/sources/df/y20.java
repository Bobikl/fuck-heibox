package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.cardview.widget.CardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBindCardXboxBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f117722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f117723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f117733l;

    private y20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f117722a = cardView;
        this.f117723b = circularProgressIndicator;
        this.f117724c = imageView;
        this.f117725d = linearLayout;
        this.f117726e = relativeLayout;
        this.f117727f = textView;
        this.f117728g = textView2;
        this.f117729h = textView3;
        this.f117730i = textView4;
        this.f117731j = textView5;
        this.f117732k = view;
        this.f117733l = viewAnimator;
    }

    @androidx.annotation.n0
    public static y20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20378, new Class[]{View.class}, y20.class);
        if (patchProxyResultProxy.isSupported) {
            return (y20) patchProxyResultProxy.result;
        }
        int i10 = R.id.cp_loading;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.cp_loading);
        if (circularProgressIndicator != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.ll_desc;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_desc);
                if (linearLayout != null) {
                    i10 = R.id.rl_bg;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                    if (relativeLayout != null) {
                        i10 = R.id.tv_bind_btn;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_bind_btn);
                        if (textView != null) {
                            i10 = R.id.tv_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_help;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_help);
                                if (textView3 != null) {
                                    i10 = R.id.tv_oversea;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_oversea);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_replace;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_replace);
                                        if (textView5 != null) {
                                            i10 = R.id.v_vertical_divider;
                                            View viewA = l3.d.a(view, R.id.v_vertical_divider);
                                            if (viewA != null) {
                                                i10 = R.id.va_desc;
                                                ViewAnimator viewAnimator = (ViewAnimator) l3.d.a(view, R.id.va_desc);
                                                if (viewAnimator != null) {
                                                    return new y20((CardView) view, circularProgressIndicator, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4, textView5, viewA, viewAnimator);
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
    public static y20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20376, new Class[]{LayoutInflater.class}, y20.class);
        return patchProxyResultProxy.isSupported ? (y20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20377, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y20.class);
        if (patchProxyResultProxy.isSupported) {
            return (y20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_xbox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f117722a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20379, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
