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

/* JADX INFO: compiled from: LayoutBindCardEpicBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f114052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f114062l;

    private o20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f114051a = cardView;
        this.f114052b = circularProgressIndicator;
        this.f114053c = imageView;
        this.f114054d = linearLayout;
        this.f114055e = relativeLayout;
        this.f114056f = relativeLayout2;
        this.f114057g = textView;
        this.f114058h = textView2;
        this.f114059i = textView3;
        this.f114060j = textView4;
        this.f114061k = view;
        this.f114062l = viewAnimator;
    }

    @androidx.annotation.n0
    public static o20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20338, new Class[]{View.class}, o20.class);
        if (patchProxyResultProxy.isSupported) {
            return (o20) patchProxyResultProxy.result;
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
                        i10 = R.id.rl_bind;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_bind);
                        if (relativeLayout2 != null) {
                            i10 = R.id.tv_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView != null) {
                                i10 = R.id.tv_help;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_help);
                                if (textView2 != null) {
                                    i10 = R.id.tv_oversea;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_oversea);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_replace;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_replace);
                                        if (textView4 != null) {
                                            i10 = R.id.v_vertical_divider;
                                            View viewA = l3.d.a(view, R.id.v_vertical_divider);
                                            if (viewA != null) {
                                                i10 = R.id.va_desc;
                                                ViewAnimator viewAnimator = (ViewAnimator) l3.d.a(view, R.id.va_desc);
                                                if (viewAnimator != null) {
                                                    return new o20((CardView) view, circularProgressIndicator, imageView, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, viewA, viewAnimator);
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
    public static o20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20336, new Class[]{LayoutInflater.class}, o20.class);
        return patchProxyResultProxy.isSupported ? (o20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20337, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o20.class);
        if (patchProxyResultProxy.isSupported) {
            return (o20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_epic, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114051a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20339, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
